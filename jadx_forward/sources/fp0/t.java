package fp0;

/* loaded from: classes10.dex */
public final class t implements fp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f346814a;

    /* renamed from: b, reason: collision with root package name */
    public final fp0.o f346815b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f346816c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f346817d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f346818e;

    /* renamed from: f, reason: collision with root package name */
    public int f346819f;

    /* renamed from: g, reason: collision with root package name */
    public final fp0.s f346820g;

    public t(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f346814a = name;
        this.f346815b = new fp0.o(new gp0.g(new gp0.b(1, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "SingleTaskExecutor"));
        this.f346816c = new java.util.concurrent.ConcurrentLinkedDeque();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f346818e = atomicInteger;
        this.f346819f = atomicInteger.get();
        this.f346820g = new fp0.s(this);
    }

    @Override // fp0.b
    public int a() {
        return this.f346819f;
    }

    @Override // fp0.b
    public void b(fp0.r task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[postTask] name=" + this.f346814a + " isRunningTask=" + this.f346817d + " task=" + task);
        task.f346812h = this.f346819f;
        this.f346816c.add(task);
        c();
    }

    public final synchronized void c() {
        fp0.r rVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[checkNextTask] name=" + this.f346814a + " isRunningTask=" + this.f346817d + " waitSize=" + this.f346816c.size());
        if (!this.f346817d && (rVar = (fp0.r) this.f346816c.poll()) != null) {
            this.f346815b.a(rVar);
            this.f346817d = true;
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[clean] name=" + this.f346814a);
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f346816c;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[start] name=" + this.f346814a);
        this.f346815b.g(this.f346820g);
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[stop] name=" + this.f346814a);
        fp0.o oVar = this.f346815b;
        oVar.getClass();
        fp0.s callback = this.f346820g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new fp0.n(oVar, callback));
        pm0.v.X(new fp0.i(oVar));
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f346816c;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
        this.f346817d = false;
    }

    @Override // fp0.b
    /* renamed from: reset */
    public void mo129985x6761d4f() {
        this.f346819f = this.f346818e.incrementAndGet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[reset] name=" + this.f346814a);
        fp0.o oVar = this.f346815b;
        oVar.getClass();
        pm0.v.X(new fp0.i(oVar));
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f346816c;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
        this.f346817d = false;
    }
}

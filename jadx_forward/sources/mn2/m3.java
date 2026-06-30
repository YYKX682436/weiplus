package mn2;

/* loaded from: classes2.dex */
public final class m3 implements fp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f411587a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f411588b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f411589c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f411590d;

    /* renamed from: e, reason: collision with root package name */
    public int f411591e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f411592f;

    public m3(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f411587a = name;
        this.f411588b = new java.util.concurrent.ConcurrentLinkedDeque();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f411590d = atomicInteger;
        this.f411591e = atomicInteger.get();
        this.f411592f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
    }

    @Override // fp0.b
    public int a() {
        return this.f411591e;
    }

    @Override // fp0.b
    public void b(fp0.r task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSingleTaskExecutor", "[postTask] name=" + this.f411587a + " isRunningTask=" + this.f411589c + " task=" + task);
        task.f346812h = this.f411591e;
        this.f411588b.add(task);
        c();
    }

    public final synchronized void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSingleTaskExecutor", "[checkNextTask] name=" + this.f411587a + " isRunningTask=" + this.f411589c + " waitSize=" + this.f411588b.size());
        if (this.f411589c) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f411592f, null, null, new mn2.l3(this, null), 3, null);
    }

    @Override // fp0.b
    /* renamed from: reset */
    public void mo129985x6761d4f() {
        this.f411591e = this.f411590d.incrementAndGet();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reset] name=");
        java.lang.String str = this.f411587a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSingleTaskExecutor", sb6.toString());
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f411588b;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
        p3325xe03a0797.p3326xc267989b.z0.d(this.f411592f, "reset: name=" + str, null, 2, null);
        this.f411589c = false;
    }
}

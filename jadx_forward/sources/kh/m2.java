package kh;

/* loaded from: classes12.dex */
public abstract class m2 implements kh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f389396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f389397b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f389398c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f389399d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f389400e;

    public m2(java.lang.String trackerName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackerName, "trackerName");
        this.f389396a = trackerName;
        this.f389397b = i17;
        this.f389398c = new java.util.concurrent.ConcurrentHashMap();
        jz5.i iVar = jz5.i.f384362d;
        this.f389399d = jz5.h.a(iVar, kh.i2.f389365d);
        this.f389400e = jz5.h.a(iVar, new kh.k2(this));
    }

    public final kh.f2 a(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        kh.h2 h2Var = new kh.h2();
        h2Var.f389327d = i17;
        h2Var.f389328e = name;
        jz5.g gVar = this.f389399d;
        if (((java.lang.Boolean) gVar.mo141623x754a37bb()).booleanValue() && i17 == android.os.Process.myTid()) {
            long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
            h2Var.f389330g = rh.x2.b(java.lang.Long.valueOf(currentThreadTimeMillis / 10));
            h2Var.f389331h = rh.x2.b(java.lang.Long.valueOf(currentThreadTimeMillis));
            return h2Var;
        }
        wh.t1 e17 = wh.u1.e(android.os.Process.myPid(), i17);
        if (e17 != null) {
            long a17 = ((java.lang.Boolean) gVar.mo141623x754a37bb()).booleanValue() ? e17.f527409d + e17.f527408c : e17.a();
            h2Var.f389330g = rh.x2.b(java.lang.Long.valueOf(a17));
            h2Var.f389331h = rh.x2.b(java.lang.Long.valueOf(a17 * 10));
            return h2Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskTracker", "parse task procStat fail, name = " + name + ", tid = " + i17);
        return null;
    }

    public final long b(kh.f2 snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        rh.x2 x2Var = this.f389397b == 1 ? snapshot.f389331h : snapshot.f389330g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x2Var);
        java.lang.Number number = x2Var.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
        return number.longValue();
    }

    public boolean c() {
        kh.p2 p2Var = kh.p2.f389418a;
        return ((java.util.List) kh.p2.f389420c.mo141623x754a37bb()).contains(this);
    }

    @Override // kh.e2
    public void d() {
    }

    public void e(java.lang.String key, int i17) {
        kh.f2 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        kh.f2 f2Var = (kh.f2) ((java.util.concurrent.ConcurrentHashMap) this.f389398c).remove(java.lang.Integer.valueOf(i17));
        if (f2Var == null || (a17 = a(key, android.os.Process.myTid())) == null) {
            return;
        }
        if (a17.f389327d != f2Var.f389327d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskTracker", "task tid mismatch: " + f2Var + " vs " + a17);
            return;
        }
        rh.o2 a18 = a17.a(f2Var);
        kh.d2 d2Var = (kh.d2) this.f389400e.mo141623x754a37bb();
        rh.d3 dlt = a18.f477019c;
        java.lang.String str = ((kh.f2) dlt).f389328e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dlt, "dlt");
        long b17 = b((kh.f2) dlt);
        d2Var.getClass();
        if (kh.d2.f389311c.a()) {
            d2Var.b().m40834x32c52b(new kh.b2(d2Var, str, b17));
        }
    }

    @Override // kh.e2
    public void f() {
        ((kh.d2) this.f389400e.mo141623x754a37bb()).a();
    }

    public void g(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        kh.f2 a17 = a(key, android.os.Process.myTid());
        if (a17 != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f389398c).put(java.lang.Integer.valueOf(i17), a17);
        }
    }

    public final java.lang.Object h(java.lang.String str, int i17, yz5.a taskBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskBlock, "taskBlock");
        int i18 = 0;
        boolean z17 = str != null;
        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
        pj.e eVar = pj.e.f436436a;
        if (z17) {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                g(str, i17);
            } finally {
                if (z17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    e(str, i17);
                }
                if (eVar.g("MicroMsg.TaskTracker", 100, new kh.l2(this, str, i17, currentThreadTimeMillis)) && eVar.i(10)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskTracker", "#tracking from:");
                    java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
                    int length = stackTrace.length;
                    while (i18 < length) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskTracker", " - " + stackTrace[i18]);
                        i18++;
                    }
                }
            }
        }
        return taskBlock.mo152xb9724478();
    }
}

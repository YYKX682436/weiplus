package rh;

/* loaded from: classes12.dex */
public final class z3 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public long f477107b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f477108c = new java.util.concurrent.ConcurrentHashMap(2);

    /* renamed from: d, reason: collision with root package name */
    public final rh.y3 f477109d = new rh.y3();

    /* renamed from: e, reason: collision with root package name */
    public wh.h1 f477110e;

    public static void k(rh.z3 z3Var, java.lang.String str) {
        if (z3Var.f476827a.f444868d.f444836v.contains(str)) {
            oj.j.f("Matrix.battery.WakeLockMonitorFeature", "dump wakelocks tracing for tag '" + str + "':", new java.lang.Object[0]);
            for (rh.x3 x3Var : ((java.util.concurrent.ConcurrentHashMap) z3Var.f477108c).values()) {
                if (x3Var.f477087b.f477073b.equalsIgnoreCase(str)) {
                    oj.j.f("Matrix.battery.WakeLockMonitorFeature", " - " + x3Var.f477087b, new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f476827a.f444868d.f444831q) {
            rh.q3 q3Var = new rh.q3(this);
            this.f477110e = q3Var;
            java.util.List list = wh.j1.f527346a;
            synchronized (wh.j1.class) {
                java.util.List list2 = wh.j1.f527346a;
                if (((java.util.ArrayList) list2).contains(q3Var)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(q3Var);
                if (!wh.j1.f527347b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.PowerHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.j1.f527348c.a()));
                    wh.j1.f527347b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.h1 h1Var = this.f477110e;
        java.util.List list = wh.j1.f527346a;
        synchronized (wh.j1.class) {
            if (h1Var != null) {
                java.util.List list2 = wh.j1.f527346a;
                ((java.util.ArrayList) list2).remove(h1Var);
                if (wh.j1.f527347b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.PowerHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.j1.f527348c.b()));
                    wh.j1.f527347b = false;
                }
            }
        }
        this.f476827a.f444870f.removeCallbacksAndMessages(null);
        ((java.util.concurrent.ConcurrentHashMap) this.f477108c).clear();
        rh.y3 y3Var = this.f477109d;
        y3Var.f477095b = 0;
        y3Var.f477096c = 0L;
        y3Var.f477097d = 0;
        y3Var.f477098e = 0;
    }

    @Override // rh.a, rh.e3
    public void g(long j17) {
        super.g(j17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f477108c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            rh.w3 w3Var = ((rh.x3) it.next()).f477087b;
            if (!(w3Var.f477077f >= w3Var.f477076e) && l(w3Var.f477073b)) {
                this.f476827a.b(w3Var, j17);
            }
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f477107b = f0Var.f444868d.f444818d;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.WakeLockMonitorFeature";
    }

    public final boolean l(java.lang.String str) {
        return j() || !this.f476827a.f444868d.f444835u.contains(str) || this.f476827a.f444868d.f444836v.contains(str);
    }
}

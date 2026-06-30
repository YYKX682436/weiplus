package rh;

/* loaded from: classes12.dex */
public final class e4 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final rh.d4 f476905b = new rh.d4();

    /* renamed from: c, reason: collision with root package name */
    public wh.l2 f476906c;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f476827a.f444868d.f444831q) {
            rh.a4 a4Var = new rh.a4(this);
            this.f476906c = a4Var;
            java.util.List list = wh.m2.f527366a;
            synchronized (wh.m2.class) {
                java.util.List list2 = wh.m2.f527366a;
                if (((java.util.ArrayList) list2).contains(a4Var)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(a4Var);
                if (!wh.m2.f527367b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.WifiHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.m2.f527368c.a()));
                    wh.m2.f527367b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.l2 l2Var = this.f476906c;
        java.util.List list = wh.m2.f527366a;
        synchronized (wh.m2.class) {
            if (l2Var != null) {
                java.util.List list2 = wh.m2.f527366a;
                ((java.util.ArrayList) list2).remove(l2Var);
                if (wh.m2.f527367b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.WifiHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.m2.f527368c.b()));
                    wh.m2.f527367b = false;
                }
            }
        }
        rh.d4 d4Var = this.f476905b;
        d4Var.f476899a = 0;
        d4Var.f476900b = 0;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.WifiMonitorFeature";
    }
}

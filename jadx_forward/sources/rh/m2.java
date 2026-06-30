package rh;

/* loaded from: classes12.dex */
public final class m2 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final rh.l2 f476993b = new rh.l2();

    /* renamed from: c, reason: collision with root package name */
    public wh.y0 f476994c;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f476827a.f444868d.f444831q) {
            rh.i2 i2Var = new rh.i2(this);
            this.f476994c = i2Var;
            java.util.List list = wh.z0.f527439a;
            synchronized (wh.z0.class) {
                java.util.List list2 = wh.z0.f527439a;
                if (((java.util.ArrayList) list2).contains(i2Var)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(i2Var);
                if (!wh.z0.f527440b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.LocationHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.z0.f527441c.a()));
                    wh.z0.f527440b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.y0 y0Var = this.f476994c;
        java.util.List list = wh.z0.f527439a;
        synchronized (wh.z0.class) {
            if (y0Var != null) {
                java.util.List list2 = wh.z0.f527439a;
                ((java.util.ArrayList) list2).remove(y0Var);
                if (wh.z0.f527440b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.LocationHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.z0.f527441c.b()));
                    wh.z0.f527440b = false;
                }
            }
        }
        this.f476993b.f476977a = 0;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.LocationMonitorFeature";
    }
}

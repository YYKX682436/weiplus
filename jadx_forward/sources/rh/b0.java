package rh;

/* loaded from: classes12.dex */
public final class b0 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final rh.a0 f476840b = new rh.a0();

    /* renamed from: c, reason: collision with root package name */
    public wh.q f476841c;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (android.os.Build.VERSION.SDK_INT < 26) {
            oj.j.f("Matrix.battery.BlueToothMonitorFeature", "only support >= android 8.0 for the moment", new java.lang.Object[0]);
            return;
        }
        qh.a0 a0Var = this.f476827a.f444868d;
        if (a0Var.f444831q || (a0Var.f444832r & 1) == 1) {
            rh.x xVar = new rh.x(this);
            this.f476841c = xVar;
            java.util.List list = wh.r.f527391a;
            synchronized (wh.r.class) {
                java.util.List list2 = wh.r.f527391a;
                if (((java.util.ArrayList) list2).contains(xVar)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(xVar);
                if (!wh.r.f527392b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.BluetoothHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.r.f527393c.a()));
                    wh.r.f527392b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.q qVar = this.f476841c;
        java.util.List list = wh.r.f527391a;
        synchronized (wh.r.class) {
            if (qVar != null) {
                java.util.List list2 = wh.r.f527391a;
                ((java.util.ArrayList) list2).remove(qVar);
                if (wh.r.f527392b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.BluetoothHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.r.f527393c.b()));
                    wh.r.f527392b = false;
                }
            }
        }
        rh.a0 a0Var = this.f476840b;
        a0Var.f476828a = 0;
        a0Var.f476829b = 0;
        a0Var.f476830c = 0;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.BlueToothMonitorFeature";
    }
}

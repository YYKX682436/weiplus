package rh;

/* loaded from: classes12.dex */
public class v0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o3 f477056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477057b;

    public v0(rh.c1 c1Var, rh.o3 o3Var) {
        this.f477057b = c1Var;
        this.f477056a = o3Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.n3 k17 = this.f477056a.k(this.f477057b.f476862k.d());
        if (k17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSampling ");
            sb6.append(c3Var.f476879g);
            sb6.append(" ");
            java.lang.String str = c3Var.f476873a;
            sb6.append(str);
            sb6.append(" wifiRx, val = ");
            sb6.append(k17.f477003d);
            oj.j.c("Matrix.battery.CompositeMonitors", sb6.toString(), new java.lang.Object[0]);
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + str + " wifiTx, val = " + k17.f477004e, new java.lang.Object[0]);
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + str + " mobileRx, val = " + k17.f477007h, new java.lang.Object[0]);
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + str + " mobileTx, val = " + k17.f477008i, new java.lang.Object[0]);
        }
        return 0;
    }
}

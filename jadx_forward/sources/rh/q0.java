package rh;

/* loaded from: classes12.dex */
public class q0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.d2 f477029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477030b;

    public q0(rh.c1 c1Var, rh.d2 d2Var) {
        this.f477030b = c1Var;
        this.f477029a = d2Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        java.lang.Integer num = (java.lang.Integer) this.f477029a.k(this.f477030b.f476862k.d()).f477041d.f477085a;
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + num, new java.lang.Object[0]);
        return num.intValue() == -1 ? rh.c3.f476872o : num;
    }
}

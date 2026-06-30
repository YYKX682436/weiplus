package rh;

/* loaded from: classes12.dex */
public class d0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f476891a;

    public d0(rh.c1 c1Var) {
        this.f476891a = c1Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.c1 c1Var = this.f476891a;
        if (wh.m.w(c1Var.f476862k.d())) {
            return rh.c3.f476872o;
        }
        long h17 = wh.m.h(c1Var.f476862k.d());
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + h17, new java.lang.Object[0]);
        return h17 == -1 ? rh.c3.f476872o : java.lang.Long.valueOf(h17);
    }
}

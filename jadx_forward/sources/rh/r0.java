package rh;

/* loaded from: classes12.dex */
public class r0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477034a;

    public r0(rh.c1 c1Var) {
        this.f477034a = c1Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        android.content.Context context = this.f477034a.f476862k.d();
        java.lang.Integer num = wh.m.f527363a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int u17 = wh.m.u(context);
        oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + ", val = " + u17, new java.lang.Object[0]);
        return u17 == -1 ? rh.c3.f476872o : java.lang.Integer.valueOf(u17);
    }
}

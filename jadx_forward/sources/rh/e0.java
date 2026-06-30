package rh;

/* loaded from: classes12.dex */
public class e0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh.h f476902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f476903b;

    public e0(rh.c1 c1Var, uh.h hVar) {
        this.f476903b = c1Var;
        this.f476902a = hVar;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.d3 d3Var = (rh.d3) ((java.util.HashMap) this.f476903b.f476853b).get(uh.g.class);
        if (d3Var instanceof uh.g) {
            oj.j.c("Matrix.battery.CompositeMonitors", "onAcc " + c3Var.f476879g + " " + c3Var.f476873a, new java.lang.Object[0]);
            ((uh.g) d3Var).b(this.f476902a.k());
        }
        return rh.c3.f476872o;
    }
}

package r01;

/* loaded from: classes9.dex */
public class n1 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f449696d;

    public n1(r01.r1 r1Var) {
        this.f449696d = r1Var;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
            return;
        }
        r01.r1 r1Var = this.f449696d;
        if (r1Var.f449752a.equals((java.lang.String) obj) && r1Var.f449753b == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "contactStgUpdate, %s", r1Var.f449752a);
            r1Var.f(r1Var.f449752a);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(r1Var.f449758g);
        }
    }
}

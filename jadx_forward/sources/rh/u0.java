package rh;

/* loaded from: classes12.dex */
public class u0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.k1 f477047a;

    public u0(rh.c1 c1Var, rh.k1 k1Var) {
        this.f477047a = k1Var;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        rh.f1 w17 = this.f477047a.w();
        for (int i17 = 0; i17 < w17.f476918d.size(); i17++) {
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + " cpuCore" + i17 + ", val = " + ((rh.y2) w17.f476918d.get(i17)).f477093a, new java.lang.Object[0]);
        }
        for (int i18 = 0; i18 < w17.f476919e.size(); i18++) {
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + c3Var.f476873a + " procCpuCluster" + i18 + ", val = " + ((rh.y2) w17.f476919e.get(i18)).f477093a, new java.lang.Object[0]);
        }
        return 0;
    }
}

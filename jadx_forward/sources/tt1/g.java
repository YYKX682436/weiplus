package tt1;

/* loaded from: classes15.dex */
public class g implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 f503353d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875) {
        this.f503353d = abstractActivityC13036x7f885875;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 abstractActivityC13036x7f885875 = this.f503353d;
        if (!z17) {
            abstractActivityC13036x7f885875.f7();
            return true;
        }
        if (f18 != -85.0f && f17 != -1000.0f) {
            abstractActivityC13036x7f885875.f176175r = f18;
            abstractActivityC13036x7f885875.f176176s = f17;
            wt1.g0 ij6 = xt1.t0.ij();
            float f19 = abstractActivityC13036x7f885875.f176175r;
            float f27 = abstractActivityC13036x7f885875.f176176s;
            ij6.f530813d = f19;
            ij6.f530814e = f27;
            ij6.f530815f = java.lang.System.currentTimeMillis() / 1000;
            abstractActivityC13036x7f885875.g7();
        }
        if (abstractActivityC13036x7f885875.f176177t) {
            return false;
        }
        abstractActivityC13036x7f885875.f176177t = true;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46355x206ed2ef, f17, f18, (int) d18);
        return false;
    }
}

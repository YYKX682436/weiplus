package r01;

/* loaded from: classes9.dex */
public class o1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public long f449703d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f449704e;

    public o1(r01.r1 r1Var) {
        this.f449704e = r1Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "LBSManager notify. lat:%f, lng:%f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        long j17 = this.f449703d;
        r01.r1 r1Var = this.f449704e;
        if (i18 >= j17 + r1Var.f449756e) {
            r1Var.a(r1Var.f449752a, 11, 0, f18, f17, (int) d18, null);
            this.f449703d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        }
        r01.r1 r1Var2 = this.f449704e;
        if (r1Var2.f449753b == 2) {
            r1Var2.g();
        }
        if (!r1Var2.f449757f) {
            r1Var2.f449757f = true;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, f17, f18, (int) d18);
        }
        return true;
    }
}

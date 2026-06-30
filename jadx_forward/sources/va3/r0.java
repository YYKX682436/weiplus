package va3;

/* loaded from: classes15.dex */
public class r0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va3.v0 f515872d;

    public r0(va3.v0 v0Var) {
        this.f515872d = v0Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        r45.wa5 wa5Var;
        if (!z17) {
            return false;
        }
        va3.v0 v0Var = this.f515872d;
        if (v0Var.A) {
            v0Var.A = false;
            v0Var.C = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "", 0, java.lang.Long.valueOf(v0Var.C - v0Var.B));
        }
        r45.mw6 mw6Var = v0Var.f515891p;
        if (mw6Var == null || (wa5Var = mw6Var.f462406e) == null) {
            return true;
        }
        wa5Var.f470544d = f18;
        wa5Var.f470545e = f17;
        return true;
    }
}

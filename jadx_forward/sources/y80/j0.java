package y80;

/* loaded from: classes10.dex */
public final class j0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f541400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.p1 f541401e;

    public j0(y80.k0 k0Var, y80.p1 p1Var) {
        this.f541400d = k0Var;
        this.f541401e = p1Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f541400d.f541405d, "getUserCurrentLocation: isOk=" + z17 + ", [" + f18 + ',' + f17 + "], accuracy=" + d18);
        y80.p1 p1Var = this.f541401e;
        if (z17) {
            p1Var.a(new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24644xff1e8b2e(f17, f18, d18, d18));
            return true;
        }
        p1Var.a(null);
        return true;
    }
}

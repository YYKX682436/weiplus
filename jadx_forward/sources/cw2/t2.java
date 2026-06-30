package cw2;

/* loaded from: classes2.dex */
public final class t2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.w2 f305548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f305549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f305550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f305551g;

    public t2(cw2.w2 w2Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, cw2.f8 f8Var) {
        this.f305548d = w2Var;
        this.f305549e = s0Var;
        this.f305550f = abstractC14490x69736cb5;
        this.f305551g = f8Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.nm2 nm2Var = (r45.nm2) obj;
        cw2.w2 w2Var = this.f305548d;
        if (w2Var.f305614f || nm2Var == null) {
            return;
        }
        w2Var.f305614f = true;
        wu5.c cVar = w2Var.f305613e;
        if (cVar != null) {
            cVar.cancel(false);
        }
        az2.f fVar = w2Var.f305610b;
        if (fVar != null) {
            fVar.b();
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = w2Var.f305612d;
        if (j0Var != null) {
            j0Var.mo522xb5bdeb7a(this);
        }
        w2Var.f305613e = null;
        w2Var.f305615g = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        cw2.f8 f8Var = this.f305551g;
        y4Var.M(w2Var.f305609a, this.f305549e, this.f305550f, f8Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2137, 4);
    }
}

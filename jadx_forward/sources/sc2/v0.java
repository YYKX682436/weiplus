package sc2;

/* loaded from: classes2.dex */
public final class v0 implements cw2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.b f487829b;

    public v0(sc2.h1 h1Var, so2.b bVar) {
        this.f487828a = h1Var;
        this.f487829b = bVar;
    }

    @Override // cw2.ya
    public void b() {
        so2.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f487828a.f487462x;
        long mo56685x3d7f3f1d = c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56685x3d7f3f1d() : 0L;
        if (mo56685x3d7f3f1d <= 0 || (bVar = this.f487829b) == null) {
            return;
        }
        bVar.f491798d = java.lang.Long.valueOf(mo56685x3d7f3f1d);
    }
}

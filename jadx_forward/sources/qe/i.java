package qe;

/* loaded from: classes7.dex */
public final class i implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f443492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.m f443493e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var, qe.m mVar) {
        this.f443492d = f0Var;
        this.f443493e = mVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            this.f443492d.k(new qe.h(this.f443493e), true);
        }
    }
}

package ff1;

/* loaded from: classes15.dex */
public class m implements ye1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343155a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47) {
        this.f343155a = abstractC12277x3bbbdb47;
    }

    @Override // ye1.n
    public void a(ye1.e eVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(eVar != null ? eVar.mo1851x9746038c() : -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343155a;
        abstractC12277x3bbbdb47.e("video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", valueOf, java.lang.Boolean.valueOf(abstractC12277x3bbbdb47.f165196n), java.lang.Boolean.valueOf(abstractC12277x3bbbdb47.I));
        if (!abstractC12277x3bbbdb47.f165196n) {
            abstractC12277x3bbbdb47.i();
        } else if (abstractC12277x3bbbdb47.I) {
            return;
        } else {
            abstractC12277x3bbbdb47.l();
        }
        ff1.b0 b0Var = abstractC12277x3bbbdb47.f165199q;
        if (b0Var != null) {
            boolean z17 = abstractC12277x3bbbdb47.f165196n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) b0Var;
            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "on seek complete startPlay[%b]", java.lang.Boolean.valueOf(z17));
            ff1.e0 e0Var = abstractC12278xb84f839e.f165217o;
            if (e0Var != null) {
                e0Var.mo51460xfae314df(abstractC12278xb84f839e);
            }
            abstractC12278xb84f839e.i();
            abstractC12278xb84f839e.s(z17);
            abstractC12278xb84f839e.r(abstractC12278xb84f839e.mo51377x898ffe25());
            if (z17) {
                abstractC12278xb84f839e.p(false);
                abstractC12278xb84f839e.f165218p = false;
                oe1.h1 h1Var = abstractC12278xb84f839e.f165219q;
                if (h1Var != null) {
                    h1Var.l(abstractC12278xb84f839e.m51468x23a7af9b(), abstractC12278xb84f839e.m51467x75e04be9());
                }
            }
        }
        abstractC12277x3bbbdb47.G = 0L;
    }
}

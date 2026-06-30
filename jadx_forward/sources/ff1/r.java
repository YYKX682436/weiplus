package ff1;

/* loaded from: classes15.dex */
public class r implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e f343161d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e) {
        this.f343161d = abstractC12278xb84f839e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = this.f343161d;
        boolean mo51382xc00617a4 = abstractC12278xb84f839e.mo51382xc00617a4();
        int mo51376x25784152 = abstractC12278xb84f839e.mo51376x25784152();
        abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "prepare start checker isplaying[%b] currPosMs[%d]", java.lang.Boolean.valueOf(mo51382xc00617a4), java.lang.Integer.valueOf(mo51376x25784152));
        ff1.e0 e0Var = abstractC12278xb84f839e.f165217o;
        if (e0Var == null || mo51376x25784152 > 50) {
            return false;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47) e0Var).k(0.0d);
        return false;
    }
}

package ff1;

/* loaded from: classes15.dex */
public class s implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e f343162d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e) {
        this.f343162d = abstractC12278xb84f839e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = this.f343162d;
        if (abstractC12278xb84f839e.f165224v <= 0) {
            return false;
        }
        if (!abstractC12278xb84f839e.mo51382xc00617a4()) {
            return true;
        }
        abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "reset error count ", new java.lang.Object[0]);
        abstractC12278xb84f839e.f165224v = 0;
        return false;
    }
}

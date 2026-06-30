package ff1;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343149d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47) {
        this.f343149d = abstractC12277x3bbbdb47;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = this.f343149d;
        try {
            abstractC12277x3bbbdb47.f165192g.mo1864x42c875eb(abstractC12277x3bbbdb47.f165191f);
            abstractC12277x3bbbdb47.f165192g.mo1858x857611b5();
            abstractC12277x3bbbdb47.f165195m = abstractC12277x3bbbdb47.f165192g.mo1854x463504c();
            abstractC12277x3bbbdb47.f165194i = abstractC12277x3bbbdb47.f165192g.mo1855x8d5c7601();
            abstractC12277x3bbbdb47.mo51456x764d819b(abstractC12277x3bbbdb47.L);
            float f17 = abstractC12277x3bbbdb47.P;
            if (f17 <= 0.0f) {
                return;
            }
            abstractC12277x3bbbdb47.P = f17;
            ye1.e eVar = abstractC12277x3bbbdb47.f165192g;
            if (eVar != null) {
                eVar.f(f17);
            }
        } catch (java.lang.Exception e17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
            abstractC12277x3bbbdb47.f(e17, "prepare async error path", new java.lang.Object[0]);
            ff1.z zVar = abstractC12277x3bbbdb47.f165197o;
            if (zVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) zVar).n(-1, -1);
            }
        }
    }
}

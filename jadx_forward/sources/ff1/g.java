package ff1;

/* loaded from: classes15.dex */
public class g extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.e f343147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343148e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47, ye1.e eVar) {
        this.f343148e = abstractC12277x3bbbdb47;
        this.f343147d = eVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ye1.e eVar = this.f343147d;
        if (eVar != null) {
            try {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
                this.f343148e.e("MicroMsg.Video.AbstractVideoTextureView", "another thread to release player[%s]", eVar);
                eVar.mo1866x360802();
                eVar.mo1859x41012807();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}

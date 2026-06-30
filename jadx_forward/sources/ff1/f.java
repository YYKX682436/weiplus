package ff1;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.e f343137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 f343138e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47, ye1.e eVar) {
        this.f343138e = abstractC12277x3bbbdb47;
        this.f343137d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ye1.e eVar = this.f343137d;
        try {
            eVar.mo1860x6761d4f();
            eVar.mo1859x41012807();
        } catch (java.lang.Exception e17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
            this.f343138e.f(e17, "reset media player error", new java.lang.Object[0]);
        }
    }
}

package pc1;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f434893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pc1.g f434894e;

    public i(pc1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f434894e = gVar;
        this.f434893d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f434893d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(lVar.mo48798x74292566(), this);
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) pc1.e.f434881a).get(lVar.mo48798x74292566());
        if (dVar != null) {
            dVar.a();
            pc1.e.a(lVar.mo48798x74292566());
        }
        this.f434894e.f434884g = null;
    }
}

package tf1;

/* loaded from: classes7.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf1.i f500418a;

    public j(tf1.i iVar) {
        this.f500418a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onPause */
    public void mo10367xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus lossTransient");
        this.f500418a.f500415a.u(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onResume */
    public void mo10368x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus gain");
        tf1.f fVar = this.f500418a.f500415a;
        if (fVar.f500402r) {
            fVar.w(null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onStop */
    public void mo10369xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus loss, passive pause");
        tf1.i iVar = this.f500418a;
        iVar.f500415a.x();
        iVar.a();
    }
}

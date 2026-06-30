package gf0;

/* loaded from: classes15.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf0.i f352734d;

    public f(gf0.i iVar) {
        this.f352734d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "AppBrandLifeCycle onDestroy");
        gf0.i iVar = this.f352734d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(iVar.f352742f, iVar.f352744h);
        iVar.f352744h = null;
        kf1.h hVar = iVar.f352743g;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultLuggageRecorder", "onDestroy");
            ((kf1.d) hVar).mo142548x41012807();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "AppBrandLifeCycle onPause");
        if (this.f352734d.f352743g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultLuggageRecorder", "onBackground");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioRecorder", "AppBrandLifeCycle onResume");
        if (this.f352734d.f352743g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultLuggageRecorder", "onForeground");
        }
    }
}

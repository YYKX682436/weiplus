package sl;

/* loaded from: classes12.dex */
public class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.g f490555a;

    public e(sl.g gVar) {
        this.f490555a = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.t5
    /* renamed from: onCompletion */
    public void mo72731xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
        sl.g gVar = this.f490555a;
        if (gVar.f490557d.f490558d.f490559a.c()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", java.lang.Boolean.valueOf(gVar.f490557d.f490558d.f490559a.f490563c));
        sl.j jVar = gVar.f490557d.f490558d.f490559a;
        jVar.f490573m.E(jVar.f490563c);
        sl.j jVar2 = gVar.f490557d.f490558d.f490559a;
        jVar2.f490563c = false;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(jVar2.f490569i);
        gVar.f490557d.f490558d.f490559a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", valueOf, java.lang.Boolean.FALSE);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
    }
}

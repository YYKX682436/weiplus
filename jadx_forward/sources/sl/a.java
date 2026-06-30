package sl;

/* loaded from: classes12.dex */
public class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.j f490551d;

    public a(sl.j jVar) {
        this.f490551d = jVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        sl.j jVar = this.f490551d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onPause: %b, isPlaying：%s", valueOf, java.lang.Boolean.valueOf(jVar.c()));
        if (jVar.c()) {
            if (j65.e.b() && j65.e.g() && jVar.f490567g == null) {
                jVar.h(false);
                return;
            }
            if (jVar.f490574n || (str = jVar.f490568h) == null || (str2 = sl.j.f490560q) == null || str.equals(str2)) {
                if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_target26_voice_focus_shield_sw, 0) == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "no shield");
                } else if (z17 && fp.h.c(26)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK %s", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "real onPause: ");
                jVar.d(false);
            }
        }
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onResume: audioFocusChange");
        this.f490551d.e();
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoicePlayer", "onStop: audioFocusChange");
        this.f490551d.h(false);
    }
}

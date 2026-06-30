package z21;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.w f551211d;

    public s(z21.w wVar) {
        this.f551211d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z21.w wVar = this.f551211d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr", "run NetSceneNewVoiceInput mWroteBytesCnt %s time %s", java.lang.Integer.valueOf(wVar.f551215e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (wVar.f551217g || wVar.f551233z == null || wVar.f551215e == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SceneVoiceInputAddr", "WorkerThread too busy can not do work");
            return;
        }
        gm0.j1.d().a(wVar.C ? 12220 : 235, wVar);
        if (wVar.f551225r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SceneVoiceInputAddr", "onFilteredSpeakVoice disableTrans");
        } else {
            if (((z21.h) wVar.f551233z).P() && gm0.j1.d().h(wVar.f551233z, 0)) {
                return;
            }
            wVar.a(13, 131, -1);
        }
    }
}

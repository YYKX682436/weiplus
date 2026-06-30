package pm1;

/* loaded from: classes14.dex */
public final class j extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f438357d;

    public j(pm1.o oVar) {
        this.f438357d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.o oVar = this.f438357d;
        android.media.AudioManager audioManager = oVar.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
        oVar.f438363b = java.lang.Boolean.valueOf(audioManager.isSpeakerphoneOn());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f438362a, "isSpeakerphoneOn = " + oVar.f438363b);
    }
}

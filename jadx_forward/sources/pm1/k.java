package pm1;

/* loaded from: classes14.dex */
public final class k extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f438358d;

    public k(pm1.o oVar) {
        this.f438358d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.o oVar = this.f438358d;
        android.media.AudioManager audioManager = oVar.f438368g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
        oVar.f438366e = java.lang.Boolean.valueOf(audioManager.isWiredHeadsetOn());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f438362a, "isWiredHeadsetOn = " + oVar.f438366e);
    }
}

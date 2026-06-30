package i63;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f370570d;

    public v(i63.b0 b0Var) {
        this.f370570d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.prepare();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "create handler");
        this.f370570d.f370506f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());
        android.os.Looper.loop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "handler thread quited");
    }
}

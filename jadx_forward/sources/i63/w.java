package i63;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f370571d;

    public w(i63.b0 b0Var) {
        this.f370571d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.net.LocalSocket accept;
        android.os.Looper.prepare();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "create ipc handler");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());
        i63.b0 b0Var = this.f370571d;
        b0Var.f370507g = n3Var;
        try {
            b0Var.f370508h = new android.net.LocalServerSocket(b0Var.f370521x);
            accept = b0Var.f370508h.accept();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "vira: got client");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameLiveAppbrandAudioMgrService", e17, "io exception", new java.lang.Object[0]);
        }
        if (b0Var.f370506f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameLiveAppbrandAudioMgrService", "handle is null!");
            return;
        }
        b0Var.wi(false, false);
        b0Var.f370505e = new java.io.ObjectOutputStream(accept.getOutputStream());
        android.os.Looper.loop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "ipcHandler thread quited");
    }
}

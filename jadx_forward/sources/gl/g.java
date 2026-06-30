package gl;

/* loaded from: classes13.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f354278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl.i f354279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f354280f;

    public g(int i17, gl.i iVar, yz5.a aVar) {
        this.f354278d = i17;
        this.f354279e = iVar;
        this.f354280f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(audioManager.getMode());
        int i17 = this.f354278d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "set mode from %d to %d", valueOf, java.lang.Integer.valueOf(i17));
        audioManager.setMode(i17);
        this.f354279e.f354293n = i17;
        yz5.a aVar = this.f354280f;
        if (aVar != null) {
        }
    }
}

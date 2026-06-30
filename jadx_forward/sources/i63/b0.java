package i63;

@j95.b(m140513x1e06fd29 = {p60.x.class})
/* loaded from: classes7.dex */
public class b0 extends i95.w implements i63.k0, fz2.b {
    public final java.lang.Runnable A;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f370506f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f370507g;

    /* renamed from: h, reason: collision with root package name */
    public android.net.LocalServerSocket f370508h;

    /* renamed from: p, reason: collision with root package name */
    public final android.media.AudioManager f370513p;

    /* renamed from: q, reason: collision with root package name */
    public final int f370514q;

    /* renamed from: r, reason: collision with root package name */
    public int f370515r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f370516s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f370517t;

    /* renamed from: u, reason: collision with root package name */
    public final i63.a0 f370518u;

    /* renamed from: v, reason: collision with root package name */
    public long f370519v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.ref.WeakReference f370520w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f370521x;

    /* renamed from: y, reason: collision with root package name */
    public final fz2.a f370522y;

    /* renamed from: z, reason: collision with root package name */
    public final dl3.b f370523z;

    /* renamed from: d, reason: collision with root package name */
    public ku5.f f370504d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.io.ObjectOutputStream f370505e = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f370509i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ua1.a f370510m = new ua1.a();

    /* renamed from: n, reason: collision with root package name */
    public long f370511n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.io.OutputStream f370512o = null;

    public b0() {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        this.f370513p = audioManager;
        this.f370514q = audioManager.getStreamMaxVolume(3);
        this.f370516s = true;
        this.f370517t = true;
        this.f370518u = new i63.a0(this, null);
        this.f370519v = 0L;
        this.f370521x = "MicroMsgGameLiveAudio";
        ((j40.p) ((zy2.r7) i95.n0.c(zy2.r7.class))).getClass();
        this.f370522y = new com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671();
        this.f370523z = new i63.u(this);
        this.A = new i63.z(this);
    }

    public final boolean Ai() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_wagame_disable_mic_capture_music, 0) == 1;
    }

    public synchronized void Bi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "pause %b", java.lang.Boolean.valueOf(this.f370516s));
        if (this.f370516s) {
            return;
        }
        this.f370516s = true;
        Ni();
    }

    public synchronized void Di() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "resume %b", java.lang.Boolean.valueOf(this.f370516s));
        if (this.f370516s) {
            this.f370516s = false;
            Ni();
        }
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "onHeadsetStateChange %b", java.lang.Boolean.valueOf(z17));
        wi(true, z17);
    }

    public final void Ni() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "enabled: %d", java.lang.Integer.valueOf(1 ^ (this.f370517t ? 1 : 0)));
        boolean z17 = this.f370517t;
        java.lang.Runnable runnable = this.A;
        if (z17 || this.f370516s) {
            dl3.i.s().H();
            java.lang.ref.WeakReference weakReference = this.f370520w;
            if (weakReference != null && weakReference.get() != null) {
                ((fa1.a) ((fa1.s) this.f370520w.get())).Q0(null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f370506f;
            if (n3Var != null) {
                n3Var.mo50300x3fa464aa(runnable);
            }
            ((java.util.HashMap) this.f370509i).clear();
            return;
        }
        dl3.i s17 = dl3.i.s();
        dl3.b bVar = this.f370523z;
        s17.P(bVar);
        java.lang.ref.WeakReference weakReference2 = this.f370520w;
        if (weakReference2 != null && weakReference2.get() != null) {
            ((fa1.a) ((fa1.s) this.f370520w.get())).Q0(bVar);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f370506f;
        if (n3Var2 != null) {
            n3Var2.mo50293x3498a0(runnable);
        }
    }

    /* renamed from: stop */
    public void m134805x360802() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.ref.WeakReference weakReference = this.f370520w;
        objArr[0] = weakReference == null ? 0 : weakReference.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "stop appbrand audio, gameLogic: %s", objArr);
        this.f370516s = true;
        this.f370517t = true;
        Ni();
        try {
            java.io.OutputStream outputStream = this.f370512o;
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.io.IOException unused) {
        }
        java.util.Map map = this.f370509i;
        java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
        while (it.hasNext()) {
            ((ua1.b) it.next()).c();
        }
        ((java.util.HashMap) map).clear();
        if (this.f370506f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "quit handler");
            this.f370506f.mo50280x23b2dd47().quit();
            this.f370506f.mo50299x35224f();
        }
        if (this.f370507g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "quit ipcHandler");
            this.f370507g.mo50280x23b2dd47().quit();
            this.f370507g.mo50299x35224f();
        }
        if (this.f370508h != null) {
            try {
                this.f370505e.write(1);
                this.f370505e.flush();
                this.f370505e.close();
                this.f370505e = null;
                this.f370508h.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandAudioMgrService", "close localServerSocket exception", e17);
            }
        }
        ku5.f fVar = this.f370504d;
        if (fVar != null) {
            fVar.shutdownNow();
            this.f370504d = null;
        }
        this.f370508h = null;
        this.f370506f = null;
        this.f370507g = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().unregisterContentObserver(this.f370518u);
        if (Ai()) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671) this.f370522y).c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public void wi(boolean z17, boolean z18) {
        boolean z19 = false;
        if (Ai()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "switch disabled");
            this.f370517t = false;
            Ni();
            return;
        }
        if (!z17) {
            z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1691x19f68a54.p1692xcfcbe9ef.C15517x99f0671) this.f370522y).a();
        }
        boolean z27 = !java.lang.Boolean.valueOf(((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f360821g).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "checkDisableMusicCapture headset: %b isMute:%b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z27));
        synchronized (this) {
            boolean z28 = this.f370517t;
            if (!z18 && !z27) {
                z19 = true;
            }
            this.f370517t = z19;
            if (z28 == z19) {
                return;
            }
            Ni();
        }
    }
}

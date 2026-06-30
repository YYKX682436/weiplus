package ua1;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f507487a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f507488b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ua1.a f507489c = new ua1.a();

    /* renamed from: d, reason: collision with root package name */
    public final android.media.AudioManager f507490d;

    /* renamed from: e, reason: collision with root package name */
    public final int f507491e;

    /* renamed from: f, reason: collision with root package name */
    public int f507492f;

    /* renamed from: g, reason: collision with root package name */
    public final ua1.e f507493g;

    /* renamed from: h, reason: collision with root package name */
    public final dl3.b f507494h;

    /* renamed from: i, reason: collision with root package name */
    public long f507495i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f507496j;

    /* renamed from: k, reason: collision with root package name */
    public tl.c f507497k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.ref.WeakReference f507498l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f507499m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f507500n;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        this.f507490d = audioManager;
        this.f507491e = audioManager.getStreamMaxVolume(3);
        this.f507493g = new ua1.e(this, null);
        this.f507494h = new ua1.c(this);
        this.f507495i = 0L;
        this.f507496j = new ua1.d(this);
        this.f507499m = true;
        this.f507500n = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", "game record audio: create audio logic");
        this.f507487a = "MicroMsg.GameRecordAudioLogic" + hashCode();
        this.f507498l = new java.lang.ref.WeakReference((fa1.s) e9Var.V0().B1(fa1.s.class));
    }

    public final synchronized boolean a() {
        return this.f507500n;
    }

    public final synchronized boolean b() {
        return this.f507499m;
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", "pause, mIsPaused: " + a());
        if (a()) {
            return;
        }
        synchronized (this) {
            this.f507500n = true;
        }
        dl3.i.s().H();
        if (this.f507498l.get() != null) {
            ((fa1.a) ((fa1.s) this.f507498l.get())).Q0(null);
        }
        ((ku5.t0) ku5.t0.f394148d).A(this.f507487a);
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", "resume, mIsPaused: " + a());
        if (a()) {
            synchronized (this) {
                this.f507500n = false;
            }
            dl3.i.s().P(this.f507494h);
            if (this.f507498l.get() != null) {
                ((fa1.a) ((fa1.s) this.f507498l.get())).Q0(this.f507494h);
            }
            this.f507495i = 0L;
            ((ku5.t0) ku5.t0.f394148d).h(this.f507496j, this.f507487a);
        }
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", "stop, mIsStopped: " + b());
        if (b()) {
            return;
        }
        synchronized (this) {
            this.f507499m = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().unregisterContentObserver(this.f507493g);
        c();
        java.util.Iterator it = ((java.util.HashMap) this.f507488b).values().iterator();
        while (it.hasNext()) {
            ((ua1.b) it.next()).c();
        }
        ((java.util.HashMap) this.f507488b).clear();
        ua1.a aVar = this.f507489c;
        synchronized (aVar) {
            try {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.ap.C11507x90b85d77.m48788x12c73ffb(aVar.f507452b);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerUninit Exception " + e17.getMessage());
                } catch (java.lang.UnsatisfiedLinkError e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerUninit UnsatisfiedLinkError " + e18.getMessage());
                }
            } finally {
            }
        }
    }
}

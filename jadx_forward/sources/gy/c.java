package gy;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f358997a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.AudioTrack f358998b;

    /* renamed from: c, reason: collision with root package name */
    public final android.media.AudioFocusRequest f358999c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f359000d;

    /* renamed from: e, reason: collision with root package name */
    public wu5.c f359001e;

    /* renamed from: f, reason: collision with root package name */
    public final java.nio.ByteBuffer f359002f;

    /* renamed from: g, reason: collision with root package name */
    public final int f359003g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f359004h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f359005i;

    /* renamed from: j, reason: collision with root package name */
    public long f359006j;

    /* renamed from: k, reason: collision with root package name */
    public long f359007k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f359008l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f359009m;

    public c(android.media.AudioManager audioManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioManager, "audioManager");
        this.f358997a = audioManager;
        this.f359000d = new java.lang.Object();
        gy.a aVar = new gy.a(this);
        this.f359009m = aVar;
        int i17 = (int) (1 * 320.0d * (16 / 8));
        this.f359003g = i17;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(...)");
        this.f359002f = allocateDirect;
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(16000, 4, 2) * 3;
        android.media.AudioAttributes build = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        android.media.AudioTrack audioTrack = new android.media.AudioTrack(build, new android.media.AudioFormat.Builder().setSampleRate(16000).setChannelMask(4).setEncoding(2).build(), minBufferSize, 1, 0);
        this.f358998b = audioTrack;
        audioTrack.getState();
        this.f358999c = android.os.Build.VERSION.SDK_INT >= 26 ? new android.media.AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(aVar).setAudioAttributes(build).build() : null;
        a();
    }

    public final void a() {
        android.media.AudioManager audioManager = this.f358997a;
        this.f359008l = audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn();
    }

    public final void b() {
        synchronized (this.f359000d) {
            if (this.f358998b.getPlayState() != 1) {
                this.f358998b.stop();
            }
            this.f358998b.release();
            android.media.AudioTrack audioTrack = new android.media.AudioTrack(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build(), new android.media.AudioFormat.Builder().setSampleRate(16000).setChannelMask(4).setEncoding(2).build(), android.media.AudioTrack.getMinBufferSize(16000, 4, 2) * 3, 1, 0);
            this.f358998b = audioTrack;
            if (audioTrack.getState() != 1) {
                return;
            }
            if (this.f359004h) {
                this.f358998b.play();
            }
        }
    }

    public final void c() {
        this.f359001e = ((ku5.t0) ku5.t0.f394148d).k(new gy.b(this), java.lang.Math.max(0L, java.lang.Math.min((20 - (android.os.SystemClock.elapsedRealtime() - this.f359006j)) - this.f359007k, this.f359008l ? 40 : 30)));
    }

    public final void d() {
        a();
        boolean z17 = this.f359008l;
        android.media.AudioManager audioManager = this.f358997a;
        if (!z17) {
            audioManager.setSpeakerphoneOn(audioManager.getMode() != 2);
            return;
        }
        audioManager.setMode(0);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            yj0.a.c(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "setAudioOutputDevice", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
            audioManager.startBluetoothSco();
            yj0.a.f(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "setAudioOutputDevice", "()V", "android/media/AudioManager_EXEC_", "startBluetoothSco", "()V");
        }
        audioManager.setSpeakerphoneOn(false);
    }

    public final boolean e() {
        int requestAudioFocus;
        synchronized (this.f359000d) {
            if (this.f359004h) {
                return true;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.media.AudioManager audioManager = this.f358997a;
                android.media.AudioFocusRequest audioFocusRequest = this.f358999c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(audioFocusRequest);
                requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
            } else {
                requestAudioFocus = this.f358997a.requestAudioFocus(this.f359009m, 3, 1);
            }
            if (requestAudioFocus != 1) {
                return false;
            }
            d();
            if (this.f358998b.getState() != 1) {
                b();
                if (this.f358998b.getState() != 1) {
                    return false;
                }
            }
            this.f358998b.play();
            this.f359004h = true;
            this.f359007k = 0L;
            this.f359006j = android.os.SystemClock.elapsedRealtime();
            c();
            return true;
        }
    }

    public final void f() {
        synchronized (this.f359000d) {
            this.f359004h = false;
            this.f359005i = false;
            this.f359007k = 0L;
            wu5.c cVar = this.f359001e;
            if (cVar != null && !cVar.isCancelled()) {
                wu5.c cVar2 = this.f359001e;
                if (cVar2 != null) {
                    cVar2.cancel(true);
                }
                this.f359001e = null;
            }
            this.f358998b.stop();
            this.f358997a.abandonAudioFocus(this.f359009m);
            if (this.f359008l && android.os.Build.VERSION.SDK_INT < 26) {
                android.media.AudioManager audioManager = this.f358997a;
                yj0.a.c(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "stop", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
                audioManager.stopBluetoothSco();
                yj0.a.f(audioManager, "com/tencent/mm/feature/chatbot/media/AudioPlayer", "stop", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
            }
        }
    }
}

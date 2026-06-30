package go5;

/* loaded from: classes14.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f355682a = jz5.h.b(go5.m.f355676d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f355683b = jz5.h.b(go5.n.f355677d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f355684c = jz5.h.b(go5.o.f355678d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f355685d = jz5.h.b(go5.l.f355675d);

    /* renamed from: e, reason: collision with root package name */
    public boolean f355686e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f355687f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f355688g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f355689h;

    public final boolean a(boolean z17, boolean z18) {
        int i17 = f().f355665a;
        if (i17 == -1) {
            if (z17 || !z18) {
                return true;
            }
        } else if (i17 == 1) {
            return true;
        }
        return false;
    }

    public final void b() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            audioManager.clearCommunicationDevice();
            return;
        }
        yj0.a.c(audioManager, "com/tencent/mm/voipmp/v2/audio/VoIPMPAudioController", "clearCommunicationDevice", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
        audioManager.stopBluetoothSco();
        yj0.a.f(audioManager, "com/tencent/mm/voipmp/v2/audio/VoIPMPAudioController", "clearCommunicationDevice", "()V", "android/media/AudioManager_EXEC_", "stopBluetoothSco", "()V");
    }

    public final go5.z c() {
        return (go5.z) ((jz5.n) this.f355685d).mo141623x754a37bb();
    }

    public final go5.c d() {
        return (go5.c) ((jz5.n) this.f355682a).mo141623x754a37bb();
    }

    public final go5.f e() {
        return (go5.f) ((jz5.n) this.f355683b).mo141623x754a37bb();
    }

    public final go5.g0 f() {
        return (go5.g0) ((jz5.n) this.f355684c).mo141623x754a37bb();
    }

    public final cv.v0 g() {
        return ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
    }

    public final boolean h() {
        this.f355686e = true;
        go5.k kVar = (go5.k) e();
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPAudioCapturer", "muteMicrophone");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(1);
        allocateDirect.put((byte) 0);
        allocateDirect.position(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.D(412, allocateDirect, 1);
        tl.w wVar = kVar.f355673a;
        if (wVar != null) {
            wVar.n(true);
        }
        return false;
    }

    public final void i(er4.l mainUiScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainUiScene, "mainUiScene");
        int ordinal = mainUiScene.ordinal();
        if (ordinal == 0) {
            this.f355686e = false;
            this.f355687f = false;
            this.f355688g = false;
            this.f355689h = true;
            go5.g0 f17 = f();
            f17.getClass();
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(f17.f355666b);
            f().a();
            c().a();
            return;
        }
        if (ordinal == 1) {
            if (this.f355689h) {
                f().a();
                return;
            }
            this.f355686e = false;
            this.f355687f = false;
            this.f355688g = false;
            this.f355689h = true;
            go5.g0 f18 = f();
            f18.getClass();
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(f18.f355666b);
            f().a();
            c().a();
            return;
        }
        if (ordinal == 2) {
            go5.z c17 = c();
            f25.m0 m0Var = c17.f355690a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            c17.f355690a = null;
            f().getClass();
            i95.m c18 = i95.n0.c(cv.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            cv.w0.f9((cv.w0) c18, 0, null, 2, null);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.f355686e = false;
        this.f355687f = false;
        this.f355688g = false;
        this.f355689h = true;
        go5.g0 f19 = f();
        f19.getClass();
        ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).wi(f19.f355666b);
        f().f355667c = true;
        i95.m c19 = i95.n0.c(cv.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        cv.w0.f9((cv.w0) c19, 0, null, 2, null);
        c().a();
    }
}

package d32;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f307681a;

    /* renamed from: b, reason: collision with root package name */
    public final t85.j f307682b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.microedition.khronos.egl.EGL10 f307683c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f307684d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f307685e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f307686f;

    /* renamed from: g, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f307687g;

    /* renamed from: h, reason: collision with root package name */
    public javax.microedition.khronos.opengles.GL10 f307688h;

    /* renamed from: i, reason: collision with root package name */
    public d32.k f307689i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.Surface f307690j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f307691k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.HandlerThread f307692l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f307693m;

    public j(int i17, int i18, boolean z17, t85.j jVar) {
        this.f307681a = z17;
        this.f307682b = jVar;
        javax.microedition.khronos.egl.EGL egl = javax.microedition.khronos.egl.EGLContext.getEGL();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        this.f307683c = (javax.microedition.khronos.egl.EGL10) egl;
        this.f307684d = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        this.f307685e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        this.f307686f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("EmojiCaptureMixEGLPixelBuffer_GLThread", 5);
        this.f307692l = a17;
        a17.start();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
        this.f307691k = n3Var;
        n3Var.mo50293x3498a0(new d32.d(this));
    }
}

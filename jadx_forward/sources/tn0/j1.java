package tn0;

/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f502229p;

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f502230q;

    /* renamed from: a, reason: collision with root package name */
    public final tn0.w0 f502231a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f502232b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f502233c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.Surface f502234d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f502235e;

    /* renamed from: f, reason: collision with root package name */
    public go0.v0 f502236f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f502237g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f502238h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.Size f502239i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Point f502240j;

    /* renamed from: k, reason: collision with root package name */
    public android.util.Size f502241k;

    /* renamed from: l, reason: collision with root package name */
    public android.util.Size f502242l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Point f502243m;

    /* renamed from: n, reason: collision with root package name */
    public int f502244n;

    /* renamed from: o, reason: collision with root package name */
    public int f502245o;

    static {
        new tn0.a1(null);
        f502229p = jz5.h.b(tn0.z0.f502325d);
        f502230q = jz5.h.b(tn0.y0.f502322d);
    }

    public j1(tn0.w0 absLiveTRTCCore) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(absLiveTRTCCore, "absLiveTRTCCore");
        this.f502231a = absLiveTRTCCore;
        this.f502233c = jz5.h.b(tn0.f1.f502200d);
        this.f502237g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("liveScreenShareTimer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new tn0.h1(this), true);
        this.f502238h = jz5.h.b(tn0.d1.f502194d);
        this.f502239i = new android.util.Size(((java.lang.Number) ((jz5.n) jz5.h.b(tn0.i1.f502216d)).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) jz5.h.b(tn0.e1.f502197d)).mo141623x754a37bb()).intValue());
        this.f502240j = new android.graphics.Point(0, 0);
        jz5.g gVar = f502229p;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        jz5.g gVar2 = f502230q;
        this.f502241k = new android.util.Size(intValue, ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue());
        this.f502242l = new android.util.Size(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue());
        this.f502243m = new android.graphics.Point(com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16), 0);
    }

    public final android.graphics.Point a() {
        return (android.graphics.Point) ((jz5.n) this.f502233c).mo141623x754a37bb();
    }

    public final void b() {
        go0.v0 v0Var = this.f502236f;
        if (v0Var != null) {
            v0Var.f355411e.removeCallbacksAndMessages(null);
            android.os.HandlerThread handlerThread = v0Var.f355412f;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            go0.b1 b1Var = v0Var.f355413g;
            if (b1Var != null) {
                b1Var.n();
            }
            rs0.h hVar = v0Var.f355418l;
            if (hVar != null) {
                rs0.i.f480829a.u(hVar);
            }
            android.view.Surface surface = v0Var.f355417k;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = v0Var.f355414h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        this.f502236f = null;
        this.f502234d = null;
        this.f502235e = null;
        a().set(0, 0);
        this.f502237g.d();
        this.f502244n = 0;
        this.f502245o = 0;
    }

    public final void c(int i17, int i18) {
        if (i17 == this.f502241k.getWidth() && i18 == this.f502241k.getHeight()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTrtcCoreScreenShare", "updatePreviewSize from:" + this.f502241k + " to:" + i17 + '*' + i18);
        this.f502241k = new android.util.Size(i17, i18);
    }
}

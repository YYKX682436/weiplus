package dr4;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f324131a;

    /* renamed from: b, reason: collision with root package name */
    public int f324132b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f324133c;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f324134d;

    /* renamed from: e, reason: collision with root package name */
    public dr4.q1 f324135e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f324136f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.Surface f324137g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f324138h;

    /* renamed from: i, reason: collision with root package name */
    public is0.c f324139i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f324140j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f324141k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f324142l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f324143m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f324144n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f324145o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f324146p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f324147q;

    /* renamed from: r, reason: collision with root package name */
    public int f324148r;

    public c0(int i17, int i18, yz5.p queueScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queueScope, "queueScope");
        this.f324131a = i17;
        this.f324132b = i18;
        this.f324133c = queueScope;
        this.f324143m = new java.util.ArrayList();
        this.f324144n = new java.util.ArrayList();
        this.f324147q = vq4.b0.f520803a.a();
        this.f324138h = false;
    }

    public static final void a(dr4.c0 c0Var) {
        if (!c0Var.f324145o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", "onPreviewTextureFrameAvailable, looper:" + android.os.Looper.myLooper());
            c0Var.f324145o = true;
        }
        c0Var.b(new dr4.u(c0Var));
    }

    public static void c(dr4.c0 c0Var, dr4.q glSurface, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        c0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(glSurface, "glSurface");
        c0Var.b(new dr4.v(c0Var, glSurface, lVar));
    }

    public final void b(final yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f324133c.mo149xb9724478("CAMERA", new java.lang.Runnable(callback) { // from class: dr4.w

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f324288d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                this.f324288d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f324288d.mo152xb9724478();
            }
        });
    }

    public final void d(android.util.Size cameraSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraSize, "cameraSize");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.PboSurfaceRender", "updatePboAndWindowsSize is " + cameraSize.getWidth() + " and " + cameraSize.getHeight(), new java.lang.Object[0]);
        dr4.q1 q1Var = this.f324135e;
        if (q1Var != null) {
            q1Var.w(cameraSize.getWidth(), cameraSize.getHeight());
        }
        cameraSize.getWidth();
        cameraSize.getHeight();
    }
}

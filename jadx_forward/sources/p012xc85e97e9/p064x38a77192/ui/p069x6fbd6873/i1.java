package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class i1 extends p3325xe03a0797.p3326xc267989b.p0 {

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f92120r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.ThreadLocal f92121s;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.Choreographer f92122e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f92123f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92128n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92129o;

    /* renamed from: q, reason: collision with root package name */
    public final n0.r2 f92131q;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f92124g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final kz5.q f92125h = new kz5.q();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f92126i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f92127m = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h1 f92130p = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h1(this);

    static {
        new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g1(null);
        f92120r = jz5.h.b(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e1.f92084d);
        f92121s = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f1();
    }

    public i1(android.view.Choreographer choreographer, android.os.Handler handler, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f92122e = choreographer;
        this.f92123f = handler;
        this.f92131q = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.m1(choreographer);
    }

    public static final void K(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var) {
        java.lang.Runnable runnable;
        boolean z17;
        do {
            synchronized (i1Var.f92124g) {
                runnable = (java.lang.Runnable) i1Var.f92125h.p();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (i1Var.f92124g) {
                    runnable = (java.lang.Runnable) i1Var.f92125h.p();
                }
            }
            synchronized (i1Var.f92124g) {
                if (i1Var.f92125h.isEmpty()) {
                    z17 = false;
                    i1Var.f92128n = false;
                } else {
                    z17 = true;
                }
            }
        } while (z17);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        synchronized (this.f92124g) {
            this.f92125h.m144678xbb8646d7(block);
            if (!this.f92128n) {
                this.f92128n = true;
                this.f92123f.post(this.f92130p);
                if (!this.f92129o) {
                    this.f92129o = true;
                    this.f92122e.postFrameCallback(this.f92130p);
                }
            }
        }
    }
}

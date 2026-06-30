package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class i1 extends kotlinx.coroutines.p0 {

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f10587r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.ThreadLocal f10588s;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.Choreographer f10589e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f10590f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10595n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10596o;

    /* renamed from: q, reason: collision with root package name */
    public final n0.r2 f10598q;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f10591g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final kz5.q f10592h = new kz5.q();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f10593i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f10594m = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final androidx.compose.ui.platform.h1 f10597p = new androidx.compose.ui.platform.h1(this);

    static {
        new androidx.compose.ui.platform.g1(null);
        f10587r = jz5.h.b(androidx.compose.ui.platform.e1.f10551d);
        f10588s = new androidx.compose.ui.platform.f1();
    }

    public i1(android.view.Choreographer choreographer, android.os.Handler handler, kotlin.jvm.internal.i iVar) {
        this.f10589e = choreographer;
        this.f10590f = handler;
        this.f10598q = new androidx.compose.ui.platform.m1(choreographer);
    }

    public static final void K(androidx.compose.ui.platform.i1 i1Var) {
        java.lang.Runnable runnable;
        boolean z17;
        do {
            synchronized (i1Var.f10591g) {
                runnable = (java.lang.Runnable) i1Var.f10592h.p();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (i1Var.f10591g) {
                    runnable = (java.lang.Runnable) i1Var.f10592h.p();
                }
            }
            synchronized (i1Var.f10591g) {
                if (i1Var.f10592h.isEmpty()) {
                    z17 = false;
                    i1Var.f10595n = false;
                } else {
                    z17 = true;
                }
            }
        } while (z17);
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        synchronized (this.f10591g) {
            this.f10592h.addLast(block);
            if (!this.f10595n) {
                this.f10595n = true;
                this.f10590f.post(this.f10597p);
                if (!this.f10596o) {
                    this.f10596o = true;
                    this.f10589e.postFrameCallback(this.f10597p);
                }
            }
        }
    }
}

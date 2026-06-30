package dr4;

/* loaded from: classes14.dex */
public class d2 extends dr4.o {

    /* renamed from: v, reason: collision with root package name */
    public static final dr4.y1 f324153v = new dr4.y1(null);

    /* renamed from: t, reason: collision with root package name */
    public boolean f324154t;

    /* renamed from: u, reason: collision with root package name */
    public android.opengl.EGLContext f324155u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(boolean z17, yz5.p scope) {
        super(z17, f324153v.hashCode(), scope);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
    }

    @Override // dr4.o
    public void b(yz5.l lVar, dr4.c0 c0Var, boolean z17) {
        if (c0Var == null) {
            m(false);
            return;
        }
        rs0.h hVar = c0Var.f324134d;
        android.opengl.EGLContext eGLContext = hVar != null ? hVar.f480827c : null;
        if (eGLContext != null) {
            this.f324155u = eGLContext;
            m(true);
        }
        if (z17) {
            dr4.z1 z1Var = new dr4.z1(this);
            java.util.ArrayList arrayList = c0Var.f324144n;
            if (!arrayList.contains(z1Var)) {
                arrayList.add(z1Var);
            }
        }
        this.f324221n = c0Var.f324131a;
        this.f324222o = c0Var.f324132b;
    }

    @Override // dr4.o
    public void d(final yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f324210c.mo149xb9724478("CAMERA", new java.lang.Runnable(callback) { // from class: dr4.c2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f324150d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                this.f324150d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f324150d.mo152xb9724478();
            }
        });
    }

    @Override // dr4.o
    public void h() {
        d(new dr4.b2(this));
    }

    @Override // dr4.o
    public void l(android.util.Size renderSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        super.l(renderSize);
        gq4.v.wi().f447514o = new android.util.Size(this.f324222o, this.f324221n);
    }

    public void m(boolean z17) {
        if (this.f324154t) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WindowSurfaceRenderer", "createEGLContext, isUseShareContext:" + z17 + ", shareGLContext:" + this.f324155u, new java.lang.Object[0]);
        if (!z17 || this.f324155u == null) {
            return;
        }
        d(new dr4.a2(this));
        this.f324154t = true;
    }
}

package dr4;

/* loaded from: classes14.dex */
public final class n0 extends dr4.o {

    /* renamed from: w, reason: collision with root package name */
    public static final dr4.d0 f324203w = new dr4.d0(null);

    /* renamed from: t, reason: collision with root package name */
    public boolean f324204t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.l f324205u;

    /* renamed from: v, reason: collision with root package name */
    public oq4.b f324206v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yz5.p scope) {
        super(false, f324203w.hashCode(), scope);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
    }

    @Override // dr4.o
    public void b(yz5.l lVar, dr4.c0 c0Var, boolean z17) {
        this.f324205u = lVar;
        m(false);
    }

    @Override // dr4.o
    public void d(final yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f324210c.mo149xb9724478("DECODE", new java.lang.Runnable(callback) { // from class: dr4.k0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f324187d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                this.f324187d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f324187d.mo152xb9724478();
            }
        });
    }

    @Override // dr4.o
    public void h() {
        d(new dr4.j0(this));
    }

    @Override // dr4.o
    public void l(android.util.Size renderSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        super.l(renderSize);
        dr4.r1 r1Var = this.f324219l;
        if (r1Var != null) {
            r1Var.w(renderSize.getWidth(), renderSize.getHeight());
        }
        gq4.v.wi().f447515p = renderSize;
    }

    public void m(boolean z17) {
        if (this.f324204t) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RemoteWindowSurfaceRenderer", "createEGLContext", new java.lang.Object[0]);
        d(new dr4.g0(this));
        this.f324204t = true;
        this.f324206v = new oq4.b();
    }
}

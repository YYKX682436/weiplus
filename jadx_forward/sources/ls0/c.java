package ls0;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f402342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f402344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f402345g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.opengl.EGLContext eGLContext, ls0.k kVar, android.view.Surface surface, yz5.l lVar) {
        super(0);
        this.f402342d = eGLContext;
        this.f402343e = kVar;
        this.f402344f = surface;
        this.f402345g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture;
        try {
            if (this.f402342d == null) {
                this.f402343e.getClass();
                this.f402343e.f402384e = rs0.g.n(rs0.i.f480829a, this.f402344f, null, 0, 0, null, 30, null);
                this.f402343e.f402380a.k(true);
                ls0.k kVar = this.f402343e;
                ms0.c cVar = kVar.f402380a;
                synchronized (cVar) {
                    surfaceTexture = cVar.f412486i;
                }
                kVar.f402387h = surfaceTexture;
            } else {
                this.f402343e.getClass();
                this.f402343e.f402384e = rs0.i.f480829a.a(this.f402342d, this.f402344f, 0, 0);
                this.f402343e.f402380a.k(false);
            }
            this.f402343e.f402401v = true;
            yz5.l lVar = this.f402345g;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402343e.f402381b, e17, "initWithSurface failed", new java.lang.Object[0]);
            yz5.l lVar2 = this.f402345g;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}

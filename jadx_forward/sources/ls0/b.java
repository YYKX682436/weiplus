package ls0;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f402326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f402328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f402329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f402330h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.opengl.EGLContext eGLContext, ls0.k kVar, int i17, int i18, yz5.l lVar) {
        super(0);
        this.f402326d = eGLContext;
        this.f402327e = kVar;
        this.f402328f = i17;
        this.f402329g = i18;
        this.f402330h = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture;
        try {
            if (this.f402326d == null) {
                this.f402327e.getClass();
                this.f402327e.f402384e = rs0.g.n(rs0.i.f480829a, null, null, this.f402328f, this.f402329g, null, 16, null);
                this.f402327e.f402380a.k(true);
                ls0.k kVar = this.f402327e;
                ms0.c cVar = kVar.f402380a;
                synchronized (cVar) {
                    surfaceTexture = cVar.f412486i;
                }
                kVar.f402387h = surfaceTexture;
            } else {
                this.f402327e.getClass();
                this.f402327e.f402384e = rs0.i.f480829a.a(this.f402326d, null, this.f402328f, this.f402329g);
                this.f402327e.f402380a.k(false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402327e.f402381b, this.f402327e.hashCode() + " initWithSize finish");
            this.f402327e.f402401v = true;
            yz5.l lVar = this.f402330h;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402327e.f402381b, e17, "initWithSize error!", new java.lang.Object[0]);
            yz5.l lVar2 = this.f402330h;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}

package ls0;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f402319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f402320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f402321g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f402322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ls0.k kVar, android.view.Surface surface, int i17, int i18, yz5.l lVar) {
        super(0);
        this.f402318d = kVar;
        this.f402319e = surface;
        this.f402320f = i17;
        this.f402321g = i18;
        this.f402322h = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture;
        try {
            this.f402318d.getClass();
            this.f402318d.f402384e = rs0.g.n(rs0.i.f480829a, this.f402319e, null, this.f402320f, this.f402321g, null, 18, null);
            this.f402318d.f402380a.k(true);
            ls0.k kVar = this.f402318d;
            ms0.c cVar = kVar.f402380a;
            synchronized (cVar) {
                surfaceTexture = cVar.f412486i;
            }
            kVar.f402387h = surfaceTexture;
            ls0.k kVar2 = this.f402318d;
            android.graphics.SurfaceTexture surfaceTexture2 = kVar2.f402387h;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new ls0.j(kVar2));
            }
            this.f402318d.f402401v = true;
            yz5.l lVar = this.f402322h;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402318d.f402381b, e17, "initWithSurface failed", new java.lang.Object[0]);
            yz5.l lVar2 = this.f402322h;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}

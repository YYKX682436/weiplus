package y22;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f540606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f540607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f540608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f540609g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y22.g gVar, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        super(0);
        this.f540606d = gVar;
        this.f540607e = surfaceTexture;
        this.f540608f = i17;
        this.f540609g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture;
        android.graphics.SurfaceTexture surfaceTexture2 = this.f540607e;
        y22.g gVar = this.f540606d;
        gVar.f540620g = surfaceTexture2;
        int i17 = this.f540608f;
        int i18 = this.f540609g;
        android.view.Surface surface = new android.view.Surface(gVar.f540620g);
        gVar.f540621h = surface;
        gVar.f540619f = rs0.g.n(rs0.i.f480829a, surface, null, 0, 0, null, 30, null);
        d32.n nVar = gVar.f540617d;
        nVar.onSurfaceCreated(null, null);
        nVar.t(i17, i18);
        nVar.k(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewGLTextureView", "previewCallback?.invoke");
        yz5.l lVar = gVar.f540624n;
        if (lVar != null) {
            synchronized (nVar) {
                surfaceTexture = nVar.f412486i;
            }
            lVar.mo146xb9724478(surfaceTexture);
        }
        return jz5.f0.f384359a;
    }
}

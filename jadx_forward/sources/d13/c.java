package d13;

/* loaded from: classes14.dex */
public final class c implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f307255d;

    /* renamed from: e, reason: collision with root package name */
    public d13.b f307256e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f307257f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f307258g;

    public c(android.graphics.SurfaceTexture st6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(st6, "st");
        this.f307255d = st6;
        this.f307258g = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        new p012xc85e97e9.p093xedfae76a.j0().mo7806x9d92d11c(this, new d13.a(this));
    }

    public final void a() {
        d13.b bVar = this.f307256e;
        if (bVar != null) {
            b13.g gVar = (b13.g) bVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipMgr", "onSurfaceTextureDestroy");
            dr4.p1 p1Var = gVar.f98635a;
            p1Var.getClass();
            dr4.q renderGLSurface = gVar.f98636b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderGLSurface, "renderGLSurface");
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var != null) {
                x1Var.c(renderGLSurface, gVar.f98637c);
            }
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f307258g;
    }
}

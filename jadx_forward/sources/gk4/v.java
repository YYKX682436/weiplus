package gk4;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f354165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rs0.h f354166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk4.h0 h0Var, android.graphics.SurfaceTexture surfaceTexture, rs0.h hVar) {
        super(0);
        this.f354164d = h0Var;
        this.f354165e = surfaceTexture;
        this.f354166f = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs0.h hVar;
        gk4.h0 h0Var = this.f354164d;
        android.graphics.SurfaceTexture surfaceTexture = h0Var.f354092d;
        java.lang.String str = h0Var.f354089a;
        if (surfaceTexture != null && (hVar = h0Var.f354095g) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do detachSurface");
            rs0.g gVar = rs0.i.f480829a;
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            gVar.p(hVar, EGL_NO_SURFACE);
            hVar.f480826b = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do attachSurface:");
        android.graphics.SurfaceTexture surfaceTexture2 = this.f354165e;
        sb6.append(surfaceTexture2.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        h0Var.f354092d = surfaceTexture2;
        rs0.g gVar2 = rs0.i.f480829a;
        rs0.h hVar2 = this.f354166f;
        h0Var.f354095g = gVar2.j(hVar2.f480827c, hVar2.f480825a, new android.view.Surface(surfaceTexture2));
        return jz5.f0.f384359a;
    }
}

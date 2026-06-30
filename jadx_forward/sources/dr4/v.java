package dr4;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f324283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.q f324284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f324285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dr4.c0 c0Var, dr4.q qVar, yz5.l lVar) {
        super(0);
        this.f324283d = c0Var;
        this.f324284e = qVar;
        this.f324285f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs0.h hVar = this.f324283d.f324134d;
        if (hVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseSurface:");
            dr4.q qVar = this.f324284e;
            java.lang.Object obj = qVar.f324262b;
            sb6.append(obj != null ? obj.hashCode() : 0);
            sb6.append(", ");
            sb6.append(qVar.a().hashCode());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PboSurfaceRender", sb6.toString());
            rs0.g gVar = rs0.i.f480829a;
            android.opengl.EGLSurface a17 = qVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GLEnvironmentUtil", "eglUnbindSurface");
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, a17);
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            qVar.f324263c = EGL_NO_SURFACE;
            yz5.l lVar = this.f324285f;
            if (lVar != null) {
                lVar.mo146xb9724478(qVar);
            }
        }
        return jz5.f0.f384359a;
    }
}

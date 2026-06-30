package y22;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f540614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f540615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y22.g gVar, long j17) {
        super(0);
        this.f540614d = gVar;
        this.f540615e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture surfaceTexture;
        y22.g gVar = this.f540614d;
        d32.n nVar = gVar.f540617d;
        synchronized (nVar) {
            surfaceTexture = nVar.f412486i;
        }
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
        gVar.f540617d.onDrawFrame(null);
        rs0.h hVar = gVar.f540619f;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f480825a, hVar.f480826b, this.f540615e);
            android.opengl.EGL14.eglSwapBuffers(hVar.f480825a, hVar.f480826b);
        }
        yz5.a aVar = gVar.f540625o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}

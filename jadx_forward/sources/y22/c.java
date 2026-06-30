package y22;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f540610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y22.g gVar) {
        super(0);
        this.f540610d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        y22.g gVar = this.f540610d;
        ms0.c.o(gVar.f540617d, false, 1, null);
        rs0.h hVar = gVar.f540619f;
        if (hVar != null) {
            android.opengl.EGL14.eglDestroyContext(hVar.f480825a, hVar.f480827c);
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, hVar.f480826b);
            android.graphics.SurfaceTexture surfaceTexture = gVar.f540620g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            android.os.HandlerThread handlerThread = gVar.f540622i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            gVar.f540622i = null;
            gVar.f540623m = null;
        }
        return jz5.f0.f384359a;
    }
}

package et0;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f338069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(et0.k kVar) {
        super(0);
        this.f338069d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        et0.k kVar = this.f338069d;
        ms0.c cVar = kVar.f338080h;
        if (cVar != null) {
            ms0.c.o(cVar, false, 1, null);
        }
        kVar.f338080h = null;
        rs0.h hVar = kVar.f338076d;
        if (hVar != null) {
            android.opengl.EGL14.eglDestroyContext(hVar.f480825a, hVar.f480827c);
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, hVar.f480826b);
            hVar.f480826b = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
            hVar.f480827c = EGL_NO_CONTEXT;
            android.os.HandlerThread handlerThread = kVar.f338078f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            kVar.f338078f = null;
            kVar.f338079g = null;
        }
        return jz5.f0.f384359a;
    }
}

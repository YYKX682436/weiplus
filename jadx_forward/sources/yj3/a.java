package yj3;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f544202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yj3.g gVar) {
        super(0);
        this.f544202d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs0.g gVar = rs0.i.f480829a;
        yj3.g gVar2 = this.f544202d;
        gVar2.f544217j = gVar.l(gVar2.f544208a, gVar2.f544209b, android.opengl.EGL14.EGL_NO_CONTEXT);
        os0.c cVar = new os0.c(gVar2.f544208a, gVar2.f544209b, 0, 0, 0, 0, 60, null);
        gVar2.f544213f = cVar;
        cVar.f429544t = new yj3.e(gVar2);
        jz5.g gVar3 = gVar2.f544219l;
        is0.c cVar2 = (is0.c) ((jz5.n) gVar3).mo141623x754a37bb();
        os0.c cVar3 = gVar2.f544213f;
        if (cVar3 != null) {
            cVar3.H = ((is0.c) ((jz5.n) gVar3).mo141623x754a37bb()).f375928e;
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar2.f375928e);
        gVar2.f544214g = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(gVar2.f544208a, gVar2.f544209b);
        android.graphics.SurfaceTexture surfaceTexture2 = gVar2.f544214g;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new yj3.f(gVar2));
        }
        gVar2.f544216i = new android.view.Surface(gVar2.f544214g);
        rs0.h hVar = gVar2.f544217j;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f480825a;
            android.opengl.EGLSurface eGLSurface = hVar.f480826b;
            if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar.f480827c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectCanvasRendererMgr", "makeEGLCurrent failed ");
            }
        }
        gVar2.f544210c.mo146xb9724478(gVar2);
        return jz5.f0.f384359a;
    }
}

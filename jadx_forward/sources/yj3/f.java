package yj3;

/* loaded from: classes14.dex */
public final class f implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f544207d;

    public f(yj3.g gVar) {
        this.f544207d = gVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f544207d.f544218k = true;
        yj3.g gVar = this.f544207d;
        synchronized (gVar) {
            try {
                if (gVar.f544218k) {
                    gVar.f544218k = false;
                    try {
                        android.graphics.SurfaceTexture surfaceTexture2 = gVar.f544214g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.updateTexImage();
                        }
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectCanvasRendererMgr", "render Image update");
                    }
                }
                os0.c cVar = gVar.f544213f;
                if (cVar != null) {
                    cVar.o();
                }
                rs0.h hVar = gVar.f544217j;
                if (hVar != null) {
                    android.opengl.EGL14.eglSwapBuffers(hVar.f480825a, hVar.f480826b);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectCanvasRendererMgr", "render error in " + e17);
            }
        }
    }
}

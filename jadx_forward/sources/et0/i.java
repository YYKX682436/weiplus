package et0;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f338074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(et0.k kVar) {
        super(0);
        this.f338074d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture b17;
        et0.k kVar = this.f338074d;
        ft0.d dVar = kVar.f338081i;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        ms0.c cVar = kVar.f338080h;
        if (cVar != null) {
            cVar.onDrawFrame(null);
        }
        rs0.h hVar = kVar.f338076d;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f480825a, hVar.f480826b, java.lang.System.nanoTime());
            android.opengl.EGL14.eglSwapBuffers(hVar.f480825a, hVar.f480826b);
        }
        return jz5.f0.f384359a;
    }
}

package et0;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 f338094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58) {
        super(0);
        this.f338094d = c10906xaf641c58;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture b17;
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58 = this.f338094d;
        ft0.d dVar = c10906xaf641c58.f150482t;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        ms0.c renderer = c10906xaf641c58.getRenderer();
        if (renderer != null) {
            renderer.onDrawFrame(null);
        }
        rs0.h hVar = c10906xaf641c58.f150474i;
        if (hVar != null) {
            android.opengl.EGLExt.eglPresentationTimeANDROID(hVar.f480825a, hVar.f480826b, java.lang.System.nanoTime());
            android.opengl.EGL14.eglSwapBuffers(hVar.f480825a, hVar.f480826b);
        }
        return jz5.f0.f384359a;
    }
}

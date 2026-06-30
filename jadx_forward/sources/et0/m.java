package et0;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 f338090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58) {
        super(0);
        this.f338090d = c10906xaf641c58;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10906xaf641c58 c10906xaf641c58 = this.f338090d;
        ms0.c renderer = c10906xaf641c58.getRenderer();
        if (renderer != null) {
            ms0.c.o(renderer, false, 1, null);
        }
        rs0.h hVar = c10906xaf641c58.f150474i;
        if (hVar != null) {
            android.opengl.EGL14.eglDestroyContext(hVar.f480825a, hVar.f480827c);
            android.opengl.EGL14.eglDestroySurface(hVar.f480825a, hVar.f480826b);
            android.view.Surface surface = c10906xaf641c58.f150476n;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = c10906xaf641c58.f150475m;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            android.os.HandlerThread handlerThread = c10906xaf641c58.f150479q;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            c10906xaf641c58.f150479q = null;
            c10906xaf641c58.f150480r = null;
        }
        return jz5.f0.f384359a;
    }
}

package d32;

/* loaded from: classes10.dex */
public final class g implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f307678d;

    public g(d32.j jVar) {
        this.f307678d = jVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        d32.j jVar = this.f307678d;
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureEGLPixelBuffer", "onVideoSurfaceFrameAvailable");
        jVar.f307691k.mo50293x3498a0(new d32.i(new d32.h(jVar)));
    }
}

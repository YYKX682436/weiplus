package ew2;

/* loaded from: classes14.dex */
public final class h implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final ew2.f f338593d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f338594e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.Surface f338595f;

    public h(ew2.f render, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(render, "render");
        this.f338593d = render;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i17);
        this.f338594e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f338595f = new android.view.Surface(surfaceTexture);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        surfaceTexture.updateTexImage();
        this.f338593d.a();
    }
}

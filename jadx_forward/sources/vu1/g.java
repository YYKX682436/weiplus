package vu1;

/* loaded from: classes13.dex */
public final class g implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu1.h f521721d;

    public g(vu1.h hVar) {
        this.f521721d = hVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f521721d.f521735n = true;
    }
}

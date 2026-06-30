package i72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a f370943d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a) {
        this.f370943d = textureViewSurfaceTextureListenerC13526x5bf79f0a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = this.f370943d;
        android.graphics.Rect rect = textureViewSurfaceTextureListenerC13526x5bf79f0a.f181641v;
        long j17 = textureViewSurfaceTextureListenerC13526x5bf79f0a.f181632m;
        synchronized (textureViewSurfaceTextureListenerC13526x5bf79f0a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.mo50302x6b17ad39(null);
            textureViewSurfaceTextureListenerC13526x5bf79f0a.f181641v = rect;
            textureViewSurfaceTextureListenerC13526x5bf79f0a.G();
            ((i72.m) textureViewSurfaceTextureListenerC13526x5bf79f0a.f181645z).c(j17);
        }
        textureViewSurfaceTextureListenerC13526x5bf79f0a.f181636q = false;
    }
}

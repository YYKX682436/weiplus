package i72;

/* loaded from: classes14.dex */
public class m implements i72.d {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 f370957a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.Camera.PreviewCallback f370958b = new i72.j(this);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u f370959c = new i72.l(this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a f370960d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a, i72.a aVar) {
        this.f370960d = textureViewSurfaceTextureListenerC13526x5bf79f0a;
        this.f370957a = null;
        this.f370957a = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0(textureViewSurfaceTextureListenerC13526x5bf79f0a.getContext());
        textureViewSurfaceTextureListenerC13526x5bf79f0a.f181633n = -1L;
        textureViewSurfaceTextureListenerC13526x5bf79f0a.B = false;
    }

    public int a() {
        int i17;
        synchronized (this.f370960d.f181640u) {
            i17 = this.f370957a.f181551d.y;
        }
        return i17;
    }

    public int b() {
        int i17;
        synchronized (this.f370960d.f181640u) {
            i17 = this.f370957a.f181551d.x;
        }
        return i17;
    }

    public void c(long j17) {
        synchronized (this.f370960d.f181640u) {
            if (this.f370957a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: start capturing. tween: %d", java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = this.f370960d;
            textureViewSurfaceTextureListenerC13526x5bf79f0a.f181632m = j17;
            if (textureViewSurfaceTextureListenerC13526x5bf79f0a.f181638s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: already scanning");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var = this.f370957a;
                if (n0Var == null || !n0Var.f181550c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: not previewed yet. wait");
                    this.f370960d.f181636q = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: is previewing. directly start capture");
                    this.f370960d.f181636q = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().a(this.f370959c);
                    this.f370960d.f181638s = true;
                }
            }
        }
    }
}

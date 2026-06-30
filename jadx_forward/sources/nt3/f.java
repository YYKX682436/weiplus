package nt3;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f421308a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.Surface f421309b;

    /* renamed from: c, reason: collision with root package name */
    public final nt3.f0 f421310c;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f421311d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f421312e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f421313f;

    public f(android.graphics.SurfaceTexture surfaceTexture, nt3.f0 f0Var) {
        this.f421308a = surfaceTexture;
        this.f421310c = f0Var;
    }

    public void a(java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.GLThread", "postJob");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f421313f;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.GLThread", "postJob but handler is null");
        } else {
            n3Var.mo50293x3498a0(runnable);
        }
    }

    public void b() {
        java.lang.String str = "CameraPreviewTextureView_renderThread" + hashCode();
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, -2);
        this.f421312e = a17;
        a17.start();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f421312e.getLooper());
        this.f421313f = n3Var;
        n3Var.mo50293x3498a0(new nt3.c(this));
    }

    public f(android.view.Surface surface, nt3.f0 f0Var) {
        this.f421309b = surface;
        this.f421310c = f0Var;
    }
}

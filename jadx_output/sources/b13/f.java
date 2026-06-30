package b13;

/* loaded from: classes14.dex */
public final class f implements y03.g {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f17096a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f17097b;

    /* renamed from: c, reason: collision with root package name */
    public final x.f f17098c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f17099d;

    /* renamed from: e, reason: collision with root package name */
    public y03.f f17100e;

    /* renamed from: f, reason: collision with root package name */
    public y03.f f17101f;

    public f(io.flutter.view.TextureRegistry registry) {
        kotlin.jvm.internal.o.g(registry, "registry");
        this.f17096a = registry;
        this.f17097b = "MicroMsg.FlutterTextureMgr";
        this.f17098c = new x.f();
        this.f17099d = new java.util.ArrayList();
        if (vq4.b0.f439271b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterTextureMgr", hashCode() + " offer surface use create");
            b13.a a17 = a();
            this.f17100e = new y03.f(a17.f17086a, a17.f17087b, new y03.h(a17.f17088c.f225722d), 0, 0);
            b13.a a18 = a();
            y03.h hVar = new y03.h(a18.f17088c.f225722d);
            y03.f fVar = new y03.f(a18.f17086a, a18.f17087b, hVar, 0, 0);
            this.f17101f = fVar;
            y03.f fVar2 = this.f17100e;
            y03.h hVar2 = fVar2 != null ? fVar2.f458640c : null;
            if (hVar2 != null) {
                hVar2.f458646f = new b13.d(fVar2);
            }
            hVar.f458646f = new b13.e(fVar);
            dr4.p1 p1Var = gq4.v.Bi().E;
            if (p1Var == null) {
                return;
            }
            p1Var.f242723v = this;
        }
    }

    public final b13.a a() {
        io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = this.f17096a.createSurfaceTexture();
        kotlin.jvm.internal.o.f(createSurfaceTexture, "createSurfaceTexture(...)");
        android.graphics.SurfaceTexture surfaceTexture = createSurfaceTexture.surfaceTexture();
        kotlin.jvm.internal.o.f(surfaceTexture, "surfaceTexture(...)");
        return new b13.a(createSurfaceTexture.id(), createSurfaceTexture, new d13.c(surfaceTexture), 0, 0, 0, 56, null);
    }

    public final void b(b13.m flutterVoipMgr) {
        kotlin.jvm.internal.o.g(flutterVoipMgr, "flutterVoipMgr");
        java.lang.String str = this.f17097b;
        com.tencent.mars.xlog.Log.i(str, "warm up");
        x.f fVar = this.f17098c;
        if (fVar.e() >= 2) {
            com.tencent.mars.xlog.Log.i(str, "texturePool size >= 2, skip warm up");
            return;
        }
        b13.a a17 = a();
        long j17 = a17.f17086a;
        fVar.d(j17, a17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create flutter texture: ");
        sb6.append(j17);
        sb6.append(", surfaceTexture:");
        d13.c surfaceTexture = a17.f17088c;
        sb6.append(surfaceTexture.f225722d);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "addCameraRenderSurfaceTexture " + surfaceTexture.f225722d);
        flutterVoipMgr.F1 = surfaceTexture;
        flutterVoipMgr.D1 = false;
        flutterVoipMgr.G0();
        surfaceTexture.f225724f = new b13.b(a17);
        com.tencent.mars.xlog.Log.i(str, "warm up local camera texture");
        b13.a a18 = a();
        fVar.d(a18.f17086a, a18);
        d13.c surfaceTexture2 = a18.f17088c;
        kotlin.jvm.internal.o.g(surfaceTexture2, "surfaceTexture");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "addCameraRenderSurfaceTexture " + surfaceTexture2.f225722d);
        flutterVoipMgr.G1 = surfaceTexture2;
        flutterVoipMgr.E1 = false;
        flutterVoipMgr.G0();
        surfaceTexture2.f225724f = new b13.c(a18);
        com.tencent.mars.xlog.Log.i(str, "warm up remote camera texture");
    }
}

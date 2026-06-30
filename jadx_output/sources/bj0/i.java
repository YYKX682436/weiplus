package bj0;

/* loaded from: classes11.dex */
public final class i extends bj0.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f21110d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21112f;

    public i(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine) {
        this.f21112f = flutterViewEngine;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        io.flutter.Log.i(this.f21112f.C, "onSurfaceTextureAvailable:" + surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        io.flutter.Log.i(this.f21112f.C, "onSurfaceTextureDestroyed:" + surface);
        return true;
    }

    @Override // bj0.a, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        boolean z17 = this.f21110d;
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21112f;
        if (!z17) {
            com.tencent.mm.flutter.ui.FlutterViewEngine.a(flutterViewEngine, bj0.f.f21104d);
            this.f21110d = true;
        }
        if (!flutterViewEngine.f68147y) {
            flutterViewEngine.f68147y = true;
            io.flutter.Log.i(flutterViewEngine.C, "onSurfaceTextureUpdated first called");
        }
        if (flutterViewEngine.e() && !this.f21111e) {
            io.flutter.Log.i(flutterViewEngine.C, "onSurfaceTextureUpdated, try switchToSurfaceView");
            flutterViewEngine.j();
            this.f21111e = true;
        }
        if (flutterViewEngine.e() || !flutterViewEngine.f68148z) {
            return;
        }
        io.flutter.Log.i(flutterViewEngine.C, "onSurfaceTextureUpdated switchToSurfaceViewWaitTextureViewUpdate");
        flutterViewEngine.j();
    }
}

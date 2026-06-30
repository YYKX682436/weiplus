package bj0;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21120d;

    public n(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine) {
        this.f21120d = flutterViewEngine;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21120d;
        io.flutter.Log.i(flutterViewEngine.C, "do switchToSurfaceView onNextFrameDisplayed");
        flutterViewEngine.f68145w = false;
        io.flutter.embedding.android.FlutterView flutterView = flutterViewEngine.f68137o;
        if (flutterView != null) {
            flutterView.switchSurface(true);
        }
        com.tencent.mm.flutter.ui.FlutterViewEngine.a(flutterViewEngine, bj0.f.f21105e);
        if (flutterViewEngine.B == 0) {
            flutterViewEngine.B = java.lang.System.currentTimeMillis();
            io.flutter.Log.i(flutterViewEngine.C, "mark snapshotRenderMills:" + flutterViewEngine.B);
        }
    }
}

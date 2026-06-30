package bj0;

/* loaded from: classes11.dex */
public final class h implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21109d;

    public h(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine) {
        this.f21109d = flutterViewEngine;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        bj0.f fVar = bj0.f.f21106f;
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21109d;
        com.tencent.mm.flutter.ui.FlutterViewEngine.a(flutterViewEngine, fVar);
        if (flutterViewEngine.B == 0) {
            flutterViewEngine.B = java.lang.System.currentTimeMillis();
            io.flutter.Log.i(flutterViewEngine.C, "mark snapshotRenderMills:" + flutterViewEngine.B);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

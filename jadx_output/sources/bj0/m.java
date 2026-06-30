package bj0;

/* loaded from: classes11.dex */
public final class m implements io.flutter.embedding.engine.renderer.FlutterUiDisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f21118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f21119c;

    public m(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine, io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, yz5.a aVar) {
        this.f21117a = flutterViewEngine;
        this.f21118b = flutterRenderer;
        this.f21119c = aVar;
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiDisplayed() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21117a;
        io.flutter.Log.i(flutterViewEngine.C, "do switchToSurfaceView onFlutterUiDisplayed");
        this.f21118b.removeIsDisplayingFlutterUiListener(this);
        flutterViewEngine.A = null;
        this.f21119c.invoke();
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiNoLongerDisplayed() {
    }
}

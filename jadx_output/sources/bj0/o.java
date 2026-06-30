package bj0;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.FlutterRenderer f21122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine, io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        super(0);
        this.f21121d = flutterViewEngine;
        this.f21122e = flutterRenderer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21121d;
        io.flutter.Log.i(flutterViewEngine.C, "waitNextFrameSwitchSurface");
        bj0.n nVar = new bj0.n(flutterViewEngine);
        io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer = this.f21122e;
        flutterRenderer.onNextFrameDisplayed(nVar);
        flutterRenderer.requestDrawLastFrame();
        return jz5.f0.f302826a;
    }
}

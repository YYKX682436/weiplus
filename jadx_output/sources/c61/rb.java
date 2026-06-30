package c61;

/* loaded from: classes8.dex */
public final class rb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.FlutterScreenshotCallbackPlugin f39281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(com.tencent.mm.plugin.FlutterScreenshotCallbackPlugin flutterScreenshotCallbackPlugin) {
        super(0);
        this.f39281d = flutterScreenshotCallbackPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.FlutterScreenshotCallbackPlugin flutterScreenshotCallbackPlugin = this.f39281d;
        com.tencent.mars.xlog.Log.i(flutterScreenshotCallbackPlugin.f72404e, "onScreenShot");
        io.flutter.plugin.common.MethodChannel methodChannel = flutterScreenshotCallbackPlugin.f72403d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onScreenShot", null);
        }
        return jz5.f0.f302826a;
    }
}

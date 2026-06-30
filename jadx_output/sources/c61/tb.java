package c61;

/* loaded from: classes8.dex */
public final class tb implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f39310d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "Flutter.setting_switch");
        this.f39310d = methodChannel;
        methodChannel.setMethodCallHandler(new c61.sb(this));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f39310d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f39310d = null;
    }
}

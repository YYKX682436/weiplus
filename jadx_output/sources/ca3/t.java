package ca3;

/* loaded from: classes5.dex */
public final class t implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding f39811d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapViewPlugin", "onAttachedToActivity");
        io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.f39811d;
        if (flutterPluginBinding == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppMapViewPlugin", "onAttachedToActivity flutterPluginBinding is null");
            return;
        }
        kotlin.jvm.internal.o.d(flutterPluginBinding);
        io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.f39811d;
        kotlin.jvm.internal.o.d(flutterPluginBinding2);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding2.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        platformViewRegistry.registerViewFactory("wxa_hybrid-map-view-type", new ca3.s(binaryMessenger, new java.lang.ref.WeakReference(binding)));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapViewPlugin", "onAttachedToEngine");
        this.f39811d = binding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f39811d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }
}

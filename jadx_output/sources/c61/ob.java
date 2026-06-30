package c61;

/* loaded from: classes8.dex */
public final class ob implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f39212d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f39213e;

    public static final boolean a(c61.ob obVar) {
        obVar.getClass();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            int checkSelfPermission = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.ACCESS_MEDIA_LOCATION");
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterMediaPickerPlugin", "checkMediaPermission selfPermission:" + checkSelfPermission);
            if (checkSelfPermission == 0) {
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterMediaPickerPlugin", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public static final /* synthetic */ java.lang.String b(c61.ob obVar) {
        obVar.getClass();
        return "MicroMsg.FlutterMediaPickerPlugin";
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f39213e = p07.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(p07.getBinaryMessenger(), "Flutter.media_picker");
        this.f39212d = methodChannel;
        methodChannel.setMethodCallHandler(new c61.nb(this));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f39213e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f39213e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f39212d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f39212d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f39213e = p07.getActivity();
    }
}

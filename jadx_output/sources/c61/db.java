package c61;

/* loaded from: classes11.dex */
public final class db implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: g, reason: collision with root package name */
    public static final c61.bb f38943g = new c61.bb(null);

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f38944d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f38945e;

    /* renamed from: f, reason: collision with root package name */
    public long f38946f;

    public final void a(java.util.Map map, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFoundationCrashPlugin", "reportStack: ");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("\n#deviceParameters=" + map.get("deviceParameters"));
        sb6.append("\n#customParameters=" + map.get("customParameters"));
        sb6.append("\n#applicationParameters=" + map.get("applicationParameters"));
        sb6.append("\n#dateTime=" + map.get("dateTime"));
        sb6.append("\n#context=" + map.get("context"));
        sb6.append("\n#library=" + map.get("library"));
        sb6.append("\n" + a03.h.a());
        java.lang.String sb7 = sb6.toString();
        z65.d dVar = z65.c.f470457c;
        if (dVar != null) {
            dVar.a(sb7, str3, z17, str, str2);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "com.tencent.mm.flutter.foundation_crash");
        this.f38944d = methodChannel;
        methodChannel.setMethodCallHandler(new c61.cb(this));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = this.f38944d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }
}

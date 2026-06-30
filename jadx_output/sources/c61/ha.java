package c61;

/* loaded from: classes11.dex */
public final class ha implements io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f39023d;

    /* renamed from: e, reason: collision with root package name */
    public final c61.ga f39024e = new c61.ga();

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(binding.getBinaryMessenger(), "com.tencent.mm.account/avatar_changed");
        eventChannel.setStreamHandler(this.f39024e);
        this.f39023d = eventChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        c61.ga gaVar = this.f39024e;
        if (gaVar.f39004d != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            ((java.util.HashSet) com.tencent.mm.modelavatar.d1.wi().f70526i).remove(gaVar);
            gaVar.f39004d = null;
        }
        io.flutter.plugin.common.EventChannel eventChannel = this.f39023d;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
    }
}

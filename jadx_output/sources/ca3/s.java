package ca3;

/* loaded from: classes5.dex */
public final class s extends io.flutter.plugin.platform.PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.plugin.common.BinaryMessenger f39809a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f39810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(io.flutter.plugin.common.BinaryMessenger messenger, java.lang.ref.WeakReference activityPluginBinding) {
        super(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        kotlin.jvm.internal.o.g(messenger, "messenger");
        kotlin.jvm.internal.o.g(activityPluginBinding, "activityPluginBinding");
        this.f39809a = messenger;
        this.f39810b = activityPluginBinding;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppMapViewFactory", "create platformview id: %d", java.lang.Integer.valueOf(i17));
        java.lang.String format = java.lang.String.format("wx_liteapp_map_%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return new com.tencent.mm.plugin.lite.map.LiteAppMapView(context, i17, map, new io.flutter.plugin.common.MethodChannel(this.f39809a, format), (io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding) this.f39810b.get());
    }
}

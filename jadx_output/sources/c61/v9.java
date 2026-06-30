package c61;

/* loaded from: classes11.dex */
public final class v9 implements com.tencent.pigeon.weapm.WeAPMApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public final long f39352d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39353e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngine f39354f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f39355g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public long f39356h;

    /* renamed from: i, reason: collision with root package name */
    public long f39357i;

    /* renamed from: m, reason: collision with root package name */
    public long f39358m;

    public v9(long j17, long j18) {
        this.f39352d = j17;
        this.f39353e = j18;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getBindFlutterInstanceMills() {
        return this.f39356h;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public void getDartVMMemoryInfo(yz5.l callback) {
        io.flutter.embedding.engine.systemchannels.StatChannel statChannel;
        kotlin.jvm.internal.o.g(callback, "callback");
        ((java.util.ArrayList) this.f39355g).add(callback);
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f39354f;
        if (flutterEngine == null || (statChannel = flutterEngine.getStatChannel()) == null) {
            return;
        }
        statChannel.reportMemoryUsage();
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getFlutterEngineCreateFinishMills() {
        return this.f39353e;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getFlutterEngineCreateStartMills() {
        return this.f39352d;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getNativeFirstPointerDownMills() {
        return 0L;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getNativeFirstScrollMills() {
        return 0L;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getPageEnterMills() {
        return this.f39358m;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public long getSnapshotRenderMills() {
        return 0L;
    }

    @Override // com.tencent.pigeon.weapm.WeAPMApi
    public com.tencent.pigeon.weapm.FlutterStartUpTransitionReportInfo getTransitionReportInfo() {
        return new com.tencent.pigeon.weapm.FlutterStartUpTransitionReportInfo(this.f39357i, 0L, 0L);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        p07.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.weapm.WeAPMApi.Companion companion = com.tencent.pigeon.weapm.WeAPMApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.weapm.WeAPMApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f39354f = binding.getFlutterEngine();
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
        this.f39354f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        p07.getActivity();
    }
}

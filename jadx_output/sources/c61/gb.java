package c61;

/* loaded from: classes11.dex */
public final class gb implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.mm_foundation.FlutterPlatformChannel, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f39005d;

    @Override // com.tencent.pigeon.mm_foundation.FlutterPlatformChannel
    public java.lang.String getAppVersion() {
        return a03.h.a();
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterPlatformChannel
    public java.lang.String getWeChatRevision() {
        java.lang.String REV = com.tencent.mm.sdk.platformtools.z.f193109e;
        kotlin.jvm.internal.o.f(REV, "REV");
        return REV;
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterPlatformChannel
    public java.lang.String getWeChatVersion() {
        java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
        kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        return CLIENT_VERSION;
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterPlatformChannel
    public boolean isScreenOn() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((android.os.PowerManager) systemService).isInteractive();
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterPlatformChannel
    public void lightVibrate(boolean z17) {
        android.view.Window window;
        android.view.View decorView;
        int i17 = z17 ? 3 : 0;
        android.app.Activity activity = this.f39005d;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.performHapticFeedback(1, i17);
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterPlatformChannel
    public void mediumVibrate(boolean z17) {
        android.view.Window window;
        android.view.View decorView;
        int i17 = z17 ? 3 : 0;
        android.app.Activity activity = this.f39005d;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.performHapticFeedback(3, i17);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        this.f39005d = activity;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterPlatformChannel.Companion companion = com.tencent.pigeon.mm_foundation.FlutterPlatformChannel.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterPlatformChannel.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f39005d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f39005d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterPlatformChannel.Companion companion = com.tencent.pigeon.mm_foundation.FlutterPlatformChannel.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterPlatformChannel.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        if (!(activity instanceof android.app.Activity)) {
            activity = null;
        }
        this.f39005d = activity;
    }
}

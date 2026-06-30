package c61;

/* loaded from: classes5.dex */
public final class xa implements com.tencent.pigeon.mm_foundation.FlutterCgiHost, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.y0 f39412d;

    public xa() {
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.z0.c(b17, null);
        this.f39412d = b17;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f39412d = kotlinx.coroutines.z0.b();
        com.tencent.pigeon.mm_foundation.FlutterCgiHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterCgiHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterCgiHost.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlinx.coroutines.z0.e(this.f39412d, null, 1, null);
        com.tencent.pigeon.mm_foundation.FlutterCgiHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterCgiHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterCgiHost.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterCgiHost
    public void send(com.tencent.pigeon.mm_foundation.FlutterCgiRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f39412d, kotlinx.coroutines.q1.f310570c, null, new c61.ta(request, callback, null), 2, null);
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterCgiHost
    public void sendFinder(com.tencent.pigeon.mm_foundation.FlutterCgiRequest request, com.tencent.pigeon.mm_foundation.FlutterCgiFinderExtInfo extInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f39412d, kotlinx.coroutines.q1.f310570c, null, new c61.wa(request, extInfo, callback, null), 2, null);
    }
}

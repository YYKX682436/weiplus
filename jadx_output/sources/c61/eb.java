package c61;

/* loaded from: classes11.dex */
public final class eb implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.mm_foundation.FlutterHostAssetHost {
    @Override // com.tencent.pigeon.mm_foundation.FlutterHostAssetHost
    public byte[] load(java.lang.String key) {
        a03.f fVar;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = a03.g.f422a;
        java.util.HashMap hashMap2 = a03.g.f422a;
        synchronized (hashMap2) {
            fVar = (a03.f) hashMap2.get(key);
            if (fVar == null) {
                fVar = a03.g.f423b;
            }
        }
        if (fVar == null) {
            return null;
        }
        java.lang.String substring = key.substring(10);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return com.tencent.mm.vfs.w6.N("assets:///".concat(substring), 0, -1);
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterHostAssetHost
    public java.lang.String loadString(java.lang.String key, boolean z17) {
        a03.f fVar;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = a03.g.f422a;
        java.util.HashMap hashMap2 = a03.g.f422a;
        synchronized (hashMap2) {
            fVar = (a03.f) hashMap2.get(key);
            if (fVar == null) {
                fVar = a03.g.f423b;
            }
        }
        if (fVar == null) {
            return null;
        }
        java.lang.String substring = key.substring(10);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return com.tencent.mm.vfs.w6.M("assets:///".concat(substring));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterHostAssetHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterHostAssetHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterHostAssetHost.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterHostAssetHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterHostAssetHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterHostAssetHost.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}

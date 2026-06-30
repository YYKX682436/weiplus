package c61;

/* loaded from: classes10.dex */
public final class fb implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.mm_foundation.MMLocationNativeApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f38983d;

    @Override // com.tencent.pigeon.mm_foundation.MMLocationNativeApi
    public com.tencent.pigeon.mm_foundation.MMUserLocationInfo convertWGS84LocationToGCJ02(com.tencent.pigeon.mm_foundation.MMUserLocationInfo locationInfo) {
        kotlin.jvm.internal.o.g(locationInfo, "locationInfo");
        u60.g gVar = (u60.g) i95.n0.c(u60.g.class);
        double latitude = locationInfo.getLatitude();
        double longitude = locationInfo.getLongitude();
        ((t60.e) gVar).getClass();
        double[] dArr = new double[2];
        com.tencent.map.geolocation.sapp.TencentLocationUtils.wgs84ToGcj02(new double[]{latitude, longitude}, dArr);
        return new com.tencent.pigeon.mm_foundation.MMUserLocationInfo(dArr[1], dArr[0], locationInfo.getHorizontalAccuracy(), locationInfo.getVerticalAccuracy());
    }

    @Override // com.tencent.pigeon.mm_foundation.MMLocationNativeApi
    public void getUserCurrentLocation(long j17, com.tencent.pigeon.mm_foundation.MMLocationGeoMode locationGeoMode, yz5.l callback) {
        kotlin.jvm.internal.o.g(locationGeoMode, "locationGeoMode");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((y80.k0) ((z80.g0) i95.n0.c(z80.g0.class))).Ai(this.f38983d, j17, locationGeoMode, callback);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f38983d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.MMLocationNativeApi.Companion companion = com.tencent.pigeon.mm_foundation.MMLocationNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.MMLocationNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f38983d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f38983d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.MMLocationNativeApi.Companion companion = com.tencent.pigeon.mm_foundation.MMLocationNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.MMLocationNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f38983d = binding.getActivity();
    }
}

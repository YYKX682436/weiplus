package ca3;

/* loaded from: classes13.dex */
public final class i implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.map.LiteAppMapView f39799a;

    public i(com.tencent.mm.plugin.lite.map.LiteAppMapView liteAppMapView) {
        this.f39799a = liteAppMapView;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnErrorListener
    public void collectErrorInfo(java.lang.String str) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f39799a.f144101e;
        if (methodChannel != null) {
            methodChannel.invokeMethod("error", null);
        }
    }
}

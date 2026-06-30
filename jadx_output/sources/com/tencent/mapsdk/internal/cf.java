package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class cf extends com.tencent.mapsdk.internal.dn<com.tencent.mapsdk.internal.cf.a> {

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.mapsdk.internal.cf.a f49129f;

    /* loaded from: classes13.dex */
    public interface a extends com.tencent.mapsdk.internal.cn.a {
        @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "channel=1&output=json&uuid=unknown", method = com.tencent.map.tools.net.NetMethod.GET, path = "sdk_event/get_logo", queryKeys = {"range", "map_level"})
        com.tencent.map.tools.net.NetResponse fetchData(java.lang.String str, java.lang.String str2);
    }

    public cf() {
        ((com.tencent.mapsdk.internal.dn) this).f49222d = "sdkgw.map.qq.com";
    }

    public static com.tencent.mapsdk.internal.cf.a b() {
        com.tencent.mapsdk.internal.cf cfVar = (com.tencent.mapsdk.internal.cf) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.cf.class);
        com.tencent.mapsdk.internal.cf.a aVar = cfVar.f49129f;
        return (aVar == null || !cfVar.f49201a) ? (com.tencent.mapsdk.internal.cf.a) cfVar.i() : aVar;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final java.lang.String a() {
        return com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_PROMOTE_IMAGE_DATA;
    }

    private static void a(com.tencent.mapsdk.internal.cf.a aVar) {
        ((com.tencent.mapsdk.internal.cf) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.cf.class)).f49129f = aVar;
    }
}

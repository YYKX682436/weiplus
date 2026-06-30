package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class mj implements com.tencent.map.tools.net.processor.RequestProcessor {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> f50421a;

    public mj(java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap) {
        this.f50421a = hashMap;
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        java.util.Map<java.lang.String, java.lang.String> map;
        com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName regionName = netRequest.mRegionName;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.A, "RegionHostProcessor Region:" + regionName + " HostList:" + this.f50421a);
        java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> hashMap = this.f50421a;
        if (hashMap == null || hashMap.isEmpty() || regionName == com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.EARTH || (map = this.f50421a.get(regionName.name())) == null) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(netRequest.url);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (entry.getKey().equals(parse.getHost())) {
                java.lang.String uri = parse.buildUpon().encodedAuthority(entry.getValue()).build().toString();
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.A, "RegionHostProcessor change host from Url " + netRequest.url + " to " + uri);
                netRequest.setUrl(uri);
            }
        }
    }
}

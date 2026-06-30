package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class bx extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
    public java.lang.String f49052a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "pinyin")
    public java.lang.String f49053b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "cityList")
    public java.util.List<com.tencent.mapsdk.internal.bx> f49054c;

    public final com.tencent.map.sdk.comps.offlinemap.OfflineCity a(com.tencent.map.sdk.comps.offlinemap.OfflineProvince offlineProvince) {
        com.tencent.map.sdk.comps.offlinemap.OfflineCity offlineCity = new com.tencent.map.sdk.comps.offlinemap.OfflineCity();
        offlineCity.setName(this.f49052a);
        offlineCity.setPinyin(this.f49053b);
        offlineCity.setProvince(offlineProvince);
        return offlineCity;
    }

    private com.tencent.map.sdk.comps.offlinemap.OfflineProvince a(java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineCity> list) {
        com.tencent.map.sdk.comps.offlinemap.OfflineProvince offlineProvince = new com.tencent.map.sdk.comps.offlinemap.OfflineProvince();
        offlineProvince.setName(this.f49052a);
        offlineProvince.setPinyin(this.f49053b);
        offlineProvince.setCities(list);
        return offlineProvince;
    }

    private com.tencent.map.sdk.comps.offlinemap.OfflineNation a() {
        com.tencent.map.sdk.comps.offlinemap.OfflineNation offlineNation = new com.tencent.map.sdk.comps.offlinemap.OfflineNation();
        offlineNation.setName(this.f49052a);
        offlineNation.setPinyin(this.f49053b);
        return offlineNation;
    }
}

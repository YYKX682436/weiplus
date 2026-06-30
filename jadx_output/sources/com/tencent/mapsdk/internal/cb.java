package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class cb extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "domain1")
    public java.lang.String f49111a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "dirNew")
    public java.lang.String f49112b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "domain")
    public java.lang.String f49113c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "fileversion")
    public int f49114d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "updateData")
    public java.util.List<com.tencent.mapsdk.internal.bz> f49115e;

    public final com.tencent.mapsdk.internal.bz a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem) {
        java.util.List<com.tencent.mapsdk.internal.bz> list = this.f49115e;
        if (list != null) {
            for (com.tencent.mapsdk.internal.bz bzVar : list) {
                if (offlineItem.getPinyin().equals(bzVar.f49077c)) {
                    bzVar.f49075a = "https://" + this.f49113c + this.f49112b;
                    return bzVar;
                }
            }
        }
        return null;
    }
}

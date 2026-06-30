package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface dd extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver(inJce = com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq.class, outJce = com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp.class, queryRange = {5, 10})
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "pf=androidsdk&fr=02001", method = com.tencent.map.tools.net.NetMethod.POST, path = "fileupdate", queryKeys = {"sdkver", "suid", "appsuid", "nt", "api_key"})
    com.tencent.mapsdk.internal.eb.a<com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp> checkUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> arrayList, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10);

    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver(outFile = com.tencent.mapsdk.internal.ca.f49090g, queryRange = {0})
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(authority = "mapapi.qq.com", method = com.tencent.map.tools.net.NetMethod.GET, path = "sdk/config/offline_city_detail_v2.json")
    com.tencent.mapsdk.internal.ea.a downloadOfflineMapCityList(java.lang.String str);
}

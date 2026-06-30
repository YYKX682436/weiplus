package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface db extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(method = com.tencent.map.tools.net.NetMethod.GET, path = "map/poi/detail", queryKeys = {dm.i4.COL_ID, "key"})
    com.tencent.map.tools.net.NetResponse poiDetail(java.lang.String str, java.lang.String str2);
}

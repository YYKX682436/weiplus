package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface dj extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "p_ver=1", method = com.tencent.map.tools.net.NetMethod.GET, path = "map/traffic/event", queryKeys = {"param"})
    com.tencent.map.tools.net.NetResponse mapTrafficEvent(java.lang.String str);
}

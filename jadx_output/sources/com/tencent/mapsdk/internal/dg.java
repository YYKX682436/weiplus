package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface dg extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "styleid=0", method = com.tencent.map.tools.net.NetMethod.URL, path = "satellite", queryKeys = {"z", "x", "y", "version"}, useExtraQuery = false)
    java.lang.String satelliteUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "styleid=0", method = com.tencent.map.tools.net.NetMethod.URL, path = "satellite", queryKeys = {"z", "x", "y", "version"})
    java.lang.String satelliteUrl2(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);
}

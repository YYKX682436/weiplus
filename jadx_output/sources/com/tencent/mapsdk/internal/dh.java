package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface dh extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "styleid=7", method = com.tencent.map.tools.net.NetMethod.URL, path = "scenic/", queryKeys = {"x", "y", "z", "version"}, useExtraQuery = false)
    java.lang.String sketchTileUrl(int i17, int i18, int i19, int i27);
}

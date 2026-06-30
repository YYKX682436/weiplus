package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface de extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "ctrlpf=vector&ctrlmb=and", method = com.tencent.map.tools.net.NetMethod.GET, queryKeys = {"apikey", "ver", "ctrlver", "uk", "frontier", "scenetype", "mpt"})
    com.tencent.map.tools.net.NetResponse checkAuth(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, int i27);
}

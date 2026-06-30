package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface df extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(method = com.tencent.map.tools.net.NetMethod.POST, path = "rttserverex/", userAgent = "sosomap navsns")
    com.tencent.map.tools.net.NetResponse rttData(byte[] bArr);
}

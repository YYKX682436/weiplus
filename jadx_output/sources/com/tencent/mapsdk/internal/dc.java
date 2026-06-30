package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface dc extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "pf=androidsdk&fr=02001", method = com.tencent.map.tools.net.NetMethod.POST, path = "fileupdate", queryKeys = {"sdkver", "suid", "appsuid", "nt", "api_key"})
    com.tencent.map.tools.net.NetResponse configFileUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, byte[] bArr);
}

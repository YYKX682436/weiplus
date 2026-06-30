package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface cx extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "channel=1&output=json&uuid=unknown", method = com.tencent.map.tools.net.NetMethod.GET, path = "mkey/index.php/mkey/check", queryKeys = {"key", "key2", "pid", "pid2", "hm", "suid", "os", "psv", "ver", "pf", "nt"})
    com.tencent.map.tools.net.NetResponse checkAuth(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10);

    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "channel=1&output=json", method = com.tencent.map.tools.net.NetMethod.GET, path = "sdkapis/v1/cos_token", queryKeys = {com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, "key", "pid"})
    com.tencent.map.tools.net.NetResponse uploadToken(java.lang.String str, java.lang.String str2, java.lang.String str3);
}

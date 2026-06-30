package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface di extends com.tencent.mapsdk.internal.cn.a {
    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "appid=sdk&logid=launch_stat&channel=1&output=json&uuid=unknown", method = com.tencent.map.tools.net.NetMethod.GET, path = "pingd", queryKeys = {"sessionid", "hm", "suid", "duid", "os", "psv", "ver", "pf", "nt"}, userAgent = com.tencent.map.tools.net.NetUtil.MAP_USER_AGENT)
    com.tencent.map.tools.net.NetResponse launchStat(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8);

    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(method = com.tencent.map.tools.net.NetMethod.GET, path = "pingd", queryKeys = {com.google.android.gms.common.internal.ImagesContract.LOCAL}, userAgent = com.tencent.map.tools.net.NetUtil.MAP_USER_AGENT)
    com.tencent.map.tools.net.NetResponse local(int i17);

    @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest(constQuery = "channel=1&output=json&uuid=unknown", head = @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead(keys = {"Content-Type"}, values = {"application/json"}), method = com.tencent.map.tools.net.NetMethod.POST, path = "ditusdk/monitor", queryKeys = {"key", "key2", "pid", "pid2", "hm", "suid", "os", "psv", "ver", "pf", "nt"}, userAgent = com.tencent.map.tools.net.NetUtil.MAP_USER_AGENT)
    com.tencent.map.tools.net.NetResponse report(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, byte[] bArr);
}

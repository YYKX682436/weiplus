package com.tencent.mapsdk.shell.events;

/* loaded from: classes13.dex */
public class DynamicLibEvent extends com.tencent.mapsdk.shell.events.ReportEvent {
    public DynamicLibEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        super("map_dynamic_lib", null);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.params = hashMap;
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
        this.params.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        this.params.put("md5", str3);
        this.params.put("ver", str4);
        this.params.put("abi", str5);
        this.params.put("status", str6);
    }
}

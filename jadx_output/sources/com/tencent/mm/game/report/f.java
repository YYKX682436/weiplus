package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public static /* synthetic */ void i(com.tencent.mm.game.report.f fVar, long j17, long j18, long j19, long j27, long j28, long j29, java.lang.String str, long j37, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.Object obj) {
        fVar.f(j17, j18, j19, j27, j28, j29, str, j37, str2, str3, (i18 & 1024) != 0 ? -1 : i17);
    }

    public static /* synthetic */ void j(com.tencent.mm.game.report.f fVar, long j17, long j18, long j19, long j27, long j28, java.lang.String str, long j29, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        fVar.h(j17, j18, j19, j27, j28, str, j29, i17, (i18 & 256) != 0 ? "{}" : str2);
    }

    public final com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct a(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct gameChatRoomReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct();
        gameChatRoomReportStruct.f58321d = j17;
        gameChatRoomReportStruct.f58322e = j18;
        gameChatRoomReportStruct.f58323f = j19;
        gameChatRoomReportStruct.f58324g = j27;
        gameChatRoomReportStruct.f58325h = j28;
        gameChatRoomReportStruct.f58326i = j29;
        gameChatRoomReportStruct.f58327j = j37;
        gameChatRoomReportStruct.f58336s = com.tencent.mm.sdk.platformtools.t8.V(com.tencent.mm.game.report.g.f68198d, 0L);
        gameChatRoomReportStruct.f58338u = gameChatRoomReportStruct.b("session_id", com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id"), true);
        gameChatRoomReportStruct.f58339v = java.lang.System.currentTimeMillis();
        return gameChatRoomReportStruct;
    }

    public final void b(long j17, long j18, long j19, long j27) {
        i(this, 1305L, j17, j18, 0L, j19, j27, com.tencent.mm.game.report.g.f68197c, 0L, "", "", 0, 1024, null);
    }

    public final void c(long j17, long j18, long j19, long j27, java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i(this, 1324L, j17, j18, 0L, j19, j27, com.tencent.mm.game.report.g.f68197c, 0L, "", jSONObject2, 0, 1024, null);
    }

    public final void d(long j17, long j18, long j19) {
        com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct a17 = a(13L, j17, 0L, 1L, 0L, j18, j19);
        a17.p(com.tencent.mm.game.report.g.f68196b);
        a17.q(com.tencent.mm.game.report.g.f68197c);
        a17.k();
    }

    public final void e(long j17, long j18, long j19, long j27, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct a17 = a(13L, 1308L, j17, j18, 0L, j19, j27);
        a17.q(com.tencent.mm.game.report.g.f68197c);
        a17.p(com.tencent.mm.game.report.g.f68196b);
        a17.f58333p = a17.b("Username", str, true);
        a17.f58335r = a17.b("ExternInfo", a17.f58335r, true);
        a17.k();
    }

    public final void f(long j17, long j18, long j19, long j27, long j28, long j29, java.lang.String str, long j37, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String str4 = str3;
        com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct a17 = a(13L, j17, j18, j19, j27, j28, j29);
        a17.q(str);
        a17.p(com.tencent.mm.game.report.g.f68196b);
        a17.f58330m = j37;
        a17.f58333p = a17.b("Username", str2, true);
        java.lang.String str5 = com.tencent.mm.game.report.g.f68199e;
        if (!(str5 == null || str5.length() == 0)) {
            if (str4 == null || str3.length() == 0) {
                str4 = com.tencent.mm.game.report.g.f68199e;
            } else {
                try {
                    org.json.JSONObject[] jSONObjectArr = {new org.json.JSONObject(str4), new org.json.JSONObject(com.tencent.mm.game.report.g.f68199e)};
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    for (int i18 = 0; i18 < 2; i18++) {
                        org.json.JSONObject jSONObject2 = jSONObjectArr[i18];
                        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            jSONObject.put(next, jSONObject2.get(next));
                        }
                    }
                    str4 = jSONObject.toString();
                } catch (org.json.JSONException unused) {
                }
            }
        }
        a17.f58335r = a17.b("ExternInfo", str4 != null ? java.net.URLEncoder.encode(str4) : null, true);
        a17.f58337t = i17;
        a17.k();
    }

    public final void g(long j17, long j18, long j19, long j27, long j28, java.lang.String str, long j29, int i17) {
        j(this, j17, j18, j19, j27, j28, str, j29, i17, null, 256, null);
    }

    public final void h(long j17, long j18, long j19, long j27, long j28, java.lang.String str, long j29, int i17, java.lang.String reportJsonStr) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(reportJsonStr, "reportJsonStr");
        com.tencent.mm.autogen.events.GetCurrentChannelEvent getCurrentChannelEvent = new com.tencent.mm.autogen.events.GetCurrentChannelEvent();
        getCurrentChannelEvent.e();
        try {
            jSONObject = new org.json.JSONObject(reportJsonStr);
        } catch (java.lang.Exception unused) {
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("belongingtab", i17);
        f(1304L, j17, j18, j29, j19, j27, com.tencent.mm.game.report.g.f68197c, j28, str, jSONObject.toString(), getCurrentChannelEvent.f54389g.f7710a);
    }

    public final void k(long j17, long j18, long j19, long j27, long j28, long j29, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct a17 = a(10L, j17, j18, j19, j27, j28, j29);
        a17.q(str);
        a17.p(str2);
        a17.f58335r = a17.b("ExternInfo", str3 != null ? java.net.URLEncoder.encode(str3) : null, true);
        a17.k();
    }

    public final void l(long j17, long j18, long j19, long j27, java.lang.String str) {
        i(this, 1302L, j17, j18, 0L, j19, j27, com.tencent.mm.game.report.g.f68197c, 0L, str, "", 0, 1024, null);
    }

    public final void m(long j17, long j18, long j19, long j27, long j28) {
        n(j17, j18, j19, j27, j28, "{}");
    }

    public final void n(long j17, long j18, long j19, long j27, long j28, java.lang.String str) {
        com.tencent.mm.autogen.events.GetCurrentChannelEvent getCurrentChannelEvent = new com.tencent.mm.autogen.events.GetCurrentChannelEvent();
        getCurrentChannelEvent.e();
        f(1311L, j17, j18, j19, j27, j28, com.tencent.mm.game.report.g.f68197c, 0L, "", str, getCurrentChannelEvent.f54389g.f7710a);
    }

    public final void o(long j17, long j18, long j19, long j27, int i17) {
        java.lang.String str = com.tencent.mm.game.report.g.f68197c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("belongingtab", i17);
        i(this, 1318L, j17, j18, 0L, j19, j27, str, 0L, "", jSONObject.toString(), 0, 1024, null);
    }

    public final void p(long j17, long j18, long j19, long j27, long j28) {
        f(1323L, j17, j18, j19, j27, j28, com.tencent.mm.game.report.g.f68197c, 0L, "", "", 0);
    }
}

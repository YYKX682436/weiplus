package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct a(long j17, long j18, long j19, long j27, long j28) {
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
        gameLifeSessionStruct.f58340d = j17;
        gameLifeSessionStruct.f58341e = j18;
        gameLifeSessionStruct.f58342f = j19;
        gameLifeSessionStruct.f58343g = j27;
        gameLifeSessionStruct.f58344h = j28;
        return gameLifeSessionStruct;
    }

    public final void b(java.lang.String sessionId, long j17, java.lang.String fromUsername, long j18, java.lang.String toUsername, long j19, long j27) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct a17 = a(3L, 302L, 3L, j19, 301L);
        a17.f58352p = a17.b("SessionId", sessionId, true);
        a17.f58347k = j17;
        a17.f58348l = a17.b("from_username", fromUsername, true);
        a17.f58349m = j18;
        a17.f58350n = a17.b("to_username", toUsername, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ser_name", j27);
        a17.p(java.net.URLEncoder.encode(jSONObject.toString()));
        a17.k();
    }

    public final void c(int i17, long j17, java.lang.String sessionId, long j18, java.lang.String fromUsername, long j19, java.lang.String toUsername, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct a17 = a(3L, 301L, i17, j17, 301L);
        a17.f58352p = a17.b("SessionId", sessionId, true);
        a17.f58347k = j18;
        a17.f58348l = a17.b("from_username", fromUsername, true);
        a17.f58349m = j19;
        a17.f58350n = a17.b("to_username", toUsername, true);
        a17.f58346j = a17.b("ActionStatus", str, true);
        a17.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if ((r18.length() > 0) == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 0
            if (r0 == 0) goto L12
            int r2 = r18.length()
            r3 = 1
            if (r2 <= 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 != r3) goto L12
            goto L13
        L12:
            r3 = r1
        L13:
            r4 = 0
            java.lang.String r2 = ""
            if (r3 == 0) goto L40
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "ssid"
            long r4 = r3.optLong(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "ExternInfo"
            java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = java.net.URLEncoder.encode(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "encode(...)"
            kotlin.jvm.internal.o.f(r0, r3)     // Catch: java.lang.Throwable -> L36
            r2 = r0
            goto L40
        L36:
            r0 = move-exception
            java.lang.String r3 = "reportWAGameJumpToConversation invalid json"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r6 = "Report.Kv20488"
            com.tencent.mars.xlog.Log.printErrStackTrace(r6, r0, r3, r1)
        L40:
            r7 = 3
            r9 = 0
            r11 = 0
            r13 = 1
            r15 = 0
            r6 = r17
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct r0 = r6.a(r7, r9, r11, r13, r15)
            r0.f58354r = r4
            r0.p(r2)
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.game.report.d.d(java.lang.String):void");
    }

    public final void e(int i17, long j17, int i18, java.lang.String sessionId, long j18, java.lang.String fromUsername, long j19, java.lang.String toUsername, long j27, long j28, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        f(i17, j17, i18, sessionId, j18, fromUsername, j19, toUsername, j27, j28, str, null);
    }

    public final void f(int i17, long j17, int i18, java.lang.String sessionId, long j18, java.lang.String fromUsername, long j19, java.lang.String toUsername, long j27, long j28, java.lang.String str, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct a17 = a(2L, 202L, i17, j17, j28);
        a17.f58351o = i18;
        a17.f58352p = a17.b("SessionId", sessionId, true);
        a17.f58347k = j18;
        a17.f58348l = a17.b("from_username", fromUsername, true);
        a17.f58349m = j19;
        a17.f58350n = a17.b("to_username", toUsername, true);
        a17.f58346j = a17.b("ActionStatus", str, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("session_type", j27);
        if (num != null) {
            jSONObject.put("unreadnum", num.intValue());
        }
        a17.p(java.net.URLEncoder.encode(jSONObject.toString()));
        a17.n();
        a17.k();
    }

    public final void h(int i17, int i18, java.lang.String tabKey, int i19, long j17) {
        kotlin.jvm.internal.o.g(tabKey, "tabKey");
        com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct a17 = a(1L, 101L, i17, 1L, j17);
        a17.f58351o = i18;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("red_dot", i19);
        jSONObject.put("tab_key", tabKey);
        a17.p(java.net.URLEncoder.encode(jSONObject.toString()));
        a17.k();
    }
}

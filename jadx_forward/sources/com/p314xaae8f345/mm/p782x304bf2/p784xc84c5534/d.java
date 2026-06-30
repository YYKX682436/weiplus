package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534;

/* loaded from: classes8.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d a(long j17, long j18, long j19, long j27, long j28) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
        c6633xea2e527d.f139873d = j17;
        c6633xea2e527d.f139874e = j18;
        c6633xea2e527d.f139875f = j19;
        c6633xea2e527d.f139876g = j27;
        c6633xea2e527d.f139877h = j28;
        return c6633xea2e527d;
    }

    public final void b(java.lang.String sessionId, long j17, java.lang.String fromUsername, long j18, java.lang.String toUsername, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d a17 = a(3L, 302L, 3L, j19, 301L);
        a17.f139885p = a17.b("SessionId", sessionId, true);
        a17.f139880k = j17;
        a17.f139881l = a17.b("from_username", fromUsername, true);
        a17.f139882m = j18;
        a17.f139883n = a17.b("to_username", toUsername, true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ser_name", j27);
        a17.p(java.net.URLEncoder.encode(jSONObject.toString()));
        a17.k();
    }

    public final void c(int i17, long j17, java.lang.String sessionId, long j18, java.lang.String fromUsername, long j19, java.lang.String toUsername, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d a17 = a(3L, 301L, i17, j17, 301L);
        a17.f139885p = a17.b("SessionId", sessionId, true);
        a17.f139880k = j18;
        a17.f139881l = a17.b("from_username", fromUsername, true);
        a17.f139882m = j19;
        a17.f139883n = a17.b("to_username", toUsername, true);
        a17.f139879j = a17.b("ActionStatus", str, true);
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)     // Catch: java.lang.Throwable -> L36
            r2 = r0
            goto L40
        L36:
            r0 = move-exception
            java.lang.String r3 = "reportWAGameJumpToConversation invalid json"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r6 = "Report.Kv20488"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r0, r3, r1)
        L40:
            r7 = 3
            r9 = 0
            r11 = 0
            r13 = 1
            r15 = 0
            r6 = r17
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct r0 = r6.a(r7, r9, r11, r13, r15)
            r0.f139887r = r4
            r0.p(r2)
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d.d(java.lang.String):void");
    }

    public final void e(int i17, long j17, int i18, java.lang.String sessionId, long j18, java.lang.String fromUsername, long j19, java.lang.String toUsername, long j27, long j28, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        f(i17, j17, i18, sessionId, j18, fromUsername, j19, toUsername, j27, j28, str, null);
    }

    public final void f(int i17, long j17, int i18, java.lang.String sessionId, long j18, java.lang.String fromUsername, long j19, java.lang.String toUsername, long j27, long j28, java.lang.String str, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d a17 = a(2L, 202L, i17, j17, j28);
        a17.f139884o = i18;
        a17.f139885p = a17.b("SessionId", sessionId, true);
        a17.f139880k = j18;
        a17.f139881l = a17.b("from_username", fromUsername, true);
        a17.f139882m = j19;
        a17.f139883n = a17.b("to_username", toUsername, true);
        a17.f139879j = a17.b("ActionStatus", str, true);
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabKey, "tabKey");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d a17 = a(1L, 101L, i17, 1L, j17);
        a17.f139884o = i18;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("red_dot", i19);
        jSONObject.put("tab_key", tabKey);
        a17.p(java.net.URLEncoder.encode(jSONObject.toString()));
        a17.k();
    }
}

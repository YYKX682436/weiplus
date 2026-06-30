package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 f206502a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6();

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var, r45.qt2 qt2Var, java.lang.String eid, int i17, org.json.JSONObject jSONObject, boolean z17, java.lang.String str, int i18, java.lang.Object obj) {
        java.lang.String Ri;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        java.lang.String jSONObject2;
        org.json.JSONObject jSONObject3 = (i18 & 8) != 0 ? null : jSONObject;
        boolean z18 = (i18 & 16) != 0 ? false : z17;
        java.lang.String sessionBuffer = (i18 & 32) != 0 ? "" : str;
        b6Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        b6Var.a(qt2Var, jSONObject3);
        java.lang.String t17 = (jSONObject3 == null || (jSONObject2 = jSONObject3.toString()) == null) ? "" : r26.i0.t(jSONObject2, ",", ";", false);
        if ((qt2Var == null || (Ri = qt2Var.m75945x2fec8307(0)) == null) && (Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri()) == null) {
            Ri = "";
        }
        if (qt2Var == null || (str2 = qt2Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        int m75939xb282bd08 = qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0;
        if (qt2Var == null || (str3 = qt2Var.m75945x2fec8307(2)) == null) {
            str3 = "";
        }
        int m75939xb282bd082 = qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0;
        java.lang.String str4 = (qt2Var == null || (m75945x2fec8307 = qt2Var.m75945x2fec8307(16)) == null) ? "" : m75945x2fec8307;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("report21875", "report 21875 sessionId:" + Ri + ", contextId:" + str2 + ", commentScene:" + m75939xb282bd08 + ", eventCode:" + i17 + ", eid:" + eid + ", udf_kv:" + t17 + ", clickTabContextId:" + str3 + " jumpId=" + str4);
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(21875, Ri, str2, java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), eid, t17, str3, java.lang.Integer.valueOf(m75939xb282bd082), str4, sessionBuffer);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, Ri, str2, java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Integer.valueOf(i17), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), eid, t17, str3, java.lang.Integer.valueOf(m75939xb282bd082), str4, sessionBuffer);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r5 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.qt2 r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            java.lang.String r0 = "enter_page_type"
            if (r5 == 0) goto Lc
            r1 = 11
            java.lang.String r5 = r5.m75945x2fec8307(r1)     // Catch: java.lang.Exception -> L3c
            if (r5 != 0) goto Le
        Lc:
            java.lang.String r5 = ""
        Le:
            int r1 = r5.length()     // Catch: java.lang.Exception -> L3c
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L21
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r1.<init>(r5)     // Catch: java.lang.Exception -> L3c
            goto L26
        L21:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
        L26:
            java.lang.String r5 = r1.optString(r0)     // Catch: java.lang.Exception -> L3c
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)     // Catch: java.lang.Exception -> L3c
            int r1 = r5.length()     // Catch: java.lang.Exception -> L3c
            if (r1 <= 0) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            if (r2 == 0) goto L3c
            if (r6 == 0) goto L3c
            r6.put(r0, r5)     // Catch: java.lang.Exception -> L3c
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.a(r45.qt2, org.json.JSONObject):void");
    }

    public final void b(r45.qt2 qt2Var, java.lang.String action, boolean z17, long j17, org.json.JSONObject jSONObject, java.lang.String sessionBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        if (qt2Var != null) {
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            jSONObject.put("feedid", b52.b.q(j17));
            f206502a.a(qt2Var, jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("report21875", "report 21875 sessionId:" + qt2Var.m75945x2fec8307(0) + ", contextId:" + qt2Var.m75945x2fec8307(1) + ", commentScene:" + qt2Var.m75939xb282bd08(5) + ", expose:" + z17 + ", eid:" + action + ", udf_kv:" + t17 + ", clickTabContextId:" + qt2Var.m75945x2fec8307(2) + ", sessionBuffer:" + sessionBuffer);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, qt2Var.m75945x2fec8307(0), qt2Var.m75945x2fec8307(1), java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)), java.lang.Integer.valueOf(!z17 ? 1 : 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), action, t17, qt2Var.m75945x2fec8307(2), java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(7)), qt2Var.m75945x2fec8307(16), sessionBuffer);
        }
    }

    public final void c(r45.qt2 qt2Var, java.lang.String action, boolean z17, org.json.JSONObject udfKv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        if (qt2Var != null) {
            f206502a.a(qt2Var, udfKv);
            java.lang.String jSONObject = udfKv.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject, ",", ";", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("report21875", "report 21875 sessionId:" + qt2Var.m75945x2fec8307(0) + ", contextId:" + qt2Var.m75945x2fec8307(1) + ", commentScene:" + qt2Var.m75939xb282bd08(5) + ", isClick:" + z17 + ", eid:" + action + ", udf_kv:" + t17 + ", clickTabContextId:" + qt2Var.m75945x2fec8307(2) + " jumpId:" + qt2Var.m75945x2fec8307(16));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21875, qt2Var.m75945x2fec8307(0), qt2Var.m75945x2fec8307(1), java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)), java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), action, t17, qt2Var.m75945x2fec8307(2), java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(7)), qt2Var.m75945x2fec8307(16));
        }
    }
}

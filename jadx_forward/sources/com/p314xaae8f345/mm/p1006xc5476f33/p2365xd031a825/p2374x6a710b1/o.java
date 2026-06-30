package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.o f262486a = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.o();

    public final java.util.HashMap a(r45.q74 q74Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (q74Var == null) {
            return hashMap;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = q74Var.f465267d;
            boolean z17 = true;
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, str);
                }
            }
            java.lang.String str2 = q74Var.f465268e;
            if (str2 != null) {
                if (!(str2.length() > 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
                }
            }
            java.lang.String str3 = q74Var.f465270g;
            if (str3 != null) {
                if (str3.length() <= 0) {
                    z17 = false;
                }
                java.lang.String str4 = z17 ? str3 : null;
                if (str4 != null) {
                    jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13304x269401dc, str4);
                }
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            hashMap.put("LiteAppOpenInfo", r26.i0.t(jSONObject2, ",", "\";\"", false));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("KindaReporterUtils", e17, "[KindaReport] buildLiteAppOpenInfoExtMap error", new java.lang.Object[0]);
        }
        return hashMap;
    }
}

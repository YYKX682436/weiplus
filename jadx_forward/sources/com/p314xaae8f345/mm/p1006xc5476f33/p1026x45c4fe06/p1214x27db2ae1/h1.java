package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.h1 f172260a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.h1();

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 a(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12742xf840dea5 c12742xf840dea5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12742xf840dea5(null, 1, null);
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.a(c12742xf840dea5);
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j2.b(c12742xf840dea5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        int mo49191x1c82a56c = c12742xf840dea5.f172191d.mo49191x1c82a56c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 l3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3.f172306i;
        java.lang.String optString = jSONObject.optString("snapshotPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        long optLong = jSONObject.optLong("snapshotLastModified", 0L);
        long optLong2 = jSONObject.optLong("snapshotLength", 0L);
        java.lang.String optString2 = jSONObject.optString("snapshotBaseConfig", "{}");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("snapshotMetaInfo");
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        java.lang.String optString3 = jSONObject.optString("snapshotNodeConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80(0, a17, b17, mo49191x1c82a56c, l3Var, optString, optLong, optLong2, optString2, optJSONObject, true, optString3, 0, 0, 0, 28673, null);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 b() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NodeOnlySnapshotInfo#");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.f172353d;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.f172353d);
        java.lang.String string = a17.getString(sb6.toString(), null);
        if (string == null) {
            return null;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a(new org.json.JSONObject(string)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
    }
}

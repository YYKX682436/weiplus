package x44;

/* loaded from: classes4.dex */
public final class j2 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String a17 = a54.h.a(env.b());
        java.lang.String optString = data.optString("phoneNumber");
        long optLong = data.optLong("appointmentId");
        int optInt = data.optInt("opType");
        if (optLong <= 0 || optInt > 2 || optInt < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.Appointment", "the op type is invalid or appointmentId is 0");
            b(g("the appointmentId is 0"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
            return;
        }
        if (f()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            p(a17, optLong, optInt, optString, new x44.g2(this));
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("uxInfo", a17);
            bundle.putString("phone", optString);
            bundle.putInt("opType", optInt);
            bundle.putLong("appointmentId", optLong);
            i(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }

    @Override // w44.d
    public void n(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        q(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "error", -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "opType", -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "status", -1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }

    @Override // w44.d
    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        java.lang.String k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "uxInfo");
        java.lang.String str = k17 == null ? "" : k17;
        long h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.h(bundle, "appointmentId", 0L);
        java.lang.String k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.k(bundle, "phone");
        p(str, h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(bundle, "opType", 0), k18 == null ? "" : k18, new x44.i2(bVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        return null;
    }

    public final void p(java.lang.String str, long j17, int i17, java.lang.String str2, yz5.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeAppointment", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        gm0.j1.n().f354821b.g(new k64.o(str, j17, i17, str2));
        gm0.j1.n().f354821b.a(5159, new x44.h2(qVar, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeAppointment", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }

    public final void q(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        if (i17 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", i19);
            jSONObject.put("opType", i18);
            m(jSONObject);
            b(jSONObject);
        } else {
            b(w44.d.k(this, -1, "make appointment failed!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
    }
}

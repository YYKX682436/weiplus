package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes.dex */
public final class h extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.h f268162d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.h();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String mo120156xb5887639;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "JsApiRequestMedicalInsurancePay data:" + msg.f422323a);
        zg0.q2 a17 = env.a();
        if (a17 == null || (mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
            if (mo120156xb5887639 == null) {
                mo120156xb5887639 = "";
            }
        }
        zg0.q2 a18 = env.a();
        java.lang.String V = a18 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) a18).V(mo120156xb5887639) : "";
        java.lang.String jSONObject = new org.json.JSONObject(msg.f422323a).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalitebd687f90a5690a0e4fe5b08bfb273e90@pay");
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
        bundle.putString("query", jSONObject);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.WEB_VIEW;
        c3708xc1f46f80.f14312x721f2ec7 = V;
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        sVar.f225700d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.f(env, msg);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, bundle, true, false, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.g(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 494;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s1.f34653x24728b;
    }
}

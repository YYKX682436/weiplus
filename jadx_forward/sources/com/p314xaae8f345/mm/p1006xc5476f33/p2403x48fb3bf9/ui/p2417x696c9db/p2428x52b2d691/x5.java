package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class x5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x5 f268188d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x5();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String mo120156xb5887639;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateBackToSourceAppForWXPay", "handleMsg");
        java.util.Map map = msg.f422323a;
        if (map != null && map.isEmpty()) {
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail invalid param", null);
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Object obj = msg.f422323a.get("appId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        bundle.putString("appId", str);
        java.lang.Object obj2 = msg.f422323a.get("nonceStr");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("nonce_str", str2);
        java.lang.Object obj3 = msg.f422323a.get("timeStamp");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString("timeStamp", str3);
        java.lang.Object obj4 = msg.f422323a.get("package");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str4 == null) {
            str4 = "";
        }
        bundle.putString("package", str4);
        java.lang.Object obj5 = msg.f422323a.get("signType");
        java.lang.String str5 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str5 == null) {
            str5 = "";
        }
        bundle.putString("signType", str5);
        java.lang.Object obj6 = msg.f422323a.get("paySign");
        java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str6 == null) {
            str6 = "";
        }
        bundle.putString("paySign", str6);
        bundle.putString("jsapiName", "navigateBackToSourceAppForWXPay");
        bundle.putInt("jsapi_type", 0);
        bundle.putInt("sourceType", 1);
        zg0.q2 a17 = env.a();
        if (a17 == null || (mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
            if (mo120156xb5887639 == null) {
                mo120156xb5887639 = "";
            }
        }
        bundle.putString("stepInURL", mo120156xb5887639);
        java.lang.Object obj7 = msg.f422323a.get("sourceDeeplink");
        java.lang.String str7 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
        if (str7 == null) {
            str7 = "";
        }
        bundle.putString("sourceDeeplink", str7);
        java.lang.Object obj8 = msg.f422323a.get("returnUrl");
        java.lang.String str8 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
        bundle.putString("returnUrl", str8 != null ? str8 : "");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3170x59c587e3.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w5(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4.f34497x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "navigateBackToSourceAppForWXPay";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class r2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r2 f268009d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWxPayTestInfo", "handleMsg() MMApplicationContext.getContext() get a null context!");
            return false;
        }
        int i17 = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("pay_uat_test_environment_id", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWxPayTestInfo", "getWxPayTestInfo envId=" + i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("envId", java.lang.String.valueOf(i17));
        env.f422396d.e(msg.f422546c, "getWxPayTestInfo:ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 28;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getWxPayTestInfo";
    }
}

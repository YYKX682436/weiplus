package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class b1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b1 f266474d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f266475e;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b1 b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b1();
        f266474d = b1Var;
        f266475e = cf.b.a(b1Var);
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestKidsPayRechargePayment", "handled, params: " + msg.f422323a);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", (java.lang.String) msg.f422323a.get("appId"));
        bundle.putString("timeStamp", (java.lang.String) msg.f422323a.get("timeStamp"));
        bundle.putString("package", (java.lang.String) msg.f422323a.get("package"));
        bundle.putString("nonceStr", (java.lang.String) msg.f422323a.get("nonceStr"));
        bundle.putString("paySign", (java.lang.String) msg.f422323a.get("paySign"));
        bundle.putString("signType", (java.lang.String) msg.f422323a.get("signType"));
        bundle.putString("webViewUrl", (java.lang.String) msg.f422323a.get("url"));
        bundle.putString("jsapiName", "requestKidsPayRechargePayment");
        nf.g.a(env.f422393a).f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.a1(msg, env));
        j45.l.n(env.f422393a, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new android.content.Intent().putExtras(bundle), f266475e);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "requestKidsPayRechargePayment";
    }
}

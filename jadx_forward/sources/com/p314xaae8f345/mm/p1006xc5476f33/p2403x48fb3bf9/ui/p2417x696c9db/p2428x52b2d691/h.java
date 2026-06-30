package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class h extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h f267744d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f267745e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f267746f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f267747g;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h();
        f267744d = hVar;
        f267745e = cf.b.a(hVar);
        f267746f = 471;
        f267747g = "requestHKCashier";
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("MicroMsg.JSApiRequestHKCashier", "start handle msg");
        if (msg.f422323a.isEmpty()) {
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail_missing arguments", null);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", (java.lang.String) msg.f422323a.get("appId"));
        intent.putExtra("timeStamp", (java.lang.String) msg.f422323a.get("timeStamp"));
        intent.putExtra("nonceStr", (java.lang.String) msg.f422323a.get("nonceStr"));
        intent.putExtra("packageExt", (java.lang.String) msg.f422323a.get("package"));
        intent.putExtra("signtype", (java.lang.String) msg.f422323a.get("signType"));
        intent.putExtra("paySignature", (java.lang.String) msg.f422323a.get("paySign"));
        zg0.q2 a17 = env.a();
        if (a17 == null || (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            java.lang.String mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
            str = mo120156xb5887639 == null ? "" : mo120156xb5887639;
        }
        intent.putExtra("url", str);
        intent.putExtra("source_type", 1);
        intent.putExtra("intent_jump_ui", "requestHKCashier");
        android.content.Context context = env.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".plugin.wallet.ui.WalletJsApiAdapterUI", intent, f267745e, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f267746f;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f267747g;
    }
}

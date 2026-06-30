package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class s1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s1 f268041d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f268042e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f268043f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f268044g;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s1();
        f268041d = s1Var;
        f268042e = cf.b.a(s1Var);
        f268043f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
        f268044g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34651x24728b;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswd", "handle msg", new java.lang.Object[0]);
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
        intent.putExtra("intent_jump_ui", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34651x24728b);
        android.content.Context context = env.f422393a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".plugin.wallet.ui.WalletJsApiAdapterUI", intent, f268042e, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r1(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f268043f;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f268044g;
    }
}

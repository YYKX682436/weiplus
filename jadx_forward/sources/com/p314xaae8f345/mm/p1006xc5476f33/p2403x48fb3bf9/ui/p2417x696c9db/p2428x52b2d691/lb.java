package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class lb extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.lb f267878d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.lb();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f267879e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f267880f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestVertifyPwd", "JsApiRequestVerifyPwd");
        f267879e = env;
        f267880f = msg;
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(this);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(env.f422393a, "com.tencent.mm.plugin.account.ui.VerifyPwdUI");
        intent.putExtra("key_scenen", 0);
        android.content.Context context2 = env.f422393a;
        if (!(context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).startActivityForResult(intent, 208);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 398;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "verifiyWXPassword";
    }

    public final void e(nw4.k kVar, nw4.y2 y2Var, int i17, java.util.Map map) {
        if (kVar == null || y2Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_code", java.lang.Integer.valueOf(i17));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        java.lang.String str = i17 == 0 ? "ok" : "unknown error";
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ':' + str, linkedHashMap);
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null || i17 != 208) {
            e(f267879e, f267880f, -1, null);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_ticket");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("ticket", stringExtra);
        hashMap.put("sucessful", "true");
        e(f267879e, f267880f, 0, hashMap);
    }
}

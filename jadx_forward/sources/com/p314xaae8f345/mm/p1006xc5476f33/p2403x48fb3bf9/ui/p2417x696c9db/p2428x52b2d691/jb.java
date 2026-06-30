package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public abstract class jb extends qw4.a implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public volatile nw4.k f267821d;

    /* renamed from: e, reason: collision with root package name */
    public volatile nw4.y2 f267822e;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f267821d = env;
        this.f267822e = msg;
        android.content.Context context = env.f422393a;
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(g(), "context is not MMActivity");
            env.f422396d.e(msg.f422546c, c() + ":fail", null);
            this.f267821d = null;
            this.f267822e = null;
            return true;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(this);
        java.lang.Object obj = msg.f422323a.get("verify_id");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("verify_id", str);
        jSONObject.put("version", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.Object obj2 = msg.f422323a.get("appId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("k_need_signature", true);
        bundle.putString("k_user_name", c01.z1.b());
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        bundle.putBoolean("needVideo", f());
        bundle.putBoolean("is_check_dyncfg", false);
        bundle.putString("key_function_name", c());
        bundle.putInt("key_business_type", 1);
        bundle.putString("appId", str3);
        bundle.putString("request_verify_pre_info", jSONObject2);
        bundle.putInt("check_alive_type", 4);
        bundle.putBoolean("key_is_need_confirm_page", true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5928xb1bcc367 c5928xb1bcc367 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5928xb1bcc367();
        am.or orVar = c5928xb1bcc367.f136232g;
        orVar.f89106a = context;
        orVar.f89108c = e();
        c5928xb1bcc367.f136232g.f89107b = bundle;
        c5928xb1bcc367.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g(), "start face detect event result: %b", java.lang.Boolean.valueOf(c5928xb1bcc367.f136233h.f89187a));
        if (!c5928xb1bcc367.f136233h.f89187a) {
            abstractActivityC21394xb3d2c0cf.m78545xde66c1f2(null);
            env.f422396d.e(msg.f422546c, c() + ":fail", nw4.a.a(c5928xb1bcc367.f136233h.f89188b));
            this.f267821d = null;
            this.f267822e = null;
        }
        return true;
    }

    public abstract int e();

    public abstract boolean f();

    public abstract java.lang.String g();

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        nw4.g gVar;
        if (i17 != e()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g(), "onActivityResult requestCode: " + i17 + ", resultCode: " + i18);
        if (i18 == -1) {
            str = c() + ":ok";
        } else if (i18 != 0) {
            str = c() + ":fail";
        } else {
            str = c() + ":cancel";
        }
        nw4.k kVar = this.f267821d;
        if (kVar != null && (gVar = kVar.f422396d) != null) {
            nw4.y2 y2Var = this.f267822e;
            gVar.e(y2Var != null ? y2Var.f422546c : null, str, nw4.a.a(intent != null ? intent.getExtras() : null));
        }
        this.f267821d = null;
        this.f267822e = null;
    }
}

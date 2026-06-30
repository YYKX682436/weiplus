package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class r6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r6 f268016d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r6();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f268017e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f268018f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f268019g;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        f268017e = env;
        f268018f = msg;
        java.lang.String str = (java.lang.String) msg.f422323a.get("extInfo");
        if (str == null || str.length() == 0) {
            e(1, "extInfo empty");
            return true;
        }
        java.lang.Object obj = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.Integer valueOf = obj instanceof java.lang.String ? java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj)) : obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = valueOf != null ? valueOf.intValue() : 3;
        zg0.q2 a17 = env.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
        byte[] a07 = r0Var != null ? r0Var.a0() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("url");
        java.lang.String optString2 = jSONObject.optString("finder_context", "");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("dismissSelf"), "true");
        f268019g = b17;
        boolean z17 = (intValue == 3 && b17) || intValue == 4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat scene: %s, extInfo: %s, dismissWebView: %s, needShowErrToast: %s", java.lang.Integer.valueOf(intValue), str, java.lang.Boolean.valueOf(f268019g), java.lang.Boolean.valueOf(z17));
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat url invalid");
            e(1, "url empty");
        } else {
            boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("halfScreen"), "true");
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
            c11207x71c7a1c1.f153805d = env.f422393a;
            c11207x71c7a1c1.f153807f = intValue;
            r45.s4 s4Var = new r45.s4();
            s4Var.f467019d = optString;
            s4Var.f467020e = optString;
            c11207x71c7a1c1.f153810i = s4Var;
            c11207x71c7a1c1.f153809h = b18 ? 1 : j41.f0.a(c11207x71c7a1c1.f153807f);
            c11207x71c7a1c1.f153814p = z17;
            c11207x71c7a1c1.f153815q = c11207x71c7a1c1.f153805d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hez);
            c11207x71c7a1c1.f153823y = optString2;
            android.content.Intent intent = new android.content.Intent();
            c11207x71c7a1c1.f153821w = intent;
            android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77777x504cd8a2, "createFreeHandler(...)");
            intent.putExtra("key_result_receiver", new com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29.ResultReceiverC11209x6faff39d(m77777x504cd8a2, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.q6()));
            c11207x71c7a1c1.f153821w.putExtra("key_spam_context", a07);
            j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
            if (zVar != null) {
                ((l41.g2) zVar).Bi(c11207x71c7a1c1);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 412;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openCustomerServiceChat";
    }

    public final void e(int i17, java.lang.String str) {
        nw4.g gVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_code", java.lang.Integer.valueOf(i17));
        nw4.k kVar = f268017e;
        if (kVar != null && (gVar = kVar.f422396d) != null) {
            nw4.y2 y2Var = f268018f;
            java.lang.String str2 = y2Var != null ? y2Var.f422546c : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            nw4.y2 y2Var2 = f268018f;
            sb6.append(y2Var2 != null ? y2Var2.f422552i : null);
            sb6.append(':');
            sb6.append(str);
            gVar.e(str2, sb6.toString(), hashMap);
        }
        nw4.k kVar2 = f268017e;
        android.content.Context context = kVar2 != null ? kVar2.f422393a : null;
        if (f268019g && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        f268017e = null;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class sd extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sd f268064d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sd();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("dataUrl");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = ((java.util.HashMap) msg.f422323a).get("dismissSelf");
        boolean parseBoolean = java.lang.Boolean.parseBoolean(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null);
        zg0.q2 a17 = env.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
        byte[] a07 = r0Var != null ? r0Var.a0() : null;
        java.lang.Object obj3 = ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        if (obj3 instanceof java.lang.String) {
            java.lang.Integer h17 = r26.h0.h((java.lang.String) obj3);
            if (h17 != null) {
                intValue = h17.intValue();
            }
            intValue = 2;
        } else {
            if (obj3 instanceof java.lang.Integer) {
                intValue = ((java.lang.Number) obj3).intValue();
            }
            intValue = 2;
        }
        int i17 = intValue;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("bizInfo");
        java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.HashMap) msg.f422323a).get("halfScreen"), "true");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowOpenIMContactProfile", "showOpenIMContactProfile scene: " + i17 + ", bizInfo: " + str3 + ", isHalfScreen: " + b17);
        java.util.Objects.toString(msg.f422323a);
        if (!(str == null || r26.n0.N(str))) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19461x92bab2c6(str, a07, i17, str3, b17), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.od.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.rd(env, msg, parseBoolean));
            return true;
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":fail_invalid_arguments", null);
        android.content.Context context = env.f422393a;
        if (parseBoolean && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.u.f34771x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showOpenIMContactProfile";
    }
}

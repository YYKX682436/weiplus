package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class fc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.fc f267626d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.fc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("fontSize");
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetFontSizeCallback", "doSetFontSizeCb, fontSize is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetFontSizeCallback", "doSetFontSizeCb, fontSize = " + str);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17 = env.b();
            if (b17 != null) {
                b17.W1(str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiSetFontSizeCallback", "setFontSizeCb, ex = " + e17.getMessage());
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setFontSizeCallback";
    }
}

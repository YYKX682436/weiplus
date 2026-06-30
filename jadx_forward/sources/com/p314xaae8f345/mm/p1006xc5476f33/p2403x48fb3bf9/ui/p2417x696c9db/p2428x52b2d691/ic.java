package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ic extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ic f267793d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ic();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("subTitle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetPageSubTitle", "handleMsg subTitle: " + str + " context valid: " + (env.f422393a instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf));
        android.content.Context context = env.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        nw4.g gVar = env.f422396d;
        if (z17) {
            if (str == null || r26.n0.N(str)) {
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo54449x3f86539a((java.lang.String) null);
            } else {
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo54449x3f86539a(str);
            }
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        } else {
            gVar.e(msg.f422546c, msg.f422552i + ":failed", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return uc1.o.f76896x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setPageSubTitle";
    }
}

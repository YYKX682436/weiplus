package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class xa extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.xa f268195d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.xa();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRecordOperateUserData", "msg:" + msg);
        try {
            java.lang.Object obj = msg.f422323a.get("datalist");
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str != null) {
                cf.f.b(new cl0.e(str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.wa.f268142d);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiRecordOperateUserData", e17, null, new java.lang.Object[0]);
        }
        env.f422396d.e(msg.f422546c, "recordOperateUserData:ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 445;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "recordOperateUserData";
    }
}

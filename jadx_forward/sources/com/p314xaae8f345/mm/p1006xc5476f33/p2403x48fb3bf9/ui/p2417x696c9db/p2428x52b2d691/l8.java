package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class l8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l8 f267875d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l8();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String Z;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "OpenGameDetail");
        if (msg.f422323a.get("appId") == null || msg.f422323a.get("promotionId") == null) {
            env.f422396d.e(msg.f422546c, msg.f422552i + ": fail expected input", null);
            return false;
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("appId");
        java.lang.String str3 = (java.lang.String) msg.f422323a.get("promotionId");
        zg0.q2 a17 = env.a();
        if (a17 == null || (Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            java.lang.String mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
            str = mo120156xb5887639 == null ? "" : mo120156xb5887639;
        } else {
            str = Z;
        }
        zg0.q2 a18 = env.a();
        java.lang.String V = a18 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) a18).V(str) : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s", str2, str3);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(env.f422393a, V, str, "webview", str2, str3, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k8(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 131;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openGameDetail";
    }
}

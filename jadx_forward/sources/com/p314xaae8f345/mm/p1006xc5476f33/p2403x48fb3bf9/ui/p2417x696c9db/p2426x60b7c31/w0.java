package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class w0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w0 f267021d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("appId");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        zg0.q2 a17 = env.a();
        java.lang.String i17 = a17 != null ? a17.i() : null;
        if (i17 == null) {
            i17 = "";
        }
        if (!(obj2 == null || obj2.length() == 0)) {
            if (r26.n0.B(i17, "appid=" + obj2, false)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5.class)).Eh(obj2, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.v0(env, msg));
                return true;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMsg with invalid params, rawUrl:");
        sb6.append(i17);
        sb6.append(", wxaAppId:");
        sb6.append(obj2);
        sb6.append(", binderId:");
        zg0.q2 a18 = env.a();
        sb6.append(a18 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a18).U() : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.JsApiRebaseWxappPubLibAndRestart", sb6.toString());
        java.lang.String str = msg.f422546c;
        if (obj2 == null) {
            obj2 = "";
        }
        env.f422396d.e(str, "rebaseWxappPubLibAndRestart:fail invalid appId:".concat(obj2), null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return kf1.i.f72437x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "rebaseWxappPubLibAndRestart";
    }
}

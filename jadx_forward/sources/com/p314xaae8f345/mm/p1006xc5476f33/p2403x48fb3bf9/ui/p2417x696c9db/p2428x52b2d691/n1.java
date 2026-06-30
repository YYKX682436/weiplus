package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class n1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n1 f267904d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = env.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
        hashMap.put("currentRequestId", java.lang.Integer.valueOf((r0Var == null || (O = r0Var.O()) == null) ? 0 : O.f264923j));
        java.lang.Object obj = env.f422393a;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.v0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.core.IWebViewJsApiStub");
            int intExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.v0) obj)).getIntent().getIntExtra("lastGetA8KeyRequestId", 0);
            if (intExtra != 0) {
                hashMap.put("lastRequestId", java.lang.Integer.valueOf(intExtra));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetContext", "privateGetContext currentRequestId=" + hashMap.get("currentRequestId") + ", lastRequestId=" + hashMap.get("lastRequestId"));
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33738x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "privateGetContext";
    }
}

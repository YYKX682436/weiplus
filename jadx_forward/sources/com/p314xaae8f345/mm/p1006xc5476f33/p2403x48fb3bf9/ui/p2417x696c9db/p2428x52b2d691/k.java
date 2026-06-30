package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes4.dex */
public final class k extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k f267825d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("url");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z17 = str2 == null || str2.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAppJoinGroup.", "url is null");
            gVar.e(msg.f422546c, "joinGroup:fail", null);
            return true;
        }
        if (gVar instanceof nw4.n) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            str = ((nw4.n) gVar).r(str2);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAppJoinGroup.", "appId is null");
            gVar.e(msg.f422546c, "joinGroup:fail", null);
            return true;
        }
        java.lang.Object obj2 = msg.f422323a.get("signature");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = msg.f422323a.get("groupId");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = msg.f422323a.get("nonceStr");
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        vg3.i3 i3Var = new vg3.i3();
        i3Var.f518245d = str;
        i3Var.f518248g = str3;
        i3Var.f518246e = str4;
        i3Var.f518247f = str5;
        ((hn.s) ((vg3.k3) i95.n0.c(vg3.k3.class))).Bi(env.f422393a, i3Var);
        gVar.e(msg.f422546c, "joinGroup:success", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 377;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t3.f34882x24728b;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ad extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ad f267482d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ad();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Context context = env.f422393a;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        nw4.g gVar = env.f422396d;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowBottomToast", "invoke, activity is null");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, activity is null!", null);
            return true;
        }
        java.lang.String str = (java.lang.String) msg.f422323a.get(dm.i4.f66865x76d1ec5a);
        java.lang.String str2 = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.String str3 = (java.lang.String) msg.f422323a.get("subtitle");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("clickable"), "true")) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(str2, str3, activity, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.zc(str, env), null);
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(str2, str3, activity, null, null);
            }
            return true;
        }
        gVar.e(msg.f422546c, msg.f422552i + ":fail, id or title is null!", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.g.f33895x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showBottomToast";
    }
}

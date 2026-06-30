package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class s0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s0 f268040d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("operationType");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj instanceof java.lang.String ? (java.lang.String) obj : null, "listenLater")) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object obj2 = msg.f422323a.get("item");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        int O = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O(msg.f422323a.get("sourceType"), 0);
        nw4.g gVar = env.f422396d;
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.h1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.k1.f267327c.b(new org.json.JSONObject(str), "", "", 1.0f, O, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r0(hashMap, env, msg));
                    if (b17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiDoOperateTingAudio", "add listenLater fail, parse item fail");
                    } else {
                        bw5.v70 d17 = b17.f267313a.d();
                        android.content.Context context = env.f422393a;
                        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                        if (d17 != null && activity != null) {
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.q0(b17, env, activity, d17));
                            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiDoOperateTingAudio", "activity or listenItem is empty");
                        gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiDoOperateTingAudio", "add listenLater fail, parse item exception:" + e17.getLocalizedMessage());
                }
                return true;
            }
        }
        gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60875xf35223e;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u1.f33828x24728b;
    }

    @Override // qw4.a
    public boolean d() {
        return true;
    }
}

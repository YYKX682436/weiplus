package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class z0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z0 f268229d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("md5");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = ((java.util.HashMap) msg.f422323a).get("opType");
        java.lang.Object obj3 = ((java.util.HashMap) msg.f422323a).get("emojiInfoBuf");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("emotionScene");
        java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
        if (num == null) {
            num = 9;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEmoticonSingleOperation", "handleMsg: md5:" + str + ", opType:" + obj2 + ", emojiInfoBuf:" + str2);
        nw4.g gVar = env.f422396d;
        if (str == null) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail_missing arguments", null);
            return true;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, "1")) {
            android.content.Context context = env.f422393a;
            int intValue = num.intValue();
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
            c4Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            c4Var.wi(context, str, str2, intValue, -1, false);
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        } else {
            gVar.e(msg.f422546c, msg.f422552i + ":fail_missing arguments", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 528;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "emoticonSingleOperation";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class l0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l0 f266774d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetRedPacketDone", "do get red packet done: " + msg.f422323a);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("shouldShowRedDot"), "1");
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("isNeedRefresh"), "1");
        boolean b19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("shouldOpenSelectSkinPage"), "1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetRedPacketDone", "isNeedRefresh: " + msg.f422323a.get("isNeedRefresh") + ", shouldShowRedDot: " + msg.f422323a.get("shouldShowRedDot") + ", shouldOpenSelectSkinPage: " + b19 + ", packageId: " + msg.f422323a.get("packetId"));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("shouldShowRedDot", b17);
        bundle.putBoolean("isNeedRefresh", b18);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j0.class);
        if (!b19) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.i0.class);
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.Object obj = msg.f422323a.get("packetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("packetId", (java.lang.String) obj);
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k0(env, msg));
        }
        j45.l.n(env.f422393a, "luckymoney", ".ui.LuckyMoneyPickEnvelopeUI", intent, 207);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 365;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getRedPacketDone";
    }
}

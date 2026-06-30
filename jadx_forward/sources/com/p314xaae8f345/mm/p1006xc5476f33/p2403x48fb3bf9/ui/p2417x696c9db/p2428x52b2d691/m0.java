package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class m0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m0 f267884d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDispatchLiteAppAction", "DispatchLiteAppAction");
        android.content.Context context = env.f422393a;
        java.lang.String str = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            str = intent.getStringExtra("liteAppSource");
        }
        if (str == null) {
            env.f422396d.a(msg, "expected appId");
            return false;
        }
        android.os.Bundle b17 = nw4.y2.b(msg.f422323a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        h73.e.d(b17, "sourceAppId", str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, b17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l0(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 473;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "dispatchLiteAppAction";
    }
}

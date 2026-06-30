package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class n extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n f267382d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String Z;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (env.f422395c != null) {
            zg0.q2 a17 = env.a();
            boolean z17 = false;
            if (a17 != null && (Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) != null && !hy4.i.p(Z)) {
                z17 = true;
            }
            if (z17) {
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("key_on_secure_video_action_is_live", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(msg.f422323a.get("isLiveStream"), "true"));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17 = env.b();
                    if (b17 != null) {
                        b17.i(121004, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportSecureAction", "reportSecureAction ex " + e17.getMessage());
                }
            }
        }
        env.f422396d.e(msg.f422546c, "reportSecureAction:ok", new java.util.HashMap());
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return -2;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reportSecureAction";
    }
}

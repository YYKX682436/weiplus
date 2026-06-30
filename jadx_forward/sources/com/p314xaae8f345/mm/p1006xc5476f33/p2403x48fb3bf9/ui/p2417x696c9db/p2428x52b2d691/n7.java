package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class n7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n7 f267908d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("finderUserName");
        java.lang.Object obj = msg.f422323a.get("memberInletSource");
        if (obj == null || (str = obj.toString()) == null) {
            str = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        if (str2 != null) {
            bundle.putString("key_author_finder_name", str2);
            bundle.putInt("key_member_inlet_source", P);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l7.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m7(env, msg));
            return true;
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":fail_missing arguments", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 487;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderMemberView";
    }
}

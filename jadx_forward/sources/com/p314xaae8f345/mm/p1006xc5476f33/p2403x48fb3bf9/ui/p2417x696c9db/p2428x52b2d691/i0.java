package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class i0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i0 f267775d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.content.Context context = env.f422393a;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context;
            if (viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("url");
                java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("brandName");
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("userName");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    bundle.putString("key_brand_name", str2);
                    bundle.putString("key_brand_user_name", str3);
                    bundle.putString("key_url", str);
                }
                bundle.putBoolean("key_current_info_show", true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2;
                ldVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ad(ldVar, bundle));
            }
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return yc1.q.f77527x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "currentMpInfoShow";
    }
}

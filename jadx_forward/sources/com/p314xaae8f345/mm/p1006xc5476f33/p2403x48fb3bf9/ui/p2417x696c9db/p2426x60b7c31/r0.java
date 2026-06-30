package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class r0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.r0 f266909d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.r0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("productId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z17 = str == null || str.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, "invokeMiniProgramAPI:fail empty productId", null);
        } else {
            qk.c0 c0Var = new qk.c0(str);
            c0Var.f445688a = 12;
            c0Var.f445731g = 12;
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                gVar.e(msg.f422546c, "invokeMiniProgramAPI:fail internal error", null);
                return true;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(env.f422393a, c0Var);
            gVar.e(msg.f422546c, "openStoreEmoticonDetailPage:ok", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60864x51861c8c;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openStoreEmoticonDetailPage";
    }
}

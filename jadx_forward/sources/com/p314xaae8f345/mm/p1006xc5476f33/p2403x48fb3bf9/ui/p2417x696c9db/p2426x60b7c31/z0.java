package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes4.dex */
public final class z0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.z0 f267110d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.z0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("miniProgramAppId");
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        boolean z17 = obj2 == null || obj2.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, "reportMiniProgramPageData:fail invalid appId", null);
        } else {
            km5.q g27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r5.class)).g2(obj2);
            nw4.n nVar = gVar instanceof nw4.n ? (nw4.n) gVar : null;
            java.lang.Object s17 = nVar != null ? nVar.s() : null;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = s17 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) s17 : null;
            if (activityC21401x6ce6f73f != null) {
                g27.f(activityC21401x6ce6f73f);
            }
            ((km5.q) g27.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x0(env, msg))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y0(env, msg));
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return nd1.f2.f72925x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reportMiniProgramPageData";
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class kc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.kc f267856d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.kc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        zg0.q2 a17 = env.a();
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) a17 : null;
        nw4.g gVar = env.f422396d;
        if (e3Var == null) {
            e(msg, gVar, "fail_invalid_state");
        } else {
            java.lang.Object obj2 = msg.f422323a.get("visualEffect");
            if (obj2 != null && (obj = obj2.toString()) != null) {
                str = r26.n0.u0(obj).toString();
            }
            if (str == null || str.length() == 0) {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
                e3Var.n1().b(false, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.qd.f268316e);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "hidden")) {
                e3Var.n1().b(true, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.qd.f268316e);
            } else {
                e(msg, gVar, "fail_invalid_arguments");
            }
            e(msg, gVar, "ok");
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 504;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setVisualEffectOnCapture";
    }

    public final void e(nw4.y2 y2Var, nw4.g gVar, java.lang.String str) {
        gVar.e(y2Var.f422546c, y2Var.f422552i + ':' + str, null);
    }
}

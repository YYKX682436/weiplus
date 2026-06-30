package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class fe extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.fe f267628d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.fe();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get("mask");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
        java.lang.Object obj2 = msg.f422323a.get("business");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        nw4.g gVar = env.f422396d;
        if (str == null) {
            gVar.e(msg.f422546c, "SimAuth:fail key[business] is null", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (D1 == 1) {
            h0Var.f391656d = js.d1.f382956d;
        } else {
            if (D1 != 2) {
                gVar.e(msg.f422546c, "SimAuth:fail key[mask] must be mask(1) or pure(2)", null);
                return true;
            }
            h0Var.f391656d = js.d1.f382957e;
        }
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.f515113a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ee(env, h0Var, str, msg, null), 2, null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "SimAuth";
    }
}

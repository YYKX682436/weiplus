package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes15.dex */
public final class ga extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ga f267651d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ga();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str2 = "";
        if (msg.f422547d.has("appId")) {
            str = msg.f422547d.optString("appId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "optString(...)");
        } else {
            str = "";
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        nw4.g gVar = env.f422396d;
        if (K0) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail appId is null", null);
            return true;
        }
        if (msg.f422547d.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f)) {
            str2 = msg.f422547d.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "optString(...)");
        }
        if (msg.f422547d.has("onlyUpdate") ? msg.f422547d.optBoolean("onlyUpdate") : false) {
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str) == null) {
                gVar.e(msg.f422546c, msg.f422552i + ":update success", null);
                return true;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(str, null);
            gVar.e(msg.f422546c, msg.f422552i + ":update success", null);
            return true;
        }
        if (msg.f422547d.has("onlyDownload") ? msg.f422547d.optBoolean("onlyDownload") : false) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(str, null);
            gVar.e(msg.f422546c, msg.f422552i + ":update success", null);
            return true;
        }
        if (msg.f422547d.has("onlyPreLoadBaseLib") ? msg.f422547d.optBoolean("onlyPreLoadBaseLib") : false) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(env.f422393a, str, str2, "updateBaseLibPath");
        } else {
            q80.e0 e0Var = new q80.e0();
            e0Var.f442208a = str;
            e0Var.f442209b = str2;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID)) {
                e0Var.f442213f = msg.f422547d.optBoolean("keepAlive", false);
                e0Var.f442212e = msg.f422547d.optBoolean("exclusive", false);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Rj(env.f422393a, e0Var);
        }
        gVar.e(msg.f422546c, msg.f422552i + ": success", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 405;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "preloadLiteApp";
    }
}

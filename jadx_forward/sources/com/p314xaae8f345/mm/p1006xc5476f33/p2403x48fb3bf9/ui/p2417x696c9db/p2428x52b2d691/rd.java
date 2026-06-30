package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class rd implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f268036f;

    public rd(nw4.k kVar, nw4.y2 y2Var, boolean z17) {
        this.f268034d = kVar;
        this.f268035e = y2Var;
        this.f268036f = z17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String string = bundle.getString("KEY_BACK_INFO");
        if (string == null) {
            string = "";
        }
        h0Var.f391656d = string;
        java.lang.String string2 = bundle.getString("KEY_ERR_TIPS");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f391656d, "") && !r26.i0.A((java.lang.String) h0Var.f391656d, ":", false, 2, null)) {
            h0Var.f391656d = ":" + ((java.lang.String) h0Var.f391656d);
        }
        java.lang.String str = (java.lang.String) h0Var.f391656d;
        if ((str != null && r26.i0.y(str, "fail", false)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f391656d, "fail_cancel")) {
            if (string2 == null || r26.n0.N(string2)) {
                string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ajc);
            }
            java.lang.String str2 = string2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.qd(this.f268034d, str2, this.f268035e, h0Var, this.f268036f));
            return;
        }
        java.lang.String errMsg = (java.lang.String) h0Var.f391656d;
        nw4.k env = this.f268034d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        nw4.y2 msg = this.f268035e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        env.f422396d.e(msg.f422546c, msg.f422552i + errMsg, null);
        android.content.Context context = env.f422393a;
        if (this.f268036f && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }
}

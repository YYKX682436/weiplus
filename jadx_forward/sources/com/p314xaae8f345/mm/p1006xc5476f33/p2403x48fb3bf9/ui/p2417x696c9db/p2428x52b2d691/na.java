package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes10.dex */
public final class na implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f267919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f267924h;

    public na(nw4.k kVar, nw4.y2 y2Var, yz5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        this.f267917a = kVar;
        this.f267918b = y2Var;
        this.f267919c = lVar;
        this.f267920d = str;
        this.f267921e = str2;
        this.f267922f = str3;
        this.f267923g = str4;
        this.f267924h = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra.f268024e;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra.f268024e = null;
        boolean b17 = fVar.b();
        nw4.k kVar = this.f267917a;
        nw4.y2 y2Var = this.f267918b;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPublishTextState", "CheckTextStateReq success");
            pj4.c0 c0Var = ((pj4.d) fVar.f152151d).f436546d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra raVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ra.f268023d;
            java.lang.String str = c0Var.f436537e;
            java.lang.String str2 = c0Var.f436539g;
            java.lang.String str3 = c0Var.f436540h;
            java.util.LinkedList jumps = c0Var.f436542m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumps, "jumps");
            if (raVar.g(str, str2, str3, jumps)) {
                bi4.c1 c1Var = new bi4.c1();
                c1Var.b(this.f267920d);
                bi4.d1 d1Var = c1Var.f102567a;
                d1Var.f436470d.f436508g.f436751i = this.f267921e;
                c1Var.g(c0Var.f436539g);
                c1Var.f(c0Var.f436537e);
                c1Var.d(c0Var.f436538f);
                c1Var.h(((pj4.d) fVar.f152151d).f436547e);
                c1Var.e(c0Var.f436540h);
                d1Var.f436471e = this.f267922f;
                c1Var.a(this.f267923g);
                c1Var.c(c0Var.f436542m);
                d1Var.f436485v = this.f267924h;
                this.f267919c.mo146xb9724478(d1Var);
            } else {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail_invalid_arguments", null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "fail_invalid_arguments");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPublishTextState", "error info:" + fVar);
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail_liteapp_check", null);
        }
        return jz5.f0.f384359a;
    }
}

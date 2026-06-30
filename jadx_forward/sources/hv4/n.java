package hv4;

/* loaded from: classes8.dex */
public final class n implements hv4.b, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final hv4.l f366851d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ck6 f366852e;

    /* renamed from: f, reason: collision with root package name */
    public final hv4.a f366853f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f366854g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f366855h;

    /* renamed from: i, reason: collision with root package name */
    public final gv4.a f366856i;

    /* renamed from: m, reason: collision with root package name */
    public final gv4.e f366857m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d f366858n;

    public n(hv4.l dialog, r45.ck6 homeContext, hv4.a listener, android.view.View dialogView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogView, "dialogView");
        this.f366851d = dialog;
        this.f366852e = homeContext;
        this.f366853f = listener;
        this.f366854g = "MicroMsg.WebSearch.TagSearchMainTab";
        android.view.View findViewById = dialogView.findViewById(com.p314xaae8f345.mm.R.id.j9b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = dialogView.findViewById(com.p314xaae8f345.mm.R.id.gfl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) findViewById2;
        this.f366855h = c22479x68a26381;
        gv4.a aVar = new gv4.a(this);
        this.f366856i = aVar;
        this.f366857m = new gv4.e(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d(H());
        this.f366858n = c19226x5a0e667d;
        c22479x68a26381.g();
        c22479x68a26381.m80988xce28f7ee(this);
        c22479x68a26381.m();
        c22479x68a26381.t();
        c22479x68a26381.m80989x764b0e09(c22479x68a26381.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        c19226x5a0e667d.J0(new aw4.s(), new aw4.u(6));
        c19226x5a0e667d.mo120128x74041feb(aVar, "tagWebSearchJSApi");
        ((android.widget.FrameLayout) findViewById).addView(c19226x5a0e667d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.TagSearchMainTab", "start to load url %s", homeContext.f453158g);
        aw4.m0 m0Var = aw4.n0.f96434a;
        android.content.Context context = dialog.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        m0Var.c(context, 6);
        c19226x5a0e667d.mo32265x141096a9(homeContext.f453158g);
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f366855h;
            java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80978xc3706fda, "getTotalQuery(...)");
            java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
            this.f366856i.r(m80978xc3706fda, m80970x134c2d56);
        }
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        tj5.o oVar = z17 ? tj5.o.UserInput : tj5.o.SetText;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f366855h;
        c22479x68a26381.o(query, null, oVar);
        if (!z17) {
            c22479x68a26381.d();
            c22479x68a26381.h();
            return;
        }
        c22479x68a26381.m();
        c22479x68a26381.s();
        java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80978xc3706fda, "getTotalQuery(...)");
        java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
        this.f366856i.r(m80978xc3706fda, m80970x134c2d56);
    }

    @Override // hv4.b
    public void D(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f366851d.F(id6);
    }

    @Override // tj5.n
    public boolean G0() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f366855h;
        java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
        if (m80978xc3706fda != null) {
            java.lang.String obj = r26.n0.u0(m80978xc3706fda).toString();
            if (!(!(obj == null || obj.length() == 0))) {
                m80978xc3706fda = null;
            }
            if (m80978xc3706fda != null) {
                java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
                this.f366856i.s(m80978xc3706fda, m80970x134c2d56, 0);
                c22479x68a26381.h();
            }
        }
        return false;
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f366851d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // hv4.b
    public void M5(r45.sn3 shareContent, android.graphics.Bitmap bitmap, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        this.f366851d.D(shareContent, bitmap, str);
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f366855h;
            java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80978xc3706fda, "getTotalQuery(...)");
            java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
            this.f366856i.r(m80978xc3706fda, m80970x134c2d56);
        }
    }

    @Override // hv4.b
    public void a5(java.lang.String tag, java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        pm0.v.X(new hv4.m(this, tag));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7062x716a67f3 c7062x716a67f3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7062x716a67f3();
        c7062x716a67f3.f143701d = 4L;
        c7062x716a67f3.f143702e = c01.id.e();
        c7062x716a67f3.f143703f = 2L;
        c7062x716a67f3.f143704g = c7062x716a67f3.b("ResultQuery", tag, true);
        r45.ck6 ck6Var = this.f366852e;
        c7062x716a67f3.f143705h = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(ck6Var.f453163o) ? 2L : 1L;
        c7062x716a67f3.f143706i = c7062x716a67f3.b("ShareSceneId", ck6Var.f453163o, true);
        c7062x716a67f3.f143707j = c7062x716a67f3.b("ShareSessionId", sessionId, true);
        c7062x716a67f3.f143708k = c7062x716a67f3.b("ShareSearchId", searchId, true);
        c7062x716a67f3.f143709l = c7062x716a67f3.b("ShareRequestId", requestId, true);
        c7062x716a67f3.f143710m = c7062x716a67f3.b("ShareDocId", "", true);
        c7062x716a67f3.k();
        su4.k3.m(c7062x716a67f3);
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f366856i;
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f366857m;
    }

    @Override // av4.j
    /* renamed from: getWebView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3() {
        return this.f366858n;
    }

    @Override // aw4.q
    /* renamed from: hideVKB */
    public void mo9205x36654fab() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f366855h;
        c22479x68a26381.m();
        c22479x68a26381.h();
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f366852e;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f366855h;
        c22479x68a26381.m();
        c22479x68a26381.s();
    }

    @Override // hv4.b
    public void r1(r45.ck6 moreContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreContext, "moreContext");
        hv4.l lVar = this.f366851d;
        lVar.getClass();
        pm0.v.X(new hv4.k(lVar, moreContext));
    }

    @Override // aw4.q
    /* renamed from: showVKB */
    public void mo9206x7b383410() {
        this.f366855h.s();
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f366856i;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f366857m;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f366856i;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f366857m;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.a b() {
        return this.f366856i;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.e c() {
        return this.f366857m;
    }
}

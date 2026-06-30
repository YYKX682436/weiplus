package yu4;

/* loaded from: classes8.dex */
public final class n implements yu4.p, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final yu4.k f547428d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.xi0 f547429e;

    /* renamed from: f, reason: collision with root package name */
    public final ur.l f547430f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f547431g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f547432h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f547433i;

    /* renamed from: m, reason: collision with root package name */
    public final xu4.d f547434m;

    /* renamed from: n, reason: collision with root package name */
    public final xu4.h f547435n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f547436o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f547437p;

    /* renamed from: q, reason: collision with root package name */
    public int f547438q;

    public n(yu4.k dialog, r45.xi0 homeContext, ur.l listener, android.view.View dialogView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogView, "dialogView");
        this.f547428d = dialog;
        this.f547429e = homeContext;
        this.f547430f = listener;
        this.f547431g = "MicroMsg.WebSearch.EmojiSearchMainTab";
        android.view.View findViewById = dialogView.findViewById(com.p314xaae8f345.mm.R.id.j9b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f547432h = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = dialogView.findViewById(com.p314xaae8f345.mm.R.id.gfl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) findViewById2;
        this.f547433i = c22479x68a26381;
        this.f547434m = new xu4.d(this);
        this.f547435n = new xu4.h(this);
        this.f547436o = jz5.h.b(new yu4.m(this));
        c22479x68a26381.g();
        c22479x68a26381.m80988xce28f7ee(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(homeContext.f471657p) && homeContext.f471659r == 1) {
            c22479x68a26381.m();
            c22479x68a26381.t();
        }
        c22479x68a26381.m80989x764b0e09(c22479x68a26381.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6k));
        boolean z17 = homeContext.f471660s == 1;
        this.f547437p = z17;
        if (z17) {
            c22479x68a26381.m80981x56f98219(dialog.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        if (oVar == tj5.o.UserInput || oVar == tj5.o.ClearText) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f547433i;
            java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80978xc3706fda, "getTotalQuery(...)");
            java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
            this.f547434m.r(m80978xc3706fda, m80970x134c2d56);
        }
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        tj5.o oVar = z17 ? tj5.o.UserInput : tj5.o.SetText;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f547433i;
        c22479x68a26381.o(query, null, oVar);
        if (!z17) {
            c22479x68a26381.d();
            c22479x68a26381.h();
            return;
        }
        c22479x68a26381.m();
        c22479x68a26381.s();
        xu4.d dVar = this.f547434m;
        if (dVar != null) {
            java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80978xc3706fda, "getTotalQuery(...)");
            java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
            dVar.r(m80978xc3706fda, m80970x134c2d56);
        }
    }

    @Override // yu4.p
    public void D(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f547428d.E(id6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if ((r4 == null || r4.length() == 0) == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // tj5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G0() {
        /*
            r6 = this;
            r0 = 0
            com.tencent.mm.ui.search.FTSEditTextView r1 = r6.f547433i
            if (r1 == 0) goto L9b
            java.lang.String r2 = r1.m80978xc3706fda()
            r3 = 1
            if (r2 == 0) goto L15
            boolean r4 = r26.n0.N(r2)
            if (r4 == 0) goto L13
            goto L15
        L13:
            r4 = r0
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 != 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            android.widget.EditText r4 = r1.m80966xdb574fcd()
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L31
            int r4 = r4.length()
            if (r4 != 0) goto L2f
            goto L31
        L2f:
            r4 = r0
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 == 0) goto L47
            java.lang.String r4 = r1.m80972xc738b2f5()
            if (r4 == 0) goto L43
            int r4 = r4.length()
            if (r4 != 0) goto L41
            goto L43
        L41:
            r4 = r0
            goto L44
        L43:
            r4 = r3
        L44:
            if (r4 != 0) goto L47
            goto L48
        L47:
            r3 = r0
        L48:
            if (r3 == 0) goto L59
            java.lang.String r2 = r1.m80972xc738b2f5()
            java.lang.String r4 = r1.m80972xc738b2f5()
            java.util.List r5 = r1.m80975xe175c322()
            r1.n(r4, r5)
        L59:
            if (r2 == 0) goto L9b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onSearchKeyDown: totalquery="
            r4.<init>(r5)
            java.lang.String r5 = r1.m80978xc3706fda()
            r4.append(r5)
            java.lang.String r5 = ", useRecommend="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", recommend="
            r4.append(r5)
            java.lang.String r5 = r1.m80972xc738b2f5()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r6.f547431g
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            java.lang.String r4 = r1.m80970x134c2d56()
            java.lang.String r5 = "getInEditTextQuery(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            xu4.d r5 = r6.f547434m
            r5.s(r2, r4, r3)
            r1.h()
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yu4.n.G0():boolean");
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f547428d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // yu4.p
    public void O2(r45.sn3 shareContent, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        this.f547428d.D(shareContent, str);
    }

    @Override // tj5.n
    public void U1(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f547433i;
            java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80978xc3706fda, "getTotalQuery(...)");
            java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
            this.f547434m.r(m80978xc3706fda, m80970x134c2d56);
        }
    }

    @Override // yu4.p
    public void W1(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f547433i;
        if (c22479x68a26381 != null) {
            c22479x68a26381.m80992x157d7269(text);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e) ((jz5.n) this.f547436o).mo141623x754a37bb();
    }

    @Override // yu4.p
    public java.lang.String a4() {
        java.lang.String m80970x134c2d56 = this.f547433i.m80970x134c2d56();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80970x134c2d56, "getInEditTextQuery(...)");
        return m80970x134c2d56;
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f547434m;
    }

    @Override // yu4.p
    public void b4(r45.lw5 emoticon, r45.rn3 request, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoticon, "emoticon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f547428d.F(emoticon, request, bArr);
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f547435n;
    }

    @Override // yu4.p
    public void g5(r45.xi0 moreContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreContext, "moreContext");
        yu4.k kVar = this.f547428d;
        kVar.getClass();
        pm0.v.X(new yu4.j(kVar, moreContext));
    }

    @Override // av4.j
    /* renamed from: getWebView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3() {
        return a();
    }

    @Override // aw4.q
    /* renamed from: hideVKB */
    public void mo9205x36654fab() {
        this.f547433i.h();
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f547429e;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f547433i;
        c22479x68a26381.m();
        c22479x68a26381.s();
    }

    @Override // aw4.q
    /* renamed from: showVKB */
    public void mo9206x7b383410() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f547433i;
        c22479x68a26381.m();
        c22479x68a26381.s();
    }

    @Override // av4.j
    public int z2() {
        return this.f547438q;
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f547434m;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f547435n;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f547434m;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f547435n;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.d b() {
        return this.f547434m;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.h c() {
        return this.f547435n;
    }
}

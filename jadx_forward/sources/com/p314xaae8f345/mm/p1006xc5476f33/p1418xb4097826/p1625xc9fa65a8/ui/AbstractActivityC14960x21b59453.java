package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Ltj5/w;", "Ltj5/n;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "setLoadingView", "(Landroid/view/View;)V", "loadingView", "B", "getUiContainer", "setUiContainer", "uiContainer", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI */
/* loaded from: classes8.dex */
public abstract class AbstractActivityC14960x21b59453 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements tj5.w, tj5.n {

    /* renamed from: A, reason: from kotlin metadata */
    public android.view.View loadingView;

    /* renamed from: B, reason: from kotlin metadata */
    public android.view.View uiContainer;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f207444u;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f207446w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f207447x;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f207448y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f207449z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f207443t = "Finder.FinderSearchBaseUI";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f207445v = "";

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        java.lang.String str3;
        if (str == null || (str3 = r26.n0.u0(str).toString()) == null) {
            str3 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            android.view.View view = this.loadingView;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d7().setVisibility(8);
            e7().setVisibility(8);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        java.lang.String str;
        java.util.AbstractCollection m56387xe6796cde;
        mo48674x36654fab();
        java.lang.String m80978xc3706fda = f7().m80997xdc5215a6().m80978xc3706fda();
        if (m80978xc3706fda == null || (str = r26.n0.u0(m80978xc3706fda).toString()) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207443t, "startSearch query:".concat(str));
        this.f207445v = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0) c7();
        c14957x1a4885f0.getClass();
        c14957x1a4885f0.f207209d = str;
        if (c14957x1a4885f0.m56357x44e5026c() != null) {
            c14957x1a4885f0.m56377x73095078(null);
        }
        if (!c14957x1a4885f0.m56387xe6796cde().isEmpty() && (m56387xe6796cde = c14957x1a4885f0.m56387xe6796cde()) != null) {
            m56387xe6796cde.clear();
        }
        c14957x1a4885f0.mo56155xd210094c();
        android.view.View view = this.loadingView;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d7().setVisibility(8);
        e7().setVisibility(8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m58958x4905e9fa = m58958x4905e9fa();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m58958x4905e9fa, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        m58958x4905e9fa.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m58958x4905e9fa, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public abstract pt2.o c7();

    public final android.widget.TextView d7() {
        android.widget.TextView textView = this.f207449z;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noResultView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 e7() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f207447x;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f7() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f207444u;
        if (c22482x50bddb92 != null) {
            return c22482x50bddb92;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
        throw null;
    }

    public abstract pt2.p g7();

    /* renamed from: getRecyclerView */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m58958x4905e9fa() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f207448y;
        if (c1163xf1deaba4 != null) {
            return c1163xf1deaba4;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // tj5.w
    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    /* renamed from: onClickCancelBtn */
    public void m58959x91b34899(android.view.View view) {
        mo48674x36654fab();
        finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        f7().m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f207444u = new com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92((android.content.Context) this, false);
        f7().m81002xcd6a5043(this);
        f7().m80997xdc5215a6().m80989x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjk));
        f7().m80997xdc5215a6().m80988xce28f7ee(this);
        f7().m80997xdc5215a6().m80980x55355581(false);
        f7().m80997xdc5215a6().g();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.y(f7());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) f7().findViewById(com.p314xaae8f345.mm.R.id.aa8);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setOnClickListener(new pt2.m(this));
        }
        this.f207445v = "";
        f7().m80997xdc5215a6().m();
        f7().m80997xdc5215a6().t();
        android.view.View findViewById = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f207447x = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = e7().m82555x4905e9fa();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m82555x4905e9fa, "<set-?>");
        this.f207448y = m82555x4905e9fa;
        android.view.View findViewById2 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.kcj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f207449z = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.im7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m58960x626a4c3f(findViewById3);
        android.view.View findViewById4 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.orv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        m58961xdd43e8b(findViewById4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m58958x4905e9fa = m58958x4905e9fa();
        ((ot2.f) g7()).getClass();
        m58958x4905e9fa.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(this));
        g7().getClass();
        ((ot2.f) g7()).getClass();
        this.f207446w = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchViewConfig$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 1) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zu();
                }
                hc2.l.a("FinderActivitySearchViewConfig", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        }, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0) c7()).m56387xe6796cde(), true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m58958x4905e9fa2 = m58958x4905e9fa();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f207446w;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        m58958x4905e9fa2.mo7960x6cab2c8d(c22848x6ddd90cf);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 e76 = e7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        e76.m82697xe136b7d8(inflate);
        d7().setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        m58958x4905e9fa().setOnTouchListener(new pt2.k(this));
        e7().m82689x3c9625d9(false);
        e7().m82683xb165a19d(new pt2.l(this));
        f7().m80997xdc5215a6().n(this.f207445v, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        mo48674x36654fab();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        super.mo2295x59cfc822();
        mo48674x36654fab();
    }

    /* renamed from: setLoadingView */
    public final void m58960x626a4c3f(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.loadingView = view;
    }

    /* renamed from: setUiContainer */
    public final void m58961xdd43e8b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.uiContainer = view;
    }
}

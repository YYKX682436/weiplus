package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdFinderOpenAppHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper */
/* loaded from: classes4.dex */
public class C17708x80c6381b extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f244190o;

    /* renamed from: p, reason: collision with root package name */
    public ya2.n1 f244191p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f244192q;

    public C17708x80c6381b(android.content.Context context) {
        super(context);
        this.f244190o = "AdFinderOpenAppHalfScreenHelper";
        this.f244192q = jz5.h.b(new g44.l(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dfg;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        return this.f244190o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        ya2.n1 n1Var = this.f244191p;
        if (n1Var != null) {
            ((xc2.s1) n1Var).f534827a.P6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
    }

    public final android.widget.ScrollView p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        android.widget.ScrollView scrollView = (android.widget.ScrollView) ((jz5.n) this.f244192q).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMScrollContainer", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        return scrollView;
    }

    public void q(ya2.n1 halfScreenListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenListener, "halfScreenListener");
        ((xc2.s1) halfScreenListener).b(new g44.m(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDetachListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
    }

    public final void r(h44.c cVar, ya2.n1 halfScreenListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenListener, "halfScreenListener");
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(i(), "showBottomSheet, adOpenAppParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
            return;
        }
        m(cVar);
        this.f244191p = halfScreenListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        k();
        ya2.n1 n1Var = this.f244191p;
        int i17 = 0;
        int a17 = n1Var != null ? ((xc2.s1) n1Var).a() : 0;
        if (a17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(i(), "half screen height less than 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        } else {
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
            int g17 = com.p314xaae8f345.mm.ui.bl.g(g());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "halfScreenHeight is " + a17 + ", navigationBarHeight is " + g17);
            int b17 = (a17 - i65.a.b(g(), g17 == 0 ? 260 : 196)) - g17;
            int b18 = i65.a.b(g(), 305);
            int b19 = i65.a.b(g(), 24);
            float f17 = b19 / 0.85714287f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "resizeUI, remainSpace is " + b17 + ", minTotalMargins is " + f17 + ", maxMargins is " + b18 + ", topMarginRadio1 is 0.14285715, topMarginRadio2 is 0.85714287");
            android.widget.Button h17 = h();
            android.view.ViewGroup.LayoutParams layoutParams = h17 != null ? h17.getLayoutParams() : null;
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (g17 == 0) {
                if (layoutParams2 != null) {
                    layoutParams2.bottomMargin = i65.a.b(g(), 64);
                }
                android.widget.Button h18 = h();
                if (h18 != null) {
                    h18.setLayoutParams(layoutParams2);
                }
            }
            if (b17 < b18) {
                float f18 = b17;
                if (f18 > f17) {
                    i17 = (int) (0.14285715f * f18);
                    b19 = (int) (f18 * 0.85714287f);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "resizeUI, topMargin1 is " + i17 + ", topMargin2 is " + b19);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d e17 = e();
                android.view.ViewGroup.LayoutParams layoutParams3 = e17 != null ? e17.getLayoutParams() : null;
                android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = i17;
                }
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = b19;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d e18 = e();
                if (e18 != null) {
                    e18.setLayoutParams(layoutParams4);
                }
                android.widget.Button h19 = h();
                if (h19 != null) {
                    h19.setLayoutParams(layoutParams2);
                }
                android.view.View f19 = f();
                if (f19 != null) {
                    f19.requestLayout();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resizeUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
            n();
            p().addView(f());
            android.widget.ScrollView customContent = p();
            g44.n nVar = new g44.n(this);
            xc2.s1 s1Var = (xc2.s1) halfScreenListener;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customContent, "customContent");
            gx2.q Q6 = s1Var.f534827a.Q6(customContent);
            if (Q6 != null) {
                Q6.m132474x77f391b9(nVar);
            }
            q(s1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppHalfScreenHelper");
    }
}

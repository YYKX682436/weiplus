package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/AdGalleryOpenAppHalfScreenHelper;", "Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper */
/* loaded from: classes3.dex */
public class C17710x34e09215 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f244196o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f244197p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f244198q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f244199r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f244200s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f244201t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f244202u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f244203v;

    public C17710x34e09215(android.content.Context context) {
        super(context);
        this.f244196o = "AdGalleryOpenAppHalfScreenHelper";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dpm;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return this.f244196o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public void j() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f244197p;
        boolean z17 = false;
        if (k0Var2 != null && k0Var2.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f244197p) != null) {
            k0Var.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideOpenAppHalfScreen", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5.AbstractC17712xfa8619a6
    public void n() {
        java.lang.String str;
        k44.h b17;
        android.widget.TextView textView;
        java.lang.String str2;
        k44.h b18;
        k44.h b19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        super.n();
        h44.c d17 = d();
        java.util.List list = null;
        if (d17 == null || (b19 = d17.b()) == null) {
            str = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str = b19.f385628j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        if (!(str == null || str.length() == 0) && (textView = this.f244198q) != null) {
            h44.c d18 = d();
            if (d18 == null || (b18 = d18.b()) == null) {
                str2 = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                str2 = b18.f385628j;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            }
            textView.setText(str2);
        }
        h44.c d19 = d();
        if (d19 != null && (b17 = d19.b()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            list = b17.f385629k;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        s(list);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public int p() {
        int i17;
        k44.h b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        h44.c d17 = d();
        if (d17 == null || (b17 = d17.b()) == null) {
            i17 = 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            i17 = b17.f385624f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return i17;
    }

    public int q() {
        int i17;
        k44.h b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        h44.c d17 = d();
        if (d17 == null || (b17 = d17.b()) == null) {
            i17 = 0;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            i17 = b17.f385625g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        return i17;
    }

    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initExpandAreaClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        android.widget.FrameLayout frameLayout = this.f244201t;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new g44.t(this));
        }
        android.widget.FrameLayout frameLayout2 = this.f244202u;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new g44.u(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initExpandAreaClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public final void s(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshGalleryUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (g() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshGalleryUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        int b17 = i65.a.b(g(), 55) * 2;
        int b18 = i65.a.b(g(), 8);
        int i18 = ((i17 - b17) - (b18 * 2)) / 3;
        int i19 = (i18 * 16) / 9;
        int i27 = 0;
        if (!(list == null || list.isEmpty())) {
            int size = list.size();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int i28 = i27 + 1;
                java.lang.String str = (java.lang.String) it.next();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(g());
                c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                c22628xfde5d61d.m81387x205ac394(i65.a.b(g(), 6));
                a84.m.a(str, c22628xfde5d61d);
                android.widget.LinearLayout linearLayout = this.f244199r;
                if (linearLayout != null) {
                    linearLayout.addView(c22628xfde5d61d);
                }
                android.view.ViewGroup.LayoutParams layoutParams = c22628xfde5d61d.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = i18;
                    marginLayoutParams.height = i19;
                } else {
                    marginLayoutParams = null;
                }
                if (i27 != size - 1 && marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = b18;
                }
                i27 = i28;
            }
        }
        android.widget.LinearLayout linearLayout2 = this.f244199r;
        java.lang.Object layoutParams2 = linearLayout2 != null ? linearLayout2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.height = i19;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshGalleryUI", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public void t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnBottomSheetDismissListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f244197p;
        if (k0Var != null) {
            k0Var.p(new g44.v(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnBottomSheetDismissListener", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }

    public final void u(h44.c cVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2;
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(i(), "showBottomSheet, adOpenAppParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            return;
        }
        m(cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        boolean z17 = false;
        if (this.f244197p == null) {
            k();
            android.view.View f17 = f();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = f17 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) f17.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260) : null;
            android.view.View f18 = f();
            this.f244198q = f18 != null ? (android.widget.TextView) f18.findViewById(com.p314xaae8f345.mm.R.id.a0x) : null;
            android.view.View f19 = f();
            this.f244199r = f19 != null ? (android.widget.LinearLayout) f19.findViewById(com.p314xaae8f345.mm.R.id.ghu) : null;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setOnClickListener(new g44.w(this));
            }
            if (p() == 1) {
                android.view.View f27 = f();
                this.f244200s = f27 != null ? (android.widget.LinearLayout) f27.findViewById(com.p314xaae8f345.mm.R.id.qep) : null;
                android.view.View f28 = f();
                this.f244201t = f28 != null ? (android.widget.FrameLayout) f28.findViewById(com.p314xaae8f345.mm.R.id.qer) : null;
                android.view.View f29 = f();
                this.f244202u = f29 != null ? (android.widget.FrameLayout) f29.findViewById(com.p314xaae8f345.mm.R.id.qeq) : null;
                android.view.View f37 = f();
                this.f244203v = f37 != null ? (android.widget.FrameLayout) f37.findViewById(com.p314xaae8f345.mm.R.id.mbp) : null;
                r();
                android.widget.FrameLayout frameLayout = this.f244202u;
                if (frameLayout != null) {
                    frameLayout.setOnTouchListener(new g44.x(this));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doExpandClickAreaLogic", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
                android.view.View f38 = f();
                if (f38 != null && (viewTreeObserver = f38.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new g44.s(this));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doExpandClickAreaLogic", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
            }
            this.f244197p = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(g(), 1, false);
            android.view.View f39 = f();
            android.view.ViewGroup.LayoutParams layoutParams = f39 != null ? f39.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            android.view.View f47 = f();
            android.view.ViewGroup.LayoutParams layoutParams2 = f47 != null ? f47.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f244197p;
            if (k0Var3 != null) {
                k0Var3.s(f(), true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var4 = this.f244197p;
            if (k0Var4 != null) {
                k0Var4.V1 = true;
            }
            if (k0Var4 != null) {
                k0Var4.e(true);
            }
            if (q() == 1 && (k0Var2 = this.f244197p) != null) {
                k0Var2.n(false);
            }
            t();
        }
        a();
        n();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var5 = this.f244197p;
        if (k0Var5 != null && !k0Var5.i()) {
            z17 = true;
        }
        if (z17 && (k0Var = this.f244197p) != null) {
            k0Var.v();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper");
    }
}

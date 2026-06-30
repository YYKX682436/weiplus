package s44;

/* loaded from: classes4.dex */
public final class d extends t44.m implements v44.a {

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f484493j = jz5.h.b(s44.b.f484492d);

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f484494k;

    /* renamed from: l, reason: collision with root package name */
    public final int f484495l;

    /* renamed from: m, reason: collision with root package name */
    public final int f484496m;

    /* renamed from: n, reason: collision with root package name */
    public final int f484497n;

    public d() {
        jz5.g b17 = jz5.h.b(s44.a.f484491d);
        this.f484494k = b17;
        int a17 = c44.b.a(14);
        this.f484495l = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNormalPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        int intValue = ((java.lang.Number) ((jz5.n) this.f497045b).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNormalPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        this.f484496m = intValue;
        int d17 = a17 + d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarRightMargin", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        int intValue2 = ((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarRightMargin", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        this.f484497n = d17 + intValue2;
    }

    public final android.view.View c(android.content.Context context, s44.c cVar) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildAdBottomBaseInfoView", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setId(com.p314xaae8f345.mm.R.id.afc);
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b17 = b();
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = b17;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = this.f484496m;
        }
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBottomBaseInfoLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBottomBaseInfoLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
        int e17 = e(com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout);
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
            layoutParams5.width = -2;
            linearLayout.setLayoutParams(layoutParams5);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
            layoutParams6.height = -2;
            linearLayout.setLayoutParams(layoutParams6);
        }
        int f17 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.gravity = f17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams9 : null;
            if (layoutParams10 != null) {
                layoutParams10.gravity = f17;
            }
        }
        int a17 = c44.b.a(40);
        android.view.ViewGroup.LayoutParams layoutParams11 = linearLayout.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.rightMargin = a17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGravity_bottom", "com.tencent.mm.plugin.sns.ad.dsl.DSLConstantsKt");
        linearLayout.setGravity(c44.a.f120060e);
        c44.a.j();
        linearLayout.setOrientation(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3 c10806xf15263c3 = new com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3(linearLayout.getContext());
        linearLayout.addView(c10806xf15263c3);
        c10806xf15263c3.setId(com.p314xaae8f345.mm.R.id.f564421qv);
        c44.a.o();
        if (c10806xf15263c3.getLayoutParams() == null) {
            c44.a.o();
            c10806xf15263c3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = c10806xf15263c3.getLayoutParams();
            layoutParams12.width = -2;
            c10806xf15263c3.setLayoutParams(layoutParams12);
        }
        c44.a.o();
        if (c10806xf15263c3.getLayoutParams() == null) {
            c44.a.o();
            c10806xf15263c3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = c10806xf15263c3.getLayoutParams();
            layoutParams13.height = -2;
            c10806xf15263c3.setLayoutParams(layoutParams13);
        }
        c10806xf15263c3.setSingleLine(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        jz5.g gVar = this.f497052i;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        c10806xf15263c3.setTextColor(intValue);
        float f18 = e17;
        c10806xf15263c3.setTextSize(0, f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPublishTimeText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPublishTimeText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3 c10806xf15263c32 = new com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3(linearLayout.getContext());
        linearLayout.addView(c10806xf15263c32);
        c10806xf15263c32.setId(com.p314xaae8f345.mm.R.id.f564335o9);
        c44.a.o();
        if (c10806xf15263c32.getLayoutParams() == null) {
            c44.a.o();
            c10806xf15263c32.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams14 = c10806xf15263c32.getLayoutParams();
            layoutParams14.width = -2;
            c10806xf15263c32.setLayoutParams(layoutParams14);
        }
        c44.a.o();
        if (c10806xf15263c32.getLayoutParams() == null) {
            c44.a.o();
            c10806xf15263c32.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams15 = c10806xf15263c32.getLayoutParams();
            layoutParams15.height = -2;
            c10806xf15263c32.setLayoutParams(layoutParams15);
        }
        int a18 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams16 = c10806xf15263c32.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams16 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams16 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.leftMargin = a18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsLinkColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        int intValue2 = ((java.lang.Number) ((jz5.n) this.f497051h).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsLinkColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        c10806xf15263c32.setTextColor(intValue2);
        c10806xf15263c32.setTextSize(0, f18);
        c44.a.c();
        c10806xf15263c32.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSocialchainText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSocialchainText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3 c10806xf15263c33 = new com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3(linearLayout.getContext());
        linearLayout.addView(c10806xf15263c33);
        c10806xf15263c33.setId(com.p314xaae8f345.mm.R.id.f564384pr);
        c44.a.o();
        if (c10806xf15263c33.getLayoutParams() == null) {
            c44.a.o();
            i17 = -2;
            c10806xf15263c33.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i17 = -2;
            android.view.ViewGroup.LayoutParams layoutParams17 = c10806xf15263c33.getLayoutParams();
            layoutParams17.width = -2;
            c10806xf15263c33.setLayoutParams(layoutParams17);
        }
        c44.a.o();
        if (c10806xf15263c33.getLayoutParams() == null) {
            c44.a.o();
            c10806xf15263c33.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams18 = c10806xf15263c33.getLayoutParams();
            layoutParams18.height = i17;
            c10806xf15263c33.setLayoutParams(layoutParams18);
        }
        int a19 = c44.b.a(10);
        android.view.ViewGroup.LayoutParams layoutParams19 = c10806xf15263c33.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams19 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams19 : null;
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.leftMargin = a19;
        }
        c10806xf15263c33.setEllipsize(c44.a.a());
        c10806xf15263c33.setSingleLine(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        int intValue3 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsWordColor", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
        c10806xf15263c33.setTextColor(intValue3);
        c10806xf15263c33.setTextSize(0, f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppNameText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppNameText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(frameLayout.getContext());
        frameLayout.addView(frameLayout2);
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            i18 = -2;
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i18 = -2;
            android.view.ViewGroup.LayoutParams layoutParams20 = frameLayout2.getLayoutParams();
            layoutParams20.width = -2;
            frameLayout2.setLayoutParams(layoutParams20);
        }
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams21 = frameLayout2.getLayoutParams();
            layoutParams21.height = i18;
            frameLayout2.setLayoutParams(layoutParams21);
        }
        int h17 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams22 = frameLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams23 = layoutParams22 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams22 : null;
        if (layoutParams23 != null) {
            layoutParams23.gravity = h17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams24 = frameLayout2.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams25 = layoutParams24 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams24 : null;
            if (layoutParams25 != null) {
                layoutParams25.gravity = h17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentLikeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentLikeContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        android.widget.ImageView imageView = new android.widget.ImageView(frameLayout2.getContext());
        frameLayout2.addView(imageView);
        imageView.setId(com.p314xaae8f345.mm.R.id.f564427r2);
        int f19 = i65.a.f(imageView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(f19, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams26 = imageView.getLayoutParams();
            layoutParams26.width = f19;
            imageView.setLayoutParams(layoutParams26);
        }
        int a27 = c44.b.a(20);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a27));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams27 = imageView.getLayoutParams();
            layoutParams27.height = a27;
            imageView.setLayoutParams(layoutParams27);
        }
        int f27 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams28 = imageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams29 = layoutParams28 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams28 : null;
        if (layoutParams29 != null) {
            layoutParams29.gravity = f27;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams30 = imageView.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams31 = layoutParams30 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams30 : null;
            if (layoutParams31 != null) {
                layoutParams31.gravity = f27;
            }
        }
        imageView.setBackground(null);
        java.lang.String string = imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        imageView.setContentDescription(string);
        imageView.setFocusable(false);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.zk.d(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559934iu));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentLikeIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentLikeIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildAdBottomBaseInfoView", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        return frameLayout;
    }

    public final int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAvatarSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        int intValue = ((java.lang.Number) this.f484493j.mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAvatarSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        return intValue;
    }

    public final int e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpecialTextSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        int min = (int) java.lang.Math.min(i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17) * i65.a.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), i65.a.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpecialTextSize", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
        return min;
    }
}

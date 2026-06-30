package l94;

/* loaded from: classes4.dex */
public final class i extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f398895h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f398896i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f398897j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f398898k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f398899l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f398900m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f398901n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super("WsFoldAdCardBottomComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        int e17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "the fold sns info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent");
            return;
        }
        java.lang.String str = b17.f453607g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f398895h;
        if (c22628xfde5d61d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarImageView");
            throw null;
        }
        a84.m.a(str, c22628xfde5d61d);
        android.widget.TextView textView = this.f398896i;
        if (textView != null) {
            java.lang.String str2 = b17.f453610m;
            if (str2 == null || str2.length() == 0) {
                i17 = 8;
            } else {
                com.p314xaae8f345.mm.p2614xca6eae71.x1 Di = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
                f();
                textView.setText(Di.Ri(b17.f453610m, true));
                i17 = 0;
            }
            textView.setVisibility(i17);
        }
        android.widget.TextView textView2 = this.f398897j;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTextView");
            throw null;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.x1 Di2 = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
        f();
        java.lang.String str3 = b17.f453606f;
        if (str3 == null) {
            str3 = "";
        }
        textView2.setText(Di2.Ri(str3, true));
        android.widget.ImageView imageView = this.f398900m;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodShopImageView");
            throw null;
        }
        j94.b.a(imageView, b17);
        android.widget.ImageView imageView2 = this.f398899l;
        if (imageView2 != null) {
            java.lang.String str4 = com.p314xaae8f345.mm.ui.bk.C() ? b17.f453621x : b17.f453612o;
            imageView2.setVisibility(str4 == null || str4.length() == 0 ? 8 : 0);
            a84.m.a(str4, imageView2);
        }
        android.widget.TextView textView3 = this.f398898k;
        if (textView3 != null) {
            java.lang.String str5 = b17.f453611n;
            if (!(str5 == null || str5.length() == 0)) {
                com.p314xaae8f345.mm.p2614xca6eae71.x1 Di3 = com.p314xaae8f345.mm.p2614xca6eae71.x1.Di();
                f();
                textView3.setText(Di3.Ri(b17.f453611n, true));
            }
            int d17 = i65.a.d(f(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                r45.c43 c43Var = b17.f453622y;
                e17 = ca4.n0.e(c43Var != null ? c43Var.f452800e : null, d17);
            } else {
                r45.c43 c43Var2 = b17.f453622y;
                e17 = ca4.n0.e(c43Var2 != null ? c43Var2.f452799d : null, d17);
            }
            textView3.setTextColor(e17);
        }
        android.view.View view = this.f398901n;
        if (view != null) {
            view.setOnClickListener(new l94.h(b17, adInfo));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(f());
        int a17 = c44.b.a(4);
        linearLayout.setPadding(a17, a17, a17, a17);
        c44.a.j();
        linearLayout.setOrientation(0);
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            linearLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.height = -2;
            linearLayout.setLayoutParams(layoutParams2);
        }
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout2);
        c44.a.m();
        linearLayout2.setOrientation(1);
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            layoutParams3.width = 0;
            linearLayout2.setLayoutParams(layoutParams3);
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            layoutParams5.weight = 1;
        }
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
            layoutParams6.height = -2;
            linearLayout2.setLayoutParams(layoutParams6);
        }
        int a18 = c44.b.a(12);
        android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams != null) {
            n3.u.g(marginLayoutParams, a18);
        }
        int f17 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams8 = linearLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams9 = layoutParams8 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams8 : null;
        if (layoutParams9 != null) {
            layoutParams9.gravity = f17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = linearLayout2.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams11 = layoutParams10 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams10 : null;
            if (layoutParams11 != null) {
                layoutParams11.gravity = f17;
            }
        }
        android.widget.TextView textView = new android.widget.TextView(linearLayout2.getContext());
        linearLayout2.addView(textView);
        this.f398896i = textView;
        c44.a.l();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
            layoutParams12.width = -1;
            textView.setLayoutParams(layoutParams12);
        }
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = textView.getLayoutParams();
            layoutParams13.height = -2;
            textView.setLayoutParams(layoutParams13);
        }
        textView.setMaxLines(2);
        textView.setEllipsize(c44.a.a());
        textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        com.p314xaae8f345.mm.ui.kk.d(textView, c44.b.a(4));
        textView.setTextSize(0, i65.a.j(textView.getContext()) * i65.a.a(textView.getContext(), 15.0f));
        c44.a.c();
        textView.setVisibility(8);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787(linearLayout2.getContext());
        c44.a.l();
        if (c1073x7e08a787.getLayoutParams() == null) {
            c44.a.o();
            c1073x7e08a787.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams14 = c1073x7e08a787.getLayoutParams();
            layoutParams14.width = -1;
            c1073x7e08a787.setLayoutParams(layoutParams14);
        }
        c44.a.o();
        if (c1073x7e08a787.getLayoutParams() == null) {
            c44.a.o();
            c1073x7e08a787.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams15 = c1073x7e08a787.getLayoutParams();
            layoutParams15.height = -2;
            c1073x7e08a787.setLayoutParams(layoutParams15);
        }
        linearLayout2.setGravity(c44.a.f());
        android.content.Context context = c1073x7e08a787.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(context);
        c22628xfde5d61d.setId(android.view.View.generateViewId());
        int a19 = c44.b.a(16);
        if (c22628xfde5d61d.getLayoutParams() == null) {
            c44.a.o();
            c22628xfde5d61d.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a19, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams16 = c22628xfde5d61d.getLayoutParams();
            layoutParams16.width = a19;
            c22628xfde5d61d.setLayoutParams(layoutParams16);
        }
        int a27 = c44.b.a(16);
        if (c22628xfde5d61d.getLayoutParams() == null) {
            c44.a.o();
            c22628xfde5d61d.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a27));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams17 = c22628xfde5d61d.getLayoutParams();
            layoutParams17.height = a27;
            c22628xfde5d61d.setLayoutParams(layoutParams17);
        }
        c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        c22628xfde5d61d.m81387x205ac394((int) (c44.b.a(8) * i65.a.q(c22628xfde5d61d.getContext())));
        a84.v0.a(c22628xfde5d61d.getContext(), c22628xfde5d61d, 16, 16);
        this.f398895h = c22628xfde5d61d;
        android.widget.TextView textView2 = new android.widget.TextView(c1073x7e08a787.getContext());
        textView2.setId(android.view.View.generateViewId());
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams18 = textView2.getLayoutParams();
            layoutParams18.height = -2;
            textView2.setLayoutParams(layoutParams18);
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 400, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
            textView2.setTypeface(create, 0);
        }
        textView2.setTextSize(0, i65.a.j(textView2.getContext()) * i65.a.a(textView2.getContext(), 14.0f));
        textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        textView2.setMaxLines(1);
        textView2.setEllipsize(c44.a.a());
        this.f398897j = textView2;
        android.widget.ImageView imageView = new android.widget.ImageView(c1073x7e08a787.getContext());
        imageView.setId(android.view.View.generateViewId());
        int a28 = c44.b.a(33);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a28, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams19 = imageView.getLayoutParams();
            layoutParams19.width = a28;
            imageView.setLayoutParams(layoutParams19);
        }
        int a29 = c44.b.a(14);
        if (imageView.getLayoutParams() == null) {
            c44.a.o();
            imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a29));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams20 = imageView.getLayoutParams();
            layoutParams20.height = a29;
            imageView.setLayoutParams(layoutParams20);
        }
        imageView.setVisibility(8);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        a84.v0.a(imageView.getContext(), imageView, 33, 14);
        this.f398900m = imageView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = this.f398895h;
        if (c22628xfde5d61d2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarImageView");
            throw null;
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams21 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams((int) (c44.b.a(16) * i65.a.q(c1073x7e08a787.getContext())), (int) (c44.b.a(16) * i65.a.q(c1073x7e08a787.getContext())));
        layoutParams21.f92439q = 0;
        layoutParams21.f92426h = 0;
        layoutParams21.f92432k = 0;
        layoutParams21.setMarginEnd(c44.b.a(6));
        android.widget.TextView textView3 = this.f398897j;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTextView");
            throw null;
        }
        layoutParams21.f92440r = textView3.getId();
        layoutParams21.F = 2;
        layoutParams21.f92448z = 0.0f;
        c1073x7e08a787.addView(c22628xfde5d61d2, layoutParams21);
        android.widget.TextView textView4 = this.f398897j;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTextView");
            throw null;
        }
        c44.a.o();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams22 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d3 = this.f398895h;
        if (c22628xfde5d61d3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarImageView");
            throw null;
        }
        layoutParams22.f92438p = c22628xfde5d61d3.getId();
        android.widget.ImageView imageView2 = this.f398900m;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodShopImageView");
            throw null;
        }
        layoutParams22.f92440r = imageView2.getId();
        layoutParams22.f92426h = 0;
        layoutParams22.f92432k = 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams22).width = 0;
        layoutParams22.H = 1;
        c1073x7e08a787.addView(textView4, layoutParams22);
        android.widget.ImageView imageView3 = this.f398900m;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodShopImageView");
            throw null;
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams23 = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams((int) (c44.b.a(33) * i65.a.q(c1073x7e08a787.getContext())), (int) (c44.b.a(14) * i65.a.q(c1073x7e08a787.getContext())));
        android.widget.TextView textView5 = this.f398897j;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTextView");
            throw null;
        }
        layoutParams23.f92438p = textView5.getId();
        layoutParams23.f92441s = 0;
        layoutParams23.f92426h = 0;
        layoutParams23.f92432k = 0;
        layoutParams23.setMarginStart(c44.b.a(4));
        c1073x7e08a787.addView(imageView3, layoutParams23);
        linearLayout2.addView(c1073x7e08a787);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout3);
        this.f398901n = linearLayout3;
        c44.a.o();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout3.getLayoutParams();
            layoutParams24.width = -2;
            linearLayout3.setLayoutParams(layoutParams24);
        }
        c44.a.o();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams25 = linearLayout3.getLayoutParams();
            layoutParams25.height = -2;
            linearLayout3.setLayoutParams(layoutParams25);
        }
        c44.a.j();
        linearLayout3.setOrientation(0);
        int f18 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams27 = layoutParams26 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams26 : null;
        if (layoutParams27 != null) {
            layoutParams27.gravity = f18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams28 = linearLayout3.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams29 = layoutParams28 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams28 : null;
            if (layoutParams29 != null) {
                layoutParams29.gravity = f18;
            }
        }
        linearLayout3.setClipToOutline(true);
        linearLayout3.setOutlineProvider(new al5.z1(c44.b.a(6)));
        linearLayout3.setBackgroundColor(i65.a.d(linearLayout3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), c44.b.a(6), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), c44.b.a(6));
        linearLayout3.setPadding(c44.b.a(12), linearLayout3.getPaddingTop(), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), linearLayout3.getPaddingTop(), c44.b.a(12), linearLayout3.getPaddingBottom());
        linearLayout3.setForeground(linearLayout3.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563769da3));
        android.widget.ImageView imageView4 = new android.widget.ImageView(linearLayout3.getContext());
        linearLayout3.addView(imageView4);
        int a37 = c44.b.a(16);
        if (imageView4.getLayoutParams() == null) {
            c44.a.o();
            imageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a37, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams30 = imageView4.getLayoutParams();
            layoutParams30.width = a37;
            imageView4.setLayoutParams(layoutParams30);
        }
        int a38 = c44.b.a(16);
        if (imageView4.getLayoutParams() == null) {
            c44.a.o();
            imageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a38));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams31 = imageView4.getLayoutParams();
            layoutParams31.height = a38;
            imageView4.setLayoutParams(layoutParams31);
        }
        int a39 = c44.b.a(2);
        android.view.ViewGroup.LayoutParams layoutParams32 = imageView4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams32 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams32 : null;
        if (marginLayoutParams2 != null) {
            n3.u.g(marginLayoutParams2, a39);
        }
        c44.a.c();
        imageView4.setVisibility(8);
        int f19 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams33 = imageView4.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams34 = layoutParams33 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams33 : null;
        if (layoutParams34 != null) {
            layoutParams34.gravity = f19;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams35 = imageView4.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams36 = layoutParams35 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams35 : null;
            if (layoutParams36 != null) {
                layoutParams36.gravity = f19;
            }
        }
        imageView4.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        a84.v0.a(imageView4.getContext(), imageView4, 16, 16);
        this.f398899l = imageView4;
        android.widget.TextView textView6 = new android.widget.TextView(linearLayout3.getContext());
        linearLayout3.addView(textView6);
        this.f398898k = textView6;
        c44.a.o();
        if (textView6.getLayoutParams() == null) {
            c44.a.o();
            textView6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams37 = textView6.getLayoutParams();
            layoutParams37.width = -2;
            textView6.setLayoutParams(layoutParams37);
        }
        c44.a.o();
        if (textView6.getLayoutParams() == null) {
            c44.a.o();
            textView6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams38 = textView6.getLayoutParams();
            layoutParams38.height = -2;
            textView6.setLayoutParams(layoutParams38);
        }
        textView6.setMaxLines(1);
        if (i17 >= 28) {
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create2, "create(...)");
            textView6.setTypeface(create2, 0);
        }
        java.lang.String string = textView6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pct);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        textView6.setText(string);
        textView6.setTextSize(0, i65.a.j(textView6.getContext()) * i65.a.a(textView6.getContext(), 14.0f));
        textView6.setTextColor(i65.a.d(textView6.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        int f27 = c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams39 = textView6.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams40 = layoutParams39 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams39 : null;
        if (layoutParams40 != null) {
            layoutParams40.gravity = f27;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams41 = textView6.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams42 = layoutParams41 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams41 : null;
            if (layoutParams42 != null) {
                layoutParams42.gravity = f27;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardBottomComponent");
        return linearLayout;
    }
}

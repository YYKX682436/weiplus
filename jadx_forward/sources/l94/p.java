package l94;

/* loaded from: classes4.dex */
public final class p extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f398917h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f398918i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f398919j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super("WsFoldAdTitleComponent", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        r45.gr0 gr0Var;
        java.lang.String str;
        r45.gr0 gr0Var2;
        r45.gr0 gr0Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h(), "the fold sns info is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
            return;
        }
        android.widget.TextView textView = this.f398917h;
        java.lang.String str2 = "";
        if (textView != null) {
            java.lang.String str3 = b17.f453616s;
            if (str3 == null) {
                str3 = "";
            }
            textView.setText(str3);
        }
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("zh_CN", f17) ? !(p3321xbce91901.jvm.p3324x21ffc6bd.o.b("zh_HK", f17) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("zh_TW", f17) ? (gr0Var = b17.f453615r) == null || (str = gr0Var.f457030i) == null : (gr0Var2 = b17.f453615r) == null || (str = gr0Var2.f457031m) == null) : !((gr0Var3 = b17.f453615r) == null || (str = gr0Var3.f457029h) == null)) {
            str2 = str;
        }
        if (str2.length() > 0) {
            android.widget.TextView textView2 = this.f398919j;
            if (textView2 != null) {
                textView2.setText(str2);
            }
        } else {
            android.widget.TextView textView3 = this.f398919j;
            if (textView3 != null) {
                textView3.setText("Ad");
            }
        }
        android.view.ViewGroup viewGroup = this.f398918i;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new l94.o(this, adInfo));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(f());
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
        c44.a.j();
        linearLayout.setOrientation(0);
        linearLayout.setGravity(c44.a.f());
        android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
        linearLayout.addView(textView);
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams3.width = 0;
            textView.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            layoutParams4.height = -2;
            textView.setLayoutParams(layoutParams4);
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.weight = 1;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
            textView.setTypeface(create, 0);
        }
        textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        textView.setTextSize(0, i65.a.j(textView.getContext()) * i65.a.a(textView.getContext(), 14.0f));
        this.f398917h = textView;
        int a17 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams != null) {
            n3.u.h(marginLayoutParams, a17);
        }
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout2);
        this.f398918i = linearLayout2;
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams8 = linearLayout2.getLayoutParams();
            layoutParams8.width = -2;
            linearLayout2.setLayoutParams(layoutParams8);
        }
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout2.getLayoutParams();
            layoutParams9.height = -2;
            linearLayout2.setLayoutParams(layoutParams9);
        }
        linearLayout2.setGravity(c44.a.d());
        c44.a.j();
        linearLayout2.setOrientation(0);
        linearLayout2.setForeground(linearLayout2.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563770da4));
        linearLayout2.setPadding(c44.b.a(4), c44.b.a(2), c44.b.a(4), c44.b.a(2));
        linearLayout2.setClipToOutline(true);
        linearLayout2.setOutlineProvider(new al5.z1(c44.b.a(4)));
        android.widget.TextView textView2 = new android.widget.TextView(linearLayout2.getContext());
        linearLayout2.addView(textView2);
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = textView2.getLayoutParams();
            layoutParams10.width = -2;
            textView2.setLayoutParams(layoutParams10);
        }
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams11 = textView2.getLayoutParams();
            layoutParams11.height = -2;
            textView2.setLayoutParams(layoutParams11);
        }
        if (i17 >= 28) {
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 400, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create2, "create(...)");
            textView2.setTypeface(create2, 0);
        }
        textView2.setTextSize(0, i65.a.j(textView2.getContext()) * i65.a.a(textView2.getContext(), 12.0f));
        textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        this.f398919j = textView2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout2.getContext());
        linearLayout2.addView(c22699x3dcdb352);
        int a18 = c44.b.a(14);
        if (c22699x3dcdb352.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a18, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = c22699x3dcdb352.getLayoutParams();
            layoutParams12.width = a18;
            c22699x3dcdb352.setLayoutParams(layoutParams12);
        }
        int a19 = c44.b.a(7);
        if (c22699x3dcdb352.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a19));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = c22699x3dcdb352.getLayoutParams();
            layoutParams13.height = a19;
            c22699x3dcdb352.setLayoutParams(layoutParams13);
        }
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79514xecece9a);
        c22699x3dcdb352.m82040x7541828(i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
        return linearLayout;
    }
}

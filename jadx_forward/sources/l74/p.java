package l74;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final l74.p f398469a = new l74.p();

    public static final android.view.View a(android.content.Context context) {
        int i17;
        int i18;
        int i19;
        int i27;
        android.widget.LinearLayout linearLayout;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48;
        int i49;
        int i57;
        int i58;
        int i59;
        int i66;
        int i67;
        int i68;
        int i69;
        int i76;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFeedBackPersonalizedSwitchView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedBackPersonalizedSwitchView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
            return null;
        }
        l74.o oVar = new l74.o();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
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
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout2);
        c44.a.l();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
            layoutParams3.width = -1;
            linearLayout2.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
            layoutParams4.height = -2;
            linearLayout2.setLayoutParams(layoutParams4);
        }
        c44.a.m();
        linearLayout2.setOrientation(1);
        int h17 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.gravity = h17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams7 = linearLayout2.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.gravity = h17;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout2.getContext());
        linearLayout2.addView(c22699x3dcdb352);
        int a17 = c44.b.a(15);
        if (c22699x3dcdb352.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a17, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = c22699x3dcdb352.getLayoutParams();
            layoutParams9.width = a17;
            c22699x3dcdb352.setLayoutParams(layoutParams9);
        }
        int a18 = c44.b.a(6);
        if (c22699x3dcdb352.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = c22699x3dcdb352.getLayoutParams();
            layoutParams10.height = a18;
            c22699x3dcdb352.setLayoutParams(layoutParams10);
        }
        int h18 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams11 = c22699x3dcdb352.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams11 : null;
        if (layoutParams12 != null) {
            layoutParams12.gravity = h18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = c22699x3dcdb352.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams13 : null;
            if (layoutParams14 != null) {
                layoutParams14.gravity = h18;
            }
        }
        int a19 = c44.b.a(26);
        android.view.ViewGroup.LayoutParams layoutParams15 = c22699x3dcdb352.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams15 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams15 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = a19;
        }
        c22699x3dcdb352.setScaleType(c44.a.b());
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81071x1b15a5b0);
        c22699x3dcdb352.m82040x7541828(i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        oVar.E(c22699x3dcdb352);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
        linearLayout2.addView(linearLayout3);
        c44.a.m();
        linearLayout3.setOrientation(1);
        c44.a.l();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams16 = linearLayout3.getLayoutParams();
            layoutParams16.width = -1;
            linearLayout3.setLayoutParams(layoutParams16);
        }
        c44.a.o();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams17 = linearLayout3.getLayoutParams();
            layoutParams17.height = -2;
            linearLayout3.setLayoutParams(layoutParams17);
        }
        int h19 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams18 = linearLayout3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams19 = layoutParams18 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams18 : null;
        if (layoutParams19 != null) {
            layoutParams19.gravity = h19;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams20 = linearLayout3.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams21 = layoutParams20 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams20 : null;
            if (layoutParams21 != null) {
                layoutParams21.gravity = h19;
            }
        }
        linearLayout3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563636co3);
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout3.getContext());
        linearLayout3.addView(linearLayout4);
        c44.a.j();
        linearLayout4.setOrientation(0);
        c44.a.l();
        if (linearLayout4.getLayoutParams() == null) {
            c44.a.o();
            linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams22 = linearLayout4.getLayoutParams();
            layoutParams22.width = -1;
            linearLayout4.setLayoutParams(layoutParams22);
        }
        c44.a.o();
        if (linearLayout4.getLayoutParams() == null) {
            c44.a.o();
            linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams23 = linearLayout4.getLayoutParams();
            layoutParams23.height = -2;
            linearLayout4.setLayoutParams(layoutParams23);
        }
        linearLayout4.setPadding(c44.b.a(16), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), c44.b.a(16), linearLayout4.getPaddingBottom());
        int a27 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams24 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams24 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = a27;
        }
        int a28 = c44.b.a(12);
        android.view.ViewGroup.LayoutParams layoutParams25 = linearLayout4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams25 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams25 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.bottomMargin = a28;
        }
        android.widget.LinearLayout linearLayout5 = new android.widget.LinearLayout(linearLayout4.getContext());
        linearLayout4.addView(linearLayout5);
        android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout5.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams27 = layoutParams26 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams26 : null;
        if (layoutParams27 != null) {
            layoutParams27.weight = 1;
        }
        if (linearLayout5.getLayoutParams() == null) {
            c44.a.o();
            linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams28 = linearLayout5.getLayoutParams();
            layoutParams28.width = 0;
            linearLayout5.setLayoutParams(layoutParams28);
        }
        c44.a.o();
        if (linearLayout5.getLayoutParams() == null) {
            c44.a.o();
            linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams29 = linearLayout5.getLayoutParams();
            layoutParams29.height = -2;
            linearLayout5.setLayoutParams(layoutParams29);
        }
        int g17 = c44.a.g() | c44.a.i();
        android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout5.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams31 = layoutParams30 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams30 : null;
        if (layoutParams31 != null) {
            layoutParams31.gravity = g17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams32 = linearLayout5.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams33 = layoutParams32 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams32 : null;
            if (layoutParams33 != null) {
                layoutParams33.gravity = g17;
            }
        }
        c44.a.m();
        linearLayout5.setOrientation(1);
        int a29 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams34 = linearLayout5.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams34 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams34 : null;
        if (marginLayoutParams4 != null) {
            marginLayoutParams4.rightMargin = a29;
        }
        android.widget.TextView textView = new android.widget.TextView(linearLayout5.getContext());
        linearLayout5.addView(textView);
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams35 = textView.getLayoutParams();
            layoutParams35.width = -2;
            textView.setLayoutParams(layoutParams35);
        }
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams36 = textView.getLayoutParams();
            layoutParams36.height = -2;
            textView.setLayoutParams(layoutParams36);
        }
        textView.setIncludeFontPadding(false);
        int a37 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams37 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams37 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams37 : null;
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.bottomMargin = a37;
        }
        l74.p pVar = f398469a;
        textView.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_i));
        textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        int i77 = android.os.Build.VERSION.SDK_INT;
        if (i77 >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
            textView.setTypeface(create, 0);
        }
        textView.setMaxLines(1);
        textView.setEllipsize(c44.a.a());
        java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        textView.setText(string);
        android.widget.TextView textView2 = new android.widget.TextView(linearLayout5.getContext());
        linearLayout5.addView(textView2);
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            i17 = -2;
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i17 = -2;
            android.view.ViewGroup.LayoutParams layoutParams38 = textView2.getLayoutParams();
            layoutParams38.width = -2;
            textView2.setLayoutParams(layoutParams38);
        }
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams39 = textView2.getLayoutParams();
            layoutParams39.height = i17;
            textView2.setLayoutParams(layoutParams39);
        }
        textView2.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView2.setMaxLines(2);
        textView2.setEllipsize(c44.a.a());
        java.lang.String string2 = textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        textView2.setText(string2);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(linearLayout4.getContext());
        linearLayout4.addView(frameLayout2);
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            i18 = -2;
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i18 = -2;
            android.view.ViewGroup.LayoutParams layoutParams40 = frameLayout2.getLayoutParams();
            layoutParams40.width = -2;
            frameLayout2.setLayoutParams(layoutParams40);
        }
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams41 = frameLayout2.getLayoutParams();
            layoutParams41.height = i18;
            frameLayout2.setLayoutParams(layoutParams41);
        }
        android.widget.TextView textView3 = new android.widget.TextView(frameLayout2.getContext());
        frameLayout2.addView(textView3);
        c44.a.o();
        if (textView3.getLayoutParams() == null) {
            c44.a.o();
            i19 = -2;
            textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i19 = -2;
            android.view.ViewGroup.LayoutParams layoutParams42 = textView3.getLayoutParams();
            layoutParams42.width = -2;
            textView3.setLayoutParams(layoutParams42);
        }
        c44.a.o();
        if (textView3.getLayoutParams() == null) {
            c44.a.o();
            textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams43 = textView3.getLayoutParams();
            layoutParams43.height = i19;
            textView3.setLayoutParams(layoutParams43);
        }
        int h27 = c44.a.h() | c44.a.i();
        android.view.ViewGroup.LayoutParams layoutParams44 = textView3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams45 = layoutParams44 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams44 : null;
        if (layoutParams45 != null) {
            layoutParams45.gravity = h27;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams46 = textView3.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams47 = layoutParams46 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams46 : null;
            if (layoutParams47 != null) {
                layoutParams47.gravity = h27;
            }
        }
        textView3.setGravity(c44.a.d());
        textView3.setIncludeFontPadding(false);
        textView3.setPadding(c44.b.a(12), textView3.getPaddingTop(), textView3.getPaddingRight(), textView3.getPaddingBottom());
        textView3.setPadding(textView3.getPaddingLeft(), c44.b.a(8), textView3.getPaddingRight(), textView3.getPaddingBottom());
        textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), c44.b.a(12), textView3.getPaddingBottom());
        textView3.setPadding(textView3.getPaddingLeft(), textView3.getPaddingTop(), textView3.getPaddingRight(), c44.b.a(8));
        textView3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b0w);
        textView3.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        java.lang.String string3 = textView3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574719j84);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        textView3.setText(string3);
        textView3.setTextColor(i65.a.d(textView3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        if (i77 >= 28) {
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create2, "create(...)");
            textView3.setTypeface(create2, 0);
        }
        textView3.setMaxLines(1);
        oVar.j(textView3);
        android.widget.LinearLayout linearLayout6 = new android.widget.LinearLayout(linearLayout3.getContext());
        linearLayout3.addView(linearLayout6);
        c44.a.j();
        linearLayout6.setOrientation(0);
        c44.a.l();
        if (linearLayout6.getLayoutParams() == null) {
            c44.a.o();
            linearLayout6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams48 = linearLayout6.getLayoutParams();
            layoutParams48.width = -1;
            linearLayout6.setLayoutParams(layoutParams48);
        }
        c44.a.o();
        if (linearLayout6.getLayoutParams() == null) {
            c44.a.o();
            linearLayout6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams49 = linearLayout6.getLayoutParams();
            layoutParams49.height = -2;
            linearLayout6.setLayoutParams(layoutParams49);
        }
        linearLayout6.setPadding(c44.b.a(16), linearLayout6.getPaddingTop(), linearLayout6.getPaddingRight(), linearLayout6.getPaddingBottom());
        linearLayout6.setPadding(linearLayout6.getPaddingLeft(), linearLayout6.getPaddingTop(), c44.b.a(16), linearLayout6.getPaddingBottom());
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout6.getContext());
        linearLayout6.addView(frameLayout3);
        android.view.ViewGroup.LayoutParams layoutParams50 = frameLayout3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams51 = layoutParams50 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams50 : null;
        if (layoutParams51 != null) {
            layoutParams51.weight = 1;
        }
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams52 = frameLayout3.getLayoutParams();
            layoutParams52.width = 0;
            frameLayout3.setLayoutParams(layoutParams52);
        }
        c44.a.l();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams53 = frameLayout3.getLayoutParams();
            layoutParams53.height = -1;
            frameLayout3.setLayoutParams(layoutParams53);
        }
        frameLayout3.setClipToOutline(true);
        frameLayout3.setOutlineProvider(new al5.z1(i65.a.b(context, 4)));
        int a38 = c44.b.a(8);
        android.view.ViewGroup.LayoutParams layoutParams54 = frameLayout3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams54 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams54 : null;
        if (marginLayoutParams6 != null) {
            marginLayoutParams6.rightMargin = a38;
        }
        android.widget.LinearLayout linearLayout7 = new android.widget.LinearLayout(frameLayout3.getContext());
        frameLayout3.addView(linearLayout7);
        c44.a.l();
        if (linearLayout7.getLayoutParams() == null) {
            c44.a.o();
            i27 = -1;
            linearLayout7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            i27 = -1;
            android.view.ViewGroup.LayoutParams layoutParams55 = linearLayout7.getLayoutParams();
            layoutParams55.height = -1;
            linearLayout7.setLayoutParams(layoutParams55);
        }
        c44.a.l();
        if (linearLayout7.getLayoutParams() == null) {
            c44.a.o();
            linearLayout7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i27, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams56 = linearLayout7.getLayoutParams();
            layoutParams56.width = i27;
            linearLayout7.setLayoutParams(layoutParams56);
        }
        c44.a.m();
        linearLayout7.setOrientation(1);
        linearLayout7.setPadding(linearLayout7.getPaddingLeft(), c44.b.a(12), linearLayout7.getPaddingRight(), linearLayout7.getPaddingBottom());
        linearLayout7.setPadding(c44.b.a(12), linearLayout7.getPaddingTop(), linearLayout7.getPaddingRight(), linearLayout7.getPaddingBottom());
        linearLayout7.setPadding(linearLayout7.getPaddingLeft(), linearLayout7.getPaddingTop(), c44.b.a(12), linearLayout7.getPaddingBottom());
        linearLayout7.setPadding(linearLayout7.getPaddingLeft(), linearLayout7.getPaddingTop(), linearLayout7.getPaddingRight(), c44.b.a(14));
        linearLayout7.setBackgroundColor(i65.a.d(linearLayout7.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b));
        oVar.o(linearLayout7);
        android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(linearLayout7.getContext());
        linearLayout7.addView(frameLayout4);
        c44.a.l();
        if (frameLayout4.getLayoutParams() == null) {
            c44.a.o();
            frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams57 = frameLayout4.getLayoutParams();
            layoutParams57.width = -1;
            frameLayout4.setLayoutParams(layoutParams57);
        }
        c44.a.o();
        if (frameLayout4.getLayoutParams() == null) {
            c44.a.o();
            frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams58 = frameLayout4.getLayoutParams();
            layoutParams58.height = -2;
            frameLayout4.setLayoutParams(layoutParams58);
        }
        frameLayout4.setClipToOutline(true);
        frameLayout4.setOutlineProvider(new al5.z1(i65.a.b(context, 2)));
        int a39 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams59 = frameLayout4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams59 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams59 : null;
        if (marginLayoutParams7 != null) {
            marginLayoutParams7.bottomMargin = a39;
        }
        android.widget.LinearLayout linearLayout8 = new android.widget.LinearLayout(frameLayout4.getContext());
        frameLayout4.addView(linearLayout8);
        c44.a.j();
        linearLayout8.setOrientation(0);
        c44.a.l();
        if (linearLayout8.getLayoutParams() == null) {
            c44.a.o();
            linearLayout8.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams60 = linearLayout8.getLayoutParams();
            layoutParams60.width = -1;
            linearLayout8.setLayoutParams(layoutParams60);
        }
        c44.a.o();
        if (linearLayout8.getLayoutParams() == null) {
            c44.a.o();
            linearLayout8.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams61 = linearLayout8.getLayoutParams();
            layoutParams61.height = -2;
            linearLayout8.setLayoutParams(layoutParams61);
        }
        linearLayout8.setGravity(c44.a.f());
        oVar.u(linearLayout8);
        android.widget.LinearLayout linearLayout9 = new android.widget.LinearLayout(linearLayout8.getContext());
        linearLayout8.addView(linearLayout9);
        int a47 = c44.b.a(0);
        if (linearLayout9.getLayoutParams() == null) {
            c44.a.o();
            linearLayout = linearLayout2;
            linearLayout9.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a47, -2));
        } else {
            linearLayout = linearLayout2;
            android.view.ViewGroup.LayoutParams layoutParams62 = linearLayout9.getLayoutParams();
            layoutParams62.width = a47;
            linearLayout9.setLayoutParams(layoutParams62);
        }
        android.view.ViewGroup.LayoutParams layoutParams63 = linearLayout9.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams64 = layoutParams63 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams63 : null;
        if (layoutParams64 != null) {
            layoutParams64.weight = 1;
        }
        c44.a.o();
        if (linearLayout9.getLayoutParams() == null) {
            c44.a.o();
            linearLayout9.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams65 = linearLayout9.getLayoutParams();
            layoutParams65.height = -2;
            linearLayout9.setLayoutParams(layoutParams65);
        }
        c44.a.j();
        linearLayout9.setOrientation(0);
        linearLayout9.setGravity(c44.a.f());
        android.widget.TextView textView4 = new android.widget.TextView(linearLayout9.getContext());
        linearLayout9.addView(textView4);
        c44.a.o();
        if (textView4.getLayoutParams() == null) {
            c44.a.o();
            i28 = -2;
            textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i28 = -2;
            android.view.ViewGroup.LayoutParams layoutParams66 = textView4.getLayoutParams();
            layoutParams66.width = -2;
            textView4.setLayoutParams(layoutParams66);
        }
        c44.a.o();
        if (textView4.getLayoutParams() == null) {
            c44.a.o();
            textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i28, i28));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams67 = textView4.getLayoutParams();
            layoutParams67.height = i28;
            textView4.setLayoutParams(layoutParams67);
        }
        java.lang.String string4 = textView4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        textView4.setText(string4);
        textView4.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        textView4.setTextColor(i65.a.d(textView4.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        int a48 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams68 = textView4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams68 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams68 : null;
        if (marginLayoutParams8 != null) {
            n3.v.a(marginLayoutParams8, a48);
        }
        textView4.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView4.setMaxLines(1);
        oVar.s(textView4);
        android.widget.TextView textView5 = new android.widget.TextView(linearLayout9.getContext());
        linearLayout9.addView(textView5);
        c44.a.o();
        if (textView5.getLayoutParams() == null) {
            c44.a.o();
            i29 = -2;
            textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i29 = -2;
            android.view.ViewGroup.LayoutParams layoutParams69 = textView5.getLayoutParams();
            layoutParams69.width = -2;
            textView5.setLayoutParams(layoutParams69);
        }
        c44.a.o();
        if (textView5.getLayoutParams() == null) {
            c44.a.o();
            textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i29, i29));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams70 = textView5.getLayoutParams();
            layoutParams70.height = i29;
            textView5.setLayoutParams(layoutParams70);
        }
        java.lang.String string5 = textView5.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pae);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        textView5.setText(string5);
        if (i77 >= 28) {
            i37 = 0;
            android.graphics.Typeface create3 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create3, "create(...)");
            textView5.setTypeface(create3, 0);
        } else {
            i37 = 0;
        }
        textView5.setTextSize(i37, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_g));
        textView5.setTextColor(i65.a.d(textView5.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        textView5.setMaxLines(1);
        oVar.r(textView5);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout8.getContext());
        linearLayout8.addView(c22699x3dcdb3522);
        int a49 = c44.b.a(18);
        if (c22699x3dcdb3522.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3522.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a49, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams71 = c22699x3dcdb3522.getLayoutParams();
            layoutParams71.width = a49;
            c22699x3dcdb3522.setLayoutParams(layoutParams71);
        }
        int a57 = c44.b.a(18);
        if (c22699x3dcdb3522.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3522.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a57));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams72 = c22699x3dcdb3522.getLayoutParams();
            layoutParams72.height = a57;
            c22699x3dcdb3522.setLayoutParams(layoutParams72);
        }
        c22699x3dcdb3522.setScaleType(c44.a.b());
        c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f81068x43ff2a3f);
        c22699x3dcdb3522.m82040x7541828(i65.a.d(c22699x3dcdb3522.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb3522.setVisibility(4);
        oVar.m(c22699x3dcdb3522);
        android.view.View frameLayout5 = new android.widget.FrameLayout(frameLayout4.getContext());
        frameLayout4.addView(frameLayout5);
        c44.a.l();
        if (frameLayout5.getLayoutParams() == null) {
            c44.a.o();
            i38 = -1;
            frameLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i38 = -1;
            android.view.ViewGroup.LayoutParams layoutParams73 = frameLayout5.getLayoutParams();
            layoutParams73.width = -1;
            frameLayout5.setLayoutParams(layoutParams73);
        }
        c44.a.l();
        if (frameLayout5.getLayoutParams() == null) {
            c44.a.o();
            frameLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i38));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams74 = frameLayout5.getLayoutParams();
            layoutParams74.height = i38;
            frameLayout5.setLayoutParams(layoutParams74);
        }
        frameLayout5.setBackgroundColor(i65.a.d(frameLayout5.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.am_));
        oVar.t(frameLayout5);
        android.widget.FrameLayout frameLayout6 = new android.widget.FrameLayout(linearLayout7.getContext());
        linearLayout7.addView(frameLayout6);
        c44.a.l();
        if (frameLayout6.getLayoutParams() == null) {
            c44.a.o();
            i39 = -1;
            frameLayout6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i39 = -1;
            android.view.ViewGroup.LayoutParams layoutParams75 = frameLayout6.getLayoutParams();
            layoutParams75.width = -1;
            frameLayout6.setLayoutParams(layoutParams75);
        }
        c44.a.l();
        if (frameLayout6.getLayoutParams() == null) {
            c44.a.o();
            frameLayout6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i39));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams76 = frameLayout6.getLayoutParams();
            layoutParams76.height = i39;
            frameLayout6.setLayoutParams(layoutParams76);
        }
        frameLayout6.setClipToOutline(true);
        frameLayout6.setOutlineProvider(new al5.z1(i65.a.b(context, 2)));
        android.widget.TextView textView6 = new android.widget.TextView(frameLayout6.getContext());
        frameLayout6.addView(textView6);
        c44.a.l();
        if (textView6.getLayoutParams() == null) {
            c44.a.o();
            textView6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams77 = textView6.getLayoutParams();
            layoutParams77.width = -1;
            textView6.setLayoutParams(layoutParams77);
        }
        c44.a.o();
        if (textView6.getLayoutParams() == null) {
            c44.a.o();
            textView6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams78 = textView6.getLayoutParams();
            layoutParams78.height = -2;
            textView6.setLayoutParams(layoutParams78);
        }
        java.lang.String string6 = textView6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.paa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        textView6.setText(string6);
        textView6.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_g));
        textView6.setTextColor(i65.a.d(textView6.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        oVar.p(textView6);
        android.view.View frameLayout7 = new android.widget.FrameLayout(frameLayout6.getContext());
        frameLayout6.addView(frameLayout7);
        c44.a.l();
        if (frameLayout7.getLayoutParams() == null) {
            c44.a.o();
            i47 = -1;
            frameLayout7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i47 = -1;
            android.view.ViewGroup.LayoutParams layoutParams79 = frameLayout7.getLayoutParams();
            layoutParams79.width = -1;
            frameLayout7.setLayoutParams(layoutParams79);
        }
        c44.a.l();
        if (frameLayout7.getLayoutParams() == null) {
            c44.a.o();
            frameLayout7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i47));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams80 = frameLayout7.getLayoutParams();
            layoutParams80.height = i47;
            frameLayout7.setLayoutParams(layoutParams80);
        }
        frameLayout7.setBackgroundColor(i65.a.d(frameLayout7.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.am_));
        oVar.q(frameLayout7);
        android.view.View frameLayout8 = new android.widget.FrameLayout(frameLayout3.getContext());
        frameLayout3.addView(frameLayout8);
        c44.a.l();
        if (frameLayout8.getLayoutParams() == null) {
            c44.a.o();
            i48 = -1;
            frameLayout8.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            i48 = -1;
            android.view.ViewGroup.LayoutParams layoutParams81 = frameLayout8.getLayoutParams();
            layoutParams81.height = -1;
            frameLayout8.setLayoutParams(layoutParams81);
        }
        c44.a.l();
        if (frameLayout8.getLayoutParams() == null) {
            c44.a.o();
            frameLayout8.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i48, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams82 = frameLayout8.getLayoutParams();
            layoutParams82.width = i48;
            frameLayout8.setLayoutParams(layoutParams82);
        }
        oVar.n(frameLayout8);
        android.widget.FrameLayout frameLayout9 = new android.widget.FrameLayout(linearLayout6.getContext());
        linearLayout6.addView(frameLayout9);
        android.view.ViewGroup.LayoutParams layoutParams83 = frameLayout9.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams84 = layoutParams83 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams83 : null;
        if (layoutParams84 != null) {
            layoutParams84.weight = 1;
        }
        if (frameLayout9.getLayoutParams() == null) {
            c44.a.o();
            frameLayout9.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams85 = frameLayout9.getLayoutParams();
            layoutParams85.width = 0;
            frameLayout9.setLayoutParams(layoutParams85);
        }
        c44.a.l();
        if (frameLayout9.getLayoutParams() == null) {
            c44.a.o();
            frameLayout9.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams86 = frameLayout9.getLayoutParams();
            layoutParams86.height = -1;
            frameLayout9.setLayoutParams(layoutParams86);
        }
        frameLayout9.setClipToOutline(true);
        frameLayout9.setOutlineProvider(new al5.z1(i65.a.b(context, 4)));
        android.widget.LinearLayout linearLayout10 = new android.widget.LinearLayout(frameLayout9.getContext());
        frameLayout9.addView(linearLayout10);
        c44.a.l();
        if (linearLayout10.getLayoutParams() == null) {
            c44.a.o();
            i49 = -1;
            linearLayout10.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            i49 = -1;
            android.view.ViewGroup.LayoutParams layoutParams87 = linearLayout10.getLayoutParams();
            layoutParams87.height = -1;
            linearLayout10.setLayoutParams(layoutParams87);
        }
        c44.a.l();
        if (linearLayout10.getLayoutParams() == null) {
            c44.a.o();
            linearLayout10.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i49, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams88 = linearLayout10.getLayoutParams();
            layoutParams88.width = i49;
            linearLayout10.setLayoutParams(layoutParams88);
        }
        linearLayout10.setPadding(linearLayout10.getPaddingLeft(), c44.b.a(12), linearLayout10.getPaddingRight(), linearLayout10.getPaddingBottom());
        linearLayout10.setPadding(c44.b.a(12), linearLayout10.getPaddingTop(), linearLayout10.getPaddingRight(), linearLayout10.getPaddingBottom());
        linearLayout10.setPadding(linearLayout10.getPaddingLeft(), linearLayout10.getPaddingTop(), c44.b.a(12), linearLayout10.getPaddingBottom());
        linearLayout10.setPadding(linearLayout10.getPaddingLeft(), linearLayout10.getPaddingTop(), linearLayout10.getPaddingRight(), c44.b.a(14));
        c44.a.m();
        linearLayout10.setOrientation(1);
        linearLayout10.setBackgroundColor(i65.a.d(linearLayout10.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77626xb498cd1b));
        oVar.x(linearLayout10);
        android.widget.FrameLayout frameLayout10 = new android.widget.FrameLayout(linearLayout10.getContext());
        linearLayout10.addView(frameLayout10);
        c44.a.l();
        if (frameLayout10.getLayoutParams() == null) {
            c44.a.o();
            frameLayout10.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams89 = frameLayout10.getLayoutParams();
            layoutParams89.width = -1;
            frameLayout10.setLayoutParams(layoutParams89);
        }
        c44.a.o();
        if (frameLayout10.getLayoutParams() == null) {
            c44.a.o();
            frameLayout10.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams90 = frameLayout10.getLayoutParams();
            layoutParams90.height = -2;
            frameLayout10.setLayoutParams(layoutParams90);
        }
        frameLayout10.setClipToOutline(true);
        frameLayout10.setOutlineProvider(new al5.z1(i65.a.b(context, 2)));
        int a58 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams91 = frameLayout10.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams91 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams91 : null;
        if (marginLayoutParams9 != null) {
            marginLayoutParams9.bottomMargin = a58;
        }
        android.widget.LinearLayout linearLayout11 = new android.widget.LinearLayout(frameLayout10.getContext());
        frameLayout10.addView(linearLayout11);
        c44.a.j();
        linearLayout11.setOrientation(0);
        c44.a.l();
        if (linearLayout11.getLayoutParams() == null) {
            c44.a.o();
            linearLayout11.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams92 = linearLayout11.getLayoutParams();
            layoutParams92.width = -1;
            linearLayout11.setLayoutParams(layoutParams92);
        }
        c44.a.o();
        if (linearLayout11.getLayoutParams() == null) {
            c44.a.o();
            linearLayout11.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams93 = linearLayout11.getLayoutParams();
            layoutParams93.height = -2;
            linearLayout11.setLayoutParams(layoutParams93);
        }
        linearLayout11.setGravity(c44.a.f());
        oVar.C(linearLayout11);
        android.widget.TextView textView7 = new android.widget.TextView(linearLayout11.getContext());
        linearLayout11.addView(textView7);
        c44.a.o();
        if (textView7.getLayoutParams() == null) {
            c44.a.o();
            i57 = -2;
            textView7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i57 = -2;
            android.view.ViewGroup.LayoutParams layoutParams94 = textView7.getLayoutParams();
            layoutParams94.width = -2;
            textView7.setLayoutParams(layoutParams94);
        }
        c44.a.o();
        if (textView7.getLayoutParams() == null) {
            c44.a.o();
            textView7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i57, i57));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams95 = textView7.getLayoutParams();
            layoutParams95.height = i57;
            textView7.setLayoutParams(layoutParams95);
        }
        java.lang.String string7 = textView7.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pab);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
        textView7.setText(string7);
        textView7.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        textView7.setTextColor(i65.a.d(textView7.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView7.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView7.setMaxLines(1);
        oVar.A(textView7);
        android.view.View view = new android.view.View(linearLayout11.getContext());
        linearLayout11.addView(view);
        int a59 = c44.b.a(0);
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a59, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams96 = view.getLayoutParams();
            layoutParams96.width = a59;
            view.setLayoutParams(layoutParams96);
        }
        c44.a.l();
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams97 = view.getLayoutParams();
            layoutParams97.height = -1;
            view.setLayoutParams(layoutParams97);
        }
        android.view.ViewGroup.LayoutParams layoutParams98 = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams99 = layoutParams98 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams98 : null;
        if (layoutParams99 != null) {
            layoutParams99.weight = 1;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout11.getContext());
        linearLayout11.addView(c22699x3dcdb3523);
        int a67 = c44.b.a(18);
        if (c22699x3dcdb3523.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3523.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a67, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams100 = c22699x3dcdb3523.getLayoutParams();
            layoutParams100.width = a67;
            c22699x3dcdb3523.setLayoutParams(layoutParams100);
        }
        int a68 = c44.b.a(18);
        if (c22699x3dcdb3523.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3523.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a68));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams101 = c22699x3dcdb3523.getLayoutParams();
            layoutParams101.height = a68;
            c22699x3dcdb3523.setLayoutParams(layoutParams101);
        }
        c22699x3dcdb3523.setScaleType(c44.a.b());
        c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f81068x43ff2a3f);
        c22699x3dcdb3523.m82040x7541828(i65.a.d(c22699x3dcdb3523.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        c22699x3dcdb3523.setVisibility(4);
        oVar.v(c22699x3dcdb3523);
        android.view.View frameLayout11 = new android.widget.FrameLayout(frameLayout10.getContext());
        frameLayout10.addView(frameLayout11);
        c44.a.l();
        if (frameLayout11.getLayoutParams() == null) {
            c44.a.o();
            i58 = -1;
            frameLayout11.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i58 = -1;
            android.view.ViewGroup.LayoutParams layoutParams102 = frameLayout11.getLayoutParams();
            layoutParams102.width = -1;
            frameLayout11.setLayoutParams(layoutParams102);
        }
        c44.a.l();
        if (frameLayout11.getLayoutParams() == null) {
            c44.a.o();
            frameLayout11.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i58));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams103 = frameLayout11.getLayoutParams();
            layoutParams103.height = i58;
            frameLayout11.setLayoutParams(layoutParams103);
        }
        frameLayout11.setBackgroundColor(i65.a.d(frameLayout11.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.am_));
        oVar.B(frameLayout11);
        android.widget.FrameLayout frameLayout12 = new android.widget.FrameLayout(linearLayout10.getContext());
        linearLayout10.addView(frameLayout12);
        c44.a.l();
        if (frameLayout12.getLayoutParams() == null) {
            c44.a.o();
            i59 = -1;
            frameLayout12.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i59 = -1;
            android.view.ViewGroup.LayoutParams layoutParams104 = frameLayout12.getLayoutParams();
            layoutParams104.width = -1;
            frameLayout12.setLayoutParams(layoutParams104);
        }
        c44.a.l();
        if (frameLayout12.getLayoutParams() == null) {
            c44.a.o();
            frameLayout12.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i59));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams105 = frameLayout12.getLayoutParams();
            layoutParams105.height = i59;
            frameLayout12.setLayoutParams(layoutParams105);
        }
        frameLayout12.setClipToOutline(true);
        frameLayout12.setOutlineProvider(new al5.z1(i65.a.b(context, 2)));
        android.widget.TextView textView8 = new android.widget.TextView(frameLayout12.getContext());
        frameLayout12.addView(textView8);
        c44.a.l();
        if (textView8.getLayoutParams() == null) {
            c44.a.o();
            textView8.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams106 = textView8.getLayoutParams();
            layoutParams106.width = -1;
            textView8.setLayoutParams(layoutParams106);
        }
        c44.a.o();
        if (textView8.getLayoutParams() == null) {
            c44.a.o();
            textView8.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams107 = textView8.getLayoutParams();
            layoutParams107.height = -2;
            textView8.setLayoutParams(layoutParams107);
        }
        java.lang.String string8 = textView8.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pac);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
        textView8.setText(string8);
        textView8.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_g));
        textView8.setTextColor(i65.a.d(textView8.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        oVar.z(textView8);
        android.view.View frameLayout13 = new android.widget.FrameLayout(frameLayout12.getContext());
        frameLayout12.addView(frameLayout13);
        c44.a.l();
        if (frameLayout13.getLayoutParams() == null) {
            c44.a.o();
            i66 = -1;
            frameLayout13.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i66 = -1;
            android.view.ViewGroup.LayoutParams layoutParams108 = frameLayout13.getLayoutParams();
            layoutParams108.width = -1;
            frameLayout13.setLayoutParams(layoutParams108);
        }
        c44.a.l();
        if (frameLayout13.getLayoutParams() == null) {
            c44.a.o();
            frameLayout13.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, i66));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams109 = frameLayout13.getLayoutParams();
            layoutParams109.height = i66;
            frameLayout13.setLayoutParams(layoutParams109);
        }
        frameLayout13.setBackgroundColor(i65.a.d(frameLayout13.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.am_));
        oVar.y(frameLayout13);
        android.view.View frameLayout14 = new android.widget.FrameLayout(frameLayout9.getContext());
        frameLayout9.addView(frameLayout14);
        c44.a.l();
        if (frameLayout14.getLayoutParams() == null) {
            c44.a.o();
            i67 = -1;
            frameLayout14.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            i67 = -1;
            android.view.ViewGroup.LayoutParams layoutParams110 = frameLayout14.getLayoutParams();
            layoutParams110.height = -1;
            frameLayout14.setLayoutParams(layoutParams110);
        }
        c44.a.l();
        if (frameLayout14.getLayoutParams() == null) {
            c44.a.o();
            frameLayout14.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i67, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams111 = frameLayout14.getLayoutParams();
            layoutParams111.width = i67;
            frameLayout14.setLayoutParams(layoutParams111);
        }
        oVar.w(frameLayout14);
        android.view.View view2 = new android.view.View(linearLayout3.getContext());
        linearLayout3.addView(view2);
        c44.a.l();
        if (view2.getLayoutParams() == null) {
            c44.a.o();
            i68 = -2;
            view2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i68 = -2;
            android.view.ViewGroup.LayoutParams layoutParams112 = view2.getLayoutParams();
            layoutParams112.width = -1;
            view2.setLayoutParams(layoutParams112);
        }
        if (view2.getLayoutParams() == null) {
            c44.a.o();
            view2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i68, 1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams113 = view2.getLayoutParams();
            layoutParams113.height = 1;
            view2.setLayoutParams(layoutParams113);
        }
        int a69 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams114 = view2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams114 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams114 : null;
        if (marginLayoutParams10 != null) {
            marginLayoutParams10.topMargin = a69;
        }
        view2.setBackgroundColor(i65.a.d(view2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        android.widget.FrameLayout frameLayout15 = new android.widget.FrameLayout(linearLayout3.getContext());
        linearLayout3.addView(frameLayout15);
        c44.a.l();
        if (frameLayout15.getLayoutParams() == null) {
            c44.a.o();
            frameLayout15.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams115 = frameLayout15.getLayoutParams();
            layoutParams115.width = -1;
            frameLayout15.setLayoutParams(layoutParams115);
        }
        c44.a.o();
        if (frameLayout15.getLayoutParams() == null) {
            c44.a.o();
            frameLayout15.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams116 = frameLayout15.getLayoutParams();
            layoutParams116.height = -2;
            frameLayout15.setLayoutParams(layoutParams116);
        }
        int a76 = c44.b.a(16);
        frameLayout15.setPadding(a76, a76, a76, a76);
        oVar.k(frameLayout15);
        android.widget.TextView textView9 = new android.widget.TextView(frameLayout15.getContext());
        frameLayout15.addView(textView9);
        c44.a.o();
        if (textView9.getLayoutParams() == null) {
            c44.a.o();
            i69 = -2;
            textView9.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i69 = -2;
            android.view.ViewGroup.LayoutParams layoutParams117 = textView9.getLayoutParams();
            layoutParams117.width = -2;
            textView9.setLayoutParams(layoutParams117);
        }
        c44.a.o();
        if (textView9.getLayoutParams() == null) {
            c44.a.o();
            textView9.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i69, i69));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams118 = textView9.getLayoutParams();
            layoutParams118.height = i69;
            textView9.setLayoutParams(layoutParams118);
        }
        int g18 = c44.a.g() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams119 = textView9.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams120 = layoutParams119 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams119 : null;
        if (layoutParams120 != null) {
            layoutParams120.gravity = g18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams121 = textView9.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams122 = layoutParams121 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams121 : null;
            if (layoutParams122 != null) {
                layoutParams122.gravity = g18;
            }
        }
        int a77 = c44.b.a(48);
        android.view.ViewGroup.LayoutParams layoutParams123 = textView9.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams123 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams123 : null;
        if (marginLayoutParams11 != null) {
            marginLayoutParams11.rightMargin = a77;
        }
        java.lang.String string9 = textView9.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574716j81);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
        textView9.setText(string9);
        textView9.setIncludeFontPadding(false);
        textView9.setSingleLine(true);
        textView9.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView9.setTextColor(i65.a.d(textView9.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView9.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(frameLayout15.getContext());
        frameLayout15.addView(c22699x3dcdb3524);
        int a78 = c44.b.a(10);
        if (c22699x3dcdb3524.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3524.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a78, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams124 = c22699x3dcdb3524.getLayoutParams();
            layoutParams124.width = a78;
            c22699x3dcdb3524.setLayoutParams(layoutParams124);
        }
        int a79 = c44.b.a(20);
        if (c22699x3dcdb3524.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3524.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a79));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams125 = c22699x3dcdb3524.getLayoutParams();
            layoutParams125.height = a79;
            c22699x3dcdb3524.setLayoutParams(layoutParams125);
        }
        c22699x3dcdb3524.setScaleType(c44.a.b());
        int h28 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams126 = c22699x3dcdb3524.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams127 = layoutParams126 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams126 : null;
        if (layoutParams127 != null) {
            layoutParams127.gravity = h28;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams128 = c22699x3dcdb3524.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams129 = layoutParams128 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams128 : null;
            if (layoutParams129 != null) {
                layoutParams129.gravity = h28;
            }
        }
        c22699x3dcdb3524.setImageResource(com.p314xaae8f345.mm.R.raw.f81070x8adfab41);
        c22699x3dcdb3524.m82040x7541828(i65.a.d(c22699x3dcdb3524.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        android.view.View view3 = new android.view.View(linearLayout3.getContext());
        linearLayout3.addView(view3);
        c44.a.l();
        if (view3.getLayoutParams() == null) {
            c44.a.o();
            view3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams130 = view3.getLayoutParams();
            layoutParams130.width = -1;
            view3.setLayoutParams(layoutParams130);
        }
        int a86 = c44.b.a(8);
        if (view3.getLayoutParams() == null) {
            c44.a.o();
            view3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a86));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams131 = view3.getLayoutParams();
            layoutParams131.height = a86;
            view3.setLayoutParams(layoutParams131);
        }
        view3.setBackgroundColor(i65.a.d(view3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        oVar.D(view3);
        android.widget.FrameLayout frameLayout16 = new android.widget.FrameLayout(linearLayout3.getContext());
        linearLayout3.addView(frameLayout16);
        c44.a.l();
        if (frameLayout16.getLayoutParams() == null) {
            c44.a.o();
            frameLayout16.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams132 = frameLayout16.getLayoutParams();
            layoutParams132.width = -1;
            frameLayout16.setLayoutParams(layoutParams132);
        }
        c44.a.o();
        if (frameLayout16.getLayoutParams() == null) {
            c44.a.o();
            frameLayout16.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams133 = frameLayout16.getLayoutParams();
            layoutParams133.height = -2;
            frameLayout16.setLayoutParams(layoutParams133);
        }
        int a87 = c44.b.a(16);
        frameLayout16.setPadding(a87, a87, a87, a87);
        oVar.l(frameLayout16);
        android.widget.TextView textView10 = new android.widget.TextView(frameLayout16.getContext());
        frameLayout16.addView(textView10);
        c44.a.o();
        if (textView10.getLayoutParams() == null) {
            c44.a.o();
            i76 = -2;
            textView10.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i76 = -2;
            android.view.ViewGroup.LayoutParams layoutParams134 = textView10.getLayoutParams();
            layoutParams134.width = -2;
            textView10.setLayoutParams(layoutParams134);
        }
        c44.a.o();
        if (textView10.getLayoutParams() == null) {
            c44.a.o();
            textView10.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i76, i76));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams135 = textView10.getLayoutParams();
            layoutParams135.height = i76;
            textView10.setLayoutParams(layoutParams135);
        }
        int g19 = c44.a.g() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams136 = textView10.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams137 = layoutParams136 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams136 : null;
        if (layoutParams137 != null) {
            layoutParams137.gravity = g19;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams138 = textView10.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams139 = layoutParams138 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams138 : null;
            if (layoutParams139 != null) {
                layoutParams139.gravity = g19;
            }
        }
        int a88 = c44.b.a(48);
        android.view.ViewGroup.LayoutParams layoutParams140 = textView10.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams140 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams140 : null;
        if (marginLayoutParams12 != null) {
            marginLayoutParams12.rightMargin = a88;
        }
        java.lang.String string10 = textView10.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
        textView10.setText(string10);
        textView10.setIncludeFontPadding(false);
        textView10.setSingleLine(true);
        textView10.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView10.setTextColor(i65.a.d(textView10.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView10.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(frameLayout16.getContext());
        frameLayout16.addView(c22699x3dcdb3525);
        int a89 = c44.b.a(10);
        if (c22699x3dcdb3525.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3525.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a89, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams141 = c22699x3dcdb3525.getLayoutParams();
            layoutParams141.width = a89;
            c22699x3dcdb3525.setLayoutParams(layoutParams141);
        }
        int a96 = c44.b.a(20);
        if (c22699x3dcdb3525.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3525.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a96));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams142 = c22699x3dcdb3525.getLayoutParams();
            layoutParams142.height = a96;
            c22699x3dcdb3525.setLayoutParams(layoutParams142);
        }
        c22699x3dcdb3525.setScaleType(c44.a.b());
        int h29 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams143 = c22699x3dcdb3525.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams144 = layoutParams143 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams143 : null;
        if (layoutParams144 != null) {
            layoutParams144.gravity = h29;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams145 = c22699x3dcdb3525.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams146 = layoutParams145 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams145 : null;
            if (layoutParams146 != null) {
                layoutParams146.gravity = h29;
            }
        }
        c22699x3dcdb3525.setImageResource(com.p314xaae8f345.mm.R.raw.f81070x8adfab41);
        c22699x3dcdb3525.m82040x7541828(i65.a.d(c22699x3dcdb3525.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout.getContext());
        linearLayout.addView(c22699x3dcdb3526);
        int a97 = c44.b.a(15);
        if (c22699x3dcdb3526.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3526.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a97, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams147 = c22699x3dcdb3526.getLayoutParams();
            layoutParams147.width = a97;
            c22699x3dcdb3526.setLayoutParams(layoutParams147);
        }
        int a98 = c44.b.a(6);
        if (c22699x3dcdb3526.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3526.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a98));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams148 = c22699x3dcdb3526.getLayoutParams();
            layoutParams148.height = a98;
            c22699x3dcdb3526.setLayoutParams(layoutParams148);
        }
        int h37 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams149 = c22699x3dcdb3526.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams150 = layoutParams149 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams149 : null;
        if (layoutParams150 != null) {
            layoutParams150.gravity = h37;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams151 = c22699x3dcdb3526.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams152 = layoutParams151 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams151 : null;
            if (layoutParams152 != null) {
                layoutParams152.gravity = h37;
            }
        }
        int a99 = c44.b.a(26);
        android.view.ViewGroup.LayoutParams layoutParams153 = c22699x3dcdb3526.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams153 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams153 : null;
        if (marginLayoutParams13 != null) {
            marginLayoutParams13.rightMargin = a99;
        }
        c22699x3dcdb3526.setScaleType(c44.a.b());
        c22699x3dcdb3526.setImageResource(com.p314xaae8f345.mm.R.raw.f81071x1b15a5b0);
        c22699x3dcdb3526.m82040x7541828(i65.a.d(c22699x3dcdb3526.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        c22699x3dcdb3526.setRotation(180.0f);
        c44.a.c();
        c22699x3dcdb3526.setVisibility(8);
        oVar.i(c22699x3dcdb3526);
        frameLayout.setTag(com.p314xaae8f345.mm.R.id.qae, oVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedBackPersonalizedSwitchView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
        return frameLayout;
    }

    public static final android.view.View b(android.content.Context context) {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFeedbackView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
            return null;
        }
        l74.n nVar = new l74.n();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
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
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout);
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            layoutParams3.width = -1;
            linearLayout.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            layoutParams4.height = -2;
            linearLayout.setLayoutParams(layoutParams4);
        }
        c44.a.m();
        linearLayout.setOrientation(1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout.getContext());
        linearLayout.addView(c22699x3dcdb352);
        int a17 = c44.b.a(15);
        if (c22699x3dcdb352.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a17, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = c22699x3dcdb352.getLayoutParams();
            layoutParams5.width = a17;
            c22699x3dcdb352.setLayoutParams(layoutParams5);
        }
        int a18 = c44.b.a(6);
        if (c22699x3dcdb352.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = c22699x3dcdb352.getLayoutParams();
            layoutParams6.height = a18;
            c22699x3dcdb352.setLayoutParams(layoutParams6);
        }
        int h17 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams7 = c22699x3dcdb352.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 != null) {
            layoutParams8.gravity = h17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = c22699x3dcdb352.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams9 : null;
            if (layoutParams10 != null) {
                layoutParams10.gravity = h17;
            }
        }
        int a19 = c44.b.a(26);
        android.view.ViewGroup.LayoutParams layoutParams11 = c22699x3dcdb352.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = a19;
        }
        c22699x3dcdb352.setScaleType(c44.a.b());
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81071x1b15a5b0);
        c22699x3dcdb352.m82040x7541828(i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        nVar.k(c22699x3dcdb352);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout2);
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = linearLayout2.getLayoutParams();
            layoutParams12.width = -2;
            linearLayout2.setLayoutParams(layoutParams12);
        }
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = linearLayout2.getLayoutParams();
            layoutParams13.height = -2;
            linearLayout2.setLayoutParams(layoutParams13);
        }
        c44.a.m();
        linearLayout2.setOrientation(1);
        int h18 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams14 = linearLayout2.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams15 = layoutParams14 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams14 : null;
        if (layoutParams15 != null) {
            layoutParams15.gravity = h18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams16 = linearLayout2.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams17 = layoutParams16 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams16 : null;
            if (layoutParams17 != null) {
                layoutParams17.gravity = h18;
            }
        }
        linearLayout2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563636co3);
        android.widget.TextView textView = new android.widget.TextView(linearLayout2.getContext());
        linearLayout2.addView(textView);
        int a27 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams18 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams18 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams18 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = a27;
        }
        int a28 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams19 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams19 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams19 : null;
        if (marginLayoutParams3 != null) {
            n3.u.h(marginLayoutParams3, a28);
        }
        int a29 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams20 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams20 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams20 : null;
        if (marginLayoutParams4 != null) {
            n3.u.g(marginLayoutParams4, a29);
        }
        c44.a.l();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams21 = textView.getLayoutParams();
            layoutParams21.width = -1;
            textView.setLayoutParams(layoutParams21);
        }
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams22 = textView.getLayoutParams();
            layoutParams22.height = -2;
            textView.setLayoutParams(layoutParams22);
        }
        java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575372pa5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        textView.setText(string);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
            textView.setTypeface(create, 0);
        }
        textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        l74.p pVar = f398469a;
        textView.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_i));
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
        linearLayout2.addView(linearLayout3);
        c44.a.l();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams23 = linearLayout3.getLayoutParams();
            layoutParams23.width = -1;
            linearLayout3.setLayoutParams(layoutParams23);
        }
        c44.a.o();
        if (linearLayout3.getLayoutParams() == null) {
            c44.a.o();
            linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams24 = linearLayout3.getLayoutParams();
            layoutParams24.height = -2;
            linearLayout3.setLayoutParams(layoutParams24);
        }
        int a37 = c44.b.a(12);
        android.view.ViewGroup.LayoutParams layoutParams25 = linearLayout3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams25 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams25 : null;
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.topMargin = a37;
        }
        int a38 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams26 = linearLayout3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams26 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams26 : null;
        if (marginLayoutParams6 != null) {
            marginLayoutParams6.bottomMargin = a38;
        }
        int a39 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams27 = linearLayout3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams27 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams27 : null;
        if (marginLayoutParams7 != null) {
            n3.u.h(marginLayoutParams7, a39);
        }
        int a47 = c44.b.a(16);
        android.view.ViewGroup.LayoutParams layoutParams28 = linearLayout3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams28 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams28 : null;
        if (marginLayoutParams8 != null) {
            n3.u.g(marginLayoutParams8, a47);
        }
        c44.a.j();
        linearLayout3.setOrientation(0);
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout3.getContext());
        linearLayout3.addView(linearLayout4);
        c44.a.o();
        if (linearLayout4.getLayoutParams() == null) {
            c44.a.o();
            linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams29 = linearLayout4.getLayoutParams();
            layoutParams29.height = -2;
            linearLayout4.setLayoutParams(layoutParams29);
        }
        c44.a.o();
        if (linearLayout4.getLayoutParams() == null) {
            c44.a.o();
            linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams30 = linearLayout4.getLayoutParams();
            layoutParams30.width = -2;
            linearLayout4.setLayoutParams(layoutParams30);
        }
        linearLayout4.setPadding(c44.b.a(12), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), c44.b.a(12), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), c44.b.a(8), linearLayout4.getPaddingRight(), linearLayout4.getPaddingBottom());
        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), linearLayout4.getPaddingTop(), linearLayout4.getPaddingRight(), c44.b.a(8));
        int a48 = c44.b.a(12);
        android.view.ViewGroup.LayoutParams layoutParams31 = linearLayout4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams31 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams31 : null;
        if (marginLayoutParams9 != null) {
            n3.u.g(marginLayoutParams9, a48);
        }
        c44.a.j();
        linearLayout4.setOrientation(0);
        linearLayout4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b0w);
        linearLayout4.setGravity(c44.a.d());
        nVar.f(linearLayout4);
        android.widget.ImageView c22699x3dcdb3522 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout4.getContext());
        linearLayout4.addView(c22699x3dcdb3522);
        int a49 = c44.b.a(20);
        if (c22699x3dcdb3522.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3522.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a49, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams32 = c22699x3dcdb3522.getLayoutParams();
            layoutParams32.width = a49;
            c22699x3dcdb3522.setLayoutParams(layoutParams32);
        }
        int a57 = c44.b.a(20);
        if (c22699x3dcdb3522.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3522.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a57));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams33 = c22699x3dcdb3522.getLayoutParams();
            layoutParams33.height = a57;
            c22699x3dcdb3522.setLayoutParams(layoutParams33);
        }
        int a58 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams34 = c22699x3dcdb3522.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams34 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams34 : null;
        if (marginLayoutParams10 != null) {
            n3.u.g(marginLayoutParams10, a58);
        }
        c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f81067x2b6adfe8);
        nVar.g(c22699x3dcdb3522);
        android.widget.TextView textView2 = new android.widget.TextView(linearLayout4.getContext());
        linearLayout4.addView(textView2);
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            i17 = -2;
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i17 = -2;
            android.view.ViewGroup.LayoutParams layoutParams35 = textView2.getLayoutParams();
            layoutParams35.width = -2;
            textView2.setLayoutParams(layoutParams35);
        }
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, i17));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams36 = textView2.getLayoutParams();
            layoutParams36.height = i17;
            textView2.setLayoutParams(layoutParams36);
        }
        java.lang.String string2 = textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574718j83);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        textView2.setText(string2);
        textView2.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        android.widget.LinearLayout linearLayout5 = new android.widget.LinearLayout(linearLayout3.getContext());
        linearLayout3.addView(linearLayout5);
        c44.a.o();
        if (linearLayout5.getLayoutParams() == null) {
            c44.a.o();
            i18 = -2;
            linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i18 = -2;
            android.view.ViewGroup.LayoutParams layoutParams37 = linearLayout5.getLayoutParams();
            layoutParams37.height = -2;
            linearLayout5.setLayoutParams(layoutParams37);
        }
        c44.a.o();
        if (linearLayout5.getLayoutParams() == null) {
            c44.a.o();
            linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams38 = linearLayout5.getLayoutParams();
            layoutParams38.width = i18;
            linearLayout5.setLayoutParams(layoutParams38);
        }
        c44.a.j();
        linearLayout5.setOrientation(0);
        linearLayout5.setPadding(c44.b.a(12), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), linearLayout5.getPaddingBottom());
        linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), c44.b.a(12), linearLayout5.getPaddingBottom());
        linearLayout5.setPadding(linearLayout5.getPaddingLeft(), c44.b.a(8), linearLayout5.getPaddingRight(), linearLayout5.getPaddingBottom());
        linearLayout5.setPadding(linearLayout5.getPaddingLeft(), linearLayout5.getPaddingTop(), linearLayout5.getPaddingRight(), c44.b.a(8));
        linearLayout5.setGravity(c44.a.d());
        linearLayout5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b0w);
        nVar.e(linearLayout5);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout5.getContext());
        linearLayout5.addView(c22699x3dcdb3523);
        int a59 = c44.b.a(20);
        if (c22699x3dcdb3523.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3523.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a59, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams39 = c22699x3dcdb3523.getLayoutParams();
            layoutParams39.width = a59;
            c22699x3dcdb3523.setLayoutParams(layoutParams39);
        }
        int a67 = c44.b.a(20);
        if (c22699x3dcdb3523.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3523.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a67));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams40 = c22699x3dcdb3523.getLayoutParams();
            layoutParams40.height = a67;
            c22699x3dcdb3523.setLayoutParams(layoutParams40);
        }
        int a68 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams41 = c22699x3dcdb3523.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams41 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams41 : null;
        if (marginLayoutParams11 != null) {
            n3.u.g(marginLayoutParams11, a68);
        }
        int d17 = c44.a.d();
        android.view.ViewGroup.LayoutParams layoutParams42 = c22699x3dcdb3523.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams43 = layoutParams42 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams42 : null;
        if (layoutParams43 != null) {
            layoutParams43.gravity = d17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams44 = c22699x3dcdb3523.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams45 = layoutParams44 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams44 : null;
            if (layoutParams45 != null) {
                layoutParams45.gravity = d17;
            }
        }
        c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f81069x42ff49ff);
        c22699x3dcdb3523.m82040x7541828(i65.a.d(c22699x3dcdb3523.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        nVar.c(c22699x3dcdb3523);
        android.widget.TextView textView3 = new android.widget.TextView(linearLayout5.getContext());
        linearLayout5.addView(textView3);
        int d18 = c44.a.d();
        android.view.ViewGroup.LayoutParams layoutParams46 = textView3.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams47 = layoutParams46 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams46 : null;
        if (layoutParams47 != null) {
            layoutParams47.gravity = d18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams48 = textView3.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams49 = layoutParams48 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams48 : null;
            if (layoutParams49 != null) {
                layoutParams49.gravity = d18;
            }
        }
        c44.a.o();
        if (textView3.getLayoutParams() == null) {
            c44.a.o();
            i19 = -2;
            textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i19 = -2;
            android.view.ViewGroup.LayoutParams layoutParams50 = textView3.getLayoutParams();
            layoutParams50.width = -2;
            textView3.setLayoutParams(layoutParams50);
        }
        c44.a.o();
        if (textView3.getLayoutParams() == null) {
            c44.a.o();
            textView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams51 = textView3.getLayoutParams();
            layoutParams51.height = i19;
            textView3.setLayoutParams(layoutParams51);
        }
        java.lang.String string3 = textView3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574719j84);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        textView3.setText(string3);
        textView3.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        textView3.setTextColor(i65.a.d(textView3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        android.view.View view = new android.view.View(linearLayout2.getContext());
        linearLayout2.addView(view);
        c44.a.l();
        if (view.getLayoutParams() == null) {
            c44.a.o();
            i27 = -2;
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i27 = -2;
            android.view.ViewGroup.LayoutParams layoutParams52 = view.getLayoutParams();
            layoutParams52.width = -1;
            view.setLayoutParams(layoutParams52);
        }
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i27, 1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams53 = view.getLayoutParams();
            layoutParams53.height = 1;
            view.setLayoutParams(layoutParams53);
        }
        view.setBackgroundColor(i65.a.d(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(linearLayout2.getContext());
        linearLayout2.addView(frameLayout2);
        c44.a.l();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams54 = frameLayout2.getLayoutParams();
            layoutParams54.width = -1;
            frameLayout2.setLayoutParams(layoutParams54);
        }
        c44.a.o();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams55 = frameLayout2.getLayoutParams();
            layoutParams55.height = -2;
            frameLayout2.setLayoutParams(layoutParams55);
        }
        int a69 = c44.b.a(16);
        frameLayout2.setPadding(a69, a69, a69, a69);
        nVar.i(frameLayout2);
        android.widget.TextView textView4 = new android.widget.TextView(frameLayout2.getContext());
        frameLayout2.addView(textView4);
        c44.a.o();
        if (textView4.getLayoutParams() == null) {
            c44.a.o();
            i28 = -2;
            textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i28 = -2;
            android.view.ViewGroup.LayoutParams layoutParams56 = textView4.getLayoutParams();
            layoutParams56.width = -2;
            textView4.setLayoutParams(layoutParams56);
        }
        c44.a.o();
        if (textView4.getLayoutParams() == null) {
            c44.a.o();
            textView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i28, i28));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams57 = textView4.getLayoutParams();
            layoutParams57.height = i28;
            textView4.setLayoutParams(layoutParams57);
        }
        int g17 = c44.a.g() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams58 = textView4.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams59 = layoutParams58 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams58 : null;
        if (layoutParams59 != null) {
            layoutParams59.gravity = g17;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams60 = textView4.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams61 = layoutParams60 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams60 : null;
            if (layoutParams61 != null) {
                layoutParams61.gravity = g17;
            }
        }
        int a76 = c44.b.a(48);
        android.view.ViewGroup.LayoutParams layoutParams62 = textView4.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams62 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams62 : null;
        if (marginLayoutParams12 != null) {
            marginLayoutParams12.rightMargin = a76;
        }
        java.lang.String string4 = textView4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pad);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        textView4.setText(string4);
        textView4.setIncludeFontPadding(false);
        textView4.setSingleLine(true);
        textView4.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView4.setTextColor(i65.a.d(textView4.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView4.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(frameLayout2.getContext());
        frameLayout2.addView(c22699x3dcdb3524);
        int a77 = c44.b.a(10);
        if (c22699x3dcdb3524.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3524.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a77, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams63 = c22699x3dcdb3524.getLayoutParams();
            layoutParams63.width = a77;
            c22699x3dcdb3524.setLayoutParams(layoutParams63);
        }
        int a78 = c44.b.a(20);
        if (c22699x3dcdb3524.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3524.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a78));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams64 = c22699x3dcdb3524.getLayoutParams();
            layoutParams64.height = a78;
            c22699x3dcdb3524.setLayoutParams(layoutParams64);
        }
        c22699x3dcdb3524.setScaleType(c44.a.b());
        int h19 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams65 = c22699x3dcdb3524.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams66 = layoutParams65 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams65 : null;
        if (layoutParams66 != null) {
            layoutParams66.gravity = h19;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams67 = c22699x3dcdb3524.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams68 = layoutParams67 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams67 : null;
            if (layoutParams68 != null) {
                layoutParams68.gravity = h19;
            }
        }
        c22699x3dcdb3524.setImageResource(com.p314xaae8f345.mm.R.raw.f81070x8adfab41);
        c22699x3dcdb3524.m82040x7541828(i65.a.d(c22699x3dcdb3524.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        android.view.View view2 = new android.view.View(linearLayout2.getContext());
        linearLayout2.addView(view2);
        c44.a.l();
        if (view2.getLayoutParams() == null) {
            c44.a.o();
            i29 = -2;
            view2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            i29 = -2;
            android.view.ViewGroup.LayoutParams layoutParams69 = view2.getLayoutParams();
            layoutParams69.width = -1;
            view2.setLayoutParams(layoutParams69);
        }
        if (view2.getLayoutParams() == null) {
            c44.a.o();
            view2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i29, 1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams70 = view2.getLayoutParams();
            layoutParams70.height = 1;
            view2.setLayoutParams(layoutParams70);
        }
        view2.setBackgroundColor(i65.a.d(view2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout2.getContext());
        linearLayout2.addView(frameLayout3);
        c44.a.l();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams71 = frameLayout3.getLayoutParams();
            layoutParams71.width = -1;
            frameLayout3.setLayoutParams(layoutParams71);
        }
        c44.a.o();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams72 = frameLayout3.getLayoutParams();
            layoutParams72.height = -2;
            frameLayout3.setLayoutParams(layoutParams72);
        }
        int a79 = c44.b.a(16);
        frameLayout3.setPadding(a79, a79, a79, a79);
        nVar.d(frameLayout3);
        android.widget.TextView textView5 = new android.widget.TextView(frameLayout3.getContext());
        frameLayout3.addView(textView5);
        c44.a.o();
        if (textView5.getLayoutParams() == null) {
            c44.a.o();
            i37 = -2;
            textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i37 = -2;
            android.view.ViewGroup.LayoutParams layoutParams73 = textView5.getLayoutParams();
            layoutParams73.width = -2;
            textView5.setLayoutParams(layoutParams73);
        }
        c44.a.o();
        if (textView5.getLayoutParams() == null) {
            c44.a.o();
            textView5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i37, i37));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams74 = textView5.getLayoutParams();
            layoutParams74.height = i37;
            textView5.setLayoutParams(layoutParams74);
        }
        int g18 = c44.a.g() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams75 = textView5.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams76 = layoutParams75 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams75 : null;
        if (layoutParams76 != null) {
            layoutParams76.gravity = g18;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams77 = textView5.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams78 = layoutParams77 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams77 : null;
            if (layoutParams78 != null) {
                layoutParams78.gravity = g18;
            }
        }
        int a86 = c44.b.a(48);
        android.view.ViewGroup.LayoutParams layoutParams79 = textView5.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams79 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams79 : null;
        if (marginLayoutParams13 != null) {
            marginLayoutParams13.rightMargin = a86;
        }
        java.lang.String string5 = textView5.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574716j81);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
        textView5.setText(string5);
        textView5.setIncludeFontPadding(false);
        textView5.setSingleLine(true);
        textView5.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView5.setTextColor(i65.a.d(textView5.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView5.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(frameLayout3.getContext());
        frameLayout3.addView(c22699x3dcdb3525);
        int a87 = c44.b.a(10);
        if (c22699x3dcdb3525.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3525.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a87, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams80 = c22699x3dcdb3525.getLayoutParams();
            layoutParams80.width = a87;
            c22699x3dcdb3525.setLayoutParams(layoutParams80);
        }
        int a88 = c44.b.a(20);
        if (c22699x3dcdb3525.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3525.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a88));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams81 = c22699x3dcdb3525.getLayoutParams();
            layoutParams81.height = a88;
            c22699x3dcdb3525.setLayoutParams(layoutParams81);
        }
        c22699x3dcdb3525.setScaleType(c44.a.b());
        int h27 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams82 = c22699x3dcdb3525.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams83 = layoutParams82 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams82 : null;
        if (layoutParams83 != null) {
            layoutParams83.gravity = h27;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams84 = c22699x3dcdb3525.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams85 = layoutParams84 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams84 : null;
            if (layoutParams85 != null) {
                layoutParams85.gravity = h27;
            }
        }
        c22699x3dcdb3525.setImageResource(com.p314xaae8f345.mm.R.raw.f81070x8adfab41);
        c22699x3dcdb3525.m82040x7541828(i65.a.d(c22699x3dcdb3525.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        android.view.View view3 = new android.view.View(linearLayout2.getContext());
        linearLayout2.addView(view3);
        c44.a.l();
        if (view3.getLayoutParams() == null) {
            c44.a.o();
            view3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams86 = view3.getLayoutParams();
            layoutParams86.width = -1;
            view3.setLayoutParams(layoutParams86);
        }
        int a89 = c44.b.a(8);
        if (view3.getLayoutParams() == null) {
            c44.a.o();
            view3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a89));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams87 = view3.getLayoutParams();
            layoutParams87.height = a89;
            view3.setLayoutParams(layoutParams87);
        }
        view3.setBackgroundColor(i65.a.d(view3.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        nVar.j(view3);
        android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(linearLayout2.getContext());
        linearLayout2.addView(frameLayout4);
        c44.a.l();
        if (frameLayout4.getLayoutParams() == null) {
            c44.a.o();
            frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams88 = frameLayout4.getLayoutParams();
            layoutParams88.width = -1;
            frameLayout4.setLayoutParams(layoutParams88);
        }
        c44.a.o();
        if (frameLayout4.getLayoutParams() == null) {
            c44.a.o();
            frameLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams89 = frameLayout4.getLayoutParams();
            layoutParams89.height = -2;
            frameLayout4.setLayoutParams(layoutParams89);
        }
        int a96 = c44.b.a(16);
        frameLayout4.setPadding(a96, a96, a96, a96);
        nVar.h(frameLayout4);
        android.widget.TextView textView6 = new android.widget.TextView(frameLayout4.getContext());
        frameLayout4.addView(textView6);
        c44.a.o();
        if (textView6.getLayoutParams() == null) {
            c44.a.o();
            i38 = -2;
            textView6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            i38 = -2;
            android.view.ViewGroup.LayoutParams layoutParams90 = textView6.getLayoutParams();
            layoutParams90.width = -2;
            textView6.setLayoutParams(layoutParams90);
        }
        c44.a.o();
        if (textView6.getLayoutParams() == null) {
            c44.a.o();
            textView6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i38, i38));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams91 = textView6.getLayoutParams();
            layoutParams91.height = i38;
            textView6.setLayoutParams(layoutParams91);
        }
        int g19 = c44.a.g() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams92 = textView6.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams93 = layoutParams92 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams92 : null;
        if (layoutParams93 != null) {
            layoutParams93.gravity = g19;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams94 = textView6.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams95 = layoutParams94 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams94 : null;
            if (layoutParams95 != null) {
                layoutParams95.gravity = g19;
            }
        }
        int a97 = c44.b.a(48);
        android.view.ViewGroup.LayoutParams layoutParams96 = textView6.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams96 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams96 : null;
        if (marginLayoutParams14 != null) {
            marginLayoutParams14.rightMargin = a97;
        }
        java.lang.String string6 = textView6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pa7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
        textView6.setText(string6);
        textView6.setIncludeFontPadding(false);
        textView6.setSingleLine(true);
        textView6.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView6.setTextColor(i65.a.d(textView6.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        textView6.setTextSize(0, pVar.c(com.p314xaae8f345.mm.R.C30860x5b28f31.a_h));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(frameLayout4.getContext());
        frameLayout4.addView(c22699x3dcdb3526);
        int a98 = c44.b.a(10);
        if (c22699x3dcdb3526.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3526.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a98, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams97 = c22699x3dcdb3526.getLayoutParams();
            layoutParams97.width = a98;
            c22699x3dcdb3526.setLayoutParams(layoutParams97);
        }
        int a99 = c44.b.a(20);
        if (c22699x3dcdb3526.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3526.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a99));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams98 = c22699x3dcdb3526.getLayoutParams();
            layoutParams98.height = a99;
            c22699x3dcdb3526.setLayoutParams(layoutParams98);
        }
        c22699x3dcdb3526.setScaleType(c44.a.b());
        int h28 = c44.a.h() | c44.a.f();
        android.view.ViewGroup.LayoutParams layoutParams99 = c22699x3dcdb3526.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams100 = layoutParams99 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams99 : null;
        if (layoutParams100 != null) {
            layoutParams100.gravity = h28;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams101 = c22699x3dcdb3526.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams102 = layoutParams101 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams101 : null;
            if (layoutParams102 != null) {
                layoutParams102.gravity = h28;
            }
        }
        c22699x3dcdb3526.setImageResource(com.p314xaae8f345.mm.R.raw.f81070x8adfab41);
        c22699x3dcdb3526.m82040x7541828(i65.a.d(c22699x3dcdb3526.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(linearLayout.getContext());
        linearLayout.addView(c22699x3dcdb3527);
        int a100 = c44.b.a(15);
        if (c22699x3dcdb3527.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3527.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a100, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams103 = c22699x3dcdb3527.getLayoutParams();
            layoutParams103.width = a100;
            c22699x3dcdb3527.setLayoutParams(layoutParams103);
        }
        int a101 = c44.b.a(6);
        if (c22699x3dcdb3527.getLayoutParams() == null) {
            c44.a.o();
            c22699x3dcdb3527.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a101));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams104 = c22699x3dcdb3527.getLayoutParams();
            layoutParams104.height = a101;
            c22699x3dcdb3527.setLayoutParams(layoutParams104);
        }
        int h29 = c44.a.h();
        android.view.ViewGroup.LayoutParams layoutParams105 = c22699x3dcdb3527.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams106 = layoutParams105 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams105 : null;
        if (layoutParams106 != null) {
            layoutParams106.gravity = h29;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams107 = c22699x3dcdb3527.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams108 = layoutParams107 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams107 : null;
            if (layoutParams108 != null) {
                layoutParams108.gravity = h29;
            }
        }
        int a102 = c44.b.a(26);
        android.view.ViewGroup.LayoutParams layoutParams109 = c22699x3dcdb3527.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams109 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams109 : null;
        if (marginLayoutParams15 != null) {
            marginLayoutParams15.rightMargin = a102;
        }
        c22699x3dcdb3527.setScaleType(c44.a.b());
        c22699x3dcdb3527.setImageResource(com.p314xaae8f345.mm.R.raw.f81071x1b15a5b0);
        c22699x3dcdb3527.m82040x7541828(i65.a.d(c22699x3dcdb3527.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        c22699x3dcdb3527.setRotation(180.0f);
        c44.a.c();
        c22699x3dcdb3527.setVisibility(8);
        nVar.b(c22699x3dcdb3527);
        frameLayout.setTag(com.p314xaae8f345.mm.R.id.qae, nVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFeedbackView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
        return frameLayout;
    }

    public final int c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScaledTextSize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
        int j17 = (int) (i65.a.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * i65.a.f(r2, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScaledTextSize", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.ver2.FeedbackVer2ViewBuilder");
        return j17;
    }
}

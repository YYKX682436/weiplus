package bm;

/* loaded from: classes16.dex */
public class s extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_other_time_line_item_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup = c22869xb039b5f8;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.p(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.jdl);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.f(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_media_link_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f563660b26));
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f));
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e c22865x8b738e8e = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        if (c22865x8b738e8e == null) {
            c22865x8b738e8e = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e c22865x8b738e8e2 = c22865x8b738e8e;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.x(context, layoutParams, "X2CLinearLayout.LayoutParams", 16);
        i0Var.F(context, c22865x8b738e8e2, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, c22865x8b738e8e2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1, 42.0f, 0));
        i0Var.H(context, c22865x8b738e8e2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        c22865x8b738e8e2.setLayoutParams(layoutParams);
        viewGroup.addView(c22865x8b738e8e2);
        android.view.View view = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446) h(context, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", com.p314xaae8f345.mm.R.id.h9t);
        i0Var.B(context, layoutParams2, "X2CFrameLayout.LayoutParams", q(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 42.0f, 0));
        i0Var.y(context, layoutParams2, "X2CFrameLayout.LayoutParams", q(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 42.0f, 0));
        i0Var.C(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", q(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 350.0f, 0));
        i0Var.I(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        view2.setContentDescription(t(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", "@string/sns_img", com.p314xaae8f345.mm.R.C30867xcad56011.jar));
        i0Var.x(context, layoutParams2, "X2CFrameLayout.LayoutParams", 16);
        view2.setLayoutParams(layoutParams2);
        c22865x8b738e8e2.addView(view2);
        d(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", false, 2);
        android.view.View view3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 3);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.nh7);
        i0Var.B(context, layoutParams3, "X2CFrameLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        i0Var.y(context, layoutParams3, "X2CFrameLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        i0Var.C(context, view4, "com.tencent.mm.view.x2c.X2CImageView", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 1, 350.0f, 0));
        view4.setImportantForAccessibility(2);
        i0Var.x(context, layoutParams3, "X2CFrameLayout.LayoutParams", 17);
        view4.setLayoutParams(layoutParams3);
        c22865x8b738e8e2.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CImageView", false, 3);
        android.view.View view5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 4);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.chh);
        i0Var.B(context, layoutParams4, "X2CFrameLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 1, 42.0f, 0));
        i0Var.y(context, layoutParams4, "X2CFrameLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 1, 42.0f, 0));
        i0Var.D(context, view6, "com.tencent.mm.view.x2c.X2CTextView", s(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 3, 0));
        i0Var.l(context, view6, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CTextView", r(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@color/BG_0", com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        i0Var.P(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.x(context, layoutParams4, "X2CFrameLayout.LayoutParams", 16);
        view6.setLayoutParams(layoutParams4);
        c22865x8b738e8e2.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CTextView", false, 4);
        d(context, c22865x8b738e8e2, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 1);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        if (c22869xb039b5f82 == null) {
            c22869xb039b5f82 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f83 = c22869xb039b5f82;
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -1);
        i0Var.x(context, layoutParams5, "X2CLinearLayout.LayoutParams", 16);
        i0Var.o(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), 0, 0, 0);
        c22869xb039b5f83.setLayoutParams(layoutParams5);
        viewGroup.addView(c22869xb039b5f83);
        android.view.View view7 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 6);
        if (view7 == null) {
            view7 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, xn5.q0.f537238d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view8, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.odj);
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", -2);
        i0Var.J(context, view8, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.l(context, view8, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.N(context, view8, "com.tencent.mm.ui.widget.MMTextView", p(context, view8, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        i0Var.O(context, view8, "com.tencent.mm.ui.widget.MMTextView", u(context, view8, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        view8.setLayoutParams(layoutParams6);
        c22869xb039b5f83.addView(view8);
        d(context, view8, "com.tencent.mm.ui.widget.MMTextView", false, 6);
        android.view.View view9 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 7);
        if (view9 == null) {
            view9 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, xn5.q0.f537238d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view10, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.m4o);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.J(context, view10, "com.tencent.mm.ui.widget.MMTextView", true);
        i0Var.N(context, view10, "com.tencent.mm.ui.widget.MMTextView", p(context, view10, "com.tencent.mm.ui.widget.MMTextView", "@color/sns_word_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a6q));
        i0Var.O(context, view10, "com.tencent.mm.ui.widget.MMTextView", u(context, view10, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        view10.setLayoutParams(layoutParams7);
        c22869xb039b5f83.addView(view10);
        d(context, view10, "com.tencent.mm.ui.widget.MMTextView", false, 7);
        d(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 5);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        java.lang.String str2;
        int i18;
        xn5.i0 i0Var;
        int i19;
        android.content.Context context2;
        android.view.View view;
        android.content.Context context3;
        xn5.i0 i0Var2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7 c22867xec0faff7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446;
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var3 = xn5.j0.f537218a;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (c22869xb039b5f82 != null) {
                i0Var3.p(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.jdl);
                i0Var3.f(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_media_link_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f563660b26));
                i0Var3.H(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
                c22869xb039b5f8 = c22869xb039b5f82;
                str2 = "com.tencent.mm.view.x2c.X2CLinearLayout";
                i18 = 0;
                i0Var = i0Var3;
                i19 = i17;
                context2 = context;
                i0Var3.d(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f));
            } else {
                c22869xb039b5f8 = c22869xb039b5f82;
                str2 = "com.tencent.mm.view.x2c.X2CLinearLayout";
                i18 = 0;
                i0Var = i0Var3;
                i19 = i17;
                context2 = context;
            }
            g(context2, c22869xb039b5f8, str2, i18);
            view = c22869xb039b5f8;
        } else {
            str2 = "com.tencent.mm.view.x2c.X2CLinearLayout";
            i18 = 0;
            i0Var = i0Var3;
            i19 = i17;
            context2 = context;
            view = null;
        }
        if (i19 == 1) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
            if (view != null) {
                context3 = context2;
                i0Var2 = i0Var;
                str3 = str2;
                i0Var2.F(context3, view, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 1, 42.0f, 0));
                i0Var2.H(context3, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
            } else {
                context3 = context2;
                i0Var2 = i0Var;
                str3 = str2;
            }
            g(context3, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        } else {
            context3 = context2;
            i0Var2 = i0Var;
            str3 = str2;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d4462 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446) h(context3, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
            if (c18146x7d99d4462 != null) {
                i0Var2.p(context3, c18146x7d99d4462, "com.tencent.mm.plugin.sns.ui.TagImageView", com.p314xaae8f345.mm.R.id.h9t);
                c18146x7d99d446 = c18146x7d99d4462;
                i0Var2.C(context3, c18146x7d99d446, "com.tencent.mm.plugin.sns.ui.TagImageView", q(context, c18146x7d99d4462, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 350.0f, 0));
                i0Var2.I(context3, c18146x7d99d446, "com.tencent.mm.plugin.sns.ui.TagImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                c18146x7d99d446.setContentDescription(t(context, c18146x7d99d446, "com.tencent.mm.plugin.sns.ui.TagImageView", "@string/sns_img", com.p314xaae8f345.mm.R.C30867xcad56011.jar));
            } else {
                c18146x7d99d446 = c18146x7d99d4462;
            }
            g(context3, c18146x7d99d446, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
            view = c18146x7d99d446;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7 c22867xec0faff72 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context3, "com.tencent.mm.view.x2c.X2CImageView", 3);
            if (c22867xec0faff72 != null) {
                i0Var2.p(context3, c22867xec0faff72, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.nh7);
                c22867xec0faff7 = c22867xec0faff72;
                i0Var2.C(context3, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", q(context, c22867xec0faff72, "com.tencent.mm.view.x2c.X2CImageView", 1, 350.0f, 0));
                c22867xec0faff7.setImportantForAccessibility(2);
            } else {
                c22867xec0faff7 = c22867xec0faff72;
            }
            g(context3, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", 3);
            view = c22867xec0faff7;
        }
        if (i17 == 4) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context3, "com.tencent.mm.view.x2c.X2CTextView", 4);
            if (view != null) {
                i0Var2.p(context3, view, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.chh);
                i0Var2.D(context3, view, "com.tencent.mm.view.x2c.X2CTextView", s(context, view, "com.tencent.mm.view.x2c.X2CTextView", 3, 0));
                i0Var2.l(context3, view, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var2.o(context3, view, "com.tencent.mm.view.x2c.X2CTextView", 17);
                i0Var2.f(context3, view, "com.tencent.mm.view.x2c.X2CTextView", r(context, view, "com.tencent.mm.view.x2c.X2CTextView", "@color/BG_0", com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
                i0Var2.P(context3, view, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            g(context3, view, "com.tencent.mm.view.x2c.X2CTextView", 4);
        }
        if (i17 == 5) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context3, str3, 5);
            if (view != null) {
                i0Var2.o(context3, view, str3, 16);
                i0Var2.H(context3, view, str3, 1);
            }
            g(context3, view, str3, 5);
        }
        if (i17 == 6) {
            view = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context3, "com.tencent.mm.ui.widget.MMTextView", 6);
            if (view != null) {
                i0Var2.p(context3, view, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.odj);
                i0Var2.J(context3, view, "com.tencent.mm.ui.widget.MMTextView", false);
                i0Var2.l(context3, view, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
                i0Var2.N(context3, view, "com.tencent.mm.ui.widget.MMTextView", p(context, view, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                i0Var2.O(context3, view, "com.tencent.mm.ui.widget.MMTextView", u(context, view, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
            }
            g(context3, view, "com.tencent.mm.ui.widget.MMTextView", 6);
        }
        if (i17 == 7) {
            view = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context3, "com.tencent.mm.ui.widget.MMTextView", 7);
            if (view != null) {
                i0Var2.p(context3, view, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.m4o);
                i0Var2.J(context3, view, "com.tencent.mm.ui.widget.MMTextView", true);
                i0Var2.N(context3, view, "com.tencent.mm.ui.widget.MMTextView", p(context, view, "com.tencent.mm.ui.widget.MMTextView", "@color/sns_word_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a6q));
                i0Var2.O(context3, view, "com.tencent.mm.ui.widget.MMTextView", u(context, view, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
            }
            g(context3, view, "com.tencent.mm.ui.widget.MMTextView", 7);
        }
        if (i17 == 7) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.csy;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Other_Time_Line_Item_X2c_X2C";
    }
}

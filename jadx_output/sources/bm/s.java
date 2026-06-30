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
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup = x2CLinearLayout;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.p(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.jdl);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.f(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_media_link_bg", com.tencent.mm.R.drawable.f482127b26));
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f));
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        com.tencent.mm.view.x2c.X2CFrameLayout x2CFrameLayout = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        if (x2CFrameLayout == null) {
            x2CFrameLayout = new com.tencent.mm.view.x2c.X2CFrameLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CFrameLayout x2CFrameLayout2 = x2CFrameLayout;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.x(context, layoutParams, "X2CLinearLayout.LayoutParams", 16);
        i0Var.F(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1, 42.0f, 0));
        i0Var.H(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        x2CFrameLayout2.setLayoutParams(layoutParams);
        viewGroup.addView(x2CFrameLayout2);
        android.view.View view = (com.tencent.mm.plugin.sns.ui.TagImageView) h(context, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
        if (view == null) {
            view = new com.tencent.mm.plugin.sns.ui.TagImageView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", com.tencent.mm.R.id.h9t);
        i0Var.B(context, layoutParams2, "X2CFrameLayout.LayoutParams", q(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 42.0f, 0));
        i0Var.y(context, layoutParams2, "X2CFrameLayout.LayoutParams", q(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 42.0f, 0));
        i0Var.C(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", q(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 350.0f, 0));
        i0Var.I(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        view2.setContentDescription(t(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", "@string/sns_img", com.tencent.mm.R.string.jar));
        i0Var.x(context, layoutParams2, "X2CFrameLayout.LayoutParams", 16);
        view2.setLayoutParams(layoutParams2);
        x2CFrameLayout2.addView(view2);
        d(context, view2, "com.tencent.mm.plugin.sns.ui.TagImageView", false, 2);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 3);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.nh7);
        i0Var.B(context, layoutParams3, "X2CFrameLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479693cs));
        i0Var.y(context, layoutParams3, "X2CFrameLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479693cs));
        i0Var.C(context, view4, "com.tencent.mm.view.x2c.X2CImageView", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 1, 350.0f, 0));
        view4.setImportantForAccessibility(2);
        i0Var.x(context, layoutParams3, "X2CFrameLayout.LayoutParams", 17);
        view4.setLayoutParams(layoutParams3);
        x2CFrameLayout2.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CImageView", false, 3);
        android.view.View view5 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 4);
        if (view5 == null) {
            view5 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.chh);
        i0Var.B(context, layoutParams4, "X2CFrameLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 1, 42.0f, 0));
        i0Var.y(context, layoutParams4, "X2CFrameLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 1, 42.0f, 0));
        i0Var.D(context, view6, "com.tencent.mm.view.x2c.X2CTextView", s(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 3, 0));
        i0Var.l(context, view6, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CTextView", r(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@color/BG_0", com.tencent.mm.R.color.f478489a));
        i0Var.P(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.x(context, layoutParams4, "X2CFrameLayout.LayoutParams", 16);
        view6.setLayoutParams(layoutParams4);
        x2CFrameLayout2.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CTextView", false, 4);
        d(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 1);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        if (x2CLinearLayout2 == null) {
            x2CLinearLayout2 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -1);
        i0Var.x(context, layoutParams5, "X2CLinearLayout.LayoutParams", 16);
        i0Var.o(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), 0, 0, 0);
        x2CLinearLayout3.setLayoutParams(layoutParams5);
        viewGroup.addView(x2CLinearLayout3);
        android.view.View view7 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 6);
        if (view7 == null) {
            view7 = new com.tencent.mm.ui.widget.MMTextView(context, xn5.q0.f455705d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view8, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.odj);
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", -2);
        i0Var.J(context, view8, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.l(context, view8, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.N(context, view8, "com.tencent.mm.ui.widget.MMTextView", p(context, view8, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", com.tencent.mm.R.color.a0c));
        i0Var.O(context, view8, "com.tencent.mm.ui.widget.MMTextView", u(context, view8, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479853h2));
        view8.setLayoutParams(layoutParams6);
        x2CLinearLayout3.addView(view8);
        d(context, view8, "com.tencent.mm.ui.widget.MMTextView", false, 6);
        android.view.View view9 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 7);
        if (view9 == null) {
            view9 = new com.tencent.mm.ui.widget.MMTextView(context, xn5.q0.f455705d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view10, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.m4o);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.J(context, view10, "com.tencent.mm.ui.widget.MMTextView", true);
        i0Var.N(context, view10, "com.tencent.mm.ui.widget.MMTextView", p(context, view10, "com.tencent.mm.ui.widget.MMTextView", "@color/sns_word_color", com.tencent.mm.R.color.a6q));
        i0Var.O(context, view10, "com.tencent.mm.ui.widget.MMTextView", u(context, view10, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        view10.setLayoutParams(layoutParams7);
        x2CLinearLayout3.addView(view10);
        d(context, view10, "com.tencent.mm.ui.widget.MMTextView", false, 7);
        d(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 5);
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
        com.tencent.mm.view.x2c.X2CImageView x2CImageView;
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView;
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var3 = xn5.j0.f455685a;
        if (i17 == 0) {
            com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CLinearLayout2 != null) {
                i0Var3.p(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.jdl);
                i0Var3.f(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_media_link_bg", com.tencent.mm.R.drawable.f482127b26));
                i0Var3.H(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
                x2CLinearLayout = x2CLinearLayout2;
                str2 = "com.tencent.mm.view.x2c.X2CLinearLayout";
                i18 = 0;
                i0Var = i0Var3;
                i19 = i17;
                context2 = context;
                i0Var3.d(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479563f));
            } else {
                x2CLinearLayout = x2CLinearLayout2;
                str2 = "com.tencent.mm.view.x2c.X2CLinearLayout";
                i18 = 0;
                i0Var = i0Var3;
                i19 = i17;
                context2 = context;
            }
            g(context2, x2CLinearLayout, str2, i18);
            view = x2CLinearLayout;
        } else {
            str2 = "com.tencent.mm.view.x2c.X2CLinearLayout";
            i18 = 0;
            i0Var = i0Var3;
            i19 = i17;
            context2 = context;
            view = null;
        }
        if (i19 == 1) {
            view = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
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
            com.tencent.mm.plugin.sns.ui.TagImageView tagImageView2 = (com.tencent.mm.plugin.sns.ui.TagImageView) h(context3, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
            if (tagImageView2 != null) {
                i0Var2.p(context3, tagImageView2, "com.tencent.mm.plugin.sns.ui.TagImageView", com.tencent.mm.R.id.h9t);
                tagImageView = tagImageView2;
                i0Var2.C(context3, tagImageView, "com.tencent.mm.plugin.sns.ui.TagImageView", q(context, tagImageView2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 350.0f, 0));
                i0Var2.I(context3, tagImageView, "com.tencent.mm.plugin.sns.ui.TagImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                tagImageView.setContentDescription(t(context, tagImageView, "com.tencent.mm.plugin.sns.ui.TagImageView", "@string/sns_img", com.tencent.mm.R.string.jar));
            } else {
                tagImageView = tagImageView2;
            }
            g(context3, tagImageView, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
            view = tagImageView;
        }
        if (i17 == 3) {
            com.tencent.mm.view.x2c.X2CImageView x2CImageView2 = (com.tencent.mm.view.x2c.X2CImageView) h(context3, "com.tencent.mm.view.x2c.X2CImageView", 3);
            if (x2CImageView2 != null) {
                i0Var2.p(context3, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.nh7);
                x2CImageView = x2CImageView2;
                i0Var2.C(context3, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", q(context, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", 1, 350.0f, 0));
                x2CImageView.setImportantForAccessibility(2);
            } else {
                x2CImageView = x2CImageView2;
            }
            g(context3, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", 3);
            view = x2CImageView;
        }
        if (i17 == 4) {
            view = (com.tencent.mm.view.x2c.X2CTextView) h(context3, "com.tencent.mm.view.x2c.X2CTextView", 4);
            if (view != null) {
                i0Var2.p(context3, view, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.chh);
                i0Var2.D(context3, view, "com.tencent.mm.view.x2c.X2CTextView", s(context, view, "com.tencent.mm.view.x2c.X2CTextView", 3, 0));
                i0Var2.l(context3, view, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var2.o(context3, view, "com.tencent.mm.view.x2c.X2CTextView", 17);
                i0Var2.f(context3, view, "com.tencent.mm.view.x2c.X2CTextView", r(context, view, "com.tencent.mm.view.x2c.X2CTextView", "@color/BG_0", com.tencent.mm.R.color.f478489a));
                i0Var2.P(context3, view, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            g(context3, view, "com.tencent.mm.view.x2c.X2CTextView", 4);
        }
        if (i17 == 5) {
            view = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context3, str3, 5);
            if (view != null) {
                i0Var2.o(context3, view, str3, 16);
                i0Var2.H(context3, view, str3, 1);
            }
            g(context3, view, str3, 5);
        }
        if (i17 == 6) {
            view = (com.tencent.mm.ui.widget.MMTextView) h(context3, "com.tencent.mm.ui.widget.MMTextView", 6);
            if (view != null) {
                i0Var2.p(context3, view, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.odj);
                i0Var2.J(context3, view, "com.tencent.mm.ui.widget.MMTextView", false);
                i0Var2.l(context3, view, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
                i0Var2.N(context3, view, "com.tencent.mm.ui.widget.MMTextView", p(context, view, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", com.tencent.mm.R.color.a0c));
                i0Var2.O(context3, view, "com.tencent.mm.ui.widget.MMTextView", u(context, view, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479853h2));
            }
            g(context3, view, "com.tencent.mm.ui.widget.MMTextView", 6);
        }
        if (i17 == 7) {
            view = (com.tencent.mm.ui.widget.MMTextView) h(context3, "com.tencent.mm.ui.widget.MMTextView", 7);
            if (view != null) {
                i0Var2.p(context3, view, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.m4o);
                i0Var2.J(context3, view, "com.tencent.mm.ui.widget.MMTextView", true);
                i0Var2.N(context3, view, "com.tencent.mm.ui.widget.MMTextView", p(context, view, "com.tencent.mm.ui.widget.MMTextView", "@color/sns_word_color", com.tencent.mm.R.color.a6q));
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
    public int getLayoutId() {
        return com.tencent.mm.R.layout.csy;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Other_Time_Line_Item_X2c_X2C";
    }
}

package bm;

/* loaded from: classes16.dex */
public class p extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_media_music_item_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        android.view.ViewGroup viewGroup = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.o(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup2.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.ViewGroup viewGroup3 = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) h(context, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
        if (viewGroup3 == null) {
            viewGroup3 = new com.tencent.mm.ui.widget.RoundCornerRelativeLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup4 = viewGroup3;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", com.tencent.mm.R.id.m7z);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1, 268.0f, 0));
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479649bo));
        viewGroup4.setLayoutParams(layoutParams);
        viewGroup2.addView(viewGroup4);
        android.view.View view = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 2);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CView", com.tencent.mm.R.id.asz);
        i0Var.B(context, layoutParams2, "RoundCornerRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams2, "RoundCornerRelativeLayout.LayoutParams", -1);
        view2.setLayoutParams(layoutParams2);
        viewGroup4.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CView", false, 2);
        android.view.ViewGroup viewGroup5 = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
        if (viewGroup5 == null) {
            viewGroup5 = new com.tencent.mm.view.x2c.X2CFrameLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup6 = viewGroup5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams3, "RoundCornerRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams3, "RoundCornerRelativeLayout.LayoutParams", -1);
        viewGroup6.setLayoutParams(layoutParams3);
        viewGroup4.addView(viewGroup6);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup7 = x2CLinearLayout;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.jyc);
        i0Var.f(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_music_mv_light_gradient_bg", com.tencent.mm.R.drawable.b29));
        i0Var.B(context, layoutParams4, "X2CFrameLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams4, "X2CFrameLayout.LayoutParams", -1);
        i0Var.o(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup7.setLayoutParams(layoutParams4);
        viewGroup6.addView(viewGroup7);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 5);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bpn);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479649bo));
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479649bo));
        i0Var.I(context, view4, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view4, "com.tencent.mm.view.x2c.X2CImageView", r(context, view4, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/music_mv_cover_empty_lightmode", com.tencent.mm.R.drawable.ar7));
        view4.setLayoutParams(layoutParams5);
        viewGroup7.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CImageView", false, 5);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        if (x2CLinearLayout2 == null) {
            x2CLinearLayout2 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 0.0f, 0));
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", -1);
        i0Var.A(context, layoutParams6, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.o(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0, 0, 0);
        x2CLinearLayout3.setLayoutParams(layoutParams6);
        viewGroup7.addView(x2CLinearLayout3);
        android.view.View view5 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 7);
        if (view5 == null) {
            view5 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bpr);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.l(context, view6, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.J(context, view6, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.N(context, view6, "com.tencent.mm.view.x2c.X2CTextView", p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@color/normal_text_color", com.tencent.mm.R.color.a0c));
        i0Var.O(context, view6, "com.tencent.mm.view.x2c.X2CTextView", u(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
        view6.setLayoutParams(layoutParams7);
        x2CLinearLayout3.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CTextView", false, 7);
        android.view.View view7 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 8);
        if (view7 == null) {
            view7 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bpq);
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.l(context, view8, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.D(context, view8, "com.tencent.mm.view.x2c.X2CTextView", s(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        i0Var.L(context, view8, "com.tencent.mm.view.x2c.X2CTextView", t(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "BTS防弹少年团BTS防弹少年团", 0));
        i0Var.N(context, view8, "com.tencent.mm.view.x2c.X2CTextView", p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@color/desc_text_color", com.tencent.mm.R.color.f478873jj));
        i0Var.O(context, view8, "com.tencent.mm.view.x2c.X2CTextView", u(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
        i0Var.P(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.c(context, layoutParams8, "X2CLinearLayout.LayoutParams", 0, q(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 1, 4.0f, 0), 0, 0);
        view8.setLayoutParams(layoutParams8);
        x2CLinearLayout3.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CTextView", false, 8);
        android.view.View view9 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 9);
        if (view9 == null) {
            view9 = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view10, "com.tencent.mm.view.x2c.X2CView", com.tencent.mm.R.id.knz);
        i0Var.B(context, layoutParams9, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams9, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.view.x2c.X2CView", 1, 0.0f, 0));
        i0Var.A(context, layoutParams9, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.P(context, view10, "com.tencent.mm.view.x2c.X2CView", 8);
        view10.setLayoutParams(layoutParams9);
        x2CLinearLayout3.addView(view10);
        d(context, view10, "com.tencent.mm.view.x2c.X2CView", false, 9);
        android.view.View view11 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
        if (view11 == null) {
            view11 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view12 = view11;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bpp);
        i0Var.B(context, layoutParams10, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams10, "X2CLinearLayout.LayoutParams", -2);
        i0Var.l(context, view12, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.MIDDLE);
        i0Var.J(context, view12, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.N(context, view12, "com.tencent.mm.view.x2c.X2CTextView", p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
        i0Var.O(context, view12, "com.tencent.mm.view.x2c.X2CTextView", u(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479580w));
        i0Var.P(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.c(context, layoutParams10, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        view12.setLayoutParams(layoutParams10);
        x2CLinearLayout3.addView(view12);
        d(context, view12, "com.tencent.mm.view.x2c.X2CTextView", false, 10);
        d(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 6);
        android.view.View view13 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 11);
        if (view13 == null) {
            view13 = new com.tencent.mm.ui.widget.imageview.WeImageView(context, xn5.q0.f455705d);
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", com.tencent.mm.R.id.bpo);
        i0Var.B(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 26.0f, 0));
        i0Var.y(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 26.0f, 0));
        i0Var.I(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", android.widget.ImageView.ScaleType.FIT_CENTER);
        i0Var.K(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_play2", com.tencent.mm.R.raw.icons_outlined_play2));
        i0Var.d(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0));
        i0Var.c(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9), 0, q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9), 0);
        view14.setLayoutParams(layoutParams11);
        viewGroup7.addView(view14);
        d(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 11);
        d(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 4);
        d(context, viewGroup6, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 3);
        d(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", false, 1);
        d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup2;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        int i18;
        int i19;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.lang.String str2;
        android.content.Context context2;
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f455685a;
        if (i17 == 0) {
            view = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) h(context, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setId(com.tencent.mm.R.id.m7z);
            }
            g(context, roundCornerRelativeLayout, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
            view = roundCornerRelativeLayout;
        }
        if (i17 == 2) {
            view = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 2);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.asz);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CView", 2);
        }
        if (i17 == 3) {
            view = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
            g(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
        }
        if (i17 == 4) {
            com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
            if (x2CLinearLayout2 != null) {
                i0Var.p(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.jyc);
                x2CLinearLayout = x2CLinearLayout2;
                i0Var.f(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_music_mv_light_gradient_bg", com.tencent.mm.R.drawable.b29));
                i0Var.o(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            } else {
                x2CLinearLayout = x2CLinearLayout2;
            }
            g(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
            view = x2CLinearLayout;
        }
        if (i17 == 5) {
            com.tencent.mm.view.x2c.X2CImageView x2CImageView = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 5);
            if (x2CImageView != null) {
                i0Var.p(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bpn);
                i0Var.I(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var.K(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", r(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/music_mv_cover_empty_lightmode", com.tencent.mm.R.drawable.ar7));
            }
            g(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", 5);
            view = x2CImageView;
        }
        if (i17 == 6) {
            view = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        }
        if (i17 == 7) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 7);
            if (x2CTextView != null) {
                i0Var.p(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bpr);
                i0Var.l(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.J(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", true);
                i0Var.N(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", p(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@color/normal_text_color", com.tencent.mm.R.color.a0c));
                i0Var.O(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", u(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
            }
            g(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 7);
            view = x2CTextView;
        }
        if (i17 == 8) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView2 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 8);
            if (x2CTextView2 != null) {
                i0Var.p(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bpq);
                i0Var.l(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.D(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", s(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                i0Var.L(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", t(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", "BTS防弹少年团BTS防弹少年团", 0));
                i0Var.N(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", p(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", "@color/desc_text_color", com.tencent.mm.R.color.f478873jj));
                i0Var.O(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", u(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
                i0Var.P(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            g(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 8);
            view = x2CTextView2;
        }
        if (i17 == 9) {
            view = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 9);
            if (view != null) {
                i0Var.p(context, view, "com.tencent.mm.view.x2c.X2CView", com.tencent.mm.R.id.knz);
                i0Var.P(context, view, "com.tencent.mm.view.x2c.X2CView", 8);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CView", 9);
        }
        if (i17 == 10) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
            if (x2CTextView3 != null) {
                i0Var.p(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bpp);
                i0Var.l(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.MIDDLE);
                i0Var.J(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", true);
                i0Var.N(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", p(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
                i0Var.O(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", u(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479580w));
                i0Var.P(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            g(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 10);
            view = x2CTextView3;
        }
        if (i17 == 11) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 11);
            if (weImageView2 != null) {
                i0Var.p(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", com.tencent.mm.R.id.bpo);
                i0Var.I(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", android.widget.ImageView.ScaleType.FIT_CENTER);
                i0Var.K(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_play2", com.tencent.mm.R.raw.icons_outlined_play2));
                weImageView = weImageView2;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i18 = 11;
                i19 = i17;
                context2 = context;
                i0Var.d(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", q(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0));
            } else {
                weImageView = weImageView2;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i18 = 11;
                i19 = i17;
                context2 = context;
            }
            g(context2, weImageView, str2, i18);
            view = weImageView;
        } else {
            i18 = 11;
            i19 = i17;
        }
        if (i19 == i18) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.csl;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Media_Music_Item_X2c_X2C";
    }
}

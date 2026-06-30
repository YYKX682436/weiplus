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
        android.view.ViewGroup viewGroup = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.o(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup2.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.ViewGroup viewGroup3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) h(context, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
        if (viewGroup3 == null) {
            viewGroup3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup4 = viewGroup3;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", com.p314xaae8f345.mm.R.id.m7z);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1, 268.0f, 0));
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, viewGroup4, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo));
        viewGroup4.setLayoutParams(layoutParams);
        viewGroup2.addView(viewGroup4);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 2);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CView", com.p314xaae8f345.mm.R.id.asz);
        i0Var.B(context, layoutParams2, "RoundCornerRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams2, "RoundCornerRelativeLayout.LayoutParams", -1);
        view2.setLayoutParams(layoutParams2);
        viewGroup4.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CView", false, 2);
        android.view.ViewGroup viewGroup5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
        if (viewGroup5 == null) {
            viewGroup5 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup6 = viewGroup5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams3, "RoundCornerRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams3, "RoundCornerRelativeLayout.LayoutParams", -1);
        viewGroup6.setLayoutParams(layoutParams3);
        viewGroup4.addView(viewGroup6);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup7 = c22869xb039b5f8;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.jyc);
        i0Var.f(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_music_mv_light_gradient_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.b29));
        i0Var.B(context, layoutParams4, "X2CFrameLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams4, "X2CFrameLayout.LayoutParams", -1);
        i0Var.o(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup7, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup7.setLayoutParams(layoutParams4);
        viewGroup6.addView(viewGroup7);
        android.view.View view3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 5);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bpn);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo));
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo));
        i0Var.I(context, view4, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view4, "com.tencent.mm.view.x2c.X2CImageView", r(context, view4, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/music_mv_cover_empty_lightmode", com.p314xaae8f345.mm.R.C30861xcebc809e.ar7));
        view4.setLayoutParams(layoutParams5);
        viewGroup7.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CImageView", false, 5);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        if (c22869xb039b5f82 == null) {
            c22869xb039b5f82 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f83 = c22869xb039b5f82;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 0.0f, 0));
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", -1);
        i0Var.A(context, layoutParams6, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.o(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0, 0, 0);
        c22869xb039b5f83.setLayoutParams(layoutParams6);
        viewGroup7.addView(c22869xb039b5f83);
        android.view.View view5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 7);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bpr);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.l(context, view6, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.J(context, view6, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.N(context, view6, "com.tencent.mm.view.x2c.X2CTextView", p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@color/normal_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        i0Var.O(context, view6, "com.tencent.mm.view.x2c.X2CTextView", u(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
        view6.setLayoutParams(layoutParams7);
        c22869xb039b5f83.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CTextView", false, 7);
        android.view.View view7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 8);
        if (view7 == null) {
            view7 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bpq);
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.l(context, view8, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.D(context, view8, "com.tencent.mm.view.x2c.X2CTextView", s(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        i0Var.L(context, view8, "com.tencent.mm.view.x2c.X2CTextView", t(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "BTS防弹少年团BTS防弹少年团", 0));
        i0Var.N(context, view8, "com.tencent.mm.view.x2c.X2CTextView", p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@color/desc_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        i0Var.O(context, view8, "com.tencent.mm.view.x2c.X2CTextView", u(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        i0Var.P(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.c(context, layoutParams8, "X2CLinearLayout.LayoutParams", 0, q(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 1, 4.0f, 0), 0, 0);
        view8.setLayoutParams(layoutParams8);
        c22869xb039b5f83.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CTextView", false, 8);
        android.view.View view9 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 9);
        if (view9 == null) {
            view9 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee(context, xn5.q0.f537238d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view10, "com.tencent.mm.view.x2c.X2CView", com.p314xaae8f345.mm.R.id.knz);
        i0Var.B(context, layoutParams9, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams9, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.view.x2c.X2CView", 1, 0.0f, 0));
        i0Var.A(context, layoutParams9, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.P(context, view10, "com.tencent.mm.view.x2c.X2CView", 8);
        view10.setLayoutParams(layoutParams9);
        c22869xb039b5f83.addView(view10);
        d(context, view10, "com.tencent.mm.view.x2c.X2CView", false, 9);
        android.view.View view11 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
        if (view11 == null) {
            view11 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view12 = view11;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bpp);
        i0Var.B(context, layoutParams10, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams10, "X2CLinearLayout.LayoutParams", -2);
        i0Var.l(context, view12, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.MIDDLE);
        i0Var.J(context, view12, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.N(context, view12, "com.tencent.mm.view.x2c.X2CTextView", p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        i0Var.O(context, view12, "com.tencent.mm.view.x2c.X2CTextView", u(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561113w));
        i0Var.P(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.c(context, layoutParams10, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        view12.setLayoutParams(layoutParams10);
        c22869xb039b5f83.addView(view12);
        d(context, view12, "com.tencent.mm.view.x2c.X2CTextView", false, 10);
        d(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 6);
        android.view.View view13 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 11);
        if (view13 == null) {
            view13 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context, xn5.q0.f537238d);
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", com.p314xaae8f345.mm.R.id.bpo);
        i0Var.B(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 26.0f, 0));
        i0Var.y(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 26.0f, 0));
        i0Var.I(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", android.widget.ImageView.ScaleType.FIT_CENTER);
        i0Var.K(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_play2", com.p314xaae8f345.mm.R.raw.f80264x8f433126));
        i0Var.d(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0));
        i0Var.c(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, q(context, view14, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0);
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
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        java.lang.String str2;
        android.content.Context context2;
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 0) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159) h(context, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
            if (c22645x24069159 != null) {
                c22645x24069159.setId(com.p314xaae8f345.mm.R.id.m7z);
            }
            g(context, c22645x24069159, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
            view = c22645x24069159;
        }
        if (i17 == 2) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 2);
            if (view != null) {
                view.setId(com.p314xaae8f345.mm.R.id.asz);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CView", 2);
        }
        if (i17 == 3) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
            g(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
        }
        if (i17 == 4) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
            if (c22869xb039b5f82 != null) {
                i0Var.p(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.jyc);
                c22869xb039b5f8 = c22869xb039b5f82;
                i0Var.f(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_music_mv_light_gradient_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.b29));
                i0Var.o(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            } else {
                c22869xb039b5f8 = c22869xb039b5f82;
            }
            g(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
            view = c22869xb039b5f8;
        }
        if (i17 == 5) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7 c22867xec0faff7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 5);
            if (c22867xec0faff7 != null) {
                i0Var.p(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bpn);
                i0Var.I(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var.K(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", r(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/music_mv_cover_empty_lightmode", com.p314xaae8f345.mm.R.C30861xcebc809e.ar7));
            }
            g(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", 5);
            view = c22867xec0faff7;
        }
        if (i17 == 6) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        }
        if (i17 == 7) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 7);
            if (c22880x7ae7913b != null) {
                i0Var.p(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bpr);
                i0Var.l(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.J(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", true);
                i0Var.N(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", p(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", "@color/normal_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                i0Var.O(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", u(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
            }
            g(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 7);
            view = c22880x7ae7913b;
        }
        if (i17 == 8) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b2 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 8);
            if (c22880x7ae7913b2 != null) {
                i0Var.p(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bpq);
                i0Var.l(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.D(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", s(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                i0Var.L(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", t(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", "BTS防弹少年团BTS防弹少年团", 0));
                i0Var.N(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", p(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", "@color/desc_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
                i0Var.O(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", u(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
                i0Var.P(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            g(context, c22880x7ae7913b2, "com.tencent.mm.view.x2c.X2CTextView", 8);
            view = c22880x7ae7913b2;
        }
        if (i17 == 9) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 9);
            if (view != null) {
                i0Var.p(context, view, "com.tencent.mm.view.x2c.X2CView", com.p314xaae8f345.mm.R.id.knz);
                i0Var.P(context, view, "com.tencent.mm.view.x2c.X2CView", 8);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CView", 9);
        }
        if (i17 == 10) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
            if (c22880x7ae7913b3 != null) {
                i0Var.p(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bpp);
                i0Var.l(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.MIDDLE);
                i0Var.J(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", true);
                i0Var.N(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", p(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
                i0Var.O(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", u(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561113w));
                i0Var.P(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            g(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 10);
            view = c22880x7ae7913b3;
        }
        if (i17 == 11) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 11);
            if (c22699x3dcdb3522 != null) {
                i0Var.p(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", com.p314xaae8f345.mm.R.id.bpo);
                i0Var.I(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", android.widget.ImageView.ScaleType.FIT_CENTER);
                i0Var.K(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_play2", com.p314xaae8f345.mm.R.raw.f80264x8f433126));
                c22699x3dcdb352 = c22699x3dcdb3522;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i18 = 11;
                i19 = i17;
                context2 = context;
                i0Var.d(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", q(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), q(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0));
            } else {
                c22699x3dcdb352 = c22699x3dcdb3522;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i18 = 11;
                i19 = i17;
                context2 = context;
            }
            g(context2, c22699x3dcdb352, str2, i18);
            view = c22699x3dcdb352;
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
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.csl;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Media_Music_Item_X2c_X2C";
    }
}

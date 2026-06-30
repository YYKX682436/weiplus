package bm;

/* loaded from: classes16.dex */
public class o extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_item_error_tip_x2c";
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
        i0Var.p(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.na6);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.f(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", com.p314xaae8f345.mm.R.C30861xcebc809e.adw));
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 18.0f, 0));
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 18.0f, 0));
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/state_failed", com.p314xaae8f345.mm.R.C30861xcebc809e.b3i));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 10.0f, 0), 0, q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 6.0f, 0), 0);
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 1);
        android.view.View view3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.kzw);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams2, "X2CLinearLayout.LayoutParams", 17);
        i0Var.o(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 3);
        i0Var.L(context, view4, "com.tencent.mm.view.x2c.X2CTextView", t(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_error_touch_again", com.p314xaae8f345.mm.R.C30867xcad56011.jds));
        i0Var.N(context, view4, "com.tencent.mm.view.x2c.X2CTextView", p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a6q));
        i0Var.d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0), 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        int i18;
        int i19;
        android.view.View view2;
        android.view.View view3;
        java.lang.String str2;
        android.content.Context context2;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 0) {
            android.view.View view4 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view4 != null) {
                i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.na6);
                i0Var.f(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", com.p314xaae8f345.mm.R.C30861xcebc809e.adw));
                i0Var.o(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            view = view4;
        } else {
            view = null;
        }
        android.view.View view5 = view;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7 c22867xec0faff7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
            if (c22867xec0faff7 != null) {
                c22867xec0faff7.setImageDrawable(r(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/state_failed", com.p314xaae8f345.mm.R.C30861xcebc809e.b3i));
            }
            g(context, c22867xec0faff7, "com.tencent.mm.view.x2c.X2CImageView", 1);
            view5 = c22867xec0faff7;
        }
        if (i17 == 2) {
            android.view.View view6 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (view6 != null) {
                i0Var.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.kzw);
                i0Var.o(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 3);
                i0Var.L(context, view6, "com.tencent.mm.view.x2c.X2CTextView", t(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_error_touch_again", com.p314xaae8f345.mm.R.C30867xcad56011.jds));
                i0Var.N(context, view6, "com.tencent.mm.view.x2c.X2CTextView", p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a6q));
                view3 = view6;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                i18 = 2;
                i19 = i17;
                context2 = context;
                i0Var.d(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 0, q(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0), 0, q(context, view6, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
            } else {
                view3 = view6;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                i18 = 2;
                i19 = i17;
                context2 = context;
            }
            g(context2, view3, str2, i18);
            view2 = view3;
        } else {
            i18 = 2;
            i19 = i17;
            view2 = view5;
        }
        if (i19 == i18) {
            n();
        }
        return view2;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cs7;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Item_Error_Tip_X2c_X2C";
    }
}

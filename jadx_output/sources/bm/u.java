package bm;

/* loaded from: classes16.dex */
public class u extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_post_outsider_item_x2c";
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
        i0Var.p(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.nad);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.f(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", com.tencent.mm.R.drawable.adw));
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.c(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", 0, 0, 0, q(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 13.0f, 0));
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
        if (view == null) {
            view = new com.tencent.mm.ui.widget.imageview.WeImageView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", com.tencent.mm.R.id.r4n);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479693cs));
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479693cs));
        i0Var.K(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_newlifeshare", com.tencent.mm.R.raw.icons_outlined_newlifeshare));
        xn5.j jVar = xn5.k.f455686a;
        jVar.a(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/link_color", com.tencent.mm.R.color.f479308vo));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 7.0f, 0), 0, 0, 0);
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 1);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.naa);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 0.0f, 0));
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams2, "X2CLinearLayout.LayoutParams", 17);
        i0Var.A(context, layoutParams2, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.l(context, view4, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.D(context, view4, "com.tencent.mm.view.x2c.X2CTextView", s(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 2, 0));
        i0Var.L(context, view4, "com.tencent.mm.view.x2c.X2CTextView", t(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_outsider_tip", com.tencent.mm.R.string.jdw));
        i0Var.N(context, view4, "com.tencent.mm.view.x2c.X2CTextView", p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", com.tencent.mm.R.color.a6q));
        i0Var.d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0), 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), 0, 0, 0);
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        android.view.View view5 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
        if (view5 == null) {
            view5 = new com.tencent.mm.ui.widget.imageview.WeImageView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn));
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.K(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/right_arrow", com.tencent.mm.R.drawable.brd));
        jVar.a(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/BW_0_Alpha_0_3", com.tencent.mm.R.color.BW_0_Alpha_0_3));
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0);
        view6.setLayoutParams(layoutParams3);
        viewGroup.addView(view6);
        d(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 3);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        java.lang.String str2;
        int i18;
        android.content.Context context2;
        android.view.View view2;
        int i19;
        android.view.View view3;
        android.content.Context context3;
        android.view.View view4;
        java.lang.String str3;
        int i27;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f455685a;
        if (i17 == 0) {
            android.view.View view5 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view5 != null) {
                i0Var.p(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.nad);
                i0Var.f(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", com.tencent.mm.R.drawable.adw));
                i0Var.o(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            view = view5;
        } else {
            view = null;
        }
        android.view.View view6 = view;
        if (i17 == 1) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
            if (weImageView != null) {
                weImageView.setId(com.tencent.mm.R.id.r4n);
                weImageView.setImageDrawable(r(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_newlifeshare", com.tencent.mm.R.raw.icons_outlined_newlifeshare));
                weImageView.setIconColor(p(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/link_color", com.tencent.mm.R.color.f479308vo));
            }
            g(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
            view6 = weImageView;
        }
        if (i17 == 2) {
            android.view.View view7 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (view7 != null) {
                i0Var.p(context, view7, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.naa);
                i0Var.l(context, view7, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.D(context, view7, "com.tencent.mm.view.x2c.X2CTextView", s(context, view7, "com.tencent.mm.view.x2c.X2CTextView", 2, 0));
                i0Var.L(context, view7, "com.tencent.mm.view.x2c.X2CTextView", t(context, view7, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_outsider_tip", com.tencent.mm.R.string.jdw));
                i0Var.N(context, view7, "com.tencent.mm.view.x2c.X2CTextView", p(context, view7, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", com.tencent.mm.R.color.a6q));
                view4 = view7;
                str3 = "com.tencent.mm.view.x2c.X2CTextView";
                i27 = 2;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i18 = i17;
                context2 = context;
                i0Var.d(context, view7, "com.tencent.mm.view.x2c.X2CTextView", 0, q(context, view7, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0), 0, q(context, view7, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
            } else {
                view4 = view7;
                str3 = "com.tencent.mm.view.x2c.X2CTextView";
                i27 = 2;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i18 = i17;
                context2 = context;
            }
            g(context2, view4, str3, i27);
            view2 = view4;
        } else {
            str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
            i18 = i17;
            context2 = context;
            view2 = view6;
        }
        if (i18 == 3) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context2, str2, 3);
            if (weImageView2 != null) {
                context3 = context2;
                i19 = i18;
                weImageView2.setImageDrawable(r(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/right_arrow", com.tencent.mm.R.drawable.brd));
                weImageView2.setIconColor(p(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/BW_0_Alpha_0_3", com.tencent.mm.R.color.BW_0_Alpha_0_3));
            } else {
                context3 = context2;
                i19 = i18;
            }
            g(context3, weImageView2, str2, 3);
            view3 = weImageView2;
        } else {
            i19 = i18;
            view3 = view2;
        }
        if (i19 == 3) {
            n();
        }
        return view3;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ct6;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Post_Outsider_Item_X2c_X2C";
    }
}

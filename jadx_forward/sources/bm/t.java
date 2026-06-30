package bm;

/* loaded from: classes16.dex */
public class t extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_post_finder_item_x2c";
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
        i0Var.p(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.na9);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.f(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", com.p314xaae8f345.mm.R.C30861xcebc809e.adw));
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        i0Var.K(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_finder_icon", com.p314xaae8f345.mm.R.raw.f80119x628f1c9a));
        xn5.j jVar = xn5.k.f537219a;
        jVar.a(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/Orange", com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 7.0f, 0), 0, 0, 0);
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 1);
        android.view.View view3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.naa);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 0.0f, 0));
        i0Var.A(context, layoutParams2, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams2, "X2CLinearLayout.LayoutParams", 17);
        i0Var.l(context, view4, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.D(context, view4, "com.tencent.mm.view.x2c.X2CTextView", s(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        i0Var.L(context, view4, "com.tencent.mm.view.x2c.X2CTextView", t(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_finder_tip", com.p314xaae8f345.mm.R.C30867xcad56011.jdu));
        i0Var.N(context, view4, "com.tencent.mm.view.x2c.X2CTextView", p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a6q));
        i0Var.d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0), 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, 0, 0);
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        android.view.View view5 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.K(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/right_arrow", com.p314xaae8f345.mm.R.C30861xcebc809e.brd));
        jVar.a(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/BW_0_Alpha_0_3", com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
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
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 0) {
            android.view.View view5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view5 != null) {
                i0Var.p(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.na9);
                i0Var.f(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", com.p314xaae8f345.mm.R.C30861xcebc809e.adw));
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
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(r(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_finder_icon", com.p314xaae8f345.mm.R.raw.f80119x628f1c9a));
                c22699x3dcdb352.m82040x7541828(p(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/Orange", com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            }
            g(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
            view6 = c22699x3dcdb352;
        }
        if (i17 == 2) {
            android.view.View view7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (view7 != null) {
                i0Var.p(context, view7, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.naa);
                i0Var.l(context, view7, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.D(context, view7, "com.tencent.mm.view.x2c.X2CTextView", s(context, view7, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                i0Var.L(context, view7, "com.tencent.mm.view.x2c.X2CTextView", t(context, view7, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_finder_tip", com.p314xaae8f345.mm.R.C30867xcad56011.jdu));
                i0Var.N(context, view7, "com.tencent.mm.view.x2c.X2CTextView", p(context, view7, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a6q));
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
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context2, str2, 3);
            if (c22699x3dcdb3522 != null) {
                context3 = context2;
                i19 = i18;
                c22699x3dcdb3522.setImageDrawable(r(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/right_arrow", com.p314xaae8f345.mm.R.C30861xcebc809e.brd));
                c22699x3dcdb3522.m82040x7541828(p(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/BW_0_Alpha_0_3", com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
            } else {
                context3 = context2;
                i19 = i18;
            }
            g(context3, c22699x3dcdb3522, str2, 3);
            view3 = c22699x3dcdb3522;
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
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571051ct4;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Post_Finder_Item_X2c_X2C";
    }
}

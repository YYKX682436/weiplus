package bm;

/* loaded from: classes16.dex */
public class c extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_appmsg_source_area_x2c";
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
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.H(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup2.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.5f, 0));
        i0Var.x(context, layoutParams, "X2CLinearLayout.LayoutParams", 16);
        i0Var.f(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@color/chat_card_seperator_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560336hn));
        view2.setLayoutParams(layoutParams);
        viewGroup2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 1);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup3 = c22869xb039b5f8;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, viewGroup3, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", 0, q(context, viewGroup3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0, q(context, viewGroup3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f));
        viewGroup3.setLayoutParams(layoutParams2);
        viewGroup2.addView(viewGroup3);
        android.view.View view3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", com.p314xaae8f345.mm.R.id.bjm);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 12.0f, 0));
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 12.0f, 0));
        i0Var.o(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", 16);
        i0Var.I(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/chatting_item_souce_iv_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f562761nu));
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 4.0f, 0), 0);
        view4.setLayoutParams(layoutParams3);
        viewGroup3.addView(view4);
        d(context, view4, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 3);
        android.view.View view5 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 4);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view6, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjp);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.z(context, layoutParams4, "X2CLinearLayout.LayoutParams", com.p314xaae8f345.mm.R.id.bjm);
        i0Var.N(context, view6, "com.tencent.mm.ui.widget.MMTextView", p(context, view6, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        i0Var.O(context, view6, "com.tencent.mm.ui.widget.MMTextView", u(context, view6, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        view6.setLayoutParams(layoutParams4);
        viewGroup3.addView(view6);
        d(context, view6, "com.tencent.mm.ui.widget.MMTextView", false, 4);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        if (c22869xb039b5f82 == null) {
            c22869xb039b5f82 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f83 = c22869xb039b5f82;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.A(context, layoutParams5, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.o(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 21);
        i0Var.c(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0, 0, 0);
        c22869xb039b5f83.setLayoutParams(layoutParams5);
        viewGroup3.addView(c22869xb039b5f83);
        android.view.View view7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 6);
        if (view7 == null) {
            view7 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bjn);
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, view8, "com.tencent.mm.view.x2c.X2CImageView", 1, 10.0f, 0));
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, view8, "com.tencent.mm.view.x2c.X2CImageView", 1, 10.0f, 0));
        i0Var.I(context, view8, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view8, "com.tencent.mm.view.x2c.X2CImageView", r(context, view8, "com.tencent.mm.view.x2c.X2CImageView", "@raw/app_brand_we_app_logo_share", com.p314xaae8f345.mm.R.raw.f78502xe4d3cfe4));
        i0Var.c(context, layoutParams6, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view8, "com.tencent.mm.view.x2c.X2CImageView", 1, 3.0f, 0), 0);
        view8.setLayoutParams(layoutParams6);
        c22869xb039b5f83.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CImageView", false, 6);
        android.view.View view9 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 7);
        if (view9 == null) {
            view9 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, xn5.q0.f537238d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view10, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjo);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view10, "com.tencent.mm.ui.widget.MMTextView", p(context, view10, "com.tencent.mm.ui.widget.MMTextView", "@color/FG_1", com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        i0Var.g(context, view10, "com.tencent.mm.ui.widget.MMTextView", true);
        i0Var.O(context, view10, "com.tencent.mm.ui.widget.MMTextView", u(context, view10, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561470jj));
        i0Var.j(context, view10, "com.tencent.mm.ui.widget.MMTextView", q(context, view10, "com.tencent.mm.ui.widget.MMTextView", 1, 3.0f, 0));
        i0Var.o(context, view10, "com.tencent.mm.ui.widget.MMTextView", 21);
        i0Var.d(context, view10, "com.tencent.mm.ui.widget.MMTextView", 0, 0, q(context, view10, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0);
        i0Var.c(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.MMTextView", 1, 0.0f, 0), q(context, view10, "com.tencent.mm.ui.widget.MMTextView", 1, 0.0f, 0), 0, 0);
        view10.setLayoutParams(layoutParams7);
        c22869xb039b5f83.addView(view10);
        d(context, view10, "com.tencent.mm.ui.widget.MMTextView", false, 7);
        d(context, c22869xb039b5f83, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 5);
        d(context, viewGroup3, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 2);
        d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.tencent.mm.ui.widget.MMTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xn5.i0] */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.View, com.tencent.mm.view.x2c.X2CImageView] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.View, com.tencent.mm.ui.widget.imageview.WeImageView] */
    /* JADX WARN: Type inference failed for: r19v0, types: [xn5.g, bm.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.tencent.mm.ui.widget.MMTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, com.tencent.mm.view.x2c.X2CImageView] */
    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82;
        java.lang.String str2;
        android.content.Context context2;
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f83;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (c22869xb039b5f8 != null) {
                c22869xb039b5f8.setOrientation(1);
            }
            g(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            c22869xb039b5f8 = null;
        }
        if (i17 == 1) {
            ?? r112 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
            if (r112 != 0) {
                r112.setBackground(r(context, r112, "com.tencent.mm.view.x2c.X2CImageView", "@color/chat_card_seperator_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560336hn));
            }
            g(context, r112, "com.tencent.mm.view.x2c.X2CImageView", 1);
            c22869xb039b5f8 = r112;
        }
        ?? r113 = xn5.j0.f537218a;
        if (i17 == 2) {
            c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
            if (c22869xb039b5f8 != null) {
                r113.o(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                r113.H(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
        }
        if (i17 == 3) {
            ?? r132 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            if (r132 != 0) {
                r113.p(context, r132, "com.tencent.mm.ui.widget.imageview.WeImageView", com.p314xaae8f345.mm.R.id.bjm);
                r113.o(context, r132, "com.tencent.mm.ui.widget.imageview.WeImageView", 16);
                r113.I(context, r132, "com.tencent.mm.ui.widget.imageview.WeImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                r113.K(context, r132, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, r132, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/chatting_item_souce_iv_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f562761nu));
            }
            g(context, r132, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            c22869xb039b5f8 = r132;
        }
        if (i17 == 4) {
            ?? r66 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 4);
            if (r66 != 0) {
                r113.p(context, r66, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjp);
                r113.N(context, r66, "com.tencent.mm.ui.widget.MMTextView", p(context, r66, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
                c22869xb039b5f83 = r66;
                r113.O(context, c22869xb039b5f83, "com.tencent.mm.ui.widget.MMTextView", u(context, r66, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
            } else {
                c22869xb039b5f83 = r66;
            }
            g(context, c22869xb039b5f83, "com.tencent.mm.ui.widget.MMTextView", 4);
            c22869xb039b5f8 = c22869xb039b5f83;
        }
        if (i17 == 5) {
            c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
            if (c22869xb039b5f8 != null) {
                r113.o(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 21);
            }
            g(context, c22869xb039b5f8, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        }
        if (i17 == 6) {
            ?? r96 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 6);
            if (r96 != 0) {
                r113.p(context, r96, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bjn);
                r113.I(context, r96, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                r113.K(context, r96, "com.tencent.mm.view.x2c.X2CImageView", r(context, r96, "com.tencent.mm.view.x2c.X2CImageView", "@raw/app_brand_we_app_logo_share", com.p314xaae8f345.mm.R.raw.f78502xe4d3cfe4));
            }
            g(context, r96, "com.tencent.mm.view.x2c.X2CImageView", 6);
            c22869xb039b5f8 = r96;
        }
        if (i17 == 7) {
            ?? r102 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 7);
            if (r102 != 0) {
                r113.p(context, r102, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjo);
                c22869xb039b5f82 = r102;
                r113.N(context, r102, "com.tencent.mm.ui.widget.MMTextView", p(context, c22869xb039b5f82, "com.tencent.mm.ui.widget.MMTextView", "@color/FG_1", com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                r113.g(context, r102, "com.tencent.mm.ui.widget.MMTextView", true);
                r113.O(context, r102, "com.tencent.mm.ui.widget.MMTextView", u(context, c22869xb039b5f82, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561470jj));
                r113.j(context, r102, "com.tencent.mm.ui.widget.MMTextView", q(context, c22869xb039b5f82, "com.tencent.mm.ui.widget.MMTextView", 1, 3.0f, 0));
                r113.o(context, r102, "com.tencent.mm.ui.widget.MMTextView", 21);
                i18 = 7;
                str2 = "com.tencent.mm.ui.widget.MMTextView";
                i19 = i17;
                context2 = context;
                r113.d(context, r102, "com.tencent.mm.ui.widget.MMTextView", 0, 0, q(context, c22869xb039b5f82, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0);
            } else {
                c22869xb039b5f82 = r102;
                i18 = 7;
                str2 = "com.tencent.mm.ui.widget.MMTextView";
                i19 = i17;
                context2 = context;
            }
            g(context2, c22869xb039b5f82, str2, i18);
            c22869xb039b5f8 = c22869xb039b5f82;
        } else {
            i18 = 7;
            i19 = i17;
        }
        if (i19 == i18) {
            n();
        }
        return c22869xb039b5f8;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dbc;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_Appmsg_Source_Area_X2c_X2C";
    }
}

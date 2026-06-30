package bm;

/* loaded from: classes16.dex */
public class f extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_from_appmsg_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        android.view.ViewGroup viewGroup = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.h(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", false);
        i0Var.i(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", false);
        i0Var.H(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.o(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
        i0Var.d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0, q(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0);
        viewGroup2.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dbd, viewGroup2, true);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.a(inflate.getLayoutParams(), layoutParams);
        inflate.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
        if (viewGroup3 == null) {
            viewGroup3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup4 = viewGroup3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.p(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.bjy);
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", 0, q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0));
        viewGroup4.setLayoutParams(layoutParams2);
        viewGroup2.addView(viewGroup4);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, i());
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.brc);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 19);
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        i0Var.E(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 240.0f, 0));
        i0Var.J(context, view2, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.P(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0, q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0);
        i0Var.b(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 0.0f, 0), 1.0f);
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 1.5f, 0));
        view2.setLayoutParams(layoutParams3);
        viewGroup4.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 3);
        android.view.ViewGroup viewGroup5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
        if (viewGroup5 == null) {
            viewGroup5 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup6 = viewGroup5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup6, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.p(context, viewGroup6, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.a1l);
        viewGroup6.setLayoutParams(layoutParams4);
        viewGroup4.addView(viewGroup6);
        android.view.ViewGroup viewGroup7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        if (viewGroup7 == null) {
            viewGroup7 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup8 = viewGroup7;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup8, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup8.setLayoutParams(layoutParams5);
        viewGroup6.addView(viewGroup8);
        android.view.ViewGroup viewGroup9 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 6);
        if (viewGroup9 == null) {
            viewGroup9 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e(context, i());
        }
        android.view.ViewGroup viewGroup10 = viewGroup9;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", com.p314xaae8f345.mm.R.id.bkg);
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", q(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa));
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", -2);
        i0Var.f(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", r(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/chat_from_mask_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f562678lu));
        i0Var.n(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", r(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/chat_from_mask_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f562678lu));
        viewGroup10.setLayoutParams(layoutParams6);
        viewGroup8.addView(viewGroup10);
        android.view.ViewGroup viewGroup11 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 7);
        if (viewGroup11 == null) {
            viewGroup11 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup12 = viewGroup11;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.FrameLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams7, "X2CFrameLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams7, "X2CFrameLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup12.setLayoutParams(layoutParams7);
        viewGroup10.addView(viewGroup12);
        android.view.View view3 = (android.view.ViewStub) h(context, "ViewStub", 8);
        if (view3 == null) {
            view3 = new android.view.ViewStub(context, i());
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.E(context, view4, "ViewStub", q(context, view4, "ViewStub", 1, 240.0f, 0));
        i0Var.p(context, view4, "ViewStub", com.p314xaae8f345.mm.R.id.pui);
        i0Var.s(context, view4, "ViewStub", com.p314xaae8f345.mm.R.id.bif);
        i0Var.u(context, view4, "ViewStub", com.p314xaae8f345.mm.R.C30864xbddafb2a.dbg);
        i0Var.H(context, view4, "ViewStub", 1);
        view4.setLayoutParams(layoutParams8);
        viewGroup12.addView(view4);
        d(context, view4, "ViewStub", false, 8);
        android.view.View view5 = (android.view.ViewStub) h(context, "ViewStub", 9);
        if (view5 == null) {
            view5 = new android.view.ViewStub(context, i());
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams9, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams9, "X2CLinearLayout.LayoutParams", -2);
        i0Var.E(context, view6, "ViewStub", q(context, view6, "ViewStub", 1, 240.0f, 0));
        i0Var.s(context, view6, "ViewStub", com.p314xaae8f345.mm.R.id.bie);
        i0Var.H(context, view6, "ViewStub", 1);
        i0Var.p(context, view6, "ViewStub", com.p314xaae8f345.mm.R.id.puo);
        i0Var.u(context, view6, "ViewStub", com.p314xaae8f345.mm.R.C30864xbddafb2a.dbf);
        view6.setLayoutParams(layoutParams9);
        viewGroup12.addView(view6);
        d(context, view6, "ViewStub", false, 9);
        android.view.ViewGroup viewGroup13 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 10);
        if (viewGroup13 == null) {
            viewGroup13 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup14 = viewGroup13;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.biy);
        i0Var.B(context, layoutParams10, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams10, "X2CLinearLayout.LayoutParams", -2);
        i0Var.k(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", true);
        i0Var.H(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.d(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, q(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0, 0);
        viewGroup14.setLayoutParams(layoutParams10);
        viewGroup12.addView(viewGroup14);
        android.view.View view7 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 11);
        if (view7 == null) {
            view7 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, i());
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view8, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjx);
        i0Var.J(context, view8, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.l(context, view8, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view8, "com.tencent.mm.ui.widget.MMTextView", 16);
        i0Var.B(context, layoutParams11, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams11, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view8, "com.tencent.mm.ui.widget.MMTextView", p(context, view8, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        i0Var.O(context, view8, "com.tencent.mm.ui.widget.MMTextView", u(context, view8, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r));
        i0Var.d(context, view8, "com.tencent.mm.ui.widget.MMTextView", q(context, view8, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561738rc), 0, q(context, view8, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.i_), 0);
        i0Var.c(context, layoutParams11, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view8, "com.tencent.mm.ui.widget.MMTextView", 1, 4.0f, 0));
        view8.setLayoutParams(layoutParams11);
        viewGroup14.addView(view8);
        d(context, view8, "com.tencent.mm.ui.widget.MMTextView", false, 11);
        android.view.View view9 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 12);
        if (view9 == null) {
            view9 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, i());
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams12 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view10, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bkt);
        i0Var.B(context, layoutParams12, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams12, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 0, 2.0f, 0));
        i0Var.x(context, layoutParams12, "X2CLinearLayout.LayoutParams", 16);
        i0Var.f(context, view10, "com.tencent.mm.view.x2c.X2CImageView", r(context, view10, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/chatting_item_dividing_line", com.p314xaae8f345.mm.R.C30861xcebc809e.f562740n6));
        i0Var.t(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 1);
        i0Var.P(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.c(context, layoutParams12, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561738rc), 0, q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 1, 5.0f, 0));
        view10.setLayoutParams(layoutParams12);
        viewGroup14.addView(view10);
        d(context, view10, "com.tencent.mm.view.x2c.X2CImageView", false, 12);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 13);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup15 = c22869xb039b5f8;
        android.view.ViewGroup.LayoutParams layoutParams13 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams13, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams13, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup15, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.d(context, viewGroup15, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, viewGroup15, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561738rc), 0, q(context, viewGroup15, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 12.0f, 0), 0);
        viewGroup15.setLayoutParams(layoutParams13);
        viewGroup14.addView(viewGroup15);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 14);
        if (c22869xb039b5f82 == null) {
            c22869xb039b5f82 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup16 = c22869xb039b5f82;
        android.view.ViewGroup.LayoutParams layoutParams14 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams14, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams14, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup16, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup16.setLayoutParams(layoutParams14);
        viewGroup15.addView(viewGroup16);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f83 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 15);
        if (c22869xb039b5f83 == null) {
            c22869xb039b5f83 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f84 = c22869xb039b5f83;
        android.view.ViewGroup.LayoutParams layoutParams15 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams15, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 0.0f, 0));
        i0Var.y(context, layoutParams15, "X2CLinearLayout.LayoutParams", -2);
        i0Var.A(context, layoutParams15, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.H(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        c22869xb039b5f84.setLayoutParams(layoutParams15);
        viewGroup16.addView(c22869xb039b5f84);
        android.view.View view11 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) h(context, "com.tencent.mm.ui.widget.MMNeat7extView", 16);
        android.view.View c22624x85d69039 = view11 == null ? new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039(context, i()) : view11;
        android.view.ViewGroup.LayoutParams layoutParams16 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, c22624x85d69039, "com.tencent.mm.ui.widget.MMNeat7extView", com.p314xaae8f345.mm.R.id.bju);
        android.view.View view12 = c22624x85d69039;
        i0Var.O(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", u(context, c22624x85d69039, "com.tencent.mm.ui.widget.MMNeat7extView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        i0Var.N(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", p(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", "@color/BW_0_Alpha_0_9", com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        i0Var.B(context, layoutParams16, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams16, "X2CLinearLayout.LayoutParams", -2);
        i0Var.J(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", false);
        i0Var.l(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", 16);
        i0Var.D(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", s(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", 2, 0));
        view12.setLayoutParams(layoutParams16);
        c22869xb039b5f84.addView(view12);
        d(context, view12, "com.tencent.mm.ui.widget.MMNeat7extView", false, 16);
        android.view.View view13 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 17);
        if (view13 == null) {
            view13 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, i());
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams17 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view14, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.f565170bj2);
        i0Var.O(context, view14, "com.tencent.mm.ui.widget.MMTextView", u(context, view14, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        i0Var.N(context, view14, "com.tencent.mm.ui.widget.MMTextView", p(context, view14, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        i0Var.B(context, layoutParams17, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams17, "X2CLinearLayout.LayoutParams", -2);
        i0Var.D(context, view14, "com.tencent.mm.ui.widget.MMTextView", s(context, view14, "com.tencent.mm.ui.widget.MMTextView", 3, 0));
        i0Var.l(context, view14, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view14, "com.tencent.mm.ui.widget.MMTextView", 16);
        i0Var.q(context, view14, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.J(context, view14, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.b(context, view14, "com.tencent.mm.ui.widget.MMTextView", q(context, view14, "com.tencent.mm.ui.widget.MMTextView", 1, 2.0f, 0), 1.0f);
        i0Var.c(context, layoutParams17, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view14, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        view14.setLayoutParams(layoutParams17);
        c22869xb039b5f84.addView(view14);
        d(context, view14, "com.tencent.mm.ui.widget.MMTextView", false, 17);
        d(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 15);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 18);
        if (c22874x32dcda1f == null) {
            c22874x32dcda1f = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f(context, i());
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f2 = c22874x32dcda1f;
        android.view.ViewGroup.LayoutParams layoutParams18 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.p314xaae8f345.mm.R.id.bjr);
        i0Var.B(context, layoutParams18, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams18, "X2CLinearLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams18, "X2CLinearLayout.LayoutParams", q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.i_), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1, 3.0f, 0), 0, q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        c22874x32dcda1f2.setLayoutParams(layoutParams18);
        viewGroup16.addView(c22874x32dcda1f2);
        android.view.View view15 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) h(context, "com.tencent.mm.ui.MMImageView", 19);
        if (view15 == null) {
            view15 = new com.p314xaae8f345.mm.ui.C21405x85fc1ce0(context, i());
        }
        android.view.View view16 = view15;
        android.view.ViewGroup.LayoutParams layoutParams19 = new android.widget.RelativeLayout.LayoutParams(context, i());
        i0Var.p(context, view16, "com.tencent.mm.ui.MMImageView", com.p314xaae8f345.mm.R.id.bjs);
        i0Var.B(context, layoutParams19, "X2CRelativeLayout.LayoutParams", q(context, view16, "com.tencent.mm.ui.MMImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561767s5));
        i0Var.y(context, layoutParams19, "X2CRelativeLayout.LayoutParams", q(context, view16, "com.tencent.mm.ui.MMImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561767s5));
        i0Var.I(context, view16, "com.tencent.mm.ui.MMImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        view16.setLayoutParams(layoutParams19);
        c22874x32dcda1f2.addView(view16);
        d(context, view16, "com.tencent.mm.ui.MMImageView", false, 19);
        android.view.View view17 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 20);
        if (view17 == null) {
            view17 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, i());
        }
        android.view.View view18 = view17;
        android.view.ViewGroup.LayoutParams layoutParams20 = new android.widget.RelativeLayout.LayoutParams(context, i());
        i0Var.p(context, view18, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bj_);
        i0Var.B(context, layoutParams20, "X2CRelativeLayout.LayoutParams", q(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 1, 24.0f, 0));
        i0Var.y(context, layoutParams20, "X2CRelativeLayout.LayoutParams", q(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 1, 24.0f, 0));
        i0Var.v(context, layoutParams20, "X2CRelativeLayout.LayoutParams", -1);
        view18.setLayoutParams(layoutParams20);
        c22874x32dcda1f2.addView(view18);
        d(context, view18, "com.tencent.mm.view.x2c.X2CImageView", false, 20);
        d(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 18);
        d(context, viewGroup16, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 14);
        android.view.View view19 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 21);
        if (view19 == null) {
            view19 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, i());
        }
        android.view.View view20 = view19;
        android.view.ViewGroup.LayoutParams layoutParams21 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view20, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.js9);
        i0Var.B(context, layoutParams21, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams21, "X2CLinearLayout.LayoutParams", q(context, view20, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.5f, 0));
        i0Var.x(context, layoutParams21, "X2CLinearLayout.LayoutParams", 16);
        i0Var.f(context, view20, "com.tencent.mm.view.x2c.X2CImageView", r(context, view20, "com.tencent.mm.view.x2c.X2CImageView", "@color/chat_card_seperator_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560336hn));
        i0Var.c(context, layoutParams21, "X2CLinearLayout.LayoutParams", 0, q(context, view20, "com.tencent.mm.view.x2c.X2CImageView", 1, 0.0f, 0), 0, 0);
        view20.setLayoutParams(layoutParams21);
        viewGroup15.addView(view20);
        d(context, view20, "com.tencent.mm.view.x2c.X2CImageView", false, 21);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dbb, viewGroup15, true);
        android.view.ViewGroup.LayoutParams layoutParams22 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.a(inflate2.getLayoutParams(), layoutParams22);
        i0Var.p(context, inflate2, "include", com.p314xaae8f345.mm.R.id.js8);
        i0Var.B(context, layoutParams22, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams22, "X2CLinearLayout.LayoutParams", -2);
        i0Var.P(context, inflate2, "include", 8);
        i0Var.c(context, layoutParams22, "X2CLinearLayout.LayoutParams", 0, q(context, inflate2, "include", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0, q(context, inflate2, "include", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f));
        inflate2.setLayoutParams(layoutParams22);
        android.view.View view21 = (android.view.ViewStub) h(context, "ViewStub", 23);
        if (view21 == null) {
            view21 = new android.view.ViewStub(context, i());
        }
        android.view.View view22 = view21;
        android.view.ViewGroup.LayoutParams layoutParams23 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view22, "ViewStub", com.p314xaae8f345.mm.R.id.ken);
        i0Var.B(context, layoutParams23, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams23, "X2CLinearLayout.LayoutParams", -2);
        view22.setLayoutParams(layoutParams23);
        viewGroup15.addView(view22);
        d(context, view22, "ViewStub", false, 23);
        d(context, viewGroup15, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 13);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f85 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 24);
        if (c22869xb039b5f85 == null) {
            c22869xb039b5f85 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f86 = c22869xb039b5f85;
        android.view.ViewGroup.LayoutParams layoutParams24 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, c22869xb039b5f86, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.bjl);
        i0Var.B(context, layoutParams24, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams24, "X2CLinearLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams24, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f86, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 14.9f, 0), 0, q(context, c22869xb039b5f86, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 12.0f, 0), 0);
        c22869xb039b5f86.setLayoutParams(layoutParams24);
        viewGroup14.addView(c22869xb039b5f86);
        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dbc, (android.view.ViewGroup) c22869xb039b5f86, true);
        android.view.ViewGroup.LayoutParams layoutParams25 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.a(inflate3.getLayoutParams(), layoutParams25);
        i0Var.B(context, layoutParams25, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams25, "X2CLinearLayout.LayoutParams", -2);
        inflate3.setLayoutParams(layoutParams25);
        d(context, c22869xb039b5f86, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 24);
        d(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 10);
        android.view.View view23 = (android.view.ViewStub) h(context, "ViewStub", 26);
        if (view23 == null) {
            view23 = new android.view.ViewStub(context, i());
        }
        android.view.View view24 = view23;
        android.view.ViewGroup.LayoutParams layoutParams26 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view24, "ViewStub", com.p314xaae8f345.mm.R.id.pun);
        i0Var.s(context, view24, "ViewStub", com.p314xaae8f345.mm.R.id.bjb);
        i0Var.B(context, layoutParams26, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams26, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, view24, "ViewStub", 1);
        i0Var.u(context, view24, "ViewStub", com.p314xaae8f345.mm.R.C30864xbddafb2a.f569990ts);
        i0Var.d(context, view24, "ViewStub", 0, q(context, view24, "ViewStub", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0, q(context, view24, "ViewStub", 1, 7.0f, 0));
        i0Var.c(context, layoutParams26, "X2CLinearLayout.LayoutParams", q(context, view24, "ViewStub", 1, 5.0f, 0), 0, 0, 0);
        view24.setLayoutParams(layoutParams26);
        viewGroup12.addView(view24);
        d(context, view24, "ViewStub", false, 26);
        android.view.View view25 = (android.view.ViewStub) h(context, "ViewStub", 27);
        if (view25 == null) {
            view25 = new android.view.ViewStub(context, i());
        }
        android.view.View view26 = view25;
        android.view.ViewGroup.LayoutParams layoutParams27 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view26, "ViewStub", com.p314xaae8f345.mm.R.id.puj);
        i0Var.s(context, view26, "ViewStub", com.p314xaae8f345.mm.R.id.bij);
        i0Var.u(context, view26, "ViewStub", com.p314xaae8f345.mm.R.C30864xbddafb2a.dbh);
        i0Var.B(context, layoutParams27, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams27, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, view26, "ViewStub", 1);
        i0Var.c(context, layoutParams27, "X2CLinearLayout.LayoutParams", q(context, view26, "ViewStub", 1, 5.0f, 0), 0, 0, 0);
        view26.setLayoutParams(layoutParams27);
        viewGroup12.addView(view26);
        d(context, view26, "ViewStub", false, 27);
        android.view.View view27 = (android.view.ViewStub) h(context, "ViewStub", 28);
        if (view27 == null) {
            view27 = new android.view.ViewStub(context, i());
        }
        android.view.View view28 = view27;
        android.view.ViewGroup.LayoutParams layoutParams28 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view28, "ViewStub", com.p314xaae8f345.mm.R.id.spq);
        i0Var.s(context, view28, "ViewStub", com.p314xaae8f345.mm.R.id.spv);
        i0Var.u(context, view28, "ViewStub", com.p314xaae8f345.mm.R.C30864xbddafb2a.e18);
        i0Var.B(context, layoutParams28, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams28, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, view28, "ViewStub", 1);
        i0Var.c(context, layoutParams28, "X2CLinearLayout.LayoutParams", q(context, view28, "ViewStub", 1, 4.0f, 0), 0, 0, 0);
        view28.setLayoutParams(layoutParams28);
        viewGroup12.addView(view28);
        d(context, view28, "ViewStub", false, 28);
        d(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 7);
        d(context, viewGroup10, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 6);
        android.view.View view29 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ViewOnClickListenerC21916xa10cb594) h(context, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", 29);
        if (view29 == null) {
            view29 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ViewOnClickListenerC21916xa10cb594(context, i());
        }
        android.view.View view30 = view29;
        android.view.ViewGroup.LayoutParams layoutParams29 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view30, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", com.p314xaae8f345.mm.R.id.gbh);
        i0Var.B(context, layoutParams29, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams29, "X2CLinearLayout.LayoutParams", -2);
        i0Var.P(context, view30, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", 8);
        i0Var.c(context, layoutParams29, "X2CLinearLayout.LayoutParams", q(context, view30, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", 1, 0.0f, 0), 0, q(context, view30, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", 1, 0.0f, 0), q(context, view30, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", 1, 0.0f, 0));
        view30.setLayoutParams(layoutParams29);
        viewGroup8.addView(view30);
        d(context, view30, "com.tencent.mm.ui.chatting.viewitems.ChattingItemFooter", false, 29);
        android.view.ViewGroup viewGroup17 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 30);
        if (viewGroup17 == null) {
            viewGroup17 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup18 = viewGroup17;
        android.view.ViewGroup.LayoutParams layoutParams30 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams30, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams30, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup18, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.P(context, viewGroup18, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        viewGroup18.setLayoutParams(layoutParams30);
        viewGroup8.addView(viewGroup18);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f87 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 31);
        if (c22869xb039b5f87 == null) {
            c22869xb039b5f87 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.ViewGroup viewGroup19 = c22869xb039b5f87;
        android.view.ViewGroup.LayoutParams layoutParams31 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams31, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams31, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup19, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.o(context, viewGroup19, "com.tencent.mm.view.x2c.X2CLinearLayout", 80);
        viewGroup19.setLayoutParams(layoutParams31);
        viewGroup18.addView(viewGroup19);
        android.view.View view31 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 32);
        if (view31 == null) {
            view31 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        android.view.View view32 = view31;
        android.view.ViewGroup.LayoutParams layoutParams32 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams32, "X2CLinearLayout.LayoutParams", q(context, view32, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 0.0f, 0));
        i0Var.y(context, layoutParams32, "X2CLinearLayout.LayoutParams", -2);
        i0Var.A(context, layoutParams32, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.d(context, view32, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0, q(context, view32, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0);
        view32.setLayoutParams(layoutParams32);
        viewGroup19.addView(view32);
        d(context, view32, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 32);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f88 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 33);
        if (c22869xb039b5f88 == null) {
            c22869xb039b5f88 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f89 = c22869xb039b5f88;
        android.view.ViewGroup.LayoutParams layoutParams33 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams33, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams33, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, c22869xb039b5f89, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        c22869xb039b5f89.setLayoutParams(layoutParams33);
        viewGroup19.addView(c22869xb039b5f89);
        android.view.View view33 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 34);
        if (view33 == null) {
            view33 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, i());
        }
        android.view.View view34 = view33;
        android.view.ViewGroup.LayoutParams layoutParams34 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view34, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bix);
        i0Var.B(context, layoutParams34, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams34, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view34, "com.tencent.mm.ui.widget.MMTextView", p(context, view34, "com.tencent.mm.ui.widget.MMTextView", "@color/white_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        i0Var.g(context, view34, "com.tencent.mm.ui.widget.MMTextView", true);
        i0Var.O(context, view34, "com.tencent.mm.ui.widget.MMTextView", u(context, view34, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
        i0Var.f(context, view34, "com.tencent.mm.ui.widget.MMTextView", r(context, view34, "com.tencent.mm.ui.widget.MMTextView", "@drawable/chat_source_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f562701mb));
        i0Var.j(context, view34, "com.tencent.mm.ui.widget.MMTextView", q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 1, 3.0f, 0));
        i0Var.J(context, view34, "com.tencent.mm.ui.widget.MMTextView", true);
        i0Var.L(context, view34, "com.tencent.mm.ui.widget.MMTextView", t(context, view34, "com.tencent.mm.ui.widget.MMTextView", "@string/chatting_comment", com.p314xaae8f345.mm.R.C30867xcad56011.b1f));
        i0Var.d(context, view34, "com.tencent.mm.ui.widget.MMTextView", q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 1, 1.0f, 0), q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn), q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 1, 2.0f, 0));
        i0Var.c(context, layoutParams34, "X2CLinearLayout.LayoutParams", q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), q(context, view34, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3), 0, 0);
        view34.setLayoutParams(layoutParams34);
        c22869xb039b5f89.addView(view34);
        d(context, view34, "com.tencent.mm.ui.widget.MMTextView", false, 34);
        d(context, c22869xb039b5f89, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 33);
        d(context, viewGroup19, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 31);
        d(context, viewGroup18, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 30);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f810 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 35);
        if (c22869xb039b5f810 == null) {
            c22869xb039b5f810 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f811 = c22869xb039b5f810;
        android.view.ViewGroup.LayoutParams layoutParams35 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.bjv);
        i0Var.B(context, layoutParams35, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams35, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        i0Var.f(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/chatting_appmsg_todo_normal_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.f562727mr));
        i0Var.H(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.P(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams35, "X2CLinearLayout.LayoutParams", q(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 5.0f, 0), q(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, 0);
        c22869xb039b5f811.setLayoutParams(layoutParams35);
        viewGroup8.addView(c22869xb039b5f811);
        android.view.View view35 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 36);
        if (view35 == null) {
            view35 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, i());
        }
        android.view.View view36 = view35;
        android.view.ViewGroup.LayoutParams layoutParams36 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view36, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.bjw);
        i0Var.B(context, layoutParams36, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams36, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view36, "com.tencent.mm.view.x2c.X2CTextView", p(context, view36, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        i0Var.O(context, view36, "com.tencent.mm.view.x2c.X2CTextView", u(context, view36, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        i0Var.q(context, view36, "com.tencent.mm.view.x2c.X2CTextView", false);
        i0Var.x(context, layoutParams36, "X2CLinearLayout.LayoutParams", 17);
        i0Var.J(context, view36, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.L(context, view36, "com.tencent.mm.view.x2c.X2CTextView", t(context, view36, "com.tencent.mm.view.x2c.X2CTextView", "@string/group_todo_message", com.p314xaae8f345.mm.R.C30867xcad56011.ft9));
        i0Var.c(context, layoutParams36, "X2CLinearLayout.LayoutParams", q(context, view36, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0, q(context, view36, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
        view36.setLayoutParams(layoutParams36);
        c22869xb039b5f811.addView(view36);
        d(context, view36, "com.tencent.mm.view.x2c.X2CTextView", false, 36);
        d(context, c22869xb039b5f811, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 35);
        d(context, viewGroup8, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 5);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f812 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 37);
        if (c22869xb039b5f812 == null) {
            c22869xb039b5f812 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, i());
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f813 = c22869xb039b5f812;
        android.view.ViewGroup.LayoutParams layoutParams37 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams37, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams37, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, c22869xb039b5f813, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        c22869xb039b5f813.setLayoutParams(layoutParams37);
        viewGroup6.addView(c22869xb039b5f813);
        android.view.View view37 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 38);
        if (view37 == null) {
            view37 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, i());
        }
        android.view.View view38 = view37;
        android.view.ViewGroup.LayoutParams layoutParams38 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view38, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bjk);
        i0Var.B(context, layoutParams38, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams38, "X2CLinearLayout.LayoutParams", -2);
        if (layoutParams38 instanceof android.widget.RelativeLayout.LayoutParams) {
            ((android.widget.RelativeLayout.LayoutParams) layoutParams38).addRule(8, com.p314xaae8f345.mm.R.id.bkg);
        }
        i0Var.K(context, view38, "com.tencent.mm.view.x2c.X2CImageView", r(context, view38, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/refuse_app_msg", com.p314xaae8f345.mm.R.C30861xcebc809e.awx));
        i0Var.g(context, view38, "com.tencent.mm.view.x2c.X2CImageView", true);
        i0Var.P(context, view38, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.c(context, layoutParams38, "X2CLinearLayout.LayoutParams", q(context, view38, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), q(context, view38, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0, 0);
        view38.setLayoutParams(layoutParams38);
        c22869xb039b5f813.addView(view38);
        d(context, view38, "com.tencent.mm.view.x2c.X2CImageView", false, 38);
        d(context, c22869xb039b5f813, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 37);
        d(context, viewGroup6, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 4);
        d(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 2);
        d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // xn5.g
    public android.view.View f(android.content.Context r32, android.util.AttributeSet r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.f.f(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e1h;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_From_Appmsg_X2c_X2C";
    }
}

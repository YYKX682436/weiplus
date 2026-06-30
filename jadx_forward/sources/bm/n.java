package bm;

/* loaded from: classes16.dex */
public class n extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_finder_tier_layout_x2c";
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
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.n8p);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_finder_tip_text", com.p314xaae8f345.mm.R.C30867xcad56011.f574740ja4));
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", 0, q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db), 0, 0);
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 1);
        android.view.View view3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 2);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.p314xaae8f345.mm.R.id.n8o);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams2, "X2CLinearLayout.LayoutParams", 17);
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", 0, q(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), 0, q(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 2);
        android.view.View view5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 3);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CView", 1, 0.5f, 0));
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CView", r(context, view6, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.p314xaae8f345.mm.R.C30861xcebc809e.afv));
        view6.setLayoutParams(layoutParams3);
        viewGroup.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CView", false, 3);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 0) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 1);
            if (c22880x7ae7913b != null) {
                i0Var.p(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.n8p);
                i0Var.o(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 17);
                i0Var.L(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", t(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_finder_tip_text", com.p314xaae8f345.mm.R.C30867xcad56011.f574740ja4));
                i0Var.N(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", p(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                i0Var.O(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", u(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
            }
            g(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 1);
            view = c22880x7ae7913b;
        }
        if (i17 == 2) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 2);
            if (view != null) {
                view.setId(com.p314xaae8f345.mm.R.id.n8o);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 2);
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee c22881x884f82ee = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 3);
            if (c22881x884f82ee != null) {
                c22881x884f82ee.setBackground(r(context, c22881x884f82ee, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.p314xaae8f345.mm.R.C30861xcebc809e.afv));
            }
            g(context, c22881x884f82ee, "com.tencent.mm.view.x2c.X2CView", 3);
            view = c22881x884f82ee;
        }
        if (i17 == 3) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.crq;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Finder_Tier_Layout_X2c_X2C";
    }
}

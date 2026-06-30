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
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup = x2CLinearLayout;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 1);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.n8p);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_finder_tip_text", com.tencent.mm.R.string.f493207ja4));
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", com.tencent.mm.R.color.FG_2));
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", 0, q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479718db), 0, 0);
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 1);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 2);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.tencent.mm.R.id.n8o);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams2, "X2CLinearLayout.LayoutParams", 17);
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", 0, q(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn), 0, q(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479723df));
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 2);
        android.view.View view5 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 3);
        if (view5 == null) {
            view5 = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CView", 1, 0.5f, 0));
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CView", r(context, view6, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.tencent.mm.R.drawable.afv));
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
        xn5.i0 i0Var = xn5.j0.f455685a;
        if (i17 == 0) {
            view = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 1);
            if (x2CTextView != null) {
                i0Var.p(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.n8p);
                i0Var.o(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 17);
                i0Var.L(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", t(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_finder_tip_text", com.tencent.mm.R.string.f493207ja4));
                i0Var.N(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", p(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", com.tencent.mm.R.color.FG_2));
                i0Var.O(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", u(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
            }
            g(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1);
            view = x2CTextView;
        }
        if (i17 == 2) {
            view = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 2);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.n8o);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 2);
        }
        if (i17 == 3) {
            com.tencent.mm.view.x2c.X2CView x2CView = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 3);
            if (x2CView != null) {
                x2CView.setBackground(r(context, x2CView, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.tencent.mm.R.drawable.afv));
            }
            g(context, x2CView, "com.tencent.mm.view.x2c.X2CView", 3);
            view = x2CView;
        }
        if (i17 == 3) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.crq;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Finder_Tier_Layout_X2c_X2C";
    }
}

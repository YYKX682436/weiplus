package bm;

/* loaded from: classes16.dex */
public class v extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_retry_edit_x2c";
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
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        if (x2CLinearLayout2 == null) {
            x2CLinearLayout2 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.nan);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams, "X2CLinearLayout.LayoutParams", 17);
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz), q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479727dj), q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz), q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479727dj));
        x2CLinearLayout3.setLayoutParams(layoutParams);
        viewGroup.addView(x2CLinearLayout3);
        android.view.View view = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nam);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", com.tencent.mm.R.color.FG_2));
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_desc_text", com.tencent.mm.R.string.f493235je2));
        view2.setLayoutParams(layoutParams2);
        x2CLinearLayout3.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nal);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.O(context, view4, "com.tencent.mm.view.x2c.X2CTextView", u(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
        i0Var.N(context, view4, "com.tencent.mm.view.x2c.X2CTextView", p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@color/Link", com.tencent.mm.R.color.f478524a5));
        i0Var.L(context, view4, "com.tencent.mm.view.x2c.X2CTextView", t(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_text", com.tencent.mm.R.string.f493236je3));
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn), 0, 0, 0);
        view4.setLayoutParams(layoutParams3);
        x2CLinearLayout3.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", false, 3);
        d(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 1);
        android.view.View view5 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 4);
        if (view5 == null) {
            view5 = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CView", 1, 0.5f, 0));
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CView", r(context, view6, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.tencent.mm.R.drawable.afv));
        view6.setLayoutParams(layoutParams4);
        viewGroup.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CView", false, 4);
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
        if (i17 == 0) {
            com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CLinearLayout != null) {
                x2CLinearLayout.setOrientation(1);
            }
            g(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            view = x2CLinearLayout;
        } else {
            view = null;
        }
        if (i17 == 1) {
            view = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.nan);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        }
        xn5.i0 i0Var = xn5.j0.f455685a;
        android.view.View view2 = view;
        if (i17 == 2) {
            android.view.View view3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (view3 != null) {
                i0Var.p(context, view3, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nam);
                i0Var.O(context, view3, "com.tencent.mm.view.x2c.X2CTextView", u(context, view3, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
                i0Var.N(context, view3, "com.tencent.mm.view.x2c.X2CTextView", p(context, view3, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", com.tencent.mm.R.color.FG_2));
                i0Var.L(context, view3, "com.tencent.mm.view.x2c.X2CTextView", t(context, view3, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_desc_text", com.tencent.mm.R.string.f493235je2));
            }
            g(context, view3, "com.tencent.mm.view.x2c.X2CTextView", 2);
            view2 = view3;
        }
        android.view.View view4 = view2;
        if (i17 == 3) {
            android.view.View view5 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
            if (view5 != null) {
                i0Var.p(context, view5, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nal);
                i0Var.O(context, view5, "com.tencent.mm.view.x2c.X2CTextView", u(context, view5, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
                i0Var.N(context, view5, "com.tencent.mm.view.x2c.X2CTextView", p(context, view5, "com.tencent.mm.view.x2c.X2CTextView", "@color/Link", com.tencent.mm.R.color.f478524a5));
                i0Var.L(context, view5, "com.tencent.mm.view.x2c.X2CTextView", t(context, view5, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_text", com.tencent.mm.R.string.f493236je3));
            }
            g(context, view5, "com.tencent.mm.view.x2c.X2CTextView", 3);
            view4 = view5;
        }
        android.view.View view6 = view4;
        if (i17 == 4) {
            android.view.View view7 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 4);
            if (view7 != null) {
                view7.setBackground(r(context, view7, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.tencent.mm.R.drawable.afv));
            }
            g(context, view7, "com.tencent.mm.view.x2c.X2CView", 4);
            view6 = view7;
        }
        if (i17 == 4) {
            n();
        }
        return view6;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ctb;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Retry_Edit_X2c_X2C";
    }
}

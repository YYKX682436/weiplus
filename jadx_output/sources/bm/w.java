package bm;

/* loaded from: classes16.dex */
public class w extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_unread_tip_layout_x2c";
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
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout2 = x2CRelativeLayout;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.tencent.mm.R.id.ncf);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.f(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", r(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", "@drawable/sns_unread_tip_item_bg", com.tencent.mm.R.drawable.b2z));
        i0Var.x(context, layoutParams, "X2CLinearLayout.LayoutParams", 17);
        i0Var.d(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", 0, q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479723df), 0, q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479723df));
        x2CRelativeLayout2.setLayoutParams(layoutParams);
        viewGroup.addView(x2CRelativeLayout2);
        android.view.View view = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nch);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.w(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/Brand", com.tencent.mm.R.color.f478502m));
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 15.0f, 0));
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_unread_tip_text", com.tencent.mm.R.string.jgr));
        i0Var.e(context, view2, "com.tencent.mm.view.x2c.X2CTextView", v(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "bold", "", ""));
        view2.setLayoutParams(layoutParams2);
        x2CRelativeLayout2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        android.view.View view3 = (com.tencent.mm.ui.widget.StoryAvatarDotsView) h(context, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
        if (view3 == null) {
            view3 = new com.tencent.mm.ui.widget.StoryAvatarDotsView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", com.tencent.mm.R.id.nce);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.w(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.z(context, layoutParams3, "X2CRelativeLayout.LayoutParams", com.tencent.mm.R.id.nch);
        i0Var.c(context, layoutParams3, "X2CRelativeLayout.LayoutParams", q(context, view4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9), 0, 0, 0);
        view4.setLayoutParams(layoutParams3);
        x2CRelativeLayout2.addView(view4);
        d(context, view4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", false, 3);
        d(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 1);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [xn5.g, bm.w] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.tencent.mm.view.x2c.X2CLinearLayout, android.widget.LinearLayout, android.view.View] */
    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            ?? r17 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (r17 != 0) {
                r17.setOrientation(1);
            }
            g(context, r17, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            x2CRelativeLayout = r17;
        } else {
            x2CRelativeLayout = null;
        }
        if (i17 == 1) {
            com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout2 = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
            if (x2CRelativeLayout2 != null) {
                x2CRelativeLayout2.setId(com.tencent.mm.R.id.ncf);
                x2CRelativeLayout2.setBackground(r(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", "@drawable/sns_unread_tip_item_bg", com.tencent.mm.R.drawable.b2z));
                x2CRelativeLayout2.setPadding(q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv));
            }
            g(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
            x2CRelativeLayout = x2CRelativeLayout2;
        }
        android.view.View view = x2CRelativeLayout;
        if (i17 == 2) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (x2CTextView != null) {
                xn5.i0 i0Var = xn5.j0.f455685a;
                i0Var.p(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nch);
                i0Var.N(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", p(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@color/Brand", com.tencent.mm.R.color.f478502m));
                i0Var.O(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", u(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1, 15.0f, 0));
                i0Var.L(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", t(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_unread_tip_text", com.tencent.mm.R.string.jgr));
                i0Var.e(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", v(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "bold", "", ""));
            }
            g(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 2);
            view = x2CTextView;
        }
        android.view.View view2 = view;
        if (i17 == 3) {
            com.tencent.mm.ui.widget.StoryAvatarDotsView storyAvatarDotsView = (com.tencent.mm.ui.widget.StoryAvatarDotsView) h(context, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
            if (storyAvatarDotsView != null) {
                storyAvatarDotsView.setId(com.tencent.mm.R.id.nce);
            }
            g(context, storyAvatarDotsView, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
            view2 = storyAvatarDotsView;
        }
        android.view.View view3 = view2;
        if (i17 == 4) {
            com.tencent.mm.view.x2c.X2CView x2CView = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 4);
            if (x2CView != null) {
                x2CView.setBackground(r(context, x2CView, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.tencent.mm.R.drawable.afv));
            }
            g(context, x2CView, "com.tencent.mm.view.x2c.X2CView", 4);
            view3 = x2CView;
        }
        if (i17 == 4) {
            n();
        }
        return view3;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cul;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Unread_Tip_Layout_X2c_X2C";
    }
}

package bm;

/* loaded from: classes16.dex */
public class b extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_appmsg_mp_foot_x2c";
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
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout2 = x2CRelativeLayout;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 16);
        i0Var.A(context, layoutParams, "X2CLinearLayout.LayoutParams", 1.0f);
        x2CRelativeLayout2.setLayoutParams(layoutParams);
        viewGroup.addView(x2CRelativeLayout2);
        android.view.View view = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bj9);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 12.0f, 0));
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 12.0f, 0));
        i0Var.w(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 16);
        i0Var.I(context, view2, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/default_avatar", com.tencent.mm.R.drawable.bhm));
        i0Var.c(context, layoutParams2, "X2CRelativeLayout.LayoutParams", 0, 0, q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 4.0f, 0), 0);
        view2.setLayoutParams(layoutParams2);
        x2CRelativeLayout2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        android.view.View view3 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 3);
        if (view3 == null) {
            view3 = new com.tencent.mm.ui.widget.MMTextView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.bja);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.z(context, layoutParams3, "X2CRelativeLayout.LayoutParams", com.tencent.mm.R.id.bj9);
        i0Var.N(context, view4, "com.tencent.mm.ui.widget.MMTextView", p(context, view4, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.tencent.mm.R.color.t_));
        i0Var.D(context, view4, "com.tencent.mm.ui.widget.MMTextView", s(context, view4, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
        i0Var.l(context, view4, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.O(context, view4, "com.tencent.mm.ui.widget.MMTextView", u(context, view4, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        view4.setLayoutParams(layoutParams3);
        x2CRelativeLayout2.addView(view4);
        d(context, view4, "com.tencent.mm.ui.widget.MMTextView", false, 3);
        d(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 1);
        android.view.View view5 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 4);
        if (view5 == null) {
            view5 = new com.tencent.mm.ui.widget.MMTextView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view6, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.bjj);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view6, "com.tencent.mm.ui.widget.MMTextView", p(context, view6, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.tencent.mm.R.color.t_));
        i0Var.D(context, view6, "com.tencent.mm.ui.widget.MMTextView", s(context, view6, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
        i0Var.O(context, view6, "com.tencent.mm.ui.widget.MMTextView", u(context, view6, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        i0Var.c(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9), 0, 0, 0);
        view6.setLayoutParams(layoutParams4);
        viewGroup.addView(view6);
        d(context, view6, "com.tencent.mm.ui.widget.MMTextView", false, 4);
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
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            view = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 16);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        }
        if (i17 == 2) {
            view = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
            if (view != null) {
                i0Var.p(context, view, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bj9);
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CImageView", 16);
                i0Var.I(context, view, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var.K(context, view, "com.tencent.mm.view.x2c.X2CImageView", r(context, view, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/default_avatar", com.tencent.mm.R.drawable.bhm));
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CImageView", 2);
        }
        if (i17 == 3) {
            com.tencent.mm.ui.widget.MMTextView mMTextView = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 3);
            if (mMTextView != null) {
                i0Var.p(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.bja);
                i0Var.N(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", p(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.tencent.mm.R.color.t_));
                i0Var.D(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", s(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
                i0Var.l(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.O(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", u(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
            }
            g(context, mMTextView, "com.tencent.mm.ui.widget.MMTextView", 3);
            view = mMTextView;
        }
        if (i17 == 4) {
            com.tencent.mm.ui.widget.MMTextView mMTextView2 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 4);
            if (mMTextView2 != null) {
                i0Var.p(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.bjj);
                i0Var.N(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", p(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.tencent.mm.R.color.t_));
                i0Var.D(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", s(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
                i0Var.O(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", u(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
            }
            g(context, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", 4);
            view = mMTextView2;
        }
        if (i17 == 4) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dbb;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_Appmsg_Mp_Foot_X2c_X2C";
    }
}

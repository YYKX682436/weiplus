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
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup = c22869xb039b5f8;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        if (c22874x32dcda1f == null) {
            c22874x32dcda1f = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f2 = c22874x32dcda1f;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 16);
        i0Var.A(context, layoutParams, "X2CLinearLayout.LayoutParams", 1.0f);
        c22874x32dcda1f2.setLayoutParams(layoutParams);
        viewGroup.addView(c22874x32dcda1f2);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bj9);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 12.0f, 0));
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 12.0f, 0));
        i0Var.w(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 16);
        i0Var.I(context, view2, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/default_avatar", com.p314xaae8f345.mm.R.C30861xcebc809e.bhm));
        i0Var.c(context, layoutParams2, "X2CRelativeLayout.LayoutParams", 0, 0, q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 4.0f, 0), 0);
        view2.setLayoutParams(layoutParams2);
        c22874x32dcda1f2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        android.view.View view3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 3);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bja);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.z(context, layoutParams3, "X2CRelativeLayout.LayoutParams", com.p314xaae8f345.mm.R.id.bj9);
        i0Var.N(context, view4, "com.tencent.mm.ui.widget.MMTextView", p(context, view4, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        i0Var.D(context, view4, "com.tencent.mm.ui.widget.MMTextView", s(context, view4, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
        i0Var.l(context, view4, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.O(context, view4, "com.tencent.mm.ui.widget.MMTextView", u(context, view4, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        view4.setLayoutParams(layoutParams3);
        c22874x32dcda1f2.addView(view4);
        d(context, view4, "com.tencent.mm.ui.widget.MMTextView", false, 3);
        d(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 1);
        android.view.View view5 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 4);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view6, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjj);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view6, "com.tencent.mm.ui.widget.MMTextView", p(context, view6, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        i0Var.D(context, view6, "com.tencent.mm.ui.widget.MMTextView", s(context, view6, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
        i0Var.O(context, view6, "com.tencent.mm.ui.widget.MMTextView", u(context, view6, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        i0Var.c(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0, 0);
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
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 0) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 16);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        }
        if (i17 == 2) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
            if (view != null) {
                i0Var.p(context, view, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.bj9);
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CImageView", 16);
                i0Var.I(context, view, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var.K(context, view, "com.tencent.mm.view.x2c.X2CImageView", r(context, view, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/default_avatar", com.p314xaae8f345.mm.R.C30861xcebc809e.bhm));
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CImageView", 2);
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 3);
            if (c22632xdab56332 != null) {
                i0Var.p(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bja);
                i0Var.N(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", p(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
                i0Var.D(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", s(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
                i0Var.l(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
                i0Var.O(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", u(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
            }
            g(context, c22632xdab56332, "com.tencent.mm.ui.widget.MMTextView", 3);
            view = c22632xdab56332;
        }
        if (i17 == 4) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563322 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) h(context, "com.tencent.mm.ui.widget.MMTextView", 4);
            if (c22632xdab563322 != null) {
                i0Var.p(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", com.p314xaae8f345.mm.R.id.bjj);
                i0Var.N(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", p(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
                i0Var.D(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", s(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", 1, 0));
                i0Var.O(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", u(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
            }
            g(context, c22632xdab563322, "com.tencent.mm.ui.widget.MMTextView", 4);
            view = c22632xdab563322;
        }
        if (i17 == 4) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dbb;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_Appmsg_Mp_Foot_X2c_X2C";
    }
}

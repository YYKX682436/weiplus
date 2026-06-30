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
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup = c22869xb039b5f8;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        if (c22874x32dcda1f == null) {
            c22874x32dcda1f = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f2 = c22874x32dcda1f;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.p314xaae8f345.mm.R.id.ncf);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.f(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", r(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", "@drawable/sns_unread_tip_item_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.b2z));
        i0Var.x(context, layoutParams, "X2CLinearLayout.LayoutParams", 17);
        i0Var.d(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", 0, q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df), 0, q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        c22874x32dcda1f2.setLayoutParams(layoutParams);
        viewGroup.addView(c22874x32dcda1f2);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.nch);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.w(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/Brand", com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 15.0f, 0));
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_unread_tip_text", com.p314xaae8f345.mm.R.C30867xcad56011.jgr));
        i0Var.e(context, view2, "com.tencent.mm.view.x2c.X2CTextView", v(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "bold", "", ""));
        view2.setLayoutParams(layoutParams2);
        c22874x32dcda1f2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        android.view.View view3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22648x3baf96bd) h(context, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22648x3baf96bd(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", com.p314xaae8f345.mm.R.id.nce);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.w(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.z(context, layoutParams3, "X2CRelativeLayout.LayoutParams", com.p314xaae8f345.mm.R.id.nch);
        i0Var.c(context, layoutParams3, "X2CRelativeLayout.LayoutParams", q(context, view4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0, 0);
        view4.setLayoutParams(layoutParams3);
        c22874x32dcda1f2.addView(view4);
        d(context, view4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", false, 3);
        d(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 1);
        android.view.View view5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 4);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CView", 1, 0.5f, 0));
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CView", r(context, view6, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.p314xaae8f345.mm.R.C30861xcebc809e.afv));
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
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            ?? r17 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (r17 != 0) {
                r17.setOrientation(1);
            }
            g(context, r17, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            c22874x32dcda1f = r17;
        } else {
            c22874x32dcda1f = null;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f2 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
            if (c22874x32dcda1f2 != null) {
                c22874x32dcda1f2.setId(com.p314xaae8f345.mm.R.id.ncf);
                c22874x32dcda1f2.setBackground(r(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", "@drawable/sns_unread_tip_item_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.b2z));
                c22874x32dcda1f2.setPadding(q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), q(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
            }
            g(context, c22874x32dcda1f2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
            c22874x32dcda1f = c22874x32dcda1f2;
        }
        android.view.View view = c22874x32dcda1f;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (c22880x7ae7913b != null) {
                xn5.i0 i0Var = xn5.j0.f537218a;
                i0Var.p(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.nch);
                i0Var.N(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", p(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", "@color/Brand", com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                i0Var.O(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", u(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 1, 15.0f, 0));
                i0Var.L(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", t(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_unread_tip_text", com.p314xaae8f345.mm.R.C30867xcad56011.jgr));
                i0Var.e(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", v(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", "bold", "", ""));
            }
            g(context, c22880x7ae7913b, "com.tencent.mm.view.x2c.X2CTextView", 2);
            view = c22880x7ae7913b;
        }
        android.view.View view2 = view;
        if (i17 == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22648x3baf96bd c22648x3baf96bd = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22648x3baf96bd) h(context, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
            if (c22648x3baf96bd != null) {
                c22648x3baf96bd.setId(com.p314xaae8f345.mm.R.id.nce);
            }
            g(context, c22648x3baf96bd, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
            view2 = c22648x3baf96bd;
        }
        android.view.View view3 = view2;
        if (i17 == 4) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee c22881x884f82ee = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22881x884f82ee) h(context, "com.tencent.mm.view.x2c.X2CView", 4);
            if (c22881x884f82ee != null) {
                c22881x884f82ee.setBackground(r(context, c22881x884f82ee, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", com.p314xaae8f345.mm.R.C30861xcebc809e.afv));
            }
            g(context, c22881x884f82ee, "com.tencent.mm.view.x2c.X2CView", 4);
            view3 = c22881x884f82ee;
        }
        if (i17 == 4) {
            n();
        }
        return view3;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cul;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Unread_Tip_Layout_X2c_X2C";
    }
}

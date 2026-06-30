package bm;

/* loaded from: classes16.dex */
public class k extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "improve_comment_view_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f c22874x32dcda1f = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (c22874x32dcda1f == null) {
            c22874x32dcda1f = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup = c22874x32dcda1f;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.p314xaae8f345.mm.R.id.c6p);
        i0Var.B(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.N(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/FG_0_5", com.p314xaae8f345.mm.R.C30859x5a72f63.f77759x7b87af68));
        i0Var.O(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 1);
        android.view.View view3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 2);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.p314xaae8f345.mm.R.id.f565320c16);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        layoutParams2.addRule(8, com.p314xaae8f345.mm.R.id.c6p);
        layoutParams2.addRule(21, -1);
        i0Var.f(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", r(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@drawable/sns_clickable_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.b1h));
        i0Var.L(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", t(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@string/sns_comment_spread", com.p314xaae8f345.mm.R.C30867xcad56011.f574734lo3));
        i0Var.N(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/link_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        i0Var.O(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
        i0Var.P(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 8);
        i0Var.d(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", q(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0, q(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0);
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 2);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CRelativeLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        int i18;
        int i19;
        java.lang.String str2;
        android.content.Context context2;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        } else {
            view = null;
        }
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea c18277x17b0cea = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
            if (c18277x17b0cea != null) {
                i0Var.p(context, c18277x17b0cea, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.p314xaae8f345.mm.R.id.c6p);
                i0Var.N(context, c18277x17b0cea, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, c18277x17b0cea, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/FG_0_5", com.p314xaae8f345.mm.R.C30859x5a72f63.f77759x7b87af68));
                i0Var.O(context, c18277x17b0cea, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, c18277x17b0cea, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
            }
            g(context, c18277x17b0cea, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
            view = c18277x17b0cea;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea c18277x17b0cea2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 2);
            if (c18277x17b0cea2 != null) {
                i0Var.p(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.p314xaae8f345.mm.R.id.f565320c16);
                view = c18277x17b0cea2;
                i0Var.f(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", r(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@drawable/sns_clickable_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.b1h));
                i0Var.L(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", t(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@string/sns_comment_spread", com.p314xaae8f345.mm.R.C30867xcad56011.f574734lo3));
                i0Var.N(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/link_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
                i0Var.O(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
                i0Var.P(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 8);
                i18 = 2;
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView";
                i19 = i17;
                context2 = context;
                i0Var.d(context, c18277x17b0cea2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", q(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0, q(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f), 0);
            } else {
                view = c18277x17b0cea2;
                i18 = 2;
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView";
                i19 = i17;
                context2 = context;
            }
            g(context2, view, str2, i18);
        } else {
            i18 = 2;
            i19 = i17;
        }
        if (i19 == i18) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bkp;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Improve_Comment_View_X2c_X2C";
    }
}

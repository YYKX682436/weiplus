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
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup = x2CRelativeLayout;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
        if (view == null) {
            view = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.tencent.mm.R.id.c6p);
        i0Var.B(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.N(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/FG_0_5", com.tencent.mm.R.color.FG_0_5));
        i0Var.O(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 1);
        android.view.View view3 = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 2);
        if (view3 == null) {
            view3 = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.tencent.mm.R.id.f483787c16);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        layoutParams2.addRule(8, com.tencent.mm.R.id.c6p);
        layoutParams2.addRule(21, -1);
        i0Var.f(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", r(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@drawable/sns_clickable_bg", com.tencent.mm.R.drawable.b1h));
        i0Var.L(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", t(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@string/sns_comment_spread", com.tencent.mm.R.string.f493201lo3));
        i0Var.N(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/link_color", com.tencent.mm.R.color.f479308vo));
        i0Var.O(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
        i0Var.P(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 8);
        i0Var.d(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", q(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), 0, q(context, view4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), 0);
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
            view = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        } else {
            view = null;
        }
        xn5.i0 i0Var = xn5.j0.f455685a;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
            if (improveTextView != null) {
                i0Var.p(context, improveTextView, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.tencent.mm.R.id.c6p);
                i0Var.N(context, improveTextView, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, improveTextView, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/FG_0_5", com.tencent.mm.R.color.FG_0_5));
                i0Var.O(context, improveTextView, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, improveTextView, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
            }
            g(context, improveTextView, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
            view = improveTextView;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView2 = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 2);
            if (improveTextView2 != null) {
                i0Var.p(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.tencent.mm.R.id.f483787c16);
                view = improveTextView2;
                i0Var.f(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", r(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@drawable/sns_clickable_bg", com.tencent.mm.R.drawable.b1h));
                i0Var.L(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", t(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@string/sns_comment_spread", com.tencent.mm.R.string.f493201lo3));
                i0Var.N(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/link_color", com.tencent.mm.R.color.f479308vo));
                i0Var.O(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", u(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
                i0Var.P(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 8);
                i18 = 2;
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView";
                i19 = i17;
                context2 = context;
                i0Var.d(context, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", q(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), 0, q(context, view, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), 0);
            } else {
                view = improveTextView2;
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
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bkp;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Improve_Comment_View_X2c_X2C";
    }
}

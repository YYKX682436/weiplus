package bm;

/* loaded from: classes16.dex */
public class m extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "sns_finder_live_time_line_item_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        android.view.ViewGroup viewGroup = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.p(context, viewGroup2, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.tencent.mm.R.id.n8j);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        viewGroup2.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.n8n);
        i0Var.B(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.I(context, view2, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", com.tencent.mm.R.color.f478492d));
        view2.setLayoutParams(layoutParams);
        viewGroup2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 1);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 2);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CFrameLayout(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CFrameLayout", com.tencent.mm.R.id.icp);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        view4.setLayoutParams(layoutParams2);
        viewGroup2.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 2);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = x2CLinearLayout;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.frm);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 18.0f, 0));
        i0Var.o(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.f(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_bg", com.tencent.mm.R.drawable.a4y));
        i0Var.G(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479725dh));
        i0Var.P(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams3, "X2CRelativeLayout.LayoutParams", q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl));
        x2CLinearLayout2.setLayoutParams(layoutParams3);
        viewGroup2.addView(x2CLinearLayout2);
        android.view.View view5 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 4);
        if (view5 == null) {
            view5 = new com.tencent.mm.ui.widget.imageview.WeImageView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9));
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9));
        i0Var.K(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.tencent.mm.R.raw.finder_live_logo));
        xn5.j jVar = xn5.k.f455686a;
        jVar.a(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.tencent.mm.R.color.f478553an));
        i0Var.c(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), 0, 0, 0);
        view6.setLayoutParams(layoutParams4);
        x2CLinearLayout2.addView(view6);
        d(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 4);
        android.view.View view7 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 5);
        if (view7 == null) {
            view7 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.frn);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.L(context, view8, "com.tencent.mm.view.x2c.X2CTextView", t(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_share_tag_text", com.tencent.mm.R.string.ecz));
        i0Var.N(context, view8, "com.tencent.mm.view.x2c.X2CTextView", p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.tencent.mm.R.color.f478553an));
        i0Var.O(context, view8, "com.tencent.mm.view.x2c.X2CTextView", u(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479591a1));
        i0Var.c(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479644bj), 0, q(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0);
        view8.setLayoutParams(layoutParams5);
        x2CLinearLayout2.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CTextView", false, 5);
        d(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 3);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        if (x2CLinearLayout3 == null) {
            x2CLinearLayout3 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.f7z);
        i0Var.B(context, layoutParams6, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 18.0f, 0));
        i0Var.o(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.f(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_grey_bg", com.tencent.mm.R.drawable.a4z));
        i0Var.G(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479725dh));
        i0Var.P(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl));
        x2CLinearLayout4.setLayoutParams(layoutParams6);
        viewGroup2.addView(x2CLinearLayout4);
        android.view.View view9 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 7);
        if (view9 == null) {
            view9 = new com.tencent.mm.ui.widget.imageview.WeImageView(context, xn5.q0.f455705d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9));
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9));
        i0Var.K(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.tencent.mm.R.raw.finder_live_logo));
        jVar.a(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.tencent.mm.R.color.f478553an));
        i0Var.c(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), 0, 0, 0);
        view10.setLayoutParams(layoutParams7);
        x2CLinearLayout4.addView(view10);
        d(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 7);
        android.view.View view11 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 8);
        if (view11 == null) {
            view11 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view12 = view11;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.f484706f80);
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.L(context, view12, "com.tencent.mm.view.x2c.X2CTextView", t(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_end", com.tencent.mm.R.string.dcj));
        i0Var.N(context, view12, "com.tencent.mm.view.x2c.X2CTextView", p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.tencent.mm.R.color.f478553an));
        i0Var.O(context, view12, "com.tencent.mm.view.x2c.X2CTextView", u(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479591a1));
        i0Var.c(context, layoutParams8, "X2CLinearLayout.LayoutParams", q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479644bj), 0, q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0);
        view12.setLayoutParams(layoutParams8);
        x2CLinearLayout4.addView(view12);
        d(context, view12, "com.tencent.mm.view.x2c.X2CTextView", false, 8);
        d(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 6);
        com.tencent.mm.view.x2c.X2CFrameLayout x2CFrameLayout = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 9);
        if (x2CFrameLayout == null) {
            x2CFrameLayout = new com.tencent.mm.view.x2c.X2CFrameLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup3 = x2CFrameLayout;
        android.widget.RelativeLayout.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", com.tencent.mm.R.id.rll);
        i0Var.B(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.F(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479727dj));
        layoutParams9.addRule(12, -1);
        i0Var.P(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 8);
        i0Var.f(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", r(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/finder_share_bottom_gradient_background", com.tencent.mm.R.drawable.acg));
        i0Var.d(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0, 0, q(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv));
        viewGroup3.setLayoutParams(layoutParams9);
        viewGroup2.addView(viewGroup3);
        android.view.View view13 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
        if (view13 == null) {
            view13 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view14, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.f484615rm0);
        i0Var.B(context, layoutParams10, "X2CFrameLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams10, "X2CFrameLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams10, "X2CFrameLayout.LayoutParams", 80);
        i0Var.l(context, view14, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.D(context, view14, "com.tencent.mm.view.x2c.X2CTextView", s(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        i0Var.N(context, view14, "com.tencent.mm.view.x2c.X2CTextView", p(context, view14, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.tencent.mm.R.color.BW_100_Alpha_0_8));
        i0Var.O(context, view14, "com.tencent.mm.view.x2c.X2CTextView", u(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479788f9));
        i0Var.c(context, layoutParams10, "X2CFrameLayout.LayoutParams", q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0, q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0);
        view14.setLayoutParams(layoutParams10);
        viewGroup3.addView(view14);
        d(context, view14, "com.tencent.mm.view.x2c.X2CTextView", false, 10);
        d(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 9);
        android.view.View view15 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 11);
        if (view15 == null) {
            view15 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view16 = view15;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view16, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.e_l);
        i0Var.B(context, layoutParams11, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams11, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams11, "X2CRelativeLayout.LayoutParams", 17);
        i0Var.o(context, view16, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.N(context, view16, "com.tencent.mm.view.x2c.X2CTextView", p(context, view16, "com.tencent.mm.view.x2c.X2CTextView", "#b3ffffff", 0));
        i0Var.O(context, view16, "com.tencent.mm.view.x2c.X2CTextView", u(context, view16, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
        i0Var.P(context, view16, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.v(context, layoutParams11, "X2CRelativeLayout.LayoutParams", -1);
        view16.setLayoutParams(layoutParams11);
        viewGroup2.addView(view16);
        d(context, view16, "com.tencent.mm.view.x2c.X2CTextView", false, 11);
        d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CRelativeLayout", true, 0);
        n();
        return viewGroup2;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        java.lang.String str2;
        java.lang.String str3;
        xn5.i0 i0Var;
        int i18;
        android.content.Context context2;
        android.content.Context context3;
        int i19;
        java.lang.String str4;
        xn5.i0 i0Var2;
        int i27;
        int i28;
        java.lang.String str5;
        android.view.View view2;
        android.view.View view3;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            view = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.n8j);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        } else {
            view = null;
        }
        xn5.i0 i0Var3 = xn5.j0.f455685a;
        if (i17 == 1) {
            android.view.View view4 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
            if (view4 != null) {
                i0Var3.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.n8n);
                i0Var3.I(context, view4, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var3.K(context, view4, "com.tencent.mm.view.x2c.X2CImageView", r(context, view4, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", com.tencent.mm.R.color.f478492d));
            }
            g(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 1);
            view = view4;
        }
        if (i17 == 2) {
            view = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 2);
            if (view != null) {
                view.setId(com.tencent.mm.R.id.icp);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 2);
        }
        if (i17 == 3) {
            android.view.View view5 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
            if (view5 != null) {
                i0Var3.p(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.frm);
                i0Var3.o(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var3.f(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_bg", com.tencent.mm.R.drawable.a4y));
                i0Var3.G(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479725dh));
                i0Var3.P(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
            }
            g(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
            view = view5;
        }
        if (i17 == 4) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 4);
            if (weImageView != null) {
                weImageView.setImageDrawable(r(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.tencent.mm.R.raw.finder_live_logo));
                weImageView.setIconColor(p(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.tencent.mm.R.color.f478553an));
            }
            g(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 4);
            view = weImageView;
        }
        if (i17 == 5) {
            android.view.View view6 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 5);
            if (view6 != null) {
                i0Var3.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.frn);
                view3 = view6;
                i0Var3.L(context, view3, "com.tencent.mm.view.x2c.X2CTextView", t(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_share_tag_text", com.tencent.mm.R.string.ecz));
                i0Var3.N(context, view3, "com.tencent.mm.view.x2c.X2CTextView", p(context, view3, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.tencent.mm.R.color.f478553an));
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                i0Var3.O(context, view3, str2, u(context, view3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479591a1));
            } else {
                view3 = view6;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
            }
            g(context, view3, str2, 5);
            view = view3;
        } else {
            str2 = "com.tencent.mm.view.x2c.X2CTextView";
        }
        if (i17 == 6) {
            android.view.View view7 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            if (view7 != null) {
                i0Var3.p(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.f7z);
                i0Var3.o(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var3.f(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_grey_bg", com.tencent.mm.R.drawable.a4z));
                view2 = view7;
                i0Var3.G(context, view2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479725dh));
                i0Var3.P(context, view2, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
            } else {
                view2 = view7;
            }
            g(context, view2, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            view = view2;
        }
        if (i17 == 7) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 7);
            if (weImageView2 != null) {
                weImageView2.setImageDrawable(r(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.tencent.mm.R.raw.finder_live_logo));
                weImageView2.setIconColor(p(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.tencent.mm.R.color.f478553an));
            }
            g(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", 7);
            view = weImageView2;
        }
        if (i17 == 8) {
            android.view.View view8 = (com.tencent.mm.view.x2c.X2CTextView) h(context, str2, 8);
            if (view8 != null) {
                i0Var3.p(context, view8, str2, com.tencent.mm.R.id.f484706f80);
                i0Var3.L(context, view8, str2, t(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_end", com.tencent.mm.R.string.dcj));
                i0Var3.N(context, view8, str2, p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.tencent.mm.R.color.f478553an));
                i0Var3.O(context, view8, str2, u(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479591a1));
            }
            g(context, view8, str2, 8);
            view = view8;
        }
        if (i17 == 9) {
            android.view.View view9 = (com.tencent.mm.view.x2c.X2CFrameLayout) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 9);
            if (view9 != null) {
                i0Var3.p(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", com.tencent.mm.R.id.rll);
                view = view9;
                i0Var3.F(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479727dj));
                i0Var3.P(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", 8);
                i0Var3.f(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", r(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/finder_share_bottom_gradient_background", com.tencent.mm.R.drawable.acg));
                str3 = str2;
                i28 = 9;
                str5 = "com.tencent.mm.view.x2c.X2CFrameLayout";
                i18 = i17;
                i0Var = i0Var3;
                context2 = context;
                i0Var3.d(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0, 0, q(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv));
            } else {
                view = view9;
                str3 = str2;
                i28 = 9;
                str5 = "com.tencent.mm.view.x2c.X2CFrameLayout";
                i0Var = i0Var3;
                i18 = i17;
                context2 = context;
            }
            g(context2, view, str5, i28);
        } else {
            str3 = str2;
            i0Var = i0Var3;
            i18 = i17;
            context2 = context;
        }
        if (i18 == 10) {
            android.view.View view10 = (com.tencent.mm.view.x2c.X2CTextView) h(context2, str3, 10);
            if (view10 != null) {
                xn5.i0 i0Var4 = i0Var;
                i0Var4.p(context2, view10, str3, com.tencent.mm.R.id.f484615rm0);
                i0Var4.l(context2, view10, str3, android.text.TextUtils.TruncateAt.END);
                i0Var2 = i0Var4;
                context3 = context2;
                i19 = i18;
                i27 = 8;
                i0Var2.D(context3, view10, str3, s(context, view10, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                i0Var2.N(context3, view10, str3, p(context, view10, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.tencent.mm.R.color.BW_100_Alpha_0_8));
                str4 = str3;
                i0Var2.O(context3, view10, str4, u(context, view10, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479788f9));
            } else {
                context3 = context2;
                i19 = i18;
                str4 = str3;
                i0Var2 = i0Var;
                i27 = 8;
            }
            g(context3, view10, str4, 10);
            view = view10;
        } else {
            context3 = context2;
            i19 = i18;
            str4 = str3;
            i0Var2 = i0Var;
            i27 = 8;
        }
        if (i19 == 11) {
            android.view.View view11 = (com.tencent.mm.view.x2c.X2CTextView) h(context3, str4, 11);
            if (view11 != null) {
                i0Var2.p(context3, view11, str4, com.tencent.mm.R.id.e_l);
                i0Var2.o(context3, view11, str4, 17);
                i0Var2.N(context3, view11, str4, p(context, view11, "com.tencent.mm.view.x2c.X2CTextView", "#b3ffffff", 0));
                i0Var2.O(context3, view11, str4, u(context, view11, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479850gz));
                i0Var2.P(context3, view11, str4, i27);
            }
            g(context3, view11, str4, 11);
            view = view11;
        }
        if (i19 == 11) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.crn;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Finder_Live_Time_Line_Item_X2c_X2C";
    }
}

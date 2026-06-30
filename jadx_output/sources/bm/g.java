package bm;

/* loaded from: classes16.dex */
public class g extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_from_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        android.view.ViewGroup viewGroup = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.h(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", false);
        i0Var.i(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", false);
        i0Var.H(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0, q(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0);
        viewGroup2.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dbd, viewGroup2, true);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.a(inflate.getLayoutParams(), layoutParams);
        inflate.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup3 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
        if (viewGroup3 == null) {
            viewGroup3 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup4 = viewGroup3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", 0, q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0));
        viewGroup4.setLayoutParams(layoutParams2);
        viewGroup2.addView(viewGroup4);
        android.view.View view = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.brc);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 19);
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
        i0Var.E(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 240.0f, 0));
        i0Var.J(context, view2, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.P(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0, q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0);
        i0Var.b(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 0.0f, 0), 1.0f);
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 1.5f, 0));
        view2.setLayoutParams(layoutParams3);
        viewGroup4.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", false, 3);
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 4);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup5 = x2CRelativeLayout;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        viewGroup5.setLayoutParams(layoutParams4);
        viewGroup4.addView(viewGroup5);
        android.view.View view3 = (com.tencent.mm.ui.widget.MMNeat7extView) h(context, "com.tencent.mm.ui.widget.MMNeat7extView", 5);
        if (view3 == null) {
            view3 = new com.tencent.mm.ui.widget.MMNeat7extView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", com.tencent.mm.R.id.bkl);
        i0Var.B(context, layoutParams5, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams5, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.o(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", 16);
        i0Var.N(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", p(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", "@color/FG_0", com.tencent.mm.R.color.FG_0));
        i0Var.O(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", u(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", 0, 0.0f, com.tencent.mm.R.dimen.f479897ia));
        i0Var.E(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", q(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", 0, 0.0f, com.tencent.mm.R.dimen.f480241sa));
        i0Var.F(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", q(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", 0, 0.0f, com.tencent.mm.R.dimen.a_));
        i0Var.f(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", r(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", "@drawable/chatfrom_bg", com.tencent.mm.R.drawable.f481181mh));
        i0Var.l(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", android.text.TextUtils.TruncateAt.END);
        i0Var.b(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", q(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", 1, 2.0f, 0), 1.0f);
        view4.setLayoutParams(layoutParams5);
        viewGroup5.addView(view4);
        d(context, view4, "com.tencent.mm.ui.widget.MMNeat7extView", false, 5);
        android.view.View view5 = (com.tencent.mm.ui.base.AnimImageView) h(context, "com.tencent.mm.ui.base.AnimImageView", 6);
        if (view5 == null) {
            view5 = new com.tencent.mm.ui.base.AnimImageView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view6, "com.tencent.mm.ui.base.AnimImageView", com.tencent.mm.R.id.bqu);
        layoutParams6.addRule(6, com.tencent.mm.R.id.bkl);
        i0Var.z(context, layoutParams6, "X2CRelativeLayout.LayoutParams", com.tencent.mm.R.id.bkl);
        i0Var.B(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.base.AnimImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz));
        i0Var.y(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.base.AnimImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz));
        i0Var.P(context, view6, "com.tencent.mm.ui.base.AnimImageView", 8);
        i0Var.c(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.base.AnimImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), q(context, view6, "com.tencent.mm.ui.base.AnimImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0, 0);
        view6.setLayoutParams(layoutParams6);
        viewGroup5.addView(view6);
        d(context, view6, "com.tencent.mm.ui.base.AnimImageView", false, 6);
        android.view.View view7 = (com.tencent.mm.view.x2c.X2CProgressBar) h(context, "com.tencent.mm.view.x2c.X2CProgressBar", 7);
        if (view7 == null) {
            view7 = new com.tencent.mm.view.x2c.X2CProgressBar(context, xn5.q0.f455705d);
        }
        android.view.View view8 = view7;
        android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", com.tencent.mm.R.id.neo);
        i0Var.r(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", r(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", "@drawable/progress_small_holo", com.tencent.mm.R.drawable.avm));
        i0Var.G(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", q(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 1, 16.0f, 0));
        i0Var.E(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", q(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 1, 16.0f, 0));
        i0Var.F(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", q(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 1, 16.0f, 0));
        i0Var.C(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", q(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 1, 16.0f, 0));
        i0Var.M(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", xn5.j1.a(context, android.R.attr.textAppearance));
        layoutParams7.addRule(6, com.tencent.mm.R.id.bkl);
        i0Var.z(context, layoutParams7, "X2CRelativeLayout.LayoutParams", com.tencent.mm.R.id.bkl);
        i0Var.B(context, layoutParams7, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams7, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams7, "X2CRelativeLayout.LayoutParams", 48);
        i0Var.P(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 8);
        i0Var.c(context, layoutParams7, "X2CRelativeLayout.LayoutParams", q(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), q(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9), 0, 0);
        view8.setLayoutParams(layoutParams7);
        viewGroup5.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CProgressBar", false, 7);
        d(context, viewGroup5, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 4);
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout2 = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 8);
        if (x2CRelativeLayout2 == null) {
            x2CRelativeLayout2 = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout3 = x2CRelativeLayout2;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams8, "X2CLinearLayout.LayoutParams", q(context, x2CRelativeLayout3, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479928j8), 0, 0, 0);
        x2CRelativeLayout3.setLayoutParams(layoutParams8);
        viewGroup4.addView(x2CRelativeLayout3);
        android.view.View view9 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 9);
        if (view9 == null) {
            view9 = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view10, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.f483646bk5);
        i0Var.K(context, view10, "com.tencent.mm.view.x2c.X2CImageView", r(context, view10, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/bad_msg_icon", com.tencent.mm.R.drawable.bws));
        i0Var.w(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.P(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.B(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams9, "X2CRelativeLayout.LayoutParams", 0, q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.j_), q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479928j8), 0);
        view10.setLayoutParams(layoutParams9);
        x2CRelativeLayout3.addView(view10);
        d(context, view10, "com.tencent.mm.view.x2c.X2CImageView", false, 9);
        android.view.View view11 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
        if (view11 == null) {
            view11 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view12 = view11;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.brk);
        i0Var.z(context, layoutParams10, "X2CRelativeLayout.LayoutParams", com.tencent.mm.R.id.f483646bk5);
        i0Var.L(context, view12, "com.tencent.mm.view.x2c.X2CTextView", t(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_view_full_text", com.tencent.mm.R.string.b6p));
        i0Var.N(context, view12, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.ui.zk.c(context, com.tencent.mm.R.attr.f478053d));
        i0Var.O(context, view12, "com.tencent.mm.view.x2c.X2CTextView", u(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479853h2));
        i0Var.P(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 8);
        i0Var.w(context, layoutParams10, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.B(context, layoutParams10, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams10, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams10, "X2CRelativeLayout.LayoutParams", 0, q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.j_), 0, 0);
        view12.setLayoutParams(layoutParams10);
        x2CRelativeLayout3.addView(view12);
        d(context, view12, "com.tencent.mm.view.x2c.X2CTextView", false, 10);
        d(context, x2CRelativeLayout3, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 8);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 11);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = x2CLinearLayout;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams11, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams11, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        x2CLinearLayout2.setLayoutParams(layoutParams11);
        viewGroup4.addView(x2CLinearLayout2);
        android.view.View view13 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 12);
        if (view13 == null) {
            view13 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams12 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view14, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bjp);
        i0Var.B(context, layoutParams12, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams12, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view14, "com.tencent.mm.view.x2c.X2CTextView", p(context, view14, "com.tencent.mm.view.x2c.X2CTextView", "@color/white_text_color", com.tencent.mm.R.color.f479549ab0));
        i0Var.g(context, view14, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.O(context, view14, "com.tencent.mm.view.x2c.X2CTextView", u(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479788f9));
        i0Var.f(context, view14, "com.tencent.mm.view.x2c.X2CTextView", r(context, view14, "com.tencent.mm.view.x2c.X2CTextView", "@drawable/chat_source_bg", com.tencent.mm.R.drawable.f481168mb));
        i0Var.j(context, view14, "com.tencent.mm.view.x2c.X2CTextView", q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 1, 3.0f, 0));
        i0Var.L(context, view14, "com.tencent.mm.view.x2c.X2CTextView", t(context, view14, "com.tencent.mm.view.x2c.X2CTextView", "{source}", 0));
        i0Var.d(context, view14, "com.tencent.mm.view.x2c.X2CTextView", q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479648bn), q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 1, 1.0f, 0), q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479648bn), q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 1, 2.0f, 0));
        i0Var.c(context, layoutParams12, "X2CLinearLayout.LayoutParams", q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), 0, 0);
        view14.setLayoutParams(layoutParams12);
        x2CLinearLayout2.addView(view14);
        d(context, view14, "com.tencent.mm.view.x2c.X2CTextView", false, 12);
        android.view.View view15 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 13);
        if (view15 == null) {
            view15 = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view16 = view15;
        android.view.ViewGroup.LayoutParams layoutParams13 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams13, "X2CLinearLayout.LayoutParams", q(context, view16, "com.tencent.mm.view.x2c.X2CView", 1, 0.0f, 0));
        i0Var.y(context, layoutParams13, "X2CLinearLayout.LayoutParams", q(context, view16, "com.tencent.mm.view.x2c.X2CView", 1, 0.0f, 0));
        i0Var.A(context, layoutParams13, "X2CLinearLayout.LayoutParams", 1.0f);
        view16.setLayoutParams(layoutParams13);
        x2CLinearLayout2.addView(view16);
        d(context, view16, "com.tencent.mm.view.x2c.X2CView", false, 13);
        d(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 11);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 14);
        if (x2CLinearLayout3 == null) {
            x2CLinearLayout3 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        android.view.ViewGroup.LayoutParams layoutParams14 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.bjv);
        i0Var.B(context, layoutParams14, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams14, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz));
        i0Var.f(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/chatting_appmsg_todo_normal_bg", com.tencent.mm.R.drawable.f481194mr));
        i0Var.H(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.P(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams14, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), q(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), 0, 0);
        x2CLinearLayout4.setLayoutParams(layoutParams14);
        viewGroup4.addView(x2CLinearLayout4);
        android.view.View view17 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 15);
        if (view17 == null) {
            view17 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view18 = view17;
        android.view.ViewGroup.LayoutParams layoutParams15 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view18, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bjw);
        i0Var.B(context, layoutParams15, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams15, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view18, "com.tencent.mm.view.x2c.X2CTextView", p(context, view18, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.tencent.mm.R.color.BW_100_Alpha_0_8));
        i0Var.O(context, view18, "com.tencent.mm.view.x2c.X2CTextView", u(context, view18, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
        i0Var.q(context, view18, "com.tencent.mm.view.x2c.X2CTextView", false);
        i0Var.x(context, layoutParams15, "X2CLinearLayout.LayoutParams", 17);
        i0Var.J(context, view18, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.L(context, view18, "com.tencent.mm.view.x2c.X2CTextView", t(context, view18, "com.tencent.mm.view.x2c.X2CTextView", "@string/group_todo_message", com.tencent.mm.R.string.ft9));
        i0Var.c(context, layoutParams15, "X2CLinearLayout.LayoutParams", q(context, view18, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0, q(context, view18, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0);
        view18.setLayoutParams(layoutParams15);
        x2CLinearLayout4.addView(view18);
        d(context, view18, "com.tencent.mm.view.x2c.X2CTextView", false, 15);
        d(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 14);
        android.view.View view19 = (android.view.ViewStub) h(context, "ViewStub", 16);
        if (view19 == null) {
            view19 = new android.view.ViewStub(context, xn5.q0.f455705d);
        }
        android.view.View view20 = view19;
        android.view.ViewGroup.LayoutParams layoutParams16 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view20, "ViewStub", com.tencent.mm.R.id.ojd);
        i0Var.B(context, layoutParams16, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams16, "X2CLinearLayout.LayoutParams", -2);
        i0Var.u(context, view20, "ViewStub", com.tencent.mm.R.layout.f488567xi);
        i0Var.c(context, layoutParams16, "X2CLinearLayout.LayoutParams", q(context, view20, "ViewStub", 1, 5.0f, 0), q(context, view20, "ViewStub", 0, 0.0f, com.tencent.mm.R.dimen.ais), 0, 0);
        view20.setLayoutParams(layoutParams16);
        viewGroup4.addView(view20);
        d(context, view20, "ViewStub", false, 16);
        android.view.View view21 = (android.view.ViewStub) h(context, "ViewStub", 17);
        if (view21 == null) {
            view21 = new android.view.ViewStub(context, xn5.q0.f455705d);
        }
        android.view.View view22 = view21;
        android.view.ViewGroup.LayoutParams layoutParams17 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view22, "ViewStub", com.tencent.mm.R.id.sq7);
        i0Var.B(context, layoutParams17, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams17, "X2CLinearLayout.LayoutParams", -2);
        i0Var.u(context, view22, "ViewStub", com.tencent.mm.R.layout.f488475e12);
        i0Var.c(context, layoutParams17, "X2CLinearLayout.LayoutParams", q(context, view22, "ViewStub", 1, 5.0f, 0), q(context, view22, "ViewStub", 1, 5.5f, 0), 0, 0);
        view22.setLayoutParams(layoutParams17);
        viewGroup4.addView(view22);
        d(context, view22, "ViewStub", false, 17);
        d(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 2);
        d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // xn5.g
    public android.view.View f(android.content.Context r25, android.util.AttributeSet r26, java.lang.String r27, int r28) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.g.f(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dbj;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_From_X2c_X2C";
    }
}

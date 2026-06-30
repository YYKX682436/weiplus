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
        android.view.ViewGroup viewGroup = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.p(context, viewGroup2, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.p314xaae8f345.mm.R.id.n8j);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        viewGroup2.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.n8n);
        i0Var.B(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.I(context, view2, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        view2.setLayoutParams(layoutParams);
        viewGroup2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 1);
        android.view.View view3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 2);
        if (view3 == null) {
            view3 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e(context, xn5.q0.f537238d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CFrameLayout", com.p314xaae8f345.mm.R.id.icp);
        i0Var.B(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        view4.setLayoutParams(layoutParams2);
        viewGroup2.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 2);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
        if (c22869xb039b5f8 == null) {
            c22869xb039b5f8 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f82 = c22869xb039b5f8;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.frm);
        i0Var.B(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CRelativeLayout.LayoutParams", q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 18.0f, 0));
        i0Var.o(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.f(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.a4y));
        i0Var.G(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh));
        i0Var.P(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams3, "X2CRelativeLayout.LayoutParams", q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), q(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        c22869xb039b5f82.setLayoutParams(layoutParams3);
        viewGroup2.addView(c22869xb039b5f82);
        android.view.View view5 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 4);
        if (view5 == null) {
            view5 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context, xn5.q0.f537238d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        i0Var.K(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.p314xaae8f345.mm.R.raw.f79249x2de77c45));
        xn5.j jVar = xn5.k.f537219a;
        jVar.a(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        i0Var.c(context, layoutParams4, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, 0, 0);
        view6.setLayoutParams(layoutParams4);
        c22869xb039b5f82.addView(view6);
        d(context, view6, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 4);
        android.view.View view7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 5);
        if (view7 == null) {
            view7 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.frn);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.L(context, view8, "com.tencent.mm.view.x2c.X2CTextView", t(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_share_tag_text", com.p314xaae8f345.mm.R.C30867xcad56011.ecz));
        i0Var.N(context, view8, "com.tencent.mm.view.x2c.X2CTextView", p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        i0Var.O(context, view8, "com.tencent.mm.view.x2c.X2CTextView", u(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
        i0Var.c(context, layoutParams5, "X2CLinearLayout.LayoutParams", q(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj), 0, q(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
        view8.setLayoutParams(layoutParams5);
        c22869xb039b5f82.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CTextView", false, 5);
        d(context, c22869xb039b5f82, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 3);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f83 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        if (c22869xb039b5f83 == null) {
            c22869xb039b5f83 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8(context, xn5.q0.f537238d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 c22869xb039b5f84 = c22869xb039b5f83;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.f7z);
        i0Var.B(context, layoutParams6, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 18.0f, 0));
        i0Var.o(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.f(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_grey_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.a4z));
        i0Var.G(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh));
        i0Var.P(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams6, "X2CRelativeLayout.LayoutParams", q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), q(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        c22869xb039b5f84.setLayoutParams(layoutParams6);
        viewGroup2.addView(c22869xb039b5f84);
        android.view.View view9 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 7);
        if (view9 == null) {
            view9 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context, xn5.q0.f537238d);
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
        i0Var.K(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", r(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.p314xaae8f345.mm.R.raw.f79249x2de77c45));
        jVar.a(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", p(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        i0Var.c(context, layoutParams7, "X2CLinearLayout.LayoutParams", q(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, 0, 0);
        view10.setLayoutParams(layoutParams7);
        c22869xb039b5f84.addView(view10);
        d(context, view10, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 7);
        android.view.View view11 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 8);
        if (view11 == null) {
            view11 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view12 = view11;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.f566239f80);
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.L(context, view12, "com.tencent.mm.view.x2c.X2CTextView", t(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_end", com.p314xaae8f345.mm.R.C30867xcad56011.dcj));
        i0Var.N(context, view12, "com.tencent.mm.view.x2c.X2CTextView", p(context, view12, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        i0Var.O(context, view12, "com.tencent.mm.view.x2c.X2CTextView", u(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
        i0Var.c(context, layoutParams8, "X2CLinearLayout.LayoutParams", q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj), 0, q(context, view12, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
        view12.setLayoutParams(layoutParams8);
        c22869xb039b5f84.addView(view12);
        d(context, view12, "com.tencent.mm.view.x2c.X2CTextView", false, 8);
        d(context, c22869xb039b5f84, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 6);
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e c22865x8b738e8e = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 9);
        if (c22865x8b738e8e == null) {
            c22865x8b738e8e = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup3 = c22865x8b738e8e;
        android.widget.RelativeLayout.LayoutParams layoutParams9 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", com.p314xaae8f345.mm.R.id.rll);
        i0Var.B(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams9, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.F(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
        layoutParams9.addRule(12, -1);
        i0Var.P(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 8);
        i0Var.f(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", r(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/finder_share_bottom_gradient_background", com.p314xaae8f345.mm.R.C30861xcebc809e.acg));
        i0Var.d(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0, 0, q(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        viewGroup3.setLayoutParams(layoutParams9);
        viewGroup2.addView(viewGroup3);
        android.view.View view13 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 10);
        if (view13 == null) {
            view13 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.FrameLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view14, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.f566148rm0);
        i0Var.B(context, layoutParams10, "X2CFrameLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams10, "X2CFrameLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams10, "X2CFrameLayout.LayoutParams", 80);
        i0Var.l(context, view14, "com.tencent.mm.view.x2c.X2CTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.D(context, view14, "com.tencent.mm.view.x2c.X2CTextView", s(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        i0Var.N(context, view14, "com.tencent.mm.view.x2c.X2CTextView", p(context, view14, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        i0Var.O(context, view14, "com.tencent.mm.view.x2c.X2CTextView", u(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
        i0Var.c(context, layoutParams10, "X2CFrameLayout.LayoutParams", q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0, q(context, view14, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), 0);
        view14.setLayoutParams(layoutParams10);
        viewGroup3.addView(view14);
        d(context, view14, "com.tencent.mm.view.x2c.X2CTextView", false, 10);
        d(context, viewGroup3, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 9);
        android.view.View view15 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 11);
        if (view15 == null) {
            view15 = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view16 = view15;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view16, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.e_l);
        i0Var.B(context, layoutParams11, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams11, "X2CRelativeLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams11, "X2CRelativeLayout.LayoutParams", 17);
        i0Var.o(context, view16, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.N(context, view16, "com.tencent.mm.view.x2c.X2CTextView", p(context, view16, "com.tencent.mm.view.x2c.X2CTextView", "#b3ffffff", 0));
        i0Var.O(context, view16, "com.tencent.mm.view.x2c.X2CTextView", u(context, view16, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
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
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22874x32dcda1f) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            if (view != null) {
                view.setId(com.p314xaae8f345.mm.R.id.n8j);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        } else {
            view = null;
        }
        xn5.i0 i0Var3 = xn5.j0.f537218a;
        if (i17 == 1) {
            android.view.View view4 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7) h(context, "com.tencent.mm.view.x2c.X2CImageView", 1);
            if (view4 != null) {
                i0Var3.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.p314xaae8f345.mm.R.id.n8n);
                i0Var3.I(context, view4, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
                i0Var3.K(context, view4, "com.tencent.mm.view.x2c.X2CImageView", r(context, view4, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            }
            g(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 1);
            view = view4;
        }
        if (i17 == 2) {
            view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 2);
            if (view != null) {
                view.setId(com.p314xaae8f345.mm.R.id.icp);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 2);
        }
        if (i17 == 3) {
            android.view.View view5 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
            if (view5 != null) {
                i0Var3.p(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.frm);
                i0Var3.o(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var3.f(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.a4y));
                i0Var3.G(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh));
                i0Var3.P(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
            }
            g(context, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 3);
            view = view5;
        }
        if (i17 == 4) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 4);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(r(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.p314xaae8f345.mm.R.raw.f79249x2de77c45));
                c22699x3dcdb352.m82040x7541828(p(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            g(context, c22699x3dcdb352, "com.tencent.mm.ui.widget.imageview.WeImageView", 4);
            view = c22699x3dcdb352;
        }
        if (i17 == 5) {
            android.view.View view6 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 5);
            if (view6 != null) {
                i0Var3.p(context, view6, "com.tencent.mm.view.x2c.X2CTextView", com.p314xaae8f345.mm.R.id.frn);
                view3 = view6;
                i0Var3.L(context, view3, "com.tencent.mm.view.x2c.X2CTextView", t(context, view6, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_share_tag_text", com.p314xaae8f345.mm.R.C30867xcad56011.ecz));
                i0Var3.N(context, view3, "com.tencent.mm.view.x2c.X2CTextView", p(context, view3, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                i0Var3.O(context, view3, str2, u(context, view3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
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
            android.view.View view7 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            if (view7 != null) {
                i0Var3.p(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", com.p314xaae8f345.mm.R.id.f7z);
                i0Var3.o(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                i0Var3.f(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_grey_bg", com.p314xaae8f345.mm.R.C30861xcebc809e.a4z));
                view2 = view7;
                i0Var3.G(context, view2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, view7, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh));
                i0Var3.P(context, view2, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
            } else {
                view2 = view7;
            }
            g(context, view2, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            view = view2;
        }
        if (i17 == 7) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) h(context, "com.tencent.mm.ui.widget.imageview.WeImageView", 7);
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setImageDrawable(r(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", com.p314xaae8f345.mm.R.raw.f79249x2de77c45));
                c22699x3dcdb3522.m82040x7541828(p(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            }
            g(context, c22699x3dcdb3522, "com.tencent.mm.ui.widget.imageview.WeImageView", 7);
            view = c22699x3dcdb3522;
        }
        if (i17 == 8) {
            android.view.View view8 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, str2, 8);
            if (view8 != null) {
                i0Var3.p(context, view8, str2, com.p314xaae8f345.mm.R.id.f566239f80);
                i0Var3.L(context, view8, str2, t(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_end", com.p314xaae8f345.mm.R.C30867xcad56011.dcj));
                i0Var3.N(context, view8, str2, p(context, view8, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                i0Var3.O(context, view8, str2, u(context, view8, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
            }
            g(context, view8, str2, 8);
            view = view8;
        }
        if (i17 == 9) {
            android.view.View view9 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22865x8b738e8e) h(context, "com.tencent.mm.view.x2c.X2CFrameLayout", 9);
            if (view9 != null) {
                i0Var3.p(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", com.p314xaae8f345.mm.R.id.rll);
                view = view9;
                i0Var3.F(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", q(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
                i0Var3.P(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", 8);
                i0Var3.f(context, view9, "com.tencent.mm.view.x2c.X2CFrameLayout", r(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/finder_share_bottom_gradient_background", com.p314xaae8f345.mm.R.C30861xcebc809e.acg));
                str3 = str2;
                i28 = 9;
                str5 = "com.tencent.mm.view.x2c.X2CFrameLayout";
                i18 = i17;
                i0Var = i0Var3;
                context2 = context;
                i0Var3.d(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0, 0, q(context, view, "com.tencent.mm.view.x2c.X2CFrameLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
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
            android.view.View view10 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context2, str3, 10);
            if (view10 != null) {
                xn5.i0 i0Var4 = i0Var;
                i0Var4.p(context2, view10, str3, com.p314xaae8f345.mm.R.id.f566148rm0);
                i0Var4.l(context2, view10, str3, android.text.TextUtils.TruncateAt.END);
                i0Var2 = i0Var4;
                context3 = context2;
                i19 = i18;
                i27 = 8;
                i0Var2.D(context3, view10, str3, s(context, view10, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                i0Var2.N(context3, view10, str3, p(context, view10, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                str4 = str3;
                i0Var2.O(context3, view10, str4, u(context, view10, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
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
            android.view.View view11 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context3, str4, 11);
            if (view11 != null) {
                i0Var2.p(context3, view11, str4, com.p314xaae8f345.mm.R.id.e_l);
                i0Var2.o(context3, view11, str4, 17);
                i0Var2.N(context3, view11, str4, p(context, view11, "com.tencent.mm.view.x2c.X2CTextView", "#b3ffffff", 0));
                i0Var2.O(context3, view11, str4, u(context, view11, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
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
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.crn;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Sns_Finder_Live_Time_Line_Item_X2c_X2C";
    }
}

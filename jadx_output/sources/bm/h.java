package bm;

/* loaded from: classes16.dex */
public class h extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_to_appmsg_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        android.view.ViewGroup viewGroup = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (viewGroup == null) {
            viewGroup = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup2 = viewGroup;
        android.view.ViewGroup.LayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, i());
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.h(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", false);
        i0Var.i(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", false);
        i0Var.H(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.x(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", 5);
        i0Var.o(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        i0Var.d(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", q(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0, q(context, viewGroup2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0);
        viewGroup2.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.ViewGroup viewGroup3 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        if (viewGroup3 == null) {
            viewGroup3 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup4 = viewGroup3;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.bjy);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0), 0, q(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 6.0f, 0));
        viewGroup4.setLayoutParams(layoutParams);
        viewGroup2.addView(viewGroup4);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = x2CLinearLayout;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 30.0f, 0));
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -1);
        i0Var.o(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams2, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.i_));
        x2CLinearLayout2.setLayoutParams(layoutParams2);
        viewGroup4.addView(x2CLinearLayout2);
        android.view.View view = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 3);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view2, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bqz);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -1);
        i0Var.x(context, layoutParams3, "X2CLinearLayout.LayoutParams", 21);
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 16);
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@raw/chatting_status_tick", com.tencent.mm.R.raw.chatting_status_tick));
        i0Var.P(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 0, 0, q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), 0);
        view2.setLayoutParams(layoutParams3);
        x2CLinearLayout2.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 3);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 4);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bqx);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.w(context, layoutParams4, "X2CLinearLayout.LayoutParams", -1);
        i0Var.c(context, layoutParams4, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view4, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), 0);
        view4.setLayoutParams(layoutParams4);
        x2CLinearLayout2.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CImageView", false, 4);
        android.view.View view5 = (com.tencent.mm.view.x2c.X2CProgressBar) h(context, "com.tencent.mm.view.x2c.X2CProgressBar", 5);
        if (view5 == null) {
            view5 = new com.tencent.mm.view.x2c.X2CProgressBar(context, i());
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view6, "com.tencent.mm.view.x2c.X2CProgressBar", com.tencent.mm.R.id.ott);
        i0Var.B(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams5, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams5, "X2CLinearLayout.LayoutParams", 21);
        i0Var.P(context, view6, "com.tencent.mm.view.x2c.X2CProgressBar", 8);
        i0Var.c(context, layoutParams5, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view6, "com.tencent.mm.view.x2c.X2CProgressBar", 0, 0.0f, com.tencent.mm.R.dimen.f479672c9), 0);
        view6.setLayoutParams(layoutParams5);
        x2CLinearLayout2.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CProgressBar", false, 5);
        d(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 2);
        android.view.ViewGroup viewGroup5 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        if (viewGroup5 == null) {
            viewGroup5 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup6 = viewGroup5;
        android.view.ViewGroup.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams6, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams6, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup6, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.p(context, viewGroup6, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.a1l);
        viewGroup6.setLayoutParams(layoutParams6);
        viewGroup4.addView(viewGroup6);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 7);
        if (x2CLinearLayout3 == null) {
            x2CLinearLayout3 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        android.view.ViewGroup.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams7, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams7, "X2CLinearLayout.LayoutParams", -1);
        i0Var.o(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        i0Var.H(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        x2CLinearLayout4.setLayoutParams(layoutParams7);
        viewGroup6.addView(x2CLinearLayout4);
        android.view.View view7 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 8);
        if (view7 == null) {
            view7 = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view8 = view7;
        android.view.ViewGroup.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view8, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.f483695br0);
        i0Var.B(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams8, "X2CLinearLayout.LayoutParams", -2);
        i0Var.K(context, view8, "com.tencent.mm.view.x2c.X2CImageView", r(context, view8, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/attach_send_state_stop", com.tencent.mm.R.drawable.f480871ee));
        i0Var.P(context, view8, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.c(context, layoutParams8, "X2CLinearLayout.LayoutParams", 0, q(context, view8, "com.tencent.mm.view.x2c.X2CImageView", 1, 6.0f, 0), q(context, view8, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), 0);
        view8.setLayoutParams(layoutParams8);
        x2CLinearLayout4.addView(view8);
        d(context, view8, "com.tencent.mm.view.x2c.X2CImageView", false, 8);
        android.view.View view9 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 9);
        if (view9 == null) {
            view9 = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view10 = view9;
        android.view.ViewGroup.LayoutParams layoutParams9 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view10, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bkq);
        i0Var.B(context, layoutParams9, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams9, "X2CLinearLayout.LayoutParams", -2);
        i0Var.K(context, view10, "com.tencent.mm.view.x2c.X2CImageView", r(context, view10, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/state_failed", com.tencent.mm.R.drawable.b3i));
        i0Var.P(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.c(context, layoutParams9, "X2CLinearLayout.LayoutParams", 0, q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 1, 6.0f, 0), q(context, view10, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f479924j3), 0);
        view10.setLayoutParams(layoutParams9);
        x2CLinearLayout4.addView(view10);
        d(context, view10, "com.tencent.mm.view.x2c.X2CImageView", false, 9);
        d(context, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 7);
        android.view.ViewGroup viewGroup7 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 10);
        if (viewGroup7 == null) {
            viewGroup7 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup8 = viewGroup7;
        android.view.ViewGroup.LayoutParams layoutParams10 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams10, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams10, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup8, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup8.setLayoutParams(layoutParams10);
        viewGroup6.addView(viewGroup8);
        android.view.ViewGroup viewGroup9 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 11);
        if (viewGroup9 == null) {
            viewGroup9 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup10 = viewGroup9;
        android.view.ViewGroup.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.bkg);
        i0Var.B(context, layoutParams11, "X2CLinearLayout.LayoutParams", q(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f480241sa));
        i0Var.y(context, layoutParams11, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.f(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/chatto_bg_app", com.tencent.mm.R.drawable.f481244ob));
        i0Var.n(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/chat_to_mask_bg", com.tencent.mm.R.drawable.f481171me));
        viewGroup10.setLayoutParams(layoutParams11);
        viewGroup8.addView(viewGroup10);
        android.view.View view11 = (android.view.ViewStub) h(context, "ViewStub", 12);
        if (view11 == null) {
            view11 = new android.view.ViewStub(context, i());
        }
        android.view.View view12 = view11;
        android.view.ViewGroup.LayoutParams layoutParams12 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams12, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams12, "X2CLinearLayout.LayoutParams", -2);
        i0Var.E(context, view12, "ViewStub", q(context, view12, "ViewStub", 1, 240.0f, 0));
        i0Var.p(context, view12, "ViewStub", com.tencent.mm.R.id.pui);
        i0Var.s(context, view12, "ViewStub", com.tencent.mm.R.id.bif);
        i0Var.u(context, view12, "ViewStub", com.tencent.mm.R.layout.dbl);
        i0Var.H(context, view12, "ViewStub", 1);
        view12.setLayoutParams(layoutParams12);
        viewGroup10.addView(view12);
        d(context, view12, "ViewStub", false, 12);
        android.view.View view13 = (android.view.ViewStub) h(context, "ViewStub", 13);
        if (view13 == null) {
            view13 = new android.view.ViewStub(context, i());
        }
        android.view.View view14 = view13;
        android.view.ViewGroup.LayoutParams layoutParams13 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams13, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams13, "X2CLinearLayout.LayoutParams", -2);
        i0Var.E(context, view14, "ViewStub", q(context, view14, "ViewStub", 1, 240.0f, 0));
        i0Var.s(context, view14, "ViewStub", com.tencent.mm.R.id.bie);
        i0Var.H(context, view14, "ViewStub", 1);
        i0Var.p(context, view14, "ViewStub", com.tencent.mm.R.id.puo);
        i0Var.u(context, view14, "ViewStub", com.tencent.mm.R.layout.dbk);
        view14.setLayoutParams(layoutParams13);
        viewGroup10.addView(view14);
        d(context, view14, "ViewStub", false, 13);
        android.view.ViewGroup viewGroup11 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 14);
        if (viewGroup11 == null) {
            viewGroup11 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup12 = viewGroup11;
        android.view.ViewGroup.LayoutParams layoutParams14 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.biy);
        i0Var.B(context, layoutParams14, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams14, "X2CLinearLayout.LayoutParams", -2);
        i0Var.k(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", true);
        i0Var.H(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.d(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, q(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479884hx), 0, 0);
        viewGroup12.setLayoutParams(layoutParams14);
        viewGroup10.addView(viewGroup12);
        android.view.View view15 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 15);
        if (view15 == null) {
            view15 = new com.tencent.mm.ui.widget.MMTextView(context, i());
        }
        android.view.View view16 = view15;
        android.view.ViewGroup.LayoutParams layoutParams15 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view16, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.bjx);
        i0Var.J(context, view16, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.l(context, view16, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view16, "com.tencent.mm.ui.widget.MMTextView", 16);
        i0Var.B(context, layoutParams15, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams15, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view16, "com.tencent.mm.ui.widget.MMTextView", p(context, view16, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", com.tencent.mm.R.color.a0c));
        i0Var.O(context, view16, "com.tencent.mm.ui.widget.MMTextView", u(context, view16, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479575r));
        i0Var.q(context, view16, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.c(context, layoutParams15, "X2CLinearLayout.LayoutParams", q(context, view16, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.i_), 0, q(context, view16, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f480205rc), q(context, view16, "com.tencent.mm.ui.widget.MMTextView", 1, 4.0f, 0));
        view16.setLayoutParams(layoutParams15);
        viewGroup12.addView(view16);
        d(context, view16, "com.tencent.mm.ui.widget.MMTextView", false, 15);
        android.view.View view17 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 16);
        if (view17 == null) {
            view17 = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view18 = view17;
        android.view.ViewGroup.LayoutParams layoutParams16 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view18, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bkt);
        i0Var.B(context, layoutParams16, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams16, "X2CLinearLayout.LayoutParams", q(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 0, 2.0f, 0));
        i0Var.x(context, layoutParams16, "X2CLinearLayout.LayoutParams", 16);
        i0Var.f(context, view18, "com.tencent.mm.view.x2c.X2CImageView", r(context, view18, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/chatting_item_dividing_line", com.tencent.mm.R.drawable.f481207n6));
        i0Var.t(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 1);
        i0Var.P(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 8);
        i0Var.c(context, layoutParams16, "X2CLinearLayout.LayoutParams", q(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.i_), 0, q(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, com.tencent.mm.R.dimen.f480205rc), q(context, view18, "com.tencent.mm.view.x2c.X2CImageView", 1, 5.0f, 0));
        view18.setLayoutParams(layoutParams16);
        viewGroup12.addView(view18);
        d(context, view18, "com.tencent.mm.view.x2c.X2CImageView", false, 16);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout5 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
        if (x2CLinearLayout5 == null) {
            x2CLinearLayout5 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup13 = x2CLinearLayout5;
        android.view.ViewGroup.LayoutParams layoutParams17 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams17, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams17, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup13, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        i0Var.c(context, layoutParams17, "X2CLinearLayout.LayoutParams", q(context, viewGroup13, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.i_), 0, q(context, viewGroup13, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f480205rc), 0);
        viewGroup13.setLayoutParams(layoutParams17);
        viewGroup12.addView(viewGroup13);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout6 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 18);
        if (x2CLinearLayout6 == null) {
            x2CLinearLayout6 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        android.view.ViewGroup viewGroup14 = x2CLinearLayout6;
        android.view.ViewGroup.LayoutParams layoutParams18 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams18, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams18, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup14.setLayoutParams(layoutParams18);
        viewGroup13.addView(viewGroup14);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout7 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 19);
        if (x2CLinearLayout7 == null) {
            x2CLinearLayout7 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        android.view.ViewGroup.LayoutParams layoutParams19 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.B(context, layoutParams19, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 0.0f, 0));
        i0Var.y(context, layoutParams19, "X2CLinearLayout.LayoutParams", -2);
        i0Var.A(context, layoutParams19, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.H(context, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        x2CLinearLayout8.setLayoutParams(layoutParams19);
        viewGroup14.addView(x2CLinearLayout8);
        android.view.View view19 = (com.tencent.mm.ui.widget.MMNeat7extView) h(context, "com.tencent.mm.ui.widget.MMNeat7extView", 20);
        if (view19 == null) {
            view19 = new com.tencent.mm.ui.widget.MMNeat7extView(context, i());
        }
        android.view.View view20 = view19;
        android.view.ViewGroup.LayoutParams layoutParams20 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", com.tencent.mm.R.id.bju);
        i0Var.O(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", u(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", 0, 0.0f, com.tencent.mm.R.dimen.f479897ia));
        i0Var.N(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", p(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", "@color/BW_0_Alpha_0_9", com.tencent.mm.R.color.BW_0_Alpha_0_9));
        i0Var.B(context, layoutParams20, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams20, "X2CLinearLayout.LayoutParams", -2);
        i0Var.J(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", false);
        i0Var.l(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", 16);
        i0Var.D(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", s(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", 2, 0));
        i0Var.c(context, layoutParams20, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", 1, 3.0f, 0));
        view20.setLayoutParams(layoutParams20);
        x2CLinearLayout8.addView(view20);
        d(context, view20, "com.tencent.mm.ui.widget.MMNeat7extView", false, 20);
        android.view.View view21 = (com.tencent.mm.ui.widget.MMTextView) h(context, "com.tencent.mm.ui.widget.MMTextView", 21);
        if (view21 == null) {
            view21 = new com.tencent.mm.ui.widget.MMTextView(context, i());
        }
        android.view.View view22 = view21;
        android.view.ViewGroup.LayoutParams layoutParams21 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view22, "com.tencent.mm.ui.widget.MMTextView", com.tencent.mm.R.id.f483637bj2);
        i0Var.O(context, view22, "com.tencent.mm.ui.widget.MMTextView", u(context, view22, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479853h2));
        i0Var.N(context, view22, "com.tencent.mm.ui.widget.MMTextView", p(context, view22, "com.tencent.mm.ui.widget.MMTextView", "@color/half_alpha_black", com.tencent.mm.R.color.t_));
        i0Var.B(context, layoutParams21, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams21, "X2CLinearLayout.LayoutParams", -2);
        i0Var.D(context, view22, "com.tencent.mm.ui.widget.MMTextView", s(context, view22, "com.tencent.mm.ui.widget.MMTextView", 3, 0));
        i0Var.l(context, view22, "com.tencent.mm.ui.widget.MMTextView", android.text.TextUtils.TruncateAt.END);
        i0Var.o(context, view22, "com.tencent.mm.ui.widget.MMTextView", 16);
        i0Var.q(context, view22, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.J(context, view22, "com.tencent.mm.ui.widget.MMTextView", false);
        i0Var.b(context, view22, "com.tencent.mm.ui.widget.MMTextView", q(context, view22, "com.tencent.mm.ui.widget.MMTextView", 1, 2.0f, 0), 1.0f);
        i0Var.c(context, layoutParams21, "X2CLinearLayout.LayoutParams", 0, 0, 0, q(context, view22, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv));
        view22.setLayoutParams(layoutParams21);
        x2CLinearLayout8.addView(view22);
        d(context, view22, "com.tencent.mm.ui.widget.MMTextView", false, 21);
        d(context, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 19);
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout = (com.tencent.mm.view.x2c.X2CRelativeLayout) h(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 22);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new com.tencent.mm.view.x2c.X2CRelativeLayout(context, i());
        }
        com.tencent.mm.view.x2c.X2CRelativeLayout x2CRelativeLayout2 = x2CRelativeLayout;
        android.view.ViewGroup.LayoutParams layoutParams22 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", com.tencent.mm.R.id.bjr);
        i0Var.B(context, layoutParams22, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams22, "X2CLinearLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams22, "X2CLinearLayout.LayoutParams", q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.i_), q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1, 3.0f, 0), 0, q(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv));
        x2CRelativeLayout2.setLayoutParams(layoutParams22);
        viewGroup14.addView(x2CRelativeLayout2);
        android.view.View view23 = (com.tencent.mm.ui.MMImageView) h(context, "com.tencent.mm.ui.MMImageView", 23);
        if (view23 == null) {
            view23 = new com.tencent.mm.ui.MMImageView(context, i());
        }
        android.view.View view24 = view23;
        android.view.ViewGroup.LayoutParams layoutParams23 = new android.widget.RelativeLayout.LayoutParams(context, i());
        i0Var.p(context, view24, "com.tencent.mm.ui.MMImageView", com.tencent.mm.R.id.bjs);
        i0Var.B(context, layoutParams23, "X2CRelativeLayout.LayoutParams", q(context, view24, "com.tencent.mm.ui.MMImageView", 0, 0.0f, com.tencent.mm.R.dimen.f480234s5));
        i0Var.y(context, layoutParams23, "X2CRelativeLayout.LayoutParams", q(context, view24, "com.tencent.mm.ui.MMImageView", 0, 0.0f, com.tencent.mm.R.dimen.f480234s5));
        i0Var.I(context, view24, "com.tencent.mm.ui.MMImageView", android.widget.ImageView.ScaleType.CENTER_CROP);
        view24.setLayoutParams(layoutParams23);
        x2CRelativeLayout2.addView(view24);
        d(context, view24, "com.tencent.mm.ui.MMImageView", false, 23);
        android.view.View view25 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 24);
        if (view25 == null) {
            view25 = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view26 = view25;
        android.view.ViewGroup.LayoutParams layoutParams24 = new android.widget.RelativeLayout.LayoutParams(context, i());
        i0Var.p(context, view26, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.bj_);
        i0Var.B(context, layoutParams24, "X2CRelativeLayout.LayoutParams", q(context, view26, "com.tencent.mm.view.x2c.X2CImageView", 1, 24.0f, 0));
        i0Var.y(context, layoutParams24, "X2CRelativeLayout.LayoutParams", q(context, view26, "com.tencent.mm.view.x2c.X2CImageView", 1, 24.0f, 0));
        i0Var.v(context, layoutParams24, "X2CRelativeLayout.LayoutParams", -1);
        view26.setLayoutParams(layoutParams24);
        x2CRelativeLayout2.addView(view26);
        d(context, view26, "com.tencent.mm.view.x2c.X2CImageView", false, 24);
        d(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 22);
        d(context, viewGroup14, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 18);
        android.view.View view27 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 25);
        if (view27 == null) {
            view27 = new com.tencent.mm.view.x2c.X2CImageView(context, i());
        }
        android.view.View view28 = view27;
        android.view.ViewGroup.LayoutParams layoutParams25 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view28, "com.tencent.mm.view.x2c.X2CImageView", com.tencent.mm.R.id.js9);
        i0Var.B(context, layoutParams25, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams25, "X2CLinearLayout.LayoutParams", q(context, view28, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.5f, 0));
        i0Var.x(context, layoutParams25, "X2CLinearLayout.LayoutParams", 16);
        i0Var.f(context, view28, "com.tencent.mm.view.x2c.X2CImageView", r(context, view28, "com.tencent.mm.view.x2c.X2CImageView", "@color/chat_card_seperator_color", com.tencent.mm.R.color.f478803hn));
        i0Var.c(context, layoutParams25, "X2CLinearLayout.LayoutParams", 0, q(context, view28, "com.tencent.mm.view.x2c.X2CImageView", 1, 0.0f, 0), 0, 0);
        view28.setLayoutParams(layoutParams25);
        viewGroup13.addView(view28);
        d(context, view28, "com.tencent.mm.view.x2c.X2CImageView", false, 25);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dbb, viewGroup13, true);
        android.view.ViewGroup.LayoutParams layoutParams26 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.a(inflate.getLayoutParams(), layoutParams26);
        i0Var.p(context, inflate, "include", com.tencent.mm.R.id.js8);
        i0Var.B(context, layoutParams26, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams26, "X2CLinearLayout.LayoutParams", -2);
        i0Var.P(context, inflate, "include", 8);
        i0Var.c(context, layoutParams26, "X2CLinearLayout.LayoutParams", 0, q(context, inflate, "include", 0, 0.0f, com.tencent.mm.R.dimen.f479563f), 0, q(context, inflate, "include", 0, 0.0f, com.tencent.mm.R.dimen.f479563f));
        inflate.setLayoutParams(layoutParams26);
        android.view.View view29 = (android.view.ViewStub) h(context, "ViewStub", 27);
        if (view29 == null) {
            view29 = new android.view.ViewStub(context, i());
        }
        android.view.View view30 = view29;
        android.view.ViewGroup.LayoutParams layoutParams27 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view30, "ViewStub", com.tencent.mm.R.id.ken);
        i0Var.B(context, layoutParams27, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams27, "X2CLinearLayout.LayoutParams", -2);
        view30.setLayoutParams(layoutParams27);
        viewGroup13.addView(view30);
        d(context, view30, "ViewStub", false, 27);
        d(context, viewGroup13, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 17);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout9 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 28);
        if (x2CLinearLayout9 == null) {
            x2CLinearLayout9 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout10 = x2CLinearLayout9;
        android.view.ViewGroup.LayoutParams layoutParams28 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, x2CLinearLayout10, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.bjl);
        i0Var.B(context, layoutParams28, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams28, "X2CLinearLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams28, "X2CLinearLayout.LayoutParams", 0, 0, q(context, x2CLinearLayout10, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 4.9f, 0), 0);
        x2CLinearLayout10.setLayoutParams(layoutParams28);
        viewGroup12.addView(x2CLinearLayout10);
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dbc, (android.view.ViewGroup) x2CLinearLayout10, true);
        android.view.ViewGroup.LayoutParams layoutParams29 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.a(inflate2.getLayoutParams(), layoutParams29);
        i0Var.B(context, layoutParams29, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams29, "X2CLinearLayout.LayoutParams", -2);
        i0Var.c(context, layoutParams29, "X2CLinearLayout.LayoutParams", q(context, inflate2, "include", 1, 12.0f, 0), 0, q(context, inflate2, "include", 1, 10.0f, 0), 0);
        inflate2.setLayoutParams(layoutParams29);
        d(context, x2CLinearLayout10, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 28);
        d(context, viewGroup12, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 14);
        android.view.View view31 = (android.view.ViewStub) h(context, "ViewStub", 30);
        if (view31 == null) {
            view31 = new android.view.ViewStub(context, i());
        }
        android.view.View view32 = view31;
        android.view.ViewGroup.LayoutParams layoutParams30 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view32, "ViewStub", com.tencent.mm.R.id.pun);
        i0Var.s(context, view32, "ViewStub", com.tencent.mm.R.id.bjb);
        i0Var.B(context, layoutParams30, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams30, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, view32, "ViewStub", 1);
        i0Var.u(context, view32, "ViewStub", com.tencent.mm.R.layout.f488457ts);
        i0Var.d(context, view32, "ViewStub", 0, q(context, view32, "ViewStub", 0, 0.0f, com.tencent.mm.R.dimen.f479884hx), 0, q(context, view32, "ViewStub", 1, 7.0f, 0));
        i0Var.c(context, layoutParams30, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view32, "ViewStub", 1, 5.0f, 0), 0);
        view32.setLayoutParams(layoutParams30);
        viewGroup10.addView(view32);
        d(context, view32, "ViewStub", false, 30);
        android.view.View view33 = (android.view.ViewStub) h(context, "ViewStub", 31);
        if (view33 == null) {
            view33 = new android.view.ViewStub(context, i());
        }
        android.view.View view34 = view33;
        android.view.ViewGroup.LayoutParams layoutParams31 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view34, "ViewStub", com.tencent.mm.R.id.puj);
        i0Var.s(context, view34, "ViewStub", com.tencent.mm.R.id.bij);
        i0Var.u(context, view34, "ViewStub", com.tencent.mm.R.layout.dbm);
        i0Var.B(context, layoutParams31, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams31, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, view34, "ViewStub", 1);
        view34.setLayoutParams(layoutParams31);
        viewGroup10.addView(view34);
        d(context, view34, "ViewStub", false, 31);
        android.view.View view35 = (android.view.ViewStub) h(context, "ViewStub", 32);
        if (view35 == null) {
            view35 = new android.view.ViewStub(context, i());
        }
        android.view.View view36 = view35;
        android.view.ViewGroup.LayoutParams layoutParams32 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view36, "ViewStub", com.tencent.mm.R.id.spq);
        i0Var.s(context, view36, "ViewStub", com.tencent.mm.R.id.spv);
        i0Var.u(context, view36, "ViewStub", com.tencent.mm.R.layout.e1o);
        i0Var.B(context, layoutParams32, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams32, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, view36, "ViewStub", 1);
        i0Var.c(context, layoutParams32, "X2CLinearLayout.LayoutParams", 0, 0, q(context, view36, "ViewStub", 1, 4.0f, 0), 0);
        view36.setLayoutParams(layoutParams32);
        viewGroup10.addView(view36);
        d(context, view36, "ViewStub", false, 32);
        d(context, viewGroup10, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 11);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout11 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 33);
        if (x2CLinearLayout11 == null) {
            x2CLinearLayout11 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, i());
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout12 = x2CLinearLayout11;
        android.view.ViewGroup.LayoutParams layoutParams33 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.bjv);
        i0Var.B(context, layoutParams33, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams33, "X2CLinearLayout.LayoutParams", q(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479704cz));
        i0Var.f(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", r(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/chatting_appmsg_todo_normal_bg", com.tencent.mm.R.drawable.f481194mr));
        i0Var.H(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.P(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        i0Var.c(context, layoutParams33, "X2CLinearLayout.LayoutParams", 0, q(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479646bl), 0, 0);
        x2CLinearLayout12.setLayoutParams(layoutParams33);
        viewGroup8.addView(x2CLinearLayout12);
        android.view.View view37 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 34);
        if (view37 == null) {
            view37 = new com.tencent.mm.view.x2c.X2CTextView(context, i());
        }
        android.view.View view38 = view37;
        android.view.ViewGroup.LayoutParams layoutParams34 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.p(context, view38, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.bjw);
        i0Var.B(context, layoutParams34, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams34, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view38, "com.tencent.mm.view.x2c.X2CTextView", p(context, view38, "com.tencent.mm.view.x2c.X2CTextView", "@color/BW_100_Alpha_0_8", com.tencent.mm.R.color.BW_100_Alpha_0_8));
        i0Var.O(context, view38, "com.tencent.mm.view.x2c.X2CTextView", u(context, view38, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
        i0Var.q(context, view38, "com.tencent.mm.view.x2c.X2CTextView", false);
        i0Var.x(context, layoutParams34, "X2CLinearLayout.LayoutParams", 17);
        i0Var.J(context, view38, "com.tencent.mm.view.x2c.X2CTextView", true);
        i0Var.L(context, view38, "com.tencent.mm.view.x2c.X2CTextView", t(context, view38, "com.tencent.mm.view.x2c.X2CTextView", "@string/group_todo_message", com.tencent.mm.R.string.ft9));
        i0Var.c(context, layoutParams34, "X2CLinearLayout.LayoutParams", q(context, view38, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0, q(context, view38, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479738dv), 0);
        view38.setLayoutParams(layoutParams34);
        x2CLinearLayout12.addView(view38);
        d(context, view38, "com.tencent.mm.view.x2c.X2CTextView", false, 34);
        d(context, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 33);
        d(context, viewGroup8, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 10);
        d(context, viewGroup6, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 6);
        d(context, viewGroup4, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 1);
        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dbe, viewGroup2, true);
        android.view.ViewGroup.LayoutParams layoutParams35 = new android.widget.LinearLayout.LayoutParams(context, i());
        i0Var.a(inflate3.getLayoutParams(), layoutParams35);
        inflate3.setLayoutParams(layoutParams35);
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
    public android.view.View f(android.content.Context r29, android.util.AttributeSet r30, java.lang.String r31, int r32) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm.h.f(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e1w;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_To_Appmsg_X2c_X2C";
    }
}

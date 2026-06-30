package bm;

/* loaded from: classes16.dex */
public class l extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "improve_translate_layout_x2c";
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
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout2 = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        if (x2CLinearLayout2 == null) {
            x2CLinearLayout2 = new com.tencent.mm.view.x2c.X2CLinearLayout(context, xn5.q0.f455705d);
        }
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", com.tencent.mm.R.id.ojf);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        i0Var.H(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        i0Var.c(context, layoutParams, "X2CLinearLayout.LayoutParams", 0, q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.aaz), 0, q(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, com.tencent.mm.R.dimen.aaz));
        x2CLinearLayout3.setLayoutParams(layoutParams);
        viewGroup.addView(x2CLinearLayout3);
        android.view.View view = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CImageView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 0.0f, 0));
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CImageView", 1, 0.5f, 0));
        i0Var.x(context, layoutParams2, "X2CLinearLayout.LayoutParams", 16);
        i0Var.A(context, layoutParams2, "X2CLinearLayout.LayoutParams", 1.0f);
        i0Var.I(context, view2, "com.tencent.mm.view.x2c.X2CImageView", android.widget.ImageView.ScaleType.FIT_XY);
        i0Var.K(context, view2, "com.tencent.mm.view.x2c.X2CImageView", r(context, view2, "com.tencent.mm.view.x2c.X2CImageView", "@color/small_line_color", com.tencent.mm.R.color.a4m));
        view2.setLayoutParams(layoutParams2);
        x2CLinearLayout3.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nc6);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", -2);
        i0Var.x(context, layoutParams3, "X2CLinearLayout.LayoutParams", 5);
        i0Var.N(context, view4, "com.tencent.mm.view.x2c.X2CTextView", p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_translate_brand_color", com.tencent.mm.R.color.a6j));
        i0Var.O(context, view4, "com.tencent.mm.view.x2c.X2CTextView", u(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.aay));
        i0Var.c(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 5.0f, 0), 0, 0, 0);
        view4.setLayoutParams(layoutParams3);
        x2CLinearLayout3.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", false, 3);
        d(context, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 1);
        android.view.View view5 = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 4);
        if (view5 == null) {
            view5 = new com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", com.tencent.mm.R.id.nc7);
        i0Var.B(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams4, "X2CLinearLayout.LayoutParams", -2);
        i0Var.N(context, view6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", p(context, view6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/sns_translate_loading_text_color", com.tencent.mm.R.color.a6l));
        view6.setLayoutParams(layoutParams4);
        viewGroup.addView(view6);
        d(context, view6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 4);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.TextView, android.view.View, com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.view.x2c.X2CTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.ImageView, android.view.View, com.tencent.mm.view.x2c.X2CImageView] */
    /* JADX WARN: Type inference failed for: r8v0, types: [xn5.i0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xn5.g, bm.l] */
    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        com.tencent.mm.view.x2c.X2CLinearLayout x2CLinearLayout;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CLinearLayout != null) {
                x2CLinearLayout.setOrientation(1);
            }
            g(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            x2CLinearLayout = null;
        }
        if (i17 == 1) {
            x2CLinearLayout = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            if (x2CLinearLayout != null) {
                x2CLinearLayout.setId(com.tencent.mm.R.id.ojf);
                x2CLinearLayout.setOrientation(0);
            }
            g(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        }
        if (i17 == 2) {
            ?? r07 = (com.tencent.mm.view.x2c.X2CImageView) h(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
            if (r07 != 0) {
                android.widget.ImageView.ScaleType value = android.widget.ImageView.ScaleType.FIT_XY;
                kotlin.jvm.internal.o.g(value, "value");
                r07.setScaleType(value);
                r07.setImageDrawable(r(context, r07, "com.tencent.mm.view.x2c.X2CImageView", "@color/small_line_color", com.tencent.mm.R.color.a4m));
            }
            g(context, r07, "com.tencent.mm.view.x2c.X2CImageView", 2);
            x2CLinearLayout = r07;
        }
        if (i17 == 3) {
            ?? r08 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
            if (r08 != 0) {
                ?? r86 = xn5.j0.f455685a;
                r86.p(context, r08, "com.tencent.mm.view.x2c.X2CTextView", com.tencent.mm.R.id.nc6);
                r86.N(context, r08, "com.tencent.mm.view.x2c.X2CTextView", p(context, r08, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_translate_brand_color", com.tencent.mm.R.color.a6j));
                r86.O(context, r08, "com.tencent.mm.view.x2c.X2CTextView", u(context, r08, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.aay));
            }
            g(context, r08, "com.tencent.mm.view.x2c.X2CTextView", 3);
            x2CLinearLayout = r08;
        }
        if (i17 == 4) {
            ?? r09 = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView) h(context, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 4);
            if (r09 != 0) {
                r09.setId(com.tencent.mm.R.id.nc7);
                r09.setTextColor(p(context, r09, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/sns_translate_loading_text_color", com.tencent.mm.R.color.a6l));
            }
            g(context, r09, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 4);
            x2CLinearLayout = r09;
        }
        if (i17 == 4) {
            n();
        }
        return x2CLinearLayout;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489183bl5;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Improve_Translate_Layout_X2c_X2C";
    }
}

package bm;

/* loaded from: classes16.dex */
public class a extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_history_msg_tip_layout_x2c";
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
        i0Var.o(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
        i0Var.H(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 1);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CView", 1, 67.0f, 0));
        i0Var.y(context, layoutParams, "X2CLinearLayout.LayoutParams", q(context, view2, "com.tencent.mm.view.x2c.X2CView", 1, 1.0f, 0));
        i0Var.f(context, view2, "com.tencent.mm.view.x2c.X2CView", r(context, view2, "com.tencent.mm.view.x2c.X2CView", "@color/small_line_color", com.tencent.mm.R.color.a4m));
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.view.x2c.X2CView", false, 1);
        android.view.View view3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (view3 == null) {
            view3 = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view4 = view3;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.y(context, layoutParams2, "X2CLinearLayout.LayoutParams", -2);
        i0Var.O(context, view4, "com.tencent.mm.view.x2c.X2CTextView", u(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
        i0Var.N(context, view4, "com.tencent.mm.view.x2c.X2CTextView", p(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
        i0Var.L(context, view4, "com.tencent.mm.view.x2c.X2CTextView", t(context, view4, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_history_msg_tip", com.tencent.mm.R.string.b2a));
        i0Var.d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0, q(context, view4, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0);
        view4.setLayoutParams(layoutParams2);
        viewGroup.addView(view4);
        d(context, view4, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        android.view.View view5 = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 3);
        if (view5 == null) {
            view5 = new com.tencent.mm.view.x2c.X2CView(context, xn5.q0.f455705d);
        }
        android.view.View view6 = view5;
        android.view.ViewGroup.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.B(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CView", 1, 67.0f, 0));
        i0Var.y(context, layoutParams3, "X2CLinearLayout.LayoutParams", q(context, view6, "com.tencent.mm.view.x2c.X2CView", 1, 1.0f, 0));
        i0Var.f(context, view6, "com.tencent.mm.view.x2c.X2CView", r(context, view6, "com.tencent.mm.view.x2c.X2CView", "@color/small_line_color", com.tencent.mm.R.color.a4m));
        view6.setLayoutParams(layoutParams3);
        viewGroup.addView(view6);
        d(context, view6, "com.tencent.mm.view.x2c.X2CView", false, 3);
        d(context, viewGroup, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        java.lang.String str2;
        int i18;
        android.content.Context context2;
        int i19;
        android.content.Context context3;
        java.lang.String str3;
        int i27;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f455685a;
        if (i17 == 0) {
            view = (com.tencent.mm.view.x2c.X2CLinearLayout) h(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (view != null) {
                i0Var.o(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 17);
                i0Var.H(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            g(context, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.tencent.mm.view.x2c.X2CView x2CView = (com.tencent.mm.view.x2c.X2CView) h(context, "com.tencent.mm.view.x2c.X2CView", 1);
            if (x2CView != null) {
                x2CView.setBackground(r(context, x2CView, "com.tencent.mm.view.x2c.X2CView", "@color/small_line_color", com.tencent.mm.R.color.a4m));
            }
            g(context, x2CView, "com.tencent.mm.view.x2c.X2CView", 1);
            view = x2CView;
        }
        if (i17 == 2) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (x2CTextView != null) {
                view = x2CTextView;
                i0Var.O(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", u(context, view, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
                i0Var.N(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", p(context, view, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
                i0Var.L(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", t(context, view, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_history_msg_tip", com.tencent.mm.R.string.b2a));
                str3 = "com.tencent.mm.view.x2c.X2CTextView";
                i27 = 2;
                str2 = "com.tencent.mm.view.x2c.X2CView";
                i18 = i17;
                context2 = context;
                i0Var.d(context, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", q(context, view, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0, q(context, view, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), 0);
            } else {
                view = x2CTextView;
                str3 = "com.tencent.mm.view.x2c.X2CTextView";
                i27 = 2;
                str2 = "com.tencent.mm.view.x2c.X2CView";
                i18 = i17;
                context2 = context;
            }
            g(context2, view, str3, i27);
        } else {
            str2 = "com.tencent.mm.view.x2c.X2CView";
            i18 = i17;
            context2 = context;
        }
        if (i18 == 3) {
            com.tencent.mm.view.x2c.X2CView x2CView2 = (com.tencent.mm.view.x2c.X2CView) h(context2, str2, 3);
            if (x2CView2 != null) {
                context3 = context2;
                i19 = i18;
                x2CView2.setBackground(r(context, x2CView2, "com.tencent.mm.view.x2c.X2CView", "@color/small_line_color", com.tencent.mm.R.color.a4m));
            } else {
                context3 = context2;
                i19 = i18;
            }
            g(context3, x2CView2, str2, 3);
            view = x2CView2;
        } else {
            i19 = i18;
        }
        if (i19 == 3) {
            n();
        }
        return view;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dba;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_History_Msg_Tip_Layout_X2c_X2C";
    }
}

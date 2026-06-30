package bm;

/* loaded from: classes16.dex */
public class j extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_no_more_msg_tip_layout_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        android.view.View view = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 0);
        if (view == null) {
            view = new com.tencent.mm.view.x2c.X2CTextView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_no_more_msg_tip", com.tencent.mm.R.string.b4v));
        i0Var.d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn), q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn));
        view2.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", true, 0);
        n();
        return view2;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        com.tencent.mm.view.x2c.X2CTextView x2CTextView;
        com.tencent.mm.view.x2c.X2CTextView x2CTextView2;
        int i18;
        java.lang.String str2;
        android.content.Context context2;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            com.tencent.mm.view.x2c.X2CTextView x2CTextView3 = (com.tencent.mm.view.x2c.X2CTextView) h(context, "com.tencent.mm.view.x2c.X2CTextView", 0);
            if (x2CTextView3 != null) {
                xn5.i0 i0Var = xn5.j0.f455685a;
                i0Var.O(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", u(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479930ja));
                i0Var.o(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 17);
                i0Var.N(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", p(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.tencent.mm.R.color.f479232tk));
                i0Var.L(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", t(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_no_more_msg_tip", com.tencent.mm.R.string.b4v));
                x2CTextView2 = x2CTextView3;
                i18 = 0;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                context2 = context;
                i0Var.d(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", q(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn), q(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.tencent.mm.R.dimen.f479688cn));
            } else {
                x2CTextView2 = x2CTextView3;
                i18 = 0;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                context2 = context;
            }
            g(context2, x2CTextView2, str2, i18);
            x2CTextView = x2CTextView2;
        } else {
            x2CTextView = null;
        }
        if (i17 == 0) {
            n();
        }
        return x2CTextView;
    }

    @Override // xn5.e0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dbp;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_No_More_Msg_Tip_Layout_X2c_X2C";
    }
}

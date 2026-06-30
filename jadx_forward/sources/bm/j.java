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
        android.view.View view = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 0);
        if (view == null) {
            view = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        i0Var.O(context, view2, "com.tencent.mm.view.x2c.X2CTextView", u(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        i0Var.o(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 17);
        i0Var.N(context, view2, "com.tencent.mm.view.x2c.X2CTextView", p(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        i0Var.L(context, view2, "com.tencent.mm.view.x2c.X2CTextView", t(context, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_no_more_msg_tip", com.p314xaae8f345.mm.R.C30867xcad56011.b4v));
        i0Var.d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, view2, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        view2.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        d(context, view2, "com.tencent.mm.view.x2c.X2CTextView", true, 0);
        n();
        return view2;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b;
        com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b2;
        int i18;
        java.lang.String str2;
        android.content.Context context2;
        if (i17 == 0) {
            o();
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b c22880x7ae7913b3 = (com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b) h(context, "com.tencent.mm.view.x2c.X2CTextView", 0);
            if (c22880x7ae7913b3 != null) {
                xn5.i0 i0Var = xn5.j0.f537218a;
                i0Var.O(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", u(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
                i0Var.o(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 17);
                i0Var.N(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", p(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
                i0Var.L(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", t(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", "@string/chatting_no_more_msg_tip", com.p314xaae8f345.mm.R.C30867xcad56011.b4v));
                c22880x7ae7913b2 = c22880x7ae7913b3;
                i18 = 0;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                context2 = context;
                i0Var.d(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", q(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), q(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 1, 7.0f, 0), q(context, c22880x7ae7913b3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            } else {
                c22880x7ae7913b2 = c22880x7ae7913b3;
                i18 = 0;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                context2 = context;
            }
            g(context2, c22880x7ae7913b2, str2, i18);
            c22880x7ae7913b = c22880x7ae7913b2;
        } else {
            c22880x7ae7913b = null;
        }
        if (i17 == 0) {
            n();
        }
        return c22880x7ae7913b;
    }

    @Override // xn5.e0
    /* renamed from: getLayoutId */
    public int mo10731x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dbp;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_No_More_Msg_Tip_Layout_X2c_X2C";
    }
}

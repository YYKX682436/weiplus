package bm;

/* loaded from: classes16.dex */
public class d extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_avatar_from_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) h(context, "com.tencent.mm.ui.base.MaskLayout", 0);
        if (c21522xf5a6e956 == null) {
            c21522xf5a6e956 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956(context, xn5.q0.f537238d);
        }
        android.view.ViewGroup viewGroup = c21522xf5a6e956;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f537238d);
        xn5.i0 i0Var = xn5.j0.f537218a;
        i0Var.p(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", com.p314xaae8f345.mm.R.id.f565178bk4);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", q(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561125a2));
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", q(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", 0, 0.0f, com.p314xaae8f345.mm.R.C30860x5b28f31.f561125a2));
        i0Var.h(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", false);
        i0Var.m(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", "false");
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601) h(context, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1);
        if (view == null) {
            view = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601(context, xn5.q0.f537238d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f537238d);
        i0Var.p(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", com.p314xaae8f345.mm.R.id.f565175bk1);
        i0Var.B(context, layoutParams, "MaskLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
        i0Var.y(context, layoutParams, "MaskLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
        i0Var.F(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
        i0Var.K(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", r(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "@raw/default_avatar", com.p314xaae8f345.mm.R.raw.f78922x61de8d17));
        i0Var.m(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "false");
        i0Var.d(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0));
        view2.setLayoutParams(layoutParams);
        viewGroup.addView(view2);
        d(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", false, 1);
        d(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", true, 0);
        n();
        return viewGroup;
    }

    @Override // xn5.g
    public android.view.View f(android.content.Context context, android.util.AttributeSet attributeSet, java.lang.String str, int i17) {
        android.view.View view;
        int i18;
        int i19;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd8601;
        java.lang.String str2;
        android.content.Context context2;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f537218a;
        if (i17 == 0) {
            view = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) h(context, "com.tencent.mm.ui.base.MaskLayout", 0);
            if (view != null) {
                i0Var.p(context, view, "com.tencent.mm.ui.base.MaskLayout", com.p314xaae8f345.mm.R.id.f565178bk4);
                i0Var.h(context, view, "com.tencent.mm.ui.base.MaskLayout", false);
                i0Var.m(context, view, "com.tencent.mm.ui.base.MaskLayout", "false");
            }
            g(context, view, "com.tencent.mm.ui.base.MaskLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601 c21894x47dd86012 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21894x47dd8601) h(context, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1);
            if (c21894x47dd86012 != null) {
                i0Var.p(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", com.p314xaae8f345.mm.R.id.f565175bk1);
                i0Var.F(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
                i0Var.K(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", r(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "@raw/default_avatar", com.p314xaae8f345.mm.R.raw.f78922x61de8d17));
                i0Var.m(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "false");
                c21894x47dd8601 = c21894x47dd86012;
                str2 = "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView";
                i18 = 1;
                i19 = i17;
                context2 = context;
                i0Var.d(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, c21894x47dd86012, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0));
            } else {
                c21894x47dd8601 = c21894x47dd86012;
                str2 = "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView";
                i18 = 1;
                i19 = i17;
                context2 = context;
            }
            g(context2, c21894x47dd8601, str2, i18);
            view = c21894x47dd8601;
        } else {
            i18 = 1;
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dbd;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_Avatar_From_X2c_X2C";
    }
}

package bm;

/* loaded from: classes16.dex */
public class e extends xn5.g {
    @Override // xn5.e0
    public java.lang.String a() {
        return "chatting_item_avatar_to_x2c";
    }

    @Override // xn5.g
    public android.view.View c(android.content.Context context) {
        o();
        com.tencent.mm.ui.base.MaskLayout maskLayout = (com.tencent.mm.ui.base.MaskLayout) h(context, "com.tencent.mm.ui.base.MaskLayout", 0);
        if (maskLayout == null) {
            maskLayout = new com.tencent.mm.ui.base.MaskLayout(context, xn5.q0.f455705d);
        }
        android.view.ViewGroup viewGroup = maskLayout;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context, xn5.q0.f455705d);
        xn5.i0 i0Var = xn5.j0.f455685a;
        i0Var.p(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", com.tencent.mm.R.id.f483645bk4);
        i0Var.B(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", q(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479592a2));
        i0Var.y(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", q(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", 0, 0.0f, com.tencent.mm.R.dimen.f479592a2));
        i0Var.h(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", false);
        i0Var.i(context, viewGroup, "com.tencent.mm.ui.base.MaskLayout", false);
        viewGroup.setTag(com.tencent.mm.R.id.psd, marginLayoutParams);
        android.view.View view = (com.tencent.mm.ui.chatting.view.ChattingAvatarImageView) h(context, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1);
        if (view == null) {
            view = new com.tencent.mm.ui.chatting.view.ChattingAvatarImageView(context, xn5.q0.f455705d);
        }
        android.view.View view2 = view;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(context, xn5.q0.f455705d);
        i0Var.p(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", com.tencent.mm.R.id.f483642bk1);
        i0Var.B(context, layoutParams, "MaskLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
        i0Var.y(context, layoutParams, "MaskLayout.LayoutParams", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
        i0Var.F(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
        i0Var.K(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", r(context, view2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "@raw/default_avatar", com.tencent.mm.R.raw.default_avatar));
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
        com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView;
        java.lang.String str2;
        android.content.Context context2;
        if (i17 == 0) {
            o();
        }
        xn5.i0 i0Var = xn5.j0.f455685a;
        if (i17 == 0) {
            view = (com.tencent.mm.ui.base.MaskLayout) h(context, "com.tencent.mm.ui.base.MaskLayout", 0);
            if (view != null) {
                i0Var.p(context, view, "com.tencent.mm.ui.base.MaskLayout", com.tencent.mm.R.id.f483645bk4);
                i0Var.h(context, view, "com.tencent.mm.ui.base.MaskLayout", false);
                i0Var.i(context, view, "com.tencent.mm.ui.base.MaskLayout", false);
            }
            g(context, view, "com.tencent.mm.ui.base.MaskLayout", 0);
        } else {
            view = null;
        }
        if (i17 == 1) {
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView2 = (com.tencent.mm.ui.chatting.view.ChattingAvatarImageView) h(context, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1);
            if (chattingAvatarImageView2 != null) {
                i0Var.p(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", com.tencent.mm.R.id.f483642bk1);
                i0Var.F(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 52.0f, 0));
                i0Var.K(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", r(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "@raw/default_avatar", com.tencent.mm.R.raw.default_avatar));
                i0Var.m(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", "false");
                chattingAvatarImageView = chattingAvatarImageView2;
                str2 = "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView";
                i18 = 1;
                i19 = i17;
                context2 = context;
                i0Var.d(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", q(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0), q(context, chattingAvatarImageView2, "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView", 1, 6.0f, 0));
            } else {
                chattingAvatarImageView = chattingAvatarImageView2;
                str2 = "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView";
                i18 = 1;
                i19 = i17;
                context2 = context;
            }
            g(context2, chattingAvatarImageView, str2, i18);
            view = chattingAvatarImageView;
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
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dbe;
    }

    @Override // xn5.g
    public java.lang.String j() {
        return "MicroMsg.X2C.Chatting_Item_Avatar_To_X2c_X2C";
    }
}

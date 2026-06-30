package ad4;

/* loaded from: classes4.dex */
public final class u implements android.view.animation.Animation.AnimationListener {
    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        android.view.View contentView;
        android.view.View findViewById;
        android.view.View contentView2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f84739d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        java.lang.Object obj = null;
        android.view.View findViewById2 = (popupWindow == null || (contentView2 = popupWindow.getContentView()) == null) ? null : contentView2.findViewById(com.p314xaae8f345.mm.R.id.f564403qd);
        if (findViewById2 != null && findViewById2.getVisibility() == 0) {
            findViewById2.sendAccessibilityEvent(128);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow2 = ad4.w.f84739d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (popupWindow2 != null && (contentView = popupWindow2.getContentView()) != null && (findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.r1y)) != null) {
            obj = findViewById.getParent();
        }
        android.view.View view = (android.view.View) obj;
        if (view != null && view.getVisibility() == 0) {
            view.sendAccessibilityEvent(128);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$setupAnimation$1");
    }
}

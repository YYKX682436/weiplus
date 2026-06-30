package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class a2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j implements bd4.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // bd4.v0
    public boolean K1(android.view.MotionEvent ev6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f84739d;
        boolean z17 = popupWindow != null && popupWindow.isShowing();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j.f38387x233c02ec;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            android.widget.PopupWindow popupWindow2 = ad4.w.f84739d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (!aVar.a(popupWindow2 != null ? popupWindow2.getContentView() : null, ev6)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                pm0.v.X(new ad4.n(true));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        return false;
    }
}

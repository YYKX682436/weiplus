package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes10.dex */
public final class n0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f250485n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i17, android.app.Activity activity) {
        super(activity);
        this.f250485n = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTargetFound", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1$callback$linearSmoothScroller$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        super.e(targetView, state, action);
        int h17 = h(targetView, m());
        int i17 = i(targetView, -1);
        int k17 = k((int) java.lang.Math.sqrt((h17 * h17) + (i17 * i17)));
        if (k17 > 0) {
            action.b(-h17, (-i17) - this.f250485n, k17, this.f93709i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTargetFound", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1$callback$linearSmoothScroller$1");
    }
}

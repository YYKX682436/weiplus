package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes3.dex */
public final class i2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352 f252697e;

    public i2(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352 activityC18417x2fbe3352) {
        this.f252696d = view;
        this.f252697e = activityC18417x2fbe3352;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runEnterAnimation$$inlined$doOnPreDraw$1");
        this.f252696d.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.f252401m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352 activityC18417x2fbe3352 = this.f252697e;
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 V6 = activityC18417x2fbe3352.V6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        int width = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.U6(activityC18417x2fbe3352).getWidth();
        int height = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.U6(activityC18417x2fbe3352).getHeight();
        V6.f292232f = width;
        V6.f292233g = height;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 V62 = activityC18417x2fbe3352.V6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAnimationHelper", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        android.view.View U6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.U6(activityC18417x2fbe3352);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBackgroundView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        android.view.View W6 = activityC18417x2fbe3352.W6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBackgroundView", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI");
        V62.c(U6, W6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runEnterAnimation$$inlined$doOnPreDraw$1");
        return true;
    }
}

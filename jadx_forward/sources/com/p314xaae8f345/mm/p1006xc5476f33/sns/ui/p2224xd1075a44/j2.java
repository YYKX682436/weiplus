package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes3.dex */
public final class j2 implements com.p314xaae8f345.mm.ui.p2740x696c9db.o4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352 f252706a;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352 activityC18417x2fbe3352) {
        this.f252706a = activityC18417x2fbe3352;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o4
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        android.view.View U6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.U6(this.f252706a);
        float f18 = 1 - f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$runExitAnimation$1", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        U6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentEmoticonDetailUI$runExitAnimation$1", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationEnd */
    public void mo54453xbb3aa236() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        this.f252706a.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationStart */
    public void mo54454xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmoticonDetailUI$runExitAnimation$1");
    }
}

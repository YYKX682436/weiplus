package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class eh implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 f249771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f249772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f249773f;

    public eh(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, int i17) {
        this.f249771d = activityC18049x9dc71116;
        this.f249772e = layoutManager;
        this.f249773f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$scrollToComment$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = this.f249771d;
        activityC18049x9dc71116.f248343o.mo70578x3219b31c().setAlpha(1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17988xb8422ef8 t76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.t7(activityC18049x9dc71116);
        if (t76 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = t76.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        android.view.View mo7935xa188593e = this.f249772e.mo7935xa188593e(this.f249773f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.w7(activityC18049x9dc71116, false);
        if (mo7935xa188593e != null) {
            activityC18049x9dc71116.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSaveBundle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSaveBundle", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            activityC18049x9dc71116.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (activityC18049x9dc71116.B1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            } else {
                activityC18049x9dc71116.B1 = true;
                if (activityC18049x9dc71116.f248663y0 == null) {
                    activityC18049x9dc71116.f248663y0 = new android.graphics.Rect();
                }
                android.graphics.Rect rect = activityC18049x9dc71116.f248663y0;
                if (rect != null) {
                    activityC18049x9dc71116.z7().e(rect.left, rect.top, rect.width(), rect.height());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFlipViewObserver", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = activityC18049x9dc71116.f248343o;
                if (c18064xe6e1a3b3 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlipViewObserver", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                } else {
                    c18064xe6e1a3b3.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gh(activityC18049x9dc71116));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlipViewObserver", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$runEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$scrollToComment$1");
        return true;
    }
}

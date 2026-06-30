package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class gh implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 f249968d;

    public gh(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116) {
        this.f249968d = activityC18049x9dc71116;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.graphics.BitmapFactory.Options n07;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = this.f249968d;
        activityC18049x9dc71116.f248343o.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = activityC18049x9dc71116.f248343o.getWidth();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setScreenWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        activityC18049x9dc71116.f248659p0 = width;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setScreenWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int height = activityC18049x9dc71116.f248343o.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setScreenHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        activityC18049x9dc71116.f248661x0 = height;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setScreenHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int width2 = activityC18049x9dc71116.f248343o.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        activityC18049x9dc71116.Y = width2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int height2 = activityC18049x9dc71116.f248343o.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        activityC18049x9dc71116.Z = height2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        java.lang.String r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.r(activityC18049x9dc71116.f248343o.mo70574x2d3ab571());
        if (r17 != null && (n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(r17)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            int i17 = activityC18049x9dc71116.Y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            activityC18049x9dc71116.Z = (int) ((i17 / n07.outWidth) * n07.outHeight);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            int i18 = activityC18049x9dc71116.Z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            if (i18 > activityC18049x9dc71116.f248343o.getHeight()) {
                int height3 = activityC18049x9dc71116.f248343o.getHeight();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                activityC18049x9dc71116.Z = height3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 z76 = activityC18049x9dc71116.z7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int i19 = activityC18049x9dc71116.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBigImgWidth$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        int i27 = activityC18049x9dc71116.Z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBigImgHeight$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        z76.f292232f = i19;
        z76.f292233g = i27;
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 z77 = activityC18049x9dc71116.z7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = activityC18049x9dc71116.f248343o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getGalleryBg$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        android.view.View view = activityC18049x9dc71116.f248662x1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getGalleryBg$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        z77.c(c18064xe6e1a3b3, view, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fh(activityC18049x9dc71116));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setFlipViewObserver$1");
        return true;
    }
}

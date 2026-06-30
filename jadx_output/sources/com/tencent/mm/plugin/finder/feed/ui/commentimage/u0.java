package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class u0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f109900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f109902f;

    public u0(boolean z17, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI2, com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView) {
        this.f109900d = z17;
        this.f109901e = finderCommentImageFlowUI;
        this.f109902f = finderCommentImageGalleryView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (!this.f109900d) {
            com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent finderCommentImageResetAlphaEvent = new com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent();
            finderCommentImageResetAlphaEvent.f54265g.f8185a = 1.0f;
            finderCommentImageResetAlphaEvent.e();
        }
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109901e;
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.commentimage.r0(finderCommentImageFlowUI));
        finderCommentImageFlowUI.G = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109901e;
        finderCommentImageFlowUI.G = true;
        pm0.v.V(20L, new com.tencent.mm.plugin.finder.feed.ui.commentimage.s0(this.f109902f, finderCommentImageFlowUI));
    }
}

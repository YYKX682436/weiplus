package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class o0 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109881a;

    public o0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109881a = finderCommentImageFlowUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        ug5.x.e(this.f109881a.getWindow(), -16777216);
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        ug5.x.e(this.f109881a.getWindow(), -16777216);
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent finderCommentImageResetAlphaEvent = new com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent();
        finderCommentImageResetAlphaEvent.f54265g.f8185a = 0.0f;
        finderCommentImageResetAlphaEvent.e();
    }
}

package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        super(0);
        this.f109890d = finderCommentImageFlowUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109890d;
        finderCommentImageFlowUI.finish();
        finderCommentImageFlowUI.overridePendingTransition(0, 0);
        return jz5.f0.f302826a;
    }
}

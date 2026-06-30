package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.m implements yz5.p {
    public g0(java.lang.Object obj) {
        super(2, obj, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.class, "runDragAnimation", "runDragAnimation(ILcom/tencent/mm/ui/tools/MMGestureGallery;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.ui.tools.MMGestureGallery p17 = (com.tencent.mm.ui.tools.MMGestureGallery) obj2;
        kotlin.jvm.internal.o.g(p17, "p1");
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = (com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI) this.receiver;
        int i17 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U;
        if (finderCommentImageFlowUI.P && intValue == 0) {
            p17.setGalleryScaleListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.n0(p17, finderCommentImageFlowUI));
        }
        return jz5.f0.f302826a;
    }
}

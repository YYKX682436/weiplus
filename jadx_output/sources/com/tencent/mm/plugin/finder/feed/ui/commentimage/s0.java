package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f109893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        super(0);
        this.f109893d = finderCommentImageGalleryView;
        this.f109894e = finderCommentImageFlowUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View selectedView = this.f109893d.getSelectedView();
        if (selectedView instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            ((com.tencent.mm.ui.base.MultiTouchImageView) selectedView).i();
        }
        ug5.x.e(this.f109894e.getWindow(), 0);
        return jz5.f0.f302826a;
    }
}

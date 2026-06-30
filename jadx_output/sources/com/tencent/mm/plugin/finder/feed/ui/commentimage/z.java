package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        super(0);
        this.f109916d = finderCommentImageFlowUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View childAt;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f109916d.f109777u;
        if (recyclerView == null || (childAt = recyclerView.getChildAt(0)) == null) {
            return null;
        }
        return (com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView) childAt.findViewById(com.tencent.mm.R.id.u76);
    }
}

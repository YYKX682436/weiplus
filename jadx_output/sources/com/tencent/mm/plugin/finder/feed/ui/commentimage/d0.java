package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        super(1);
        this.f109819d = finderCommentImageFlowUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gd2.n nVar = this.f109819d.S;
        boolean z17 = true;
        if (!nVar.f270550f && ((gd2.x) ((jz5.n) nVar.f270554j).getValue()).f270572i != 1) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f106893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(so2.y0 y0Var) {
        super(1);
        this.f106893d = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj;
        return java.lang.Boolean.valueOf(finderCommentInfo.getCommentId() != 0 && finderCommentInfo.getCommentId() == this.f106893d.f410703d.Y0());
    }
}

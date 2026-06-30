package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f103889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        super(1);
        this.f103888d = s0Var;
        this.f103889e = u4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yw2.a0 a0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.Object obj2 = this.f103888d.f293125i;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment");
        ((so2.y0) obj2).f410716t = booleanValue;
        if (!booleanValue) {
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f103889e.f104670e;
            com.tencent.mm.plugin.finder.feed.a7 a7Var = nPresenter instanceof com.tencent.mm.plugin.finder.feed.a7 ? (com.tencent.mm.plugin.finder.feed.a7) nPresenter : null;
            if (a7Var != null && (a0Var = a7Var.f106216o) != null) {
                a0Var.s().y(false);
            }
        }
        return jz5.f0.f302826a;
    }
}

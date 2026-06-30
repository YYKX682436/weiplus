package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f111021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        super(1);
        this.f111021d = a1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f111021d;
        a1Var.z().h();
        if (a1Var.S()) {
            com.tencent.mm.view.RefreshLoadMoreLayout.T(a1Var.f106180m, 0, false, null, 7, null);
        }
        return jz5.f0.f302826a;
    }
}

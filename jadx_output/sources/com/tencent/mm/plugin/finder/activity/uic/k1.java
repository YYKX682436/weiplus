package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC f101903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC) {
        super(0);
        this.f101903d = finderActivityTabUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string = this.f101903d.getContext().getString(com.tencent.mm.R.string.f8u);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return kz5.c0.k(new com.tencent.mm.plugin.finder.activity.uic.i1(string, 0));
    }
}

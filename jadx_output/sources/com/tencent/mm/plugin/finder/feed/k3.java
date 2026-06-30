package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f107166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var) {
        super(0);
        this.f107165d = a7Var;
        this.f107166e = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f107165d;
        so2.y0 y0Var = this.f107166e;
        com.tencent.mm.plugin.finder.feed.a7.h(a7Var, y0Var, false);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        if (!finderItem.isSelfFeed()) {
            a7Var.P(y0Var, true);
        }
        return jz5.f0.f302826a;
    }
}

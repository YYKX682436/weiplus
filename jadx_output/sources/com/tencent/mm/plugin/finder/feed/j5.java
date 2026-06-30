package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f107086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f107087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17) {
        super(0);
        this.f107086d = a7Var;
        this.f107087e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f107086d;
        java.util.Map map = a7Var.D1;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        map.put(new bu2.k(finderItem.getId(), a7Var.A), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        ((kw2.c) ((jz5.n) a7Var.V).getValue()).f312895b = java.lang.System.currentTimeMillis() - this.f107087e;
        return jz5.f0.f302826a;
    }
}

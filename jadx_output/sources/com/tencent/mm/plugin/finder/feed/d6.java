package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(1);
        this.f106548d = a7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106548d;
        a7Var.f106210g.c(longValue);
        com.tencent.mm.plugin.finder.feed.p2 p2Var = a7Var.f106217p;
        if (p2Var != null) {
            p2Var.a(longValue, 0L, false);
        }
        return jz5.f0.f302826a;
    }
}

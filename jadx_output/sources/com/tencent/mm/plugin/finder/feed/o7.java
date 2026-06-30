package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class o7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f108624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(com.tencent.mm.plugin.finder.feed.f8 f8Var) {
        super(1);
        this.f108624d = f8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.c1 c1Var = (so2.c1) kz5.n0.a0(this.f108624d.f106719p, ((java.lang.Number) obj).intValue());
        return java.lang.Boolean.valueOf(c1Var == null || (c1Var.f410290f == null && c1Var.f410291g == null));
    }
}

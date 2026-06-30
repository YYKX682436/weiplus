package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f110872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(4);
        this.f110872d = a7Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.ty0 ty0Var = (r45.ty0) obj4;
        if (intValue == 0 && intValue2 == 0) {
            com.tencent.mm.plugin.finder.feed.a7.s(this.f110872d, ty0Var);
        }
        return jz5.f0.f302826a;
    }
}

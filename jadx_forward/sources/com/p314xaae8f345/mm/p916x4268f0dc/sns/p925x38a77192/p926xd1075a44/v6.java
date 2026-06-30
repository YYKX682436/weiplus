package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class v6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f151823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f151824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(java.util.List list, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var) {
        super(4);
        this.f151823d = list;
        this.f151824e = m7Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj5 = n0.e1.f415025a;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) this.f151823d.get(intValue);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = this.f151824e;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a7.k(m5Var, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.s6(m7Var), new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t6(m7Var), new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.u6(m7Var), oVar, 0);
        return jz5.f0.f384359a;
    }
}

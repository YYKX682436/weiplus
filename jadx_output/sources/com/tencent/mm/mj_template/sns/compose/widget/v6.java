package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class v6 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f70290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f70291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(java.util.List list, com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var) {
        super(4);
        this.f70290d = list;
        this.f70291e = m7Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g items = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(items, "$this$items");
        if ((intValue2 & 112) == 0) {
            intValue2 |= ((n0.y0) oVar).c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 721) == 144) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj5 = n0.e1.f333492a;
        com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) this.f70290d.get(intValue);
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f70291e;
        com.tencent.mm.mj_template.sns.compose.widget.a7.k(m5Var, new com.tencent.mm.mj_template.sns.compose.widget.s6(m7Var), new com.tencent.mm.mj_template.sns.compose.widget.t6(m7Var), new com.tencent.mm.mj_template.sns.compose.widget.u6(m7Var), oVar, 0);
        return jz5.f0.f302826a;
    }
}

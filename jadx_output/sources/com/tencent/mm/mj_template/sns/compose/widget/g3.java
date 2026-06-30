package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f69966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.b5 f69967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.b5 b5Var) {
        super(3);
        this.f69966d = c1Var;
        this.f69967e = b5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        f0.x item = (f0.x) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f69966d;
        com.tencent.mm.mj_template.sns.compose.widget.q4.c(c1Var.b(), new com.tencent.mm.mj_template.sns.compose.widget.e3(c1Var, this.f69967e), new com.tencent.mm.mj_template.sns.compose.widget.f3(c1Var), oVar, 0);
        return jz5.f0.f302826a;
    }
}

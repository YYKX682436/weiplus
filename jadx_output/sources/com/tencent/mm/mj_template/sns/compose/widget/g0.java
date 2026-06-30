package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.mj_template.sns.compose.widget.g0 f69962d = new com.tencent.mm.mj_template.sns.compose.widget.g0();

    public g0() {
        super(3);
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
        com.tencent.mm.mj_template.sns.compose.widget.q4.f(oVar, 0);
        return jz5.f0.f302826a;
    }
}

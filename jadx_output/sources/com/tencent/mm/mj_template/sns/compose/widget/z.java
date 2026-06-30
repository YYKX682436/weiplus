package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.mj_template.sns.compose.widget.z f70339d = new com.tencent.mm.mj_template.sns.compose.widget.z();

    public z() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g item = (e0.g) obj;
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
        com.tencent.mm.mj_template.sns.compose.widget.o2.d(oVar, 0);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f70231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f70233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(float f17, com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, n0.e5 e5Var) {
        super(5);
        this.f70231d = f17;
        this.f70232e = t2Var;
        this.f70233f = e5Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        e0.g itemsIndexed = (e0.g) obj;
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.mj_template.sns.compose.widget.e1 e1Var = (com.tencent.mm.mj_template.sns.compose.widget.e1) obj3;
        n0.o oVar = (n0.o) obj4;
        ((java.lang.Number) obj5).intValue();
        kotlin.jvm.internal.o.g(itemsIndexed, "$this$itemsIndexed");
        java.lang.Object obj6 = n0.e1.f333492a;
        if (e1Var != null) {
            float f17 = this.f70231d;
            r45.k96 k96Var = (r45.k96) e1Var.f69938a;
            java.lang.String str = k96Var.f378520g;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = k96Var.f378521h;
            java.lang.String str4 = str3 == null ? "" : str3;
            com.tencent.mm.mj_template.sns.compose.widget.r1 r1Var = new com.tencent.mm.mj_template.sns.compose.widget.r1(k96Var);
            boolean b17 = kotlin.jvm.internal.o.b(((r45.k96) ((com.tencent.mm.mj_template.sns.compose.widget.e1) this.f70233f.getValue()).f69938a).f378517d, k96Var.f378517d);
            com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var = this.f70232e;
            com.tencent.mm.mj_template.sns.compose.widget.o2.e(f17, str2, str4, r1Var, b17, t2Var.f70242o, new com.tencent.mm.mj_template.sns.compose.widget.s1(t2Var, e1Var), oVar, 0, 0);
        }
        return jz5.f0.f302826a;
    }
}

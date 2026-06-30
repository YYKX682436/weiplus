package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(n0.v2 v2Var, n0.v2 v2Var2) {
        super(1);
        this.f69956d = v2Var;
        this.f69957e = v2Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a2.k1 textLayoutResult = (a2.k1) obj;
        kotlin.jvm.internal.o.g(textLayoutResult, "textLayoutResult");
        a2.g gVar = textLayoutResult.f766b;
        if (gVar.f716c || ((float) p2.q.b(textLayoutResult.f767c)) < gVar.f718e) {
            n0.v2 v2Var = this.f69956d;
            v2Var.setValue(java.lang.Double.valueOf(((java.lang.Number) v2Var.getValue()).doubleValue() * 0.9d));
        } else {
            this.f69957e.setValue(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}

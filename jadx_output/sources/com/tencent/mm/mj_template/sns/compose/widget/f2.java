package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f69953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, n0.v2 v2Var) {
        super(1);
        this.f69953d = t2Var;
        this.f69954e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        n0.v2 v2Var = this.f69954e;
        v2Var.setValue(it);
        if (((java.lang.Boolean) ((jz5.n) this.f69953d.f70239i).getValue()).booleanValue()) {
            com.tencent.mm.mj_template.sns.compose.widget.t2.a(this.f69953d, (java.lang.String) v2Var.getValue(), 0L, 2, null);
        }
        return jz5.f0.f302826a;
    }
}

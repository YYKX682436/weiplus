package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.q f69867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.mj_template.sns.compose.widget.q qVar, n0.v2 v2Var) {
        super(1);
        this.f69867d = qVar;
        this.f69868e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f69867d.f70181h;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        n0.v2 v2Var = this.f69868e;
        if (((java.lang.Boolean) v2Var.getValue()).booleanValue() && !booleanValue) {
            v2Var.setValue(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f302826a;
    }
}

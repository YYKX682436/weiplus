package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f69972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f69973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var) {
        super(1);
        this.f69972d = m7Var;
        this.f69973e = m5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = this.f69973e;
            java.lang.String str = m5Var.f70077a;
            com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f69972d;
            m7Var.f(str);
            com.tencent.mm.mj_template.sns.compose.widget.b7 b7Var = m7Var.f70101s;
            if (b7Var != null) {
                b7Var.f(m5Var.f70077a, m7Var.b().indexOf(m5Var));
            }
        }
        return jz5.f0.f302826a;
    }
}

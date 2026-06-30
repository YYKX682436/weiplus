package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.c1 f70340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.e5 f70341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var, com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var) {
        super(1);
        this.f70340d = c1Var;
        this.f70341e = e5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = this.f70340d;
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = c1Var.f69884o;
            com.tencent.mm.mj_template.sns.compose.widget.r rVar = m5Var != null ? m5Var.f70078b : null;
            if (rVar != null) {
                rVar.b(false);
            }
            com.tencent.mm.mj_template.sns.compose.widget.e5 e5Var = this.f70341e;
            e5Var.f70078b.b(true);
            c1Var.f69884o = e5Var;
            ((n0.q4) c1Var.f69882m).setValue(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}

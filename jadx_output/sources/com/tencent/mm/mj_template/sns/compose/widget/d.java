package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.q f69912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f69913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.mj_template.sns.compose.widget.q qVar, n0.v2 v2Var) {
        super(1);
        this.f69912d = qVar;
        this.f69913e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.z it = (s1.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int b17 = p2.q.b(((u1.c1) it).f402052f);
        n0.v2 v2Var = this.f69913e;
        if (b17 != ((java.lang.Number) v2Var.getValue()).intValue()) {
            v2Var.setValue(java.lang.Integer.valueOf(b17));
            yz5.l lVar = this.f69912d.f70182i;
            if (lVar != null) {
                if (b17 < 0) {
                    b17 = 0;
                }
                lVar.invoke(java.lang.Integer.valueOf(b17));
            }
        }
        return jz5.f0.f302826a;
    }
}

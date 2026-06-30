package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f70172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f70173e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, e0.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f70172d = m7Var;
        this.f70173e = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.mj_template.sns.compose.widget.p6(this.f70172d, this.f70173e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.mj_template.sns.compose.widget.p6 p6Var = (com.tencent.mm.mj_template.sns.compose.widget.p6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List b17 = this.f70173e.f().b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add(new java.lang.Integer(((e0.q0) ((e0.n) it.next())).f245679b));
        }
        com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var = this.f70172d;
        m7Var.getClass();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var = (com.tencent.mm.mj_template.sns.compose.widget.m5) kz5.n0.a0(m7Var.b(), intValue);
            if ((m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.k5) || (m5Var instanceof com.tencent.mm.mj_template.sns.compose.widget.g5)) {
                java.lang.String str = m5Var.f70077a;
                java.util.HashSet hashSet = m7Var.f70104v;
                if (!hashSet.contains(str)) {
                    com.tencent.mm.mj_template.sns.compose.widget.b7 b7Var = m7Var.f70101s;
                    if (b7Var != null) {
                        b7Var.b(str, intValue);
                    }
                    hashSet.add(str);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 f193659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var) {
        super(2);
        this.f193659d = o9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var = this.f193659d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.t1(o9Var);
        if (booleanValue && !o9Var.f195256x) {
            o9Var.f195256x = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.u1(o9Var, 2);
        }
        if (booleanValue2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.u1(o9Var, 3);
        }
        df2.zb zbVar = (df2.zb) o9Var.U0(df2.zb.class);
        if (zbVar != null) {
            zbVar.v7(false, null);
            if (zbVar.m7()) {
                r45.ff1 ff1Var = zbVar.f313477r;
                boolean z17 = ff1Var != null && ff1Var.m75939xb282bd08(7) == 5;
                zbVar.q7(6);
                zbVar.s7(r45.n72.kActionType_AiassistantClose, 3, "");
                if (z17) {
                    zbVar.r7(3, df2.ab.f311237d);
                }
                zbVar.u7();
            }
        }
        return jz5.f0.f384359a;
    }
}

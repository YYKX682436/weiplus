package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class qg implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f190352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f190353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f190354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f190355d;

    public qg(zy2.i5 i5Var, r45.v71 v71Var, zy2.i5 i5Var2, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f190352a = i5Var;
        this.f190353b = v71Var;
        this.f190354c = i5Var2;
        this.f190355d = abstractActivityC21394xb3d2c0cf;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        r45.v71 v71Var = this.f190353b;
        if (i17 == 0 && fVar.f152148a == 0) {
            r45.m70 m70Var = (r45.m70) ((r45.o62) fVar.f152151d).m75936x14adae67(1);
            if (m70Var != null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pg(this.f190355d, m70Var, v71Var));
                this.f190352a.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d));
            }
        } else {
            r45.h32 h32Var = (r45.h32) v71Var.m75936x14adae67(1);
            boolean z17 = h32Var != null && h32Var.m75939xb282bd08(7) == 1;
            zy2.i5 i5Var = this.f190354c;
            if (!z17) {
                r45.h32 h32Var2 = (r45.h32) v71Var.m75936x14adae67(1);
                if (!(h32Var2 != null && h32Var2.m75939xb282bd08(7) == 3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 0;
                    i5Var.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
            r45.h32 h32Var3 = (r45.h32) v71Var.m75936x14adae67(1);
            int i18 = h32Var3 != null && h32Var3.m75939xb282bd08(7) == 1 ? 3 : 10;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = i18;
            i5Var.a(java.lang.Integer.valueOf(i18));
            i5Var.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d));
        }
        return jz5.f0.f384359a;
    }
}

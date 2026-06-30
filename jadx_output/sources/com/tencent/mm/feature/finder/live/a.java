package com.tencent.mm.feature.finder.live;

@j95.b
/* loaded from: classes3.dex */
public final class a extends i95.w implements s40.o0 {
    public r45.hx0 Ai(java.lang.String finderUsername, boolean z17) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        ek2.q1 q1Var = ek2.r1.f253524u;
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 4);
        r45.ih2 ih2Var = new r45.ih2();
        ih2Var.set(0, finderUsername);
        ih2Var.set(1, java.lang.Integer.valueOf(z17 ? 2 : 1));
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(ih2Var.toByteArray()));
        return hx0Var;
    }

    public r45.hx0 Bi(boolean z17, java.lang.String finderName) {
        kotlin.jvm.internal.o.g(finderName, "finderName");
        ek2.q1 q1Var = ek2.r1.f253524u;
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 8);
        r45.c12 c12Var = new r45.c12();
        c12Var.set(0, finderName);
        c12Var.set(1, 1);
        c12Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 2));
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(c12Var.toByteArray()));
        return hx0Var;
    }

    public com.tencent.mm.modelbase.i wi(long j17, long j18, int i17, r45.hx0 cmdItem) {
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        return new ek2.r1(j17, j18, i17, cmdItem);
    }
}

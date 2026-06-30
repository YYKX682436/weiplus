package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class u4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f33867x366c91de = 79;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f33868x24728b = "operateWXData";

    public static final r45.m24 J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var, java.lang.String str) {
        r45.m24 m24Var = new r45.m24();
        m24Var.f461622d = yVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        u4Var.getClass();
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        m24Var.f461623e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        m24Var.f461626h = yVar.t3().f156338p.f158814g;
        r45.nd7 nd7Var = new r45.nd7();
        u4Var.c(nd7Var, yVar);
        m24Var.f461627i = nd7Var;
        return m24Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) invokeContext.f162546b;
        java.lang.String optString = invokeContext.f162547c.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, null);
        int i17 = invokeContext.f162549e;
        if (optString == null) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        ((km5.q) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r.f161233a.b(yVar, "/cgi-bin/mmbiz-bin/js-operatewxdata", J(yVar, this, optString), r45.n24.class).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.q4(yVar, this, i17, optString)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r4(yVar, i17, this)).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s4(oVar))).t(lm5.d.f401133a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.t4(oVar, yVar, i17, this));
    }
}

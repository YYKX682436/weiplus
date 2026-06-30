package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class rg implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f190441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f190442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f190443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f190444d;

    public rg(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.v71 v71Var, zy2.i5 i5Var, zy2.i5 i5Var2) {
        this.f190441a = abstractActivityC21394xb3d2c0cf;
        this.f190442b = v71Var;
        this.f190443c = i5Var;
        this.f190444d = i5Var2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        zy2.i5 i5Var = this.f190443c;
        r45.v71 v71Var = this.f190442b;
        boolean z17 = false;
        if (i17 == 0 && fVar.f152148a == 0) {
            r45.m70 m70Var = (r45.m70) ((r45.zr1) fVar.f152151d).m75936x14adae67(1);
            if (m70Var != null && !m70Var.m75933x41a8a7f2(6)) {
                z17 = true;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f190441a;
            if (z17) {
                db5.t7.m(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0o));
            }
            r45.h32 h32Var = (r45.h32) v71Var.m75936x14adae67(1);
            java.lang.String str = (h32Var == null || (m75945x2fec83072 = h32Var.m75945x2fec8307(8)) == null) ? "" : m75945x2fec83072;
            r45.h32 h32Var2 = (r45.h32) v71Var.m75936x14adae67(1);
            pq5.g l17 = new db2.b2(str, null, null, 0L, 0L, (h32Var2 == null || (m75945x2fec8307 = h32Var2.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307, 1, false, 30, null).l();
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qg(this.f190444d, v71Var, i5Var, abstractActivityC21394xb3d2c0cf));
            l17.f(abstractActivityC21394xb3d2c0cf);
            return l17;
        }
        r45.h32 h32Var3 = (r45.h32) v71Var.m75936x14adae67(1);
        if (!(h32Var3 != null && h32Var3.m75939xb282bd08(7) == 1)) {
            r45.h32 h32Var4 = (r45.h32) v71Var.m75936x14adae67(1);
            if (!(h32Var4 != null && h32Var4.m75939xb282bd08(7) == 3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 0;
                i5Var.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d));
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
        r45.h32 h32Var5 = (r45.h32) v71Var.m75936x14adae67(1);
        if (h32Var5 != null && h32Var5.m75939xb282bd08(7) == 1) {
            z17 = true;
        }
        int i18 = z17 ? 3 : 10;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = i18;
        i5Var.a(java.lang.Integer.valueOf(i18));
        i5Var.a(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d));
        return jz5.f0.f384359a;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class qx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f190387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(2);
        this.f190387d = pzVar;
        this.f190388e = abstractC14490x69736cb5;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ix0 ret = (r45.ix0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((r45.g33) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f190387d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "live feed danmaku open ret:" + ret);
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pzVar.f190288g;
        if (m75939xb282bd08 == 0) {
            this.f190388e.d2(true);
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(abstractActivityC21394xb3d2c0cf);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f572919cx0);
            e4Var.c();
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(abstractActivityC21394xb3d2c0cf);
            e4Var2.b(com.p314xaae8f345.mm.R.raw.f79723x416541f0);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.eqz);
            e4Var2.c();
        }
        return jz5.f0.f384359a;
    }
}

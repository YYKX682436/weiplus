package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class q5 implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 f168565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f168568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 f168569e;

    public q5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 u4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, java.lang.String str, boolean z17) {
        this.f168569e = d5Var;
        this.f168565a = u4Var;
        this.f168566b = wdVar;
        this.f168567c = str;
        this.f168568d = z17;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var = this.f168569e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "modularizingNewPageNavigation.onLoadResult(%s), appId:%s, type:%s, url:%s", gVar, d5Var.m52168x74292566(), this.f168566b, this.f168567c);
        int ordinal = gVar.ordinal();
        boolean z17 = this.f168568d;
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(937, z17 ? 6 : 2);
            d5Var.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.l5(this));
        } else if (ordinal == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(937, z17 ? 7 : 3);
            d5Var.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p5(this));
        } else {
            if (ordinal != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(937, z17 ? 8 : 4);
            d5Var.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m5(this));
        }
    }

    @Override // ph1.d
    public void b(java.util.List list) {
        this.f168565a.c("downloadPackageList", list);
    }
}

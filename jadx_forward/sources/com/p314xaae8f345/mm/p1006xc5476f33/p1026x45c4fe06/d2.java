package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f159091d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f159091d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f159091d;
        c11510xdd90c2f2.f156342r = c11510xdd90c2f2.Z();
        this.f159091d.f156342r.m52184xcd7dff16(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11839x59874d3(this));
        this.f159091d.f156342r.m52185x5c968792(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11840x59874d4(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ef efVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ef.AppBrandPageContainer;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f159091d;
        efVar.a(c11510xdd90c2f22, c11510xdd90c2f22.f156342r);
        this.f159091d.f156342r.u(this.f159091d.f156338p.f158816i);
        if (this.f159091d.f156330f.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z5) this.f159091d.f156330f.getLast();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 pageContainer = this.f159091d.f156342r;
        z5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageContainer, "pageContainer");
        z5Var.f173978b = pageContainer;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", z5Var + " setPageContainer");
    }
}

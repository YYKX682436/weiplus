package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 f148866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h f148867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 f148868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f148869g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        this.f148866d = h6Var;
        this.f148867e = hVar;
        this.f148868f = c12474x8b872a21;
        this.f148869g = c12473xe2bfc4b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgByAppBrandClickForOpenMaterialUIC", "tryLaunchAppBrand, launch appBrand");
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h hVar = this.f148867e;
        android.app.Activity m80379x76847179 = hVar.m80379x76847179();
        l81.b1 b1Var = new l81.b1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = this.f148868f.f167788d;
        b1Var.f398547b = c12475x7cfc32b2.f167795d;
        b1Var.f398549c = c12475x7cfc32b2.f167796e;
        b1Var.f398555f = c12475x7cfc32b2.f167797f;
        b1Var.f398565k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.r0.f34312x366c91de;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = this.f148869g;
        java.lang.String mimeType = c12473xe2bfc4b5.f167782d.f167802d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
        java.lang.String materialPath = c12473xe2bfc4b5.f167782d.f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        b1Var.f398561i = new bi1.e(mimeType, materialPath, null, 0, 12, null);
        b1Var.L = new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.f(hVar);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) this.f148866d).bj(m80379x76847179, b1Var);
    }
}

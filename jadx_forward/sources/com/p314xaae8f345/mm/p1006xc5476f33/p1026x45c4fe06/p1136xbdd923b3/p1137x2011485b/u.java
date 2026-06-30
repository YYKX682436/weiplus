package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

/* loaded from: classes7.dex */
public final class u implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.v f165850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef f165851e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12319xdc45d1ef c12319xdc45d1ef) {
        this.f165850d = vVar;
        this.f165851e = c12319xdc45d1ef;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12318x2713826d c12318x2713826d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.C12318x2713826d) obj;
        if (!c12318x2713826d.f165784d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy", "startWithParams(" + this.f165851e + ") failed, message:" + c12318x2713826d.f165785e);
            this.f165850d.f165853a.b();
            return;
        }
        fj1.y yVar = this.f165850d.f165853a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = c12318x2713826d.f165785e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11813xf952a195);
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f344677d, "notifyColdLaunchResult");
        yVar.f344681h = c11813xf952a195;
        yVar.f344682i = new fj1.j();
        yVar.f344683j = new fj1.h(yVar);
        yVar.f344684k = new fj1.b0(yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 appPkgInfo = c11813xf952a195.f387385r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appPkgInfo, "appPkgInfo");
        fj1.t tVar = new fj1.t(yVar.c(), appPkgInfo);
        yVar.f344685l = tVar;
        yVar.f344686m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5(null, tVar.f344671b);
        pm0.v.X(new fj1.w(yVar));
    }
}

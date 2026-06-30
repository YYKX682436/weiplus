package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f169050d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f169050d = o0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        pd1.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.c cVar = this.f169050d.f169066p;
        if (cVar != null && (oVar = cVar.f168969h) != null) {
            oVar.mo129533x41012807();
        }
        this.f169050d.f169054d.m52187x5190507a(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f169050d.f169053c.f156336n, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onPause, type: " + w0Var);
        this.f169050d.D = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169050d;
        if (o0Var.f169069s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "pipVideo has stopped, skip");
            return;
        }
        if (o0Var.f169066p == null) {
            return;
        }
        if (o0Var.f169063m != null) {
            o0Var.a("onPause");
        }
        pd1.o oVar = this.f169050d.f169066p.f168969h;
        if (oVar != null) {
            if (oVar.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "background play enabled, skip");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 g17 = oVar.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onPause, autoPauseStrategy: %s", g17);
            if (!g17.a(this.f169050d.f169053c.C0(), w0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onPause, not need pause video play");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onPause, pause");
                oVar.mo129532x65825f6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onResume");
        this.f169050d.D = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169050d;
        if (o0Var.f169069s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "pipVideo has stopped, skip");
            return;
        }
        if (o0Var.f169066p == null) {
            return;
        }
        if (o0Var.f169063m != null) {
            o0Var.f169076z.mo51100x4c4bb389();
        }
        pd1.o oVar = this.f169050d.f169066p.f168969h;
        if (oVar != null) {
            if (oVar.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "background play enabled, skip");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169050d.f169051a, "onResume, start");
                oVar.mo129534x68ac462();
            }
        }
    }
}

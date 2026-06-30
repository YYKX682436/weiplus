package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f162479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f162480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.e f162482g;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.e eVar) {
        this.f162479d = o6Var;
        this.f162480e = c0Var;
        this.f162481f = i17;
        this.f162482g = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f162479d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = o6Var.f156344t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.e eVar = this.f162482g;
        int i17 = this.f162481f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f162480e;
        if (vcVar == null) {
            c0Var.a(i17, eVar.o("fail: timeout"));
        } else if (!(vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc)) {
            c0Var.a(i17, eVar.o("fail: screenshot invalid"));
        } else {
            o6Var.H0();
            c0Var.a(i17, eVar.o("ok"));
        }
    }
}

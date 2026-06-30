package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class aa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f182001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f182002e;

    public aa(o72.r2 r2Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f182001d = r2Var;
        this.f182002e = daVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        o72.r2 r2Var = this.f182001d;
        o72.t2 t2Var = new o72.t2(r2Var);
        int i19 = 3;
        t2Var.f424999d = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f182002e;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        t2Var.f425002g = cVar.o() ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        if (cVar2.o()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar3 = daVar.f182116n;
            if (cVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
                throw null;
            }
            i18 = cVar3.f182013m.indexOf(r2Var) + 1;
        } else {
            i18 = -1;
        }
        t2Var.f425003h = i18;
        t2Var.f425004i = o72.x1.u().indexOf(java.lang.Long.valueOf(r2Var.f67645x88be67a1)) + 1;
        int i27 = r2Var.f67657x2262335f;
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        if (i27 != 5) {
            i19 = i27 != 8 ? 0 : 1;
        } else if (bq0Var != null && bq0Var.K != null) {
            i19 = 2;
        }
        t2Var.f425000e = i19;
        o72.x1.l(r2Var, true, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z9(daVar), 6, t2Var);
    }
}

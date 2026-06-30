package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class y1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f183146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a2 f183147e;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a2 a2Var, o72.r2 r2Var) {
        this.f183147e = a2Var;
        this.f183146d = r2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).wi(java.lang.Long.valueOf(this.f183146d.f67645x88be67a1));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a2 a2Var = this.f183147e;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = a2Var.f181985g.f181868o;
        if (cVar != null) {
            cVar.c();
            a2Var.f181985g.f181868o.notifyDataSetChanged();
        }
    }
}

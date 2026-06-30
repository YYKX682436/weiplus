package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class y1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.a2 f101614e;

    public y1(com.tencent.mm.plugin.fav.ui.a2 a2Var, o72.r2 r2Var) {
        this.f101614e = a2Var;
        this.f101613d = r2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).wi(java.lang.Long.valueOf(this.f101613d.field_localId));
        com.tencent.mm.plugin.fav.ui.a2 a2Var = this.f101614e;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = a2Var.f100452g.f100335o;
        if (cVar != null) {
            cVar.c();
            a2Var.f100452g.f100335o.notifyDataSetChanged();
        }
    }
}

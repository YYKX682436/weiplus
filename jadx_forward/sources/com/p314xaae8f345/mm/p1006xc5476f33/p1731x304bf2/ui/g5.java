package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class g5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i5 f222932d;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i5 i5Var) {
        this.f222932d = i5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().m145253xb158737d("GameRawMessage", "delete from GameRawMessage");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i5 i5Var = this.f222932d;
        i5Var.f222956d.f222465i.o();
        i5Var.f222956d.f222465i.notifyDataSetChanged();
    }
}

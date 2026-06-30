package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class a7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.d7 f278658e;

    public a7(com.p314xaae8f345.mm.ui.d7 d7Var, java.lang.String str) {
        this.f278658e = d7Var;
        this.f278657d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.d7 d7Var = this.f278658e;
        intent.setClass(d7Var.f289863d.f290983a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11366xcba74a33.class);
        intent.putExtra("kstyle_bind_wording", new com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e(this.f278657d, ""));
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(d7Var.f289863d.f290983a, intent);
        dialogInterface.dismiss();
    }
}

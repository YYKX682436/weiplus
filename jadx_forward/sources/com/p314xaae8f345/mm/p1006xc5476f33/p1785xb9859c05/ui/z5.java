package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class z5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 f224629d;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var) {
        this.f224629d = l6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "user choose end this call because isNotFree");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224629d;
        l6Var.f224459y.j(0, 0);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(42);
        l6Var.f224457w.finish();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class s6 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6 f171736d;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12662x7403fcf1 activityC12662x7403fcf1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6 w6Var) {
        this.f171736d = w6Var;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getAction() == 1) {
            this.f171736d.b(false, null, 0);
            dialogInterface.dismiss();
        }
        return false;
    }
}

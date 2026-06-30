package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class g6 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f72664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f72666f;

    public g6(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f72664d = z2Var;
        this.f72665e = paylistAARemarkInputHalfPage;
        this.f72666f = mMEditText;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || !this.f72664d.h()) {
            return false;
        }
        com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage = this.f72665e;
        if (paylistAARemarkInputHalfPage.f72539h > 0) {
            paylistAARemarkInputHalfPage.f72535d.hideVKB(this.f72666f);
            return false;
        }
        paylistAARemarkInputHalfPage.a();
        return false;
    }
}

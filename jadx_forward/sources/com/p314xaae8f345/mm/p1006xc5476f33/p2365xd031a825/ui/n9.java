package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class n9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o9 f262077d;

    public n9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o9 o9Var) {
        this.f262077d = o9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess2 and finish to reset mobile num!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o9 o9Var = this.f262077d;
        android.os.Bundle m83105x7498fe14 = o9Var.f262098e.m83105x7498fe14();
        m83105x7498fe14.putInt("key_err_code", 408);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(o9Var.f262098e, m83105x7498fe14);
        o9Var.f262098e.finish();
    }
}

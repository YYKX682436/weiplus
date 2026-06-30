package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class h9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f261854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k9 f261855e;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k9 k9Var, int i17) {
        this.f261855e = k9Var;
        this.f261854d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k9 k9Var = this.f261855e;
        android.os.Bundle m83105x7498fe14 = k9Var.f261916e.m83105x7498fe14();
        m83105x7498fe14.putInt("key_err_code", 417);
        boolean z17 = true;
        m83105x7498fe14.putBoolean("key_need_show_switch_phone", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = k9Var.f261915d;
        if (c19091x9511676c != null && !c19091x9511676c.v0()) {
            z17 = false;
        }
        m83105x7498fe14.putBoolean("key_isbalance", z17);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(k9Var.f261916e, m83105x7498fe14);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15443, 2, 2, java.lang.Integer.valueOf(this.f261854d));
    }
}

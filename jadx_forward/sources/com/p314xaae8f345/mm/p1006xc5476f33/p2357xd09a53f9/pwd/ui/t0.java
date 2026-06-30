package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class t0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 f260605d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9) {
        this.f260605d = viewOnLayoutChangeListenerC19048x56ebf0e9;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " lose focus");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " has focus");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9.f260415u;
        this.f260605d.V6();
    }
}

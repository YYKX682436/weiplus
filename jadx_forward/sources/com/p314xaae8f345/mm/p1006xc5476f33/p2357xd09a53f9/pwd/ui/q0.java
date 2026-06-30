package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class q0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 f260592d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9) {
        this.f260592d = viewOnLayoutChangeListenerC19048x56ebf0e9;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" haveNameext：");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9 = this.f260592d;
        sb6.append((java.lang.Object) viewOnLayoutChangeListenerC19048x56ebf0e9.f260416d.getText());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", sb6.toString());
        if (viewOnLayoutChangeListenerC19048x56ebf0e9.f260416d.getText() == null || "".equals(viewOnLayoutChangeListenerC19048x56ebf0e9.f260416d.getText().toString())) {
            viewOnLayoutChangeListenerC19048x56ebf0e9.f260428s = false;
        } else {
            viewOnLayoutChangeListenerC19048x56ebf0e9.f260428s = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9.U6(viewOnLayoutChangeListenerC19048x56ebf0e9);
    }
}

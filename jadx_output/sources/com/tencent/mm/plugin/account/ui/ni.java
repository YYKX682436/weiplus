package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ni implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f74069d;

    public ni(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f74069d = simpleLoginUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = this.f74069d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(simpleLoginUI.f73663g.getText().toString()) || com.tencent.mm.sdk.platformtools.t8.K0(simpleLoginUI.f73664h.getText().toString())) {
            simpleLoginUI.f73671r.setEnabled(false);
        } else {
            simpleLoginUI.f73671r.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

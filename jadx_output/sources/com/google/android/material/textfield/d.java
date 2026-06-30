package com.google.android.material.textfield;

/* loaded from: classes15.dex */
public class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.TextInputLayout f44619d;

    public d(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        this.f44619d = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.google.android.material.textfield.TextInputLayout textInputLayout = this.f44619d;
        textInputLayout.n(!textInputLayout.D1, false);
        if (textInputLayout.f44566h) {
            textInputLayout.k(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

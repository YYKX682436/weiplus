package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class o0 implements android.text.TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavChangeTagUI", "afterTextChanged = ".concat(valueOf));
        if (valueOf.length() <= 18 || editable == null) {
            return;
        }
        editable.delete(18, valueOf.length());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

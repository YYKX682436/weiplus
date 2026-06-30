package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public class k0 implements android.text.TextWatcher {
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.AbstractActivityC17129x6de84683 abstractActivityC17129x6de84683) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf < 0 || length - indexOf <= 2) {
            return;
        }
        editable.delete(indexOf + 3, length);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

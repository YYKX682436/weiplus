package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class d9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf f291889d;

    public d9(com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf c22520x90c681bf) {
        this.f291889d = c22520x90c681bf;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf c22520x90c681bf = this.f291889d;
        if (editable == null || editable.length() <= 0) {
            c22520x90c681bf.f291678f.setVisibility(8);
            c22520x90c681bf.f291679g.setEnabled(false);
        } else {
            c22520x90c681bf.f291678f.setVisibility(0);
            c22520x90c681bf.f291679g.setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

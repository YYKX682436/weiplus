package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class gh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ih f290233d;

    public gh(com.p314xaae8f345.mm.ui.ih ihVar) {
        this.f290233d = ihVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.ih ihVar = this.f290233d;
        if (editable == null || editable.length() <= 0) {
            ihVar.f290460e.setVisibility(8);
        } else {
            ihVar.f290460e.setVisibility(0);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

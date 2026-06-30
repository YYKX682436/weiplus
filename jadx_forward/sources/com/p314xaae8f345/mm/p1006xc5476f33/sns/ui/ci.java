package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes5.dex */
public class ci implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf f249665d;

    public ci(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf c18056x3bc9e3cf) {
        this.f249665d = c18056x3bc9e3cf;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (charSequence != null) {
            this.f249665d.I = charSequence.length();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18056x3bc9e3cf c18056x3bc9e3cf = this.f249665d;
        try {
            if (c18056x3bc9e3cf.H) {
                if (charSequence != null && charSequence.length() >= Integer.MAX_VALUE) {
                    if (charSequence.length() - c18056x3bc9e3cf.I > Integer.MAX_VALUE) {
                        c18056x3bc9e3cf.G = charSequence.length() - c18056x3bc9e3cf.I;
                    }
                }
                c18056x3bc9e3cf.G = 0;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsEditText", e17, "", new java.lang.Object[0]);
        }
    }
}

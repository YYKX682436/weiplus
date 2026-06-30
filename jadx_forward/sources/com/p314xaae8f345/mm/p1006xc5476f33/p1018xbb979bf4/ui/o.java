package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes15.dex */
public class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc f156139d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc viewOnFocusChangeListenerC11488x5fd5e9fc) {
        this.f156139d = viewOnFocusChangeListenerC11488x5fd5e9fc;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11488x5fd5e9fc viewOnFocusChangeListenerC11488x5fd5e9fc = this.f156139d;
        if (viewOnFocusChangeListenerC11488x5fd5e9fc.f155952p == 5 && viewOnFocusChangeListenerC11488x5fd5e9fc.f155951o != editable.toString().length()) {
            viewOnFocusChangeListenerC11488x5fd5e9fc.f155951o = editable.toString().length();
            viewOnFocusChangeListenerC11488x5fd5e9fc.m48727xbca468d7(editable.toString());
        }
        boolean b17 = viewOnFocusChangeListenerC11488x5fd5e9fc.b();
        if (b17 != viewOnFocusChangeListenerC11488x5fd5e9fc.f155954r && (sVar = viewOnFocusChangeListenerC11488x5fd5e9fc.f155944e) != null) {
            java.lang.String str = viewOnFocusChangeListenerC11488x5fd5e9fc.f155950n;
            int i17 = viewOnFocusChangeListenerC11488x5fd5e9fc.f155952p;
            viewOnFocusChangeListenerC11488x5fd5e9fc.f155954r = b17;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700) sVar).T6();
        }
        boolean z17 = viewOnFocusChangeListenerC11488x5fd5e9fc.f155943d;
        if ((!z17 || viewOnFocusChangeListenerC11488x5fd5e9fc.f155954r) && z17 && viewOnFocusChangeListenerC11488x5fd5e9fc.f155954r) {
            viewOnFocusChangeListenerC11488x5fd5e9fc.f155947h.setTextColor(viewOnFocusChangeListenerC11488x5fd5e9fc.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        viewOnFocusChangeListenerC11488x5fd5e9fc.d(viewOnFocusChangeListenerC11488x5fd5e9fc.f155947h.isFocused());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

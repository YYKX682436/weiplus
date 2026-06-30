package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes5.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21538x25257d8e f279323d;

    public a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21538x25257d8e c21538x25257d8e) {
        this.f279323d = c21538x25257d8e;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21538x25257d8e c21538x25257d8e = this.f279323d;
        java.lang.CharSequence hint = c21538x25257d8e.getHint();
        int width = (c21538x25257d8e.getWidth() - c21538x25257d8e.getPaddingLeft()) - c21538x25257d8e.getPaddingRight();
        int i17 = com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21538x25257d8e.f279277i;
        c21538x25257d8e.a(editable, hint, width);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

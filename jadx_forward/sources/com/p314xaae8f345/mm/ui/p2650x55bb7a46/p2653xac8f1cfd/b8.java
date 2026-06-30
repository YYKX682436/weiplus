package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class b8 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f280253d;

    public b8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        this.f280253d = y8Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar = this.f280253d.f281838z;
        if (gpVar != null) {
            gpVar.c();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

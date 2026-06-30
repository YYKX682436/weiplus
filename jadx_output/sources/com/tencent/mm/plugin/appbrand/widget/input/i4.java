package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class i4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.j4 f91495d;

    public i4(com.tencent.mm.plugin.appbrand.widget.input.j4 j4Var) {
        this.f91495d = j4Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.appbrand.widget.input.j4 j4Var = this.f91495d;
        j4Var.f91504d.removeCallbacks(j4Var.f91507g);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

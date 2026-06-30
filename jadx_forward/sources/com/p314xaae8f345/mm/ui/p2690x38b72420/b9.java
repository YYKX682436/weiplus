package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class b9 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f288160d = false;

    public b9(com.p314xaae8f345.mm.ui.p2690x38b72420.x8 x8Var) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        if (this.f288160d) {
            return;
        }
        this.f288160d = true;
        fo3.s.INSTANCE.O6(3, 2, 10);
    }
}

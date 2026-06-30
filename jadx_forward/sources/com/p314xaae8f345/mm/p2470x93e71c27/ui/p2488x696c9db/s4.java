package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes11.dex */
public abstract class s4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public al5.o1 f273429d = null;

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        al5.o1 o1Var = this.f273429d;
        if (o1Var != null) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = ((com.p314xaae8f345.mm.ui.p2690x38b72420.w5) o1Var).f288762a;
            if (activityC22313x70d15e01.f288001d.m79028xfb85ada3().toString().trim().length() > 0) {
                activityC22313x70d15e01.m78501x43e00957(true);
            }
        }
    }
}

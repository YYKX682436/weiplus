package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f239496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 f239497e;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var, android.widget.EditText editText) {
        this.f239497e = b0Var;
        this.f239496d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f239496d;
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f239497e.f239173a.getSystemService("input_method")).showSoftInput(editText, 0);
    }
}

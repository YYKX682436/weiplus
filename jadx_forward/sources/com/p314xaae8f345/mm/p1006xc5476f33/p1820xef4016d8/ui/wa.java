package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes.dex */
public final class wa implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f229175d;

    public wa(android.widget.EditText editText) {
        this.f229175d = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        android.widget.EditText editText = this.f229175d;
        if (editText == null) {
            return;
        }
        editText.setContentDescription(s17.toString());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class va implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f229070d;

    public va(android.widget.EditText editText) {
        this.f229070d = editText;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        java.lang.String obj = s17.toString();
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+\\.?\\d{0,2})").matcher(obj);
        if (matcher.find()) {
            java.lang.String group = matcher.group();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(group, obj) && !r26.i0.A(obj, ".", false, 2, null)) {
                s17.replace(0, s17.length(), group);
                return;
            }
        }
        boolean A = r26.i0.A(obj, ".", false, 2, null);
        android.widget.EditText editText = this.f229070d;
        if (A) {
            s17.insert(0, "0");
        } else if (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.f(obj, editText)) {
            return;
        }
        java.lang.String obj2 = s17.toString();
        int L = r26.n0.L(obj2, ".", 0, false, 6, null);
        int length = obj2.length();
        if (L >= 0 && length - L > 3) {
            s17.delete(L + 3, length);
        } else if (L > 6) {
            s17.delete(6, L);
        } else if (L == -1 && length > 6) {
            s17.delete(6, length);
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

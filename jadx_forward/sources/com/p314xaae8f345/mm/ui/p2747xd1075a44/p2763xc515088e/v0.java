package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes15.dex */
public class v0 implements android.widget.NumberPicker.OnValueChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 f293870a;

    public v0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var) {
        this.f293870a = x0Var;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public void onValueChange(android.widget.NumberPicker numberPicker, int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0 x0Var = this.f293870a;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) x0Var.f293865a.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            android.widget.EditText editText = x0Var.f293881j;
            if (inputMethodManager.isActive(editText)) {
                editText.clearFocus();
                inputMethodManager.hideSoftInputFromWindow(x0Var.f293865a.getWindowToken(), 0);
            } else {
                android.widget.EditText editText2 = x0Var.f293880i;
                if (inputMethodManager.isActive(editText2)) {
                    editText2.clearFocus();
                    inputMethodManager.hideSoftInputFromWindow(x0Var.f293865a.getWindowToken(), 0);
                } else {
                    android.widget.EditText editText3 = x0Var.f293879h;
                    if (inputMethodManager.isActive(editText3)) {
                        editText3.clearFocus();
                        inputMethodManager.hideSoftInputFromWindow(x0Var.f293865a.getWindowToken(), 0);
                    }
                }
            }
        }
        x0Var.f293886o.setTimeInMillis(x0Var.f293889r.getTimeInMillis());
        if (numberPicker == x0Var.f293875d) {
            int actualMaximum = x0Var.f293886o.getActualMaximum(5);
            if (i17 == actualMaximum && i18 == 1) {
                x0Var.f293886o.add(5, 1);
            } else if (i17 == 1 && i18 == actualMaximum) {
                x0Var.f293886o.add(5, -1);
            } else {
                x0Var.f293886o.add(5, i18 - i17);
            }
        } else if (numberPicker == x0Var.f293876e) {
            if (i17 == 11 && i18 == 0) {
                x0Var.f293886o.add(2, 1);
            } else if (i17 == 0 && i18 == 11) {
                x0Var.f293886o.add(2, -1);
            } else {
                x0Var.f293886o.add(2, i18 - i17);
            }
        } else {
            if (numberPicker != x0Var.f293877f) {
                throw new java.lang.IllegalArgumentException();
            }
            x0Var.f293886o.set(1, i18);
        }
        x0Var.d(x0Var.f293886o.get(1), x0Var.f293886o.get(2), x0Var.f293886o.get(5));
        x0Var.i();
        x0Var.h();
        x0Var.f293865a.sendAccessibilityEvent(4);
    }
}

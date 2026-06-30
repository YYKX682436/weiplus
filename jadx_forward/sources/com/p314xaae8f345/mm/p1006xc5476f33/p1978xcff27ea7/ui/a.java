package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab f236676d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab) {
        this.f236676d = viewOnFocusChangeListenerC16958xba487cab;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = this.f236676d;
        int selectionStart = viewOnFocusChangeListenerC16958xba487cab.f236619g.getSelectionStart();
        java.lang.String str = "";
        if (charSequence2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(charSequence2.replaceAll(" ", ""));
            int length = sb6.length();
            if (length >= 4) {
                sb6.insert(3, ' ');
            }
            if (length >= 8) {
                sb6.insert(8, ' ');
            }
            str = sb6.toString();
            int length2 = str.length();
            int i27 = viewOnFocusChangeListenerC16958xba487cab.f236632w;
            if (length2 > i27) {
                if ((selectionStart == 4 || selectionStart == 9) && i19 == 1) {
                    selectionStart++;
                } else if ((selectionStart == 4 || selectionStart == 9) && i19 > 1) {
                    selectionStart += i19;
                }
            } else if (length2 < i27 && (selectionStart == 4 || selectionStart == 9)) {
                selectionStart--;
            }
            viewOnFocusChangeListenerC16958xba487cab.f236632w = length2;
        }
        if (charSequence2.equals(str)) {
            viewOnFocusChangeListenerC16958xba487cab.b();
            return;
        }
        viewOnFocusChangeListenerC16958xba487cab.f236619g.setText(str);
        int i28 = viewOnFocusChangeListenerC16958xba487cab.f236632w;
        if (selectionStart < i28) {
            viewOnFocusChangeListenerC16958xba487cab.f236619g.setSelection(selectionStart);
        } else {
            viewOnFocusChangeListenerC16958xba487cab.f236619g.setSelection(i28);
        }
    }
}

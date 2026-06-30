package ym5;

/* loaded from: classes5.dex */
public final class z5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 f545126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f545127e;

    public z5(com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa94, int i17) {
        this.f545126d = c22810x4e74aa94;
        this.f545127e = i17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa94 = this.f545126d;
        int lineCount = c22810x4e74aa94.getLineCount();
        int i17 = this.f545127e;
        if (lineCount > i17) {
            java.lang.CharSequence text = c22810x4e74aa94.getText();
            if (text == null) {
                text = "";
            }
            int i18 = 0;
            for (int i19 = 0; i19 < text.length(); i19++) {
                if (text.charAt(i19) == '\n') {
                    i18++;
                }
            }
            if (i18 >= i17) {
                c22810x4e74aa94.getClass();
                int i27 = -1;
                for (int i28 = 0; i28 < i17; i28++) {
                    i27 = r26.n0.K(text, '\n', i27 + 1, false, 4, null);
                    if (i27 == -1) {
                        break;
                    }
                }
                java.lang.CharSequence subSequence = text.subSequence(0, i27);
                c22810x4e74aa94.setText(subSequence);
                c22810x4e74aa94.setSelection(subSequence.length());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

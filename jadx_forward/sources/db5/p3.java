package db5;

/* loaded from: classes11.dex */
public final class p3 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f309998d;

    public p3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a) {
        this.f309998d = c21503x6e5a020a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        boolean z18 = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f309998d;
        if (z17) {
            c21503x6e5a020a.hasFocused = true;
        }
        if (z17 && c21503x6e5a020a.getHintToText()) {
            java.lang.CharSequence hint = c21503x6e5a020a.getEditText().getHint();
            if (!(hint == null || r26.n0.N(hint))) {
                android.text.Editable text = c21503x6e5a020a.getEditText().getText();
                if (text != null && !r26.n0.N(text)) {
                    z18 = false;
                }
                if (z18) {
                    c21503x6e5a020a.getEditText().setText(c21503x6e5a020a.getEditText().getHint());
                    c21503x6e5a020a.getEditText().setHint((java.lang.CharSequence) null);
                }
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText = c21503x6e5a020a.getEditText();
            android.text.Editable text2 = c21503x6e5a020a.getEditText().getText();
            editText.setSelection(text2 != null ? text2.length() : 0);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a.a(c21503x6e5a020a);
        android.view.View.OnFocusChangeListener onFocusChangeListener = c21503x6e5a020a.f278996s;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}

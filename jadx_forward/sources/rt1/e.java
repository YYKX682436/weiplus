package rt1;

/* loaded from: classes7.dex */
public final class e implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f480930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f480931e;

    public e(rt1.l lVar, int i17) {
        this.f480930d = lVar;
        this.f480931e = i17;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.Character B0;
        boolean z17 = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            char A0 = r26.p0.A0(charSequence);
            if (19968 <= A0 && A0 < 40892) {
                rt1.l lVar = this.f480930d;
                android.widget.TextView[] textViewArr = lVar.f480982f;
                if (textViewArr == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("charViews");
                    throw null;
                }
                android.widget.TextView textView = textViewArr[7];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                java.lang.CharSequence text = textView.getText();
                if (text != null && (B0 = r26.p0.B0(text)) != null) {
                    char charValue = B0.charValue();
                    if (19968 <= charValue && charValue < 40892) {
                        z17 = true;
                    }
                }
                if (z17) {
                    android.widget.TextView[] textViewArr2 = lVar.f480982f;
                    if (textViewArr2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("charViews");
                        throw null;
                    }
                    android.widget.TextView textView2 = textViewArr2[this.f480931e];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
                    return textView2.getText();
                }
            }
        }
        return charSequence;
    }
}

package ko2;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.p1569x373aa5.C14473xc2b6e859 f391463d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.p1569x373aa5.C14473xc2b6e859 c14473xc2b6e859) {
        this.f391463d = c14473xc2b6e859;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.p1569x373aa5.C14473xc2b6e859.f202894r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.p1569x373aa5.C14473xc2b6e859 c14473xc2b6e859 = this.f391463d;
        if (c14473xc2b6e859.getLineCount() <= c14473xc2b6e859.maxLine || c14473xc2b6e859.f202895g) {
            return;
        }
        java.lang.CharSequence subSequence = c14473xc2b6e859.oriText.subSequence(0, c14473xc2b6e859.getLayout().getLineVisibleEnd(c14473xc2b6e859.maxLine - 1));
        int L = r26.n0.L(subSequence.toString(), ",", 0, false, 6, null);
        int P = r26.n0.P(subSequence.toString(), ",", 0, false, 6, null);
        if (L == -1) {
            android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder(c14473xc2b6e859.oriText.subSequence(0, r26.n0.L(c14473xc2b6e859.oriText.toString(), ",", 0, false, 6, null))).append((java.lang.CharSequence) ",").append(c14473xc2b6e859.endText);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(append, "append(...)");
            c14473xc2b6e859.resultText = append;
            c14473xc2b6e859.setText(append);
            c14473xc2b6e859.f202895g = true;
            return;
        }
        c14473xc2b6e859.endTextView.setText(c14473xc2b6e859.endText);
        c14473xc2b6e859.endTextView.setTextSize(c14473xc2b6e859.getTextSize());
        c14473xc2b6e859.nameTextView.setTextSize(c14473xc2b6e859.getTextSize());
        float measureText = c14473xc2b6e859.endTextView.getPaint().measureText(c14473xc2b6e859.endText.toString());
        while (P > L) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(subSequence.subSequence(P + 1, subSequence.length()));
            c14473xc2b6e859.nameTextView.setText(spannableStringBuilder);
            if (c14473xc2b6e859.nameTextView.getPaint().measureText(spannableStringBuilder.toString()) > measureText) {
                break;
            } else {
                P--;
            }
        }
        android.text.SpannableStringBuilder append2 = new android.text.SpannableStringBuilder(c14473xc2b6e859.oriText.subSequence(0, P)).append((java.lang.CharSequence) ",").append(c14473xc2b6e859.endText);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(append2, "append(...)");
        c14473xc2b6e859.resultText = append2;
        c14473xc2b6e859.setText(append2);
        c14473xc2b6e859.f202895g = true;
    }
}

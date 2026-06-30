package rt1;

/* loaded from: classes7.dex */
public final class b extends android.text.Spannable.Factory {
    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        android.text.SpannableStringBuilder valueOf = android.text.SpannableStringBuilder.valueOf(charSequence);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "valueOf(...)");
        return valueOf;
    }
}

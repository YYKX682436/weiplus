package mm0;

/* loaded from: classes2.dex */
public final class d extends android.text.SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410110d;

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.String toString() {
        if (this.f410110d == null) {
            java.lang.String spannableStringBuilder = super.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spannableStringBuilder, "toString(...)");
            return spannableStringBuilder;
        }
        return super.toString() + '_' + this.f410110d;
    }
}

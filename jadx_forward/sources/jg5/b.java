package jg5;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f381196a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f381197b = "";

    public b(int i17, int i18, int i19) {
        this.f381196a = i19;
    }

    public final boolean a(java.lang.CharSequence newText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newText, "newText");
        java.lang.CharSequence currentText = this.f381197b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentText, "currentText");
        if ((newText instanceof java.lang.String ? newText.hashCode() : ((newText instanceof android.text.SpannableString) || (newText instanceof android.text.SpannableStringBuilder) || (newText instanceof android.text.SpannedString)) ? newText.toString().hashCode() : -1) != (((currentText instanceof android.text.SpannableString) || (currentText instanceof android.text.SpannableStringBuilder) || (currentText instanceof android.text.SpannedString)) ? currentText.toString().hashCode() : currentText instanceof java.lang.String ? currentText.hashCode() : 0)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(currentText.toString(), newText.toString());
    }
}

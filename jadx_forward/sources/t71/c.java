package t71;

/* loaded from: classes12.dex */
public final class c implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final int f497571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.charset.Charset f497572e;

    public c(int i17, java.nio.charset.Charset charset) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        this.f497571d = i17;
        this.f497572e = charset;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.nio.charset.Charset charset = this.f497572e;
        try {
            java.lang.String valueOf = java.lang.String.valueOf(spanned);
            java.lang.String substring = valueOf.substring(0, i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.String substring2 = valueOf.substring(i27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            byte[] bytes = substring.concat(substring2).getBytes(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            int length = bytes.length;
            java.lang.String valueOf2 = java.lang.String.valueOf(charSequence != null ? charSequence.subSequence(i17, i18) : null);
            byte[] bytes2 = valueOf2.getBytes(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            int length2 = bytes2.length + length;
            int i28 = this.f497571d;
            if (length2 <= i28) {
                return null;
            }
            int i29 = i28 - length;
            if (i29 <= 0) {
                return "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            valueOf2.codePoints().forEach(new t71.b(this, new p3321xbce91901.jvm.p3324x21ffc6bd.f0(), i29, sb6));
            return sb6.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}

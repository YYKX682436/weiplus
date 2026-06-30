package c2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c2.b f119504e = new c2.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f119505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f119506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119507c;

    /* renamed from: d, reason: collision with root package name */
    public final java.text.BreakIterator f119508d;

    public c(java.lang.CharSequence charSequence, int i17, int i18, java.util.Locale locale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charSequence, "charSequence");
        this.f119505a = charSequence;
        if (!(i17 >= 0 && i17 <= charSequence.length())) {
            throw new java.lang.IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!(i18 >= 0 && i18 <= charSequence.length())) {
            throw new java.lang.IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wordInstance, "getWordInstance(locale)");
        this.f119508d = wordInstance;
        this.f119506b = java.lang.Math.max(0, i17 - 50);
        this.f119507c = java.lang.Math.min(charSequence.length(), i18 + 50);
        wordInstance.setText(new b2.a(charSequence, i17, i18));
    }

    public final void a(int i17) {
        boolean z17 = false;
        int i18 = this.f119506b;
        int i19 = this.f119507c;
        if (i17 <= i19 && i18 <= i17) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid offset: " + i17 + ". Valid range is [" + i18 + " , " + i19 + ']').toString());
    }

    public final boolean b(int i17) {
        return (i17 <= this.f119507c && this.f119506b + 1 <= i17) && java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(this.f119505a, i17));
    }

    public final boolean c(int i17) {
        if (i17 <= this.f119507c && this.f119506b + 1 <= i17) {
            return f119504e.a(java.lang.Character.codePointBefore(this.f119505a, i17));
        }
        return false;
    }

    public final boolean d(int i17) {
        return (i17 < this.f119507c && this.f119506b <= i17) && java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(this.f119505a, i17));
    }

    public final boolean e(int i17) {
        if (i17 < this.f119507c && this.f119506b <= i17) {
            return f119504e.a(java.lang.Character.codePointAt(this.f119505a, i17));
        }
        return false;
    }
}

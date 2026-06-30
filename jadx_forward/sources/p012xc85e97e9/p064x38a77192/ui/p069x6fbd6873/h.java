package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class h extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.b {

    /* renamed from: d, reason: collision with root package name */
    public static p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h f92106d;

    /* renamed from: c, reason: collision with root package name */
    public java.text.BreakIterator f92107c;

    public h(java.util.Locale locale, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wordInstance, "getWordInstance(locale)");
        this.f92107c = wordInstance;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g
    public int[] a(int i17) {
        if (d().length() <= 0 || i17 >= d().length()) {
            return null;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        while (!g(i17)) {
            if (g(i17) && (i17 == 0 || !g(i17 + (-1)))) {
                break;
            }
            java.text.BreakIterator breakIterator = this.f92107c;
            if (breakIterator == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                throw null;
            }
            i17 = breakIterator.following(i17);
            if (i17 == -1) {
                return null;
            }
        }
        java.text.BreakIterator breakIterator2 = this.f92107c;
        if (breakIterator2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
            throw null;
        }
        int following = breakIterator2.following(i17);
        if (following == -1 || !f(following)) {
            return null;
        }
        return c(i17, following);
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g
    public int[] b(int i17) {
        int length = d().length();
        if (length <= 0 || i17 <= 0) {
            return null;
        }
        if (i17 > length) {
            i17 = length;
        }
        while (i17 > 0 && !g(i17 - 1) && !f(i17)) {
            java.text.BreakIterator breakIterator = this.f92107c;
            if (breakIterator == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                throw null;
            }
            i17 = breakIterator.preceding(i17);
            if (i17 == -1) {
                return null;
            }
        }
        java.text.BreakIterator breakIterator2 = this.f92107c;
        if (breakIterator2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
            throw null;
        }
        int preceding = breakIterator2.preceding(i17);
        if (preceding != -1) {
            if (g(preceding) && (preceding == 0 || !g(preceding + (-1)))) {
                return c(preceding, i17);
            }
        }
        return null;
    }

    public void e(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f92044a = text;
        java.text.BreakIterator breakIterator = this.f92107c;
        if (breakIterator != null) {
            breakIterator.setText(text);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
            throw null;
        }
    }

    public final boolean f(int i17) {
        return i17 > 0 && g(i17 + (-1)) && (i17 == d().length() || !g(i17));
    }

    public final boolean g(int i17) {
        if (i17 < 0 || i17 >= d().length()) {
            return false;
        }
        return java.lang.Character.isLetterOrDigit(d().codePointAt(i17));
    }
}

package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public class c extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.b {

    /* renamed from: d, reason: collision with root package name */
    public static p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.c f92052d;

    /* renamed from: c, reason: collision with root package name */
    public java.text.BreakIterator f92053c;

    public c(java.util.Locale locale, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(characterInstance, "getCharacterInstance(locale)");
        this.f92053c = characterInstance;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.g
    public int[] a(int i17) {
        int length = d().length();
        if (length <= 0 || i17 >= length) {
            return null;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        do {
            java.text.BreakIterator breakIterator = this.f92053c;
            if (breakIterator == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i17)) {
                java.text.BreakIterator breakIterator2 = this.f92053c;
                if (breakIterator2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                    throw null;
                }
                int following = breakIterator2.following(i17);
                if (following == -1) {
                    return null;
                }
                return c(i17, following);
            }
            java.text.BreakIterator breakIterator3 = this.f92053c;
            if (breakIterator3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                throw null;
            }
            i17 = breakIterator3.following(i17);
        } while (i17 != -1);
        return null;
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
        do {
            java.text.BreakIterator breakIterator = this.f92053c;
            if (breakIterator == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i17)) {
                java.text.BreakIterator breakIterator2 = this.f92053c;
                if (breakIterator2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                    throw null;
                }
                int preceding = breakIterator2.preceding(i17);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i17);
            }
            java.text.BreakIterator breakIterator3 = this.f92053c;
            if (breakIterator3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
                throw null;
            }
            i17 = breakIterator3.preceding(i17);
        } while (i17 != -1);
        return null;
    }

    public void e(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f92044a = text;
        java.text.BreakIterator breakIterator = this.f92053c;
        if (breakIterator != null) {
            breakIterator.setText(text);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("impl");
            throw null;
        }
    }
}

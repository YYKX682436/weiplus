package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class h extends androidx.compose.ui.platform.b {

    /* renamed from: d, reason: collision with root package name */
    public static androidx.compose.ui.platform.h f10573d;

    /* renamed from: c, reason: collision with root package name */
    public java.text.BreakIterator f10574c;

    public h(java.util.Locale locale, kotlin.jvm.internal.i iVar) {
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        kotlin.jvm.internal.o.f(wordInstance, "getWordInstance(locale)");
        this.f10574c = wordInstance;
    }

    @Override // androidx.compose.ui.platform.g
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
            java.text.BreakIterator breakIterator = this.f10574c;
            if (breakIterator == null) {
                kotlin.jvm.internal.o.o("impl");
                throw null;
            }
            i17 = breakIterator.following(i17);
            if (i17 == -1) {
                return null;
            }
        }
        java.text.BreakIterator breakIterator2 = this.f10574c;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.o.o("impl");
            throw null;
        }
        int following = breakIterator2.following(i17);
        if (following == -1 || !f(following)) {
            return null;
        }
        return c(i17, following);
    }

    @Override // androidx.compose.ui.platform.g
    public int[] b(int i17) {
        int length = d().length();
        if (length <= 0 || i17 <= 0) {
            return null;
        }
        if (i17 > length) {
            i17 = length;
        }
        while (i17 > 0 && !g(i17 - 1) && !f(i17)) {
            java.text.BreakIterator breakIterator = this.f10574c;
            if (breakIterator == null) {
                kotlin.jvm.internal.o.o("impl");
                throw null;
            }
            i17 = breakIterator.preceding(i17);
            if (i17 == -1) {
                return null;
            }
        }
        java.text.BreakIterator breakIterator2 = this.f10574c;
        if (breakIterator2 == null) {
            kotlin.jvm.internal.o.o("impl");
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
        kotlin.jvm.internal.o.g(text, "text");
        this.f10511a = text;
        java.text.BreakIterator breakIterator = this.f10574c;
        if (breakIterator != null) {
            breakIterator.setText(text);
        } else {
            kotlin.jvm.internal.o.o("impl");
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

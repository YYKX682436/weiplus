package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public class c extends androidx.compose.ui.platform.b {

    /* renamed from: d, reason: collision with root package name */
    public static androidx.compose.ui.platform.c f10519d;

    /* renamed from: c, reason: collision with root package name */
    public java.text.BreakIterator f10520c;

    public c(java.util.Locale locale, kotlin.jvm.internal.i iVar) {
        java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance(locale);
        kotlin.jvm.internal.o.f(characterInstance, "getCharacterInstance(locale)");
        this.f10520c = characterInstance;
    }

    @Override // androidx.compose.ui.platform.g
    public int[] a(int i17) {
        int length = d().length();
        if (length <= 0 || i17 >= length) {
            return null;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        do {
            java.text.BreakIterator breakIterator = this.f10520c;
            if (breakIterator == null) {
                kotlin.jvm.internal.o.o("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i17)) {
                java.text.BreakIterator breakIterator2 = this.f10520c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.o.o("impl");
                    throw null;
                }
                int following = breakIterator2.following(i17);
                if (following == -1) {
                    return null;
                }
                return c(i17, following);
            }
            java.text.BreakIterator breakIterator3 = this.f10520c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.o.o("impl");
                throw null;
            }
            i17 = breakIterator3.following(i17);
        } while (i17 != -1);
        return null;
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
        do {
            java.text.BreakIterator breakIterator = this.f10520c;
            if (breakIterator == null) {
                kotlin.jvm.internal.o.o("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i17)) {
                java.text.BreakIterator breakIterator2 = this.f10520c;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.o.o("impl");
                    throw null;
                }
                int preceding = breakIterator2.preceding(i17);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i17);
            }
            java.text.BreakIterator breakIterator3 = this.f10520c;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.o.o("impl");
                throw null;
            }
            i17 = breakIterator3.preceding(i17);
        } while (i17 != -1);
        return null;
    }

    public void e(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f10511a = text;
        java.text.BreakIterator breakIterator = this.f10520c;
        if (breakIterator != null) {
            breakIterator.setText(text);
        } else {
            kotlin.jvm.internal.o.o("impl");
            throw null;
        }
    }
}

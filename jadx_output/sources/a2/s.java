package a2;

/* loaded from: classes14.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final a2.s f807b = new a2.s(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f808a;

    public s(boolean z17) {
        this.f808a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2.s) {
            return this.f808a == ((a2.s) obj).f808a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f808a);
    }

    public java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f808a + ')';
    }
}

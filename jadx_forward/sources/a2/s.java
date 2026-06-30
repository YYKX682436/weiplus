package a2;

/* loaded from: classes14.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final a2.s f82340b = new a2.s(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82341a;

    public s(boolean z17) {
        this.f82341a = z17;
    }

    /* renamed from: equals */
    public boolean m400xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2.s) {
            return this.f82341a == ((a2.s) obj).f82341a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m401x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f82341a);
    }

    /* renamed from: toString */
    public java.lang.String m402x9616526c() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f82341a + ')';
    }
}

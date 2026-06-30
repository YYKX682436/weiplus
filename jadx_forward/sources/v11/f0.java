package v11;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f513908a;

    public f0(int i17) {
        this.f513908a = i17;
    }

    /* renamed from: equals */
    public boolean m170884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.f0) && this.f513908a == ((v11.f0) obj).f513908a;
    }

    /* renamed from: hashCode */
    public int m170885x8cdac1b() {
        return java.lang.Integer.hashCode(this.f513908a);
    }

    /* renamed from: toString */
    public java.lang.String m170886x9616526c() {
        return "NativeMarkdownSpacingConfig(blockSpacingPx=" + this.f513908a + ')';
    }
}

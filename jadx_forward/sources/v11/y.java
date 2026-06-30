package v11;

/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f514021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f514022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f514023c;

    public y(int i17, int i18, int i19) {
        this.f514021a = i17;
        this.f514022b = i18;
        this.f514023c = i19;
    }

    /* renamed from: equals */
    public boolean m170964xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.y)) {
            return false;
        }
        v11.y yVar = (v11.y) obj;
        return this.f514021a == yVar.f514021a && this.f514022b == yVar.f514022b && this.f514023c == yVar.f514023c;
    }

    /* renamed from: hashCode */
    public int m170965x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f514021a) * 31) + java.lang.Integer.hashCode(this.f514022b)) * 31) + java.lang.Integer.hashCode(this.f514023c);
    }

    /* renamed from: toString */
    public java.lang.String m170966x9616526c() {
        return "NativeMarkdownDividerConfig(heightPx=" + this.f514021a + ", color=" + this.f514022b + ", paddingVerticalPx=" + this.f514023c + ')';
    }
}

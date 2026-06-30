package gk1;

/* loaded from: classes7.dex */
public final class e extends gk1.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f353995a;

    public e(int i17) {
        super(null);
        this.f353995a = i17;
    }

    /* renamed from: equals */
    public boolean m131700xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk1.e) && this.f353995a == ((gk1.e) obj).f353995a;
    }

    /* renamed from: hashCode */
    public int m131701x8cdac1b() {
        return java.lang.Integer.hashCode(this.f353995a);
    }

    /* renamed from: toString */
    public java.lang.String m131702x9616526c() {
        return "LESS(version=" + this.f353995a + ')';
    }
}

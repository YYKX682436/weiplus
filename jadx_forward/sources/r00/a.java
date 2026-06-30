package r00;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f449529a;

    public a(int i17) {
        this.f449529a = i17;
    }

    /* renamed from: equals */
    public boolean m161172xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r00.a) && this.f449529a == ((r00.a) obj).f449529a;
    }

    /* renamed from: hashCode */
    public int m161173x8cdac1b() {
        return java.lang.Integer.hashCode(this.f449529a);
    }

    /* renamed from: toString */
    public java.lang.String m161174x9616526c() {
        return "EcsGetImageColorResult(color=" + this.f449529a + ')';
    }
}

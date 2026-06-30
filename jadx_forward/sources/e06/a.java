package e06;

/* loaded from: classes13.dex */
public abstract class a implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final char f327731d;

    /* renamed from: e, reason: collision with root package name */
    public final char f327732e;

    /* renamed from: f, reason: collision with root package name */
    public final int f327733f;

    public a(char c17, char c18, int i17) {
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i17 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f327731d = c17;
        this.f327732e = (char) sz5.b.a(c17, c18, i17);
        this.f327733f = i17;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new e06.b(this.f327731d, this.f327732e, this.f327733f);
    }
}

package m8;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final m8.y f406211d = new m8.y(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f406212a;

    /* renamed from: b, reason: collision with root package name */
    public final float f406213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406214c;

    public y(float f17, float f18) {
        this.f406212a = f17;
        this.f406213b = f18;
        this.f406214c = java.lang.Math.round(f17 * 1000.0f);
    }

    /* renamed from: equals */
    public boolean m146936xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m8.y.class != obj.getClass()) {
            return false;
        }
        m8.y yVar = (m8.y) obj;
        return this.f406212a == yVar.f406212a && this.f406213b == yVar.f406213b;
    }

    /* renamed from: hashCode */
    public int m146937x8cdac1b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + java.lang.Float.floatToRawIntBits(this.f406212a)) * 31) + java.lang.Float.floatToRawIntBits(this.f406213b);
    }
}

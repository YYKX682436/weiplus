package r1;

/* loaded from: classes5.dex */
public final class d implements m1.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f450104a;

    /* renamed from: b, reason: collision with root package name */
    public final float f450105b;

    /* renamed from: c, reason: collision with root package name */
    public final long f450106c;

    public d(float f17, float f18, long j17) {
        this.f450104a = f17;
        this.f450105b = f18;
        this.f450106c = j17;
    }

    /* renamed from: equals */
    public boolean m161265xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof r1.d)) {
            return false;
        }
        r1.d dVar = (r1.d) obj;
        if (dVar.f450104a == this.f450104a) {
            return ((dVar.f450105b > this.f450105b ? 1 : (dVar.f450105b == this.f450105b ? 0 : -1)) == 0) && dVar.f450106c == this.f450106c;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m161266x8cdac1b() {
        return ((((0 + java.lang.Float.hashCode(this.f450104a)) * 31) + java.lang.Float.hashCode(this.f450105b)) * 31) + java.lang.Long.hashCode(this.f450106c);
    }

    /* renamed from: toString */
    public java.lang.String m161267x9616526c() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f450104a + ",horizontalScrollPixels=" + this.f450105b + ",uptimeMillis=" + this.f450106c + ')';
    }
}

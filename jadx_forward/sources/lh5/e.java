package lh5;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f400260a;

    /* renamed from: b, reason: collision with root package name */
    public final long f400261b;

    /* renamed from: c, reason: collision with root package name */
    public final long f400262c;

    public e(float f17, long j17, long j18) {
        this.f400260a = f17;
        this.f400261b = j17;
        this.f400262c = j18;
    }

    /* renamed from: equals */
    public boolean m145784xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh5.e)) {
            return false;
        }
        lh5.e eVar = (lh5.e) obj;
        return java.lang.Float.compare(this.f400260a, eVar.f400260a) == 0 && this.f400261b == eVar.f400261b && this.f400262c == eVar.f400262c;
    }

    /* renamed from: hashCode */
    public int m145785x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f400260a) * 31) + java.lang.Long.hashCode(this.f400261b)) * 31) + java.lang.Long.hashCode(this.f400262c);
    }

    /* renamed from: toString */
    public java.lang.String m145786x9616526c() {
        return "RotateAnimationPara(degree=" + this.f400260a + ", duration=" + this.f400261b + ", startOffset=" + this.f400262c + ')';
    }
}

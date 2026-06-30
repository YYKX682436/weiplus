package sl5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f490831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f490832b;

    /* renamed from: c, reason: collision with root package name */
    public final long f490833c;

    /* renamed from: d, reason: collision with root package name */
    public final int f490834d;

    /* renamed from: e, reason: collision with root package name */
    public final float f490835e;

    public e(int i17, int i18, long j17, int i19, float f17) {
        this.f490831a = i17;
        this.f490832b = i18;
        this.f490833c = j17;
        this.f490834d = i19;
        this.f490835e = f17;
    }

    /* renamed from: equals */
    public boolean m164785xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl5.e)) {
            return false;
        }
        sl5.e eVar = (sl5.e) obj;
        return this.f490831a == eVar.f490831a && this.f490832b == eVar.f490832b && this.f490833c == eVar.f490833c && this.f490834d == eVar.f490834d && java.lang.Float.compare(this.f490835e, eVar.f490835e) == 0;
    }

    /* renamed from: hashCode */
    public int m164786x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f490831a) * 31) + java.lang.Integer.hashCode(this.f490832b)) * 31) + java.lang.Long.hashCode(this.f490833c)) * 31) + java.lang.Integer.hashCode(this.f490834d)) * 31) + java.lang.Float.hashCode(this.f490835e);
    }

    /* renamed from: toString */
    public java.lang.String m164787x9616526c() {
        return "Candidate(position=" + this.f490831a + ", offset=" + this.f490832b + ", stableId=" + this.f490833c + ", spanIndex=" + this.f490834d + ", yDistToCenter=" + this.f490835e + ')';
    }
}

package zc5;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f552977a;

    /* renamed from: b, reason: collision with root package name */
    public final long f552978b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f552979c;

    public g(long j17, long j18, boolean z17) {
        this.f552977a = j17;
        this.f552978b = j18;
        this.f552979c = z17;
    }

    /* renamed from: equals */
    public boolean m178694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc5.g)) {
            return false;
        }
        zc5.g gVar = (zc5.g) obj;
        return this.f552977a == gVar.f552977a && this.f552978b == gVar.f552978b && this.f552979c == gVar.f552979c;
    }

    /* renamed from: hashCode */
    public int m178695x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f552977a) * 31) + java.lang.Long.hashCode(this.f552978b)) * 31) + java.lang.Boolean.hashCode(this.f552979c);
    }

    /* renamed from: toString */
    public java.lang.String m178696x9616526c() {
        return "MediaSizes(compressedSize=" + this.f552977a + ", originSize=" + this.f552978b + ", hasExpired=" + this.f552979c + ')';
    }
}

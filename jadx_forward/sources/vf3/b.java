package vf3;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f517898a;

    /* renamed from: b, reason: collision with root package name */
    public final long f517899b;

    /* renamed from: c, reason: collision with root package name */
    public final long f517900c;

    /* renamed from: d, reason: collision with root package name */
    public final long f517901d;

    /* renamed from: e, reason: collision with root package name */
    public final long f517902e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f517903f;

    public b(long j17, long j18, long j19, long j27, long j28, boolean z17) {
        this.f517898a = j17;
        this.f517899b = j18;
        this.f517900c = j19;
        this.f517901d = j27;
        this.f517902e = j28;
        this.f517903f = z17;
    }

    /* renamed from: equals */
    public boolean m171834xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf3.b)) {
            return false;
        }
        vf3.b bVar = (vf3.b) obj;
        return this.f517898a == bVar.f517898a && this.f517899b == bVar.f517899b && this.f517900c == bVar.f517900c && this.f517901d == bVar.f517901d && this.f517902e == bVar.f517902e && this.f517903f == bVar.f517903f;
    }

    /* renamed from: hashCode */
    public int m171835x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f517898a) * 31) + java.lang.Long.hashCode(this.f517899b)) * 31) + java.lang.Long.hashCode(this.f517900c)) * 31) + java.lang.Long.hashCode(this.f517901d)) * 31) + java.lang.Long.hashCode(this.f517902e)) * 31) + java.lang.Boolean.hashCode(this.f517903f);
    }

    /* renamed from: toString */
    public java.lang.String m171836x9616526c() {
        return "LiveCDNInfo(imageFileLen=" + this.f517898a + ", imageHDFileLen=" + this.f517899b + ", videoFileLen=" + this.f517900c + ", videoHDFileLen=" + this.f517901d + ", coverTimeStamp=" + this.f517902e + ", isHDExpired=" + this.f517903f + ')';
    }

    public /* synthetic */ b(long j17, long j18, long j19, long j27, long j28, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0L : j17, (i17 & 2) != 0 ? 0L : j18, (i17 & 4) != 0 ? 0L : j19, (i17 & 8) != 0 ? 0L : j27, (i17 & 16) == 0 ? j28 : 0L, (i17 & 32) != 0 ? false : z17);
    }
}

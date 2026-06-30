package sf4;

/* loaded from: classes4.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f489089a;

    /* renamed from: b, reason: collision with root package name */
    public final long f489090b;

    /* renamed from: c, reason: collision with root package name */
    public final long f489091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f489092d;

    public p1(boolean z17, long j17, long j18, boolean z18) {
        this.f489089a = z17;
        this.f489090b = j17;
        this.f489091c = j18;
        this.f489092d = z18;
    }

    /* renamed from: equals */
    public boolean m164411xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf4.p1)) {
            return false;
        }
        sf4.p1 p1Var = (sf4.p1) obj;
        return this.f489089a == p1Var.f489089a && this.f489090b == p1Var.f489090b && this.f489091c == p1Var.f489091c && this.f489092d == p1Var.f489092d;
    }

    /* renamed from: hashCode */
    public int m164412x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f489089a) * 31) + java.lang.Long.hashCode(this.f489090b)) * 31) + java.lang.Long.hashCode(this.f489091c)) * 31) + java.lang.Boolean.hashCode(this.f489092d);
    }

    /* renamed from: toString */
    public java.lang.String m164413x9616526c() {
        return "MoovReadyInfo(isMoovReady=" + this.f489089a + ", offset=" + this.f489090b + ", length=" + this.f489091c + ", preloadFinish=" + this.f489092d + ')';
    }
}

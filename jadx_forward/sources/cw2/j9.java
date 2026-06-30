package cw2;

/* loaded from: classes10.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public long f305323a;

    /* renamed from: b, reason: collision with root package name */
    public int f305324b;

    /* renamed from: c, reason: collision with root package name */
    public int f305325c;

    /* renamed from: d, reason: collision with root package name */
    public int f305326d;

    public j9(long j17, int i17, int i18, int i19) {
        this.f305323a = j17;
        this.f305324b = i17;
        this.f305325c = i18;
        this.f305326d = i19;
    }

    /* renamed from: equals */
    public boolean m122893xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.j9)) {
            return false;
        }
        cw2.j9 j9Var = (cw2.j9) obj;
        return this.f305323a == j9Var.f305323a && this.f305324b == j9Var.f305324b && this.f305325c == j9Var.f305325c && this.f305326d == j9Var.f305326d;
    }

    /* renamed from: hashCode */
    public int m122894x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f305323a) * 31) + java.lang.Integer.hashCode(this.f305324b)) * 31) + java.lang.Integer.hashCode(this.f305325c)) * 31) + java.lang.Integer.hashCode(this.f305326d);
    }

    /* renamed from: toString */
    public java.lang.String m122895x9616526c() {
        return "PlayTaskResult(hitPreloadSize=" + this.f305323a + ", notStartDownloaderInPlayCount=" + this.f305324b + ", lessMinBufferCount=" + this.f305325c + ", preloadCount=" + this.f305326d + ')';
    }
}

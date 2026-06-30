package zs2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f556785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f556787c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f556788d;

    public e(long j17, int i17, int i18, boolean z17) {
        this.f556785a = j17;
        this.f556786b = i17;
        this.f556787c = i18;
        this.f556788d = z17;
    }

    /* renamed from: equals */
    public boolean m179376xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs2.e)) {
            return false;
        }
        zs2.e eVar = (zs2.e) obj;
        return this.f556785a == eVar.f556785a && this.f556786b == eVar.f556786b && this.f556787c == eVar.f556787c && this.f556788d == eVar.f556788d;
    }

    /* renamed from: hashCode */
    public int m179377x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f556785a) * 31) + java.lang.Integer.hashCode(this.f556786b)) * 31) + java.lang.Integer.hashCode(this.f556787c)) * 31) + java.lang.Boolean.hashCode(this.f556788d);
    }

    /* renamed from: toString */
    public java.lang.String m179378x9616526c() {
        return "liveId:" + this.f556785a + ", playOffset:" + this.f556786b + ",totalDuration:" + this.f556787c + ",forceReq:" + this.f556788d;
    }
}

package dk2;

/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    public final long f314775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f314776b;

    public b8(long j17, int i17) {
        this.f314775a = j17;
        this.f314776b = i17;
    }

    /* renamed from: equals */
    public boolean m124544xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.b8)) {
            return false;
        }
        dk2.b8 b8Var = (dk2.b8) obj;
        return this.f314775a == b8Var.f314775a && this.f314776b == b8Var.f314776b;
    }

    /* renamed from: hashCode */
    public int m124545x8cdac1b() {
        return (java.lang.Long.hashCode(this.f314775a) * 31) + java.lang.Integer.hashCode(this.f314776b);
    }

    /* renamed from: toString */
    public java.lang.String m124546x9616526c() {
        return "FinderLiveInviteData(timeOut=" + this.f314775a + ", invitePos=" + this.f314776b + ')';
    }
}

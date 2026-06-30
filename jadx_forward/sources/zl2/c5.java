package zl2;

/* loaded from: classes3.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public long f555237a;

    /* renamed from: b, reason: collision with root package name */
    public long f555238b;

    public c5(long j17, long j18) {
        this.f555237a = j17;
        this.f555238b = j18;
    }

    /* renamed from: equals */
    public boolean m179089xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.c5)) {
            return false;
        }
        zl2.c5 c5Var = (zl2.c5) obj;
        return this.f555237a == c5Var.f555237a && this.f555238b == c5Var.f555238b;
    }

    /* renamed from: hashCode */
    public int m179090x8cdac1b() {
        return (java.lang.Long.hashCode(this.f555237a) * 31) + java.lang.Long.hashCode(this.f555238b);
    }

    /* renamed from: toString */
    public java.lang.String m179091x9616526c() {
        return "QuotaConfig(noticeAmount=" + this.f555237a + ", saveTime=" + this.f555238b + ')';
    }
}

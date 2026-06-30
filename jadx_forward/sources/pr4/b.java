package pr4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f439519a;

    public b(long j17) {
        this.f439519a = j17;
    }

    /* renamed from: equals */
    public boolean m158896xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.b) && this.f439519a == ((pr4.b) obj).f439519a;
    }

    /* renamed from: hashCode */
    public int m158897x8cdac1b() {
        return java.lang.Long.hashCode(this.f439519a);
    }

    /* renamed from: toString */
    public java.lang.String m158898x9616526c() {
        return "ConsumeSuccessResult(balance=" + this.f439519a + ')';
    }
}

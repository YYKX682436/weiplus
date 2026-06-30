package l20;

/* loaded from: classes14.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f396702a;

    /* renamed from: b, reason: collision with root package name */
    public final long f396703b;

    public l0(long j17, long j18) {
        this.f396702a = j17;
        this.f396703b = j18;
    }

    /* renamed from: equals */
    public boolean m144926xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20.l0)) {
            return false;
        }
        l20.l0 l0Var = (l20.l0) obj;
        return this.f396702a == l0Var.f396702a && this.f396703b == l0Var.f396703b;
    }

    /* renamed from: hashCode */
    public int m144927x8cdac1b() {
        return (java.lang.Long.hashCode(this.f396702a) * 31) + java.lang.Long.hashCode(this.f396703b);
    }

    /* renamed from: toString */
    public java.lang.String m144928x9616526c() {
        return "TimePeriod(startTime=" + this.f396702a + ", endTime=" + this.f396703b + ')';
    }

    public /* synthetic */ l0(long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, (i17 & 2) != 0 ? 0L : j18);
    }
}

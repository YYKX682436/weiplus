package qk;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f445848a;

    /* renamed from: b, reason: collision with root package name */
    public final long f445849b;

    /* renamed from: c, reason: collision with root package name */
    public final long f445850c;

    public q(long j17, long j18, long j19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 300000L : j17;
        j18 = (i17 & 2) != 0 ? 3000L : j18;
        j19 = (i17 & 4) != 0 ? 1000L : j19;
        this.f445848a = j17;
        this.f445849b = j18;
        this.f445850c = j19;
    }

    /* renamed from: equals */
    public boolean m160407xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk.q)) {
            return false;
        }
        qk.q qVar = (qk.q) obj;
        return this.f445848a == qVar.f445848a && this.f445849b == qVar.f445849b && this.f445850c == qVar.f445850c;
    }

    /* renamed from: hashCode */
    public int m160408x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f445848a) * 31) + java.lang.Long.hashCode(this.f445849b)) * 31) + java.lang.Long.hashCode(this.f445850c);
    }

    /* renamed from: toString */
    public java.lang.String m160409x9616526c() {
        return "DelayReleaseConfig(inactiveDelayMs=" + this.f445848a + ", backgroundDelayMs=" + this.f445849b + ", deepBackgroundDelayMs=" + this.f445850c + ')';
    }
}

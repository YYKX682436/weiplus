package uj;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f509696a;

    /* renamed from: b, reason: collision with root package name */
    public final long f509697b;

    public l(long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        this.f509696a = j17;
        this.f509697b = j18;
    }

    /* renamed from: equals */
    public boolean m168098xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj.l)) {
            return false;
        }
        uj.l lVar = (uj.l) obj;
        return this.f509696a == lVar.f509696a && this.f509697b == lVar.f509697b;
    }

    /* renamed from: hashCode */
    public int m168099x8cdac1b() {
        return (java.lang.Long.hashCode(this.f509696a) * 31) + java.lang.Long.hashCode(this.f509697b);
    }

    /* renamed from: toString */
    public java.lang.String m168100x9616526c() {
        return "Info(initTime=" + this.f509696a + ", renderStartTime=" + this.f509697b + ')';
    }
}

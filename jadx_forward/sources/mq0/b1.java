package mq0;

/* loaded from: classes7.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public long f412073a;

    /* renamed from: b, reason: collision with root package name */
    public long f412074b;

    /* renamed from: c, reason: collision with root package name */
    public long f412075c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f412076d;

    public b1(long j17, long j18, long j19, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        j19 = (i17 & 4) != 0 ? 0L : j19;
        z17 = (i17 & 8) != 0 ? false : z17;
        this.f412073a = j17;
        this.f412074b = j18;
        this.f412075c = j19;
        this.f412076d = z17;
    }

    /* renamed from: equals */
    public boolean m148196xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0.b1)) {
            return false;
        }
        mq0.b1 b1Var = (mq0.b1) obj;
        return this.f412073a == b1Var.f412073a && this.f412074b == b1Var.f412074b && this.f412075c == b1Var.f412075c && this.f412076d == b1Var.f412076d;
    }

    /* renamed from: hashCode */
    public int m148197x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f412073a) * 31) + java.lang.Long.hashCode(this.f412074b)) * 31) + java.lang.Long.hashCode(this.f412075c)) * 31) + java.lang.Boolean.hashCode(this.f412076d);
    }

    /* renamed from: toString */
    public java.lang.String m148198x9616526c() {
        return "Info(initTime=" + this.f412073a + ", renderStartTime=" + this.f412074b + ", exposeTime=" + this.f412075c + ", preloadDone=" + this.f412076d + ')';
    }
}

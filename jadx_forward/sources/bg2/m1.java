package bg2;

/* loaded from: classes2.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.t12 f101829a;

    /* renamed from: b, reason: collision with root package name */
    public final long f101830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101831c;

    public m1(r45.t12 msg, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f101829a = msg;
        this.f101830b = j17;
        this.f101831c = i17;
    }

    /* renamed from: equals */
    public boolean m10409xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2.m1)) {
            return false;
        }
        bg2.m1 m1Var = (bg2.m1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f101829a, m1Var.f101829a) && this.f101830b == m1Var.f101830b && this.f101831c == m1Var.f101831c;
    }

    /* renamed from: hashCode */
    public int m10410x8cdac1b() {
        return (((this.f101829a.hashCode() * 31) + java.lang.Long.hashCode(this.f101830b)) * 31) + java.lang.Integer.hashCode(this.f101831c);
    }

    /* renamed from: toString */
    public java.lang.String m10411x9616526c() {
        return "FinderLiveMsgWrapper(msg=" + this.f101829a + ", time=" + this.f101830b + ", length=" + this.f101831c + ')';
    }
}

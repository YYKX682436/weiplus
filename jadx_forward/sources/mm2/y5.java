package mm2;

/* loaded from: classes3.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f411107a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.z64 f411108b;

    /* renamed from: c, reason: collision with root package name */
    public final long f411109c;

    public y5(long j17, r45.z64 subsidyInfo, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subsidyInfo, "subsidyInfo");
        this.f411107a = j17;
        this.f411108b = subsidyInfo;
        this.f411109c = j18;
    }

    /* renamed from: equals */
    public boolean m148041xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.y5)) {
            return false;
        }
        mm2.y5 y5Var = (mm2.y5) obj;
        return this.f411107a == y5Var.f411107a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411108b, y5Var.f411108b) && this.f411109c == y5Var.f411109c;
    }

    /* renamed from: hashCode */
    public int m148042x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f411107a) * 31) + this.f411108b.hashCode()) * 31) + java.lang.Long.hashCode(this.f411109c);
    }

    /* renamed from: toString */
    public java.lang.String m148043x9616526c() {
        return "PendingSubsidyAnim(productId=" + this.f411107a + ", subsidyInfo=" + this.f411108b + ", enqueuedAtMs=" + this.f411109c + ')';
    }
}

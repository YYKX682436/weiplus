package fg5;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f344028a;

    /* renamed from: b, reason: collision with root package name */
    public final long f344029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f344030c;

    public a(long j17, long j18, java.lang.String detailString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detailString, "detailString");
        this.f344028a = j17;
        this.f344029b = j18;
        this.f344030c = detailString;
    }

    /* renamed from: equals */
    public boolean m129549xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg5.a)) {
            return false;
        }
        fg5.a aVar = (fg5.a) obj;
        return this.f344028a == aVar.f344028a && this.f344029b == aVar.f344029b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f344030c, aVar.f344030c);
    }

    /* renamed from: hashCode */
    public int m129550x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f344028a) * 31) + java.lang.Long.hashCode(this.f344029b)) * 31) + this.f344030c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129551x9616526c() {
        return "UnreadStat(unreadMsgCount=" + this.f344028a + ", unreadSessCount=" + this.f344029b + ", detailString=" + this.f344030c + ')';
    }
}

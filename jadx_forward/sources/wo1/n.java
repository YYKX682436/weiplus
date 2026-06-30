package wo1;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f529525a;

    /* renamed from: b, reason: collision with root package name */
    public final long f529526b;

    /* renamed from: c, reason: collision with root package name */
    public final long f529527c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f529528d;

    public n(java.lang.String username, long j17, long j18, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f529525a = username;
        this.f529526b = j17;
        this.f529527c = j18;
        this.f529528d = z17;
    }

    /* renamed from: equals */
    public boolean m174224xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo1.n)) {
            return false;
        }
        wo1.n nVar = (wo1.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529525a, nVar.f529525a) && this.f529526b == nVar.f529526b && this.f529527c == nVar.f529527c && this.f529528d == nVar.f529528d;
    }

    /* renamed from: hashCode */
    public int m174225x8cdac1b() {
        return (((((this.f529525a.hashCode() * 31) + java.lang.Long.hashCode(this.f529526b)) * 31) + java.lang.Long.hashCode(this.f529527c)) * 31) + java.lang.Boolean.hashCode(this.f529528d);
    }

    /* renamed from: toString */
    public java.lang.String m174226x9616526c() {
        return "ConvInfo(username=" + this.f529525a + ", lastMsgTime=" + this.f529526b + ", size=" + this.f529527c + ", isSelected=" + this.f529528d + ')';
    }
}

package zo1;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f556293a;

    /* renamed from: b, reason: collision with root package name */
    public final long f556294b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f556295c;

    public s(java.lang.String username, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f556293a = username;
        this.f556294b = j17;
        this.f556295c = z17;
    }

    /* renamed from: equals */
    public boolean m179239xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo1.s)) {
            return false;
        }
        zo1.s sVar = (zo1.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556293a, sVar.f556293a) && this.f556294b == sVar.f556294b && this.f556295c == sVar.f556295c;
    }

    /* renamed from: hashCode */
    public int m179240x8cdac1b() {
        return (((this.f556293a.hashCode() * 31) + java.lang.Long.hashCode(this.f556294b)) * 31) + java.lang.Boolean.hashCode(this.f556295c);
    }

    /* renamed from: toString */
    public java.lang.String m179241x9616526c() {
        return "ConvInfo(username=" + this.f556293a + ", size=" + this.f556294b + ", isSelected=" + this.f556295c + ')';
    }
}

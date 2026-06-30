package co5;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f125375a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f125377c;

    public j(java.lang.String username, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f125375a = username;
        this.f125376b = z17;
        this.f125377c = j17;
    }

    /* renamed from: equals */
    public boolean m15417xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co5.j)) {
            return false;
        }
        co5.j jVar = (co5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125375a, jVar.f125375a) && this.f125376b == jVar.f125376b && this.f125377c == jVar.f125377c;
    }

    /* renamed from: hashCode */
    public int m15418x8cdac1b() {
        return (((this.f125375a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f125376b)) * 31) + java.lang.Long.hashCode(this.f125377c);
    }

    /* renamed from: toString */
    public java.lang.String m15419x9616526c() {
        return "UserSdkInfo(username=" + this.f125375a + ", isILinkMode=" + this.f125376b + ", valuedTime=" + this.f125377c + ')';
    }
}

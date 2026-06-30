package mu4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412956a;

    /* renamed from: b, reason: collision with root package name */
    public final long f412957b;

    public i(java.lang.String appId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f412956a = appId;
        this.f412957b = j17;
    }

    /* renamed from: equals */
    public boolean m148387xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu4.i)) {
            return false;
        }
        mu4.i iVar = (mu4.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f412956a, iVar.f412956a) && this.f412957b == iVar.f412957b;
    }

    /* renamed from: hashCode */
    public int m148388x8cdac1b() {
        return (this.f412956a.hashCode() * 31) + java.lang.Long.hashCode(this.f412957b);
    }

    /* renamed from: toString */
    public java.lang.String m148389x9616526c() {
        return "ClientInfo(appId=" + this.f412956a + ", idKey=" + this.f412957b + ')';
    }
}

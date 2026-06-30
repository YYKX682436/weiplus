package qj5;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445531a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f445532b;

    public r(java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f445531a = username;
        this.f445532b = z17;
    }

    /* renamed from: equals */
    public boolean m160278xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj5.r)) {
            return false;
        }
        qj5.r rVar = (qj5.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445531a, rVar.f445531a) && this.f445532b == rVar.f445532b;
    }

    /* renamed from: hashCode */
    public int m160279x8cdac1b() {
        return (this.f445531a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f445532b);
    }

    /* renamed from: toString */
    public java.lang.String m160280x9616526c() {
        return "ShareTarget(username=" + this.f445531a + ", isChatRoom=" + this.f445532b + ')';
    }
}

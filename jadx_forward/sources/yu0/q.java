package yu0;

/* loaded from: classes5.dex */
public final class q implements yu0.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f547363a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f547364b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f547365c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 f547366d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f547367e;

    public q(java.lang.String text, java.lang.String roleID, java.lang.String roleName, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleName, "roleName");
        this.f547363a = text;
        this.f547364b = roleID;
        this.f547365c = roleName;
        this.f547366d = c4195xcab2df48;
        this.f547367e = obj;
    }

    /* renamed from: equals */
    public boolean m177679xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.q)) {
            return false;
        }
        yu0.q qVar = (yu0.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547363a, qVar.f547363a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547364b, qVar.f547364b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547365c, qVar.f547365c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547366d, qVar.f547366d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547367e, qVar.f547367e);
    }

    /* renamed from: hashCode */
    public int m177680x8cdac1b() {
        int hashCode = ((((this.f547363a.hashCode() * 31) + this.f547364b.hashCode()) * 31) + this.f547365c.hashCode()) * 31;
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48 = this.f547366d;
        int hashCode2 = (hashCode + (c4195xcab2df48 == null ? 0 : c4195xcab2df48.hashCode())) * 31;
        java.lang.Object obj = this.f547367e;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m177681x9616526c() {
        return "TTSTaskResponse(text=" + this.f547363a + ", roleID=" + this.f547364b + ", roleName=" + this.f547365c + ", response=" + this.f547366d + ", identity=" + this.f547367e + ')';
    }
}

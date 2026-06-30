package yu0;

/* loaded from: classes5.dex */
public final class p implements yu0.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f547359a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f547360b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f547361c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f547362d;

    public p(java.lang.String text, java.lang.String roleID, java.lang.String roleName, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleName, "roleName");
        this.f547359a = text;
        this.f547360b = roleID;
        this.f547361c = roleName;
        this.f547362d = obj;
    }

    /* renamed from: equals */
    public boolean m177676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.p)) {
            return false;
        }
        yu0.p pVar = (yu0.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547359a, pVar.f547359a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547360b, pVar.f547360b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547361c, pVar.f547361c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547362d, pVar.f547362d);
    }

    /* renamed from: hashCode */
    public int m177677x8cdac1b() {
        int hashCode = ((((this.f547359a.hashCode() * 31) + this.f547360b.hashCode()) * 31) + this.f547361c.hashCode()) * 31;
        java.lang.Object obj = this.f547362d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m177678x9616526c() {
        return "TTSTaskRequest(text=" + this.f547359a + ", roleID=" + this.f547360b + ", roleName=" + this.f547361c + ", identity=" + this.f547362d + ')';
    }
}

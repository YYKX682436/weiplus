package jq5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f382812a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f382813b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f382814c;

    public m(java.lang.String name, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f382812a = name;
        this.f382813b = str;
        this.f382814c = str2;
    }

    /* renamed from: equals */
    public boolean m141240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq5.m)) {
            return false;
        }
        jq5.m mVar = (jq5.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382812a, mVar.f382812a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382813b, mVar.f382813b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382814c, mVar.f382814c);
    }

    /* renamed from: hashCode */
    public int m141241x8cdac1b() {
        int hashCode = this.f382812a.hashCode() * 31;
        java.lang.String str = this.f382813b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f382814c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141242x9616526c() {
        return "RequiredPermission(name=" + this.f382812a + ", reason=" + this.f382813b + ", requestGuide=" + this.f382814c + ')';
    }
}

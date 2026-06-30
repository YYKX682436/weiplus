package oc3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425862a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f425863b;

    public b(java.lang.String version, java.lang.String provider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(provider, "provider");
        this.f425862a = version;
        this.f425863b = provider;
    }

    /* renamed from: equals */
    public boolean m151029xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3.b)) {
            return false;
        }
        oc3.b bVar = (oc3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425862a, bVar.f425862a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425863b, bVar.f425863b);
    }

    /* renamed from: hashCode */
    public int m151030x8cdac1b() {
        return (this.f425862a.hashCode() * 31) + this.f425863b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151031x9616526c() {
        return "MBBizConfigProviderInfo(version=" + this.f425862a + ", provider=" + this.f425863b + ')';
    }
}

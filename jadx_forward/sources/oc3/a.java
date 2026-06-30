package oc3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final oc3.a f425859c = new oc3.a(new java.util.HashMap(), new java.util.HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f425860a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f425861b;

    public a(java.util.Map plugins, java.util.Map publicServices) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugins, "plugins");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publicServices, "publicServices");
        this.f425860a = plugins;
        this.f425861b = publicServices;
    }

    /* renamed from: equals */
    public boolean m151026xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3.a)) {
            return false;
        }
        oc3.a aVar = (oc3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425860a, aVar.f425860a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425861b, aVar.f425861b);
    }

    /* renamed from: hashCode */
    public int m151027x8cdac1b() {
        return (this.f425860a.hashCode() * 31) + this.f425861b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151028x9616526c() {
        return "MBBizConfigInfo(plugins=" + this.f425860a + ", publicServices=" + this.f425861b + ')';
    }
}

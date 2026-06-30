package cv0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final cv0.e f304063c;

    /* renamed from: d, reason: collision with root package name */
    public static final cv0.e f304064d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f304065a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f304066b;

    static {
        kz5.p0 p0Var = kz5.p0.f395529d;
        f304063c = new cv0.e(p0Var, "EMPTY");
        f304064d = new cv0.e(p0Var, com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7429x859b4284);
    }

    public e(java.util.List options, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f304065a = options;
        this.f304066b = name;
    }

    /* renamed from: equals */
    public boolean m122777xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0.e)) {
            return false;
        }
        cv0.e eVar = (cv0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304065a, eVar.f304065a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304066b, eVar.f304066b);
    }

    /* renamed from: hashCode */
    public int m122778x8cdac1b() {
        return (this.f304065a.hashCode() * 31) + this.f304066b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m122779x9616526c() {
        return "HandleBoxShowOption(options=" + this.f304065a + ", name=" + this.f304066b + ')';
    }
}

package bn0;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f104301a;

    /* renamed from: b, reason: collision with root package name */
    public int f104302b;

    /* renamed from: c, reason: collision with root package name */
    public int f104303c;

    /* renamed from: d, reason: collision with root package name */
    public int f104304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f104305e;

    public a(int i17, int i18, int i19, int i27, java.lang.String enterpriseFather) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterpriseFather, "enterpriseFather");
        this.f104301a = i17;
        this.f104302b = i18;
        this.f104303c = i19;
        this.f104304d = i27;
        this.f104305e = enterpriseFather;
    }

    /* renamed from: equals */
    public boolean m10851xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0.a)) {
            return false;
        }
        bn0.a aVar = (bn0.a) obj;
        return this.f104301a == aVar.f104301a && this.f104302b == aVar.f104302b && this.f104303c == aVar.f104303c && this.f104304d == aVar.f104304d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104305e, aVar.f104305e);
    }

    /* renamed from: hashCode */
    public int m10852x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f104301a) * 31) + java.lang.Integer.hashCode(this.f104302b)) * 31) + java.lang.Integer.hashCode(this.f104303c)) * 31) + java.lang.Integer.hashCode(this.f104304d)) * 31) + this.f104305e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m10853x9616526c() {
        return "LightPushContactData(verifyFlag=" + this.f104301a + ", type=" + this.f104302b + ", bizType=" + this.f104303c + ", chatroomNotify=" + this.f104304d + ", enterpriseFather=" + this.f104305e + ')';
    }
}

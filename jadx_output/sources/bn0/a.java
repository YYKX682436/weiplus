package bn0;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f22768a;

    /* renamed from: b, reason: collision with root package name */
    public int f22769b;

    /* renamed from: c, reason: collision with root package name */
    public int f22770c;

    /* renamed from: d, reason: collision with root package name */
    public int f22771d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f22772e;

    public a(int i17, int i18, int i19, int i27, java.lang.String enterpriseFather) {
        kotlin.jvm.internal.o.g(enterpriseFather, "enterpriseFather");
        this.f22768a = i17;
        this.f22769b = i18;
        this.f22770c = i19;
        this.f22771d = i27;
        this.f22772e = enterpriseFather;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0.a)) {
            return false;
        }
        bn0.a aVar = (bn0.a) obj;
        return this.f22768a == aVar.f22768a && this.f22769b == aVar.f22769b && this.f22770c == aVar.f22770c && this.f22771d == aVar.f22771d && kotlin.jvm.internal.o.b(this.f22772e, aVar.f22772e);
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f22768a) * 31) + java.lang.Integer.hashCode(this.f22769b)) * 31) + java.lang.Integer.hashCode(this.f22770c)) * 31) + java.lang.Integer.hashCode(this.f22771d)) * 31) + this.f22772e.hashCode();
    }

    public java.lang.String toString() {
        return "LightPushContactData(verifyFlag=" + this.f22768a + ", type=" + this.f22769b + ", bizType=" + this.f22770c + ", chatroomNotify=" + this.f22771d + ", enterpriseFather=" + this.f22772e + ')';
    }
}

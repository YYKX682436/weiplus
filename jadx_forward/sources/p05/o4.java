package p05;

/* loaded from: classes14.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432166a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f432168c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432169d;

    public o4(java.lang.String id6, java.lang.String driver, int i17, java.lang.String resourcePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(driver, "driver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourcePath, "resourcePath");
        this.f432166a = id6;
        this.f432167b = driver;
        this.f432168c = i17;
        this.f432169d = resourcePath;
    }

    /* renamed from: equals */
    public boolean m157593xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.o4)) {
            return false;
        }
        p05.o4 o4Var = (p05.o4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432166a, o4Var.f432166a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432167b, o4Var.f432167b) && this.f432168c == o4Var.f432168c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432169d, o4Var.f432169d);
    }

    /* renamed from: hashCode */
    public int m157594x8cdac1b() {
        return (((((this.f432166a.hashCode() * 31) + this.f432167b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f432168c)) * 31) + this.f432169d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157595x9616526c() {
        return "XEffectConfigV2(id=" + this.f432166a + ", driver=" + this.f432167b + ", value=" + this.f432168c + ", resourcePath=" + this.f432169d + ')';
    }
}

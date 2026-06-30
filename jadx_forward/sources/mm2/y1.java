package mm2;

/* loaded from: classes3.dex */
public final class y1 {

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.w1 f411084e = new mm2.w1(null);

    /* renamed from: a, reason: collision with root package name */
    public mm2.e2 f411085a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f411086b;

    /* renamed from: c, reason: collision with root package name */
    public final mm2.z1 f411087c;

    /* renamed from: d, reason: collision with root package name */
    public final mm2.c2 f411088d;

    public y1(mm2.e2 commentMode, boolean z17, mm2.z1 danmakuConfig, mm2.c2 speed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentMode, "commentMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuConfig, "danmakuConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(speed, "speed");
        this.f411085a = commentMode;
        this.f411086b = z17;
        this.f411087c = danmakuConfig;
        this.f411088d = speed;
    }

    /* renamed from: equals */
    public boolean m148038xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.y1)) {
            return false;
        }
        mm2.y1 y1Var = (mm2.y1) obj;
        return this.f411085a == y1Var.f411085a && this.f411086b == y1Var.f411086b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411087c, y1Var.f411087c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411088d, y1Var.f411088d);
    }

    /* renamed from: hashCode */
    public int m148039x8cdac1b() {
        return (((((this.f411085a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f411086b)) * 31) + this.f411087c.m148046x8cdac1b()) * 31) + this.f411088d.m147914x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m148040x9616526c() {
        return "Config(commentMode=" + this.f411085a + ", enablePrivilegeFloatMsg=" + this.f411086b + ", danmakuConfig=" + this.f411087c + ", speed=" + this.f411088d + ')';
    }
}

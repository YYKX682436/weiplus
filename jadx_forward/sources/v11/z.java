package v11;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final v11.a0 f514024a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.a0 f514025b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.a0 f514026c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.a0 f514027d;

    /* renamed from: e, reason: collision with root package name */
    public final v11.a0 f514028e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.a0 f514029f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f514030g;

    /* renamed from: h, reason: collision with root package name */
    public final float f514031h;

    public z(v11.a0 h17, v11.a0 h27, v11.a0 h37, v11.a0 h47, v11.a0 h57, v11.a0 h66, boolean z17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h17, "h1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h27, "h2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h37, "h3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h47, "h4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h57, "h5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h66, "h6");
        this.f514024a = h17;
        this.f514025b = h27;
        this.f514026c = h37;
        this.f514027d = h47;
        this.f514028e = h57;
        this.f514029f = h66;
        this.f514030g = z17;
        this.f514031h = f17;
    }

    public static v11.z a(v11.z zVar, v11.a0 a0Var, v11.a0 a0Var2, v11.a0 a0Var3, v11.a0 a0Var4, v11.a0 a0Var5, v11.a0 a0Var6, boolean z17, float f17, int i17, java.lang.Object obj) {
        v11.a0 h17 = (i17 & 1) != 0 ? zVar.f514024a : a0Var;
        v11.a0 h27 = (i17 & 2) != 0 ? zVar.f514025b : a0Var2;
        v11.a0 h37 = (i17 & 4) != 0 ? zVar.f514026c : a0Var3;
        v11.a0 h47 = (i17 & 8) != 0 ? zVar.f514027d : a0Var4;
        v11.a0 h57 = (i17 & 16) != 0 ? zVar.f514028e : a0Var5;
        v11.a0 h66 = (i17 & 32) != 0 ? zVar.f514029f : a0Var6;
        boolean z18 = (i17 & 64) != 0 ? zVar.f514030g : z17;
        float f18 = (i17 & 128) != 0 ? zVar.f514031h : f17;
        zVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h17, "h1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h27, "h2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h37, "h3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h47, "h4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h57, "h5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h66, "h6");
        return new v11.z(h17, h27, h37, h47, h57, h66, z18, f18);
    }

    public final int b(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? this.f514029f.f513860b : this.f514028e.f513860b : this.f514027d.f513860b : this.f514026c.f513860b : this.f514025b.f513860b : this.f514024a.f513860b;
    }

    /* renamed from: equals */
    public boolean m170967xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.z)) {
            return false;
        }
        v11.z zVar = (v11.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514024a, zVar.f514024a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514025b, zVar.f514025b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514026c, zVar.f514026c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514027d, zVar.f514027d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514028e, zVar.f514028e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514029f, zVar.f514029f) && this.f514030g == zVar.f514030g && java.lang.Float.compare(this.f514031h, zVar.f514031h) == 0;
    }

    /* renamed from: hashCode */
    public int m170968x8cdac1b() {
        return (((((((((((((this.f514024a.m170861x8cdac1b() * 31) + this.f514025b.m170861x8cdac1b()) * 31) + this.f514026c.m170861x8cdac1b()) * 31) + this.f514027d.m170861x8cdac1b()) * 31) + this.f514028e.m170861x8cdac1b()) * 31) + this.f514029f.m170861x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f514030g)) * 31) + java.lang.Float.hashCode(this.f514031h);
    }

    /* renamed from: toString */
    public java.lang.String m170969x9616526c() {
        return "NativeMarkdownHeadingConfig(h1=" + this.f514024a + ", h2=" + this.f514025b + ", h3=" + this.f514026c + ", h4=" + this.f514027d + ", h5=" + this.f514028e + ", h6=" + this.f514029f + ", forceBold=" + this.f514030g + ", lineSpacingMultiplier=" + this.f514031h + ')';
    }
}

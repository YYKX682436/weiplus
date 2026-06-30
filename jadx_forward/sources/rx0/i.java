package rx0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public rg.c f482461a;

    /* renamed from: b, reason: collision with root package name */
    public final xr0.j f482462b;

    /* renamed from: c, reason: collision with root package name */
    public int f482463c;

    /* renamed from: d, reason: collision with root package name */
    public int f482464d;

    /* renamed from: e, reason: collision with root package name */
    public int f482465e;

    public i(rg.c level, xr0.j outputSize, int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        level = (i27 & 1) != 0 ? rg.c.DIMENSION_LEVEL_720 : level;
        outputSize = (i27 & 2) != 0 ? new xr0.j(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280) : outputSize;
        i17 = (i27 & 4) != 0 ? 233333 : i17;
        i18 = (i27 & 8) != 0 ? 41000 : i18;
        i19 = (i27 & 16) != 0 ? 30 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputSize, "outputSize");
        this.f482461a = level;
        this.f482462b = outputSize;
        this.f482463c = i17;
        this.f482464d = i18;
        this.f482465e = i19;
    }

    /* renamed from: equals */
    public boolean m163381xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.i)) {
            return false;
        }
        rx0.i iVar = (rx0.i) obj;
        return this.f482461a == iVar.f482461a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482462b, iVar.f482462b) && this.f482463c == iVar.f482463c && this.f482464d == iVar.f482464d && this.f482465e == iVar.f482465e;
    }

    /* renamed from: hashCode */
    public int m163382x8cdac1b() {
        return (((((((this.f482461a.hashCode() * 31) + this.f482462b.m175800x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f482463c)) * 31) + java.lang.Integer.hashCode(this.f482464d)) * 31) + java.lang.Integer.hashCode(this.f482465e);
    }

    /* renamed from: toString */
    public java.lang.String m163383x9616526c() {
        return "TemplateOutputInfo(level=" + this.f482461a + ", outputSize=" + this.f482462b + ", videoBitsPerFrame=" + this.f482463c + ", averageAudioBitRate=" + this.f482464d + ", maxKeyframeInterval=" + this.f482465e + ')';
    }
}

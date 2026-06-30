package hu3;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public rg.c f366732a;

    /* renamed from: b, reason: collision with root package name */
    public final xr0.j f366733b;

    /* renamed from: c, reason: collision with root package name */
    public int f366734c;

    /* renamed from: d, reason: collision with root package name */
    public int f366735d;

    /* renamed from: e, reason: collision with root package name */
    public int f366736e;

    public t0(rg.c level, xr0.j outputSize, int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        level = (i27 & 1) != 0 ? rg.c.DIMENSION_LEVEL_720 : level;
        outputSize = (i27 & 2) != 0 ? new xr0.j(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf, 1280) : outputSize;
        i17 = (i27 & 4) != 0 ? 233333 : i17;
        i18 = (i27 & 8) != 0 ? 41000 : i18;
        i19 = (i27 & 16) != 0 ? 30 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputSize, "outputSize");
        this.f366732a = level;
        this.f366733b = outputSize;
        this.f366734c = i17;
        this.f366735d = i18;
        this.f366736e = i19;
    }

    /* renamed from: equals */
    public boolean m134156xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.t0)) {
            return false;
        }
        hu3.t0 t0Var = (hu3.t0) obj;
        return this.f366732a == t0Var.f366732a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f366733b, t0Var.f366733b) && this.f366734c == t0Var.f366734c && this.f366735d == t0Var.f366735d && this.f366736e == t0Var.f366736e;
    }

    /* renamed from: hashCode */
    public int m134157x8cdac1b() {
        return (((((((this.f366732a.hashCode() * 31) + this.f366733b.m175800x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f366734c)) * 31) + java.lang.Integer.hashCode(this.f366735d)) * 31) + java.lang.Integer.hashCode(this.f366736e);
    }

    /* renamed from: toString */
    public java.lang.String m134158x9616526c() {
        return "TemplateOutputInfo(level=" + this.f366732a + ", outputSize=" + this.f366733b + ", videoBitsPerFrame=" + this.f366734c + ", averageAudioBitRate=" + this.f366735d + ", maxKeyframeInterval=" + this.f366736e + ')';
    }
}

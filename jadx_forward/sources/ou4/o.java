package ou4;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430531a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430532b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f430533c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f430534d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f430535e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f430536f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f430537g;

    public o(java.lang.String businessId, java.lang.String pluginName, java.lang.String str, java.util.List list, java.util.Set pluginWhitelist, boolean z17, java.util.Map extras, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 4) != 0 ? com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29 : str;
        list = (i17 & 8) != 0 ? null : list;
        pluginWhitelist = (i17 & 16) != 0 ? kz5.r0.f395535d : pluginWhitelist;
        z17 = (i17 & 32) != 0 ? true : z17;
        extras = (i17 & 64) != 0 ? kz5.q0.f395534d : extras;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessId, "businessId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginName, "pluginName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginWhitelist, "pluginWhitelist");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        this.f430531a = businessId;
        this.f430532b = pluginName;
        this.f430533c = str;
        this.f430534d = list;
        this.f430535e = pluginWhitelist;
        this.f430536f = z17;
        this.f430537g = extras;
    }

    /* renamed from: equals */
    public boolean m157127xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou4.o)) {
            return false;
        }
        ou4.o oVar = (ou4.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430531a, oVar.f430531a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430532b, oVar.f430532b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430533c, oVar.f430533c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430534d, oVar.f430534d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430535e, oVar.f430535e) && this.f430536f == oVar.f430536f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430537g, oVar.f430537g);
    }

    /* renamed from: hashCode */
    public int m157128x8cdac1b() {
        int hashCode = ((this.f430531a.hashCode() * 31) + this.f430532b.hashCode()) * 31;
        java.lang.String str = this.f430533c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.List list = this.f430534d;
        return ((((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.f430535e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f430536f)) * 31) + this.f430537g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157129x9616526c() {
        return "FlutterBusinessConfig(businessId=" + this.f430531a + ", pluginName=" + this.f430532b + ", entryPoint=" + this.f430533c + ", initialPlugins=" + this.f430534d + ", pluginWhitelist=" + this.f430535e + ", enableErrorBoundary=" + this.f430536f + ", extras=" + this.f430537g + ')';
    }
}

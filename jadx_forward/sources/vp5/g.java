package vp5;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final vp5.f f520642a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f520643b;

    public g(vp5.f pluginPermissions, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginPermissions, "pluginPermissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f520642a = pluginPermissions;
        this.f520643b = appId;
    }

    /* renamed from: equals */
    public boolean m172461xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.g)) {
            return false;
        }
        vp5.g gVar = (vp5.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520642a, gVar.f520642a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520643b, gVar.f520643b);
    }

    /* renamed from: hashCode */
    public int m172462x8cdac1b() {
        return (this.f520642a.m172459x8cdac1b() * 31) + this.f520643b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172463x9616526c() {
        return "PluginPermission(pluginPermissions=" + this.f520642a + ", appId=" + this.f520643b + ")";
    }
}

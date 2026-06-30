package ou4;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430561a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f430562b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f430563c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f430564d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f430565e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f430566f;

    public t(java.lang.String initialRoute, java.util.Map arguments, java.util.List list, boolean z17, boolean z18, java.util.Map extras, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        initialRoute = (i17 & 1) != 0 ? "" : initialRoute;
        int i18 = i17 & 2;
        kz5.q0 q0Var = kz5.q0.f395534d;
        arguments = i18 != 0 ? q0Var : arguments;
        list = (i17 & 4) != 0 ? null : list;
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? true : z18;
        extras = (i17 & 32) != 0 ? q0Var : extras;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialRoute, "initialRoute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        this.f430561a = initialRoute;
        this.f430562b = arguments;
        this.f430563c = list;
        this.f430564d = z17;
        this.f430565e = z18;
        this.f430566f = extras;
    }

    /* renamed from: equals */
    public boolean m157130xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou4.t)) {
            return false;
        }
        ou4.t tVar = (ou4.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430561a, tVar.f430561a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430562b, tVar.f430562b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430563c, tVar.f430563c) && this.f430564d == tVar.f430564d && this.f430565e == tVar.f430565e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430566f, tVar.f430566f);
    }

    /* renamed from: hashCode */
    public int m157131x8cdac1b() {
        int hashCode = ((this.f430561a.hashCode() * 31) + this.f430562b.hashCode()) * 31;
        java.util.List list = this.f430563c;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f430564d)) * 31) + java.lang.Boolean.hashCode(this.f430565e)) * 31) + this.f430566f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157132x9616526c() {
        return "FlutterContainerConfig(initialRoute=" + this.f430561a + ", arguments=" + this.f430562b + ", initialPlugins=" + this.f430563c + ", transparentBackground=" + this.f430564d + ", enableGestureBack=" + this.f430565e + ", extras=" + this.f430566f + ')';
    }
}

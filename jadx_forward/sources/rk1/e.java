package rk1;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477937a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477938b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477939c;

    /* renamed from: d, reason: collision with root package name */
    public final java.nio.ByteBuffer f477940d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f477941e;

    /* renamed from: f, reason: collision with root package name */
    public final ft.d4 f477942f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f477943g;

    public e(java.lang.String appId, int i17, java.lang.String packageMD5, java.nio.ByteBuffer wasmBuffer, java.lang.String wasmPath, ft.d4 listener, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageMD5, "packageMD5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wasmBuffer, "wasmBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wasmPath, "wasmPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f477937a = appId;
        this.f477938b = i17;
        this.f477939c = packageMD5;
        this.f477940d = wasmBuffer;
        this.f477941e = wasmPath;
        this.f477942f = listener;
        this.f477943g = list;
    }

    /* renamed from: equals */
    public boolean m162542xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1.e)) {
            return false;
        }
        rk1.e eVar = (rk1.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477937a, eVar.f477937a) && this.f477938b == eVar.f477938b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477939c, eVar.f477939c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477940d, eVar.f477940d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477941e, eVar.f477941e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477942f, eVar.f477942f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477943g, eVar.f477943g);
    }

    /* renamed from: hashCode */
    public int m162543x8cdac1b() {
        int hashCode = ((((((((((this.f477937a.hashCode() * 31) + java.lang.Integer.hashCode(this.f477938b)) * 31) + this.f477939c.hashCode()) * 31) + this.f477940d.hashCode()) * 31) + this.f477941e.hashCode()) * 31) + this.f477942f.hashCode()) * 31;
        java.util.List list = this.f477943g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m162544x9616526c() {
        return "TaskQueueData(appId=" + this.f477937a + ", appVersion=" + this.f477938b + ", packageMD5=" + this.f477939c + ", wasmBuffer=" + this.f477940d + ", wasmPath=" + this.f477941e + ", listener=" + this.f477942f + ", funcList=" + this.f477943g + ')';
    }
}

package gg1;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final x91.h f353101a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f353102b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f353103c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f353104d;

    public i(x91.h mrDevice) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mrDevice, "mrDevice");
        this.f353101a = mrDevice;
    }

    /* renamed from: equals */
    public boolean m131527xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gg1.i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.video.cast.MRDeviceWithStatus");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f353101a, ((gg1.i) obj).f353101a);
    }

    /* renamed from: hashCode */
    public int m131528x8cdac1b() {
        return this.f353101a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131529x9616526c() {
        return "MRDeviceWithStatus(mrDevice=" + this.f353101a + ", isSelected=" + this.f353102b + ", isConnectSuccess=" + this.f353103c + ", isConnecting=" + this.f353104d + ')';
    }
}

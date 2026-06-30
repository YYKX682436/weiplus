package po1;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final po1.c f438827i = new po1.c(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f438828a;

    /* renamed from: b, reason: collision with root package name */
    public po1.g f438829b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f438830c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f438831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f438832e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f438833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f438834g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438835h;

    public d(java.lang.String deviceId, po1.g deviceType, java.lang.String deviceNickname, java.lang.String deviceRemark, java.lang.String devicePath, java.lang.String deviceUUID, java.lang.String uriPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceType, "deviceType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceNickname, "deviceNickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceRemark, "deviceRemark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devicePath, "devicePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceUUID, "deviceUUID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uriPath, "uriPath");
        this.f438828a = deviceId;
        this.f438829b = deviceType;
        this.f438830c = deviceNickname;
        this.f438831d = deviceRemark;
        this.f438832e = devicePath;
        this.f438833f = deviceUUID;
        this.f438834g = uriPath;
    }

    public static po1.d a(po1.d dVar, java.lang.String deviceId, po1.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            deviceId = dVar.f438828a;
        }
        if ((i17 & 2) != 0) {
            gVar = dVar.f438829b;
        }
        po1.g deviceType = gVar;
        if ((i17 & 4) != 0) {
            str = dVar.f438830c;
        }
        java.lang.String deviceNickname = str;
        if ((i17 & 8) != 0) {
            str2 = dVar.f438831d;
        }
        java.lang.String deviceRemark = str2;
        if ((i17 & 16) != 0) {
            str3 = dVar.f438832e;
        }
        java.lang.String devicePath = str3;
        if ((i17 & 32) != 0) {
            str4 = dVar.f438833f;
        }
        java.lang.String deviceUUID = str4;
        if ((i17 & 64) != 0) {
            str5 = dVar.f438834g;
        }
        java.lang.String uriPath = str5;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceType, "deviceType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceNickname, "deviceNickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceRemark, "deviceRemark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devicePath, "devicePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceUUID, "deviceUUID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uriPath, "uriPath");
        return new po1.d(deviceId, deviceType, deviceNickname, deviceRemark, devicePath, deviceUUID, uriPath);
    }

    public final java.lang.String b() {
        java.lang.String str = this.f438831d;
        return str.length() == 0 ? this.f438830c : str;
    }

    public final java.lang.String c() {
        java.lang.String jSONObject = new org.json.JSONObject().put("deviceId", this.f438828a).put("deviceType", this.f438829b.h()).put("deviceNickname", this.f438830c).put("deviceRemark", this.f438831d).put("devicePath", this.f438832e).put("deviceUUID", this.f438833f).put("uriPath", this.f438834g).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final void d(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f438832e = str;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q0 e() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q0 q0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q0();
        q0Var.f297489d = this.f438829b.h();
        q0Var.f297490e = this.f438828a;
        q0Var.f297491f = this.f438832e;
        q0Var.f297492g = this.f438830c;
        q0Var.f297493h = this.f438833f;
        q0Var.f297494i = this.f438834g;
        q0Var.f297495m = this.f438831d;
        q0Var.f297496n = this.f438835h;
        return q0Var;
    }

    /* renamed from: equals */
    public boolean m158782xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po1.d)) {
            return false;
        }
        po1.d dVar = (po1.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438828a, dVar.f438828a) && this.f438829b == dVar.f438829b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438830c, dVar.f438830c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438831d, dVar.f438831d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438832e, dVar.f438832e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438833f, dVar.f438833f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438834g, dVar.f438834g);
    }

    /* renamed from: hashCode */
    public int m158783x8cdac1b() {
        return (((((((((((this.f438828a.hashCode() * 31) + this.f438829b.hashCode()) * 31) + this.f438830c.hashCode()) * 31) + this.f438831d.hashCode()) * 31) + this.f438832e.hashCode()) * 31) + this.f438833f.hashCode()) * 31) + this.f438834g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158784x9616526c() {
        java.lang.String str = "UnifyDeviceInfo@" + m158783x8cdac1b() + "(deviceId: " + this.f438828a + ", deviceType: " + this.f438829b + ", deviceNickname: " + this.f438830c + ", deviceRemark: " + this.f438831d + ", devicePath: " + this.f438832e + ", deviceUUID: " + this.f438833f + ", uriPath: " + this.f438834g + ')';
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        return str;
    }
}

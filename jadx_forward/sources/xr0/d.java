package xr0;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final xr0.a f537692a;

    /* renamed from: b, reason: collision with root package name */
    public xr0.k f537693b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f537694c;

    /* renamed from: d, reason: collision with root package name */
    public int f537695d;

    /* renamed from: e, reason: collision with root package name */
    public int f537696e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f537697f;

    /* renamed from: g, reason: collision with root package name */
    public int f537698g;

    public d(xr0.a aVar, xr0.k kVar, boolean z17, int i17, int i18, boolean z18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        xr0.a deviceInfo = (i27 & 1) != 0 ? new xr0.a(0, false, false, 7, null) : aVar;
        xr0.k sizeParameter = (i27 & 2) != 0 ? new xr0.k(null, null, null, 0, false, 31, null) : kVar;
        boolean z19 = (i27 & 4) != 0 ? true : z17;
        int i28 = (i27 & 8) != 0 ? -1 : i17;
        int i29 = (i27 & 16) != 0 ? 0 : i18;
        boolean z27 = (i27 & 32) != 0 ? false : z18;
        int i37 = (i27 & 64) == 0 ? i19 : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeParameter, "sizeParameter");
        this.f537692a = deviceInfo;
        this.f537693b = sizeParameter;
        this.f537694c = z19;
        this.f537695d = i28;
        this.f537696e = i29;
        this.f537697f = z27;
        this.f537698g = i37;
    }

    /* renamed from: equals */
    public boolean m175787xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.d)) {
            return false;
        }
        xr0.d dVar = (xr0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537692a, dVar.f537692a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537693b, dVar.f537693b) && this.f537694c == dVar.f537694c && this.f537695d == dVar.f537695d && this.f537696e == dVar.f537696e && this.f537697f == dVar.f537697f && this.f537698g == dVar.f537698g;
    }

    /* renamed from: hashCode */
    public int m175788x8cdac1b() {
        return (((((((((((this.f537692a.m175779x8cdac1b() * 31) + this.f537693b.m175803x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f537694c)) * 31) + java.lang.Integer.hashCode(this.f537695d)) * 31) + java.lang.Integer.hashCode(this.f537696e)) * 31) + java.lang.Boolean.hashCode(this.f537697f)) * 31) + java.lang.Integer.hashCode(this.f537698g);
    }

    /* renamed from: toString */
    public java.lang.String m175789x9616526c() {
        return "CameraKitInfo(deviceInfo=" + this.f537692a + ", sizeParameter=" + this.f537693b + ", isBackCamera=" + this.f537694c + ", cameraId=" + this.f537695d + ", rotate=" + this.f537696e + ", isPreviewing=" + this.f537697f + ", frameRate=" + this.f537698g + ')';
    }
}

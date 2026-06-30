package kc;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f387789a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f387791c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f387792d;

    /* renamed from: e, reason: collision with root package name */
    public final int f387793e;

    /* renamed from: f, reason: collision with root package name */
    public final double f387794f;

    /* renamed from: g, reason: collision with root package name */
    public final int f387795g;

    public a(int i17, java.lang.String str, int i18, java.lang.String str2, int i19, double d17, int i27) {
        this.f387789a = -1;
        this.f387790b = "";
        this.f387789a = i17;
        this.f387790b = str;
        this.f387791c = i18;
        this.f387792d = str2;
        this.f387793e = i19;
        this.f387794f = java.lang.Math.round(d17 * 10.0d) / 10.0d;
        this.f387795g = i27;
        mc.p.f407064a.b("CameraParams", "camera params: " + this);
    }

    /* renamed from: toString */
    public final java.lang.String m142350x9616526c() {
        return "CameraParams{code=" + this.f387789a + ", message='" + this.f387790b + "', requestId=" + this.f387791c + ", comment='" + this.f387792d + "', whiteBalance=" + this.f387793e + ", needChangeWhiteBalance=false, exposure=" + this.f387794f + ", needChangeExposure=false, zoom=" + this.f387795g + ", needChangeZoom=false}";
    }
}

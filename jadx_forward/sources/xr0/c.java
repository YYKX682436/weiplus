package xr0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f537688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f537689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f537690c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f537691d;

    public c(int i17, int i18, int i19, xr0.e eVar, xr0.f fVar, boolean z17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? -1 : i17;
        i18 = (i27 & 2) != 0 ? 30 : i18;
        i19 = (i27 & 4) != 0 ? -1 : i19;
        z17 = (i27 & 32) != 0 ? true : z17;
        this.f537688a = i17;
        this.f537689b = i18;
        this.f537690c = i19;
        this.f537691d = z17;
    }

    /* renamed from: equals */
    public boolean m175784xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.c)) {
            return false;
        }
        xr0.c cVar = (xr0.c) obj;
        return this.f537688a == cVar.f537688a && this.f537689b == cVar.f537689b && this.f537690c == cVar.f537690c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null) && this.f537691d == cVar.f537691d;
    }

    /* renamed from: hashCode */
    public int m175785x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f537688a) * 31) + java.lang.Integer.hashCode(this.f537689b)) * 31) + java.lang.Integer.hashCode(this.f537690c)) * 31) + 0) * 31) + 0) * 31) + java.lang.Boolean.hashCode(this.f537691d);
    }

    /* renamed from: toString */
    public java.lang.String m175786x9616526c() {
        return "CameraKitCommonSetting(instanceVersion=" + this.f537688a + ", cameraFrameRate=" + this.f537689b + ", previewLimit=" + this.f537690c + ", pictureSetting=null, renderSetting=null, useBackCamera=" + this.f537691d + ')';
    }
}

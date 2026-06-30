package xr0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f537680a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f537681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f537682c;

    public a(int i17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        z17 = (i18 & 2) != 0 ? true : z17;
        z18 = (i18 & 4) != 0 ? true : z18;
        this.f537680a = i17;
        this.f537681b = z17;
        this.f537682c = z18;
    }

    /* renamed from: equals */
    public boolean m175778xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.a)) {
            return false;
        }
        xr0.a aVar = (xr0.a) obj;
        return this.f537680a == aVar.f537680a && this.f537681b == aVar.f537681b && this.f537682c == aVar.f537682c;
    }

    /* renamed from: hashCode */
    public int m175779x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f537680a) * 31) + java.lang.Boolean.hashCode(this.f537681b)) * 31) + java.lang.Boolean.hashCode(this.f537682c);
    }

    /* renamed from: toString */
    public java.lang.String m175780x9616526c() {
        return "CameraDeviceInfo(cameraCount=" + this.f537680a + ", hasBackCamera=" + this.f537681b + ", hasFrontCamera=" + this.f537682c + ')';
    }
}

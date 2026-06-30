package xr0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f537683a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f537684b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f537685c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f537686d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f537687e;

    public b(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        z19 = (i17 & 4) != 0 ? false : z19;
        z27 = (i17 & 8) != 0 ? true : z27;
        z28 = (i17 & 16) != 0 ? true : z28;
        this.f537683a = z17;
        this.f537684b = z18;
        this.f537685c = z19;
        this.f537686d = z27;
        this.f537687e = z28;
    }

    /* renamed from: equals */
    public boolean m175781xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr0.b)) {
            return false;
        }
        xr0.b bVar = (xr0.b) obj;
        return this.f537683a == bVar.f537683a && this.f537684b == bVar.f537684b && this.f537685c == bVar.f537685c && this.f537686d == bVar.f537686d && this.f537687e == bVar.f537687e;
    }

    /* renamed from: hashCode */
    public int m175782x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f537683a) * 31) + java.lang.Boolean.hashCode(this.f537684b)) * 31) + java.lang.Boolean.hashCode(this.f537685c)) * 31) + java.lang.Boolean.hashCode(this.f537686d)) * 31) + java.lang.Boolean.hashCode(this.f537687e);
    }

    /* renamed from: toString */
    public java.lang.String m175783x9616526c() {
        return "CameraKitAbilitySetting(isUseTakePicture=" + this.f537683a + ", isUseFlash=" + this.f537684b + ", isUseAdjustExpo=" + this.f537685c + ", isUseFocusOn=" + this.f537686d + ", isUseDoubleTapToSwitchCamera=" + this.f537687e + ')';
    }
}

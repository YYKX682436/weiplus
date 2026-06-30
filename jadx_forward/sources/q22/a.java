package q22;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f441333a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f441334b;

    /* renamed from: c, reason: collision with root package name */
    public int f441335c;

    /* renamed from: d, reason: collision with root package name */
    public int f441336d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441337e;

    public a(int i17, boolean z17, int i18, int i19, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 1080 : i17;
        z17 = (i27 & 2) != 0 ? false : z17;
        i18 = (i27 & 4) != 0 ? 640 : i18;
        i19 = (i27 & 8) != 0 ? 1 : i19;
        z18 = (i27 & 16) != 0 ? false : z18;
        this.f441333a = i17;
        this.f441334b = z17;
        this.f441335c = i18;
        this.f441336d = i19;
        this.f441337e = z18;
    }

    /* renamed from: equals */
    public boolean m159454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q22.a)) {
            return false;
        }
        q22.a aVar = (q22.a) obj;
        return this.f441333a == aVar.f441333a && this.f441334b == aVar.f441334b && this.f441335c == aVar.f441335c && this.f441336d == aVar.f441336d && this.f441337e == aVar.f441337e;
    }

    /* renamed from: hashCode */
    public int m159455x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f441333a) * 31) + java.lang.Boolean.hashCode(this.f441334b)) * 31) + java.lang.Integer.hashCode(this.f441335c)) * 31) + java.lang.Integer.hashCode(this.f441336d)) * 31) + java.lang.Boolean.hashCode(this.f441337e);
    }

    /* renamed from: toString */
    public java.lang.String m159456x9616526c() {
        return "CameraPreviewConfig(resolution=" + this.f441333a + ", useCpuCrop=" + this.f441334b + ", previewSize=" + this.f441335c + ", stickerSampleSize=" + this.f441336d + ", useCameraApi2=" + this.f441337e + ')';
    }
}

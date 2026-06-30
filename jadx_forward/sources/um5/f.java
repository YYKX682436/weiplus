package um5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f510683a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f510684b;

    /* renamed from: c, reason: collision with root package name */
    public int f510685c;

    /* renamed from: d, reason: collision with root package name */
    public int f510686d;

    /* renamed from: e, reason: collision with root package name */
    public int f510687e;

    public f(int i17, boolean z17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        z17 = (i28 & 2) != 0 ? false : z17;
        i18 = (i28 & 4) != 0 ? 0 : i18;
        i19 = (i28 & 8) != 0 ? 0 : i19;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        this.f510683a = i17;
        this.f510684b = z17;
        this.f510685c = i18;
        this.f510686d = i19;
        this.f510687e = i27;
    }

    /* renamed from: equals */
    public boolean m168263xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.f)) {
            return false;
        }
        um5.f fVar = (um5.f) obj;
        return this.f510683a == fVar.f510683a && this.f510684b == fVar.f510684b && this.f510685c == fVar.f510685c && this.f510686d == fVar.f510686d && this.f510687e == fVar.f510687e;
    }

    /* renamed from: hashCode */
    public int m168264x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f510683a) * 31) + java.lang.Boolean.hashCode(this.f510684b)) * 31) + java.lang.Integer.hashCode(this.f510685c)) * 31) + java.lang.Integer.hashCode(this.f510686d)) * 31) + java.lang.Integer.hashCode(this.f510687e);
    }

    /* renamed from: toString */
    public java.lang.String m168265x9616526c() {
        return "ExternInputTextureInfo(textureId=" + this.f510683a + ", isOES=" + this.f510684b + ", width=" + this.f510685c + ", height=" + this.f510686d + ", rotate=" + this.f510687e + ')';
    }
}

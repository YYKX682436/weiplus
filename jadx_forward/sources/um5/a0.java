package um5;

/* loaded from: classes10.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f510661a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f510662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f510663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f510664d;

    /* renamed from: e, reason: collision with root package name */
    public final int f510665e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f510666f;

    public a0(int i17, boolean z17, int i18, int i19, int i27, android.graphics.SurfaceTexture surfaceTexture) {
        this.f510661a = i17;
        this.f510662b = z17;
        this.f510663c = i18;
        this.f510664d = i19;
        this.f510665e = i27;
        this.f510666f = surfaceTexture;
    }

    /* renamed from: equals */
    public boolean m168256xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.a0)) {
            return false;
        }
        um5.a0 a0Var = (um5.a0) obj;
        return this.f510661a == a0Var.f510661a && this.f510662b == a0Var.f510662b && this.f510663c == a0Var.f510663c && this.f510664d == a0Var.f510664d && this.f510665e == a0Var.f510665e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510666f, a0Var.f510666f);
    }

    /* renamed from: hashCode */
    public int m168257x8cdac1b() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f510661a) * 31) + java.lang.Boolean.hashCode(this.f510662b)) * 31) + java.lang.Integer.hashCode(this.f510663c)) * 31) + java.lang.Integer.hashCode(this.f510664d)) * 31) + java.lang.Integer.hashCode(this.f510665e)) * 31;
        android.graphics.SurfaceTexture surfaceTexture = this.f510666f;
        return hashCode + (surfaceTexture == null ? 0 : surfaceTexture.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m168258x9616526c() {
        return "InputTextureData(textureId=" + this.f510661a + ", isOES=" + this.f510662b + ", width=" + this.f510663c + ", height=" + this.f510664d + ", rotate=" + this.f510665e + ", surfaceTexture=" + this.f510666f + ')';
    }
}

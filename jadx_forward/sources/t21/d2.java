package t21;

/* loaded from: classes10.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f496265a;

    /* renamed from: b, reason: collision with root package name */
    public final float f496266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f496267c;

    /* renamed from: d, reason: collision with root package name */
    public final int f496268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f496269e;

    public d2(int i17, float f17, int i18, int i19, int i27) {
        this.f496265a = i17;
        this.f496266b = f17;
        this.f496267c = i18;
        this.f496268d = i19;
        this.f496269e = i27;
    }

    /* renamed from: equals */
    public boolean m165680xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t21.d2)) {
            return false;
        }
        t21.d2 d2Var = (t21.d2) obj;
        return this.f496265a == d2Var.f496265a && java.lang.Float.compare(this.f496266b, d2Var.f496266b) == 0 && this.f496267c == d2Var.f496267c && this.f496268d == d2Var.f496268d && this.f496269e == d2Var.f496269e;
    }

    /* renamed from: hashCode */
    public int m165681x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f496265a) * 31) + java.lang.Float.hashCode(this.f496266b)) * 31) + java.lang.Integer.hashCode(this.f496267c)) * 31) + java.lang.Integer.hashCode(this.f496268d)) * 31) + java.lang.Integer.hashCode(this.f496269e);
    }

    /* renamed from: toString */
    public java.lang.String m165682x9616526c() {
        return "SoftEncoderConfig(softEncodePreset=" + this.f496265a + ", crf=" + this.f496266b + ", vbvBufferSize=" + this.f496267c + ", roiSwitch=" + this.f496268d + ", roiFlag=" + this.f496269e + ')';
    }

    public /* synthetic */ d2(int i17, float f17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i28 & 1) != 0 ? -1 : i17, (i28 & 2) != 0 ? -1.0f : f17, (i28 & 4) == 0 ? i18 : -1, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 0 : i27);
    }
}

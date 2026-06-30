package kl4;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f390423a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f390424b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f390425c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f390426d;

    public c(float[] fArr, boolean z17, java.lang.String mimeType, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
        this.f390423a = fArr;
        this.f390424b = z17;
        this.f390425c = mimeType;
        this.f390426d = z18;
    }

    /* renamed from: equals */
    public boolean m143632xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl4.c)) {
            return false;
        }
        kl4.c cVar = (kl4.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390423a, cVar.f390423a) && this.f390424b == cVar.f390424b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390425c, cVar.f390425c) && this.f390426d == cVar.f390426d;
    }

    /* renamed from: hashCode */
    public int m143633x8cdac1b() {
        float[] fArr = this.f390423a;
        return ((((((fArr == null ? 0 : java.util.Arrays.hashCode(fArr)) * 31) + java.lang.Boolean.hashCode(this.f390424b)) * 31) + this.f390425c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f390426d);
    }

    /* renamed from: toString */
    public java.lang.String m143634x9616526c() {
        return "DecoderResult(data=" + java.util.Arrays.toString(this.f390423a) + ", isHardwareAccelerated=" + this.f390424b + ", mimeType=" + this.f390425c + ", isFfmepgDecode=" + this.f390426d + ')';
    }
}

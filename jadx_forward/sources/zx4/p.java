package zx4;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f558703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f558704b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f558705c;

    public p(int i17, int i18, android.graphics.Bitmap bitmap) {
        this.f558703a = i17;
        this.f558704b = i18;
        this.f558705c = bitmap;
    }

    /* renamed from: equals */
    public boolean m179877xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx4.p)) {
            return false;
        }
        zx4.p pVar = (zx4.p) obj;
        return this.f558703a == pVar.f558703a && this.f558704b == pVar.f558704b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558705c, pVar.f558705c);
    }

    /* renamed from: hashCode */
    public int m179878x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f558703a) * 31) + java.lang.Integer.hashCode(this.f558704b)) * 31;
        android.graphics.Bitmap bitmap = this.f558705c;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m179879x9616526c() {
        return "ScreenshotBitmapDescriptor(top=" + this.f558703a + ", bitmapHeight=" + this.f558704b + ", bitmap=" + this.f558705c + ')';
    }
}

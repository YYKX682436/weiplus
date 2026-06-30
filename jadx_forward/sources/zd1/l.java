package zd1;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f553076a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f553077b;

    public l(int i17, android.graphics.Bitmap bitmap) {
        this.f553076a = i17;
        this.f553077b = bitmap;
    }

    /* renamed from: equals */
    public boolean m178720xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.l)) {
            return false;
        }
        zd1.l lVar = (zd1.l) obj;
        return this.f553076a == lVar.f553076a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553077b, lVar.f553077b);
    }

    /* renamed from: hashCode */
    public int m178721x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f553076a) * 31;
        android.graphics.Bitmap bitmap = this.f553077b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m178722x9616526c() {
        return "ScreenshotBitmapDescriptor(top=" + this.f553076a + ", bitmap=" + this.f553077b + ')';
    }
}

package nm4;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f420018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420019b;

    public d(android.graphics.Bitmap bitmap, int i17) {
        this.f420018a = bitmap;
        this.f420019b = i17;
    }

    /* renamed from: equals */
    public boolean m149777xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm4.d)) {
            return false;
        }
        nm4.d dVar = (nm4.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420018a, dVar.f420018a) && this.f420019b == dVar.f420019b;
    }

    /* renamed from: hashCode */
    public int m149778x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f420018a;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + java.lang.Integer.hashCode(this.f420019b);
    }

    /* renamed from: toString */
    public java.lang.String m149779x9616526c() {
        return "PagCoverBitmap(coverBitmap=" + this.f420018a + ", index=" + this.f420019b + ')';
    }
}

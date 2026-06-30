package fu2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f348405a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348406b;

    public a(android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f348405a = bitmap;
        this.f348406b = str;
    }

    /* renamed from: equals */
    public boolean m130471xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2.a)) {
            return false;
        }
        fu2.a aVar = (fu2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348405a, aVar.f348405a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348406b, aVar.f348406b);
    }

    /* renamed from: hashCode */
    public int m130472x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f348405a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        java.lang.String str = this.f348406b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130473x9616526c() {
        return "CoverData(coverBitmap=" + this.f348405a + ", coverKey=" + this.f348406b + ')';
    }
}

package wp;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f529891a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f529892b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f529893c;

    public e(android.graphics.Bitmap bitmap, android.graphics.Rect sourceRect, android.graphics.Rect destRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceRect, "sourceRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destRect, "destRect");
        this.f529891a = bitmap;
        this.f529892b = sourceRect;
        this.f529893c = destRect;
    }

    /* renamed from: equals */
    public boolean m174285xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp.e)) {
            return false;
        }
        wp.e eVar = (wp.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529891a, eVar.f529891a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529892b, eVar.f529892b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f529893c, eVar.f529893c);
    }

    /* renamed from: hashCode */
    public int m174286x8cdac1b() {
        android.graphics.Bitmap bitmap = this.f529891a;
        return ((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.f529892b.hashCode()) * 31) + this.f529893c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174287x9616526c() {
        return "Mask(maskBitmap=" + this.f529891a + ", sourceRect=" + this.f529892b + ", destRect=" + this.f529893c + ')';
    }
}

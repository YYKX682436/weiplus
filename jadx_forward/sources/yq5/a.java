package yq5;

/* loaded from: classes11.dex */
public class a implements yq5.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f546121a;

    public a(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f546121a = bitmap;
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getByteCount();
    }

    /* renamed from: equals */
    public boolean m177511xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.a.class != obj.getClass()) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546121a, ((yq5.a) obj).f546121a);
    }

    /* renamed from: hashCode */
    public int m177512x8cdac1b() {
        return this.f546121a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177513x9616526c() {
        return "BitmapTileImage(bitmap=" + yq5.o.a(this.f546121a) + ')';
    }
}

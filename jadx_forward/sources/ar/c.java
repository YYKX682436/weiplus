package ar;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ar.c f94889a = new ar.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jt0.i f94890b = new jt0.i(500, ar.c.class);

    public final android.graphics.Bitmap a(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        if (str == null || (bitmap = (android.graphics.Bitmap) f94890b.get(str)) == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public final void b(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.toString(bitmap);
        if (str != null) {
            jt0.i iVar = f94890b;
            if (bitmap == null || bitmap.isRecycled()) {
                iVar.mo141381xc84af884(str);
            } else {
                iVar.put(str, bitmap);
            }
        }
    }
}

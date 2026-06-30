package ar;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ar.c f13356a = new ar.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jt0.i f13357b = new jt0.i(500, ar.c.class);

    public final android.graphics.Bitmap a(java.lang.String str) {
        android.graphics.Bitmap bitmap;
        if (str == null || (bitmap = (android.graphics.Bitmap) f13357b.get(str)) == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public final void b(java.lang.String str, android.graphics.Bitmap bitmap) {
        java.util.Objects.toString(bitmap);
        if (str != null) {
            jt0.i iVar = f13357b;
            if (bitmap == null || bitmap.isRecycled()) {
                iVar.remove(str);
            } else {
                iVar.put(str, bitmap);
            }
        }
    }
}

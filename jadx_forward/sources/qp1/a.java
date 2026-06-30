package qp1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final qp1.a f447213a;

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f447214b;

    static {
        qp1.a aVar = new qp1.a();
        f447213a = aVar;
        f447214b = new jt0.i(10, aVar.getClass());
    }

    public final void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        if ((str == null || str.length() == 0) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.getRowBytes();
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getAllocationByteCount();
        ((jt0.i) f447214b).put(str, bitmap);
    }
}

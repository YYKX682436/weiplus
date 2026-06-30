package d7;

/* loaded from: classes13.dex */
public class j extends d7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f308348b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(t6.h.f497500a);

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(f308348b);
    }

    @Override // d7.f
    public android.graphics.Bitmap c(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18) {
        android.graphics.Paint paint = d7.n0.f308358a;
        if (bitmap.getWidth() > i17 || bitmap.getHeight() > i18) {
            android.util.Log.isLoggable("TransformationUtils", 2);
            return d7.n0.b(dVar, bitmap, i17, i18);
        }
        android.util.Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        return obj instanceof d7.j;
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return -670243078;
    }
}

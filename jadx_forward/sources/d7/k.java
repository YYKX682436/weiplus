package d7;

/* loaded from: classes13.dex */
public class k extends d7.f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f308351b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(t6.h.f497500a);

    @Override // t6.h
    public void b(java.security.MessageDigest messageDigest) {
        messageDigest.update(f308351b);
    }

    @Override // d7.f
    public android.graphics.Bitmap c(x6.d dVar, android.graphics.Bitmap bitmap, int i17, int i18) {
        android.graphics.Bitmap d17;
        android.graphics.Paint paint = d7.n0.f308358a;
        int min = java.lang.Math.min(i17, i18);
        float f17 = min;
        float f18 = f17 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = java.lang.Math.max(f17 / width, f17 / height);
        float f19 = width * max;
        float f27 = max * height;
        float f28 = (f17 - f19) / 2.0f;
        float f29 = (f17 - f27) / 2.0f;
        android.graphics.RectF rectF = new android.graphics.RectF(f28, f29, f19 + f28, f27 + f29);
        int i19 = android.os.Build.VERSION.SDK_INT;
        android.graphics.Bitmap.Config config = (i19 < 26 || !android.graphics.Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGBA_F16;
        if (config.equals(bitmap.getConfig())) {
            d17 = bitmap;
        } else {
            d17 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), config);
            new android.graphics.Canvas(d17).drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        android.graphics.Bitmap d18 = dVar.d(min, min, (i19 < 26 || !android.graphics.Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGBA_F16);
        d18.setHasAlpha(true);
        java.util.concurrent.locks.Lock lock = d7.n0.f308361d;
        lock.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(d18);
            canvas.drawCircle(f18, f18, f18, d7.n0.f308359b);
            canvas.drawBitmap(d17, (android.graphics.Rect) null, rectF, d7.n0.f308360c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!d17.equals(bitmap)) {
                dVar.b(d17);
            }
            return d18;
        } catch (java.lang.Throwable th6) {
            lock.unlock();
            throw th6;
        }
    }

    @Override // t6.h
    /* renamed from: equals */
    public boolean mo743xb2c87fbf(java.lang.Object obj) {
        return obj instanceof d7.k;
    }

    @Override // t6.h
    /* renamed from: hashCode */
    public int mo744x8cdac1b() {
        return 1101716364;
    }
}

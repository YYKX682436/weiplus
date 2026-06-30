package x6;

/* loaded from: classes13.dex */
public class o implements x6.d {

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config f533696f = android.graphics.Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final x6.p f533697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f533698b;

    /* renamed from: c, reason: collision with root package name */
    public final x6.m f533699c;

    /* renamed from: d, reason: collision with root package name */
    public final long f533700d;

    /* renamed from: e, reason: collision with root package name */
    public long f533701e;

    public o(long j17) {
        x6.u uVar = new x6.u();
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(android.graphics.Bitmap.Config.values()));
        int i17 = android.os.Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i17 >= 26) {
            hashSet.remove(android.graphics.Bitmap.Config.HARDWARE);
        }
        java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(hashSet);
        this.f533700d = j17;
        this.f533697a = uVar;
        this.f533698b = unmodifiableSet;
        this.f533699c = new x6.n();
    }

    public static android.graphics.Bitmap f(int i17, int i18, android.graphics.Bitmap.Config config) {
        if (config == null) {
            config = f533696f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/bumptech/glide/load/engine/bitmap_recycle/LruBitmapPool", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    @Override // x6.d
    public void a(int i17) {
        android.util.Log.isLoggable("LruBitmapPool", 3);
        if (i17 >= 40 || i17 >= 20) {
            e();
        } else if (i17 >= 20 || i17 == 15) {
            h(this.f533700d / 2);
        }
    }

    @Override // x6.d
    public synchronized void b(android.graphics.Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new java.lang.NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new java.lang.IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((x6.u) this.f533697a).getClass();
                if (q7.p.c(bitmap) <= this.f533700d && this.f533698b.contains(bitmap.getConfig())) {
                    ((x6.u) this.f533697a).getClass();
                    int c17 = q7.p.c(bitmap);
                    ((x6.u) this.f533697a).f(bitmap);
                    this.f533699c.getClass();
                    this.f533701e += c17;
                    if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                        ((x6.u) this.f533697a).e(bitmap);
                    }
                    if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                        java.util.Objects.toString(this.f533697a);
                    }
                    h(this.f533700d);
                    return;
                }
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                ((x6.u) this.f533697a).e(bitmap);
                bitmap.isMutable();
                this.f533698b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
    }

    @Override // x6.d
    public android.graphics.Bitmap c(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap g17 = g(i17, i18, config);
        return g17 == null ? f(i17, i18, config) : g17;
    }

    @Override // x6.d
    public android.graphics.Bitmap d(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap g17 = g(i17, i18, config);
        if (g17 == null) {
            return f(i17, i18, config);
        }
        g17.eraseColor(0);
        return g17;
    }

    @Override // x6.d
    public void e() {
        android.util.Log.isLoggable("LruBitmapPool", 3);
        h(0L);
    }

    public final synchronized android.graphics.Bitmap g(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap b17;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.HARDWARE) {
                throw new java.lang.IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b17 = ((x6.u) this.f533697a).b(i17, i18, config != null ? config : f533696f);
            if (b17 != null) {
                long j17 = this.f533701e;
                ((x6.u) this.f533697a).getClass();
                this.f533701e = j17 - q7.p.c(b17);
                this.f533699c.getClass();
                b17.setHasAlpha(true);
                b17.setPremultiplied(true);
            } else if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                ((x6.u) this.f533697a).getClass();
                x6.u.c(q7.p.b(i17, i18, config), config);
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                ((x6.u) this.f533697a).getClass();
                x6.u.c(q7.p.b(i17, i18, config), config);
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                java.util.Objects.toString(this.f533697a);
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        return b17;
    }

    public final synchronized void h(long j17) {
        while (this.f533701e > j17) {
            x6.u uVar = (x6.u) this.f533697a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) uVar.f533712b.c();
            if (bitmap != null) {
                uVar.a(java.lang.Integer.valueOf(q7.p.c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (android.util.Log.isLoggable("LruBitmapPool", 5)) {
                    java.util.Objects.toString(this.f533697a);
                }
                this.f533701e = 0L;
                return;
            }
            this.f533699c.getClass();
            long j18 = this.f533701e;
            ((x6.u) this.f533697a).getClass();
            this.f533701e = j18 - q7.p.c(bitmap);
            if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                ((x6.u) this.f533697a).e(bitmap);
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                java.util.Objects.toString(this.f533697a);
            }
            bitmap.recycle();
        }
    }
}

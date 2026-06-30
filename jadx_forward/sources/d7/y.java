package d7;

/* loaded from: classes13.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final t6.k f308384f = t6.k.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", t6.b.f497494f);

    /* renamed from: g, reason: collision with root package name */
    public static final t6.k f308385g = t6.k.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", t6.m.SRGB);

    /* renamed from: h, reason: collision with root package name */
    public static final t6.k f308386h;

    /* renamed from: i, reason: collision with root package name */
    public static final t6.k f308387i;

    /* renamed from: j, reason: collision with root package name */
    public static final d7.x f308388j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Queue f308389k;

    /* renamed from: a, reason: collision with root package name */
    public final x6.d f308390a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.DisplayMetrics f308391b;

    /* renamed from: c, reason: collision with root package name */
    public final x6.b f308392c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f308393d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.e0 f308394e;

    static {
        d7.v vVar = d7.v.f308371a;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f308386h = t6.k.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f308387i = t6.k.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f308388j = new d7.w();
        java.util.Collections.unmodifiableSet(java.util.EnumSet.of(com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.JPEG, com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.PNG_A, com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.PNG));
        char[] cArr = q7.p.f441843a;
        f308389k = new java.util.ArrayDeque(0);
    }

    public y(java.util.List list, android.util.DisplayMetrics displayMetrics, x6.d dVar, x6.b bVar) {
        if (d7.e0.f308332g == null) {
            synchronized (d7.e0.class) {
                if (d7.e0.f308332g == null) {
                    d7.e0.f308332g = new d7.e0();
                }
            }
        }
        this.f308394e = d7.e0.f308332g;
        this.f308393d = list;
        q7.n.b(displayMetrics);
        this.f308391b = displayMetrics;
        q7.n.b(dVar);
        this.f308390a = dVar;
        q7.n.b(bVar);
        this.f308392c = bVar;
    }

    public static android.graphics.Bitmap c(java.io.InputStream inputStream, android.graphics.BitmapFactory.Options options, d7.x xVar, x6.d dVar) {
        if (options.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            xVar.a();
        }
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        java.lang.String str = options.outMimeType;
        java.util.concurrent.locks.Lock lock = d7.n0.f308361d;
        lock.lock();
        try {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(options);
                arrayList.add(null);
                arrayList.add(inputStream);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/bumptech/glide/load/resource/bitmap/Downsampler", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lcom/bumptech/glide/load/resource/bitmap/Downsampler$DecodeCallbacks;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2));
                yj0.a.e(obj, decodeStream, "com/bumptech/glide/load/resource/bitmap/Downsampler", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lcom/bumptech/glide/load/resource/bitmap/Downsampler$DecodeCallbacks;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                lock.unlock();
                if (options.inJustDecodeBounds) {
                    inputStream.reset();
                }
                return decodeStream;
            } catch (java.lang.IllegalArgumentException e17) {
                java.io.IOException e18 = e(e17, i17, i18, str, options);
                android.util.Log.isLoggable("Downsampler", 3);
                if (options.inBitmap == null) {
                    throw e18;
                }
                try {
                    inputStream.reset();
                    dVar.b(options.inBitmap);
                    options.inBitmap = null;
                    android.graphics.Bitmap c17 = c(inputStream, options, xVar, dVar);
                    d7.n0.f308361d.unlock();
                    return c17;
                } catch (java.io.IOException unused) {
                    throw e18;
                }
            }
        } catch (java.lang.Throwable th6) {
            d7.n0.f308361d.unlock();
            throw th6;
        }
    }

    public static java.lang.String d(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static java.io.IOException e(java.lang.IllegalArgumentException illegalArgumentException, int i17, int i18, java.lang.String str, android.graphics.BitmapFactory.Options options) {
        return new java.io.IOException("Exception decoding bitmap, outWidth: " + i17 + ", outHeight: " + i18 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(android.graphics.BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public w6.z0 a(java.io.InputStream inputStream, int i17, int i18, t6.l lVar, d7.x xVar) {
        java.util.Queue queue;
        android.graphics.BitmapFactory.Options options;
        android.graphics.BitmapFactory.Options options2;
        q7.n.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) ((x6.l) this.f308392c).c(65536, byte[].class);
        synchronized (d7.y.class) {
            queue = f308389k;
            synchronized (queue) {
                options = (android.graphics.BitmapFactory.Options) ((java.util.ArrayDeque) queue).poll();
            }
            if (options == null) {
                options = new android.graphics.BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        t6.b bVar = (t6.b) lVar.c(f308384f);
        t6.m mVar = (t6.m) lVar.c(f308385g);
        d7.v vVar = (d7.v) lVar.c(d7.v.f308376f);
        boolean booleanValue = ((java.lang.Boolean) lVar.c(f308386h)).booleanValue();
        t6.k kVar = f308387i;
        try {
            d7.e b17 = d7.e.b(b(inputStream, options2, vVar, bVar, mVar, lVar.c(kVar) != null && ((java.lang.Boolean) lVar.c(kVar)).booleanValue(), i17, i18, booleanValue, xVar), this.f308390a);
            f(options2);
            synchronized (queue) {
                ((java.util.ArrayDeque) queue).offer(options2);
            }
            ((x6.l) this.f308392c).g(bArr);
            return b17;
        } catch (java.lang.Throwable th6) {
            f(options2);
            java.util.Queue queue2 = f308389k;
            synchronized (queue2) {
                ((java.util.ArrayDeque) queue2).offer(options2);
                ((x6.l) this.f308392c).g(bArr);
                throw th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(java.io.InputStream r28, android.graphics.BitmapFactory.Options r29, d7.v r30, t6.b r31, t6.m r32, boolean r33, int r34, int r35, boolean r36, d7.x r37) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.y.b(java.io.InputStream, android.graphics.BitmapFactory$Options, d7.v, t6.b, t6.m, boolean, int, int, boolean, d7.x):android.graphics.Bitmap");
    }
}

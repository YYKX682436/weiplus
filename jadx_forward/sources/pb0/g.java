package pb0;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static long f434658e;

    /* renamed from: a, reason: collision with root package name */
    public static final pb0.g f434654a = new pb0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f434655b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f434656c = jz5.h.b(pb0.f.f434653d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f434657d = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    public static final pb0.d f434659f = new pb0.d();

    public static final void a(pb0.g gVar, android.graphics.Bitmap bitmap, int i17, java.lang.String str, java.lang.Throwable th6) {
        java.lang.String substring;
        java.lang.Object putIfAbsent;
        gVar.getClass();
        java.util.Objects.toString(bitmap);
        bitmap.getWidth();
        bitmap.getHeight();
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stackTraceString);
        if (r26.n0.N(stackTraceString)) {
            substring = "skipped";
        } else {
            substring = stackTraceString.substring(0, java.lang.Math.min(2048, stackTraceString.length()));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f434655b;
        java.lang.Object obj = concurrentHashMap.get(substring);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(substring, (obj = new pb0.a()))) != null) {
            obj = putIfAbsent;
        }
        pb0.a aVar = (pb0.a) obj;
        synchronized (aVar) {
            aVar.put(bitmap, java.lang.Integer.valueOf(i17));
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = f434657d;
        if (atomicLong.getAndIncrement() >= 50) {
            synchronized (atomicLong) {
                if (atomicLong.get() >= 50) {
                    atomicLong.set(0L);
                    ((ku5.t0) ku5.t0.f394148d).h(pb0.c.f434650d, "MicroMsg.HellBitmapTracer");
                }
            }
        }
    }

    public static final void b(yz5.p action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        f434654a.c();
        java.util.Set entrySet = f434655b.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : kz5.n0.F0(entrySet, new pb0.b())) {
            synchronized (entry.getValue()) {
                action.mo149xb9724478(entry.getKey(), entry.getValue());
            }
        }
    }

    public static final android.util.Pair d() {
        f434654a.c();
        java.util.Set entrySet = f434655b.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        int i17 = 0;
        long j17 = 0;
        for (java.util.Map.Entry entry : kz5.n0.F0(entrySet, new pb0.b())) {
            synchronized (entry.getValue()) {
                i17 += ((pb0.a) entry.getValue()).size();
                j17 += ((pb0.a) entry.getValue()).a();
                if (java.lang.System.currentTimeMillis() - f434658e < java.util.concurrent.TimeUnit.SECONDS.toMillis(60L)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DUMP_BITMAP", "count: " + ((pb0.a) entry.getValue()).size() + ", sum byte count: " + ((pb0.a) entry.getValue()).a() + ", " + entry.getValue() + "\n trace: " + ((java.lang.String) entry.getKey()));
                    f434658e = java.lang.System.currentTimeMillis();
                }
            }
        }
        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
        return create;
    }

    public static final void e() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("android/graphics/BitmapFactory", kz5.c0.i(new android.util.Pair("decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeByteArray", "([BII)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeFileDescriptor", "(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeResourceStream", "(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;"), new android.util.Pair("decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))), new jz5.l("android/graphics/BitmapRegionDecoder", kz5.b0.c(new android.util.Pair("decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))), new jz5.l("android/graphics/Bitmap", kz5.c0.i(new android.util.Pair("createBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/util/DisplayMetrics;[IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(IILandroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "([IIIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;"), new android.util.Pair("createBitmap", "(Landroid/graphics/Picture;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;"), new android.util.Pair("copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;"))), new jz5.l("android/content/ContentResolver", kz5.b0.c(new android.util.Pair("loadThumbnail", "(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;"))), new jz5.l("android/provider/MediaStore$Images$Thumbnails", kz5.c0.i(new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JJILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))), new jz5.l("android/provider/MediaStore$Video$Thumbnails", kz5.c0.i(new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"), new android.util.Pair("getThumbnail", "(Landroid/content/ContentResolver;JJILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;"))));
        java.util.List i17 = kz5.c0.i(new android.util.Pair("getFrameAtTime", "(J)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtTime", "(JI)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtTime", "(JILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getScaledFrameAtTime", "(JIII)Landroid/graphics/Bitmap;"), new android.util.Pair("getScaledFrameAtTime", "(JIIILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtIndex", "(I)Landroid/graphics/Bitmap;"), new android.util.Pair("getFrameAtIndex", "(ILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getFramesAtIndex", "(II)Ljava/util/List;"), new android.util.Pair("getFramesAtIndex", "(IILandroid/media/MediaMetadataRetriever$BitmapParams;)Ljava/util/List;"), new android.util.Pair("getPrimaryImage", "()Landroid/graphics/Bitmap;"), new android.util.Pair("getPrimaryImage", "(Landroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"), new android.util.Pair("getImageAtIndex", "(I)Landroid/graphics/Bitmap;"), new android.util.Pair("getImageAtIndex", "(ILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;"));
        xj0.a h17 = xj0.a.h();
        pb0.d dVar = f434659f;
        h17.j(k17, dVar);
        xj0.a.h().i(i17, dVar);
        com.p314xaae8f345.mm.p786x600aa8b.e.j(pb0.e.f434652a);
    }

    public final void c() {
        java.util.Iterator it = f434655b.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            pb0.a it6 = (pb0.a) ((java.util.Map.Entry) next).getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it6, "it");
            if (java.lang.Boolean.valueOf(it6.isEmpty()).booleanValue()) {
                it.remove();
            }
        }
    }
}

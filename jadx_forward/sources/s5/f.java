package s5;

/* loaded from: classes14.dex */
public final class f implements s5.a {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f484540j;

    /* renamed from: a, reason: collision with root package name */
    public final int f484541a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f484542b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.b f484543c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f484544d;

    /* renamed from: e, reason: collision with root package name */
    public int f484545e;

    /* renamed from: f, reason: collision with root package name */
    public int f484546f;

    /* renamed from: g, reason: collision with root package name */
    public int f484547g;

    /* renamed from: h, reason: collision with root package name */
    public int f484548h;

    /* renamed from: i, reason: collision with root package name */
    public int f484549i;

    static {
        lz5.q qVar = new lz5.q();
        qVar.add(android.graphics.Bitmap.Config.ALPHA_8);
        qVar.add(android.graphics.Bitmap.Config.RGB_565);
        qVar.add(android.graphics.Bitmap.Config.ARGB_4444);
        qVar.add(android.graphics.Bitmap.Config.ARGB_8888);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            qVar.add(android.graphics.Bitmap.Config.RGBA_F16);
        }
        f484540j = kz5.o1.a(qVar);
    }

    public f(int i17, java.util.Set allowedConfigs, s5.b strategy, h6.k kVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        allowedConfigs = (i18 & 2) != 0 ? f484540j : allowedConfigs;
        if ((i18 & 4) != 0) {
            int i19 = s5.b.f484538a;
            strategy = new s5.i();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allowedConfigs, "allowedConfigs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        this.f484541a = i17;
        this.f484542b = allowedConfigs;
        this.f484543c = strategy;
        this.f484544d = new java.util.HashSet();
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("maxSize must be >= 0.".toString());
        }
    }

    @Override // s5.a
    public synchronized void a(int i17) {
        if (i17 >= 40) {
            f(-1);
        } else {
            boolean z17 = false;
            if (10 <= i17 && i17 < 20) {
                z17 = true;
            }
            if (z17) {
                f(this.f484545e / 2);
            }
        }
    }

    @Override // s5.a
    public synchronized void b(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return;
        }
        int a17 = h6.a.a(bitmap);
        if (bitmap.isMutable() && a17 <= this.f484541a && this.f484542b.contains(bitmap.getConfig())) {
            if (this.f484544d.contains(bitmap)) {
                return;
            }
            ((s5.i) this.f484543c).c(bitmap);
            this.f484544d.add(bitmap);
            this.f484545e += a17;
            this.f484548h++;
            f(this.f484541a);
            return;
        }
        bitmap.recycle();
    }

    @Override // s5.a
    public android.graphics.Bitmap c(int i17, int i18, android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.graphics.Bitmap e17 = e(i17, i18, config);
        if (e17 != null) {
            return e17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "coil/bitmap/RealBitmapPool", "getDirty", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "coil/bitmap/RealBitmapPool", "getDirty", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @Override // s5.a
    public android.graphics.Bitmap d(int i17, int i18, android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        android.graphics.Bitmap e17 = e(i17, i18, config);
        if (e17 == null) {
            e17 = null;
        } else {
            e17.eraseColor(0);
        }
        if (e17 != null) {
            return e17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "coil/bitmap/RealBitmapPool", "get", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "coil/bitmap/RealBitmapPool", "get", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public synchronized android.graphics.Bitmap e(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (!(!h6.a.b(config))) {
            throw new java.lang.IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        b17 = ((s5.i) this.f484543c).b(i17, i18, config);
        if (b17 == null) {
            this.f484547g++;
        } else {
            this.f484544d.remove(b17);
            this.f484545e -= h6.a.a(b17);
            this.f484546f++;
            b17.setDensity(0);
            b17.setHasAlpha(true);
            b17.setPremultiplied(true);
        }
        return b17;
    }

    public final synchronized void f(int i17) {
        java.lang.Object obj;
        while (this.f484545e > i17) {
            s5.i iVar = (s5.i) this.f484543c;
            t5.b bVar = iVar.f484560b;
            t5.a aVar = bVar.f497216a;
            t5.a aVar2 = aVar.f497214c;
            while (true) {
                obj = null;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2, aVar)) {
                    break;
                }
                java.util.List list = aVar2.f497213b;
                if (list != null) {
                    obj = kz5.h0.E(list);
                }
                if (obj != null) {
                    break;
                }
                t5.a aVar3 = aVar2.f497214c;
                t5.a aVar4 = aVar2.f497215d;
                aVar3.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar4, "<set-?>");
                aVar3.f497215d = aVar4;
                t5.a aVar5 = aVar2.f497215d;
                t5.a aVar6 = aVar2.f497214c;
                aVar5.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar6, "<set-?>");
                aVar5.f497214c = aVar6;
                java.util.HashMap hashMap = bVar.f497217b;
                if (hashMap == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap).remove(aVar2.f497212a);
                aVar2 = aVar2.f497214c;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                iVar.a(bitmap.getAllocationByteCount());
            }
            if (bitmap == null) {
                this.f484545e = 0;
                return;
            }
            this.f484544d.remove(bitmap);
            this.f484545e -= h6.a.a(bitmap);
            this.f484549i++;
            bitmap.recycle();
        }
    }
}

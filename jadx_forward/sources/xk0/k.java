package xk0;

/* loaded from: classes10.dex */
public class k implements java.lang.Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public static final int f536515o = cm5.h.b(12.0f);

    /* renamed from: p, reason: collision with root package name */
    public static final android.graphics.Paint f536516p;

    /* renamed from: q, reason: collision with root package name */
    public static final android.graphics.Paint f536517q;

    /* renamed from: r, reason: collision with root package name */
    public static final android.graphics.Paint f536518r;

    /* renamed from: d, reason: collision with root package name */
    public final xk0.i f536519d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f536520e;

    /* renamed from: g, reason: collision with root package name */
    public long f536522g;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Path f536525m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f536526n;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f536521f = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f536523h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f536524i = false;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f536516p = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        f536517q = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        f536518r = paint3;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(-16776961);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint3.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.STROKE);
        paint3.setColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a));
        paint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    public k(xk0.i iVar, android.graphics.Path path, float f17, android.graphics.Bitmap bitmap) {
        this.f536519d = iVar;
        this.f536520e = bitmap;
        this.f536525m = path;
        f536516p.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f536518r.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f536517q.setStrokeWidth(cm5.h.b(28.0f) * f17);
    }

    public void a(android.graphics.Canvas canvas, boolean z17, boolean z18, android.graphics.Bitmap bitmap) {
        android.graphics.Paint paint = f536516p;
        if (z18) {
            paint.setAlpha(100);
        } else {
            paint.setAlpha(255);
        }
        xk0.i iVar = xk0.i.ONE;
        xk0.i iVar2 = this.f536519d;
        if (iVar2 == iVar) {
            android.graphics.Bitmap bitmap2 = this.f536520e;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            boolean z19 = this.f536523h;
            android.graphics.Path path = this.f536525m;
            if (z19) {
                canvas.drawPath(path, f536517q);
            }
            canvas.saveLayer(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), null, 31);
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            canvas.drawPath(path, paint);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            paint.setXfermode(null);
            if (this.f536523h) {
                canvas.drawPath(path, f536518r);
            }
            canvas.restore();
            return;
        }
        if (iVar2 == xk0.i.TWO) {
            java.util.LinkedList linkedList = this.f536526n;
            if (linkedList.size() <= 0) {
                return;
            }
            if (this.f536523h) {
                if (bitmap != null) {
                    rk0.c.c("MicroMsg.MosaicItem", "use cache bitmap", new java.lang.Object[0]);
                    canvas.saveLayer(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), null, 31);
                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    paint.setXfermode(null);
                    canvas.restore();
                    return;
                }
                paint.setAlpha(100);
            }
            if (!z17) {
                xk0.j jVar = (xk0.j) linkedList.getLast();
                b(canvas, jVar, c(jVar.f536508a), z17);
            } else {
                android.graphics.Bitmap c17 = c(((xk0.j) linkedList.get(0)).f536508a);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    b(canvas, (xk0.j) it.next(), c17, z17);
                }
            }
        }
    }

    public void b(android.graphics.Canvas canvas, xk0.j jVar, android.graphics.Bitmap bitmap, boolean z17) {
        float f17 = jVar.f536508a;
        int random = (int) (java.lang.Math.random() * 100.0d);
        float f18 = jVar.f536513f;
        float f19 = jVar.f536514g;
        if (f18 == 0.0f && f19 == 0.0f && z17) {
            return;
        }
        android.graphics.Paint paint = f536516p;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColorFilter(new android.graphics.LightingColorFilter(jVar.f536510c, 1));
        float f27 = jVar.f536512e;
        float f28 = jVar.f536511d;
        if (f18 == 0.0f && f19 == 0.0f) {
            float f29 = f536515o * f17;
            if (bitmap != null) {
                f19 = f27 - ((bitmap.getHeight() * 1.0f) / 2.0f);
                f18 = f28 - ((bitmap.getWidth() * 1.0f) / 2.0f);
            }
            if (random > 0 && random <= 20) {
                f18 += f29;
                f19 += f29;
            } else if (80 < random) {
                f18 -= f29;
                f19 -= f29;
            }
            jVar.f536513f = f18;
            jVar.f536514g = f19;
        }
        canvas.save();
        canvas.rotate(-jVar.f536509b, f28, f27);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, f18, f19, paint);
        }
        canvas.restore();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColorFilter(null);
    }

    public android.graphics.Bitmap c(float f17) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.app));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int round = java.lang.Math.round(options.outWidth * f17 * 0.7f);
        int round2 = java.lang.Math.round(options.outHeight * f17 * 0.7f);
        int i17 = options.outHeight;
        int i18 = 1;
        while (options.outWidth / i18 > round) {
            i18++;
        }
        while (i17 / i18 > round2) {
            i18++;
        }
        options.inSampleSize = i18;
        options.inJustDecodeBounds = false;
        android.content.res.Resources resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(options);
        arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.app));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList2.get(2));
        yj0.a.e(obj2, decodeResource, "com/tencent/mm/items/MosaicItem", "getMosaicBitmap", "(F)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    public k(xk0.i iVar, java.util.LinkedList linkedList, float f17) {
        this.f536519d = iVar;
        this.f536526n = linkedList;
        f536516p.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f536518r.setStrokeWidth(cm5.h.b(24.0f) * f17);
        f536517q.setStrokeWidth(cm5.h.b(28.0f) * f17);
    }
}

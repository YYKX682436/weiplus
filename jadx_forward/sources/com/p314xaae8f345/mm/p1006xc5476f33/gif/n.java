package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes10.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.gif.b {
    public final android.content.res.Resources A;

    /* renamed from: e, reason: collision with root package name */
    public final int f223693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f223694f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f223695g;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f223697i;

    /* renamed from: m, reason: collision with root package name */
    public final int f223698m;

    /* renamed from: n, reason: collision with root package name */
    public final int f223699n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f223700o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f223701p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f223702q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f223703r;

    /* renamed from: s, reason: collision with root package name */
    public int f223704s;

    /* renamed from: v, reason: collision with root package name */
    public boolean f223707v;

    /* renamed from: z, reason: collision with root package name */
    public final android.content.Context f223711z;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f223692d = false;

    /* renamed from: h, reason: collision with root package name */
    public int f223696h = 0;

    /* renamed from: t, reason: collision with root package name */
    public float f223705t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f223706u = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f223708w = new android.graphics.Rect();

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Paint f223709x = new android.graphics.Paint(6);

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f223710y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public long B = 0;
    public final java.lang.Runnable C = new com.p314xaae8f345.mm.p1006xc5476f33.gif.l(this);
    public final java.lang.Runnable D = new com.p314xaae8f345.mm.p1006xc5476f33.gif.m(this);

    public n(android.content.Context context, boolean z17, boolean z18, boolean z19, int i17, int[] iArr, java.lang.String str) {
        this.f223697i = null;
        this.f223700o = false;
        this.f223701p = true;
        this.f223702q = true;
        this.f223704s = 0;
        this.f223711z = context;
        android.content.res.Resources resources = context.getResources();
        this.A = resources;
        this.f223700o = z17;
        this.f223701p = z18;
        this.f223702q = z19;
        this.f223703r = str;
        this.f223694f = i17;
        this.f223695g = iArr;
        if (z17) {
            this.f223697i = e(i17);
        } else if (z18) {
            this.f223697i = e(iArr[0]);
        } else {
            int identifier = resources.getIdentifier(str.split("\\.")[0], "drawable", context.getPackageName());
            context.getPackageName();
            this.f223697i = e(identifier);
        }
        android.graphics.Bitmap bitmap = this.f223697i;
        if (bitmap != null) {
            this.f223698m = bitmap.getWidth();
            this.f223699n = this.f223697i.getHeight();
        } else {
            this.f223698m = 1;
            this.f223699n = 1;
        }
        if (iArr.length == 3) {
            this.f223693e = 300;
        } else {
            this.f223693e = 100;
        }
        this.f223704s = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void c() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void d() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17 = this.f223707v;
        android.graphics.Rect rect = this.f223708w;
        if (z17) {
            rect.set(getBounds());
            this.f223705t = rect.width() / this.f223698m;
            this.f223706u = rect.height() / this.f223699n;
            this.f223707v = false;
        }
        android.graphics.Paint paint = this.f223709x;
        if (paint.getShader() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMGIFGameDrawable", "shader is not null.");
            canvas.drawRect(rect, paint);
            return;
        }
        canvas.scale(this.f223705t, this.f223706u);
        if (this.f223700o) {
            android.graphics.Bitmap e17 = e(this.f223694f);
            this.f223697i = e17;
            if (e17 == null || e17.isRecycled()) {
                return;
            }
            canvas.drawBitmap(this.f223697i, 0.0f, 0.0f, paint);
            return;
        }
        if (!this.f223701p) {
            java.lang.String str = this.f223703r.split("\\.")[0];
            android.content.Context context = this.f223711z;
            int identifier = this.A.getIdentifier(str, "drawable", context.getPackageName());
            context.getPackageName();
            android.graphics.Bitmap e18 = e(identifier);
            this.f223697i = e18;
            if (e18 == null || e18.isRecycled()) {
                return;
            }
            canvas.drawBitmap(this.f223697i, 0.0f, 0.0f, paint);
            return;
        }
        int i17 = this.f223696h;
        int[] iArr = this.f223695g;
        android.graphics.Bitmap e19 = e(iArr[i17]);
        this.f223697i = e19;
        if (e19 != null && !e19.isRecycled()) {
            canvas.drawBitmap(this.f223697i, 0.0f, 0.0f, paint);
        }
        int i18 = this.f223696h + 1;
        this.f223696h = i18;
        int i19 = this.f223704s;
        java.lang.Runnable runnable = this.C;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f223710y;
        int i27 = this.f223693e;
        if (i19 < 3) {
            if (i18 >= iArr.length) {
                this.f223696h = 0;
                if (this.f223702q) {
                    this.f223704s = i19 + 1;
                } else {
                    this.f223704s = 0;
                }
            }
            long j17 = i27;
            this.B = android.os.SystemClock.uptimeMillis() + j17;
            if (n3Var != null) {
                n3Var.mo50297x7c4d7ca2(runnable, j17);
                return;
            }
            return;
        }
        this.f223701p = false;
        long j18 = i27;
        this.B = android.os.SystemClock.uptimeMillis() + j18;
        if (n3Var != null) {
            n3Var.mo50297x7c4d7ca2(runnable, j18);
        }
        java.lang.Runnable runnable2 = this.D;
        this.B = android.os.SystemClock.uptimeMillis() + 0;
        if (n3Var != null) {
            n3Var.mo50297x7c4d7ca2(runnable2, 0L);
        }
    }

    public android.graphics.Bitmap e(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(this.A);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gif/MMGIFGameDrawable", "getBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/gif/MMGIFGameDrawable", "getBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        return decodeResource;
    }

    /* renamed from: finalize */
    public void m65004xd764dc1e() {
        super.finalize();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f223699n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f223698m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f223692d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f223707v = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f223709x.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f223709x.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f223692d = true;
        this.f223710y.mo50293x3498a0(this.C);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f223692d = false;
    }
}

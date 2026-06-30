package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: f, reason: collision with root package name */
    private static final int f52450f = -16711681;

    /* renamed from: g, reason: collision with root package name */
    private static final int f52451g = 16711680;

    /* renamed from: h, reason: collision with root package name */
    private static final int f52452h = -256;

    /* renamed from: i, reason: collision with root package name */
    private static final int f52453i = 255;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bd f52454a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.oq f52455b;

    /* renamed from: c, reason: collision with root package name */
    public float f52456c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.locks.Lock f52457d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.locks.Lock f52458e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: j, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.content.Context> f52459j;

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.om f52460k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.hg f52461l;

    public w(android.content.Context context, com.tencent.mapsdk.internal.bd bdVar, com.tencent.mapsdk.internal.oq oqVar, com.tencent.mapsdk.internal.om omVar) {
        this.f52456c = 1.0f;
        this.f52459j = new java.lang.ref.WeakReference<>(context);
        this.f52454a = bdVar;
        this.f52455b = oqVar;
        this.f52460k = omVar;
        this.f52456c = com.tencent.mapsdk.internal.hs.a(context);
        if (bdVar.d() != null) {
            this.f52461l = ((com.tencent.mapsdk.internal.tr) bdVar.d()).f52273as.f49000c;
        }
    }

    private static int a(int i17) {
        return (i17 & f52450f & f52452h) | ((i17 & 255) << 16) | ((f52451g & i17) >> 16);
    }

    private com.tencent.mapsdk.engine.jni.models.IconImageInfo b(java.lang.String str) {
        com.tencent.mapsdk.engine.jni.models.IconImageInfo iconImageInfo = new com.tencent.mapsdk.engine.jni.models.IconImageInfo();
        iconImageInfo.scale = this.f52456c;
        iconImageInfo.anchorPointX1 = 0.5f;
        iconImageInfo.anchorPointY1 = 0.5f;
        iconImageInfo.bitmap = a(str, android.graphics.Bitmap.Config.RGB_565);
        return iconImageInfo;
    }

    private com.tencent.mapsdk.internal.bd d() {
        return this.f52454a;
    }

    public final void c() {
        com.tencent.mapsdk.internal.tk i17 = this.f52454a.i();
        i17.a(new com.tencent.mapsdk.internal.tk.AnonymousClass125(""));
    }

    public final com.tencent.mapsdk.engine.jni.models.IconImageInfo a(java.lang.String str) {
        com.tencent.mapsdk.internal.hg hgVar;
        com.tencent.mapsdk.internal.hg hgVar2;
        com.tencent.mapsdk.internal.hg hgVar3;
        java.lang.String[] split;
        android.graphics.Bitmap bitmap = null;
        if (this.f52460k == null) {
            return null;
        }
        com.tencent.mapsdk.engine.jni.models.IconImageInfo iconImageInfo = new com.tencent.mapsdk.engine.jni.models.IconImageInfo();
        iconImageInfo.anchorPointX1 = 0.5f;
        iconImageInfo.anchorPointY1 = 0.5f;
        if (str.startsWith("drawRoundRect")) {
            iconImageInfo.scale = 1.0f;
            java.lang.String substring = str.substring(14);
            if (!com.tencent.mapsdk.internal.hr.a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
                int parseInt = java.lang.Integer.parseInt(split[0]);
                int parseInt2 = java.lang.Integer.parseInt(split[1]);
                long parseLong = java.lang.Long.parseLong(split[2]);
                long parseLong2 = java.lang.Long.parseLong(split[3]);
                float parseFloat = java.lang.Float.parseFloat(split[4]);
                if (parseInt >= 0 && parseInt2 >= 0) {
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setAntiAlias(true);
                    paint.setStrokeWidth(parseFloat);
                    paint.setStyle(android.graphics.Paint.Style.STROKE);
                    paint.setColor(a((int) parseLong2));
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(parseInt, parseInt2, android.graphics.Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                    canvas.drawColor(a((int) parseLong));
                    android.graphics.RectF rectF = new android.graphics.RectF();
                    rectF.left = 0.0f;
                    rectF.top = 0.0f;
                    rectF.right = parseInt;
                    rectF.bottom = parseInt2;
                    canvas.drawRoundRect(rectF, parseInt >> 3, parseInt2 >> 3, paint);
                    bitmap = createBitmap;
                }
            }
            iconImageInfo.bitmap = bitmap;
            if (bitmap == null && (hgVar3 = this.f52461l) != null) {
                hgVar3.a().a(java.lang.System.currentTimeMillis(), str);
            }
            return iconImageInfo;
        }
        try {
            try {
                this.f52458e.lock();
                this.f52460k.a(str, iconImageInfo);
                this.f52458e.unlock();
                if (iconImageInfo.bitmap == null) {
                    str.equals(com.tencent.mapsdk.internal.om.f50593a);
                }
                if (iconImageInfo.bitmap == null && (hgVar2 = this.f52461l) != null) {
                    hgVar2.a().a(java.lang.System.currentTimeMillis(), str);
                }
                return iconImageInfo;
            } catch (java.lang.Throwable th6) {
                this.f52458e.unlock();
                throw th6;
            }
        } catch (java.lang.Exception unused) {
            if (iconImageInfo.bitmap == null && (hgVar = this.f52461l) != null) {
                hgVar.a().a(java.lang.System.currentTimeMillis(), str);
            }
            return null;
        }
    }

    private static android.graphics.Bitmap c(java.lang.String str) {
        java.lang.String[] split;
        java.lang.String substring = str.substring(14);
        if (!com.tencent.mapsdk.internal.hr.a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
            int parseInt = java.lang.Integer.parseInt(split[0]);
            int parseInt2 = java.lang.Integer.parseInt(split[1]);
            long parseLong = java.lang.Long.parseLong(split[2]);
            long parseLong2 = java.lang.Long.parseLong(split[3]);
            float parseFloat = java.lang.Float.parseFloat(split[4]);
            if (parseInt >= 0 && parseInt2 >= 0) {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setAntiAlias(true);
                paint.setStrokeWidth(parseFloat);
                paint.setStyle(android.graphics.Paint.Style.STROKE);
                paint.setColor(a((int) parseLong2));
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(parseInt, parseInt2, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                canvas.drawColor(a((int) parseLong));
                android.graphics.RectF rectF = new android.graphics.RectF();
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                rectF.right = parseInt;
                rectF.bottom = parseInt2;
                canvas.drawRoundRect(rectF, parseInt >> 3, parseInt2 >> 3, paint);
                return createBitmap;
            }
        }
        return null;
    }

    public final void b() {
        this.f52457d.unlock();
    }

    private boolean b(java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.internal.oq oqVar = this.f52455b;
        if (oqVar == null) {
            return false;
        }
        return a(new java.io.File(oqVar.e()), str, bArr, this.f52458e);
    }

    public final void a() {
        this.f52457d.lock();
    }

    private boolean a(java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.internal.oq oqVar = this.f52455b;
        if (oqVar == null) {
            return false;
        }
        return a(new java.io.File(oqVar.c()), str, bArr, this.f52457d);
    }

    public final android.graphics.Bitmap a(java.lang.String str, android.graphics.Bitmap.Config config) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (new java.io.File(str).exists() && (weakReference = this.f52459j) != null && weakReference.get() != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inPreferredConfig = config;
            try {
                return android.graphics.BitmapFactory.decodeFile(str, options);
            } catch (java.lang.OutOfMemoryError unused) {
            }
        }
        return null;
    }

    public static boolean a(java.io.File file, java.lang.String str, byte[] bArr, java.util.concurrent.locks.Lock lock) {
        if (!com.tencent.mapsdk.internal.hr.a(str) && bArr != null && bArr.length != 0) {
            java.lang.String str2 = str + "_" + java.util.Arrays.hashCode(bArr);
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
                java.io.File file2 = new java.io.File(file, str2);
                if (file2.exists()) {
                    file2.delete();
                }
                file2.createNewFile();
                com.tencent.mapsdk.internal.ks.a(file2, bArr);
                try {
                    if (!com.tencent.map.tools.Util.getMD5String(bArr).equals(com.tencent.mapsdk.internal.lh.a(file2))) {
                        return false;
                    }
                } catch (java.io.FileNotFoundException unused) {
                }
                java.io.File file3 = new java.io.File(file, str);
                java.io.File file4 = new java.io.File(file, str + ".bak");
                if (file4.exists() && !file4.delete()) {
                    file4.deleteOnExit();
                    return false;
                }
                try {
                    lock.lock();
                    if (file3.exists() && !file3.renameTo(file4)) {
                        if (!file2.delete()) {
                            file2.deleteOnExit();
                        }
                        return false;
                    }
                    if (!file2.renameTo(file3)) {
                        file4.renameTo(file3);
                        if (!file2.delete()) {
                            file2.deleteOnExit();
                        }
                        return false;
                    }
                    if (!file4.delete()) {
                        file4.deleteOnExit();
                    }
                    lock.unlock();
                    return true;
                } finally {
                    lock.unlock();
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        return false;
    }
}

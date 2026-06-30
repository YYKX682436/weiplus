package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: f, reason: collision with root package name */
    private static final int f133983f = -16711681;

    /* renamed from: g, reason: collision with root package name */
    private static final int f133984g = 16711680;

    /* renamed from: h, reason: collision with root package name */
    private static final int f133985h = -256;

    /* renamed from: i, reason: collision with root package name */
    private static final int f133986i = 255;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f133987a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq f133988b;

    /* renamed from: c, reason: collision with root package name */
    public float f133989c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.locks.Lock f133990d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.locks.Lock f133991e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: j, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.content.Context> f133992j;

    /* renamed from: k, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om f133993k;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg f133994l;

    public w(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om omVar) {
        this.f133989c = 1.0f;
        this.f133992j = new java.lang.ref.WeakReference<>(context);
        this.f133987a = bdVar;
        this.f133988b = oqVar;
        this.f133993k = omVar;
        this.f133989c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hs.a(context);
        if (bdVar.d() != null) {
            this.f133994l = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d()).f133806as.f130533c;
        }
    }

    private static int a(int i17) {
        return (i17 & f133983f & f133985h) | ((i17 & 255) << 16) | ((f133984g & i17) >> 16);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 b(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 c4388xc6dd6810 = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810();
        c4388xc6dd6810.f17352x683094a = this.f133989c;
        c4388xc6dd6810.f17349x578b8bf4 = 0.5f;
        c4388xc6dd6810.f17350x578b8c13 = 0.5f;
        c4388xc6dd6810.f17351xad38f12f = a(str, android.graphics.Bitmap.Config.RGB_565);
        return c4388xc6dd6810;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd d() {
        return this.f133987a;
    }

    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk i17 = this.f133987a.i();
        i17.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass125(""));
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar2;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar3;
        java.lang.String[] split;
        android.graphics.Bitmap bitmap = null;
        if (this.f133993k == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810 c4388xc6dd6810 = new com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4388xc6dd6810();
        c4388xc6dd6810.f17349x578b8bf4 = 0.5f;
        c4388xc6dd6810.f17350x578b8c13 = 0.5f;
        if (str.startsWith("drawRoundRect")) {
            c4388xc6dd6810.f17352x683094a = 1.0f;
            java.lang.String substring = str.substring(14);
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
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
            c4388xc6dd6810.f17351xad38f12f = bitmap;
            if (bitmap == null && (hgVar3 = this.f133994l) != null) {
                hgVar3.a().a(java.lang.System.currentTimeMillis(), str);
            }
            return c4388xc6dd6810;
        }
        try {
            try {
                this.f133991e.lock();
                this.f133993k.a(str, c4388xc6dd6810);
                this.f133991e.unlock();
                if (c4388xc6dd6810.f17351xad38f12f == null) {
                    str.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.om.f132126a);
                }
                if (c4388xc6dd6810.f17351xad38f12f == null && (hgVar2 = this.f133994l) != null) {
                    hgVar2.a().a(java.lang.System.currentTimeMillis(), str);
                }
                return c4388xc6dd6810;
            } catch (java.lang.Throwable th6) {
                this.f133991e.unlock();
                throw th6;
            }
        } catch (java.lang.Exception unused) {
            if (c4388xc6dd6810.f17351xad38f12f == null && (hgVar = this.f133994l) != null) {
                hgVar.a().a(java.lang.System.currentTimeMillis(), str);
            }
            return null;
        }
    }

    private static android.graphics.Bitmap c(java.lang.String str) {
        java.lang.String[] split;
        java.lang.String substring = str.substring(14);
        if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
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
        this.f133990d.unlock();
    }

    private boolean b(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar = this.f133988b;
        if (oqVar == null) {
            return false;
        }
        return a(new java.io.File(oqVar.e()), str, bArr, this.f133991e);
    }

    public final void a() {
        this.f133990d.lock();
    }

    private boolean a(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oq oqVar = this.f133988b;
        if (oqVar == null) {
            return false;
        }
        return a(new java.io.File(oqVar.c()), str, bArr, this.f133990d);
    }

    public final android.graphics.Bitmap a(java.lang.String str, android.graphics.Bitmap.Config config) {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (new java.io.File(str).exists() && (weakReference = this.f133992j) != null && weakReference.get() != null) {
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
        if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str) && bArr != null && bArr.length != 0) {
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
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file2, bArr);
                try {
                    if (!com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35833x40453099(bArr).equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(file2))) {
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

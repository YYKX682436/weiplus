package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    protected static android.graphics.Paint f131303a = null;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mapsdk.internal.hl.a f131304b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f131305c = 2048;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f131306d = "BitmapUtil";

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f131307e;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static final java.util.concurrent.atomic.AtomicInteger f131308b = new java.util.concurrent.atomic.AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh> f131309a;

        public a(android.content.Context context, int i17, int i18) {
            java.io.File c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).c();
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kk.a("5.10.0", "4.4.6")) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(new java.io.File(c17, "BitmapDescriptorCache"), new java.io.File(c17, "bitmaps"));
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a aVar = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a(i17);
            aVar.f130274b = i18;
            aVar.f130276d = true;
            aVar.f130275c = new com.tencent.mapsdk.internal.jy.b<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh>() { // from class: com.tencent.mapsdk.internal.hl.a.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh khVar) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh khVar2 = khVar;
                    if (khVar2 == null) {
                        return true;
                    }
                    java.lang.String str = khVar2.f131617f;
                    if (!khVar2.f() || str == null) {
                        return true;
                    }
                    com.tencent.mapsdk.internal.hl.a.this.f131309a.a(str);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh khVar) {
                    if (khVar == null) {
                        return true;
                    }
                    java.lang.String str = khVar.f131617f;
                    if (!khVar.f() || str == null) {
                        return true;
                    }
                    com.tencent.mapsdk.internal.hl.a.this.f131309a.a(str);
                    return true;
                }
            };
            this.f131309a = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh.class, aVar);
            a();
        }

        public static int b() {
            return f131308b.get();
        }

        public final synchronized void c() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = f131308b;
            if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() == 0) {
                this.f131309a.j();
            }
        }

        public static void a() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = f131308b;
            if (atomicInteger.get() < 0) {
                atomicInteger.set(0);
            }
            atomicInteger.incrementAndGet();
        }

        public final synchronized boolean b(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh a17 = this.f131309a.a(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh.class);
            if (a17 == null || !a17.f()) {
                return false;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "remove:" + str + " bitmapData:" + a17);
            this.f131309a.a(str);
            return true;
        }

        public final synchronized void a(java.lang.String str, android.graphics.Bitmap bitmap) {
            a(str, new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh(bitmap));
        }

        private synchronized void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh khVar) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "putCache:" + str + " id:" + khVar.f131617f + " bitmapData:" + khVar);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh a17 = this.f131309a.a(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh.class);
            if (a17 != null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "getCache:" + str + " id:" + a17.f131617f + " recycle:" + a17.g() + " bitmapData:" + a17);
            }
            if (a17 != null && !a17.g() && !android.text.TextUtils.isEmpty(a17.f131617f) && a17.f131617f.equals(khVar.f131617f)) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "same bitmap!!".concat(java.lang.String.valueOf(str)));
                a17.e();
            } else {
                this.f131309a.b(str, (java.lang.String) khVar);
            }
        }

        public final synchronized android.graphics.Bitmap a(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh b17 = this.f131309a.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kh.class);
            if (b17 == null) {
                return null;
            }
            return b17.c();
        }
    }

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f131303a = paint;
        paint.setAntiAlias(true);
    }

    private static android.graphics.Bitmap a(int[] iArr, int i17, int i18, android.graphics.Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(iArr, i17, i18, config);
    }

    public static android.graphics.Bitmap b(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        r0 = null;
        android.graphics.Bitmap bitmap = null;
        try {
            inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).e() + str);
            if (inputStream == null) {
                try {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.a() != null) {
                        inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b(context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.a() + str);
                    } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b() != null) {
                        inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b() + str);
                    }
                } catch (java.lang.Exception | java.lang.OutOfMemoryError unused) {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream2 = inputStream;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream2);
                    throw th;
                }
            }
            if (inputStream == null) {
                inputStream = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mw.b(context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.f131338d.concat(java.lang.String.valueOf(str)));
            }
            bitmap = android.graphics.BitmapFactory.decodeStream(inputStream);
        } catch (java.lang.Exception | java.lang.OutOfMemoryError unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
        return bitmap;
    }

    private static byte[] c(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        if (bitmap == null || bitmap.isRecycled()) {
            return new byte[0];
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream);
            return byteArray;
        } catch (java.lang.Throwable th7) {
            th = th7;
            byteArrayOutputStream2 = byteArrayOutputStream;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(byteArrayOutputStream2);
            throw th;
        }
    }

    private static android.graphics.Bitmap d(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap a17;
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (bitmap.isRecycled() || width <= 0 || height <= 0 || (a17 = a(width, height, android.graphics.Bitmap.Config.ARGB_8888)) == null) {
                return null;
            }
            a17.setDensity(bitmap.getDensity());
            android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
            a17.eraseColor(0);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, f131303a);
            return a17;
        }
        return null;
    }

    private static android.graphics.Bitmap e(android.graphics.Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
            try {
                return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            } catch (java.lang.OutOfMemoryError unused) {
                try {
                    return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                } catch (java.lang.OutOfMemoryError unused2) {
                }
            }
        }
        return null;
    }

    private static android.graphics.drawable.Drawable f(android.graphics.Bitmap bitmap) {
        return new android.graphics.drawable.BitmapDrawable(bitmap);
    }

    private static android.graphics.Bitmap g(android.graphics.Bitmap bitmap) {
        try {
            return android.graphics.Bitmap.createBitmap(bitmap);
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    public static byte[] a() {
        android.graphics.Bitmap a17;
        if (f131307e == null && (a17 = a(256, 256, android.graphics.Bitmap.Config.ARGB_8888)) != null) {
            new android.graphics.Canvas(a17).drawARGB(0, 255, 255, 255);
            f131307e = c(a17);
        }
        return f131307e;
    }

    private static android.graphics.Bitmap c(java.lang.String str, int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.text.TextPaint textPaint = new android.text.TextPaint(65);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize(i17);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(str, textPaint, java.lang.Math.round(rect.width()), android.text.Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        android.graphics.Bitmap a17 = a(staticLayout.getWidth(), staticLayout.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (a17 == null) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a17;
    }

    public static android.graphics.Bitmap a(android.view.View view) {
        android.graphics.Bitmap bitmap;
        if (view != null) {
            try {
                synchronized (view) {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    view.setDrawingCacheEnabled(true);
                    view.buildDrawingCache();
                    android.graphics.Bitmap drawingCache = view.getDrawingCache();
                    if (drawingCache != null && !drawingCache.isRecycled()) {
                        int width = drawingCache.getWidth();
                        int height = drawingCache.getHeight();
                        if (!drawingCache.isRecycled() && width > 0 && height > 0 && (bitmap = a(width, height, android.graphics.Bitmap.Config.ARGB_8888)) != null) {
                            bitmap.setDensity(drawingCache.getDensity());
                            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                            bitmap.eraseColor(0);
                            canvas.drawBitmap(drawingCache, 0.0f, 0.0f, f131303a);
                            view.destroyDrawingCache();
                        }
                    }
                    bitmap = null;
                    view.destroyDrawingCache();
                }
                return bitmap;
            } catch (java.lang.Throwable th6) {
                android.util.Log.getStackTraceString(th6);
            }
        }
        return null;
    }

    public static android.graphics.Bitmap b(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        try {
            return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b()), (int) (bitmap.getHeight() / com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.b()), true);
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    private static android.graphics.Bitmap b(java.lang.String str, int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.text.TextPaint textPaint = new android.text.TextPaint(65);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize(i17);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(str, textPaint, java.lang.Math.round(rect.width()), android.text.Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        android.graphics.Bitmap a17 = a(staticLayout.getWidth(), staticLayout.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (a17 == null) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a17;
    }

    public static android.graphics.Bitmap c(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        r0 = null;
        android.graphics.Bitmap bitmap = null;
        try {
            inputStream = context.getAssets().open(str);
        } catch (java.lang.Exception unused) {
            inputStream = null;
        } catch (java.lang.OutOfMemoryError unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            bitmap = android.graphics.BitmapFactory.decodeStream(inputStream);
        } catch (java.lang.Exception unused3) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
            return null;
        } catch (java.lang.OutOfMemoryError unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream2 = inputStream;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream2);
            throw th;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a((java.io.Closeable) inputStream);
        return bitmap;
    }

    private static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, int i17, int i18) {
        android.graphics.Bitmap a17;
        if (bitmap == null || bitmap.isRecycled() || i17 <= 0 || i18 <= 0 || (a17 = a(i17, i18, android.graphics.Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        a17.setDensity(bitmap.getDensity());
        android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
        a17.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, f131303a);
        return a17;
    }

    public static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, android.content.Context context, int i17, int i18) {
        int min;
        int min2;
        android.graphics.Bitmap a17;
        if (bitmap == null || bitmap.isRecycled() || i17 <= 0 || i18 <= 0 || (a17 = a((min = java.lang.Math.min(i17, 2048)), (min2 = java.lang.Math.min(i18, 2048)), android.graphics.Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        a17.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, min, min2);
        bitmapDrawable.draw(canvas);
        return a17;
    }

    public static java.lang.String a(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("@");
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getAllocationByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        sb6.append(width);
        sb6.append("x");
        sb6.append(height);
        sb6.append("@");
        sb6.append(com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35833x40453099(allocate.array()));
        allocate.clear();
        return sb6.toString();
    }

    private static boolean a(android.graphics.Bitmap bitmap, java.lang.String str, android.graphics.Bitmap.CompressFormat compressFormat) {
        if (bitmap != null && !bitmap.isRecycled() && !android.text.TextUtils.isEmpty(str)) {
            java.io.FileOutputStream fileOutputStream = null;
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(str);
                try {
                    bitmap.compress(compressFormat, 100, fileOutputStream2);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream2);
                    return true;
                } catch (java.lang.Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream);
                    return false;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(fileOutputStream);
                    throw th;
                }
            } catch (java.lang.Exception unused2) {
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return false;
    }

    private static boolean a(android.graphics.Bitmap bitmap, java.lang.String str) {
        return a(bitmap, str, android.graphics.Bitmap.CompressFormat.PNG);
    }

    private static android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        if (!(drawable instanceof android.graphics.drawable.NinePatchDrawable)) {
            return null;
        }
        android.graphics.Bitmap a17 = a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565);
        if (a17 == null) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return a17;
    }

    private static android.graphics.Bitmap a(int i17, int i18, android.graphics.Bitmap.Config config) {
        try {
            try {
                return android.graphics.Bitmap.createBitmap(i17, i18, config);
            } catch (java.lang.OutOfMemoryError unused) {
                return android.graphics.Bitmap.createBitmap(i17, i18, config);
            }
        } catch (java.lang.OutOfMemoryError unused2) {
            return null;
        }
    }

    private static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, float f17) {
        if (bitmap == null || f17 == 1.0f) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(f17, f17);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static byte[] a(android.graphics.Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressFormat) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r4 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L62
            java.lang.String r1 = r4.trim()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            if (r1 != 0) goto Le
            goto L62
        Le:
            java.lang.String r1 = r4.trim()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r2 = 0
            char r1 = r1.charAt(r2)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r2 = 47
            if (r1 == r2) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r1.append(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r1.append(r4)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            goto L47
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r1.append(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r1.append(r4)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
        L47:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5e
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L5f
        L50:
            r4.close()     // Catch: java.lang.Exception -> L62
            goto L62
        L54:
            r3 = move-exception
            r0 = r4
            goto L58
        L57:
            r3 = move-exception
        L58:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.lang.Exception -> L5d
        L5d:
            throw r3
        L5e:
            r4 = r0
        L5f:
            if (r4 == 0) goto L62
            goto L50
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    public static final android.graphics.Bitmap a(java.lang.String str) {
        try {
            return android.graphics.BitmapFactory.decodeFile(str);
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    public static android.graphics.Bitmap a(android.content.Context context, int i17) {
        try {
            return android.graphics.BitmapFactory.decodeResource(context.getResources(), i17);
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }

    private static android.graphics.Bitmap a(java.lang.String str, int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.text.TextPaint textPaint = new android.text.TextPaint(65);
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize(i17);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(str, textPaint, java.lang.Math.round(rect.width()), android.text.Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        android.graphics.Bitmap a17 = a(staticLayout.getWidth(), staticLayout.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (a17 == null) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(a17);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a17;
    }
}

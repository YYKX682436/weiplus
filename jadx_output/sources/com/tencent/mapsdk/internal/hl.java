package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    protected static android.graphics.Paint f49770a = null;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mapsdk.internal.hl.a f49771b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f49772c = 2048;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f49773d = "BitmapUtil";

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f49774e;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static final java.util.concurrent.atomic.AtomicInteger f49775b = new java.util.concurrent.atomic.AtomicInteger();

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.mapsdk.core.utils.cache.MemoryCache<com.tencent.mapsdk.internal.kh> f49776a;

        public a(android.content.Context context, int i17, int i18) {
            java.io.File c17 = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).c();
            if (com.tencent.mapsdk.internal.kk.a("5.10.0", "4.4.6")) {
                com.tencent.mapsdk.internal.ks.a(new java.io.File(c17, "BitmapDescriptorCache"), new java.io.File(c17, "bitmaps"));
            }
            com.tencent.mapsdk.core.utils.cache.MemoryCache.a aVar = new com.tencent.mapsdk.core.utils.cache.MemoryCache.a(i17);
            aVar.f48741b = i18;
            aVar.f48743d = true;
            aVar.f48742c = new com.tencent.mapsdk.internal.jy.b<com.tencent.mapsdk.internal.kh>() { // from class: com.tencent.mapsdk.internal.hl.a.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.tencent.mapsdk.internal.kh khVar) {
                    com.tencent.mapsdk.internal.kh khVar2 = khVar;
                    if (khVar2 == null) {
                        return true;
                    }
                    java.lang.String str = khVar2.f50084f;
                    if (!khVar2.f() || str == null) {
                        return true;
                    }
                    com.tencent.mapsdk.internal.hl.a.this.f49776a.a(str);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.tencent.mapsdk.internal.kh khVar) {
                    if (khVar == null) {
                        return true;
                    }
                    java.lang.String str = khVar.f50084f;
                    if (!khVar.f() || str == null) {
                        return true;
                    }
                    com.tencent.mapsdk.internal.hl.a.this.f49776a.a(str);
                    return true;
                }
            };
            this.f49776a = (com.tencent.mapsdk.core.utils.cache.MemoryCache) com.tencent.mapsdk.internal.kc.a(i17, com.tencent.mapsdk.internal.kh.class, aVar);
            a();
        }

        public static int b() {
            return f49775b.get();
        }

        public final synchronized void c() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = f49775b;
            if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() == 0) {
                this.f49776a.j();
            }
        }

        public static void a() {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = f49775b;
            if (atomicInteger.get() < 0) {
                atomicInteger.set(0);
            }
            atomicInteger.incrementAndGet();
        }

        public final synchronized boolean b(java.lang.String str) {
            com.tencent.mapsdk.internal.kh a17 = this.f49776a.a(str, com.tencent.mapsdk.internal.kh.class);
            if (a17 == null || !a17.f()) {
                return false;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50218s, "remove:" + str + " bitmapData:" + a17);
            this.f49776a.a(str);
            return true;
        }

        public final synchronized void a(java.lang.String str, android.graphics.Bitmap bitmap) {
            a(str, new com.tencent.mapsdk.internal.kh(bitmap));
        }

        private synchronized void a(java.lang.String str, com.tencent.mapsdk.internal.kh khVar) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50218s, "putCache:" + str + " id:" + khVar.f50084f + " bitmapData:" + khVar);
            com.tencent.mapsdk.internal.kh a17 = this.f49776a.a(str, com.tencent.mapsdk.internal.kh.class);
            if (a17 != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50218s, "getCache:" + str + " id:" + a17.f50084f + " recycle:" + a17.g() + " bitmapData:" + a17);
            }
            if (a17 != null && !a17.g() && !android.text.TextUtils.isEmpty(a17.f50084f) && a17.f50084f.equals(khVar.f50084f)) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50218s, "same bitmap!!".concat(java.lang.String.valueOf(str)));
                a17.e();
            } else {
                this.f49776a.b(str, (java.lang.String) khVar);
            }
        }

        public final synchronized android.graphics.Bitmap a(java.lang.String str) {
            com.tencent.mapsdk.internal.kh b17 = this.f49776a.b(str, com.tencent.mapsdk.internal.kh.class);
            if (b17 == null) {
                return null;
            }
            return b17.c();
        }
    }

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f49770a = paint;
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
            inputStream = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).e() + str);
            if (inputStream == null) {
                try {
                    if (com.tencent.mapsdk.internal.mw.a() != null) {
                        inputStream = com.tencent.mapsdk.internal.mw.b(context, com.tencent.mapsdk.internal.mw.a() + str);
                    } else if (com.tencent.mapsdk.internal.mw.b() != null) {
                        inputStream = com.tencent.mapsdk.internal.kt.b(com.tencent.mapsdk.internal.mw.b() + str);
                    }
                } catch (java.lang.Exception | java.lang.OutOfMemoryError unused) {
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream2 = inputStream;
                    com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream2);
                    throw th;
                }
            }
            if (inputStream == null) {
                inputStream = com.tencent.mapsdk.internal.mw.b(context, com.tencent.mapsdk.internal.hn.f49805d.concat(java.lang.String.valueOf(str)));
            }
            bitmap = android.graphics.BitmapFactory.decodeStream(inputStream);
        } catch (java.lang.Exception | java.lang.OutOfMemoryError unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
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
            com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream);
            return byteArray;
        } catch (java.lang.Throwable th7) {
            th = th7;
            byteArrayOutputStream2 = byteArrayOutputStream;
            com.tencent.mapsdk.internal.kt.a(byteArrayOutputStream2);
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
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, f49770a);
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
        if (f49774e == null && (a17 = a(256, 256, android.graphics.Bitmap.Config.ARGB_8888)) != null) {
            new android.graphics.Canvas(a17).drawARGB(0, 255, 255, 255);
            f49774e = c(a17);
        }
        return f49774e;
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
                            canvas.drawBitmap(drawingCache, 0.0f, 0.0f, f49770a);
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
            return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / com.tencent.mapsdk.internal.hn.b()), (int) (bitmap.getHeight() / com.tencent.mapsdk.internal.hn.b()), true);
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
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
            return null;
        } catch (java.lang.OutOfMemoryError unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream2 = inputStream;
            com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream2);
            throw th;
        }
        com.tencent.mapsdk.internal.kt.a((java.io.Closeable) inputStream);
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
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, f49770a);
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
        sb6.append(com.tencent.map.tools.Util.getMD5String(allocate.array()));
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
                    com.tencent.mapsdk.internal.kt.a(fileOutputStream2);
                    return true;
                } catch (java.lang.Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    com.tencent.mapsdk.internal.kt.a(fileOutputStream);
                    return false;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    fileOutputStream = fileOutputStream2;
                    com.tencent.mapsdk.internal.kt.a(fileOutputStream);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.hl.a(android.content.Context, java.lang.String):android.graphics.Bitmap");
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

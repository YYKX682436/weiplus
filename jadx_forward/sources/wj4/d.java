package wj4;

/* loaded from: classes13.dex */
public final class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f528296a;

    /* renamed from: b, reason: collision with root package name */
    public final bi4.i1 f528297b;

    /* renamed from: c, reason: collision with root package name */
    public final float f528298c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f528299d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f528300e;

    /* renamed from: f, reason: collision with root package name */
    public int f528301f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f528302g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f528303h;

    /* renamed from: i, reason: collision with root package name */
    public long f528304i;

    /* renamed from: j, reason: collision with root package name */
    public wj4.b f528305j;

    public d(android.view.View view, bi4.i1 config, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f528296a = view;
        this.f528297b = config;
        this.f528298c = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setDither(true);
        this.f528299d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setDither(true);
        this.f528300e = paint2;
        this.f528301f = 255;
    }

    public static final void b(android.graphics.Bitmap bitmap, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var4, int i18, int i19) {
        int g17 = e3.b.g(bitmap.getPixel(i18, i19), i17);
        g0Var.f391654d += android.graphics.Color.red(g17);
        g0Var2.f391654d += android.graphics.Color.green(g17);
        g0Var3.f391654d += android.graphics.Color.blue(g17);
        g0Var4.f391654d++;
    }

    public final java.lang.Integer a(android.graphics.Bitmap bitmap, boolean z17) {
        int i17 = z17 ? -16777216 : -1;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var4 = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        int i18 = 3;
        int width = bitmap.getWidth() - 3;
        int height = bitmap.getHeight() - 3;
        int i19 = 3;
        while (true) {
            int i27 = 2;
            if (i19 >= width) {
                break;
            }
            int i28 = 0;
            while (i28 < i27) {
                int i29 = i17;
                int i37 = i28;
                int i38 = i19;
                b(bitmap, i29, g0Var, g0Var2, g0Var3, g0Var4, i19, i18 + i28);
                b(bitmap, i29, g0Var, g0Var2, g0Var3, g0Var4, i38, (height - 1) - i37);
                i28 = i37 + 1;
                i27 = i27;
                i19 = i38;
                i18 = 3;
            }
            i19++;
            i18 = 3;
        }
        int i39 = height - 2;
        for (int i47 = 5; i47 < i39; i47++) {
            int i48 = 0;
            while (i48 < 2) {
                int i49 = i17;
                int i57 = i48;
                b(bitmap, i49, g0Var, g0Var2, g0Var3, g0Var4, 3 + i48, i47);
                b(bitmap, i49, g0Var, g0Var2, g0Var3, g0Var4, (width - 1) - i57, i47);
                i48 = i57 + 1;
            }
        }
        long j17 = g0Var4.f391654d;
        if (j17 <= 0) {
            return null;
        }
        return java.lang.Integer.valueOf(android.graphics.Color.rgb((int) (g0Var.f391654d / j17), (int) (g0Var2.f391654d / j17), (int) (g0Var3.f391654d / j17)));
    }

    public final void c(android.graphics.Canvas canvas, float f17, int i17, android.graphics.Paint paint) {
        if (f17 <= 0.0f || android.graphics.Color.alpha(i17) <= 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getBounds(), "getBounds(...)");
        float f18 = f17 / 2.0f;
        float f19 = r1.left + f18;
        float f27 = r1.top + f18;
        float f28 = r1.right - f18;
        float f29 = r1.bottom - f18;
        android.graphics.RectF rectF = (f28 <= f19 || f29 <= f27) ? null : new android.graphics.RectF(f19, f27, f28, f29);
        if (rectF == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getBounds(), "getBounds(...)");
        float min = java.lang.Math.min(r1.width(), r1.height()) - f17;
        if (min < 0.0f) {
            min = 0.0f;
        }
        float f37 = min / 2.0f;
        float f38 = this.f528298c - f18;
        float min2 = java.lang.Math.min(f38 >= 0.0f ? f38 : 0.0f, f37);
        paint.setStrokeWidth(f17);
        if (this.f528301f < 255) {
            i17 = e3.b.i(i17, (android.graphics.Color.alpha(i17) * this.f528301f) / 255);
        }
        paint.setColor(i17);
        canvas.drawRoundRect(rectF, min2, min2, paint);
    }

    public final java.lang.String d(int i17) {
        java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "#%08X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        e(r0, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            bi4.i1 r0 = r6.f528297b
            java.lang.String r1 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            android.graphics.Rect r1 = r6.getBounds()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            return
        L12:
            r1 = 0
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L58
            float r2 = r6.f528298c     // Catch: java.lang.Throwable -> L58
            wj4.b r3 = r6.f()     // Catch: java.lang.Throwable -> L58
            wj4.c r2 = r6.g(r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h     // Catch: java.lang.Throwable -> L58
            r4 = 788529167(0x2f00000f, float:1.1641553E-10)
            r5 = 1
            if (r3 == r4) goto L2f
            r4 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r3 != r4) goto L2d
            goto L2f
        L2d:
            r3 = r1
            goto L30
        L2f:
            r3 = r5
        L30:
            if (r3 != 0) goto L3a
            boolean r3 = z65.c.a()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L39
            goto L3a
        L39:
            r5 = r1
        L3a:
            if (r5 == 0) goto L3f
            r6.e(r0, r2)     // Catch: java.lang.Throwable -> L58
        L3f:
            float r0 = r2.f528291f     // Catch: java.lang.Throwable -> L58
            int r3 = r2.f528292g     // Catch: java.lang.Throwable -> L58
            android.graphics.Paint r4 = r6.f528300e     // Catch: java.lang.Throwable -> L58
            r6.c(r7, r0, r3, r4)     // Catch: java.lang.Throwable -> L58
            float r0 = r2.f528289d     // Catch: java.lang.Throwable -> L58
            int r2 = r2.f528290e     // Catch: java.lang.Throwable -> L58
            android.graphics.Paint r3 = r6.f528299d     // Catch: java.lang.Throwable -> L58
            r6.c(r7, r0, r2, r3)     // Catch: java.lang.Throwable -> L58
            jz5.f0 r7 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)     // Catch: java.lang.Throwable -> L58
            goto L63
        L58:
            r7 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r7 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r7)
            java.lang.Object r7 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r7)
        L63:
            java.lang.Throwable r7 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r7)
            if (r7 == 0) goto L72
            java.lang.String r0 = "applyCardStroke: draw foreground failed, skip this frame"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "StatusCardStrokeForegroundDrawable"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r7, r0, r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj4.d.draw(android.graphics.Canvas):void");
    }

    public final void e(bi4.i1 i1Var, wj4.c cVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(cVar.f528286a);
        sb6.append('|');
        boolean z17 = cVar.f528287b;
        sb6.append(z17);
        sb6.append('|');
        float f17 = cVar.f528289d;
        sb6.append(f17);
        sb6.append('|');
        float f18 = cVar.f528291f;
        sb6.append(f18);
        sb6.append('|');
        int i17 = cVar.f528290e;
        sb6.append(i17);
        sb6.append('|');
        int i18 = cVar.f528292g;
        sb6.append(i18);
        sb6.append('|');
        float f19 = cVar.f528288c;
        sb6.append(f19);
        sb6.append('|');
        java.util.Locale locale = java.util.Locale.ROOT;
        double d17 = cVar.f528294i;
        java.lang.String format = java.lang.String.format(locale, "%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append('|');
        int i19 = cVar.f528293h;
        sb6.append(i19);
        sb6.append('|');
        java.lang.String str = cVar.f528295j;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sb7, this.f528302g)) {
            return;
        }
        this.f528302g = sb7;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("applyCardStroke: branch=");
        sb8.append(cVar.f528286a);
        sb8.append(", widthPx=");
        sb8.append(f17);
        sb8.append(", supportWidthPx=");
        sb8.append(f18);
        sb8.append(", primaryColor=");
        sb8.append(d(i17));
        sb8.append(", supportColor=");
        sb8.append(d(i18));
        sb8.append(", edgeColor=");
        sb8.append(d(i19));
        sb8.append(", contrast=");
        java.lang.String format2 = java.lang.String.format(locale, "%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        sb8.append(format2);
        sb8.append(", source=");
        sb8.append(str);
        sb8.append(", cornerRadiusPx=");
        sb8.append(f19);
        sb8.append(", darkMode=");
        sb8.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusCardStrokeForegroundDrawable", sb8.toString());
    }

    public final wj4.b f() {
        java.lang.Object m143895xf1229813;
        wj4.b bVar;
        android.view.View view = this.f528296a;
        if (view == null) {
            return this.f528305j;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return this.f528305j;
        }
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(view.hashCode());
        sb6.append('|');
        sb6.append(view.getWidth());
        sb6.append('|');
        sb6.append(view.getHeight());
        sb6.append('|');
        sb6.append(C);
        java.lang.String sb7 = sb6.toString();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sb7, this.f528303h) && (bVar = this.f528305j) != null && uptimeMillis - this.f528304i < 250) {
            return bVar;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(h(view, C));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        wj4.b bVar2 = (wj4.b) m143895xf1229813;
        if (bVar2 == null) {
            return this.f528305j;
        }
        this.f528303h = sb7;
        this.f528304i = uptimeMillis;
        this.f528305j = bVar2;
        return bVar2;
    }

    public final wj4.c g(bi4.i1 i1Var, float f17, wj4.b bVar) {
        java.lang.String str;
        java.lang.String str2;
        float f18 = i1Var.f102589a;
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        boolean z17 = false;
        boolean z18 = (i17 == 788529167 || i17 == 788529166) || z65.c.a();
        int i18 = i1Var.f102590b;
        if (z18) {
            bm5.o1 o1Var = bm5.o1.f104252a;
            java.lang.Float f19 = r26.g0.f(o1Var.l(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.v4.C20741xdd631bfb()));
            if (f19 != null) {
                f18 = f19.floatValue();
            }
            java.lang.String l17 = o1Var.l(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.v4.C20740xdc4c1d98());
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17, "FG2")) {
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l17, "FG3")) {
                i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835;
            }
        }
        if (r2 < 1) {
            r2 = 1;
        }
        float f27 = r2;
        int m9702x7444d5ad = b3.l.m9702x7444d5ad(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i18);
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        int i19 = C ? -16777216 : -1;
        if (bVar != null) {
            i19 = bVar.f528284a;
        }
        int i27 = i19;
        int i28 = e3.b.i(m9702x7444d5ad, 255);
        double d17 = e3.b.d(i28, i27);
        if (C && d17 < 2.4d) {
            z17 = true;
        }
        if (!z17) {
            return new wj4.c(bVar != null ? "base_sampled" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, C, f17, f27, m9702x7444d5ad, 0.0f, 0, i27, d17, (bVar == null || (str2 = bVar.f528285b) == null) ? "fallback_theme" : str2);
        }
        double d18 = e06.p.d((2.4d - d17) / 1.2d, 0.0d, 1.0d);
        float f28 = (float) d18;
        float f29 = f27 + 0.75f + (0.75f * f28);
        int a17 = a06.d.a(24 + (44 * d18));
        if (a17 > 80) {
            a17 = 80;
        }
        float f37 = (f28 * 0.3f) + 0.46f;
        if (f37 > 0.82f) {
            f37 = 0.82f;
        }
        return new wj4.c(bVar != null ? "boost_sampled" : "boost", true, f17, f27, m9702x7444d5ad, f29, e3.b.i(e3.b.c(i28, -1, f37), a17), i27, d17, (bVar == null || (str = bVar.f528285b) == null) ? "fallback_theme" : str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final wj4.b h(android.view.View view, boolean z17) {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(24);
        arrayList.add(24);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable", "sampleCardStrokeContentSnapshot", "(Landroid/view/View;Z)Lcom/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable$CardStrokeContentSnapshot;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        int i17 = 1;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable", "sampleCardStrokeContentSnapshot", "(Landroid/view/View;Z)Lcom/tencent/mm/plugin/textstatus/ui/drawable/StatusCardStrokeForegroundDrawable$CardStrokeContentSnapshot;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            int width = view.getWidth();
            if (width < 1) {
                width = 1;
            }
            float f17 = 24.0f / width;
            int height = view.getHeight();
            if (height >= 1) {
                i17 = height;
            }
            canvas.scale(f17, 24.0f / i17);
            view.draw(canvas);
            java.lang.Integer a17 = a(createBitmap, z17);
            return a17 != null ? new wj4.b(a17.intValue(), "sampled") : null;
        } finally {
            createBitmap.recycle();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f528301f = e06.p.f(i17, 0, 255);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f528299d.setColorFilter(colorFilter);
        this.f528300e.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

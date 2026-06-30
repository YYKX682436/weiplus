package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44;

/* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView */
/* loaded from: classes13.dex */
public class C19202xeb785e00 extends android.view.View {
    public float A;
    public float B;
    public boolean C;
    public long D;
    public final int E;
    public final int F;
    public float G;
    public float H;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a I;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f262860d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f262861e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f262862f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f262863g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f262864h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f262865i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f262866m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[][] f262867n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.d f262868o;

    /* renamed from: p, reason: collision with root package name */
    public final int f262869p;

    /* renamed from: q, reason: collision with root package name */
    public final float f262870q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f262871r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f262872s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f262873t;

    /* renamed from: u, reason: collision with root package name */
    public int f262874u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b f262875v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Bitmap f262876w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Bitmap f262877x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Bitmap f262878y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Bitmap f262879z;

    public C19202xeb785e00(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f262860d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f262861e = paint2;
        this.f262862f = new android.graphics.Path();
        this.f262863g = new android.graphics.Matrix();
        this.f262864h = new android.graphics.Rect();
        this.f262865i = new android.graphics.Rect();
        this.f262866m = new java.util.ArrayList(9);
        this.f262867n = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, 3, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.d.Square;
        this.f262868o = dVar;
        this.f262869p = 6;
        this.f262870q = 0.66f;
        this.f262871r = false;
        this.f262872s = true;
        this.f262873t = false;
        this.f262874u = isInEditMode() ? -1 : getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
        this.f262875v = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Correct;
        this.f262876w = null;
        this.f262877x = null;
        this.f262878y = null;
        this.f262879z = null;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = false;
        this.D = 0L;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = 0.0f;
        this.I = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu4.l.f106163a);
        this.f262872s = obtainStyledAttributes.getBoolean(4, this.f262872s);
        int i17 = obtainStyledAttributes.getInt(1, 200);
        int i18 = obtainStyledAttributes.getInt(2, 6);
        this.f262869p = i18;
        this.f262871r = obtainStyledAttributes.getBoolean(0, this.f262871r);
        int i19 = obtainStyledAttributes.getInt(3, 0);
        if (i19 == 0) {
            this.f262868o = dVar;
        } else if (i19 != 1) {
            this.f262868o = dVar;
        } else {
            this.f262868o = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.d.Rectangle;
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setDither(false);
        paint2.setAlpha(i17);
        paint.setAntiAlias(true);
        paint.setDither(true);
        if (isInEditMode()) {
            return;
        }
        android.graphics.Bitmap e17 = e(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.afe));
        this.f262876w = e17;
        android.graphics.Bitmap e18 = e(i65.a.i(getContext(), j65.e.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.afg : com.p314xaae8f345.mm.R.C30861xcebc809e.aff));
        this.f262877x = e18;
        this.f262878y = e18;
        android.graphics.Bitmap e19 = e(i65.a.i(getContext(), j65.e.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.afi : com.p314xaae8f345.mm.R.C30861xcebc809e.afh));
        this.f262879z = e19;
        this.f262869p = (int) (i18 * com.p314xaae8f345.mm.sdk.p2603x2137b148.x.l0().density);
        android.graphics.Bitmap[] bitmapArr = {e17, e18, e18, e19};
        for (int i27 = 0; i27 < 4; i27++) {
            android.graphics.Bitmap bitmap = bitmapArr[i27];
            this.E = java.lang.Math.max(bitmap.getWidth(), this.E);
            this.F = java.lang.Math.max(bitmap.getHeight(), this.F);
        }
    }

    public final void a() {
        for (int i17 = 0; i17 < 3; i17++) {
            for (int i18 = 0; i18 < 3; i18++) {
                this.f262867n[i17][i18] = false;
            }
        }
    }

    public void b() {
        this.f262866m.clear();
        a();
        this.f262875v = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Correct;
        invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a aVar = this.I;
        if (aVar != null) {
            aVar.mo26519xf41995bb(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hu4.k c(float r12, float r13) {
        /*
            r11 = this;
            float r0 = r11.H
            float r1 = r11.f262870q
            float r2 = r1 * r0
            int r3 = r11.getPaddingTop()
            float r3 = (float) r3
            float r4 = r0 - r2
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = r3 + r4
            r4 = 0
            r6 = r4
        L13:
            r7 = -1
            r8 = 3
            if (r6 >= r8) goto L27
            float r9 = (float) r6
            float r9 = r9 * r0
            float r9 = r9 + r3
            int r10 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r10 < 0) goto L24
            float r9 = r9 + r2
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 > 0) goto L24
            goto L28
        L24:
            int r6 = r6 + 1
            goto L13
        L27:
            r6 = r7
        L28:
            boolean[][] r13 = r11.f262867n
            r0 = 0
            if (r6 < 0) goto L59
            float r2 = r11.G
            float r1 = r1 * r2
            int r3 = r11.getPaddingLeft()
            float r3 = (float) r3
            float r9 = r2 - r1
            float r9 = r9 / r5
            float r3 = r3 + r9
        L39:
            if (r4 >= r8) goto L4c
            float r5 = (float) r4
            float r5 = r5 * r2
            float r5 = r5 + r3
            int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r9 < 0) goto L49
            float r5 = r5 + r1
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 > 0) goto L49
            r7 = r4
            goto L4c
        L49:
            int r4 = r4 + 1
            goto L39
        L4c:
            if (r7 < 0) goto L59
            r12 = r13[r6]
            boolean r12 = r12[r7]
            if (r12 != 0) goto L59
            hu4.k r12 = hu4.k.a(r6, r7)
            goto L5a
        L59:
            r12 = r0
        L5a:
            if (r12 == 0) goto L7e
            int r0 = r12.f366765a
            r13 = r13[r0]
            int r0 = r12.f366766b
            r1 = 1
            r13[r0] = r1
            java.util.ArrayList r13 = r11.f262866m
            r13.add(r12)
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.a r0 = r11.I
            if (r0 == 0) goto L76
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r13)
            r0.mo26521xc6dc49c4(r11, r2)
        L76:
            boolean r13 = r11.f262871r
            if (r13 == 0) goto L7d
            r11.performHapticFeedback(r1, r8)
        L7d:
            return r12
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00.c(float, float):hu4.k");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L3e
            boolean r12 = r8.f262872s
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Wrong
            if (r12 != 0) goto Ld
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r12 = r8.f262875v
            if (r12 == r0) goto Ld
            goto L3e
        Ld:
            boolean r12 = r8.C
            if (r12 == 0) goto L14
            android.graphics.Bitmap r12 = r8.f262877x
            goto L40
        L14:
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r12 = r8.f262875v
            if (r12 != r0) goto L1b
            android.graphics.Bitmap r12 = r8.f262879z
            goto L40
        L1b:
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Correct
            if (r12 == r0) goto L3b
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Animate
            if (r12 != r0) goto L24
            goto L3b
        L24:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "unknown display mode "
            r10.<init>(r11)
            com.tencent.mm.plugin.walletlock.gesture.ui.widget.b r11 = r8.f262875v
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L3b:
            android.graphics.Bitmap r12 = r8.f262878y
            goto L40
        L3e:
            android.graphics.Bitmap r12 = r8.f262876w
        L40:
            float r0 = r8.G
            float r1 = r8.H
            int r2 = r8.E
            float r3 = (float) r2
            float r0 = r0 - r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r3
            int r0 = (int) r0
            int r4 = r8.F
            float r5 = (float) r4
            float r1 = r1 - r5
            float r1 = r1 * r3
            int r1 = (int) r1
            android.content.res.Resources r3 = r8.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r5 = r8.G
            r6 = 1107558400(0x42040000, float:33.0)
            float r3 = r3 * r6
            float r5 = r5 - r3
            float r6 = (float) r2
            float r5 = r5 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r6)
            float r7 = r8.H
            float r7 = r7 - r3
            float r3 = (float) r4
            float r7 = r7 / r3
            float r3 = java.lang.Math.min(r7, r6)
            android.graphics.Matrix r6 = r8.f262863g
            int r10 = r10 + r0
            float r10 = (float) r10
            int r11 = r11 + r1
            float r11 = (float) r11
            r6.setTranslate(r10, r11)
            int r10 = r2 / 2
            float r10 = (float) r10
            int r11 = r4 / 2
            float r11 = (float) r11
            r6.preTranslate(r10, r11)
            r6.preScale(r5, r3)
            int r10 = -r2
            int r10 = r10 / 2
            float r10 = (float) r10
            int r11 = -r4
            int r11 = r11 / 2
            float r11 = (float) r11
            r6.preTranslate(r10, r11)
            boolean r10 = r8.isInEditMode()
            if (r10 != 0) goto L9e
            android.graphics.Paint r10 = r8.f262860d
            r9.drawBitmap(r12, r6, r10)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00.d(android.graphics.Canvas, int, int, boolean):void");
    }

    public final android.graphics.Bitmap e(android.graphics.drawable.Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.graphics.Bitmap.Config config = drawable.getOpacity() != -1 ? android.graphics.Bitmap.Config.ARGB_8888 : android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
        arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView", "drawable2Bitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final float f(int i17) {
        float paddingLeft = getPaddingLeft();
        float f17 = this.G;
        return paddingLeft + (i17 * f17) + (f17 * 0.5f);
    }

    public final float g(int i17) {
        float paddingTop = getPaddingTop();
        float f17 = this.H;
        return paddingTop + (i17 * f17) + (f17 * 0.5f);
    }

    /* renamed from: getDisplayLine */
    public boolean m73998x400152a0() {
        return this.f262872s;
    }

    /* renamed from: getEnableHapticFeedback */
    public boolean m73999xa5a9a815() {
        return this.f262871r;
    }

    /* renamed from: getEnableInput */
    public boolean m74000x837382d1() {
        return this.f262873t;
    }

    /* renamed from: getPattern */
    public java.util.List<hu4.k> m74001xea6275a() {
        return new java.util.ArrayList(this.f262866m);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) ((this.F * 3.0d) / getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) ((this.E * 3.0d) / getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        java.util.ArrayList arrayList = this.f262866m;
        int size = arrayList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b bVar = this.f262875v;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Animate;
        boolean[][] zArr = this.f262867n;
        if (bVar == bVar2) {
            int elapsedRealtime = (((int) (android.os.SystemClock.elapsedRealtime() - this.D)) % ((size + 1) * 700)) / 700;
            a();
            for (int i17 = 0; i17 < elapsedRealtime; i17++) {
                hu4.k kVar = (hu4.k) arrayList.get(i17);
                zArr[kVar.f366765a][kVar.f366766b] = true;
            }
            if (elapsedRealtime > 0 && elapsedRealtime < size) {
                float f18 = (r9 % 700) / 700.0f;
                hu4.k kVar2 = (hu4.k) arrayList.get(elapsedRealtime - 1);
                float f19 = f(kVar2.f366766b);
                float g17 = g(kVar2.f366765a);
                hu4.k kVar3 = (hu4.k) arrayList.get(elapsedRealtime);
                float f27 = (f(kVar3.f366766b) - f19) * f18;
                float g18 = f18 * (g(kVar3.f366765a) - g17);
                this.A = f19 + f27;
                this.B = g17 + g18;
            }
            invalidate();
        }
        android.graphics.Paint paint = this.f262861e;
        paint.setColor(this.f262874u);
        paint.setStrokeWidth(this.f262869p);
        android.graphics.Path path = this.f262862f;
        path.rewind();
        boolean z17 = this.f262872s || this.f262875v == com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Wrong;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        float f28 = this.G;
        float f29 = this.H;
        android.graphics.Paint paint2 = this.f262860d;
        boolean z18 = (paint2.getFlags() & 2) != 0;
        paint2.setFilterBitmap(true);
        boolean z19 = z18;
        int i18 = 0;
        while (i18 < 3) {
            android.graphics.Paint paint3 = paint2;
            float f37 = paddingTop + (i18 * f29);
            float f38 = f29;
            int i19 = 0;
            for (int i27 = 3; i19 < i27; i27 = 3) {
                int i28 = paddingLeft;
                float f39 = paddingLeft + (i19 * f28);
                boolean z27 = zArr[i18][i19];
                if (z27) {
                    f17 = f28;
                } else {
                    f17 = f28;
                    d(canvas, (int) f39, (int) f37, z27);
                }
                i19++;
                paddingLeft = i28;
                f28 = f17;
            }
            i18++;
            paint2 = paint3;
            f29 = f38;
        }
        int i29 = paddingLeft;
        float f47 = f28;
        float f48 = f29;
        android.graphics.Paint paint4 = paint2;
        if (z17) {
            int i37 = 0;
            boolean z28 = false;
            while (i37 < size) {
                hu4.k kVar4 = (hu4.k) arrayList.get(i37);
                boolean[] zArr2 = zArr[kVar4.f366765a];
                int i38 = kVar4.f366766b;
                if (!zArr2[i38]) {
                    break;
                }
                float f49 = f(i38);
                float g19 = g(kVar4.f366765a);
                if (i37 == 0) {
                    path.moveTo(f49, g19);
                } else {
                    path.lineTo(f49, g19);
                }
                i37++;
                z28 = true;
            }
            if ((this.C || this.f262875v == bVar2) && z28) {
                path.lineTo(this.A, this.B);
            }
            canvas.drawPath(path, paint);
        }
        for (int i39 = 0; i39 < 3; i39++) {
            float f57 = paddingTop + (i39 * f48);
            int i47 = 0;
            while (i47 < 3) {
                int i48 = i29;
                float f58 = i48 + (i47 * f47);
                boolean z29 = zArr[i39][i47];
                if (z29) {
                    d(canvas, (int) f58, (int) f57, z29);
                }
                i47++;
                i29 = i48;
            }
        }
        paint4.setFilterBitmap(z19);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = java.lang.Math.max(size, suggestedMinimumWidth);
        } else if (mode != 0) {
            suggestedMinimumWidth = size;
        }
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = java.lang.Math.max(size2, suggestedMinimumHeight);
        } else if (mode2 != 0) {
            suggestedMinimumHeight = size2;
        }
        if (this.f262868o == com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.d.Square) {
            suggestedMinimumWidth = java.lang.Math.min(suggestedMinimumWidth, suggestedMinimumHeight);
            suggestedMinimumHeight = suggestedMinimumWidth;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00.SavedState savedState = (com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Correct;
        java.lang.String str = savedState.f262880d;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Serialized pattern is null");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (byte b17 : str.getBytes()) {
            arrayList.add(hu4.k.a(b17 / 3, b17 % 3));
        }
        java.util.ArrayList arrayList2 = this.f262866m;
        arrayList2.clear();
        a();
        arrayList2.addAll(arrayList);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hu4.k kVar = (hu4.k) it.next();
            this.f262867n[kVar.f366765a][kVar.f366766b] = true;
        }
        m74003xd6674fc3(bVar);
        this.f262875v = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.m74010xcee59d22()[savedState.f262881e];
        this.f262872s = savedState.f262882f;
        this.f262873t = savedState.f262883g;
        this.f262871r = savedState.f262884h;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable onSaveInstanceState = super.onSaveInstanceState();
        java.util.ArrayList arrayList = this.f262866m;
        if (arrayList == null) {
            throw new java.lang.IllegalArgumentException("pattern is null");
        }
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i17 = 0; i17 < size; i17++) {
            hu4.k kVar = (hu4.k) arrayList.get(i17);
            bArr[i17] = (byte) ((kVar.f366765a * 3) + kVar.f366766b);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00.SavedState(onSaveInstanceState, new java.lang.String(bArr), this.f262875v.ordinal(), this.f262872s, this.f262873t, this.f262871r);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.G = ((i17 - getPaddingLeft()) - getPaddingRight()) / 3.0f;
        this.H = ((i18 - getPaddingTop()) - getPaddingBottom()) / 3.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        float f17;
        android.view.MotionEvent motionEvent2 = motionEvent;
        int i17 = 0;
        if (!this.f262873t || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        float f18 = 0.5f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b.Correct;
        java.util.ArrayList arrayList = this.f262866m;
        boolean z17 = true;
        if (action == 0) {
            arrayList.clear();
            a();
            this.f262875v = bVar;
            invalidate();
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            hu4.k c17 = c(x17, y17);
            if (c17 != null) {
                this.C = true;
                this.f262875v = bVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a aVar = this.I;
                if (aVar != null) {
                    aVar.mo26522x68c62e31(this);
                }
            } else {
                this.C = false;
            }
            if (c17 != null) {
                float f19 = f(c17.f366766b);
                float g17 = g(c17.f366765a);
                float f27 = this.G * 0.5f;
                float f28 = this.H * 0.5f;
                invalidate((int) (f19 - f27), (int) (g17 - f28), (int) (f19 + f27), (int) (g17 + f28));
            }
            this.A = x17;
            this.B = y17;
            return true;
        }
        if (action == 1) {
            if (arrayList.isEmpty()) {
                return true;
            }
            this.C = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a aVar2 = this.I;
            if (aVar2 != null) {
                aVar2.mo26520x4c24e09a(this, new java.util.ArrayList(arrayList));
            }
            invalidate();
            return true;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            if (this.C) {
                this.C = false;
                arrayList.clear();
                a();
                this.f262875v = bVar;
                invalidate();
                com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a aVar3 = this.I;
                if (aVar3 != null) {
                    aVar3.mo26519xf41995bb(this);
                }
            }
            return true;
        }
        float f29 = this.f262869p;
        int historySize = motionEvent.getHistorySize();
        android.graphics.Rect rect = this.f262864h;
        rect.setEmpty();
        boolean z18 = false;
        while (i17 < historySize + 1) {
            float historicalX = i17 < historySize ? motionEvent2.getHistoricalX(i17) : motionEvent.getX();
            float historicalY = i17 < historySize ? motionEvent2.getHistoricalY(i17) : motionEvent.getY();
            hu4.k c18 = c(historicalX, historicalY);
            int size = arrayList.size();
            if (c18 != null && size == z17) {
                this.C = z17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a aVar4 = this.I;
                if (aVar4 != null) {
                    aVar4.mo26522x68c62e31(this);
                }
            }
            float abs = java.lang.Math.abs(historicalX - this.A);
            float abs2 = java.lang.Math.abs(historicalY - this.B);
            if (abs > 0.0f || abs2 > 0.0f) {
                z18 = true;
            }
            if (!this.C || size <= 0) {
                f17 = f29;
            } else {
                hu4.k kVar = (hu4.k) arrayList.get(size - 1);
                float f37 = f(kVar.f366766b);
                float g18 = g(kVar.f366765a);
                float min = java.lang.Math.min(f37, historicalX) - f29;
                float max = java.lang.Math.max(f37, historicalX) + f29;
                float min2 = java.lang.Math.min(g18, historicalY) - f29;
                float max2 = java.lang.Math.max(g18, historicalY) + f29;
                if (c18 != null) {
                    float f38 = this.G * f18;
                    float f39 = this.H * f18;
                    float f47 = f(c18.f366766b);
                    float g19 = g(c18.f366765a);
                    f17 = f29;
                    min = java.lang.Math.min(f47 - f38, min);
                    max = java.lang.Math.max(f47 + f38, max);
                    min2 = java.lang.Math.min(g19 - f39, min2);
                    max2 = java.lang.Math.max(g19 + f39, max2);
                } else {
                    f17 = f29;
                }
                rect.union(java.lang.Math.round(min), java.lang.Math.round(min2), java.lang.Math.round(max), java.lang.Math.round(max2));
            }
            i17++;
            motionEvent2 = motionEvent;
            f29 = f17;
            f18 = 0.5f;
            z17 = true;
        }
        float x18 = motionEvent.getX();
        this.A = x18;
        if (x18 < getPaddingLeft() + r2) {
            this.A = getPaddingLeft() + r2;
        } else if (this.A > ((getPaddingLeft() + getWidth()) - getPaddingRight()) - r2) {
            this.A = ((getPaddingLeft() + getWidth()) - getPaddingRight()) - r2;
        }
        float y18 = motionEvent.getY();
        this.B = y18;
        if (y18 < getPaddingTop() + r2) {
            this.B = getPaddingTop() + r2;
        } else if (this.B > ((getPaddingTop() + getHeight()) - getPaddingRight()) - r2) {
            this.B = ((getPaddingTop() + getHeight()) - getPaddingBottom()) - r2;
        }
        if (!z18) {
            return true;
        }
        android.graphics.Rect rect2 = this.f262865i;
        rect2.union(rect);
        invalidate(rect2);
        rect2.set(rect);
        return true;
    }

    /* renamed from: setDisplayLine */
    public void m74002xd666c614(boolean z17) {
        this.f262872s = z17;
        invalidate();
    }

    /* renamed from: setDisplayMode */
    public void m74003xd6674fc3(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f262874u = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
        } else if (ordinal == 1) {
            this.f262874u = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560738st);
        } else if (ordinal == 2) {
            java.util.ArrayList arrayList = this.f262866m;
            if (arrayList.size() == 0) {
                throw new java.lang.IllegalStateException("You should set a pattern before animating.");
            }
            this.f262873t = false;
            this.f262874u = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            hu4.k kVar = (hu4.k) arrayList.get(0);
            this.A = f(kVar.f366766b);
            this.B = g(kVar.f366765a);
            a();
            this.D = android.os.SystemClock.elapsedRealtime();
        }
        this.f262875v = bVar;
        invalidate();
    }

    /* renamed from: setEnableHapticFeedback */
    public void m74004x1ffcd721(boolean z17) {
        this.f262871r = z17;
    }

    /* renamed from: setEnableInput */
    public void m74005x19d8f645(boolean z17) {
        this.f262873t = z17;
    }

    /* renamed from: setOnPatternListener */
    public void m74006xdf056843(com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.a aVar) {
        this.I = aVar;
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.C19202xeb785e00.SavedState> f38707x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2389xfb865d49.ui.p2390xd1075a44.c();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f262880d;

        /* renamed from: e, reason: collision with root package name */
        public final int f262881e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f262882f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f262883g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f262884h;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f262880d = parcel.readString();
            this.f262881e = parcel.readInt();
            this.f262882f = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
            this.f262883g = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
            this.f262884h = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f262880d);
            parcel.writeInt(this.f262881e);
            parcel.writeValue(java.lang.Boolean.valueOf(this.f262882f));
            parcel.writeValue(java.lang.Boolean.valueOf(this.f262883g));
            parcel.writeValue(java.lang.Boolean.valueOf(this.f262884h));
        }

        public SavedState(android.os.Parcelable parcelable, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19) {
            super(parcelable);
            this.f262880d = str;
            this.f262881e = i17;
            this.f262882f = z17;
            this.f262883g = z18;
            this.f262884h = z19;
        }
    }
}

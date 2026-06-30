package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: g, reason: collision with root package name */
    public static p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 f91122g;

    /* renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f91130a;

    /* renamed from: b, reason: collision with root package name */
    public x.o f91131b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.WeakHashMap f91132c = new java.util.WeakHashMap(0);

    /* renamed from: d, reason: collision with root package name */
    public android.util.TypedValue f91133d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f91134e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f91121f = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f0 f91123h = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f91124i = {com.p314xaae8f345.mm.R.C30861xcebc809e.bf9, com.p314xaae8f345.mm.R.C30861xcebc809e.bf7, com.p314xaae8f345.mm.R.C30861xcebc809e.f562201be0};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f91125j = {com.p314xaae8f345.mm.R.C30861xcebc809e.be8, com.p314xaae8f345.mm.R.C30861xcebc809e.f562234an, com.p314xaae8f345.mm.R.C30861xcebc809e.bec, com.p314xaae8f345.mm.R.C30861xcebc809e.be9, com.p314xaae8f345.mm.R.C30861xcebc809e.be_, com.p314xaae8f345.mm.R.C30861xcebc809e.beb, com.p314xaae8f345.mm.R.C30861xcebc809e.bea};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f91126k = {com.p314xaae8f345.mm.R.C30861xcebc809e.bf6, com.p314xaae8f345.mm.R.C30861xcebc809e.bf8, com.p314xaae8f345.mm.R.C30861xcebc809e.be7, com.p314xaae8f345.mm.R.C30861xcebc809e.f562241at, com.p314xaae8f345.mm.R.C30861xcebc809e.f562242bf0, com.p314xaae8f345.mm.R.C30861xcebc809e.f562244bf2, com.p314xaae8f345.mm.R.C30861xcebc809e.f562246bf4, com.p314xaae8f345.mm.R.C30861xcebc809e.f562243bf1, com.p314xaae8f345.mm.R.C30861xcebc809e.f562245bf3, com.p314xaae8f345.mm.R.C30861xcebc809e.f562247bf5};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f91127l = {com.p314xaae8f345.mm.R.C30861xcebc809e.ber, com.p314xaae8f345.mm.R.C30861xcebc809e.f562213a2, com.p314xaae8f345.mm.R.C30861xcebc809e.beq};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f91128m = {com.p314xaae8f345.mm.R.C30861xcebc809e.f562240as, com.p314xaae8f345.mm.R.C30861xcebc809e.f562248au};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f91129n = {com.p314xaae8f345.mm.R.C30861xcebc809e.f562204y, com.p314xaae8f345.mm.R.C30861xcebc809e.f562209a1};

    public static boolean b(int[] iArr, int i17) {
        for (int i18 : iArr) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }

    public static synchronized p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 f() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 h0Var;
        synchronized (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.class) {
            if (f91122g == null) {
                f91122g = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0();
            }
            h0Var = f91122g;
        }
        return h0Var;
    }

    public static synchronized android.graphics.PorterDuffColorFilter j(int i17, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.class) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f0 f0Var = f91123h;
            f0Var.getClass();
            int i18 = (i17 + 31) * 31;
            porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) f0Var.get(java.lang.Integer.valueOf(mode.hashCode() + i18));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i17, mode);
                f0Var.getClass();
            }
        }
        return porterDuffColorFilter;
    }

    public static void l(android.graphics.drawable.Drawable drawable, int i17, android.graphics.PorterDuff.Mode mode) {
        if (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f91121f;
        }
        drawable.setColorFilter(j(i17, mode));
    }

    public static void m(android.graphics.drawable.Drawable drawable, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var, int[] iArr) {
        if (!p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.a(drawable) || drawable.mutate() == drawable) {
            boolean z17 = o2Var.f91202d;
            if (!z17 && !o2Var.f91201c) {
                drawable.clearColorFilter();
                return;
            }
            android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
            android.content.res.ColorStateList colorStateList = z17 ? o2Var.f91199a : null;
            android.graphics.PorterDuff.Mode mode = o2Var.f91201c ? o2Var.f91200b : f91121f;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = j(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            int[] r0 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f91124i
            boolean r0 = b(r0, r8)
            r1 = 1
            android.graphics.PorterDuff$Mode r2 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f91121f
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L13
            r8 = 2130968925(0x7f04015d, float:1.7546517E38)
        L10:
            r5 = r1
        L11:
            r0 = r4
            goto L4d
        L13:
            int[] r0 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f91126k
            boolean r0 = b(r0, r8)
            if (r0 == 0) goto L1f
            r8 = 2130968923(0x7f04015b, float:1.7546513E38)
            goto L10
        L1f:
            int[] r0 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f91127l
            boolean r0 = b(r0, r8)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L30
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L2c:
            r0 = r4
            r8 = r5
            r5 = r1
            goto L4d
        L30:
            r0 = 2131230808(0x7f080058, float:1.807768E38)
            if (r8 != r0) goto L44
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r5 = r1
            r6 = r0
            r0 = r8
            r8 = r6
            goto L4d
        L44:
            r0 = 2131230783(0x7f08003f, float:1.8077629E38)
            if (r8 != r0) goto L4a
            goto L2c
        L4a:
            r8 = r3
            r5 = r8
            goto L11
        L4d:
            if (r5 == 0) goto L6a
            boolean r3 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.a(r9)
            if (r3 == 0) goto L59
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L59:
            int r7 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(r7, r8)
            android.graphics.PorterDuffColorFilter r7 = j(r7, r2)
            r9.setColorFilter(r7)
            if (r0 == r4) goto L69
            r9.setAlpha(r0)
        L69:
            return r1
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.n(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final synchronized boolean a(android.content.Context context, long j17, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        x.f fVar = (x.f) this.f91132c.get(context);
        if (fVar == null) {
            fVar = new x.f();
            this.f91132c.put(context, fVar);
        }
        fVar.d(j17, new java.lang.ref.WeakReference(constantState));
        return true;
    }

    public final android.content.res.ColorStateList c(android.content.Context context, int i17) {
        int b17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559707cn);
        return new android.content.res.ColorStateList(new int[][]{p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91182b, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91184d, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91183c, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91186f}, new int[]{p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559705cl), e3.b.g(b17, i17), e3.b.g(b17, i17), i17});
    }

    public final android.graphics.drawable.Drawable d(android.content.Context context, int i17) {
        if (this.f91133d == null) {
            this.f91133d = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f91133d;
        context.getResources().getValue(i17, typedValue, true);
        long j17 = (typedValue.assetCookie << 32) | typedValue.data;
        android.graphics.drawable.Drawable g17 = g(context, j17);
        if (g17 != null) {
            return g17;
        }
        if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562214a3) {
            g17 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{h(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f562213a2), h(context, com.p314xaae8f345.mm.R.C30861xcebc809e.be7)});
        }
        if (g17 != null) {
            g17.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j17, g17);
        }
        return g17;
    }

    public final android.content.res.ColorStateList e(android.content.Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        android.content.res.ColorStateList c17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.c(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559713ct);
        if (c17 == null || !c17.isStateful()) {
            iArr[0] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91182b;
            iArr2[0] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559713ct);
            iArr[1] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91185e;
            iArr2[1] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559706cm);
            iArr[2] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91186f;
            iArr2[2] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559713ct);
        } else {
            int[] iArr3 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91182b;
            iArr[0] = iArr3;
            iArr2[0] = c17.getColorForState(iArr3, 0);
            iArr[1] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91185e;
            iArr2[1] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559706cm);
            iArr[2] = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.f91186f;
            iArr2[2] = c17.getDefaultColor();
        }
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public final synchronized android.graphics.drawable.Drawable g(android.content.Context context, long j17) {
        x.f fVar = (x.f) this.f91132c.get(context);
        if (fVar == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) fVar.c(j17, null);
        if (weakReference != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b17 = x.e.b(fVar.f532355e, fVar.f532357g, j17);
            if (b17 >= 0) {
                java.lang.Object[] objArr = fVar.f532356f;
                java.lang.Object obj = objArr[b17];
                java.lang.Object obj2 = x.f.f532353h;
                if (obj != obj2) {
                    objArr[b17] = obj2;
                    fVar.f532354d = true;
                }
            }
        }
        return null;
    }

    public synchronized android.graphics.drawable.Drawable h(android.content.Context context, int i17) {
        return i(context, i17, false);
    }

    public synchronized android.graphics.drawable.Drawable i(android.content.Context context, int i17, boolean z17) {
        android.graphics.drawable.Drawable d17;
        boolean z18 = true;
        if (!this.f91134e) {
            this.f91134e = true;
            android.graphics.drawable.Drawable h17 = h(context, com.p314xaae8f345.mm.R.C30861xcebc809e.f562249av);
            if (h17 != null) {
                if (!(h17 instanceof v4.d) && !"android.graphics.drawable.VectorDrawable".equals(h17.getClass().getName())) {
                    z18 = false;
                }
            }
            this.f91134e = false;
            throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        android.graphics.drawable.Drawable drawable = null;
        d17 = d(context, i17);
        if (d17 == null) {
            d17 = b3.l.m9707x4a96be14(context, i17);
        }
        if (d17 != null) {
            android.content.res.ColorStateList k17 = k(context, i17);
            if (k17 != null) {
                if (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.a(d17)) {
                    d17 = d17.mutate();
                }
                f3.b.h(d17, k17);
                android.graphics.PorterDuff.Mode mode = i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562239ar ? android.graphics.PorterDuff.Mode.MULTIPLY : null;
                if (mode != null) {
                    f3.b.i(d17, mode);
                }
            } else {
                android.graphics.PorterDuff.Mode mode2 = f91121f;
                if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562235ao) {
                    android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) d17;
                    l(layerDrawable.findDrawableByLayerId(android.R.id.background), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559708co), mode2);
                    l(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559708co), mode2);
                    l(layerDrawable.findDrawableByLayerId(android.R.id.progress), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559706cm), mode2);
                } else {
                    if (i17 != com.p314xaae8f345.mm.R.C30861xcebc809e.f562231ak && i17 != com.p314xaae8f345.mm.R.C30861xcebc809e.f562230aj && i17 != com.p314xaae8f345.mm.R.C30861xcebc809e.f562232al) {
                        if (!n(context, i17, d17) && z17) {
                            d17 = drawable;
                        }
                    }
                    android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) d17;
                    l(layerDrawable2.findDrawableByLayerId(android.R.id.background), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559708co), mode2);
                    l(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559706cm), mode2);
                    l(layerDrawable2.findDrawableByLayerId(android.R.id.progress), p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559706cm), mode2);
                }
            }
            drawable = d17;
            d17 = drawable;
        }
        if (d17 != null) {
            android.graphics.Rect rect = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.f91271a;
        }
        return d17;
    }

    public synchronized android.content.res.ColorStateList k(android.content.Context context, int i17) {
        android.content.res.ColorStateList colorStateList;
        x.o oVar;
        try {
            java.util.WeakHashMap weakHashMap = this.f91130a;
            colorStateList = null;
            if (weakHashMap != null && (oVar = (x.o) weakHashMap.get(context)) != null) {
                colorStateList = (android.content.res.ColorStateList) oVar.e(i17, null);
            }
            if (colorStateList == null) {
                if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562217a6) {
                    java.lang.Object obj = k.a.f384389a;
                    colorStateList = context.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560111bc);
                } else if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.bey) {
                    java.lang.Object obj2 = k.a.f384389a;
                    colorStateList = context.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560114bf);
                } else if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562239ar) {
                    colorStateList = e(context);
                } else if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562208a0) {
                    colorStateList = c(context, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559705cl));
                } else if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562203x) {
                    colorStateList = c(context, 0);
                } else if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562207z) {
                    colorStateList = c(context, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.b(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559703cj));
                } else {
                    if (i17 != com.p314xaae8f345.mm.R.C30861xcebc809e.bex && i17 != com.p314xaae8f345.mm.R.C30861xcebc809e.f562238aq) {
                        if (b(f91125j, i17)) {
                            colorStateList = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m2.c(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559708co);
                        } else if (b(f91128m, i17)) {
                            java.lang.Object obj3 = k.a.f384389a;
                            colorStateList = context.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560110bb);
                        } else if (b(f91129n, i17)) {
                            java.lang.Object obj4 = k.a.f384389a;
                            colorStateList = context.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560109ba);
                        } else if (i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f562233am) {
                            java.lang.Object obj5 = k.a.f384389a;
                            colorStateList = context.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560112bd);
                        }
                    }
                    java.lang.Object obj6 = k.a.f384389a;
                    colorStateList = context.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560113be);
                }
                if (colorStateList != null) {
                    if (this.f91130a == null) {
                        this.f91130a = new java.util.WeakHashMap();
                    }
                    x.o oVar2 = (x.o) this.f91130a.get(context);
                    if (oVar2 == null) {
                        oVar2 = new x.o();
                        this.f91130a.put(context, oVar2);
                    }
                    oVar2.a(i17, colorStateList);
                }
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        return colorStateList;
    }
}

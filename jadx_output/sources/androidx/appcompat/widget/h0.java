package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public final class h0 {

    /* renamed from: g, reason: collision with root package name */
    public static androidx.appcompat.widget.h0 f9589g;

    /* renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f9597a;

    /* renamed from: b, reason: collision with root package name */
    public x.o f9598b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.WeakHashMap f9599c = new java.util.WeakHashMap(0);

    /* renamed from: d, reason: collision with root package name */
    public android.util.TypedValue f9600d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9601e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f9588f = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.appcompat.widget.f0 f9590h = new androidx.appcompat.widget.f0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9591i = {com.tencent.mm.R.drawable.bf9, com.tencent.mm.R.drawable.bf7, com.tencent.mm.R.drawable.f480668be0};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f9592j = {com.tencent.mm.R.drawable.be8, com.tencent.mm.R.drawable.f480701an, com.tencent.mm.R.drawable.bec, com.tencent.mm.R.drawable.be9, com.tencent.mm.R.drawable.be_, com.tencent.mm.R.drawable.beb, com.tencent.mm.R.drawable.bea};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9593k = {com.tencent.mm.R.drawable.bf6, com.tencent.mm.R.drawable.bf8, com.tencent.mm.R.drawable.be7, com.tencent.mm.R.drawable.f480708at, com.tencent.mm.R.drawable.f480709bf0, com.tencent.mm.R.drawable.f480711bf2, com.tencent.mm.R.drawable.f480713bf4, com.tencent.mm.R.drawable.f480710bf1, com.tencent.mm.R.drawable.f480712bf3, com.tencent.mm.R.drawable.f480714bf5};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f9594l = {com.tencent.mm.R.drawable.ber, com.tencent.mm.R.drawable.f480680a2, com.tencent.mm.R.drawable.beq};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f9595m = {com.tencent.mm.R.drawable.f480707as, com.tencent.mm.R.drawable.f480715au};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9596n = {com.tencent.mm.R.drawable.f480671y, com.tencent.mm.R.drawable.f480676a1};

    public static boolean b(int[] iArr, int i17) {
        for (int i18 : iArr) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }

    public static synchronized androidx.appcompat.widget.h0 f() {
        androidx.appcompat.widget.h0 h0Var;
        synchronized (androidx.appcompat.widget.h0.class) {
            if (f9589g == null) {
                f9589g = new androidx.appcompat.widget.h0();
            }
            h0Var = f9589g;
        }
        return h0Var;
    }

    public static synchronized android.graphics.PorterDuffColorFilter j(int i17, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        synchronized (androidx.appcompat.widget.h0.class) {
            androidx.appcompat.widget.f0 f0Var = f9590h;
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
        if (androidx.appcompat.widget.y0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f9588f;
        }
        drawable.setColorFilter(j(i17, mode));
    }

    public static void m(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.o2 o2Var, int[] iArr) {
        if (!androidx.appcompat.widget.y0.a(drawable) || drawable.mutate() == drawable) {
            boolean z17 = o2Var.f9669d;
            if (!z17 && !o2Var.f9668c) {
                drawable.clearColorFilter();
                return;
            }
            android.graphics.PorterDuffColorFilter porterDuffColorFilter = null;
            android.content.res.ColorStateList colorStateList = z17 ? o2Var.f9666a : null;
            android.graphics.PorterDuff.Mode mode = o2Var.f9668c ? o2Var.f9667b : f9588f;
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
            int[] r0 = androidx.appcompat.widget.h0.f9591i
            boolean r0 = b(r0, r8)
            r1 = 1
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.h0.f9588f
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
            int[] r0 = androidx.appcompat.widget.h0.f9593k
            boolean r0 = b(r0, r8)
            if (r0 == 0) goto L1f
            r8 = 2130968923(0x7f04015b, float:1.7546513E38)
            goto L10
        L1f:
            int[] r0 = androidx.appcompat.widget.h0.f9594l
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
            boolean r3 = androidx.appcompat.widget.y0.a(r9)
            if (r3 == 0) goto L59
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L59:
            int r7 = androidx.appcompat.widget.m2.b(r7, r8)
            android.graphics.PorterDuffColorFilter r7 = j(r7, r2)
            r9.setColorFilter(r7)
            if (r0 == r4) goto L69
            r9.setAlpha(r0)
        L69:
            return r1
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.n(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final synchronized boolean a(android.content.Context context, long j17, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        x.f fVar = (x.f) this.f9599c.get(context);
        if (fVar == null) {
            fVar = new x.f();
            this.f9599c.put(context, fVar);
        }
        fVar.d(j17, new java.lang.ref.WeakReference(constantState));
        return true;
    }

    public final android.content.res.ColorStateList c(android.content.Context context, int i17) {
        int b17 = androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478174cn);
        return new android.content.res.ColorStateList(new int[][]{androidx.appcompat.widget.m2.f9649b, androidx.appcompat.widget.m2.f9651d, androidx.appcompat.widget.m2.f9650c, androidx.appcompat.widget.m2.f9653f}, new int[]{androidx.appcompat.widget.m2.a(context, com.tencent.mm.R.attr.f478172cl), e3.b.g(b17, i17), e3.b.g(b17, i17), i17});
    }

    public final android.graphics.drawable.Drawable d(android.content.Context context, int i17) {
        if (this.f9600d == null) {
            this.f9600d = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f9600d;
        context.getResources().getValue(i17, typedValue, true);
        long j17 = (typedValue.assetCookie << 32) | typedValue.data;
        android.graphics.drawable.Drawable g17 = g(context, j17);
        if (g17 != null) {
            return g17;
        }
        if (i17 == com.tencent.mm.R.drawable.f480681a3) {
            g17 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{h(context, com.tencent.mm.R.drawable.f480680a2), h(context, com.tencent.mm.R.drawable.be7)});
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
        android.content.res.ColorStateList c17 = androidx.appcompat.widget.m2.c(context, com.tencent.mm.R.attr.f478180ct);
        if (c17 == null || !c17.isStateful()) {
            iArr[0] = androidx.appcompat.widget.m2.f9649b;
            iArr2[0] = androidx.appcompat.widget.m2.a(context, com.tencent.mm.R.attr.f478180ct);
            iArr[1] = androidx.appcompat.widget.m2.f9652e;
            iArr2[1] = androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478173cm);
            iArr[2] = androidx.appcompat.widget.m2.f9653f;
            iArr2[2] = androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478180ct);
        } else {
            int[] iArr3 = androidx.appcompat.widget.m2.f9649b;
            iArr[0] = iArr3;
            iArr2[0] = c17.getColorForState(iArr3, 0);
            iArr[1] = androidx.appcompat.widget.m2.f9652e;
            iArr2[1] = androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478173cm);
            iArr[2] = androidx.appcompat.widget.m2.f9653f;
            iArr2[2] = c17.getDefaultColor();
        }
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public final synchronized android.graphics.drawable.Drawable g(android.content.Context context, long j17) {
        x.f fVar = (x.f) this.f9599c.get(context);
        if (fVar == null) {
            return null;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) fVar.c(j17, null);
        if (weakReference != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b17 = x.e.b(fVar.f450822e, fVar.f450824g, j17);
            if (b17 >= 0) {
                java.lang.Object[] objArr = fVar.f450823f;
                java.lang.Object obj = objArr[b17];
                java.lang.Object obj2 = x.f.f450820h;
                if (obj != obj2) {
                    objArr[b17] = obj2;
                    fVar.f450821d = true;
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
        if (!this.f9601e) {
            this.f9601e = true;
            android.graphics.drawable.Drawable h17 = h(context, com.tencent.mm.R.drawable.f480716av);
            if (h17 != null) {
                if (!(h17 instanceof v4.d) && !"android.graphics.drawable.VectorDrawable".equals(h17.getClass().getName())) {
                    z18 = false;
                }
            }
            this.f9601e = false;
            throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        android.graphics.drawable.Drawable drawable = null;
        d17 = d(context, i17);
        if (d17 == null) {
            d17 = b3.l.getDrawable(context, i17);
        }
        if (d17 != null) {
            android.content.res.ColorStateList k17 = k(context, i17);
            if (k17 != null) {
                if (androidx.appcompat.widget.y0.a(d17)) {
                    d17 = d17.mutate();
                }
                f3.b.h(d17, k17);
                android.graphics.PorterDuff.Mode mode = i17 == com.tencent.mm.R.drawable.f480706ar ? android.graphics.PorterDuff.Mode.MULTIPLY : null;
                if (mode != null) {
                    f3.b.i(d17, mode);
                }
            } else {
                android.graphics.PorterDuff.Mode mode2 = f9588f;
                if (i17 == com.tencent.mm.R.drawable.f480702ao) {
                    android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) d17;
                    l(layerDrawable.findDrawableByLayerId(android.R.id.background), androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478175co), mode2);
                    l(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478175co), mode2);
                    l(layerDrawable.findDrawableByLayerId(android.R.id.progress), androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478173cm), mode2);
                } else {
                    if (i17 != com.tencent.mm.R.drawable.f480698ak && i17 != com.tencent.mm.R.drawable.f480697aj && i17 != com.tencent.mm.R.drawable.f480699al) {
                        if (!n(context, i17, d17) && z17) {
                            d17 = drawable;
                        }
                    }
                    android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) d17;
                    l(layerDrawable2.findDrawableByLayerId(android.R.id.background), androidx.appcompat.widget.m2.a(context, com.tencent.mm.R.attr.f478175co), mode2);
                    l(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478173cm), mode2);
                    l(layerDrawable2.findDrawableByLayerId(android.R.id.progress), androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478173cm), mode2);
                }
            }
            drawable = d17;
            d17 = drawable;
        }
        if (d17 != null) {
            android.graphics.Rect rect = androidx.appcompat.widget.y0.f9738a;
        }
        return d17;
    }

    public synchronized android.content.res.ColorStateList k(android.content.Context context, int i17) {
        android.content.res.ColorStateList colorStateList;
        x.o oVar;
        try {
            java.util.WeakHashMap weakHashMap = this.f9597a;
            colorStateList = null;
            if (weakHashMap != null && (oVar = (x.o) weakHashMap.get(context)) != null) {
                colorStateList = (android.content.res.ColorStateList) oVar.e(i17, null);
            }
            if (colorStateList == null) {
                if (i17 == com.tencent.mm.R.drawable.f480684a6) {
                    java.lang.Object obj = k.a.f302856a;
                    colorStateList = context.getColorStateList(com.tencent.mm.R.color.f478578bc);
                } else if (i17 == com.tencent.mm.R.drawable.bey) {
                    java.lang.Object obj2 = k.a.f302856a;
                    colorStateList = context.getColorStateList(com.tencent.mm.R.color.f478581bf);
                } else if (i17 == com.tencent.mm.R.drawable.f480706ar) {
                    colorStateList = e(context);
                } else if (i17 == com.tencent.mm.R.drawable.f480675a0) {
                    colorStateList = c(context, androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478172cl));
                } else if (i17 == com.tencent.mm.R.drawable.f480670x) {
                    colorStateList = c(context, 0);
                } else if (i17 == com.tencent.mm.R.drawable.f480674z) {
                    colorStateList = c(context, androidx.appcompat.widget.m2.b(context, com.tencent.mm.R.attr.f478170cj));
                } else {
                    if (i17 != com.tencent.mm.R.drawable.bex && i17 != com.tencent.mm.R.drawable.f480705aq) {
                        if (b(f9592j, i17)) {
                            colorStateList = androidx.appcompat.widget.m2.c(context, com.tencent.mm.R.attr.f478175co);
                        } else if (b(f9595m, i17)) {
                            java.lang.Object obj3 = k.a.f302856a;
                            colorStateList = context.getColorStateList(com.tencent.mm.R.color.f478577bb);
                        } else if (b(f9596n, i17)) {
                            java.lang.Object obj4 = k.a.f302856a;
                            colorStateList = context.getColorStateList(com.tencent.mm.R.color.f478576ba);
                        } else if (i17 == com.tencent.mm.R.drawable.f480700am) {
                            java.lang.Object obj5 = k.a.f302856a;
                            colorStateList = context.getColorStateList(com.tencent.mm.R.color.f478579bd);
                        }
                    }
                    java.lang.Object obj6 = k.a.f302856a;
                    colorStateList = context.getColorStateList(com.tencent.mm.R.color.f478580be);
                }
                if (colorStateList != null) {
                    if (this.f9597a == null) {
                        this.f9597a = new java.util.WeakHashMap();
                    }
                    x.o oVar2 = (x.o) this.f9597a.get(context);
                    if (oVar2 == null) {
                        oVar2 = new x.o();
                        this.f9597a.put(context, oVar2);
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

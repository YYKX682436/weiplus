package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class q2 implements androidx.recyclerview.widget.v2 {
    public final jz5.g A;
    public final com.tencent.mm.plugin.fav.ui.gallery.n2 B;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f101052d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.gallery.x1 f101053e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f101054f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.gallery.m2 f101055g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f101056h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f101057i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f101058m;

    /* renamed from: n, reason: collision with root package name */
    public int f101059n;

    /* renamed from: o, reason: collision with root package name */
    public int f101060o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Set f101061p;

    /* renamed from: q, reason: collision with root package name */
    public float f101062q;

    /* renamed from: r, reason: collision with root package name */
    public float f101063r;

    /* renamed from: s, reason: collision with root package name */
    public float f101064s;

    /* renamed from: t, reason: collision with root package name */
    public float f101065t;

    /* renamed from: u, reason: collision with root package name */
    public int f101066u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f101067v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f101068w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f101069x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f101070y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f101071z;

    public q2(android.content.Context context, com.tencent.mm.plugin.fav.ui.gallery.x1 adapter, yz5.a isSelectedModeProvider) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(isSelectedModeProvider, "isSelectedModeProvider");
        this.f101052d = context;
        this.f101053e = adapter;
        this.f101054f = isSelectedModeProvider;
        this.f101055g = new com.tencent.mm.plugin.fav.ui.gallery.m2(0.0f, 0, 0L, 0L, 0.0f, false, false, false, 0L, 0.0f, 1023, null);
        this.f101058m = true;
        this.f101059n = -1;
        this.f101060o = -1;
        this.f101061p = kz5.r0.f314002d;
        this.f101066u = -1;
        this.f101068w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f101070y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.A = jz5.h.b(new com.tencent.mm.plugin.fav.ui.gallery.p2(this));
        this.B = new com.tencent.mm.plugin.fav.ui.gallery.n2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r0 != 3) goto L45;
     */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.recyclerview.widget.RecyclerView r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.gallery.q2.a(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r0 != 3) goto L35;
     */
    @Override // androidx.recyclerview.widget.v2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "rv"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "e"
            kotlin.jvm.internal.o.g(r8, r0)
            r8.getAction()
            yz5.a r0 = r6.f101054f
            java.lang.Object r1 = r0.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L27
            return r1
        L27:
            int r0 = r8.getAction()
            com.tencent.mm.plugin.fav.ui.gallery.m2 r2 = r6.f101055g
            r3 = 1
            if (r0 == 0) goto L6c
            if (r0 == r3) goto L64
            r7 = 2
            if (r0 == r7) goto L3a
            r7 = 3
            if (r0 == r7) goto L64
            goto Lc3
        L3a:
            boolean r7 = r6.f101057i
            if (r7 == 0) goto L5f
            float r7 = r8.getX()
            float r0 = r6.f101064s
            float r7 = r7 - r0
            float r8 = r8.getY()
            float r0 = r6.f101065t
            float r8 = r8 - r0
            float r7 = r7 * r7
            float r8 = r8 * r8
            float r7 = r7 + r8
            double r7 = (double) r7
            double r7 = java.lang.Math.sqrt(r7)
            float r7 = (float) r7
            float r8 = r2.f101014j
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L5e
            r6.e()
        L5e:
            return r1
        L5f:
            boolean r7 = r6.f101056h
            if (r7 == 0) goto Lc3
            return r3
        L64:
            boolean r7 = r6.f101057i
            if (r7 == 0) goto Lc3
            r6.e()
            goto Lc3
        L6c:
            float r0 = r8.getX()
            r6.f101064s = r0
            float r0 = r8.getY()
            r6.f101065t = r0
            float r0 = r8.getX()
            r6.f101062q = r0
            float r0 = r8.getY()
            r6.f101063r = r0
            float r0 = r8.getX()
            float r4 = r8.getY()
            android.view.View r0 = r7.k0(r0, r4)
            if (r0 == 0) goto Lc3
            int r0 = r7.u0(r0)
            r8.getX()
            r8.getY()
            r8 = -1
            if (r0 == r8) goto Lc3
            com.tencent.mm.plugin.fav.ui.gallery.x1 r8 = r6.f101053e
            com.tencent.mm.plugin.fav.ui.gallery.o1 r8 = r8.x(r0)
            if (r8 == 0) goto Lc3
            int r4 = r8.f101037c
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto Laf
            goto Lc3
        Laf:
            r6.f101066u = r0
            r6.f101057i = r3
            com.tencent.mm.plugin.fav.ui.gallery.o2 r3 = new com.tencent.mm.plugin.fav.ui.gallery.o2
            r3.<init>(r6, r0, r8, r7)
            r6.f101071z = r3
            com.tencent.mm.sdk.platformtools.n3 r7 = r6.f101070y
            long r4 = r2.f101013i
            r7.postDelayed(r3, r4)
            long r7 = r2.f101013i
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.gallery.q2.b(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
    }

    public final int d(float f17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        int height = recyclerView.getHeight();
        com.tencent.mm.plugin.fav.ui.gallery.m2 m2Var = this.f101055g;
        float f18 = m2Var.f101005a;
        int i17 = m2Var.f101006b;
        if (f17 < f18) {
            if (!m2Var.f101012h) {
                return -i17;
            }
            return -((int) (i17 * ((f18 - f17) / f18)));
        }
        float f19 = height - f18;
        if (f17 <= f19) {
            return 0;
        }
        if (!m2Var.f101012h) {
            return i17;
        }
        return (int) (i17 * ((f17 - f19) / f18));
    }

    public final void e() {
        if (this.f101057i) {
            this.f101057i = false;
            java.lang.Runnable runnable = this.f101071z;
            if (runnable != null) {
                this.f101070y.removeCallbacks(runnable);
            }
            this.f101071z = null;
        }
    }

    public final void f() {
        java.util.Set set;
        boolean z17;
        boolean z18;
        int i17 = this.f101059n;
        int i18 = this.f101060o;
        com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var = this.f101053e;
        if (i17 == -1 || i18 == -1) {
            set = kz5.r0.f314002d;
        } else {
            set = new java.util.LinkedHashSet();
            int min = java.lang.Math.min(i17, i18);
            int max = java.lang.Math.max(i17, i18);
            if (min <= max) {
                while (true) {
                    com.tencent.mm.plugin.fav.ui.gallery.o1 x17 = x1Var.x(min);
                    if (x17 != null && x17.f101037c != Integer.MAX_VALUE) {
                        set.add(java.lang.Integer.valueOf(min));
                    }
                    if (min == max) {
                        break;
                    } else {
                        min++;
                    }
                }
            }
        }
        java.util.Set g17 = kz5.q1.g(set, this.f101061p);
        java.util.Set g18 = kz5.q1.g(this.f101061p, set);
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            com.tencent.mm.plugin.fav.ui.gallery.o1 x18 = x1Var.x(intValue);
            if (x18 != null && com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.d(x18.f101036b) != (z18 = this.f101058m)) {
                com.tencent.mm.plugin.fav.ui.gallery.m1 m1Var = x1Var.f101107m;
                if (m1Var != null) {
                    ((com.tencent.mm.plugin.fav.ui.gallery.e2) m1Var).a(z18, x18, intValue);
                }
                x1Var.notifyItemChanged(intValue);
            }
        }
        java.util.Iterator it6 = g18.iterator();
        while (it6.hasNext()) {
            int intValue2 = ((java.lang.Number) it6.next()).intValue();
            com.tencent.mm.plugin.fav.ui.gallery.o1 x19 = x1Var.x(intValue2);
            if (x19 != null && com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.d(x19.f101036b) != (!this.f101058m)) {
                com.tencent.mm.plugin.fav.ui.gallery.m1 m1Var2 = x1Var.f101107m;
                if (m1Var2 != null) {
                    ((com.tencent.mm.plugin.fav.ui.gallery.e2) m1Var2).a(z17, x19, intValue2);
                }
                x1Var.notifyItemChanged(intValue2);
            }
        }
        this.f101061p = set;
        if ((!g17.isEmpty()) || (!g18.isEmpty())) {
            com.tencent.mm.plugin.fav.ui.gallery.m2 m2Var = this.f101055g;
            if (m2Var.f101010f) {
                try {
                    android.os.Vibrator vibrator = (android.os.Vibrator) ((jz5.n) this.A).getValue();
                    if (vibrator != null) {
                        int i19 = android.os.Build.VERSION.SDK_INT;
                        long j17 = m2Var.f101008d;
                        if (i19 >= 26) {
                            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, -1));
                        } else {
                            vibrator.vibrate(j17);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("SwipeMultiSelectTouchListener", "Haptic feedback failed: " + e17.getMessage());
                }
            }
        }
    }
}

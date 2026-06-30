package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class x0 implements com.tencent.mm.plugin.appbrand.widget.f0, com.tencent.mm.plugin.appbrand.page.la {
    public boolean A;
    public boolean B;
    public com.tencent.mm.plugin.appbrand.widget.e0 C;
    public final com.tencent.mm.plugin.appbrand.report.i2 D;
    public final java.util.Deque E;
    public boolean F;
    public volatile boolean G;
    public android.animation.Animator H;
    public android.animation.ValueAnimator I;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f91233a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.MotionEvent f91234b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.MotionEvent f91235c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91236d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.halfscreen.l f91237e;

    /* renamed from: f, reason: collision with root package name */
    public int f91238f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.q f91239g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f91240h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91241i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f91242j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f91243k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f91244l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91245m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91246n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f91247o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f91248p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f91249q;

    /* renamed from: r, reason: collision with root package name */
    public int f91250r;

    /* renamed from: s, reason: collision with root package name */
    public int f91251s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.VelocityTracker f91252t;

    /* renamed from: u, reason: collision with root package name */
    public final float f91253u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f91254v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f91255w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.o0 f91256x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.o0 f91257y;

    /* renamed from: z, reason: collision with root package name */
    public int f91258z;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if ((!r2 && r8.u0().L1.T) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x0(com.tencent.mm.plugin.appbrand.o6 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "runtime"
            kotlin.jvm.internal.o.g(r8, r0)
            r7.<init>()
            r7.f91233a = r8
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l r0 = com.tencent.mm.plugin.appbrand.widget.halfscreen.l.f91191d
            r7.f91237e = r0
            com.tencent.mm.plugin.appbrand.widget.q r1 = r8.f74810s
            r7.f91239g = r1
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            r7.f91240h = r1
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r8.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.L1
            java.lang.String r3 = "halfScreenConfig"
            kotlin.jvm.internal.o.f(r2, r3)
            boolean r4 = r2.c()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L38
            k91.x2 r4 = k91.x2.f305817e
            k91.x2 r2 = r2.D
            if (r2 != r4) goto L38
            r2 = r5
            goto L39
        L38:
            r2 = r6
        L39:
            if (r2 == 0) goto L47
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r8.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.L1
            boolean r2 = r2.P
            if (r2 == 0) goto L47
            r2 = r5
            goto L48
        L47:
            r2 = r6
        L48:
            if (r2 == 0) goto L74
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r8.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.L1
            kotlin.jvm.internal.o.f(r2, r3)
            boolean r3 = r2.c()
            if (r3 == 0) goto L61
            k91.x2 r3 = k91.x2.f305817e
            k91.x2 r2 = r2.D
            if (r2 != r3) goto L61
            r2 = r5
            goto L62
        L61:
            r2 = r6
        L62:
            if (r2 == 0) goto L70
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r8 = r8.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r8 = r8.L1
            boolean r8 = r8.T
            if (r8 == 0) goto L70
            r8 = r5
            goto L71
        L70:
            r8 = r6
        L71:
            if (r8 != 0) goto L74
            goto L75
        L74:
            r5 = r6
        L75:
            r7.f91244l = r5
            r8 = -1
            r7.f91251s = r8
            com.tencent.mm.plugin.appbrand.widget.o0 r8 = com.tencent.mm.plugin.appbrand.widget.o0.f91773d
            r7.f91256x = r8
            r7.f91257y = r8
            com.tencent.mm.plugin.appbrand.report.i2 r8 = new com.tencent.mm.plugin.appbrand.report.i2
            r8.<init>()
            r7.D = r8
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r7.E = r8
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r1)
            int r1 = r8.getScaledTouchSlop()
            r7.f91236d = r1
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.f91253u = r8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "init: touchSlop["
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "]  maxVelocity["
            r2.append(r1)
            r2.append(r8)
            r8 = 93
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r1 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            com.tencent.mars.xlog.Log.i(r1, r8)
            r7.q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.<init>(com.tencent.mm.plugin.appbrand.o6):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void T(int i17) {
        this.D.a(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r2 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        if (java.lang.Math.abs((int) (r1 - (r6 != null ? r6.getRawX() : 0.0f))) >= r5) goto L49;
     */
    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.U(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.V(int, int, int, int):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public boolean W(android.animation.Animator.AnimatorListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        android.animation.Animator animator = this.H;
        if (!(animator != null && animator.isRunning())) {
            return false;
        }
        android.animation.Animator animator2 = this.H;
        kotlin.jvm.internal.o.d(animator2);
        animator2.addListener(listener);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void X(int i17, int i18) {
        this.f91250r = i17;
        this.f91251s = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "defaultViewHeight=" + i17 + "  maxViewHeight=" + i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void Y() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancelAnimate] lastContainerAnimator isRuning:");
        android.animation.Animator animator = this.H;
        sb6.append(animator != null ? java.lang.Boolean.valueOf(animator.isRunning()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", sb6.toString());
        android.animation.Animator animator2 = this.H;
        boolean z17 = false;
        if (animator2 != null && animator2.isRunning()) {
            z17 = true;
        }
        if (z17) {
            android.animation.Animator animator3 = this.H;
            if (animator3 != null) {
                animator3.cancel();
            }
            this.H = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[cancelAnimate] cancel last container animator");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void Z(com.tencent.mm.plugin.appbrand.widget.c0 type, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17) {
        android.animation.ValueAnimator ofInt;
        com.tencent.mm.plugin.appbrand.page.n7 N2;
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] type[" + type + "]}");
        if (this.F && type == com.tencent.mm.plugin.appbrand.widget.c0.f91066f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] skip type[" + type + "]}. isDismissAnimating=true");
            return;
        }
        this.f91242j = z17;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = -1;
        int ordinal = type.ordinal();
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f91239g;
        boolean z18 = false;
        if (ordinal == 0) {
            if (qVar.getHeight() != this.f91250r) {
                ofInt = android.animation.ValueAnimator.ofInt(qVar.getHeight(), this.f91250r);
            }
            ofInt = null;
        } else if (ordinal != 1) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f91233a;
            if (ordinal == 2) {
                if (java.lang.Integer.valueOf(qVar.getHeight()).intValue() != java.lang.Integer.valueOf(java.lang.Math.max(qVar.getHeight(), java.lang.Math.min(b(), f()))).intValue()) {
                    com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
                    if (((java.lang.Boolean) l0Var.f91203i.getValue()).booleanValue() && (N2 = l0Var.f91195a.N2()) != null) {
                        N2.f4(true, qi1.a.f363480e);
                    }
                    ofInt = android.animation.ValueAnimator.ofInt(qVar.getHeight(), java.lang.Math.max(qVar.getHeight(), java.lang.Math.min(b(), f())));
                }
                ofInt = null;
            } else {
                if (ordinal != 3 && ordinal != 4) {
                    throw new jz5.j();
                }
                f0Var.f310116d = 0;
                int[] iArr = new int[2];
                iArr[0] = qVar.getTop();
                int top = qVar.getTop() + qVar.getHeight();
                com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var2 = o6Var.H2;
                iArr[1] = top + (l0Var2.e().G == -1 ? 0 : l0Var2.e().G);
                ofInt = android.animation.ValueAnimator.ofInt(iArr);
            }
        } else {
            int i17 = this.f91250r;
            if (i17 > 0) {
                ofInt = android.animation.ValueAnimator.ofInt(0, i17);
            }
            ofInt = null;
        }
        if (ofInt == null) {
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationStart(android.animation.ValueAnimator.ofInt(0, 0));
            }
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(android.animation.ValueAnimator.ofInt(0, 0));
                return;
            }
            return;
        }
        android.animation.Animator animator = this.H;
        if (animator != null && animator.isRunning()) {
            z18 = true;
        }
        if (z18) {
            android.animation.Animator animator2 = this.H;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.H = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] cancel last container animator and perform new animator[" + type + ']');
        }
        ofInt.addUpdateListener(new com.tencent.mm.plugin.appbrand.widget.halfscreen.s0(type, this));
        ofInt.addListener(new com.tencent.mm.plugin.appbrand.widget.halfscreen.t0(type, this, f0Var, animatorListenerAdapter));
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.setDuration(300L);
        ofInt.start();
        this.H = ofInt;
        if (type == com.tencent.mm.plugin.appbrand.widget.c0.f91067g || type == com.tencent.mm.plugin.appbrand.widget.c0.f91068h) {
            this.F = true;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.la
    public void a(int i17, int i18, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "onOverScrolled   scrollX=" + i17 + "   scrollY=" + i18 + "    clampedX=" + z17 + "   clampedY=" + z18);
        if (this.f91254v) {
            return;
        }
        this.f91254v = z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f2, code lost:
    
        if (r1 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0125, code lost:
    
        if (java.lang.Math.abs((int) (r0 - (r1 != null ? r1.getRawX() : 0.0f))) >= r8) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1 != 3) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:99:0x0133, B:103:0x013d, B:105:0x014f, B:109:0x015a, B:113:0x0169, B:117:0x0171, B:119:0x0175, B:121:0x017b, B:123:0x0181, B:124:0x0199, B:125:0x019f, B:127:0x01a3), top: B:98:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0199 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:99:0x0133, B:103:0x013d, B:105:0x014f, B:109:0x015a, B:113:0x0169, B:117:0x0171, B:119:0x0175, B:121:0x017b, B:123:0x0181, B:124:0x0199, B:125:0x019f, B:127:0x01a3), top: B:98:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3 A[Catch: all -> 0x01b4, TRY_LEAVE, TryCatch #0 {all -> 0x01b4, blocks: (B:99:0x0133, B:103:0x013d, B:105:0x014f, B:109:0x015a, B:113:0x0169, B:117:0x0171, B:119:0x0175, B:121:0x017b, B:123:0x0181, B:124:0x0199, B:125:0x019f, B:127:0x01a3), top: B:98:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081 A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:39:0x0078, B:41:0x0081, B:42:0x0087, B:44:0x0091, B:45:0x0097, B:50:0x00a5, B:55:0x00af, B:58:0x00b7, B:60:0x00c1, B:62:0x00c7, B:71:0x00dc, B:75:0x00f4, B:78:0x00fd, B:80:0x0105, B:81:0x010b, B:83:0x0113, B:85:0x011b, B:86:0x011f, B:89:0x0127), top: B:38:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091 A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:39:0x0078, B:41:0x0081, B:42:0x0087, B:44:0x0091, B:45:0x0097, B:50:0x00a5, B:55:0x00af, B:58:0x00b7, B:60:0x00c1, B:62:0x00c7, B:71:0x00dc, B:75:0x00f4, B:78:0x00fd, B:80:0x0105, B:81:0x010b, B:83:0x0113, B:85:0x011b, B:86:0x011f, B:89:0x0127), top: B:38:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7 A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:39:0x0078, B:41:0x0081, B:42:0x0087, B:44:0x0091, B:45:0x0097, B:50:0x00a5, B:55:0x00af, B:58:0x00b7, B:60:0x00c1, B:62:0x00c7, B:71:0x00dc, B:75:0x00f4, B:78:0x00fd, B:80:0x0105, B:81:0x010b, B:83:0x0113, B:85:0x011b, B:86:0x011f, B:89:0x0127), top: B:38:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:39:0x0078, B:41:0x0081, B:42:0x0087, B:44:0x0091, B:45:0x0097, B:50:0x00a5, B:55:0x00af, B:58:0x00b7, B:60:0x00c1, B:62:0x00c7, B:71:0x00dc, B:75:0x00f4, B:78:0x00fd, B:80:0x0105, B:81:0x010b, B:83:0x0113, B:85:0x011b, B:86:0x011f, B:89:0x0127), top: B:38:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105 A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:39:0x0078, B:41:0x0081, B:42:0x0087, B:44:0x0091, B:45:0x0097, B:50:0x00a5, B:55:0x00af, B:58:0x00b7, B:60:0x00c1, B:62:0x00c7, B:71:0x00dc, B:75:0x00f4, B:78:0x00fd, B:80:0x0105, B:81:0x010b, B:83:0x0113, B:85:0x011b, B:86:0x011f, B:89:0x0127), top: B:38:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0113 A[Catch: all -> 0x012e, TryCatch #1 {all -> 0x012e, blocks: (B:39:0x0078, B:41:0x0081, B:42:0x0087, B:44:0x0091, B:45:0x0097, B:50:0x00a5, B:55:0x00af, B:58:0x00b7, B:60:0x00c1, B:62:0x00c7, B:71:0x00dc, B:75:0x00f4, B:78:0x00fd, B:80:0x0105, B:81:0x010b, B:83:0x0113, B:85:0x011b, B:86:0x011f, B:89:0x0127), top: B:38:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0086  */
    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a0(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.a0(android.view.MotionEvent):boolean");
    }

    public final int b() {
        int i17;
        int f17 = f();
        return (!e() || this.f91242j || (i17 = this.f91250r) == 0) ? f17 : i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void b0(com.tencent.mm.plugin.appbrand.widget.e0 e0Var) {
        this.C = e0Var;
    }

    public final boolean c() {
        com.tencent.mm.plugin.appbrand.page.d5 x07 = this.f91233a.x0();
        if (x07 == null) {
            return false;
        }
        if (!(this.f91246n && this.f91256x == com.tencent.mm.plugin.appbrand.widget.o0.f91775f) && this.f91245m) {
            return this.f91248p || x07.getPageCount() == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r3.isRunning() == true) goto L13;
     */
    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f91243k
            if (r3 != r0) goto L5
            return
        L5:
            com.tencent.mm.plugin.appbrand.widget.halfscreen.u0 r0 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.u0
            r0.<init>(r2, r3)
            android.view.MotionEvent r3 = r2.f91235c
            if (r3 != 0) goto L21
            android.animation.Animator r3 = r2.H
            if (r3 == 0) goto L1a
            boolean r3 = r3.isRunning()
            r1 = 1
            if (r3 != r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L21
            r0.invoke()
            goto L2d
        L21:
            java.lang.String r3 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            java.lang.String r1 = "pendingGestureAndContainerAnimatorFinishTasks offer"
            com.tencent.mars.xlog.Log.i(r3, r1)
            java.util.Deque r3 = r2.E
            r3.offer(r0)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.c0(boolean):void");
    }

    public final void d(int i17) {
        int f17 = e06.p.f(i17, this.f91244l ? this.f91250r : 0, b());
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f91239g;
        if (f17 != qVar.getLayoutParams().height) {
            if (f17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[changeContainerHeight]container.layoutParams.height = 0");
            }
            qVar.getLayoutParams().height = f17;
            qVar.requestLayout();
            this.f91233a.H2.y(this.f91250r - f17, g() - f17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public void d0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        this.f91241i = z18;
        this.f91245m = z17;
        this.f91246n = z19;
        this.f91247o = z27;
        this.f91248p = z28;
        this.f91249q = z29;
    }

    public final boolean e() {
        return this.f91243k || this.f91241i;
    }

    public final int f() {
        int g17 = g();
        int i17 = this.f91251s;
        return i17 != -1 ? java.lang.Math.min(i17, g17) : g17;
    }

    public final int g() {
        android.view.Window window;
        android.view.View decorView;
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f91239g;
        android.view.ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i17 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        java.lang.Object parent = qVar.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int height = view != null ? view.getHeight() - (view.getPaddingTop() + view.getPaddingBottom()) : 0;
        android.app.Activity r07 = this.f91233a.r0();
        return java.lang.Math.max(0, (height - i17) - ((((((r07 == null || (window = r07.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 4) != 0) || this.f91249q) ? 0 : com.tencent.mm.ui.bk.p(this.f91240h)));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.f0
    public com.tencent.mm.plugin.appbrand.widget.o0 getCurrentStatus() {
        return this.f91256x;
    }

    public final boolean h(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f91233a.f74810s;
        if (qVar == null) {
            return false;
        }
        qVar.getHitRect(rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || i(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r5.f91233a
            com.tencent.mm.plugin.appbrand.widget.q r0 = r0.f74810s
            android.view.View r0 = r0.getRootView()
            r1 = 2131297363(0x7f090453, float:1.8212669E38)
            android.view.View r0 = r0.findViewById(r1)
            kotlin.jvm.internal.o.d(r0)
            boolean r1 = r0 instanceof hk1.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L45
            r1 = r0
            hk1.e r1 = (hk1.e) r1
            java.lang.String r4 = "ev"
            kotlin.jvm.internal.o.g(r6, r4)
            android.view.ViewGroup r4 = r1.f281876f
            if (r4 != 0) goto L26
            r6 = r3
            goto L41
        L26:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.view.ViewGroup r1 = r1.f281876f
            kotlin.jvm.internal.o.d(r1)
            r1.getHitRect(r4)
            float r1 = r6.getX()
            int r1 = (int) r1
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r6 = r4.contains(r1, r6)
        L41:
            if (r6 == 0) goto L45
            r6 = r2
            goto L46
        L45:
            r6 = r3
        L46:
            if (r6 == 0) goto L49
            goto L4a
        L49:
            r0 = 0
        L4a:
            if (r0 == 0) goto L4d
            return r2
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.i(android.view.MotionEvent):boolean");
    }

    public final boolean j(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.appbrand.widget.e0 e0Var = this.C;
        if (e0Var == null) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.p0 p0Var = (com.tencent.mm.plugin.appbrand.widget.halfscreen.p0) e0Var;
        com.tencent.mm.plugin.appbrand.o6 o6Var = p0Var.f91213a;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o6Var.u0().L1;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        if (!halfScreenConfig.c() || !halfScreenConfig.f77359f) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = o6Var.H2;
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
        if (f0Var != null) {
            f0Var.b0(null);
            f0Var.T(12);
        }
        com.tencent.mm.plugin.appbrand.widget.halfscreen.o0 o0Var = new com.tencent.mm.plugin.appbrand.widget.halfscreen.o0(p0Var);
        if (l0Var.q()) {
            com.tencent.mm.plugin.appbrand.widget.halfscreen.m0 m0Var = new com.tencent.mm.plugin.appbrand.widget.halfscreen.m0(o0Var);
            l0Var.getClass();
            l0Var.f91205k.add(m0Var);
        } else {
            o0Var.invoke();
        }
        if (o6Var.J0()) {
            o6Var.S();
            return true;
        }
        o6Var.l0();
        return true;
    }

    public final void k(int i17, boolean z17) {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var;
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
        com.tencent.mm.plugin.appbrand.page.n7 N2;
        al1.b r17;
        al1.b r18;
        android.view.View a17;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.content.Context context;
        android.content.res.Resources resources2;
        android.util.DisplayMetrics displayMetrics2;
        if (!this.f91245m || (l0Var = this.f91233a.H2) == null) {
            return;
        }
        int i18 = this.f91250r;
        boolean z18 = false;
        if ((l0Var.f91197c || z17) && (weAppHalfScreenStatusChangeListener = l0Var.e().f77366p) != null) {
            com.tencent.mm.plugin.appbrand.config.HeightInfo heightInfo = new com.tencent.mm.plugin.appbrand.config.HeightInfo(i17, i18);
            android.os.ResultReceiver resultReceiver = weAppHalfScreenStatusChangeListener.f77397e;
            if (resultReceiver != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                k91.q3[] q3VarArr = k91.q3.f305733d;
                bundle.putInt("action", 1);
                bundle.putParcelable("height_info", heightInfo);
                resultReceiver.send(0, bundle);
            }
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = l0Var.f91195a;
        if (o6Var.C0() != null) {
            il1.c cVar = new il1.c();
            com.tencent.mm.plugin.appbrand.service.c0 C0 = o6Var.C0();
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("initialHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
            lVarArr[1] = new jz5.l("height", java.lang.Integer.valueOf(ik1.w.e(i17)));
            lVarArr[2] = new jz5.l("screenHeight", java.lang.Integer.valueOf(ik1.w.e((C0 == null || (context = C0.getContext()) == null || (resources2 = context.getResources()) == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) ? com.tencent.mm.plugin.appbrand.utils.f5.a(C0)[1] : displayMetrics2.heightPixels)));
            cVar.t(kz5.c1.k(lVarArr));
            cVar.u(C0);
            cVar.m();
        }
        if (i17 < i18) {
            return;
        }
        boolean z19 = i17 == i18;
        int i19 = z19 ? 0 : 8;
        android.app.Activity r07 = o6Var.r0();
        int i27 = (r07 == null || (resources = r07.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? com.tencent.mm.plugin.appbrand.utils.f5.a(o6Var.C0())[1] : displayMetrics.heightPixels;
        wa1.a aVar = wa1.b.f444100a;
        boolean b17 = aVar.b(o6Var);
        com.tencent.mm.plugin.appbrand.widget.halfscreen.n nVar = com.tencent.mm.plugin.appbrand.widget.halfscreen.l0.f91194l;
        if (!b17) {
            hk1.e a18 = nVar.a(o6Var);
            if (a18 != null) {
                a18.setExternalHeaderVisibilityWithAnimation(i19);
                return;
            }
            return;
        }
        if (aVar.b(o6Var) && o6Var.u0().L1.P) {
            if (aVar.b(o6Var) && o6Var.u0().L1.T) {
                return;
            }
            hk1.e a19 = nVar.a(o6Var);
            if (a19 != null) {
                a19.setExternalHeaderVisibility(i19);
            }
            mi1.v vVar = o6Var.f74821z;
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar baseAppBrandSingleCloseCapsuleBar = (vVar == null || (a17 = vVar.a(com.tencent.mm.R.id.f483107wr)) == null || !(a17 instanceof com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar)) ? null : (com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar) a17;
            if (baseAppBrandSingleCloseCapsuleBar != null) {
                baseAppBrandSingleCloseCapsuleBar.setVisibility(i19);
            }
            mi1.v vVar2 = o6Var.f74821z;
            if (vVar2 != null) {
                float f17 = z19 ? 1.0f : (i17 - i18) / (i27 - i18);
                if (vVar2.f326703b != null) {
                    vVar2.c().setAlpha(f17);
                }
            }
            com.tencent.mm.plugin.appbrand.page.n7 N22 = o6Var.N2();
            al1.h0 h0Var = al1.h0.HalfScreenConfig;
            if (N22 != null && (r18 = N22.r1()) != null) {
                if (!((r18.getCapsuleView().getVisibility() == 0 && z19) || (r18.getCapsuleView().getVisibility() == 4 && !z19))) {
                    r18 = null;
                }
                if (r18 != null) {
                    r18.l(!z19, h0Var);
                }
            }
            boolean z27 = z19 || l0Var.g();
            com.tencent.mm.plugin.appbrand.o6 a27 = aVar.a(o6Var);
            if (a27 == null || (N2 = a27.N2()) == null || (r17 = N2.r1()) == null) {
                return;
            }
            if ((r17.getCapsuleView().getVisibility() == 0 && !z27) || (r17.getCapsuleView().getVisibility() == 4 && z27)) {
                z18 = true;
            }
            al1.b bVar = z18 ? r17 : null;
            if (bVar != null) {
                bVar.l(z27, h0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.g(r10, r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r9.f91233a
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 r0 = r0.H2
            r1 = 0
            if (r0 == 0) goto L5f
            com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar r2 = r0.c()
            r3 = 1
            if (r2 == 0) goto L51
            float r4 = r10.getRawX()
            float r10 = r10.getRawY()
            r5 = 2
            int[] r5 = new int[r5]
            android.view.View r2 = r2.getCloseButton()
            if (r2 != 0) goto L25
            goto L4c
        L25:
            r2.getLocationOnScreen(r5)
            r6 = r5[r1]
            r5 = r5[r3]
            int r7 = r2.getWidth()
            int r2 = r2.getHeight()
            float r8 = (float) r6
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 < 0) goto L4c
            int r6 = r6 + r7
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L4c
            float r4 = (float) r5
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L4c
            int r5 = r5 + r2
            float r2 = (float) r5
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L4c
            r10 = r3
            goto L4d
        L4c:
            r10 = r1
        L4d:
            if (r10 != r3) goto L51
            r10 = r3
            goto L52
        L51:
            r10 = r1
        L52:
            if (r10 == 0) goto L56
        L54:
            r1 = r3
            goto L5f
        L56:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r10 = r0.e()
            boolean r10 = r10.A
            if (r10 != 0) goto L5f
            goto L54
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.l(android.view.MotionEvent):boolean");
    }

    public final boolean m() {
        boolean e17 = e();
        com.tencent.mm.plugin.appbrand.widget.q qVar = this.f91239g;
        if (e17) {
            return qVar.getHeight() == this.f91250r;
        }
        boolean z17 = qVar.getHeight() == f();
        qVar.getHeight();
        return z17;
    }

    public final void n() {
        q(com.tencent.mm.plugin.appbrand.widget.halfscreen.l.f91191d);
        android.view.MotionEvent motionEvent = this.f91234b;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f91234b = null;
        android.view.VelocityTracker velocityTracker = this.f91252t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f91252t = null;
        android.view.MotionEvent motionEvent2 = this.f91235c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f91235c = null;
        boolean z17 = false;
        this.f91254v = false;
        this.f91255w = false;
        this.f91258z = 0;
        this.f91238f = 0;
        this.A = false;
        this.B = false;
        com.tencent.mm.plugin.appbrand.page.v5 pageView = this.f91233a.x0().getPageView();
        if (pageView instanceof com.tencent.mm.plugin.appbrand.page.n7) {
            ((com.tencent.mm.plugin.appbrand.page.n7) pageView).a4(this);
        }
        android.animation.Animator animator = this.H;
        if (animator != null && animator.isRunning()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "lastContainerAnimator isRunning. pending task");
        } else {
            o();
        }
    }

    public final void o() {
        while (true) {
            java.util.Deque deque = this.E;
            if (deque.isEmpty()) {
                return;
            } else {
                ((yz5.a) ((java.util.concurrent.LinkedBlockingDeque) deque).removeFirst()).invoke();
            }
        }
    }

    public final void p(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2 = this.f91234b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f91234b = android.view.MotionEvent.obtain(motionEvent);
    }

    public final void q(com.tencent.mm.plugin.appbrand.widget.halfscreen.l dragState) {
        com.tencent.mm.plugin.appbrand.page.n7 N2;
        if (this.f91237e == dragState) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "setDragStatus " + this.f91237e + " -> " + dragState);
        this.f91237e = dragState;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = this.f91233a.H2;
        if (l0Var != null) {
            kotlin.jvm.internal.o.g(dragState, "dragState");
            if (dragState == com.tencent.mm.plugin.appbrand.widget.halfscreen.l.f91191d) {
                com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
                if ((f0Var != null ? f0Var.getCurrentStatus() : null) == com.tencent.mm.plugin.appbrand.widget.o0.f91775f) {
                    l0Var.w();
                }
            }
            int ordinal = dragState.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (N2 = l0Var.f91195a.N2()) != null) {
                    N2.f4(true, ((java.lang.Boolean) l0Var.f91203i.getValue()).booleanValue() ? qi1.a.f363480e : qi1.a.f363479d);
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.halfscreen.w wVar = new com.tencent.mm.plugin.appbrand.widget.halfscreen.w(l0Var);
            com.tencent.mm.plugin.appbrand.widget.f0 f0Var2 = l0Var.f91198d;
            if (f0Var2 != null && f0Var2.W(wVar)) {
                return;
            }
            l0Var.n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r11 < 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0094, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0092, code lost:
    
        if (r10 < 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.halfscreen.x0.r(int, int):void");
    }
}

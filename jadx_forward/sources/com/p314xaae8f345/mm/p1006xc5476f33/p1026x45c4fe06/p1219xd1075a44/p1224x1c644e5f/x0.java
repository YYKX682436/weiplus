package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class x0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la {
    public boolean A;
    public boolean B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.e0 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i2 D;
    public final java.util.Deque E;
    public boolean F;
    public volatile boolean G;
    public android.animation.Animator H;
    public android.animation.ValueAnimator I;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f172766a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.MotionEvent f172767b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.MotionEvent f172768c;

    /* renamed from: d, reason: collision with root package name */
    public final int f172769d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l f172770e;

    /* renamed from: f, reason: collision with root package name */
    public int f172771f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q f172772g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f172773h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172774i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f172775j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f172776k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f172777l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f172778m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f172779n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f172780o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f172781p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f172782q;

    /* renamed from: r, reason: collision with root package name */
    public int f172783r;

    /* renamed from: s, reason: collision with root package name */
    public int f172784s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.VelocityTracker f172785t;

    /* renamed from: u, reason: collision with root package name */
    public final float f172786u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f172787v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f172788w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0 f172789x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0 f172790y;

    /* renamed from: z, reason: collision with root package name */
    public int f172791z;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if ((!r2 && r8.u0().L1.T) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "runtime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            r7.<init>()
            r7.f172766a = r8
            com.tencent.mm.plugin.appbrand.widget.halfscreen.l r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l.f172724d
            r7.f172770e = r0
            com.tencent.mm.plugin.appbrand.widget.q r1 = r8.f156343s
            r7.f172772g = r1
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r7.f172773h = r1
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r2 = r8.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r2 = r2.L1
            java.lang.String r3 = "halfScreenConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            boolean r4 = r2.c()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L38
            k91.x2 r4 = k91.x2.f387350e
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            boolean r3 = r2.c()
            if (r3 == 0) goto L61
            k91.x2 r3 = k91.x2.f387350e
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
            r7.f172777l = r5
            r8 = -1
            r7.f172784s = r8
            com.tencent.mm.plugin.appbrand.widget.o0 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0.f173306d
            r7.f172789x = r8
            r7.f172790y = r8
            com.tencent.mm.plugin.appbrand.report.i2 r8 = new com.tencent.mm.plugin.appbrand.report.i2
            r8.<init>()
            r7.D = r8
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r7.E = r8
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r1)
            int r1 = r8.getScaledTouchSlop()
            r7.f172769d = r1
            int r8 = r8.getScaledMaximumFlingVelocity()
            float r8 = (float) r8
            r7.f172786u = r8
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)
            r7.q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.<init>(com.tencent.mm.plugin.appbrand.o6):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void T(int i17) {
        this.D.a(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r2 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        if (java.lang.Math.abs((int) (r1 - (r6 != null ? r6.getRawX() : 0.0f))) >= r5) goto L49;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.U(android.view.MotionEvent):boolean");
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
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.V(int, int, int, int):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public boolean W(android.animation.Animator.AnimatorListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        android.animation.Animator animator = this.H;
        if (!(animator != null && animator.isRunning())) {
            return false;
        }
        android.animation.Animator animator2 = this.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(animator2);
        animator2.addListener(listener);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void X(int i17, int i18) {
        this.f172783r = i17;
        this.f172784s = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "defaultViewHeight=" + i17 + "  maxViewHeight=" + i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void Y() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancelAnimate] lastContainerAnimator isRuning:");
        android.animation.Animator animator = this.H;
        sb6.append(animator != null ? java.lang.Boolean.valueOf(animator.isRunning()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", sb6.toString());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[cancelAnimate] cancel last container animator");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void Z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 type, android.animation.AnimatorListenerAdapter animatorListenerAdapter, boolean z17) {
        android.animation.ValueAnimator ofInt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] type[" + type + "]}");
        if (this.F && type == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172599f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] skip type[" + type + "]}. isDismissAnimating=true");
            return;
        }
        this.f172775j = z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = -1;
        int ordinal = type.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = this.f172772g;
        boolean z18 = false;
        if (ordinal == 0) {
            if (qVar.getHeight() != this.f172783r) {
                ofInt = android.animation.ValueAnimator.ofInt(qVar.getHeight(), this.f172783r);
            }
            ofInt = null;
        } else if (ordinal != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f172766a;
            if (ordinal == 2) {
                if (java.lang.Integer.valueOf(qVar.getHeight()).intValue() != java.lang.Integer.valueOf(java.lang.Math.max(qVar.getHeight(), java.lang.Math.min(b(), f()))).intValue()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = o6Var.H2;
                    if (((java.lang.Boolean) l0Var.f172736i.mo141623x754a37bb()).booleanValue() && (N2 = l0Var.f172728a.N2()) != null) {
                        N2.f4(true, qi1.a.f445013e);
                    }
                    ofInt = android.animation.ValueAnimator.ofInt(qVar.getHeight(), java.lang.Math.max(qVar.getHeight(), java.lang.Math.min(b(), f())));
                }
                ofInt = null;
            } else {
                if (ordinal != 3 && ordinal != 4) {
                    throw new jz5.j();
                }
                f0Var.f391649d = 0;
                int[] iArr = new int[2];
                iArr[0] = qVar.getTop();
                int top = qVar.getTop() + qVar.getHeight();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var2 = o6Var.H2;
                iArr[1] = top + (l0Var2.e().G == -1 ? 0 : l0Var2.e().G);
                ofInt = android.animation.ValueAnimator.ofInt(iArr);
            }
        } else {
            int i17 = this.f172783r;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[animateContainer] cancel last container animator and perform new animator[" + type + ']');
        }
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.s0(type, this));
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.t0(type, this, f0Var, animatorListenerAdapter));
        ofInt.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt.setDuration(300L);
        ofInt.start();
        this.H = ofInt;
        if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172600g || type == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172601h) {
            this.F = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.la
    public void a(int i17, int i18, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "onOverScrolled   scrollX=" + i17 + "   scrollY=" + i18 + "    clampedX=" + z17 + "   clampedY=" + z18);
        if (this.f172787v) {
            return;
        }
        this.f172787v = z18;
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
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a0(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.a0(android.view.MotionEvent):boolean");
    }

    public final int b() {
        int i17;
        int f17 = f();
        return (!e() || this.f172775j || (i17 = this.f172783r) == 0) ? f17 : i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.e0 e0Var) {
        this.C = e0Var;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = this.f172766a.x0();
        if (x07 == null) {
            return false;
        }
        if (!(this.f172779n && this.f172789x == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0.f173308f) && this.f172778m) {
            return this.f172781p || x07.m52173x328fb10a() == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r3.isRunning() == true) goto L13;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f172776k
            if (r3 != r0) goto L5
            return
        L5:
            com.tencent.mm.plugin.appbrand.widget.halfscreen.u0 r0 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.u0
            r0.<init>(r2, r3)
            android.view.MotionEvent r3 = r2.f172768c
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
            r0.mo152xb9724478()
            goto L2d
        L21:
            java.lang.String r3 = "MicroMsg.WxaHalfScreenGestureControllerImp"
            java.lang.String r1 = "pendingGestureAndContainerAnimatorFinishTasks offer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.util.Deque r3 = r2.E
            r3.offer(r0)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.c0(boolean):void");
    }

    public final void d(int i17) {
        int f17 = e06.p.f(i17, this.f172777l ? this.f172783r : 0, b());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = this.f172772g;
        if (f17 != qVar.getLayoutParams().height) {
            if (f17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "[changeContainerHeight]container.layoutParams.height = 0");
            }
            qVar.getLayoutParams().height = f17;
            qVar.requestLayout();
            this.f172766a.H2.y(this.f172783r - f17, g() - f17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    public void d0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        this.f172774i = z18;
        this.f172778m = z17;
        this.f172779n = z19;
        this.f172780o = z27;
        this.f172781p = z28;
        this.f172782q = z29;
    }

    public final boolean e() {
        return this.f172776k || this.f172774i;
    }

    public final int f() {
        int g17 = g();
        int i17 = this.f172784s;
        return i17 != -1 ? java.lang.Math.min(i17, g17) : g17;
    }

    public final int g() {
        android.view.Window window;
        android.view.View decorView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = this.f172772g;
        android.view.ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i17 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        java.lang.Object parent = qVar.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        int height = view != null ? view.getHeight() - (view.getPaddingTop() + view.getPaddingBottom()) : 0;
        android.app.Activity r07 = this.f172766a.r0();
        return java.lang.Math.max(0, (height - i17) - ((((((r07 == null || (window = r07.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getSystemUiVisibility()) & 4) != 0) || this.f172782q) ? 0 : com.p314xaae8f345.mm.ui.bk.p(this.f172773h)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0
    /* renamed from: getCurrentStatus */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0 mo53377x430e7715() {
        return this.f172789x;
    }

    public final boolean h(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = this.f172766a.f156343s;
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
            com.tencent.mm.plugin.appbrand.o6 r0 = r5.f172766a
            com.tencent.mm.plugin.appbrand.widget.q r0 = r0.f156343s
            android.view.View r0 = r0.getRootView()
            r1 = 2131297363(0x7f090453, float:1.8212669E38)
            android.view.View r0 = r0.findViewById(r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            boolean r1 = r0 instanceof hk1.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L45
            r1 = r0
            hk1.e r1 = (hk1.e) r1
            java.lang.String r4 = "ev"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r4)
            android.view.ViewGroup r4 = r1.f363409f
            if (r4 != 0) goto L26
            r6 = r3
            goto L41
        L26:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.view.ViewGroup r1 = r1.f363409f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.i(android.view.MotionEvent):boolean");
    }

    public final boolean j(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.e0 e0Var = this.C;
        if (e0Var == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p0) e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = p0Var.f172746a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = o6Var.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        if (!halfScreenConfig.c() || !halfScreenConfig.f158892f) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = o6Var.H2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = l0Var.f172731d;
        if (f0Var != null) {
            f0Var.b0(null);
            f0Var.T(12);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.o0(p0Var);
        if (l0Var.q()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.m0(o0Var);
            l0Var.getClass();
            l0Var.f172738k.add(m0Var);
        } else {
            o0Var.mo152xb9724478();
        }
        if (o6Var.J0()) {
            o6Var.S();
            return true;
        }
        o6Var.l0();
        return true;
    }

    public final void k(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2;
        al1.b r17;
        al1.b r18;
        android.view.View a17;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.content.Context mo50352x76847179;
        android.content.res.Resources resources2;
        android.util.DisplayMetrics displayMetrics2;
        if (!this.f172778m || (l0Var = this.f172766a.H2) == null) {
            return;
        }
        int i18 = this.f172783r;
        boolean z18 = false;
        if ((l0Var.f172730c || z17) && (c11820x84c5f368 = l0Var.e().f158899p) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95 c11817xcfa25a95 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11817xcfa25a95(i17, i18);
            android.os.ResultReceiver resultReceiver = c11820x84c5f368.f158930e;
            if (resultReceiver != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                k91.q3[] q3VarArr = k91.q3.f387266d;
                bundle.putInt("action", 1);
                bundle.putParcelable("height_info", c11817xcfa25a95);
                resultReceiver.send(0, bundle);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = l0Var.f172728a;
        if (o6Var.C0() != null) {
            il1.c cVar = new il1.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = o6Var.C0();
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("initialHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
            lVarArr[1] = new jz5.l("height", java.lang.Integer.valueOf(ik1.w.e(i17)));
            lVarArr[2] = new jz5.l("screenHeight", java.lang.Integer.valueOf(ik1.w.e((C0 == null || (mo50352x76847179 = C0.mo50352x76847179()) == null || (resources2 = mo50352x76847179.getResources()) == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(C0)[1] : displayMetrics2.heightPixels)));
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
        int i27 = (r07 == null || (resources = r07.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(o6Var.C0())[1] : displayMetrics.heightPixels;
        wa1.a aVar = wa1.b.f525633a;
        boolean b17 = aVar.b(o6Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0.f172727l;
        if (!b17) {
            hk1.e a18 = nVar.a(o6Var);
            if (a18 != null) {
                a18.m133673xa6696d2(i19);
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
                a19.m133672xef2521ec(i19);
            }
            mi1.v vVar = o6Var.f156354z;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f abstractC12505x244799f = (vVar == null || (a17 = vVar.a(com.p314xaae8f345.mm.R.id.f564640wr)) == null || !(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f)) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f) a17;
            if (abstractC12505x244799f != null) {
                abstractC12505x244799f.setVisibility(i19);
            }
            mi1.v vVar2 = o6Var.f156354z;
            if (vVar2 != null) {
                float f17 = z19 ? 1.0f : (i17 - i18) / (i27 - i18);
                if (vVar2.f408236b != null) {
                    vVar2.c().setAlpha(f17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N22 = o6Var.N2();
            al1.h0 h0Var = al1.h0.HalfScreenConfig;
            if (N22 != null && (r18 = N22.r1()) != null) {
                if (!((r18.m2209x716f693c().getVisibility() == 0 && z19) || (r18.m2209x716f693c().getVisibility() == 4 && !z19))) {
                    r18 = null;
                }
                if (r18 != null) {
                    r18.l(!z19, h0Var);
                }
            }
            boolean z27 = z19 || l0Var.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 a27 = aVar.a(o6Var);
            if (a27 == null || (N2 = a27.N2()) == null || (r17 = N2.r1()) == null) {
                return;
            }
            if ((r17.m2209x716f693c().getVisibility() == 0 && !z27) || (r17.m2209x716f693c().getVisibility() == 4 && z27)) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            com.tencent.mm.plugin.appbrand.o6 r0 = r9.f172766a
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
            android.view.View r2 = r2.mo52135xc732de14()
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.l(android.view.MotionEvent):boolean");
    }

    public final boolean m() {
        boolean e17 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = this.f172772g;
        if (e17) {
            return qVar.getHeight() == this.f172783r;
        }
        boolean z17 = qVar.getHeight() == f();
        qVar.getHeight();
        return z17;
    }

    public final void n() {
        q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l.f172724d);
        android.view.MotionEvent motionEvent = this.f172767b;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f172767b = null;
        android.view.VelocityTracker velocityTracker = this.f172785t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f172785t = null;
        android.view.MotionEvent motionEvent2 = this.f172768c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f172768c = null;
        boolean z17 = false;
        this.f172787v = false;
        this.f172788w = false;
        this.f172791z = 0;
        this.f172771f = 0;
        this.A = false;
        this.B = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a = this.f172766a.x0().m52174xaf156f4a();
        if (m52174xaf156f4a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m52174xaf156f4a).a4(this);
        }
        android.animation.Animator animator = this.H;
        if (animator != null && animator.isRunning()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "lastContainerAnimator isRunning. pending task");
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
                ((yz5.a) ((java.util.concurrent.LinkedBlockingDeque) deque).removeFirst()).mo152xb9724478();
            }
        }
    }

    public final void p(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2 = this.f172767b;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f172767b = android.view.MotionEvent.obtain(motionEvent);
    }

    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l dragState) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2;
        if (this.f172770e == dragState) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "setDragStatus " + this.f172770e + " -> " + dragState);
        this.f172770e = dragState;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = this.f172766a.H2;
        if (l0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dragState, "dragState");
            if (dragState == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l.f172724d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = l0Var.f172731d;
                if ((f0Var != null ? f0Var.mo53377x430e7715() : null) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.o0.f173308f) {
                    l0Var.w();
                }
            }
            int ordinal = dragState.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (N2 = l0Var.f172728a.N2()) != null) {
                    N2.f4(true, ((java.lang.Boolean) l0Var.f172736i.mo141623x754a37bb()).booleanValue() ? qi1.a.f445013e : qi1.a.f445012d);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.w(l0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var2 = l0Var.f172731d;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0.r(int, int):void");
    }
}

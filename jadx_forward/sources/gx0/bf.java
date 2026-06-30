package gx0;

/* loaded from: classes5.dex */
public final class bf extends ou0.p implements by0.k {
    public final p012xc85e97e9.p093xedfae76a.g0 A;
    public volatile com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db B;
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 C;
    public int D;
    public volatile com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 E;
    public volatile p3325xe03a0797.p3326xc267989b.f1 F;
    public volatile java.util.Queue G;
    public volatile p3325xe03a0797.p3326xc267989b.f1 H;
    public volatile java.util.Queue I;

    /* renamed from: J */
    public final java.util.concurrent.locks.ReentrantLock f357783J;
    public final java.util.concurrent.locks.ReentrantLock K;
    public boolean L;
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a M;

    /* renamed from: r */
    public final jz5.g f357784r;

    /* renamed from: s */
    public final oz5.l f357785s;

    /* renamed from: t */
    public final oz5.l f357786t;

    /* renamed from: u */
    public final p012xc85e97e9.p093xedfae76a.j0 f357787u;

    /* renamed from: v */
    public final p012xc85e97e9.p093xedfae76a.g0 f357788v;

    /* renamed from: w */
    public volatile gx0.fd f357789w;

    /* renamed from: x */
    public final p012xc85e97e9.p093xedfae76a.j0 f357790x;

    /* renamed from: y */
    public final p012xc85e97e9.p093xedfae76a.g0 f357791y;

    /* renamed from: z */
    public final p012xc85e97e9.p093xedfae76a.j0 f357792z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f357784r = jz5.h.b(new gx0.ce(this));
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        this.f357785s = ((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p0Var.J(1));
        this.f357786t = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p0Var.J(1));
        gx0.fd fdVar = gx0.fd.f357962e;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(fdVar);
        this.f357787u = j0Var;
        this.f357788v = j0Var;
        this.f357789w = fdVar;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = new p012xc85e97e9.p093xedfae76a.j0(InvalidTime);
        this.f357790x = j0Var2;
        this.f357791y = j0Var2;
        p012xc85e97e9.p093xedfae76a.j0 j0Var3 = new p012xc85e97e9.p093xedfae76a.j0();
        this.f357792z = j0Var3;
        this.A = j0Var3;
        this.C = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16109x79d591a3;
        this.D = -1;
        this.G = new java.util.LinkedList();
        this.I = new java.util.LinkedList();
        this.f357783J = new java.util.concurrent.locks.ReentrantLock();
        this.K = new java.util.concurrent.locks.ReentrantLock();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        this.M = InvalidTime;
    }

    public static java.lang.Object d7(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            c4167x88133861 = null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x881338612 = c4167x88133861;
        if ((i17 & 2) != 0) {
            InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = InvalidTime;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        bfVar.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.sd(bfVar, c4167x881338612, c4128x879fba0a, z17, null), interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ boolean q7(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, boolean z17, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        bfVar.p7(c4128x879fba0a, z17, j17);
        return true;
    }

    public static java.lang.Object r7(gx0.bf bfVar, boolean z17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, boolean z18, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2;
        boolean z19 = (i18 & 1) != 0 ? true : z17;
        if ((i18 & 2) != 0) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
            c4128x879fba0a2 = InvalidTime;
        } else {
            c4128x879fba0a2 = c4128x879fba0a;
        }
        int i19 = (i18 & 4) != 0 ? Integer.MAX_VALUE : i17;
        boolean z27 = (i18 & 8) != 0 ? true : z18;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee645532 = (i18 & 16) != 0 ? null : c4129xdee64553;
        bfVar.getClass();
        return p3325xe03a0797.p3326xc267989b.l.g(bfVar.f357786t, new gx0.ye(z19, bfVar, c4128x879fba0a2, i19, c4129xdee645532, z27, null), interfaceC29045xdcb5ca57);
    }

    public static java.lang.Object t7(gx0.bf bfVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        bfVar.getClass();
        return p3325xe03a0797.p3326xc267989b.l.g(bfVar.f357786t, new gx0.af(bfVar, z17, null), interfaceC29045xdcb5ca57);
    }

    public final void Y6(p3325xe03a0797.p3326xc267989b.f1 f1Var) {
        synchronized (this.K) {
            if (this.H != null) {
                ((java.util.LinkedList) this.I).clear();
                ((java.util.LinkedList) this.I).add(f1Var);
            } else {
                this.H = f1Var;
                p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.hd(this, null), 3, null);
            }
        }
    }

    public final java.lang.Object Z6(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, rv0.c7 c7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(this.f357786t, new gx0.ld(this, c4181x2248e1a3, c7Var, null), interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[PHI: r8
  0x0064: PHI (r8v5 java.lang.Object) = (r8v4 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0061, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(android.view.SurfaceView r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof gx0.md
            if (r0 == 0) goto L13
            r0 = r8
            gx0.md r0 = (gx0.md) r0
            int r1 = r0.f358260h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358260h = r1
            goto L18
        L13:
            gx0.md r0 = new gx0.md
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f358258f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358260h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f358257e
            android.view.SurfaceView r7 = (android.view.SurfaceView) r7
            java.lang.Object r2 = r0.f358256d
            gx0.bf r2 = (gx0.bf) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4f
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r0.f358256d = r6
            r0.f358257e = r7
            r0.f358260h = r4
            java.lang.Object r8 = r6.O6(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            oz5.l r8 = r2.f357786t
            gx0.od r4 = new gx0.od
            r5 = 0
            r4.<init>(r2, r7, r5)
            r0.f358256d = r5
            r0.f358257e = r5
            r0.f358260h = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r4, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bf.a7(android.view.SurfaceView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        Y6(p3325xe03a0797.p3326xc267989b.l.a(m158345xefc66565(), this.f357786t, p3325xe03a0797.p3326xc267989b.a1.LAZY, new gx0.qd(this, time, z17, null)));
        return true;
    }

    public final boolean c7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = this.E;
        if (c4167x88133861 == null) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.y0 m158345xefc66565 = m158345xefc66565();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.f1 a17 = p3325xe03a0797.p3326xc267989b.l.a(m158345xefc66565, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, p3325xe03a0797.p3326xc267989b.a1.LAZY, new gx0.rd(c4167x88133861, this, null));
        synchronized (this.f357783J) {
            if (this.F != null) {
                ((java.util.LinkedList) this.G).clear();
                ((java.util.LinkedList) this.G).add(a17);
            } else {
                this.F = a17;
                p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.gd(this, null), 3, null);
            }
        }
        return true;
    }

    public final java.lang.Object e7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(this.f357786t, new gx0.wd(this, null), interfaceC29045xdcb5ca57);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gx0.xd
            if (r0 == 0) goto L13
            r0 = r7
            gx0.xd r0 = (gx0.xd) r0
            int r1 = r0.f358711g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358711g = r1
            goto L18
        L13:
            gx0.xd r0 = new gx0.xd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f358709e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358711g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f358708d
            gx0.bf r2 = (gx0.bf) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L55
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.util.concurrent.locks.ReentrantLock r7 = r6.f357783J
            monitor-enter(r7)
            kotlinx.coroutines.f1 r2 = r6.F     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L48
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L95
            monitor-exit(r7)
            return r0
        L48:
            monitor-exit(r7)
            r0.f358708d = r6
            r0.f358711g = r4
            java.lang.Object r7 = r2.k(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            java.util.concurrent.locks.ReentrantLock r7 = r2.f357783J
            monitor-enter(r7)
            r4 = 0
            java.util.Queue r5 = r2.G     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            if (r5 == 0) goto L63
            r5 = r4
            goto L6d
        L63:
            java.util.Queue r5 = r2.G     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            java.util.LinkedList r5 = (java.util.LinkedList) r5     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            java.lang.Object r5 = r5.remove()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            kotlinx.coroutines.f1 r5 = (p3325xe03a0797.p3326xc267989b.f1) r5     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
        L6d:
            r2.F = r5     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            kotlinx.coroutines.f1 r5 = r2.F     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            if (r5 != 0) goto L77
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> L88
            monitor-exit(r7)
            return r0
        L77:
            monitor-exit(r7)
            r0.f358708d = r4
            r0.f358711g = r3
            java.lang.Object r7 = r2.f7(r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        L86:
            r0 = move-exception
            goto L8a
        L88:
            r0 = move-exception
            goto L93
        L8a:
            r0.getMessage()     // Catch: java.lang.Throwable -> L88
            r2.F = r4     // Catch: java.lang.Throwable -> L88
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L88
            monitor-exit(r7)
            return r0
        L93:
            monitor-exit(r7)
            throw r0
        L95:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bf.f7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gx0.yd
            if (r0 == 0) goto L13
            r0 = r7
            gx0.yd r0 = (gx0.yd) r0
            int r1 = r0.f358766g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358766g = r1
            goto L18
        L13:
            gx0.yd r0 = new gx0.yd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f358764e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358766g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L83
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f358763d
            gx0.bf r2 = (gx0.bf) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L55
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.util.concurrent.locks.ReentrantLock r7 = r6.K
            monitor-enter(r7)
            kotlinx.coroutines.f1 r2 = r6.H     // Catch: java.lang.Throwable -> L94
            if (r2 != 0) goto L48
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L94
            monitor-exit(r7)
            return r0
        L48:
            monitor-exit(r7)
            r0.f358763d = r6
            r0.f358766g = r4
            java.lang.Object r7 = r2.k(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            java.util.concurrent.locks.ReentrantLock r7 = r2.K
            monitor-enter(r7)
            r4 = 0
            java.util.Queue r5 = r2.I     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r5 == 0) goto L63
            r5 = r4
            goto L6d
        L63:
            java.util.Queue r5 = r2.I     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.util.LinkedList r5 = (java.util.LinkedList) r5     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            java.lang.Object r5 = r5.remove()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            kotlinx.coroutines.f1 r5 = (p3325xe03a0797.p3326xc267989b.f1) r5     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
        L6d:
            r2.H = r5     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            kotlinx.coroutines.f1 r5 = r2.H     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            if (r5 != 0) goto L77
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L88
            monitor-exit(r7)
            return r0
        L77:
            monitor-exit(r7)
            r0.f358763d = r4
            r0.f358766g = r3
            java.lang.Object r7 = r2.g7(r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        L86:
            r0 = move-exception
            goto L92
        L88:
            r0 = move-exception
            r2.H = r4     // Catch: java.lang.Throwable -> L86
            r0.getMessage()     // Catch: java.lang.Throwable -> L86
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L86
            monitor-exit(r7)
            return r0
        L92:
            monitor-exit(r7)
            throw r0
        L94:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bf.g7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a h7() {
        ou0.g gVar = (ou0.g) this.A.mo3195x754a37bb();
        if (gVar != null) {
            return gVar;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a i7() {
        ou0.g gVar = (ou0.g) this.A.mo3195x754a37bb();
        if (gVar != null) {
            return gVar;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        return InvalidTime;
    }

    /* renamed from: isPlaying */
    public final boolean m132411xc00617a4() {
        return this.f357789w == gx0.fd.f357965h;
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db k7() {
        if (((gx0.w8) ((jz5.n) this.f357784r).mo141623x754a37bb()).f358648r == gx0.y4.f358737h) {
            return this.B;
        }
        return null;
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l7() {
        long j17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713[] l18;
        java.lang.Long valueOf;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x881338612 = this.E;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = null;
        if (c4167x881338612 != null && (c4160xdd704649 = c4167x881338612.f129947a) != null && (l18 = c4160xdd704649.l()) != null) {
            if (l18.length == 0) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(l18[0].B().m34007xde00a612().m33976x194898be());
                kz5.x0 it = new e06.k(1, l18.length - 1).iterator();
                while (((e06.j) it).f327747f) {
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(l18[it.b()].B().m34007xde00a612().m33976x194898be());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            }
            java.lang.Long l19 = valueOf;
            if (l19 != null) {
                j17 = l19.longValue();
                c4167x88133861 = this.E;
                if (c4167x88133861 != null && (l17 = c4167x88133861.l()) != null) {
                    c4128x879fba0a = ou0.f.b(l17, new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(j17));
                }
                if (!(c4128x879fba0a == null && c4128x879fba0a.m33983x7b953cf2()) || c4128x879fba0a != null) {
                    return c4128x879fba0a;
                }
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
                return InvalidTime;
            }
        }
        j17 = 0;
        c4167x88133861 = this.E;
        if (c4167x88133861 != null) {
            c4128x879fba0a = ou0.f.b(l17, new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(j17));
        }
        if (!(c4128x879fba0a == null && c4128x879fba0a.m33983x7b953cf2())) {
            return c4128x879fba0a;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime2, "InvalidTime");
        return InvalidTime2;
    }

    public final boolean m7() {
        return this.f357789w == gx0.fd.f357964g || this.f357789w == gx0.fd.f357966i;
    }

    public final void n7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l76 = l7();
        if (l76.m33983x7b953cf2()) {
            this.f357790x.mo7808x76db6cb1(l76);
        }
    }

    public final void o7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 range, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        boolean z18 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.C, range);
        this.C = range;
        if (z18 && this.f357789w == gx0.fd.f357965h && z17) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), this.f357786t, null, new gx0.re(this, range, null), 2, null);
        }
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        ((java.util.LinkedList) this.G).clear();
        ((java.util.LinkedList) this.I).clear();
        p3325xe03a0797.p3326xc267989b.v2.c(this.f357785s, null, 1, null);
        p3325xe03a0797.p3326xc267989b.v2.c(this.f357786t, null, 1, null);
        super.mo528x82b764cd();
    }

    public final boolean p7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        Y6(p3325xe03a0797.p3326xc267989b.l.a(m158345xefc66565(), this.f357786t, p3325xe03a0797.p3326xc267989b.a1.LAZY, new gx0.te(this, time, j17, z17, null)));
        return true;
    }

    public final java.lang.Object s7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object t76;
        return (m7() || (t76 = t7(this, false, interfaceC29045xdcb5ca57, 1, null)) != pz5.a.f440719d) ? jz5.f0.f384359a : t76;
    }
}

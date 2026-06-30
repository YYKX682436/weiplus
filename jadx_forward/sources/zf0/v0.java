package zf0;

/* loaded from: classes12.dex */
public final class v0 extends qi3.c {

    /* renamed from: x, reason: collision with root package name */
    public static final zf0.b f554095x = new zf0.b(null);

    /* renamed from: i, reason: collision with root package name */
    public final vf0.h3 f554096i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f554097m;

    /* renamed from: n, reason: collision with root package name */
    public volatile float f554098n;

    /* renamed from: o, reason: collision with root package name */
    public volatile long f554099o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f554100p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f554101q;

    /* renamed from: r, reason: collision with root package name */
    public volatile float f554102r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f554103s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f554104t;

    /* renamed from: u, reason: collision with root package name */
    public volatile long f554105u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f554106v;

    /* renamed from: w, reason: collision with root package name */
    public volatile float f554107w;

    public v0(vf0.h3 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f554096i = params;
        this.f554097m = new java.util.concurrent.CopyOnWriteArrayList();
        this.f554102r = 5.0f;
        this.f554107w = 40.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(zf0.v0 r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof zf0.o
            if (r0 == 0) goto L16
            r0 = r7
            zf0.o r0 = (zf0.o) r0
            int r1 = r0.f554027g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f554027g = r1
            goto L1b
        L16:
            zf0.o r0 = new zf0.o
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f554025e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554027g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f554024d
            vf0.j1 r5 = (vf0.j1) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r1 = r5
            goto L54
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            vf0.j1 r7 = new vf0.j1
            vf0.o2 r2 = vf0.o2.f517775d
            r4 = 0
            r7.<init>(r4, r4, r2)
            zf0.p r2 = new zf0.p
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.f554024d = r7
            r0.f554027g = r3
            java.lang.Object r5 = r2.mo146xb9724478(r0)
            if (r5 != r1) goto L53
            goto L54
        L53:
            r1 = r7
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.E(zf0.v0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void G(zf0.v0 v0Var, oi3.h hVar, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(v0Var.id());
        sb6.append("onMsgSendFail Id:");
        sb6.append(hVar.m75942xfb822ef2(hVar.f427150d + 0));
        sb6.append(" Talker:");
        int i18 = hVar.f427150d;
        int i19 = i18 + 3;
        sb6.append(hVar.m75945x2fec8307(i19));
        sb6.append(" retCode:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", sb6.toString());
        boolean c17 = f554095x.c(i17);
        if (c17) {
            v0Var.M("onMsgSendFail:" + i17);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(hVar.m75945x2fec8307(i19), hVar.m75942xfb822ef2(i18 + 0));
            if (k17 != null) {
                k17.r1(5);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class)).cj().lb(k17.m124847x74d37ac6(), k17, true);
                ((com.p314xaae8f345.mm.p793x2f25ba7b.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
            }
        }
        int i27 = c17 ? nd1.d1.f72919x366c91de : 105;
        t21.v2 e17 = vf0.m3.e(hVar);
        if (e17 != null) {
            e17.f496544i = i27;
            e17.U |= 256;
            e17.H.f469769f = 0;
            vf0.m3.k(e17);
        }
        t21.v2 f17 = vf0.m3.f(hVar);
        if (f17 != null) {
            f17.f496544i = i27;
            f17.H.f469769f = 0;
            f17.U = 256;
            vf0.m3.k(f17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(zf0.v0 r11, oi3.h r12, t21.v2 r13, java.util.Map r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof zf0.v
            if (r0 == 0) goto L16
            r0 = r15
            zf0.v r0 = (zf0.v) r0
            int r1 = r0.f554094g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f554094g = r1
            goto L1b
        L16:
            zf0.v r0 = new zf0.v
            r0.<init>(r11, r15)
        L1b:
            java.lang.Object r15 = r0.f554092e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554094g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.f554091d
            vf0.g r11 = (vf0.g) r11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r1 = r11
            goto L5a
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            vf0.g r15 = new vf0.g
            vf0.o2 r2 = vf0.o2.f517775d
            r4 = 0
            r15.<init>(r4, r2)
            zf0.x r2 = new zf0.x
            r10 = 0
            r4 = r2
            r5 = r11
            r6 = r15
            r7 = r13
            r8 = r14
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f554091d = r15
            r0.f554094g = r3
            java.lang.Object r11 = r2.mo146xb9724478(r0)
            if (r11 != r1) goto L59
            goto L5a
        L59:
            r1 = r15
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.H(zf0.v0, oi3.h, t21.v2, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(zf0.v0 r30, oi3.h r31, t21.v2 r32, java.util.Map r33, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r34) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.I(zf0.v0, oi3.h, t21.v2, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(zf0.v0 r16, java.lang.String r17, c01.f7 r18, vf0.o2 r19, java.util.Map r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.u(zf0.v0, java.lang.String, c01.f7, vf0.o2, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(zf0.v0 r15, vf0.e r16, t21.v2 r17, oi3.h r18, java.lang.String r19, java.util.Map r20, java.lang.String r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            r0 = r22
            r15.getClass()
            boolean r1 = r0 instanceof zf0.k
            if (r1 == 0) goto L19
            r1 = r0
            zf0.k r1 = (zf0.k) r1
            int r2 = r1.f553992g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.f553992g = r2
            r3 = r15
            goto L1f
        L19:
            zf0.k r1 = new zf0.k
            r3 = r15
            r1.<init>(r15, r0)
        L1f:
            java.lang.Object r0 = r1.f553990e
            pz5.a r12 = pz5.a.f440719d
            int r2 = r1.f553992g
            r13 = 1
            if (r2 == 0) goto L3b
            if (r2 != r13) goto L33
            java.lang.Object r1 = r1.f553989d
            vf0.j1 r1 = (vf0.j1) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r12 = r1
            goto L67
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            vf0.j1 r0 = new vf0.j1
            vf0.o2 r2 = vf0.o2.f517777f
            r4 = 0
            r0.<init>(r4, r4, r2)
            zf0.n r14 = new zf0.n
            r11 = 0
            r2 = r14
            r3 = r15
            r4 = r18
            r5 = r17
            r6 = r19
            r7 = r0
            r8 = r16
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.f553989d = r0
            r1.f553992g = r13
            java.lang.Object r1 = r14.mo146xb9724478(r1)
            if (r1 != r12) goto L66
            goto L67
        L66:
            r12 = r0
        L67:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.w(zf0.v0, vf0.e, t21.v2, oi3.h, java.lang.String, java.util.Map, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.b0
    public java.lang.Object A(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        long j17;
        qi3.d0 d0Var = this.f554096i.f517717k;
        if (d0Var != null && d0Var.f445216a == 0) {
            if (d0Var != null && d0Var.f445218c == 0) {
                if (d0Var != null && d0Var.f445216a == 0) {
                    zf0.c[] cVarArr = zf0.c.f553922d;
                    j17 = 2;
                    T(j17);
                    return jz5.f0.f384359a;
                }
            }
        }
        zf0.c[] cVarArr2 = zf0.c.f553922d;
        j17 = 3;
        T(j17);
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zf0.n0
            if (r0 == 0) goto L13
            r0 = r6
            zf0.n0 r0 = (zf0.n0) r0
            int r1 = r0.f554023g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f554023g = r1
            goto L18
        L13:
            zf0.n0 r0 = new zf0.n0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f554021e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554023g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f554020d
            qi3.k0 r0 = (qi3.k0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L6c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r5.id()
            r6.append(r2)
            java.lang.String r2 = " start to updateMsg"
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.VideoMsg.SendVideoTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            qi3.k0 r6 = new qi3.k0
            r2 = 0
            r6.<init>(r2)
            vf0.h3 r2 = r5.f554096i
            r2.f517718l = r6
            zf0.o0 r2 = new zf0.o0
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f554020d = r6
            r0.f554023g = r3
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r0 = r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.b0
    public qi3.h0 C() {
        return j() ? qi3.h0.f445254i : qi3.h0.f445249d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(yz5.l r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 1816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.D(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void J() {
        if ((!this.f554096i.f517716j.f517750c) && this.f554106v == 0) {
            return;
        }
        long j17 = this.f554103s;
        long j18 = this.f554104t;
        long j19 = this.f554105u;
        long j27 = j18 + this.f554106v;
        float e17 = j27 > 0 ? 40.0f + (e06.p.e(((float) (j17 + j19)) / ((float) j27), 0.0f, 1.0f) * 50.0f) : 40.0f;
        if (e17 <= this.f554107w) {
            return;
        }
        this.f554107w = e17;
        L(e17, qi3.g0.f445242h);
    }

    public final void L(float f17, qi3.g0 g0Var) {
        vf0.h3 h3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        boolean z17;
        float floor = (float) java.lang.Math.floor(f17);
        do {
            h3Var = this.f554096i;
            java.util.concurrent.atomic.AtomicReference atomicReference = h3Var.f517719m;
            java.lang.Float f18 = (java.lang.Float) atomicReference.get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
            if (f18.floatValue() >= floor) {
                break;
            }
            java.lang.Float valueOf = java.lang.Float.valueOf(floor);
            while (true) {
                if (atomicReference.compareAndSet(f18, valueOf)) {
                    z17 = true;
                    break;
                } else if (atomicReference.get() != f18) {
                    z17 = false;
                    break;
                }
            }
        } while (!z17);
        oi3.h hVar = h3Var.f517711e;
        if (hVar != null) {
            int i17 = hVar.f427150d;
            c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(hVar.m75942xfb822ef2(i17 + 0), hVar.m75945x2fec8307(i17 + 3));
        } else {
            c16564xb55e1d5 = null;
        }
        yf0.l0 l0Var = new yf0.l0(g0Var, this);
        l0Var.f445231h = floor;
        l0Var.f445230g = c16564xb55e1d5;
        jm.y yVar = (jm.y) ((qi3.y) i95.n0.c(qi3.y.class));
        v65.i.b(yVar.bj(), null, new zf0.j(this, l0Var, null), 1, null);
        yVar.getClass();
        v65.i.b(yVar.bj(), null, new jm.s(l0Var, yVar, null), 1, null);
    }

    public final void M(java.lang.String str) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f554097m;
        java.util.List S0 = kz5.n0.S0(copyOnWriteArrayList);
        copyOnWriteArrayList.clear();
        int i17 = 0;
        for (java.lang.Object obj : S0) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            try {
                ((yz5.l) obj).mo146xb9724478(str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoMsg.SendVideoTask", th6, "executeCancelJobs failed index:" + i17 + " reason:" + str, new java.lang.Object[0]);
            }
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", id() + " executeCancelJobs reason:" + str + " count:" + S0.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gp.a N(java.lang.String r22, java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.N(java.lang.String, java.lang.String, java.util.Map):gp.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zf0.q
            if (r0 == 0) goto L13
            r0 = r9
            zf0.q r0 = (zf0.q) r0
            int r1 = r0.f554043i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f554043i = r1
            goto L18
        L13:
            zf0.q r0 = new zf0.q
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f554041g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554043i
            java.lang.String r3 = "MicroMsg.VideoMsg.SendVideoTask"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            long r1 = r0.f554040f
            java.lang.Object r4 = r0.f554039e
            vf0.j1 r4 = (vf0.j1) r4
            java.lang.Object r0 = r0.f554038d
            zf0.v0 r0 = (zf0.v0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7e
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            long r5 = android.os.SystemClock.elapsedRealtime()
            vf0.j1 r9 = new vf0.j1
            vf0.o2 r2 = vf0.o2.f517777f
            r7 = 0
            r9.<init>(r7, r7, r2)
            vf0.h3 r2 = r8.f554096i
            r2.f517715i = r9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = r8.id()
            r2.append(r7)
            java.lang.String r7 = " start to genVideosForSend"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            zf0.r r2 = new zf0.r
            r7 = 0
            r2.<init>(r8, r9, r7)
            r0.f554038d = r8
            r0.f554039e = r9
            r0.f554040f = r5
            r0.f554043i = r4
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L7b
            return r1
        L7b:
            r0 = r8
            r4 = r9
            r1 = r5
        L7e:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r5)
            java.util.Map r1 = r4.f517731b
            java.lang.String r2 = "gen_videos_cost"
            r1.put(r2, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r0.id()
            r9.append(r0)
            java.lang.String r0 = " [genVideosForSend] end, retCode="
            r9.append(r0)
            int r0 = r4.f517730a
            r9.append(r0)
            java.lang.String r0 = "，cost="
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public yf0.l0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5;
        yf0.l0 l0Var = new yf0.l0(this.f445210f, this);
        vf0.h3 h3Var = this.f554096i;
        oi3.h hVar = h3Var.f517711e;
        if (hVar != null) {
            int i17 = hVar.f427150d;
            c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(hVar.m75942xfb822ef2(i17 + 0), hVar.m75945x2fec8307(i17 + 3));
        } else {
            c16564xb55e1d5 = null;
        }
        l0Var.f445230g = c16564xb55e1d5;
        java.lang.Object obj = h3Var.f517719m.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        l0Var.f445231h = ((java.lang.Number) obj).floatValue();
        l0Var.f445226c = h3Var.f517714h;
        vf0.k3 k3Var = h3Var.f517716j;
        l0Var.f445227d = k3Var.f517748a;
        l0Var.f543118i = k3Var.f517749b;
        l0Var.f445228e = h3Var.f517717k;
        l0Var.f445229f = h3Var.f517718l;
        return l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(oi3.h r11, java.util.Map r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof zf0.y
            if (r0 == 0) goto L13
            r0 = r13
            zf0.y r0 = (zf0.y) r0
            int r1 = r0.f554128g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f554128g = r1
            goto L18
        L13:
            zf0.y r0 = new zf0.y
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f554126e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554128g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.f554125d
            vf0.g r11 = (vf0.g) r11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L55
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            vf0.g r13 = new vf0.g
            vf0.o2 r2 = vf0.o2.f517776e
            r4 = 0
            r13.<init>(r4, r2)
            zf0.z r2 = new zf0.z
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f554125d = r13
            r0.f554128g = r3
            java.lang.Object r11 = r2.mo146xb9724478(r0)
            if (r11 != r1) goto L54
            return r1
        L54:
            r11 = r13
        L55:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.R(oi3.h, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void S(java.lang.String str, yz5.l lVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f554097m;
        copyOnWriteArrayList.add(lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", id() + " registerCancelJob tag:" + str + " size:" + copyOnWriteArrayList.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
    
        if ((r6 == null || r26.n0.N(r6)) == false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(long r20) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.T(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zf0.s0
            if (r0 == 0) goto L13
            r0 = r8
            zf0.s0 r0 = (zf0.s0) r0
            int r1 = r0.f554076i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f554076i = r1
            goto L18
        L13:
            zf0.s0 r0 = new zf0.s0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f554074g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554076i
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r1 = r0.f554073f
            java.lang.Object r3 = r0.f554072e
            qi3.i0 r3 = (qi3.i0) r3
            java.lang.Object r0 = r0.f554071d
            zf0.v0 r0 = (zf0.v0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L64
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            qi3.i0 r8 = new qi3.i0
            r2 = 0
            r8.<init>(r2)
            vf0.h3 r2 = r7.f554096i
            vf0.k3 r2 = r2.f517716j
            r2.f517749b = r8
            zf0.u0 r2 = new zf0.u0
            r6 = 0
            r2.<init>(r7, r8, r6)
            r0.f554071d = r7
            r0.f554072e = r8
            r0.f554073f = r4
            r0.f554076i = r3
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L61
            return r1
        L61:
            r0 = r7
            r3 = r8
            r1 = r4
        L64:
            vf0.h3 r8 = r0.f554096i
            vf0.k3 r8 = r8.f517716j
            boolean r8 = r8.f517750c
            if (r8 != 0) goto L7e
            java.util.Map r8 = r3.f445259b
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            java.lang.String r1 = "uploadRawMs"
            r8.put(r1, r0)
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.U(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c
    public java.lang.Integer d(boolean z17) {
        java.lang.Integer d17 = super.d(z17);
        if (d17 != null) {
            return d17;
        }
        oi3.h hVar = this.f554096i.f517711e;
        if (hVar == null) {
            return -520009;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = hVar.f427150d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(hVar.m75945x2fec8307(i17 + 3), hVar.m75942xfb822ef2(i17 + 0));
        if (k17 == null) {
            return -520002;
        }
        if (k17.W2() || k17.V2()) {
            return -520023;
        }
        return (k17.I0() == 0 || k17.P0() != 2) ? null : -520008;
    }

    @Override // qi3.c, qi3.b0
    public java.lang.String id() {
        oi3.h hVar = this.f554096i.f517711e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i());
        sb6.append("_[");
        sb6.append(hVar != null ? hVar.m75945x2fec8307(hVar.f427150d + 3) : null);
        sb6.append('_');
        sb6.append(hVar != null ? java.lang.Long.valueOf(hVar.m75942xfb822ef2(hVar.f427150d + 0)) : null);
        sb6.append('_');
        sb6.append(hVar != null ? hVar.j() : null);
        sb6.append(']');
        return sb6.toString();
    }

    @Override // qi3.c
    public boolean j() {
        oi3.h hVar = this.f554096i.f517711e;
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.K3(hVar != null ? hVar.m75945x2fec8307(hVar.f427150d + 3) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zf0.h0
            if (r0 == 0) goto L13
            r0 = r9
            zf0.h0 r0 = (zf0.h0) r0
            int r1 = r0.f553965i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f553965i = r1
            goto L18
        L13:
            zf0.h0 r0 = new zf0.h0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f553963g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f553965i
            java.lang.String r3 = "MicroMsg.VideoMsg.SendVideoTask"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            long r1 = r0.f553962f
            java.lang.Object r4 = r0.f553961e
            qi3.d0 r4 = (qi3.d0) r4
            java.lang.Object r0 = r0.f553960d
            zf0.v0 r0 = (zf0.v0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7c
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r8.id()
            r9.append(r2)
            java.lang.String r2 = " sendBypCgi start"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r9)
            long r5 = android.os.SystemClock.elapsedRealtime()
            qi3.d0 r9 = new qi3.d0
            r2 = 0
            r9.<init>(r2)
            vf0.h3 r2 = r8.f554096i
            r2.f517717k = r9
            zf0.i0 r2 = new zf0.i0
            r7 = 0
            r2.<init>(r8, r9, r7)
            r0.f553960d = r8
            r0.f553961e = r9
            r0.f553962f = r5
            r0.f553965i = r4
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L79
            return r1
        L79:
            r0 = r8
            r4 = r9
            r1 = r5
        L7c:
            java.util.Map r9 = r4.f445217b
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            java.lang.String r2 = "send_cgi_cost"
            r9.put(r2, r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r0.id()
            r9.append(r0)
            java.lang.String r0 = " sendBypCgi end. errType:"
            r9.append(r0)
            int r0 = r4.f445218c
            r9.append(r0)
            java.lang.String r0 = " errCode:"
            r9.append(r0)
            int r0 = r4.f445219d
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c
    public java.lang.Object l(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if ((!x51.o1.a() ? 0 : x51.o1.f533578b0) != 1) {
            return super.l(interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoMsg.SendVideoTask", id() + " sendCgi force fail at start (videoSendCgiForceFail=1)");
        return new qi3.d0(-520004);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zf0.j0
            if (r0 == 0) goto L13
            r0 = r8
            zf0.j0 r0 = (zf0.j0) r0
            int r1 = r0.f553988h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f553988h = r1
            goto L18
        L13:
            zf0.j0 r0 = new zf0.j0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f553986f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f553988h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f553984d
            java.lang.Object r0 = r0.f553985e
            qi3.d0 r0 = (qi3.d0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L75
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.id()
            r8.append(r2)
            java.lang.String r2 = " start to sendNormalCgi"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.VideoMsg.SendVideoTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            qi3.d0 r8 = new qi3.d0
            r2 = 0
            r8.<init>(r2)
            vf0.h3 r2 = r7.f554096i
            r2.f517717k = r8
            zf0.k0 r2 = new zf0.k0
            r6 = 0
            r2.<init>(r7, r8, r6)
            r0.f553985e = r8
            r0.f553984d = r4
            r0.f553988h = r3
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r8
            r1 = r4
        L75:
            java.util.Map r8 = r0.f445217b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "sendCGI_cost"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qi3.c
    public void t() {
        super.t();
        if (this.f554101q == null) {
            return;
        }
        L(40.0f, qi3.g0.f445242h);
    }

    @Override // qi3.c, qi3.b0
    public void x() {
        super.x();
        M("setCancel");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qi3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zf0.p0
            if (r0 == 0) goto L13
            r0 = r8
            zf0.p0 r0 = (zf0.p0) r0
            int r1 = r0.f554037h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f554037h = r1
            goto L18
        L13:
            zf0.p0 r0 = new zf0.p0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f554035f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f554037h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f554033d
            java.lang.Object r0 = r0.f554034e
            qi3.i0 r0 = (qi3.i0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L77
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = r7.id()
            r8.append(r2)
            java.lang.String r2 = " start to uploadAttach"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.VideoMsg.SendVideoTask"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            long r4 = android.os.SystemClock.elapsedRealtime()
            qi3.i0 r8 = new qi3.i0
            r2 = 0
            r8.<init>(r2)
            vf0.h3 r2 = r7.f554096i
            vf0.k3 r2 = r2.f517716j
            r2.f517748a = r8
            zf0.r0 r2 = new zf0.r0
            r6 = 0
            r2.<init>(r7, r8, r6)
            r0.f554034e = r8
            r0.f554033d = r4
            r0.f554037h = r3
            java.lang.Object r0 = r2.mo146xb9724478(r0)
            if (r0 != r1) goto L75
            return r1
        L75:
            r0 = r8
            r1 = r4
        L77:
            java.util.Map r8 = r0.f445259b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            java.lang.String r2 = "uploadMs"
            r8.put(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.v0.y(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

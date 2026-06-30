package lu3;

/* loaded from: classes10.dex */
public final class m extends zr0.c {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f402950m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f402951n;

    /* renamed from: o, reason: collision with root package name */
    public ht0.s f402952o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f402953p;

    /* renamed from: q, reason: collision with root package name */
    public android.opengl.EGLContext f402954q;

    /* renamed from: r, reason: collision with root package name */
    public int f402955r;

    /* renamed from: s, reason: collision with root package name */
    public int f402956s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f402957t;

    /* renamed from: u, reason: collision with root package name */
    public final long f402958u;

    /* renamed from: v, reason: collision with root package name */
    public long f402959v;

    /* renamed from: w, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f402960w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f402961x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(false, 1, null);
        z17 = (i17 & 1) != 0 ? false : z17;
        this.f402950m = z17;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_camerakit_record_glfence, false);
        this.f402951n = fj6;
        this.f402958u = 1500L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", "enableGlFence:" + fj6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // nr0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof lu3.c
            if (r0 == 0) goto L13
            r0 = r6
            lu3.c r0 = (lu3.c) r0
            int r1 = r0.f402923g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f402923g = r1
            goto L18
        L13:
            lu3.c r0 = new lu3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f402921e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f402923g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f402920d
            lu3.m r0 = (lu3.m) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L58
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.String r6 = "MicroMsg.CameraKitRecorder"
            java.lang.String r2 = "create"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2)
            r0.f402920d = r5
            r0.f402923g = r4
            boolean r6 = r5.f556643d
            if (r6 == 0) goto L54
            android.opengl.EGLContext r6 = android.opengl.EGL14.eglGetCurrentContext()
            zr0.a r0 = new zr0.a
            r0.<init>(r5, r6)
            r6 = 0
            r5.c(r6, r0)
        L54:
            if (r3 != r1) goto L57
            return r1
        L57:
            r0 = r5
        L58:
            android.opengl.EGLContext r6 = android.opengl.EGL14.eglGetCurrentContext()
            r0.f402954q = r6
            lu3.d r6 = new lu3.d
            r6.<init>(r0)
            kotlinx.coroutines.r2 r6 = r0.c(r4, r6)
            r0.f402960w = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ((r2 == null && r1.f375928e == r2.K) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // nr0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(is0.c r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.d(is0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(boolean z17, lu3.a aVar) {
        ht0.s sVar;
        java.lang.String str;
        android.os.Bundle bundle;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d;
        if (this.f402953p == null || this.f402954q == null) {
            return;
        }
        if (!this.f402961x || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", "create recorder");
            ht0.s sVar2 = this.f402952o;
            if (sVar2 != null) {
                sVar2.mo127742xae7a2e7a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f402953p;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = (com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d) ((c16993xacc19624 == null || (c11120x15dce88d = c16993xacc19624.f237209n) == null) ? null : c11120x15dce88d.m48123x5a5dd5d());
            if (c11120x15dce88d2 != null) {
                int i17 = c11120x15dce88d2.f152727g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f402953p;
                int i18 = 2;
                if (c16993xacc196242 != null && (bundle = c16993xacc196242.M) != null) {
                    i18 = bundle.getInt("key_record_bitrate_ratio", 2);
                }
                c11120x15dce88d2.f152727g = i17 * i18;
                ht0.s sVar3 = new ht0.s(c11120x15dce88d2, new lu3.b(), this.f402954q, -1);
                this.f402952o = sVar3;
                sVar3.G = this.f402957t;
                sVar3.k(0);
                ht0.s sVar4 = this.f402952o;
                if (sVar4 != null) {
                    if (this.f402950m) {
                        str = dw3.h.d(dw3.h.f325744a, null, null, 3, null);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = this.f402953p;
                        str = c16993xacc196243 != null ? c16993xacc196243.A : null;
                    }
                    sVar4.f366288c = str;
                }
                if (!dw3.h.f325744a.f() && (sVar = this.f402952o) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = this.f402953p;
                    sVar.f366305t = c16993xacc196244 != null ? c16993xacc196244.C : null;
                }
            }
            this.f402961x = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void f(lu3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", "reset");
        boolean z17 = false;
        this.f402955r = 0;
        this.f402956s = 0;
        ht0.s sVar = this.f402952o;
        if (sVar != null && sVar.f366311z) {
            z17 = true;
        }
        if (!z17) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        if (sVar != null) {
            sVar.mo127742xae7a2e7a();
        }
        ht0.s sVar2 = this.f402952o;
        if (sVar2 != null) {
            sVar2.mo127743x5a5b64d();
        }
        this.f402952o = null;
        synchronized (this.f556648i) {
            this.f556644e.clear();
        }
        this.f402960w = c(true, new lu3.i(this, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // nr0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lu3.e
            if (r0 == 0) goto L13
            r0 = r7
            lu3.e r0 = (lu3.e) r0
            int r1 = r0.f402928g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f402928g = r1
            goto L18
        L13:
            lu3.e r0 = new lu3.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f402926e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f402928g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            java.lang.Object r0 = r0.f402925d
            lu3.m r0 = (lu3.m) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L56
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.String r7 = "MicroMsg.CameraKitRecorder"
            java.lang.String r2 = "release"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r2)
            r0.f402925d = r6
            r0.f402928g = r5
            kotlinx.coroutines.y0 r7 = r6.f556646g
            if (r7 == 0) goto L4b
            p3325xe03a0797.p3326xc267989b.z0.c(r7, r4)
        L4b:
            android.os.HandlerThread r7 = r6.f556645f
            if (r7 == 0) goto L52
            r7.quitSafely()
        L52:
            if (r3 != r1) goto L55
            return r1
        L55:
            r0 = r6
        L56:
            r0.f402954q = r4
            r7 = 0
            r0.f402955r = r7
            r0.f402956s = r7
            ht0.s r1 = r0.f402952o
            if (r1 == 0) goto L64
            r1.mo127742xae7a2e7a()
        L64:
            ht0.s r1 = r0.f402952o
            if (r1 == 0) goto L6b
            r1.mo127743x5a5b64d()
        L6b:
            r0.f402961x = r7
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", "setMute " + z17);
        this.f402957t = z17;
        ht0.s sVar = this.f402952o;
        if (sVar != null) {
            sVar.G = z17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r8, boolean r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof lu3.j
            if (r0 == 0) goto L13
            r0 = r10
            lu3.j r0 = (lu3.j) r0
            int r1 = r0.f402945i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f402945i = r1
            goto L18
        L13:
            lu3.j r0 = new lu3.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f402943g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f402945i
            java.lang.String r3 = "MicroMsg.CameraKitRecorder"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 != r5) goto L35
            boolean r8 = r0.f402942f
            int r9 = r0.f402941e
            java.lang.Object r0 = r0.f402940d
            lu3.m r0 = (lu3.m) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L6d
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlinx.coroutines.r2 r10 = r7.f402960w
            if (r10 == 0) goto L4e
            kotlinx.coroutines.a r10 = (p3325xe03a0797.p3326xc267989b.a) r10
            boolean r10 = r10.a()
            if (r10 != r5) goto L4e
            r10 = r5
            goto L4f
        L4e:
            r10 = r4
        L4f:
            if (r10 == 0) goto L6c
            java.lang.String r10 = "startRecord >> but initRecorderJob is no finish, go to join it"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r10)
            kotlinx.coroutines.r2 r10 = r7.f402960w
            if (r10 == 0) goto L6c
            r0.f402940d = r7
            r0.f402941e = r8
            r0.f402942f = r9
            r0.f402945i = r5
            kotlinx.coroutines.c3 r10 = (p3325xe03a0797.p3326xc267989b.c3) r10
            java.lang.Object r10 = r10.C(r0)
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r0 = r7
        L6d:
            long r1 = java.lang.System.currentTimeMillis()
            r0.f402959v = r1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "startRecord >> "
            r10.<init>(r1)
            r10.append(r8)
            java.lang.String r1 = ", "
            r10.append(r1)
            r10.append(r9)
            r10.append(r1)
            long r1 = r0.f402959v
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
            ht0.s r10 = r0.f402952o
            if (r10 != 0) goto L9e
            java.lang.String r10 = "mediaRecorder is null!!!, record has some problem"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r10)
        L9e:
            ht0.s r10 = r0.f402952o
            if (r10 == 0) goto La9
            int r8 = r10.y(r4, r9, r8)
            qz5.b.d(r8)
        La9:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.i(int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object j(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jz5.f0 f0Var;
        ht0.s sVar;
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecorder", "stopRecord >> startTime >> " + this.f402959v);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f402959v;
        if (currentTimeMillis - j17 <= this.f402958u || j17 == 0) {
            this.f402959v = 0L;
            f(null);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(new java.lang.Integer(-4), null)));
        } else {
            this.f402959v = 0L;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (z17 && (sVar = this.f402952o) != null) {
                sVar.D = new lu3.k(nVar);
            }
            ht0.s sVar2 = this.f402952o;
            if (sVar2 != null) {
                sVar2.g(new lu3.l(this, currentTimeMillis2, nVar));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(new java.lang.Integer(-1), null)));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }
}

package g4;

/* loaded from: classes5.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f350163a;

    /* renamed from: b, reason: collision with root package name */
    public g4.z4 f350164b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f350165c;

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f350166d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.z2 f350167e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c0 f350168f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f350169g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f350170h;

    /* renamed from: i, reason: collision with root package name */
    public final g4.b4 f350171i;

    /* renamed from: j, reason: collision with root package name */
    public final g4.h3 f350172j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f350173k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.a f350174l;

    public y2(java.lang.Object obj, g4.b4 pagingSource, g4.h3 config, p3325xe03a0797.p3326xc267989b.p3328x30012e.j retryFlow, boolean z17, g4.g4 g4Var, g4.c4 c4Var, yz5.a invalidate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagingSource, "pagingSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retryFlow, "retryFlow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidate, "invalidate");
        this.f350170h = obj;
        this.f350171i = pagingSource;
        this.f350172j = config;
        this.f350173k = retryFlow;
        this.f350174l = invalidate;
        if (!(config.f349890f == Integer.MIN_VALUE)) {
            throw new java.lang.IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.f350163a = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, null, 6, null);
        this.f350165c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f350166d = u26.z.a(-2, null, null, 6, null);
        this.f350167e = new g4.z2(config);
        p3325xe03a0797.p3326xc267989b.c0 a17 = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);
        this.f350168f = a17;
        this.f350169g = g4.l4.a(new g4.y(a17, new g4.p2(this, null), null));
    }

    public static final void a(g4.y2 y2Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        if (y2Var.f350172j.f349890f != Integer.MIN_VALUE) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new g4.v2(y2Var, null), 3, null);
        }
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new g4.w2(y2Var, null), 3, null);
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new g4.x2(y2Var, null), 3, null);
    }

    public final java.lang.Object b(p3325xe03a0797.p3326xc267989b.p3328x30012e.j simpleTransformLatest, g4.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        g4.c2 c2Var = new g4.c2(null, this, a1Var);
        java.lang.Object obj = g4.s0.f350078a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleTransformLatest, "$this$simpleTransformLatest");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j simpleRunningReduce = g4.l4.a(new g4.r0(simpleTransformLatest, c2Var, null));
        g4.d2 d2Var = new g4.d2(a1Var, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleRunningReduce, "$this$simpleRunningReduce");
        java.lang.Object a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.c(new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new g4.m0(simpleRunningReduce, d2Var, null)), -1, null, 2, null).a(new g4.y1(this, a1Var), interfaceC29045xdcb5ca57);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g4.e2
            if (r0 == 0) goto L13
            r0 = r6
            g4.e2 r0 = (g4.e2) r0
            int r1 = r0.f349800e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f349800e = r1
            goto L18
        L13:
            g4.e2 r0 = new g4.e2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f349799d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f349800e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r1 = r0.f349804i
            kotlinx.coroutines.sync.d r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) r1
            java.lang.Object r2 = r0.f349803h
            g4.z2 r2 = (g4.z2) r2
            java.lang.Object r0 = r0.f349802g
            g4.y2 r0 = (g4.y2) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L56
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            g4.z2 r2 = r5.f350167e
            kotlinx.coroutines.sync.d r6 = r2.f350184a
            r0.f349802g = r5
            r0.f349803h = r2
            r0.f349804i = r6
            r0.f349800e = r4
            kotlinx.coroutines.sync.k r6 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r6
            java.lang.Object r0 = r6.b(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
            r1 = r6
        L56:
            g4.c3 r6 = r2.f350185b     // Catch: java.lang.Throwable -> L64
            g4.z4 r0 = r0.f350164b     // Catch: java.lang.Throwable -> L64
            g4.c4 r6 = r6.a(r0)     // Catch: java.lang.Throwable -> L64
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            r1.d(r3)
            return r6
        L64:
            r6 = move-exception
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            r1.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.y2.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0022. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024f A[Catch: all -> 0x0273, TRY_LEAVE, TryCatch #1 {all -> 0x0273, blocks: (B:25:0x023e, B:27:0x024f), top: B:24:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac A[Catch: all -> 0x0213, TRY_ENTER, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x019c, B:65:0x01ac, B:66:0x01b1, B:68:0x01b8), top: B:61:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8 A[Catch: all -> 0x0213, TRY_LEAVE, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x019c, B:65:0x01ac, B:66:0x01b1, B:68:0x01b8), top: B:61:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [g4.b4] */
    /* JADX WARN: Type inference failed for: r2v35, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r2v45, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.y2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x036c, code lost:
    
        r1.getClass();
        r0 = r14;
        r14 = r10;
        r10 = r15;
        r15 = r1;
        r17 = r12;
        r12 = r11;
        r11 = r17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04be A[Catch: all -> 0x04f1, TryCatch #1 {all -> 0x04f1, blocks: (B:114:0x04ad, B:116:0x04be, B:121:0x04e3, B:139:0x0142), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033c A[Catch: all -> 0x062c, TRY_LEAVE, TryCatch #6 {all -> 0x062c, blocks: (B:155:0x0329, B:157:0x033c), top: B:154:0x0329 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0635 A[Catch: all -> 0x063b, TRY_ENTER, TryCatch #5 {all -> 0x063b, blocks: (B:167:0x026c, B:178:0x027c, B:180:0x0287, B:183:0x0295, B:185:0x029b, B:187:0x02b1, B:189:0x02b6, B:191:0x02c1, B:193:0x02c7, B:196:0x02dd, B:200:0x0635, B:201:0x063a), top: B:166:0x026c }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0533 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x054d A[Catch: all -> 0x0622, TRY_LEAVE, TryCatch #3 {all -> 0x0622, blocks: (B:58:0x0541, B:60:0x054d), top: B:57:0x0541 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05a4 A[Catch: all -> 0x061f, TryCatch #8 {all -> 0x061f, blocks: (B:67:0x0590, B:69:0x05a4, B:71:0x05ae, B:73:0x05b2, B:74:0x05b7, B:75:0x05b5, B:76:0x05ba), top: B:66:0x0590 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05b2 A[Catch: all -> 0x061f, TryCatch #8 {all -> 0x061f, blocks: (B:67:0x0590, B:69:0x05a4, B:71:0x05ae, B:73:0x05b2, B:74:0x05b7, B:75:0x05b5, B:76:0x05ba), top: B:66:0x0590 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05b5 A[Catch: all -> 0x061f, TryCatch #8 {all -> 0x061f, blocks: (B:67:0x0590, B:69:0x05a4, B:71:0x05ae, B:73:0x05b2, B:74:0x05b7, B:75:0x05b5, B:76:0x05ba), top: B:66:0x0590 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(g4.a1 r20, g4.t0 r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.y2.e(g4.a1, g4.t0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final g4.x3 f(g4.a1 loadType, java.lang.Object obj) {
        g4.a1 a1Var = g4.a1.REFRESH;
        g4.h3 h3Var = this.f350172j;
        int i17 = loadType == a1Var ? h3Var.f349888d : h3Var.f349885a;
        boolean z17 = h3Var.f349887c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return new g4.w3(obj, i17, z17);
        }
        if (ordinal == 1) {
            if (obj != null) {
                return new g4.v3(obj, i17, z17);
            }
            throw new java.lang.IllegalArgumentException("key cannot be null for prepend".toString());
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        if (obj != null) {
            return new g4.u3(obj, i17, z17);
        }
        throw new java.lang.IllegalArgumentException("key cannot be null for append".toString());
    }

    public final java.lang.Object g(g4.c3 c3Var, g4.a1 loadType, int i17, int i18) {
        int i19;
        c3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            throw new java.lang.IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (ordinal == 1) {
            i19 = c3Var.f349767f;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i19 = c3Var.f349768g;
        }
        if (i17 != i19 || (c3Var.f349772k.b(loadType) instanceof g4.v0) || i18 >= this.f350172j.f349886b) {
            return null;
        }
        g4.a1 a1Var = g4.a1.PREPEND;
        java.util.List list = c3Var.f349763b;
        return loadType == a1Var ? ((g4.z3) kz5.n0.X(list)).f350187b : ((g4.z3) kz5.n0.i0(list)).f350188c;
    }

    public final java.lang.Object h(g4.a1 a1Var, g4.b5 b5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (a1Var.ordinal() != 0) {
            if (!(b5Var != null)) {
                throw new java.lang.IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
            }
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) this.f350163a).e(b5Var);
        } else {
            java.lang.Object d17 = d(interfaceC29045xdcb5ca57);
            if (d17 == pz5.a.f440719d) {
                return d17;
            }
        }
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(g4.c3 r6, g4.a1 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof g4.q2
            if (r0 == 0) goto L13
            r0 = r8
            g4.q2 r0 = (g4.q2) r0
            int r1 = r0.f350042e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f350042e = r1
            goto L18
        L13:
            g4.q2 r0 = new g4.q2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f350041d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f350042e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            g4.w0 r8 = g4.w0.f350128b
            boolean r6 = r6.f(r7, r8)
            if (r6 == 0) goto L4d
            u26.w r6 = r5.f350166d
            g4.k1 r2 = new g4.k1
            r4 = 0
            r2.<init>(r7, r4, r8)
            r0.f350042e = r3
            u26.o r6 = (u26.o) r6
            java.lang.Object r6 = r6.t(r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.y2.i(g4.c3, g4.a1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

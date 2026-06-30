package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public abstract class l {
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 a(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.k2(i2Var, null);
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 b(p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.l2(j2Var, null);
    }

    public static p3325xe03a0797.p3326xc267989b.p3328x30012e.j c(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, int i17, u26.u uVar, int i18, java.lang.Object obj) {
        int i19;
        u26.u uVar2;
        if ((i18 & 1) != 0) {
            i17 = -2;
        }
        int i27 = i18 & 2;
        u26.u uVar3 = u26.u.SUSPEND;
        if (i27 != 0) {
            uVar = uVar3;
        }
        boolean z17 = true;
        if (!(i17 >= 0 || i17 == -2 || i17 == -1)) {
            throw new java.lang.IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i17).toString());
        }
        if (i17 == -1 && uVar != uVar3) {
            z17 = false;
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i17 == -1) {
            uVar2 = u26.u.DROP_OLDEST;
            i19 = 0;
        } else {
            i19 = i17;
            uVar2 = uVar;
        }
        return jVar instanceof v26.h0 ? v26.g0.a((v26.h0) jVar, null, i19, uVar2, 1, null) : new v26.o(jVar, null, i19, uVar2, 2, null);
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j d(yz5.p pVar) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.d(pVar, oz5.m.f431862d, -2, u26.u.SUSPEND);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(p3325xe03a0797.p3326xc267989b.p3328x30012e.j r4, p3325xe03a0797.p3326xc267989b.p3328x30012e.k r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            boolean r0 = r6 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.m0
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m0 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.m0) r0
            int r1 = r0.f391857f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f391857f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m0 r0 = new kotlinx.coroutines.flow.m0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f391856e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f391857f
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f391855d
            kotlin.jvm.internal.h0 r4 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4e
        L2b:
            r5 = move-exception
            r1 = r5
            goto L53
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            kotlinx.coroutines.flow.o0 r2 = new kotlinx.coroutines.flow.o0     // Catch: java.lang.Throwable -> L50
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L50
            r0.f391855d = r6     // Catch: java.lang.Throwable -> L50
            r0.f391857f = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L50
            if (r4 != r1) goto L4e
            goto L8d
        L4e:
            r1 = 0
            goto L8d
        L50:
            r4 = move-exception
            r1 = r4
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f391656d
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r5 = 0
            if (r4 == 0) goto L62
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r1)
            if (r6 == 0) goto L62
            r6 = r3
            goto L63
        L62:
            r6 = r5
        L63:
            if (r6 != 0) goto L9a
            oz5.l r6 = r0.mo48699x76847179()
            kotlinx.coroutines.q2 r0 = p3325xe03a0797.p3326xc267989b.q2.f392104d
            oz5.i r6 = r6.get(r0)
            kotlinx.coroutines.r2 r6 = (p3325xe03a0797.p3326xc267989b.r2) r6
            if (r6 == 0) goto L89
            boolean r0 = r6.mo143975x62a56b47()
            if (r0 != 0) goto L7a
            goto L89
        L7a:
            java.util.concurrent.CancellationException r6 = r6.x()
            if (r6 == 0) goto L87
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r1)
            if (r6 == 0) goto L87
            goto L88
        L87:
            r3 = r5
        L88:
            r5 = r3
        L89:
            if (r5 != 0) goto L9a
            if (r4 != 0) goto L8e
        L8d:
            return r1
        L8e:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L96
            jz5.a.a(r4, r1)
            throw r4
        L96:
            jz5.a.a(r1, r4)
            throw r1
        L9a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.l.e(kotlinx.coroutines.flow.j, kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object f(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int i17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i1.f391828a;
        java.lang.Object a17 = c(new v26.t(new p3325xe03a0797.p3326xc267989b.p3328x30012e.h1(pVar, null), jVar, oz5.m.f431862d, -2, u26.u.SUSPEND), 0, null, 2, null).a(v26.j0.f514548d, interfaceC29045xdcb5ca57);
        pz5.a aVar = pz5.a.f440719d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (a17 != aVar) {
            a17 = f0Var;
        }
        return a17 == aVar ? a17 : f0Var;
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j g(u26.t0 t0Var) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.e(t0Var, true, null, 0, null, 28, null);
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j h(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, long j17) {
        if (j17 >= 0) {
            return j17 == 0 ? jVar : new v26.e0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.b0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.v(j17), jVar, null));
        }
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j i(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar) {
        if (jVar instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.f3) {
            return jVar;
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.d0 d0Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.d0.f391759d;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.c0 c0Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.c0.f391749d;
        if (jVar instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.i) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i iVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.i) jVar;
            if (iVar.f391824e == d0Var && iVar.f391825f == c0Var) {
                return jVar;
            }
        }
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.i(jVar, d0Var, c0Var);
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j j(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, int i17) {
        if (i17 >= 0) {
            return new p3325xe03a0797.p3326xc267989b.p3328x30012e.p0(jVar, i17);
        }
        throw new java.lang.IllegalArgumentException(("Drop count should be non-negative, but had " + i17).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(p3325xe03a0797.p3326xc267989b.p3328x30012e.j r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            boolean r0 = r6 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.m1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.m1 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.m1) r0
            int r1 = r0.f391861g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f391861g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m1 r0 = new kotlinx.coroutines.flow.m1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f391860f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f391861g
            kotlinx.coroutines.internal.l0 r3 = v26.k0.f514553a
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.f391859e
            kotlinx.coroutines.flow.j1 r5 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j1) r5
            java.lang.Object r0 = r0.f391858d
            kotlin.jvm.internal.h0 r0 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)     // Catch: v26.a -> L31
            goto L61
        L31:
            r6 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            r6.f391656d = r3
            kotlinx.coroutines.flow.j1 r2 = new kotlinx.coroutines.flow.j1
            r2.<init>(r6)
            r0.f391858d = r6     // Catch: v26.a -> L59
            r0.f391859e = r2     // Catch: v26.a -> L59
            r0.f391861g = r4     // Catch: v26.a -> L59
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: v26.a -> L59
            if (r5 != r1) goto L57
            goto L65
        L57:
            r0 = r6
            goto L61
        L59:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L5d:
            kotlinx.coroutines.flow.k r1 = r6.f514505d
            if (r1 != r5) goto L6e
        L61:
            java.lang.Object r1 = r0.f391656d
            if (r1 == r3) goto L66
        L65:
            return r1
        L66:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.l.k(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r6.a(r2, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(p3325xe03a0797.p3326xc267989b.p3328x30012e.j r6, yz5.p r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            boolean r0 = r8 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.n1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.n1 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.n1) r0
            int r1 = r0.f391872h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f391872h = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n1 r0 = new kotlinx.coroutines.flow.n1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f391871g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f391872h
            kotlinx.coroutines.internal.l0 r3 = v26.k0.f514553a
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.f391870f
            kotlinx.coroutines.flow.l1 r6 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.l1) r6
            java.lang.Object r7 = r0.f391869e
            kotlin.jvm.internal.h0 r7 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r7
            java.lang.Object r0 = r0.f391868d
            yz5.p r0 = (yz5.p) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)     // Catch: v26.a -> L35
            goto L6a
        L35:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L64
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
            r8.<init>()
            r8.f391656d = r3
            kotlinx.coroutines.flow.l1 r2 = new kotlinx.coroutines.flow.l1
            r2.<init>(r7, r8)
            r0.f391868d = r7     // Catch: v26.a -> L61
            r0.f391869e = r8     // Catch: v26.a -> L61
            r0.f391870f = r2     // Catch: v26.a -> L61
            r0.f391872h = r4     // Catch: v26.a -> L61
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: v26.a -> L61
            if (r6 != r1) goto L68
            goto L6e
        L61:
            r6 = move-exception
            r0 = r6
            r6 = r2
        L64:
            kotlinx.coroutines.flow.k r1 = r0.f514505d
            if (r1 != r6) goto L83
        L68:
            r0 = r7
            r7 = r8
        L6a:
            java.lang.Object r1 = r7.f391656d
            if (r1 == r3) goto L6f
        L6e:
            return r1
        L6f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.l.l(kotlinx.coroutines.flow.j, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static p3325xe03a0797.p3326xc267989b.p3328x30012e.j m(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, int i17, yz5.p pVar, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i1.f391828a;
        } else {
            int i19 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i1.f391828a;
        }
        int i27 = i17;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.d1 d1Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.d1(jVar, pVar);
        if (i27 > 0) {
            return i27 == 1 ? new p3325xe03a0797.p3326xc267989b.p3328x30012e.e1(d1Var) : new v26.l(d1Var, i27, oz5.m.f431862d, -2, u26.u.SUSPEND);
        }
        throw new java.lang.IllegalArgumentException(("Expected positive concurrency level, but had " + i27).toString());
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j n(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, oz5.l lVar) {
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        if (lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d) == null) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, oz5.m.f431862d) ? jVar : jVar instanceof v26.h0 ? v26.g0.a((v26.h0) jVar, lVar, 0, null, 6, null) : new v26.o(jVar, lVar, 0, null, 12, null);
        }
        throw new java.lang.IllegalArgumentException(("Flow context cannot contain job in it. Had " + lVar).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(p3325xe03a0797.p3326xc267989b.p3328x30012e.j r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            boolean r0 = r6 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.o1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o1 r0 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.o1) r0
            int r1 = r0.f391884f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f391884f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o1 r0 = new kotlinx.coroutines.flow.o1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f391883e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f391884f
            kotlinx.coroutines.internal.l0 r3 = v26.k0.f514553a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r5 = r0.f391882d
            kotlin.jvm.internal.h0 r5 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlin.jvm.internal.h0 r6 = new kotlin.jvm.internal.h0
            r6.<init>()
            r6.f391656d = r3
            kotlinx.coroutines.flow.p1 r2 = new kotlinx.coroutines.flow.p1
            r2.<init>(r6)
            r0.f391882d = r6
            r0.f391884f = r4
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4f
            goto L54
        L4f:
            r5 = r6
        L50:
            java.lang.Object r1 = r5.f391656d
            if (r1 == r3) goto L55
        L54:
            return r1
        L55:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.l.o(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final p3325xe03a0797.p3326xc267989b.r2 p(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        return p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new p3325xe03a0797.p3326xc267989b.p3328x30012e.u(jVar, null), 3, null);
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 q(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.w2 w2Var, java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.u2 u2Var;
        v26.g gVar;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j h17;
        u26.w.f505733j1.getClass();
        int i17 = u26.v.f505732b;
        if (1 >= i17) {
            i17 = 1;
        }
        int i18 = i17 - 1;
        boolean z17 = jVar instanceof v26.g;
        u26.u uVar = u26.u.SUSPEND;
        if (!z17 || (h17 = (gVar = (v26.g) jVar).h()) == null) {
            u2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.u2(jVar, i18, uVar, oz5.m.f431862d);
        } else {
            u26.u uVar2 = gVar.f514537f;
            int i19 = gVar.f514536e;
            if (i19 != -3 && i19 != -2 && i19 != 0) {
                i18 = i19;
            } else if (uVar2 != uVar || i19 == 0) {
                i18 = 0;
            }
            u2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.u2(h17, i18, uVar2, gVar.f514535d);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(obj);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar2 = u2Var.f391955a;
        int i27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.w2.f391976a;
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.l2(a17, p3325xe03a0797.p3326xc267989b.l.c(y0Var, u2Var.f391956b, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(w2Var, p3325xe03a0797.p3326xc267989b.p3328x30012e.v2.f391962a) ? p3325xe03a0797.p3326xc267989b.a1.DEFAULT : p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new p3325xe03a0797.p3326xc267989b.p3328x30012e.s1(w2Var, jVar2, a17, obj, null)));
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j r(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, int i17) {
        if (i17 > 0) {
            return new p3325xe03a0797.p3326xc267989b.p3328x30012e.x0(jVar, i17);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " should be positive").toString());
    }
}

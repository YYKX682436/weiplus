package f26;

/* loaded from: classes16.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f26.g f340695a = new f26.g();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(i26.o r3, i26.j r4) {
        /*
            boolean r0 = r3.h(r4)
            r1 = 1
            if (r0 != 0) goto L32
            boolean r0 = r4 instanceof i26.d
            r2 = 0
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            i26.d r4 = (i26.d) r4
            i26.c r4 = r3.l(r4)
            i26.l r4 = r3.K(r4)
            boolean r0 = r3.q0(r4)
            if (r0 != 0) goto L2d
            i26.i r4 = r3.f(r4)
            i26.j r4 = r3.l0(r4)
            boolean r3 = r3.h(r4)
            if (r3 == 0) goto L2d
            r3 = r1
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.g.a(i26.o, i26.j):boolean");
    }

    public static final boolean b(i26.o oVar, f26.b2 b2Var, i26.j jVar, i26.j jVar2, boolean z17) {
        java.util.Collection<i26.i> s17 = oVar.s(jVar);
        if ((s17 instanceof java.util.Collection) && s17.isEmpty()) {
            return false;
        }
        for (i26.i iVar : s17) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.S(iVar), oVar.o(jVar2)) || (z17 && i(f340695a, b2Var, jVar2, iVar, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x019e, code lost:
    
        if (r0 != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(f26.g r26, f26.b2 r27, i26.i r28, i26.i r29, boolean r30, int r31, java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.g.i(f26.g, f26.b2, i26.i, i26.i, boolean, int, java.lang.Object):boolean");
    }

    public final java.util.List c(f26.b2 b2Var, i26.j jVar, i26.m mVar) {
        f26.a2 c17;
        i26.o oVar = b2Var.f340664c;
        java.util.List a07 = oVar.a0(jVar, mVar);
        if (a07 != null) {
            return a07;
        }
        boolean j07 = oVar.j0(mVar);
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (!j07 && oVar.N(jVar)) {
            return p0Var;
        }
        if (oVar.G(mVar)) {
            if (!oVar.L(oVar.o(jVar), mVar)) {
                return p0Var;
            }
            i26.j z17 = oVar.z(jVar, i26.b.f369620d);
            if (z17 != null) {
                jVar = z17;
            }
            return kz5.b0.c(jVar);
        }
        o26.q qVar = new o26.q();
        b2Var.c();
        java.util.ArrayDeque arrayDeque = b2Var.f340668g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayDeque);
        java.util.Set set = b2Var.f340669h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
        arrayDeque.push(jVar);
        while (!arrayDeque.isEmpty()) {
            o26.u uVar = (o26.u) set;
            if (uVar.f424149e > 1000) {
                throw new java.lang.IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + kz5.n0.g0(set, null, null, null, 0, null, null, 63, null)).toString());
            }
            i26.j jVar2 = (i26.j) arrayDeque.pop();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jVar2);
            if (uVar.add(jVar2)) {
                i26.j z18 = oVar.z(jVar2, i26.b.f369620d);
                if (z18 == null) {
                    z18 = jVar2;
                }
                boolean L = oVar.L(oVar.o(z18), mVar);
                f26.y1 y1Var = f26.y1.f340772a;
                i26.o oVar2 = b2Var.f340664c;
                if (L) {
                    qVar.add(z18);
                    c17 = y1Var;
                } else {
                    c17 = oVar.v(z18) == 0 ? f26.x1.f340767a : oVar2.c(z18);
                }
                if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, y1Var))) {
                    c17 = null;
                }
                if (c17 != null) {
                    java.util.Iterator it = oVar2.V(oVar2.o(jVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(c17.a(b2Var, (i26.i) it.next()));
                    }
                }
            }
        }
        b2Var.a();
        return qVar;
    }

    public final java.util.List d(f26.b2 b2Var, i26.j jVar, i26.m mVar) {
        java.util.List c17 = c(b2Var, jVar, mVar);
        if (c17.size() < 2) {
            return c17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = c17.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            i26.o oVar = b2Var.f340664c;
            i26.k w17 = oVar.w((i26.j) next);
            int b07 = oVar.b0(w17);
            int i17 = 0;
            while (true) {
                if (i17 >= b07) {
                    break;
                }
                if (!(oVar.R(oVar.f(oVar.m(w17, i17))) == null)) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : c17;
    }

    public final boolean e(f26.b2 state, i26.i a17, i26.i b17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "b");
        if (a17 == b17) {
            return true;
        }
        f26.g gVar = f340695a;
        i26.o oVar = state.f340664c;
        if (gVar.g(oVar, a17) && gVar.g(oVar, b17)) {
            i26.i d17 = state.d(state.e(a17));
            i26.i d18 = state.d(state.e(b17));
            i26.j g07 = oVar.g0(d17);
            if (!oVar.L(oVar.S(d17), oVar.S(d18))) {
                return false;
            }
            if (oVar.v(g07) == 0) {
                return oVar.A(d17) || oVar.A(d18) || oVar.r0(g07) == oVar.r0(oVar.g0(d18));
            }
        }
        return i(gVar, state, a17, b17, false, 8, null) && i(gVar, state, b17, a17, false, 8, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return r8.Q(r8.S(r9), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i26.n f(i26.o r8, i26.i r9, i26.i r10) {
        /*
            r7 = this;
            int r0 = r8.v(r9)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L67
            i26.l r4 = r8.X(r9, r2)
            boolean r5 = r8.q0(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L64
            i26.i r3 = r8.f(r3)
            if (r3 != 0) goto L1f
            goto L64
        L1f:
            i26.j r4 = r8.g0(r3)
            i26.j r4 = r8.y(r4)
            boolean r4 = r8.e0(r4)
            if (r4 == 0) goto L3c
            i26.j r4 = r8.g0(r10)
            i26.j r4 = r8.y(r4)
            boolean r4 = r8.e0(r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r6 = r1
        L3d:
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r10)
            if (r4 != 0) goto L5b
            if (r6 == 0) goto L54
            i26.m r4 = r8.S(r3)
            i26.m r5 = r8.S(r10)
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r4 == 0) goto L54
            goto L5b
        L54:
            i26.n r3 = r7.f(r8, r3, r10)
            if (r3 == 0) goto L64
            return r3
        L5b:
            i26.m r9 = r8.S(r9)
            i26.n r8 = r8.Q(r9, r2)
            return r8
        L64:
            int r2 = r2 + 1
            goto L6
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.g.f(i26.o, i26.i, i26.i):i26.n");
    }

    public final boolean g(i26.o oVar, i26.i iVar) {
        return (!oVar.D(oVar.S(iVar)) || oVar.g(iVar) || oVar.U(iVar) || oVar.s0(iVar) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.o(oVar.g0(iVar)), oVar.o(oVar.l0(iVar)))) ? false : true;
    }

    public final boolean h(f26.b2 b2Var, i26.k capturedSubArguments, i26.j superType) {
        boolean i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b2Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(capturedSubArguments, "capturedSubArguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superType, "superType");
        i26.o oVar = b2Var.f340664c;
        i26.m o17 = oVar.o(superType);
        int b07 = oVar.b0(capturedSubArguments);
        int T = oVar.T(o17);
        if (b07 != T || b07 != oVar.v(superType)) {
            return false;
        }
        for (int i18 = 0; i18 < T; i18++) {
            i26.l X = oVar.X(superType, i18);
            if (!oVar.q0(X)) {
                i26.i f17 = oVar.f(X);
                i26.l m17 = oVar.m(capturedSubArguments, i18);
                oVar.n(m17);
                i26.r rVar = i26.r.f369624g;
                i26.i f18 = oVar.f(m17);
                i26.r declared = oVar.I(oVar.Q(o17, i18));
                i26.r useSite = oVar.n(X);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(declared, "declared");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(useSite, "useSite");
                if (declared == rVar) {
                    declared = useSite;
                } else if (useSite != rVar && declared != useSite) {
                    declared = null;
                }
                if (declared == null) {
                    return b2Var.f340662a;
                }
                f26.g gVar = f340695a;
                if (declared == rVar) {
                    gVar.j(oVar, f18, f17, o17);
                    gVar.j(oVar, f17, f18, o17);
                }
                int i19 = b2Var.f340667f;
                if (i19 > 100) {
                    throw new java.lang.IllegalStateException(("Arguments depth is too high. Some related argument: " + f18).toString());
                }
                b2Var.f340667f = i19 + 1;
                int ordinal = declared.ordinal();
                if (ordinal == 0) {
                    i17 = i(gVar, b2Var, f17, f18, false, 8, null);
                } else if (ordinal == 1) {
                    i17 = i(gVar, b2Var, f18, f17, false, 8, null);
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    i17 = gVar.e(b2Var, f18, f17);
                }
                b2Var.f340667f--;
                if (!i17) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean j(i26.o oVar, i26.i iVar, i26.i iVar2, i26.m mVar) {
        i26.j m07 = oVar.m0(iVar);
        if (m07 instanceof i26.d) {
            i26.d dVar = (i26.d) m07;
            if (oVar.H(dVar) || !oVar.q0(oVar.K(oVar.l(dVar))) || oVar.W(dVar) != i26.b.f369620d) {
                return false;
            }
            oVar.S(iVar2);
        }
        return false;
    }
}

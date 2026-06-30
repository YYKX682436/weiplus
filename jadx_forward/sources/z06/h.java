package z06;

/* loaded from: classes16.dex */
public class h extends r06.j1 implements z06.a {
    public static final o06.a M = new z06.e();
    public static final o06.a N = new z06.f();
    public z06.g K;
    public final boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o06.m mVar, o06.v1 v1Var, p06.k kVar, n16.g gVar, o06.c cVar, o06.x1 x1Var, boolean z17) {
        super(mVar, v1Var, kVar, gVar, cVar, x1Var);
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (gVar == null) {
            G(2);
            throw null;
        }
        if (cVar == null) {
            G(3);
            throw null;
        }
        if (x1Var == null) {
            G(4);
            throw null;
        }
        this.K = null;
        this.L = z17;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 13 || i17 == 18 || i17 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 13 || i17 == 18 || i17 == 21) ? 2 : 3];
        switch (i17) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = ya.b.f77502x92235c1b;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i17 == 13) {
            objArr[1] = "initialize";
        } else if (i17 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i17 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i17) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 13 && i17 != 18 && i17 != 21) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static z06.h I0(o06.m mVar, p06.k kVar, n16.g gVar, o06.x1 x1Var, boolean z17) {
        if (mVar == null) {
            G(5);
            throw null;
        }
        if (kVar == null) {
            G(6);
            throw null;
        }
        if (gVar == null) {
            G(7);
            throw null;
        }
        if (x1Var != null) {
            return new z06.h(mVar, null, kVar, gVar, o06.c.DECLARATION, x1Var, z17);
        }
        G(8);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (r5.e(r6) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[LOOP:0: B:7:0x0014->B:32:?, LOOP_END, SYNTHETIC] */
    @Override // r06.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r06.j1 H0(o06.r1 r2, o06.r1 r3, java.util.List r4, java.util.List r5, java.util.List r6, f26.o0 r7, o06.t0 r8, o06.g0 r9, java.util.Map r10) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto La1
            if (r5 == 0) goto L9b
            if (r6 == 0) goto L95
            if (r9 == 0) goto L8f
            super.H0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.List r2 = l26.g0.f396761a
            java.util.List r2 = l26.g0.f396761a
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r2.next()
            l26.q r3 = (l26.q) r3
            r3.getClass()
            r4 = 0
            n16.g r5 = r3.f396797a
            if (r5 == 0) goto L33
            n16.g r6 = r1.mo132800xfb82e301()
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r5)
            if (r5 != 0) goto L33
            goto L59
        L33:
            r26.t r5 = r3.f396798b
            if (r5 == 0) goto L4b
            n16.g r6 = r1.mo132800xfb82e301()
            java.lang.String r6 = r6.h()
            java.lang.String r7 = "asString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
            boolean r5 = r5.e(r6)
            if (r5 != 0) goto L4b
            goto L59
        L4b:
            java.util.Collection r5 = r3.f396799c
            if (r5 == 0) goto L5b
            n16.g r6 = r1.mo132800xfb82e301()
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L5b
        L59:
            r5 = r4
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L14
            l26.i[] r2 = r3.f396801e
            int r5 = r2.length
        L61:
            if (r4 >= r5) goto L74
            r6 = r2[r4]
            java.lang.String r6 = r6.a(r1)
            if (r6 == 0) goto L71
            l26.k r2 = new l26.k
            r2.<init>(r6)
            goto L8a
        L71:
            int r4 = r4 + 1
            goto L61
        L74:
            yz5.l r2 = r3.f396800d
            java.lang.Object r2 = r2.mo146xb9724478(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L85
            l26.k r3 = new l26.k
            r3.<init>(r2)
            r2 = r3
            goto L8a
        L85:
            l26.l r2 = l26.l.f396786b
            goto L8a
        L88:
            l26.j r2 = l26.j.f396783b
        L8a:
            boolean r2 = r2.f396788a
            r1.f449999s = r2
            return r1
        L8f:
            r2 = 12
            G(r2)
            throw r0
        L95:
            r2 = 11
            G(r2)
            throw r0
        L9b:
            r2 = 10
            G(r2)
            throw r0
        La1:
            r2 = 9
            G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z06.h.H0(o06.r1, o06.r1, java.util.List, java.util.List, java.util.List, f26.o0, o06.t0, o06.g0, java.util.Map):r06.j1");
    }

    public void J0(boolean z17, boolean z18) {
        this.K = z17 ? z18 ? z06.g.STABLE_SYNTHESIZED : z06.g.STABLE_DECLARED : z18 ? z06.g.NON_STABLE_SYNTHESIZED : z06.g.NON_STABLE_DECLARED;
    }

    @Override // z06.a
    public z06.a L(f26.o0 o0Var, java.util.List list, f26.o0 o0Var2, jz5.l lVar) {
        if (list == null) {
            G(19);
            throw null;
        }
        if (o0Var2 == null) {
            G(20);
            throw null;
        }
        java.util.List a17 = z06.k.a(list, W(), this);
        o06.r1 h17 = o0Var == null ? null : r16.h.h(this, o0Var, p06.i.f432298a);
        r06.i0 i0Var = (r06.i0) O();
        i0Var.f449969g = a17;
        i0Var.m(o0Var2);
        i0Var.f449971i = h17;
        i0Var.f449978p = true;
        i0Var.f449977o = true;
        z06.h hVar = (z06.h) i0Var.mo132797x59bc66e();
        if (lVar != null) {
            hVar.z0((o06.a) lVar.f384366d, lVar.f384367e);
        }
        if (hVar != null) {
            return hVar;
        }
        G(21);
        throw null;
    }

    @Override // r06.j0, o06.b
    public boolean i0() {
        return this.K.f550791e;
    }

    @Override // r06.j1, r06.j0
    public r06.j0 u0(o06.m mVar, o06.n0 n0Var, o06.c cVar, n16.g gVar, p06.k kVar, o06.x1 x1Var) {
        if (mVar == null) {
            G(14);
            throw null;
        }
        if (cVar == null) {
            G(15);
            throw null;
        }
        if (kVar == null) {
            G(16);
            throw null;
        }
        if (x1Var == null) {
            G(17);
            throw null;
        }
        o06.v1 v1Var = (o06.v1) n0Var;
        if (gVar == null) {
            gVar = mo132800xfb82e301();
        }
        z06.h hVar = new z06.h(mVar, v1Var, kVar, gVar, cVar, x1Var, this.L);
        z06.g gVar2 = this.K;
        hVar.J0(gVar2.f550790d, gVar2.f550791e);
        return hVar;
    }
}

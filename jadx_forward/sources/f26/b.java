package f26;

/* loaded from: classes16.dex */
public abstract class b extends f26.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e26.c0 c0Var) {
        super(c0Var);
        if (c0Var != null) {
        } else {
            k(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void k(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.b.k(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.z0) ((o06.d1) r0)).f450099h, ((r06.z0) ((o06.d1) r6)).f450099h) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r6 = true;
     */
    @Override // f26.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(o06.j r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L7c
            boolean r0 = r6 instanceof o06.g
            r1 = 0
            if (r0 == 0) goto L7b
            o06.g r0 = r5.i()
            java.lang.String r2 = "first"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r2)
            java.lang.String r2 = "second"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r2)
            n16.g r2 = r0.mo132800xfb82e301()
            n16.g r3 = r6.mo132800xfb82e301()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            r3 = 1
            if (r2 != 0) goto L25
            goto L59
        L25:
            o06.m r0 = r0.e()
            o06.m r6 = r6.e()
        L2d:
            if (r0 == 0) goto L57
            if (r6 == 0) goto L57
            boolean r2 = r0 instanceof o06.v0
            if (r2 == 0) goto L38
            boolean r6 = r6 instanceof o06.v0
            goto L78
        L38:
            boolean r2 = r6 instanceof o06.v0
            if (r2 == 0) goto L3d
            goto L59
        L3d:
            boolean r2 = r0 instanceof o06.d1
            if (r2 == 0) goto L5b
            boolean r2 = r6 instanceof o06.d1
            if (r2 == 0) goto L59
            o06.d1 r0 = (o06.d1) r0
            r06.z0 r0 = (r06.z0) r0
            o06.d1 r6 = (o06.d1) r6
            r06.z0 r6 = (r06.z0) r6
            n16.c r0 = r0.f450099h
            n16.c r6 = r6.f450099h
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r6)
            if (r6 == 0) goto L59
        L57:
            r6 = r3
            goto L78
        L59:
            r6 = r1
            goto L78
        L5b:
            boolean r2 = r6 instanceof o06.d1
            if (r2 == 0) goto L60
            goto L59
        L60:
            n16.g r2 = r0.mo132800xfb82e301()
            n16.g r4 = r6.mo132800xfb82e301()
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r2 != 0) goto L6f
            goto L59
        L6f:
            o06.m r0 = r0.e()
            o06.m r6 = r6.e()
            goto L2d
        L78:
            if (r6 == 0) goto L7b
            r1 = r3
        L7b:
            return r1
        L7c:
            r6 = 2
            k(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.b.b(o06.j):boolean");
    }

    @Override // f26.l
    public f26.o0 d() {
        if (l06.o.I(i())) {
            return null;
        }
        return h().f();
    }

    @Override // f26.c2
    public l06.o h() {
        l06.o e17 = v16.f.e(i());
        if (e17 != null) {
            return e17;
        }
        k(1);
        throw null;
    }

    @Override // f26.c2
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract o06.g i();
}

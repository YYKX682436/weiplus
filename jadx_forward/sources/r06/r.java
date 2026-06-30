package r06;

/* loaded from: classes16.dex */
public class r extends r06.j0 implements o06.f {
    public final boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o06.g gVar, o06.l lVar, p06.k kVar, boolean z17, o06.c cVar, o06.x1 x1Var) {
        super(gVar, lVar, kVar, n16.i.f415710e, cVar, x1Var);
        if (gVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (cVar == null) {
            G(2);
            throw null;
        }
        if (x1Var == null) {
            G(3);
            throw null;
        }
        this.K = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void G(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r06.r.G(int):void");
    }

    @Override // o06.l
    public o06.g D() {
        o06.g e17 = e();
        if (e17 != null) {
            return e17;
        }
        G(18);
        throw null;
    }

    @Override // r06.j0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public r06.r u0(o06.m mVar, o06.n0 n0Var, o06.c cVar, n16.g gVar, p06.k kVar, o06.x1 x1Var) {
        if (mVar == null) {
            G(23);
            throw null;
        }
        if (cVar == null) {
            G(24);
            throw null;
        }
        if (kVar == null) {
            G(25);
            throw null;
        }
        if (x1Var == null) {
            G(26);
            throw null;
        }
        o06.c cVar2 = o06.c.DECLARATION;
        if (cVar == cVar2 || cVar == o06.c.SYNTHESIZED) {
            return new r06.r((o06.g) mVar, this, kVar, this.K, cVar2, x1Var);
        }
        throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + cVar);
    }

    @Override // r06.w, o06.m
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public o06.g e() {
        o06.g gVar = (o06.g) super.e();
        if (gVar != null) {
            return gVar;
        }
        G(17);
        throw null;
    }

    @Override // r06.w
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public o06.f a() {
        o06.f fVar = (o06.f) super.a();
        if (fVar != null) {
            return fVar;
        }
        G(19);
        throw null;
    }

    public r06.r G0(java.util.List list, o06.g0 g0Var) {
        if (list == null) {
            G(13);
            throw null;
        }
        if (g0Var != null) {
            H0(list, g0Var, e().m());
            return this;
        }
        G(14);
        throw null;
    }

    @Override // o06.d
    public o06.d H(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, boolean z17) {
        o06.f fVar = (o06.f) s0(mVar, t0Var, g0Var, cVar, z17);
        if (fVar != null) {
            return fVar;
        }
        G(27);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r06.r H0(java.util.List r11, o06.g0 r12, java.util.List r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L62
            if (r12 == 0) goto L5c
            if (r13 == 0) goto L56
            r2 = 0
            o06.g r1 = r10.e()
            boolean r3 = r1.p()
            if (r3 == 0) goto L22
            o06.m r1 = r1.e()
            boolean r3 = r1 instanceof o06.g
            if (r3 == 0) goto L22
            o06.g r1 = (o06.g) r1
            o06.r1 r1 = r1.R()
            r3 = r1
            goto L23
        L22:
            r3 = r0
        L23:
            o06.g r1 = r10.e()
            java.util.List r4 = r1.f0()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L3e
            java.util.List r1 = r1.f0()
            if (r1 == 0) goto L38
            goto L44
        L38:
            r11 = 15
            G(r11)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.emptyList()
            if (r1 == 0) goto L50
        L44:
            r4 = r1
            r7 = 0
            o06.t0 r8 = o06.t0.f423518e
            r1 = r10
            r5 = r13
            r6 = r11
            r9 = r12
            r1.x0(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L50:
            r11 = 16
            G(r11)
            throw r0
        L56:
            r11 = 12
            G(r11)
            throw r0
        L5c:
            r11 = 11
            G(r11)
            throw r0
        L62:
            r11 = 10
            G(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r06.r.H0(java.util.List, o06.g0, java.util.List):r06.r");
    }

    @Override // r06.j0, o06.a2
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public o06.f d(f26.v2 v2Var) {
        if (v2Var != null) {
            return (o06.f) super.d(v2Var);
        }
        G(20);
        throw null;
    }

    @Override // r06.j0, o06.d
    public void M(java.util.Collection collection) {
        if (collection != null) {
            return;
        }
        G(22);
        throw null;
    }

    @Override // r06.j0, o06.d, o06.b
    public java.util.Collection i() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        G(21);
        throw null;
    }

    @Override // o06.l
    /* renamed from: isPrimary */
    public boolean mo150370xcaae5578() {
        return this.K;
    }

    @Override // r06.j0, o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.k(this, obj);
    }
}

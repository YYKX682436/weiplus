package a0;

/* loaded from: classes14.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0.o f210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(c0.o oVar, boolean z17) {
        super(3);
        this.f210d = oVar;
        this.f211e = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c0.o r4, n0.v2 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof a0.j1
            if (r0 == 0) goto L13
            r0 = r6
            a0.j1 r0 = (a0.j1) r0
            int r1 = r0.f186g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186g = r1
            goto L18
        L13:
            a0.j1 r0 = new a0.j1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f185f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f186g
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f184e
            c0.i r4 = (c0.i) r4
            java.lang.Object r5 = r0.f183d
            n0.v2 r5 = (n0.v2) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L57
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.getValue()
            c0.i r6 = (c0.i) r6
            if (r6 != 0) goto L5a
            c0.i r6 = new c0.i
            r6.<init>()
            r0.f183d = r5
            r0.f184e = r6
            r0.f186g = r3
            c0.p r4 = (c0.p) r4
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L56
            goto L5c
        L56:
            r4 = r6
        L57:
            r5.setValue(r4)
        L5a:
            jz5.f0 r1 = jz5.f0.f302826a
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l1.a(c0.o, n0.v2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(n0.v2 r4, c0.o r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof a0.k1
            if (r0 == 0) goto L13
            r0 = r6
            a0.k1 r0 = (a0.k1) r0
            int r1 = r0.f198f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f198f = r1
            goto L18
        L13:
            a0.k1 r0 = new a0.k1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f197e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f198f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f196d
            n0.v2 r4 = (n0.v2) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r4.getValue()
            c0.i r6 = (c0.i) r6
            if (r6 == 0) goto L54
            c0.j r2 = new c0.j
            r2.<init>(r6)
            r0.f196d = r4
            r0.f198f = r3
            c0.p r5 = (c0.p) r5
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L50
            goto L56
        L50:
            r5 = 0
            r4.setValue(r5)
        L54:
            jz5.f0 r1 = jz5.f0.f302826a
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.l1.d(n0.v2, c0.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        z0.t composed = (z0.t) obj;
        ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(composed, "$this$composed");
        n0.y0 y0Var = (n0.y0) ((n0.o) obj2);
        y0Var.U(1294013553);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i17 = n0.o.f333629a;
        if (y17 == n0.n.f333620a) {
            y17 = n0.s4.c(null, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        c0.o oVar = this.f210d;
        n0.d2.c(oVar, new a0.f1(v2Var, oVar), y0Var, 0);
        boolean z17 = this.f211e;
        n0.d2.f(java.lang.Boolean.valueOf(z17), new a0.g1(z17, v2Var, oVar, null), y0Var, 0);
        z0.t tVar = z0.p.f468921d;
        if (z17) {
            int i18 = z0.t.f468922q1;
            tVar = p1.x0.b(tVar, oVar, new a0.i1(oVar, v2Var, null));
        } else {
            int i19 = z0.t.f468922q1;
        }
        y0Var.o(false);
        return tVar;
    }
}

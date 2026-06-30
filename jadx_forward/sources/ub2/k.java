package ub2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f507607c;

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f507605a = jz5.h.b(ub2.c.f507574d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f507606b = jz5.h.b(new ub2.d(this));

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f507608d = u26.z.a(0, null, null, 7, null);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ub2.k r4, int r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof ub2.g
            if (r0 == 0) goto L16
            r0 = r6
            ub2.g r0 = (ub2.g) r0
            int r1 = r0.f507584g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f507584g = r1
            goto L1b
        L16:
            ub2.g r0 = new ub2.g
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f507582e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f507584g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f507581d
            ub2.k r4 = (ub2.k) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L61
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "send watermarkFlag: "
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "FinderPostWatermarkDetHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            u26.w r6 = r4.f507608d
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r0.f507581d = r4
            r0.f507584g = r3
            u26.o r6 = (u26.o) r6
            java.lang.Object r5 = r6.t(r2, r0)
            if (r5 != r1) goto L61
            goto L69
        L61:
            u26.w r4 = r4.f507608d
            r5 = 0
            u26.x0.a(r4, r5, r3, r5)
            jz5.f0 r1 = jz5.f0.f384359a
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ub2.k.a(ub2.k, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final p3325xe03a0797.p3326xc267989b.r2 b(yz5.p pVar) {
        return p3325xe03a0797.p3326xc267989b.l.d((p3325xe03a0797.p3326xc267989b.y0) ((jz5.n) this.f507606b).mo141623x754a37bb(), (ub2.b) ((jz5.n) this.f507605a).mo141623x754a37bb(), null, pVar, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ub2.e
            if (r0 == 0) goto L13
            r0 = r5
            ub2.e r0 = (ub2.e) r0
            int r1 = r0.f507578f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f507578f = r1
            goto L18
        L13:
            ub2.e r0 = new ub2.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f507576d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f507578f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            u26.w r5 = r4.f507608d
            boolean r2 = r5.m()
            if (r2 != 0) goto L4c
            r0.f507578f = r3
            u26.k r5 = (u26.k) r5
            java.lang.Object r5 = r5.r(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "receive watermarkFlag: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderPostWatermarkDetHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ub2.k.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

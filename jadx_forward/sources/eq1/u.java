package eq1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f337399a;

    /* renamed from: b, reason: collision with root package name */
    public volatile p3321xbce91901.C29043x91b2b43d f337400b;

    /* renamed from: c, reason: collision with root package name */
    public volatile yz5.l f337401c;

    /* renamed from: e, reason: collision with root package name */
    public long f337403e;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f337402d = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: f, reason: collision with root package name */
    public final eq1.m f337404f = new eq1.m(this);

    public final void a() {
        try {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f337399a;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.z0.e(this.f337402d, null, 1, null);
            this.f337401c = null;
            this.f337400b = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizGetPOIHelper", "release failed: " + e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof eq1.n
            if (r0 == 0) goto L13
            r0 = r13
            eq1.n r0 = (eq1.n) r0
            int r1 = r0.f337369g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f337369g = r1
            goto L18
        L13:
            eq1.n r0 = new eq1.n
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f337367e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f337369g
            java.lang.String r3 = "FlutterBizGetPOIHelper"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r12 = r0.f337366d
            eq1.u r12 = (eq1.u) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)     // Catch: java.lang.Exception -> L2d
            goto L68
        L2d:
            r12 = move-exception
            goto L83
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.String r13 = "requestPOI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r13)
            kotlinx.coroutines.r2 r13 = r11.f337399a
            r2 = 0
            if (r13 == 0) goto L47
            p3325xe03a0797.p3326xc267989b.p2.a(r13, r2, r4, r2)
        L47:
            kotlinx.coroutines.y0 r5 = r11.f337402d
            r6 = 0
            r7 = 0
            eq1.r r8 = new eq1.r
            r8.<init>(r11, r12, r2)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r12 = p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
            r11.f337399a = r12
            kotlinx.coroutines.r2 r12 = r11.f337399a     // Catch: java.lang.Exception -> L2d
            if (r12 == 0) goto L67
            r0.f337366d = r11     // Catch: java.lang.Exception -> L2d
            r0.f337369g = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Object r12 = r12.C(r0)     // Catch: java.lang.Exception -> L2d
            if (r12 != r1) goto L67
            return r1
        L67:
            r12 = r11
        L68:
            kotlin.Result r12 = r12.f337400b
            if (r12 == 0) goto L71
            java.lang.Object r12 = r12.getValue()
            goto L82
        L71:
            kotlin.Result$Companion r12 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "No Location"
            r12.<init>(r13)
            java.lang.Object r12 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r12)
            java.lang.Object r12 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r12)
        L82:
            return r12
        L83:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "requestLocationJob join failed: "
            r13.<init>(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r12)
            kotlin.Result$Companion r12 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Location request failed"
            r12.<init>(r13)
            java.lang.Object r12 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r12)
            java.lang.Object r12 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.u.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eq1.s
            if (r0 == 0) goto L13
            r0 = r5
            eq1.s r0 = (eq1.s) r0
            int r1 = r0.f337394g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f337394g = r1
            goto L18
        L13:
            eq1.s r0 = new eq1.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f337392e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f337394g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f337391d
            eq1.u r0 = (eq1.u) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            kotlin.Result r5 = (p3321xbce91901.C29043x91b2b43d) r5
            java.lang.Object r5 = r5.getValue()
            goto L68
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            kotlin.Result r5 = r4.f337400b
            if (r5 == 0) goto L5c
            kotlin.Result r5 = r4.f337400b
            r2 = 0
            if (r5 == 0) goto L50
            java.lang.Object r5 = r5.getValue()
            boolean r5 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r5)
            if (r5 != r3) goto L50
            r2 = r3
        L50:
            if (r2 == 0) goto L5c
            kotlin.Result r5 = r4.f337400b
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            java.lang.Object r5 = r5.getValue()
            return r5
        L5c:
            r0.f337391d = r4
            r0.f337394g = r3
            java.lang.Object r5 = r4.b(r3, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            r0 = r4
        L68:
            kotlin.Result r1 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r5)
            r0.f337400b = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.u.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof eq1.t
            if (r0 == 0) goto L13
            r0 = r11
            eq1.t r0 = (eq1.t) r0
            int r1 = r0.f337398g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f337398g = r1
            goto L18
        L13:
            eq1.t r0 = new eq1.t
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f337396e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f337398g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f337395d
            eq1.u r0 = (eq1.u) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlin.Result r11 = (p3321xbce91901.C29043x91b2b43d) r11
            java.lang.Object r11 = r11.getValue()
            goto L6d
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            long r4 = java.lang.System.currentTimeMillis()
            kotlin.Result r11 = r10.f337400b
            long r6 = r10.f337403e
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L60
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L60
            if (r11 == 0) goto L60
            java.lang.String r0 = "FlutterBizGetPOIHelper"
            java.lang.String r1 = "requestPOIWithFrequencyLimited, time not reach"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.Object r11 = r11.getValue()
            return r11
        L60:
            r0.f337395d = r10
            r0.f337398g = r3
            r11 = 0
            java.lang.Object r11 = r10.b(r11, r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            r0 = r10
        L6d:
            long r1 = java.lang.System.currentTimeMillis()
            r0.f337403e = r1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.u.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

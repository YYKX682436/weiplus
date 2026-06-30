package mi1;

/* loaded from: classes7.dex */
public final class b3 implements mi1.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f408052a;

    /* renamed from: b, reason: collision with root package name */
    public final mi1.h2 f408053b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f408054c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f408055d;

    /* renamed from: e, reason: collision with root package name */
    public volatile mi1.i2 f408056e;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f408052a = runtime;
        this.f408053b = new mi1.h2(-1, null, 2, null);
        this.f408054c = kz5.c0.k(2);
        this.f408055d = jz5.h.b(mi1.z2.f408281d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // mi1.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mi1.y2
            if (r0 == 0) goto L13
            r0 = r5
            mi1.y2 r0 = (mi1.y2) r0
            int r1 = r0.f408270f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f408270f = r1
            goto L18
        L13:
            mi1.y2 r0 = new mi1.y2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f408268d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f408270f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            mi1.h2 r5 = r4.f408053b
            r2 = -1
            r5.f408100a = r2
            mi1.i2 r2 = r4.e()
            r0.f408270f = r3
            java.lang.Object r5 = r2.a(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.String r5 = "TranslateAnimatorConsume"
            java.lang.String r0 = "translate dismiss"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.b3.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // mi1.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(mi1.j0 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mi1.a3
            if (r0 == 0) goto L13
            r0 = r7
            mi1.a3 r0 = (mi1.a3) r0
            int r1 = r0.f408047g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f408047g = r1
            goto L18
        L13:
            mi1.a3 r0 = new mi1.a3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f408045e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f408047g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f408044d
            mi1.j0 r6 = (mi1.j0) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L52
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            if (r6 != 0) goto L3b
            return r3
        L3b:
            int r7 = r6.f408119b
            mi1.h2 r2 = r5.f408053b
            r2.f408100a = r7
            r2.f408101b = r6
            mi1.i2 r7 = r5.e()
            r0.f408044d = r6
            r0.f408047g = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "adjustState: transTo "
            r7.<init>(r0)
            int r6 = r6.f408119b
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TranslateAnimatorConsume"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.b3.b(mi1.j0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mi1.g2
    public java.util.List c() {
        return this.f408054c;
    }

    @Override // mi1.g2
    public boolean d(mi1.j0 j0Var) {
        int i17;
        int i18;
        if (j0Var == null || (i18 = j0Var.f408119b) == (i17 = e().getF172578m().f408100a)) {
            return true;
        }
        if (i18 == -1 && i17 == 3) {
            return true;
        }
        return i18 == 3 && i17 == -1;
    }

    public final mi1.i2 e() {
        mi1.i2 i2Var = this.f408056e;
        if (i2Var != null) {
            return i2Var;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TranslateAnimatorConsume", "stateOwner is empty and invoke not main thread");
            return (mi1.i2) ((jz5.n) this.f408055d).mo141623x754a37bb();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 e17 = this.f408052a.f156354z.e();
        this.f408056e = e17;
        return e17;
    }

    @Override // mi1.g2
    /* renamed from: isShow */
    public boolean mo147328xb9a8b747() {
        return (e().getF172578m().f408100a == -1 || e().getF172578m().f408100a == 3) ? false : true;
    }
}

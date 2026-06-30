package yx0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549000d;

    /* renamed from: e, reason: collision with root package name */
    public int f549001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f549003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yx0.b8 b8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549002f = b8Var;
        this.f549003g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.n0(this.f549002f, this.f549003g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f549001e
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = "MicroMsg.ShootComposingCorePlugin"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            java.lang.Object r0 = r7.f549000d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L91
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L71
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            yx0.b8 r8 = r7.f549002f
            yx0.v r8 = r8.f548725s
            yx0.v r1 = yx0.v.f549233n
            if (r8 != r1) goto L3b
            yx0.m0 r8 = new yx0.m0
            yx0.b8 r1 = r7.f549002f
            r8.<init>(r1, r6)
            p3325xe03a0797.p3326xc267989b.l.f(r6, r8, r5, r6)
        L3b:
            yx0.b8 r8 = r7.f549002f
            yx0.v r8 = r8.f548725s
            yx0.v r1 = yx0.v.f549228f
            if (r8 == r1) goto L62
            yx0.b8 r8 = r7.f549002f
            yx0.v r8 = r8.f548725s
            yx0.v r1 = yx0.v.f549232m
            if (r8 != r1) goto L4c
            goto L62
        L4c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "clearMusic >> but state is "
            r8.<init>(r0)
            yx0.b8 r0 = r7.f549002f
            yx0.v r0 = r0.f548725s
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r8)
            return r2
        L62:
            yx0.b8 r8 = r7.f549002f
            pp0.p0 r8 = r8.K
            if (r8 == 0) goto L74
            r7.f549001e = r5
            java.lang.Object r8 = r8.O(r7)
            if (r8 != r0) goto L71
            return r0
        L71:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L75
        L74:
            r8 = r6
        L75:
            yx0.b8 r1 = r7.f549002f
            r1.T = r6
            yx0.b8 r1 = r7.f549002f
            yx0.t r5 = yx0.t.f549179a
            r1.U = r5
            boolean r1 = r7.f549003g
            if (r1 == 0) goto L92
            yx0.b8 r1 = r7.f549002f
            r7.f549000d = r8
            r7.f549001e = r4
            java.lang.Object r1 = yx0.b8.o(r1, r7)
            if (r1 != r0) goto L90
            return r0
        L90:
            r0 = r8
        L91:
            r8 = r0
        L92:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "clearMusic >> "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.n0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

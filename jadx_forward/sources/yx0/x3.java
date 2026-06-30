package yx0;

/* loaded from: classes5.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f549289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yx0.b8 b8Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549288d = b8Var;
        this.f549289e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.x3(this.f549288d, this.f549289e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.x3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            yx0.b8 r7 = r6.f549288d
            yx0.v r7 = r7.f548725s
            int r7 = r7.ordinal()
            java.lang.String r0 = "notifySwitchCamera >> but state is "
            java.lang.String r1 = "MicroMsg.ShootComposingCorePlugin"
            r2 = 1
            r3 = 0
            if (r7 == r2) goto L2f
            r4 = 2
            if (r7 == r4) goto L2f
            switch(r7) {
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L2f;
                default: goto L1b;
            }
        L1b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            yx0.b8 r4 = r6.f549288d
            yx0.v r4 = r4.f548725s
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r7)
            goto L3c
        L2f:
            yx0.v3 r7 = new yx0.v3
            yx0.b8 r4 = r6.f549288d
            r7.<init>(r4, r3)
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.f(r3, r7, r2, r3)
            jz5.f0 r7 = (jz5.f0) r7
        L3c:
            yx0.b8 r7 = r6.f549288d
            yx0.v r7 = r7.f548725s
            yx0.v r4 = yx0.v.f549228f
            jz5.f0 r5 = jz5.f0.f384359a
            if (r7 != r4) goto L53
            yx0.w3 r7 = new yx0.w3
            yx0.b8 r0 = r6.f549288d
            boolean r1 = r6.f549289e
            r7.<init>(r0, r1, r3)
            p3325xe03a0797.p3326xc267989b.l.f(r3, r7, r2, r3)
            return r5
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            yx0.b8 r0 = r6.f549288d
            yx0.v r0 = r0.f548725s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.x3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

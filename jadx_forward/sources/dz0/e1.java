package dz0;

/* loaded from: classes5.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326363e = c11015x5b190a3b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.e1(this.f326363e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
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
            int r1 = r6.f326362d
            r2 = 3
            r3 = 2
            r4 = 1
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r5 = r6.f326363e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L4b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L3e
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L35
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            dz0.k r7 = r5.f151318f
            if (r7 == 0) goto L35
            r6.f326362d = r4
            java.lang.Object r7 = r7.H6(r6)
            if (r7 != r0) goto L35
            return r0
        L35:
            r6.f326362d = r3
            java.lang.Object r7 = com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b.Q6(r5, r6)
            if (r7 != r0) goto L3e
            return r0
        L3e:
            dz0.k r7 = r5.f151318f
            if (r7 == 0) goto L4b
            r6.f326362d = r2
            java.lang.Object r7 = r7.R1(r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

package dz0;

/* loaded from: classes5.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326533e = c11015x5b190a3b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.r2(this.f326533e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f326532d
            r2 = 0
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r3 = r5.f326533e
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L28
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            az0.n7 r6 = r3.f151316d
            if (r6 == 0) goto L31
            r5.f326532d = r4
            java.lang.Object r6 = r6.r(r4, r4, r5)
            if (r6 != r0) goto L28
            return r0
        L28:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r4) goto L31
            r2 = r4
        L31:
            if (r2 == 0) goto L36
            r3.t7()
        L36:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.r2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

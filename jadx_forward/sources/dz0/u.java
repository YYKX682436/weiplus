package dz0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f326551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f326552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326550e = c11015x5b190a3b;
        this.f326551f = c4128x879fba0a;
        this.f326552g = c4129xdee64553;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.u(this.f326550e, this.f326551f, this.f326552g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
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
            int r1 = r5.f326549d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r2 = r5.f326550e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L46
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L2e
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            az0.n7 r6 = r2.f151316d
            if (r6 == 0) goto L30
            r5.f326549d = r4
            java.lang.Object r6 = r6.q(r5)
            if (r6 != r0) goto L2e
            return r0
        L2e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L30:
            az0.n7 r6 = r2.f151316d
            if (r6 == 0) goto L48
            java.lang.String r1 = "$startPlayTime"
            com.tencent.maas.model.time.MJTime r2 = r5.f326551f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r1)
            r5.f326549d = r3
            com.tencent.maas.model.time.MJTimeRange r1 = r5.f326552g
            java.lang.Object r6 = r6.o(r2, r1, r5)
            if (r6 != r0) goto L46
            return r0
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L48:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

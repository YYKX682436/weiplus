package rv0;

/* loaded from: classes5.dex */
public final class m6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481652d;

    /* renamed from: e, reason: collision with root package name */
    public int f481653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f481655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(rv0.z6 z6Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481654f = z6Var;
        this.f481655g = c4128x879fba0a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.m6(this.f481654f, this.f481655g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.m6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f481653e
            r2 = 0
            r3 = 2
            r4 = 1
            rv0.z6 r5 = r13.f481654f
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L85
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1c:
            java.lang.Object r1 = r13.f481652d
            com.tencent.maas.model.time.MJTime r1 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
        L23:
            r8 = r1
            goto L6e
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            ex0.a0 r14 = r5.v7()
            if (r14 == 0) goto L40
            ex0.r r14 = r14.n()
            if (r14 == 0) goto L40
            com.tencent.maas.model.time.MJTime r14 = r14.k()
            com.tencent.maas.model.time.MJTime r1 = r13.f481655g
            com.tencent.maas.model.time.MJTime r14 = r14.add(r1)
            if (r14 != 0) goto L42
        L40:
            com.tencent.maas.model.time.MJTime r14 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
        L42:
            r1 = r14
            jz5.g r14 = r5.f481891n
            r6 = r14
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.mo141623x754a37bb()
            rv0.n1 r6 = (rv0.n1) r6
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r6.z7(r1)
            jz5.n r14 = (jz5.n) r14
            java.lang.Object r14 = r14.mo141623x754a37bb()
            rv0.n1 r14 = (rv0.n1) r14
            r14.x7()
            gx0.bf r14 = r5.t7()
            r13.f481652d = r1
            r13.f481653e = r4
            java.lang.Object r14 = r14.e7(r13)
            if (r14 != r0) goto L23
            return r0
        L6e:
            gx0.bf r6 = r5.t7()
            r7 = 0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            r9 = 0
            r11 = 5
            r12 = 0
            r13.f481652d = r2
            r13.f481653e = r3
            r10 = r13
            java.lang.Object r14 = gx0.bf.d7(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L85
            return r0
        L85:
            ex0.a0 r14 = r5.v7()
            if (r14 == 0) goto L99
            cx0.d r0 = cx0.d.f306043f
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            java.lang.String r1 = "of(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r14.J(r0, r2)
        L99:
            gx0.bf r14 = r5.t7()
            r14.getClass()
            com.tencent.maas.model.time.MJTimeRange r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16109x79d591a3
            java.lang.String r1 = "PositiveInfiniteTimeRange"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r14.o7(r0, r4)
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.m6.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

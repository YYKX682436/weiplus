package ix0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f376826d;

    /* renamed from: e, reason: collision with root package name */
    public int f376827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw0.c f376828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ix0.g f376829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f376830h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dw0.c cVar, ix0.g gVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f376828f = cVar;
        this.f376829g = gVar;
        this.f376830h = c4190xd8dd3713;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ix0.e(this.f376828f, this.f376829g, this.f376830h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r9 = pz5.a.f440719d
            int r0 = r12.f376827e
            r7 = 3
            r1 = 2
            com.tencent.maas.moviecomposing.segments.Segment r2 = r12.f376830h
            r3 = 1
            ix0.g r10 = r12.f376829g
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L29
            if (r0 == r1) goto L20
            if (r0 != r7) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L87
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.Object r0 = r12.f376826d
            com.tencent.maas.model.time.MJTime r0 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r2 = r0
            goto L6f
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L43
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            dw0.c r0 = r12.f376828f
            boolean r0 = r0.b()
            if (r0 == 0) goto L43
            r12.f376827e = r3
            java.lang.String r0 = "onTimbreAudition"
            java.lang.Object r0 = r10.j(r2, r0, r12)
            if (r0 != r9) goto L43
            return r9
        L43:
            com.tencent.maas.model.time.MJTime r8 = r2.A()
            java.lang.String r0 = "getPresentationStartTime(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            gx0.bf r0 = r10.f376841d
            com.tencent.maas.model.time.MJTimeRange r2 = r2.B()
            java.lang.String r4 = "getPresentationTimeRange(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r0.o7(r2, r3)
            gx0.bf r0 = r10.f376841d
            r2 = 0
            r3 = 0
            r5 = 5
            r6 = 0
            r12.f376826d = r8
            r12.f376827e = r1
            r1 = r2
            r2 = r8
            r4 = r12
            java.lang.Object r0 = gx0.bf.d7(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L6e
            return r9
        L6e:
            r2 = r8
        L6f:
            gx0.bf r0 = r10.f376841d
            r1 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r8 = 25
            r11 = 0
            r6 = 0
            r12.f376826d = r6
            r12.f376827e = r7
            r6 = r12
            r7 = r8
            r8 = r11
            java.lang.Object r0 = gx0.bf.r7(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L87
            return r9
        L87:
            gx0.bf r0 = r10.f376841d
            com.tencent.maas.model.time.MJTimeRange r1 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.f16109x79d591a3
            java.lang.String r2 = "PositiveInfiniteTimeRange"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            r2 = 0
            r0.o7(r1, r2)
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.e.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

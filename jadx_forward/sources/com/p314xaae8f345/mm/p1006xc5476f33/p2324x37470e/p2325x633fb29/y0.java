package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f257324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 f257325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f257325e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y0(this.f257325e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r4.f257324d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L4e
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            r4.f257324d = r2
            com.tencent.mm.plugin.vlog.model.b1 r5 = r4.f257325e
            boolean r1 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1
            if (r1 == 0) goto L34
            com.tencent.mm.plugin.vlog.model.i1 r1 = new com.tencent.mm.plugin.vlog.model.i1
            r2 = r5
            com.tencent.mm.plugin.vlog.model.q1 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1) r2
            java.lang.String r2 = r2.f257247e
            int r5 = r5.f257103c
            r3 = 2
            r1.<init>(r2, r3, r5)
            rm5.j r5 = r1.f257160l
            r5.a()
        L32:
            r5 = r1
            goto L4b
        L34:
            boolean r1 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0
            if (r1 == 0) goto L4a
            com.tencent.mm.plugin.vlog.model.i1 r1 = new com.tencent.mm.plugin.vlog.model.i1
            r3 = r5
            com.tencent.mm.plugin.vlog.model.o0 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0) r3
            java.lang.String r3 = r3.f257233e
            int r5 = r5.f257103c
            r1.<init>(r3, r2, r5)
            rm5.j r5 = r1.f257160l
            r5.a()
            goto L32
        L4a:
            r5 = 0
        L4b:
            if (r5 != r0) goto L4e
            return r0
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

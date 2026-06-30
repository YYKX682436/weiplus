package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f211213d;

    /* renamed from: e, reason: collision with root package name */
    public int f211214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t f211215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211215f = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.r(this.f211215f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f211214e
            java.lang.String r2 = "SimpleUIComponent"
            com.tencent.mm.plugin.finder.ui.promotion.t r3 = r8.f211215f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            java.lang.Object r0 = r8.f211213d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L93
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlin.Result r9 = (p3321xbce91901.C29043x91b2b43d) r9
            java.lang.Object r9 = r9.getValue()
            goto L35
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r8.f211214e = r5
            java.lang.Object r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t.O6(r3, r8)
            if (r9 != r0) goto L35
            return r0
        L35:
            boolean r1 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r9)
            if (r1 == 0) goto L94
            r1 = r9
            r45.g61 r1 = (r45.g61) r1
            java.lang.String r6 = r1.m75945x2fec8307(r4)
            r3.f211230t = r6
            r6 = 3
            boolean r6 = r1.m75933x41a8a7f2(r6)
            r3.T6(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "request CgiGetFinderPromotionUser success, data: "
            r6.<init>(r7)
            java.util.LinkedList r5 = r1.m75941xfb821914(r5)
            int r5 = r5.size()
            r6.append(r5)
            java.lang.String r5 = ", lastBuffer: "
            r6.append(r5)
            java.lang.String r5 = r3.f211230t
            r6.append(r5)
            java.lang.String r5 = ", continueFlage: "
            r6.append(r5)
            boolean r5 = r3.f211231u
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)
            java.util.List r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t.Q6(r3, r1)
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.ui.promotion.q r6 = new com.tencent.mm.plugin.finder.ui.promotion.q
            r7 = 0
            r6.<init>(r3, r1, r7)
            r8.f211213d = r9
            r8.f211214e = r4
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r8)
            if (r1 != r0) goto L92
            return r0
        L92:
            r0 = r9
        L93:
            r9 = r0
        L94:
            java.lang.Throwable r9 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r9)
            if (r9 == 0) goto Lca
            r0 = 0
            r3.f211233w = r0
            boolean r0 = r9 instanceof rm0.j
            if (r0 == 0) goto Lca
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "request CgiGetFinderPromotionUser fail, errType="
            r0.<init>(r1)
            rm0.j r9 = (rm0.j) r9
            int r1 = r9.f478957e
            r0.append(r1)
            java.lang.String r1 = " errCode="
            r0.append(r1)
            int r1 = r9.f478958f
            r0.append(r1)
            java.lang.String r1 = " fail:"
            r0.append(r1)
            java.lang.String r9 = r9.f478959g
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r9)
        Lca:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.r.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

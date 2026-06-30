package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f211207d;

    /* renamed from: e, reason: collision with root package name */
    public int f211208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t f211209f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211209f = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.o(this.f211209f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f211208e
            r2 = 0
            java.lang.String r3 = "SimpleUIComponent"
            com.tencent.mm.plugin.finder.ui.promotion.t r4 = r10.f211209f
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L31
            if (r1 == r7) goto L27
            if (r1 == r6) goto L21
            if (r1 != r5) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Le0
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            java.lang.Object r1 = r10.f211207d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L99
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlin.Result r11 = (p3321xbce91901.C29043x91b2b43d) r11
            java.lang.Object r11 = r11.getValue()
            goto L3d
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r10.f211208e = r7
            java.lang.Object r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t.O6(r4, r10)
            if (r11 != r0) goto L3d
            return r0
        L3d:
            r1 = r11
            boolean r11 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(r1)
            if (r11 == 0) goto L99
            r11 = r1
            r45.g61 r11 = (r45.g61) r11
            java.lang.String r8 = r11.m75945x2fec8307(r6)
            r4.f211230t = r8
            boolean r8 = r11.m75933x41a8a7f2(r5)
            r4.T6(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "request CgiGetFinderPromotionUser success, data: "
            r8.<init>(r9)
            java.util.LinkedList r7 = r11.m75941xfb821914(r7)
            int r7 = r7.size()
            r8.append(r7)
            java.lang.String r7 = ", lastBuffer: "
            r8.append(r7)
            java.lang.String r7 = r4.f211230t
            r8.append(r7)
            java.lang.String r7 = ", continueFlage: "
            r8.append(r7)
            boolean r7 = r4.f211231u
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r7)
            java.util.List r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.t.Q6(r4, r11)
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.ui.promotion.l r9 = new com.tencent.mm.plugin.finder.ui.promotion.l
            r9.<init>(r4, r11, r7, r2)
            r10.f211207d = r1
            r10.f211208e = r6
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r8, r9, r10)
            if (r11 != r0) goto L99
            return r0
        L99:
            java.lang.Throwable r11 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r1)
            if (r11 == 0) goto Le0
            boolean r6 = r11 instanceof rm0.j
            if (r6 == 0) goto Lcc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "request CgiGetFinderPromotionUser fail, errType="
            r6.<init>(r7)
            rm0.j r11 = (rm0.j) r11
            int r7 = r11.f478957e
            r6.append(r7)
            java.lang.String r7 = " errCode="
            r6.append(r7)
            int r7 = r11.f478958f
            r6.append(r7)
            java.lang.String r7 = " fail:"
            r6.append(r7)
            java.lang.String r11 = r11.f478959g
            r6.append(r11)
            java.lang.String r11 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r11)
        Lcc:
            kotlinx.coroutines.p0 r11 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r11 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            com.tencent.mm.plugin.finder.ui.promotion.n r3 = new com.tencent.mm.plugin.finder.ui.promotion.n
            r3.<init>(r4, r2)
            r10.f211207d = r1
            r10.f211208e = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r3, r10)
            if (r11 != r0) goto Le0
            return r0
        Le0:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1641xd05cfca3.o.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

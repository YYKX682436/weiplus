package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class in0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f194526d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f194527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f194528f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194528f = wn0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.in0 in0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.in0(this.f194528f, interfaceC29045xdcb5ca57);
        in0Var.f194527e = obj;
        return in0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.in0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f194526d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            com.tencent.mm.plugin.finder.live.plugin.wn0 r7 = r0.f194528f
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2d
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f194527e
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            goto Lb1
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f194527e
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            goto L95
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            r2 = r22
            goto L77
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            java.lang.Object r2 = r0.f194527e
            r8 = r2
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            zl2.r4 r2 = zl2.r4.f555483a
            boolean r2 = r2.w1()
            if (r2 != 0) goto L4f
            r9 = 0
            r10 = 0
            com.tencent.mm.plugin.finder.live.plugin.fn0 r11 = new com.tencent.mm.plugin.finder.live.plugin.fn0
            r11.<init>(r7, r6)
            r12 = 3
            r13 = 0
            p3325xe03a0797.p3326xc267989b.l.b(r8, r9, r10, r11, r12, r13)
        L4f:
            az2.j r2 = r7.v1()
            android.view.ViewGroup r8 = r7.f446856d
            android.content.Context r15 = r8.getContext()
            java.lang.String r8 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r15, r8)
            r16 = 0
            r17 = 0
            r19 = 6
            r20 = 0
            r14 = r2
            az2.j.u(r14, r15, r16, r17, r19, r20)
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r0.f194526d = r5
            java.lang.Object r2 = xg2.g.b(r2, r8, r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            xg2.h r2 = (xg2.h) r2
            boolean r5 = r2 instanceof xg2.i
            if (r5 == 0) goto L95
            oz5.l r5 = r2.f535925a
            if (r5 != 0) goto L85
            oz5.l r5 = r21.mo48699x76847179()
        L85:
            com.tencent.mm.plugin.finder.live.plugin.hn0 r8 = new com.tencent.mm.plugin.finder.live.plugin.hn0
            r8.<init>(r2, r6, r7)
            r0.f194527e = r2
            r0.f194526d = r4
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r5, r8, r0)
            if (r4 != r1) goto L95
            return r1
        L95:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lb1
            oz5.l r4 = r2.f535925a
            if (r4 != 0) goto La1
            oz5.l r4 = r21.mo48699x76847179()
        La1:
            com.tencent.mm.plugin.finder.live.plugin.gn0 r5 = new com.tencent.mm.plugin.finder.live.plugin.gn0
            r5.<init>(r2, r6, r7)
            r0.f194527e = r2
            r0.f194526d = r3
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r4, r5, r0)
            if (r2 != r1) goto Lb1
            return r1
        Lb1:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.in0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

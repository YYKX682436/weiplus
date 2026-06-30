package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5;

/* loaded from: classes3.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f202188d;

    /* renamed from: e, reason: collision with root package name */
    public int f202189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x f202190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 f202191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qs5.s f202192h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.x xVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570, qs5.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f202190f = xVar;
        this.f202191g = c22843x6b8c5570;
        this.f202192h = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.u(this.f202190f, this.f202191g, this.f202192h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f202189e
            com.tencent.mm.plugin.finder.live.wish.view.x r2 = r12.f202190f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.lang.Object r0 = r12.f202188d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Ld0
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            java.lang.Object r1 = r12.f202188d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lb3
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L8b
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r2.getClass()
            r45.us1 r13 = new r45.us1
            r13.<init>()
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f314913e
            if (r1 == 0) goto L4c
            java.lang.Class<mm2.c1> r6 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r1.m57635xbba4bfc0(r6)
            mm2.c1 r1 = (mm2.c1) r1
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.f410385o
            if (r1 != 0) goto L4e
        L4c:
            java.lang.String r1 = ""
        L4e:
            r13.set(r5, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r6 = 8687(0x21ef, float:1.2173E-41)
            r1.f152200d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivegetgiftwallinfo"
            r1.f152199c = r6
            r1.f152197a = r13
            r45.vs1 r13 = new r45.vs1
            r13.<init>()
            r1.f152198b = r13
            com.tencent.mm.modelbase.o r13 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r13)
            az2.j r1 = (az2.j) r1
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r13 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r12.f202189e = r5
            java.lang.Object r13 = xg2.g.b(r1, r13, r12)
            if (r13 != r0) goto L8b
            return r0
        L8b:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            com.tencent.mm.plugin.finder.live.wish.view.x r8 = r12.f202190f
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r9 = r12.f202191g
            qs5.s r10 = r12.f202192h
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto Lb3
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto La0
            oz5.l r13 = r12.mo48699x76847179()
        La0:
            com.tencent.mm.plugin.finder.live.wish.view.t r11 = new com.tencent.mm.plugin.finder.live.wish.view.t
            r7 = 0
            r5 = r11
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r12.f202188d = r1
            r12.f202189e = r4
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r11, r12)
            if (r13 != r0) goto Lb3
            return r0
        Lb3:
            boolean r13 = r1 instanceof xg2.b
            if (r13 == 0) goto Ld0
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto Lbf
            oz5.l r13 = r12.mo48699x76847179()
        Lbf:
            com.tencent.mm.plugin.finder.live.wish.view.s r4 = new com.tencent.mm.plugin.finder.live.wish.view.s
            r5 = 0
            r4.<init>(r1, r5, r2)
            r12.f202188d = r1
            r12.f202189e = r3
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r4, r12)
            if (r13 != r0) goto Ld0
            return r0
        Ld0:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1551x373aa5.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

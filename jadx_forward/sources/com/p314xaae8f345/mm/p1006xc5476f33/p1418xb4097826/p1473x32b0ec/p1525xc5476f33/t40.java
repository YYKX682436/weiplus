package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class t40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f195876d;

    /* renamed from: e, reason: collision with root package name */
    public int f195877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f195878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 f195879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(cm2.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z40 z40Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195878f = d0Var;
        this.f195879g = z40Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t40(this.f195878f, this.f195879g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t40) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
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
            int r1 = r10.f195877e
            r2 = 0
            com.tencent.mm.plugin.finder.live.plugin.z40 r3 = r10.f195879g
            cm2.d0 r4 = r10.f195878f
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L32
            if (r1 == r7) goto L2e
            if (r1 == r6) goto L25
            if (r1 != r5) goto L1d
            java.lang.Object r0 = r10.f195876d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Ld3
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r1 = r10.f195876d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lb7
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L98
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r45.wx2 r11 = new r45.wx2
            r11.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r8 = 7734(0x1e36, float:1.0838E-41)
            r45.kv0 r1 = r1.a(r8)
            r11.set(r7, r1)
            r45.v42 r1 = r4.f124868v
            r9 = 4
            int r1 = r1.m75939xb282bd08(r9)
            if (r1 != 0) goto L50
            r1 = r7
            goto L51
        L50:
            r1 = r6
        L51:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.set(r6, r1)
            r1 = 0
            r45.v42 r9 = r4.f124868v
            java.lang.String r1 = r9.m75945x2fec8307(r1)
            r11.set(r5, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r1.f152200d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/findersubscribeprogramme"
            r1.f152199c = r8
            r1.f152197a = r11
            r45.xx2 r11 = new r45.xx2
            r11.<init>()
            r1.f152198b = r11
            com.tencent.mm.modelbase.o r11 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r11)
            kotlinx.coroutines.p0 r11 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r11 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r10.f195877e = r7
            java.lang.Object r11 = xg2.g.b(r1, r11, r10)
            if (r11 != r0) goto L98
            return r0
        L98:
            r1 = r11
            xg2.h r1 = (xg2.h) r1
            boolean r11 = r1 instanceof xg2.i
            if (r11 == 0) goto Lb7
            oz5.l r11 = r1.f535925a
            if (r11 != 0) goto La7
            oz5.l r11 = r10.mo48699x76847179()
        La7:
            com.tencent.mm.plugin.finder.live.plugin.s40 r7 = new com.tencent.mm.plugin.finder.live.plugin.s40
            r7.<init>(r1, r2, r4, r3)
            r10.f195876d = r1
            r10.f195877e = r6
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r7, r10)
            if (r11 != r0) goto Lb7
            return r0
        Lb7:
            boolean r11 = r1 instanceof xg2.b
            if (r11 == 0) goto Ld3
            oz5.l r11 = r1.f535925a
            if (r11 != 0) goto Lc3
            oz5.l r11 = r10.mo48699x76847179()
        Lc3:
            com.tencent.mm.plugin.finder.live.plugin.r40 r4 = new com.tencent.mm.plugin.finder.live.plugin.r40
            r4.<init>(r1, r2, r3)
            r10.f195876d = r1
            r10.f195877e = r5
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r4, r10)
            if (r11 != r0) goto Ld3
            return r0
        Ld3:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t40.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

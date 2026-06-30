package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f194749d;

    /* renamed from: e, reason: collision with root package name */
    public long f194750e;

    /* renamed from: f, reason: collision with root package name */
    public int f194751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f194752g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f194753h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194752g = adVar;
        this.f194753h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kd(this.f194752g, this.f194753h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00d5  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r16
            pz5.a r11 = pz5.a.f440719d
            int r0 = r10.f194751f
            java.lang.String r12 = "FinderLiveChargePayPluginEx"
            java.lang.String r1 = "getContext(...)"
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L38
            if (r0 == r4) goto L2a
            if (r0 != r3) goto L22
            long r0 = r10.f194750e
            java.lang.Object r2 = r10.f194749d
            com.tencent.mm.plugin.finder.live.plugin.ad r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r13 = r0
            r0 = r17
            goto Lb8
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2a:
            long r4 = r10.f194750e
            java.lang.Object r0 = r10.f194749d
            com.tencent.mm.plugin.finder.live.plugin.ad r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r15 = r0
            r13 = r4
            r0 = r17
            goto L6b
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            java.lang.Class<mm2.g0> r0 = mm2.g0.class
            com.tencent.mm.plugin.finder.live.plugin.ad r5 = r10.f194752g
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.g0 r0 = (mm2.g0) r0
            com.tencent.mm.protobuf.g r0 = r0.f410596g
            if (r0 == 0) goto Ld8
            i95.m r6 = i95.n0.c(r2)
            zy2.b6 r6 = (zy2.b6) r6
            android.view.ViewGroup r7 = r5.f446856d
            android.content.Context r7 = r7.getContext()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)
            r10.f194749d = r5
            long r8 = r10.f194753h
            r10.f194750e = r8
            r10.f194751f = r4
            c61.l7 r6 = (c61.l7) r6
            java.lang.Object r0 = r6.kk(r7, r0, r4, r10)
            if (r0 != r11) goto L69
            return r11
        L69:
            r15 = r5
            r13 = r8
        L6b:
            r4 = r0
            r45.zc5 r4 = (r45.zc5) r4
            if (r4 != 0) goto L76
            java.lang.String r0 = "#payForLiveV2 product is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r0)
            goto Ld8
        L76:
            i95.m r0 = i95.n0.c(r2)
            zy2.b6 r0 = (zy2.b6) r0
            android.view.ViewGroup r2 = r15.f446856d
            android.content.Context r2 = r2.getContext()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r1)
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r15.P0(r1)
            mm2.e1 r5 = (mm2.e1) r5
            long r5 = r5.f410516m
            androidx.lifecycle.c1 r7 = r15.P0(r1)
            mm2.e1 r7 = (mm2.e1) r7
            byte[] r7 = r7.f410518o
            com.tencent.mm.protobuf.g r7 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r7)
            androidx.lifecycle.c1 r1 = r15.P0(r1)
            mm2.e1 r1 = (mm2.e1) r1
            java.lang.String r8 = r1.f410526w
            r10.f194749d = r15
            r10.f194750e = r13
            r10.f194751f = r3
            c61.l7 r0 = (c61.l7) r0
            r1 = r2
            r2 = r4
            r3 = r13
            r9 = r16
            java.lang.Object r0 = r0.Ej(r1, r2, r3, r5, r7, r8, r9)
            if (r0 != r11) goto Lb7
            return r11
        Lb7:
            r2 = r15
        Lb8:
            jz5.o r0 = (jz5.o) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "#payForLiveV2 payResult="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r1)
            java.lang.Object r0 = r0.f384374d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld8
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ld.c(r2, r13)
        Ld8:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kd.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

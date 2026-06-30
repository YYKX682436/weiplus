package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f195664d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f195665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f195666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f195667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(dk2.zf zfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195666f = zfVar;
        this.f195667g = mgVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rf rfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rf(this.f195666f, this.f195667g, interfaceC29045xdcb5ca57);
        rfVar.f195665e = obj;
        return rfVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x009e, code lost:
    
        return jz5.f0.f384359a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.z0.h(r0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007f, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.z0.h(r0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0081, code lost:
    
        r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0;
        r4.G1();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
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
            int r1 = r10.f195664d
            r2 = 1
            java.lang.String r3 = "#onStickTopShowingTitleMsgReceived timeout finally"
            com.tencent.mm.plugin.finder.live.plugin.mg r4 = r10.f195667g
            java.lang.String r5 = "Finder.LiveCommentPlugin"
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r10.f195665e
            kotlinx.coroutines.y0 r0 = (p3325xe03a0797.p3326xc267989b.y0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Throwable -> L17 p3325xe03a0797.p3326xc267989b.x3 -> L8d
            goto L78
        L17:
            r11 = move-exception
            goto L9f
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.Object r11 = r10.f195665e
            kotlinx.coroutines.y0 r11 = (p3325xe03a0797.p3326xc267989b.y0) r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "#onStickTopShowingTitleMsgReceived timeout start content="
            r1.<init>(r6)
            dk2.zf r6 = r10.f195666f
            java.lang.String r7 = r6.j()
            r1.append(r7)
            java.lang.String r7 = " contentExtend="
            r1.append(r7)
            java.lang.String r7 = r6.x()
            r1.append(r7)
            java.lang.String r7 = " msgType="
            r1.append(r7)
            int r7 = r6.mo124533xfb85f7b0()
            r1.append(r7)
            java.lang.String r7 = " seq="
            r1.append(r7)
            long r7 = r6.m()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            com.tencent.mm.plugin.finder.live.plugin.qf r1 = new com.tencent.mm.plugin.finder.live.plugin.qf     // Catch: java.lang.Throwable -> L87 p3325xe03a0797.p3326xc267989b.x3 -> L8c
            r7 = 0
            r1.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L87 p3325xe03a0797.p3326xc267989b.x3 -> L8c
            r10.f195665e = r11     // Catch: java.lang.Throwable -> L87 p3325xe03a0797.p3326xc267989b.x3 -> L8c
            r10.f195664d = r2     // Catch: java.lang.Throwable -> L87 p3325xe03a0797.p3326xc267989b.x3 -> L8c
            r6 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.a4.b(r6, r1, r10)     // Catch: java.lang.Throwable -> L87 p3325xe03a0797.p3326xc267989b.x3 -> L8c
            if (r1 != r0) goto L77
            return r0
        L77:
            r0 = r11
        L78:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
            boolean r11 = p3325xe03a0797.p3326xc267989b.z0.h(r0)
            if (r11 == 0) goto L9c
        L81:
            com.tencent.mm.plugin.finder.live.plugin.me r11 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0
            r4.G1()
            goto L9c
        L87:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L9f
        L8c:
            r0 = r11
        L8d:
            java.lang.String r11 = "#onStickTopShowingTitleMsgReceived timeout catch"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)     // Catch: java.lang.Throwable -> L17
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
            boolean r11 = p3325xe03a0797.p3326xc267989b.z0.h(r0)
            if (r11 == 0) goto L9c
            goto L81
        L9c:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        L9f:
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
            boolean r0 = p3325xe03a0797.p3326xc267989b.z0.h(r0)
            if (r0 == 0) goto Lad
            com.tencent.mm.plugin.finder.live.plugin.me r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0
            r4.G1()
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rf.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

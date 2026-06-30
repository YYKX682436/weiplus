package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class y9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f192293d;

    /* renamed from: e, reason: collision with root package name */
    public int f192294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14000x822b3ff6 f192295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14000x822b3ff6 activityC14000x822b3ff6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f192295f = activityC14000x822b3ff6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y9(this.f192295f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
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
            int r1 = r8.f192294e
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI r2 = r8.f192295f
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r8.f192293d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto Lbb
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.f192293d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L9f
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L80
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r45.s61 r9 = new r45.s61
            r9.<init>()
            java.lang.String r1 = xy2.c.e(r2)
            r9.set(r4, r1)
            java.lang.String r1 = xy2.c.e(r2)
            r9.set(r3, r1)
            db2.t4 r1 = db2.t4.f309704a
            r7 = 9550(0x254e, float:1.3382E-41)
            r45.kv0 r1 = r1.a(r7)
            r9.set(r6, r1)
            r1 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.set(r1, r7)
            int r1 = r2.f190905v
            r7 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.set(r7, r1)
            r1 = 4
            int r7 = r2.f190906w
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.set(r1, r7)
            com.tencent.mm.protobuf.g r1 = r2.f190907x
            r7 = 6
            r9.set(r7, r1)
            com.tencent.mm.modelbase.i r9 = r9.d()
            r8.f192294e = r6
            java.lang.Object r9 = xg2.g.d(r9, r5, r8, r6, r5)
            if (r9 != r0) goto L80
            return r0
        L80:
            r1 = r9
            xg2.h r1 = (xg2.h) r1
            boolean r9 = r1 instanceof xg2.i
            if (r9 == 0) goto L9f
            oz5.l r9 = r1.f535925a
            if (r9 != 0) goto L8f
            oz5.l r9 = r8.mo48699x76847179()
        L8f:
            com.tencent.mm.plugin.finder.feed.ui.x9 r6 = new com.tencent.mm.plugin.finder.feed.ui.x9
            r6.<init>(r1, r5, r2)
            r8.f192293d = r1
            r8.f192294e = r4
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r6, r8)
            if (r9 != r0) goto L9f
            return r0
        L9f:
            boolean r9 = r1 instanceof xg2.b
            if (r9 == 0) goto Lbb
            oz5.l r9 = r1.f535925a
            if (r9 != 0) goto Lab
            oz5.l r9 = r8.mo48699x76847179()
        Lab:
            com.tencent.mm.plugin.finder.feed.ui.w9 r4 = new com.tencent.mm.plugin.finder.feed.ui.w9
            r4.<init>(r1, r5, r2)
            r8.f192293d = r1
            r8.f192294e = r3
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r4, r8)
            if (r9 != r0) goto Lbb
            return r0
        Lbb:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y9.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

package vn2;

/* loaded from: classes2.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f519794d;

    /* renamed from: e, reason: collision with root package name */
    public int f519795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f519796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f519797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jz5.l f519798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f519799i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f519800m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519801n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, r45.qt2 qt2Var, jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, ym5.q1 q1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519796f = context;
        this.f519797g = qt2Var;
        this.f519798h = lVar;
        this.f519799i = abstractC13919x46aff122;
        this.f519800m = q1Var;
        this.f519801n = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vn2.e0(this.f519796f, this.f519797g, this.f519798h, this.f519799i, this.f519800m, this.f519801n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vn2.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f519795e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r13.f519794d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto Lcb
        L19:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L21:
            java.lang.Object r1 = r13.f519794d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto Lab
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L81
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            r45.zu2 r14 = new r45.zu2
            r14.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r6 = 10460(0x28dc, float:1.4658E-41)
            r45.qt2 r7 = r13.f519797g
            r45.kv0 r1 = r1.b(r6, r7)
            r14.set(r5, r1)
            jz5.l r1 = r13.f519798h
            java.lang.Object r6 = r1.f384367e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r6
            long r6 = r6.mo2128x1ed62e84()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r14.set(r4, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r14.set(r3, r6)
            java.lang.Object r1 = r1.f384367e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r1
            java.lang.String r1 = r1.g0()
            r6 = 4
            r14.set(r6, r1)
            com.tencent.mm.modelbase.i r14 = r14.d()
            az2.j r14 = (az2.j) r14
            android.content.Context r7 = r13.f519796f
            r8 = 0
            r9 = 0
            r11 = 6
            r12 = 0
            r6 = r14
            az2.j.u(r6, r7, r8, r9, r11, r12)
            r13.f519795e = r5
            java.lang.Object r14 = xg2.g.d(r14, r2, r13, r5, r2)
            if (r14 != r0) goto L81
            return r0
        L81:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            jz5.l r8 = r13.f519798h
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r9 = r13.f519799i
            ym5.q1 r10 = r13.f519800m
            java.lang.String r11 = r13.f519801n
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto Lab
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto L98
            oz5.l r14 = r13.mo48699x76847179()
        L98:
            vn2.d0 r12 = new vn2.d0
            r7 = 0
            r5 = r12
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.f519794d = r1
            r13.f519795e = r4
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r12, r13)
            if (r14 != r0) goto Lab
            return r0
        Lab:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto Lcb
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto Lb7
            oz5.l r14 = r13.mo48699x76847179()
        Lb7:
            vn2.c0 r4 = new vn2.c0
            android.content.Context r5 = r13.f519796f
            java.lang.String r6 = r13.f519801n
            r4.<init>(r1, r2, r5, r6)
            r13.f519794d = r1
            r13.f519795e = r3
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r4, r13)
            if (r14 != r0) goto Lcb
            return r0
        Lcb:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: vn2.e0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

package lc4;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd f399497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd c18246x9a0ff9cd, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f399497e = c18246x9a0ff9cd;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        lc4.h hVar = new lc4.h(this.f399497e, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        return hVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        java.lang.Object mo150x989b7ca4 = ((lc4.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$checkWhenDataNotEnough$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r7.f399496d
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC r6 = r7.f399497e
            if (r3 == 0) goto L29
            if (r3 == r5) goto L25
            if (r3 != r4) goto L1a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L54
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r8
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L38
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r7.f399496d = r5
            java.lang.Object r8 = r6.X6(r7)
            if (r8 != r2) goto L38
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L38:
            lc4.d r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.f250294r
            java.lang.String r8 = "access$getLoadMoreJob$p"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r8, r3)
            kotlinx.coroutines.r2 r5 = r6.f250307o
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r8, r3)
            if (r5 == 0) goto L54
            r7.f399496d = r4
            java.lang.Object r8 = r5.C(r7)
            if (r8 != r2) goto L54
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L54:
            boolean r8 = r6.V6()
            if (r8 != 0) goto L61
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.P6(r6)
            r8.c7()
        L61:
            jz5.f0 r8 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lc4.h.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

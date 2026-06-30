package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w f252975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.f1 f252976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f252975e = wVar;
        this.f252976f = f1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.v(this.f252975e, this.f252976f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        java.lang.Object mo150x989b7ca4 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (((java.util.List) r7).isEmpty() != false) goto L18;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$updateBottomViewStyle$2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r6.f252974d
            com.tencent.mm.plugin.sns.ui.wsfold.w r4 = r6.f252975e
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 != r5) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L3d
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r7
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            com.tencent.mm.plugin.mvvmlist.MvvmList r7 = r4.T6()
            java.util.ArrayList r7 = r7.f233598o
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L46
            r6.f252974d = r5
            java.lang.Object r7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w.S6(r4, r6)
            if (r7 != r2) goto L3d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L3d:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L46
            goto L47
        L46:
            r5 = 0
        L47:
            if (r5 == 0) goto L55
            android.app.Activity r7 = r4.m80379x76847179()
            r2 = 2131776865(0x7f105561, float:1.9185214E38)
            java.lang.String r7 = i65.a.r(r7, r2)
            goto L57
        L55:
            java.lang.String r7 = ""
        L57:
            com.tencent.mm.plugin.sns.ui.wsfold.f1 r2 = r6.f252976f
            r2.getClass()
            java.lang.String r3 = "setLoadAllFinish"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView r2 = r2.T6()
            r2.a(r7)
            java.lang.String r7 = "MicroMsg.SnsWsFoldMainUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            jz5.f0 r7 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.v.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

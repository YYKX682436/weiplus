package k84;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f386571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.p f386572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(mb4.p pVar, k84.q1 q1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386572e = pVar;
        this.f386573f = q1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        k84.g0 g0Var = new k84.g0(this.f386572e, this.f386573f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        return g0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        java.lang.Object mo150x989b7ca4 = ((k84.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$5$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r9.f386571d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L95
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r10
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            boolean r10 = com.p314xaae8f345.mm.ui.bk.C()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.adsocial.TagInfo"
            r5 = 0
            mb4.p r6 = r9.f386572e
            if (r10 != 0) goto L4d
            mb4.h0 r10 = r6.c()
            if (r10 == 0) goto L6a
            java.lang.String r5 = "getJumpLinkIconLight"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r3)
            com.tencent.mm.plugin.sns.storage.h1 r6 = r10.f406953h
            f06.v[] r7 = mb4.h0.f406945l
            r8 = 0
            r7 = r7[r8]
            com.tencent.mm.plugin.sns.storage.r0 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) r6
            java.lang.Object r10 = r6.a(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r3)
            goto L69
        L4d:
            mb4.h0 r10 = r6.c()
            if (r10 == 0) goto L6a
            java.lang.String r5 = "getJumpLinkIconDark"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r3)
            com.tencent.mm.plugin.sns.storage.h1 r6 = r10.f406954i
            f06.v[] r7 = mb4.h0.f406945l
            r7 = r7[r4]
            com.tencent.mm.plugin.sns.storage.r0 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) r6
            java.lang.Object r10 = r6.a(r10, r7)
            java.lang.String r10 = (java.lang.String) r10
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r3)
        L69:
            r5 = r10
        L6a:
            n74.r r10 = n74.r.f416954a
            if (r5 != 0) goto L70
            java.lang.String r5 = ""
        L70:
            k84.q1 r3 = r9.f386573f
            r3.getClass()
            java.lang.String r6 = "getTagIconAfterLike"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r7)
            jz5.g r3 = r3.K
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r7)
            r9.f386571d = r4
            java.lang.Object r10 = r10.e(r5, r3, r9)
            if (r10 != r2) goto L95
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L95:
            jz5.f0 r10 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.g0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

package k84;

/* loaded from: classes4.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f386863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(k84.c6 c6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f386864e = c6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        k84.x4 x4Var = new k84.x4(this.f386864e, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        return x4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        java.lang.Object mo150x989b7ca4 = ((k84.x4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initCheerNormalIcon$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r8.f386863d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L8a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r9
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            boolean r9 = com.p314xaae8f345.mm.ui.bk.C()
            r3 = 0
            k84.c6 r5 = r8.f386864e
            if (r9 != 0) goto L3e
            mb4.a r9 = k84.c6.z(r5)
            if (r9 == 0) goto L4f
            mb4.m r9 = r9.a()
            if (r9 == 0) goto L4f
            java.lang.String r9 = r9.b()
            goto L50
        L3e:
            mb4.a r9 = k84.c6.z(r5)
            if (r9 == 0) goto L4f
            mb4.l r9 = r9.b()
            if (r9 == 0) goto L4f
            java.lang.String r9 = r9.b()
            goto L50
        L4f:
            r9 = r3
        L50:
            java.lang.String r6 = ""
            if (r9 != 0) goto L55
            r9 = r6
        L55:
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r7 != 0) goto L5d
            r3 = r9
            goto L74
        L5d:
            boolean r9 = com.p314xaae8f345.mm.ui.bk.C()
            if (r9 != 0) goto L6c
            mb4.c r9 = k84.c6.A(r5)
            if (r9 == 0) goto L74
            java.lang.String r3 = r9.f72813x1b892766
            goto L74
        L6c:
            mb4.c r9 = k84.c6.A(r5)
            if (r9 == 0) goto L74
            java.lang.String r3 = r9.f72814x5a5b67fc
        L74:
            if (r3 != 0) goto L77
            goto L78
        L77:
            r6 = r3
        L78:
            n74.r r9 = n74.r.f416954a
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = k84.c6.C(r5)
            r8.f386863d = r4
            java.lang.Object r9 = r9.e(r6, r3, r8)
            if (r9 != r2) goto L8a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L8a:
            jz5.f0 r9 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.x4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

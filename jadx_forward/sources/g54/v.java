package g54;

/* loaded from: classes15.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c f350489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c c17737xd9711c0c, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350489e = c17737xd9711c0c;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        g54.v vVar = new g54.v(this.f350489e, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        java.lang.Object mo150x989b7ca4 = ((g54.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1");
        return mo150x989b7ca4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002d -> B:5:0x0033). Please report as a decompilation issue!!! */
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
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$startProgress$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            pz5.a r2 = pz5.a.f440719d
            int r3 = r9.f350488d
            r4 = 1
            if (r3 == 0) goto L21
            if (r3 != r4) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r9
            goto L33
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r10
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r9
        L25:
            r10.f350488d = r4
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r10)
            if (r3 != r2) goto L33
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L33:
            int r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.I
            java.lang.String r3 = "access$getPlayer$p"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r5)
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView r6 = r10.f350489e
            kk4.c r7 = r6.f244552i
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            if (r7 == 0) goto L57
            kk4.f0 r7 = (kk4.f0) r7
            long r7 = r7.mo100915xddd35a52()
            r6.m69417x1869d577()
            g54.u r3 = new g54.u
            r3.<init>(r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2106x373aa5.C17737xd9711c0c.o(r6, r3)
            goto L25
        L57:
            jz5.f0 r10 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g54.v.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

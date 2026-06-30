package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f286410d;

    /* renamed from: e, reason: collision with root package name */
    public int f286411e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f286412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 f286413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f286413g = c22101xd1256332;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.y0 y0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.y0(this.f286413g, interfaceC29045xdcb5ca57);
        y0Var.f286412f = obj;
        return y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f286411e
            r2 = 2
            r3 = 1
            jz5.f0 r4 = jz5.f0.f384359a
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView r5 = r7.f286413g
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r7.f286410d
            t21.v2 r0 = (t21.v2) r0
            java.lang.Object r1 = r7.f286412f
            com.tencent.mm.storage.f9 r1 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L73
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            java.lang.Object r1 = r7.f286412f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L3e
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Object r8 = r7.f286412f
            kotlinx.coroutines.y0 r8 = (p3325xe03a0797.p3326xc267989b.y0) r8
            r7.f286412f = r8
            r7.f286411e = r3
            java.lang.Object r8 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.n(r5, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 r8 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0) r8
            if (r8 != 0) goto L50
            java.lang.String r8 = r5.f286259m
            java.lang.String r0 = "tryPrepareVideo, prepare context is null, skip"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r8, r0)
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed r8 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22111xfda933a9.f286285a
            r5.B(r8)
            return r4
        L50:
            com.tencent.mm.storage.f9 r1 = r8.f286332b
            t21.v2 r3 = r8.f286333c
            fk4.u r8 = r8.f286334d
            boolean r6 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.s(r5, r1, r3, r8)
            if (r6 == 0) goto L65
            java.lang.String r8 = r5.f286259m
            java.lang.String r0 = "tryPrepareVideo, tryPrepareLocal success, wait for videoView prepared"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r0)
            return r4
        L65:
            r7.f286412f = r1
            r7.f286410d = r3
            r7.f286411e = r2
            java.lang.Object r8 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.t(r5, r1, r8, r7)
            if (r8 != r0) goto L72
            return r0
        L72:
            r0 = r3
        L73:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L84
            java.lang.String r8 = r5.f286259m
            java.lang.String r0 = "tryPrepareVideo, tryPrepareOnline success, wait for videoView prepared"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r0)
            return r4
        L84:
            boolean r8 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.r(r5, r1, r0)
            if (r8 == 0) goto L93
            java.lang.String r8 = r5.f286259m
            java.lang.String r0 = "tryPrepareVideo, tryPrepareDownload success, wait for videoView prepared"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r0)
            return r4
        L93:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed r8 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22111xfda933a9.f286285a
            r5.B(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.y0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}

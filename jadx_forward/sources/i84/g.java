package i84;

/* loaded from: classes13.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f371191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 f371192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 c17776xe08da3a0, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f371192e = c17776xe08da3a0;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        i84.g gVar = new i84.g(this.f371192e, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        java.lang.Object mo150x989b7ca4 = ((i84.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f371191d;
        if (i17 != 0 && i17 != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            throw illegalStateException;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2133xbc1081a1.C17776xe08da3a0 c17776xe08da3a0 = this.f371192e;
            c17776xe08da3a0.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            boolean z17 = c17776xe08da3a0.isRefreshing;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getProgressProvider$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                yz5.a aVar2 = c17776xe08da3a0.f244836m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getProgressProvider$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                if (aVar2 != null) {
                    c17776xe08da3a0.m69524x3ae760af(((java.lang.Number) aVar2.mo152xb9724478()).floatValue());
                }
            }
            this.f371191d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(1000L, this) != aVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        return aVar;
    }
}

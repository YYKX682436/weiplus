package tc4;

/* loaded from: classes4.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f498825d;

    /* renamed from: e, reason: collision with root package name */
    public int f498826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.d2 f498827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(tc4.d2 d2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f498827f = d2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        tc4.b2 b2Var = new tc4.b2(this.f498827f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        return b2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        java.lang.Object mo150x989b7ca4 = ((tc4.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f498826e;
        tc4.d2 d2Var = this.f498827f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251462s.a(d2Var.mo70844x337a8b(), "loadCustomItemInfo");
            this.f498825d = currentTimeMillis;
            this.f498826e = 1;
            if (d2Var.E(this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
                throw illegalStateException;
            }
            j17 = this.f498825d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.AbstractActivityC18370x899ce1db.f251462s.b(d2Var.mo70844x337a8b());
        d2Var.x("MicroMsg.Improve.TimelineItemLoad", "itemLoad cost:" + (java.lang.System.currentTimeMillis() - j17));
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$2");
        return f0Var;
    }
}

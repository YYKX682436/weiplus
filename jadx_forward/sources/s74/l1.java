package s74;

/* loaded from: classes4.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f485935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f485936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f485937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f485938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f485939h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(java.lang.String str, s74.f3 f3Var, s74.o2 o2Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485936e = str;
        this.f485937f = f3Var;
        this.f485938g = o2Var;
        this.f485939h = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        s74.l1 l1Var = new s74.l1(this.f485936e, this.f485937f, this.f485938g, this.f485939h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        return l1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        java.lang.Object mo150x989b7ca4 = ((s74.l1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f485935d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i64.t tVar = i64.t.f370849d;
            java.lang.String str = this.f485936e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j e17 = tVar.e(str);
            s74.k1 k1Var = new s74.k1(this.f485937f, this.f485938g, str, this.f485939h);
            this.f485935d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e17).a(k1Var, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2");
        return f0Var;
    }
}

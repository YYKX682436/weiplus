package dd4;

/* loaded from: classes3.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310600d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f310602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fk4.k f310603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.l lVar, fk4.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310602f = lVar;
        this.f310603g = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        dd4.x xVar = new dd4.x(this.f310602f, this.f310603g, interfaceC29045xdcb5ca57);
        xVar.f310601e = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        return xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        java.lang.Object mo150x989b7ca4 = ((dd4.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f310600d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f310601e;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
                throw illegalStateException;
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f310601e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            this.f310602f.mo146xb9724478(new java.lang.Float(this.f310603g.f345155j));
            this.f310601e = y0Var;
            this.f310600d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
                return aVar;
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$waitForComplete$2");
        return f0Var;
    }
}

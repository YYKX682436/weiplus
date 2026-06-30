package ge4;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f352517d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f352518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge4.a f352519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ge4.e f352520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ge4.a aVar, ge4.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f352519f = aVar;
        this.f352520g = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        ge4.d dVar = new ge4.d(this.f352519f, this.f352520g, interfaceC29045xdcb5ca57);
        dVar.f352518e = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        java.lang.Object mo150x989b7ca4 = ((ge4.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f352517d;
        ge4.a aVar2 = this.f352519f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f352518e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "launchJob >> thread name: " + java.lang.Thread.currentThread().getName() + " mediaId: " + aVar2.b().g() + " mediaKey: " + aVar2.b().h());
            this.f352518e = y0Var2;
            this.f352517d = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoJob");
            java.lang.Object g17 = ((he4.c) aVar2.f352508a).g(aVar2.f352509b, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoJob");
            if (g17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
                return aVar;
            }
            y0Var = y0Var2;
            obj = g17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
                throw illegalStateException;
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f352518e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fe4.d dVar = (fe4.d) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("job is finish >> id: ");
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        sb6.append(dVar.f343101a);
        sb6.append(" res: ");
        sb6.append(dVar.a());
        sb6.append(" errMsg: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrorMsg", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrorMsg", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        sb6.append(dVar.f343103c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", sb6.toString());
        pm0.v.X(new ge4.c(y0Var, dVar, this.f352520g, aVar2));
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        return f0Var;
    }
}

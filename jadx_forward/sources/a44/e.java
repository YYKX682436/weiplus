package a44;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f82786d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f82787e;

    /* renamed from: f, reason: collision with root package name */
    public int f82788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f82789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f82790h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82791i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r45.mr5 mr5Var, int i17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f82789g = mr5Var;
        this.f82790h = i17;
        this.f82791i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        a44.e eVar = new a44.e(this.f82789g, this.f82790h, this.f82791i, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        java.lang.Object mo150x989b7ca4 = ((a44.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f82788f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.mr5 mr5Var = this.f82789g;
            int i18 = this.f82790h;
            java.lang.String str = this.f82791i;
            this.f82786d = mr5Var;
            this.f82787e = str;
            this.f82788f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            a44.c cVar = new a44.c(rVar);
            k64.h.a(mr5Var, i18, str, cVar, (r45.js5) r45.oy.class.newInstance(), true);
            rVar.m(new a44.d(cVar, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$doRequestDownloadInfo$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return obj;
    }
}

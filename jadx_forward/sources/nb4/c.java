package nb4;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f417597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nb4.m f417598f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, nb4.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f417597e = j17;
        this.f417598f = mVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        nb4.c cVar = new nb4.c(this.f417597e, this.f417598f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        cVar.f417596d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f417596d;
        boolean z17 = th6 instanceof ob4.b;
        long j17 = this.f417597e;
        if (z17) {
            ob4.b bVar = (ob4.b) th6;
            bVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrorCode", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$CgiException");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrorCode", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$CgiException");
            java.lang.String message = th6.getMessage();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportGetFeedDetailError", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908();
            c6889x9caa3908.f142050d = 6;
            c6889x9caa3908.p(r26.i0.v("snsObjId:" + ca4.z0.t0(j17) + ";errorMsg:" + message, ",", ";", false, 4, null));
            c6889x9caa3908.f142060n = bVar.f425627d;
            c6889x9caa3908.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetFeedDetailError", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(nb4.m.N6(this.f417598f), th6, "GetSnsObjectDetailCgi error id:" + j17, new java.lang.Object[0]);
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$2");
        return f0Var;
    }
}

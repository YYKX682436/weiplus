package nb4;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nb4.m f417599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f417600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nb4.m mVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f417599d = mVar;
        this.f417600e = j17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        nb4.d dVar = new nb4.d(this.f417599d, this.f417600e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        nb4.m mVar = this.f417599d;
        java.lang.String N6 = nb4.m.N6(mVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion:");
        long j17 = this.f417600e;
        sb6.append(ca4.z0.t0(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(N6, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        java.util.HashSet hashSet = mVar.f417621f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        hashSet.remove(new java.lang.Long(j17));
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$5");
        return f0Var;
    }
}

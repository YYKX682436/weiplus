package nb4;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nb4.m f417617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f417618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nb4.m mVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f417617e = mVar;
        this.f417618f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        nb4.l lVar = new nb4.l(this.f417617e, this.f417618f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        java.lang.Object mo150x989b7ca4 = ((nb4.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f417616d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nb4.m mVar = this.f417617e;
            java.lang.String N6 = nb4.m.N6(mVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateUserCoverFromDetail ");
            long j17 = this.f417618f;
            sb6.append(ca4.z0.t0(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(N6, sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            java.util.HashSet hashSet = mVar.f417621f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            if (hashSet.contains(new java.lang.Long(j17)) || j17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nb4.m.N6(mVar), "request is doing!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                return f0Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRequestSet$p", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            hashSet.add(new java.lang.Long(j17));
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j n17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.n(new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new nb4.k(new nb4.h(new p3325xe03a0797.p3326xc267989b.p3328x30012e.l0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new nb4.b(j17, mVar, null)), new nb4.c(j17, mVar, null)), mVar), mVar), new nb4.d(mVar, j17, null)), p3325xe03a0797.p3326xc267989b.q1.f392103c);
            nb4.e eVar = nb4.e.f417601d;
            this.f417616d = 1;
            if (n17.a(eVar, this) == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1");
        return f0Var;
    }
}

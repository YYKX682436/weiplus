package nb4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417592d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f417594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nb4.m f417595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, nb4.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f417594f = j17;
        this.f417595g = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        nb4.b bVar = new nb4.b(this.f417594f, this.f417595g, interfaceC29045xdcb5ca57);
        bVar.f417593e = obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        return bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        java.lang.Object mo150x989b7ca4 = ((nb4.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        java.lang.Object s17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f417592d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f417593e;
            ob4.a aVar2 = new ob4.a(this.f417594f);
            this.f417593e = kVar;
            this.f417592d = 1;
            s17 = aVar2.s(this);
            if (s17 == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                    throw illegalStateException;
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nb4.m.N6(this.f417595g), "updateUserCoverFromDetail emit resp");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
                return f0Var;
            }
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f417593e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s17 = obj;
        }
        r45.n96 n96Var = (r45.n96) s17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = n96Var.f462719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        if (c19806x4c372b7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908 c6889x9caa3908 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6889x9caa3908();
            java.lang.String f17 = x51.j1.f(c19806x4c372b7.f38990xb6613a90);
            c6889x9caa3908.f142050d = 6;
            c6889x9caa3908.f142052f = c6889x9caa3908.b("UserName", c19806x4c372b7.f38999xf403ecf6, true);
            c6889x9caa3908.p(r26.i0.v("xmlString:" + f17, ",", ";", false, 4, null));
            c6889x9caa3908.f142060n = 0;
            c6889x9caa3908.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportGetFeedDetail", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 Object = n96Var.f462719d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Object, "Object");
        this.f417593e = null;
        this.f417592d = 2;
        if (kVar.mo771x2f8fd3(Object, this) == aVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
            return aVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nb4.m.N6(this.f417595g), "updateUserCoverFromDetail emit resp");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateUserCoverFromDetail$1$1");
        return f0Var2;
    }
}

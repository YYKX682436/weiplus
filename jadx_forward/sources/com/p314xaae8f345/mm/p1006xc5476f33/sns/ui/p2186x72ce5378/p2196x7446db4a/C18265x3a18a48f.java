package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsInfoImproveOnlineRepository;", "Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsBaseRepository;", "Lp94/m0;", "Landroidx/lifecycle/y;", "lifecycle", "<init>", "(Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository */
/* loaded from: classes4.dex */
public final class C18265x3a18a48f extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a.AbstractC18264x2a450473 implements p94.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 f250639e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f250640f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f250641g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f250642h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f250643i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18265x3a18a48f(p012xc85e97e9.p093xedfae76a.y lifecycle) {
        super(lifecycle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        this.f250639e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        this.f250643i = true;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onOtherAddSize respMinSeq:");
        sb6.append(str2);
        sb6.append(" isOnRecentErr:");
        sb6.append(z17);
        sb6.append(" recentErrType:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(d0Var != null ? java.lang.Integer.valueOf(d0Var.k()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", sb6.toString());
        p3325xe03a0797.p3326xc267989b.q qVar = this.f250642h;
        if (qVar != null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(d0Var));
        }
        this.f250642h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // p94.m0
    public void O0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFpSetSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFpSetSize respMinSeq:");
        sb6.append(str);
        sb6.append(" isOnRecentErr:");
        sb6.append(z17);
        sb6.append(" recentErrType:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(d0Var != null ? java.lang.Integer.valueOf(d0Var.k()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", sb6.toString());
        this.f250643i = i17 != 207;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f250640f;
        if (qVar != null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(d0Var != null ? d0Var.k() : 0)));
        }
        this.f250640f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFpSetSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNpAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNpAddSize respMinSeq:");
        sb6.append(str);
        sb6.append(" isOnRecentErr:");
        sb6.append(z17);
        sb6.append(" recentErrType:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(d0Var != null ? java.lang.Integer.valueOf(d0Var.k()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", sb6.toString());
        boolean z18 = false;
        boolean z19 = i17 != 207;
        boolean z27 = (d0Var != null ? d0Var.k() : 0) > 0;
        if (z19 && z27) {
            z18 = true;
        }
        this.f250643i = z18;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f250641g;
        if (qVar != null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(d0Var));
        }
        this.f250641g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNpAddSize", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        zy1.e.f558858a.b(12076, "next_page_count", 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a.AbstractC18264x2a450473
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataOnlineRepository", "onCreate");
        this.f250639e.w(1, "", this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2196x7446db4a.AbstractC18264x2a450473
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataOnlineRepository", "onDestroy");
        this.f250639e.c(this, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", "onError errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f250640f;
        if (qVar != null) {
            if (qVar != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(0));
            }
            this.f250640f = null;
        }
        p3325xe03a0797.p3326xc267989b.q qVar2 = this.f250641g;
        if (qVar2 != null) {
            if (qVar2 != null) {
                qVar2.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
            this.f250641g = null;
        }
        p3325xe03a0797.p3326xc267989b.q qVar3 = this.f250642h;
        if (qVar3 != null) {
            if (qVar3 != null) {
                qVar3.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            }
            this.f250642h = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsInfoImproveOnlineRepository");
    }
}

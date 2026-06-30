package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public abstract class n1 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4, ce4.b {

    /* renamed from: b, reason: collision with root package name */
    public r45.lh0 f251489b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f251490c;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nk0 f251492e;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f251488a = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m1 f251491d = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f251493f = new java.util.HashMap();

    public n1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f251490c = abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        java.util.HashSet hashSet = new java.util.HashSet();
        n(hashSet);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ce4.a aVar = (ce4.a) it.next();
            this.f251493f.put(aVar.getClass().getSimpleName(), aVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        java.util.Iterator it = this.f251493f.entrySet().iterator();
        while (it.hasNext()) {
            ((ce4.a) ((java.util.Map.Entry) it.next()).getValue()).i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        java.util.Iterator it = this.f251493f.entrySet().iterator();
        while (it.hasNext()) {
            ((ce4.a) ((java.util.Map.Entry) it.next()).getValue()).h(bundle);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }

    public ce4.a k(java.lang.Class cls) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("component", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        ce4.a aVar = (ce4.a) this.f251493f.get(cls.getSimpleName());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("component", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        return aVar;
    }

    public boolean l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNeedSetCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNeedSetCommitBlockCallback", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        return false;
    }

    public void m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageGroupInfo", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        bw5.nk0 nk0Var = this.f251492e;
        y7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsVisibilityData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        if (nk0Var != null && nk0Var.b() != bw5.qk0.SNS_VISIBILITY_UNKNOWN) {
            cj0.a aVar = cj0.a.f123386a;
            aVar.l("MicroMsg.UploadPackHelper", nk0Var);
            r45.kj4 kj4Var = y7Var.f246315g;
            kj4Var.T = nk0Var;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = y7Var.f246317i;
            c19806x4c372b7.f38967x15579d0d = 1;
            c19806x4c372b7.f39000xe139598c = nk0Var.b().f113684d;
            int ordinal = nk0Var.b().ordinal();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = y7Var.f246314f;
            if (ordinal == 1) {
                y7Var.f246311c = 0;
                kj4Var.f460276f = 0;
                c19807x593d1720.f39017xbebdef61 = 0;
            } else if (ordinal == 2) {
                y7Var.f246311c = 1;
                kj4Var.f460276f = 1;
                c19807x593d1720.f39017xbebdef61 = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = y7Var.f246316h;
                c17933xe8d1b226.m70460x23d307c3(1);
                c17933xe8d1b226.m70451x2f244d1a();
                c17933xe8d1b226.m70438xfb6d55cb(2);
                c17933xe8d1b226.m70473x58a4cde4();
            } else if (ordinal == 3) {
                y7Var.k(nk0Var);
                if (!nk0Var.f112249i.isEmpty()) {
                    c19806x4c372b7.f38967x15579d0d |= 4096;
                    java.util.LinkedList<r45.du5> k17 = ca4.f1.k(aVar.i(nk0Var));
                    c19806x4c372b7.f38994x3b843533 = k17.size();
                    c19806x4c372b7.f38995x9ed6b7fa = k17;
                }
            } else if (ordinal == 4) {
                y7Var.k(nk0Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsVisibilityData", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageGroupInfo", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }

    public void n(java.util.HashSet hashSet) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerComponent", "com.tencent.mm.plugin.sns.ui.BaseWidget");
    }
}

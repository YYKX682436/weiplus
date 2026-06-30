package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSKefuBoxUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseUI;", "<init>", "()V", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSKefuBoxUI */
/* loaded from: classes12.dex */
public final class ActivityC15605x7489b3b1 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca {

    /* renamed from: q, reason: collision with root package name */
    public int f219515q;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219517s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o2 f219518t;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f219514p = "MicroMsg.FTS.FTSDetailUI";

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashSet f219516r = new java.util.HashSet();

    public ActivityC15605x7489b3b1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f219517s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec>(a0Var) { // from class: com.tencent.mm.plugin.fts.ui.FTSKefuBoxUI$mUpdateFtsSearchDataEvent$1
            {
                this.f39173x3fe91575 = -1317958916;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec c6195x6d6250ec) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec event = c6195x6d6250ec;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15605x7489b3b1 activityC15605x7489b3b1 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15605x7489b3b1.this;
                activityC15605x7489b3b1.d7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC15605x7489b3b1.f219514p, "UpdateFtsSearchDataEvent");
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.f219518t == null) {
            this.f219518t = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o2(w0Var, this.f219516r, this.f219515q);
        }
        return this.f219518t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void X6() {
        this.f219515q = getIntent().getIntExtra("Search_Scene", 0);
        int intExtra = getIntent().getIntExtra("box_search_type", 0);
        if (intExtra == 1) {
            this.f219516r = kz5.p1.d(12291, 12292);
        } else {
            if (intExtra != 2) {
                return;
            }
            this.f219516r = kz5.p1.d(12289, 12290);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570650bc2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c = true;
        this.f219443n = "";
        this.f219440h.m80997xdc5215a6().n("", null);
        this.f219440h.m80997xdc5215a6().g();
        this.f219517s.mo48813x58998cd();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 c6662x813c26a0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0();
        c6662x813c26a0.q(g23.j.f349465c);
        c6662x813c26a0.f140076d = 3L;
        c6662x813c26a0.f140077e = g23.j.f349464b;
        c6662x813c26a0.p(g23.j.f349466d);
        c6662x813c26a0.f140079g = g23.j.f349467e;
        c6662x813c26a0.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + c6662x813c26a0.m());
        this.f219440h.m80997xdc5215a6().m();
        pm0.v.V(500L, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o2 o2Var = this.f219518t;
        if (o2Var != null) {
            o2Var.g();
        }
        this.f219517s.mo48814x2efc64();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).h();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }
}

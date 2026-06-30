package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSDetailUI */
/* loaded from: classes12.dex */
public class ActivityC15604x32f1b30a extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca {

    /* renamed from: p, reason: collision with root package name */
    public int f219508p;

    /* renamed from: q, reason: collision with root package name */
    public int f219509q;

    /* renamed from: r, reason: collision with root package name */
    public long f219510r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219511s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.fts.ui.FTSDetailUI.1
        {
            this.f39173x3fe91575 = -1317958916;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6195x6d6250ec c6195x6d6250ec) {
            if (c6195x6d6250ec == null) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15604x32f1b30a.this.d7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDetailUI", "UpdateFtsSearchDataEvent");
            return false;
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l2 f219512t;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.f219512t == null) {
            this.f219512t = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.l2(w0Var, this.f219509q, this.f219508p, this.f219510r);
        }
        return this.f219512t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public java.lang.String W6() {
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.f(this.f219509q);
        return f17 == null ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8) : f17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void X6() {
        this.f219509q = getIntent().getIntExtra("detail_type", 0);
        this.f219508p = getIntent().getIntExtra("Search_Scene", 0);
        this.f219510r = getIntent().getLongExtra("home_page_search_id", 0L);
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
        java.lang.String stringExtra = getIntent().getStringExtra("detail_query");
        this.f219443n = stringExtra;
        this.f219440h.m80997xdc5215a6().n(stringExtra, null);
        boolean booleanExtra = getIntent().getBooleanExtra("Floating_VoiceText", false);
        this.f219442m = booleanExtra;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = booleanExtra ? "voice" : "";
        objArr[1] = this.f219443n;
        objArr[2] = java.lang.Integer.valueOf(this.f219509q);
        objArr[3] = java.lang.Integer.valueOf(this.f219508p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSDetailUI", "onCreate %s query=%s, searchType=%d, kvScene=%d", objArr);
        d7();
        this.f219442m = false;
        this.f219440h.m80997xdc5215a6().g();
        this.f219511s.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f219512t.g();
        this.f219511s.mo48814x2efc64();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).h();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }
}

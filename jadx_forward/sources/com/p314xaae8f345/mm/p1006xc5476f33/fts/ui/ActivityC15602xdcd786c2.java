package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSConvMessageUI */
/* loaded from: classes12.dex */
public class ActivityC15602xdcd786c2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219497p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219498q;

    /* renamed from: r, reason: collision with root package name */
    public int f219499r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e2 f219500s;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str2, str2, list, oVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.n
    public boolean G0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.f219500s == null) {
            this.f219500s = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e2(w0Var, this.f219497p, this.f219499r);
        }
        return this.f219500s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public java.lang.String W6() {
        return getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574482ie2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void X6() {
        this.f219497p = getIntent().getStringExtra("key_conv");
        this.f219498q = getIntent().getStringExtra("key_query");
        this.f219499r = getIntent().getIntExtra("Search_Scene", 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbx;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.g2 g2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.g2(this, null);
        g2Var.f219597d = o13.n.d(this.f219497p);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(g2Var);
        java.lang.String str = this.f219498q;
        this.f219443n = str;
        this.f219440h.m80997xdc5215a6().n(str, arrayList);
        d7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f219500s.g();
        super.onDestroy();
    }
}

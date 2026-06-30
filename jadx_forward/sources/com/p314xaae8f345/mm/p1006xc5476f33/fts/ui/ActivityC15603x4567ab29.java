package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* renamed from: com.tencent.mm.plugin.fts.ui.FTSConvTalkerMessageUI */
/* loaded from: classes12.dex */
public class ActivityC15603x4567ab29 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219501p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219502q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219503r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219504s;

    /* renamed from: t, reason: collision with root package name */
    public int f219505t;

    /* renamed from: u, reason: collision with root package name */
    public int f219506u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.h2 f219507v;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str2, str2, list, oVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.f219507v == null) {
            this.f219507v = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.h2(this, this.f219503r, this.f219501p, this.f219502q, this.f219506u, this.f219505t);
        }
        return this.f219507v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void X6() {
        this.f219502q = getIntent().getStringExtra("key_conv");
        this.f219503r = getIntent().getStringExtra("key_talker");
        this.f219504s = getIntent().getStringExtra("key_query");
        this.f219501p = getIntent().getStringExtra("key_talker_query");
        this.f219505t = getIntent().getIntExtra("detail_type", 1);
        this.f219506u = getIntent().getIntExtra("Search_Scene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSConvTalkerMessageUI", "initSearchData query=%s talker=%s conversation=%s showType=%d", this.f219504s, this.f219503r, this.f219502q, java.lang.Integer.valueOf(this.f219505t));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bd6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j2(this, null);
        j2Var.f219615d = this.f219501p;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j2 j2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j2(this, null);
        j2Var2.f219615d = ">";
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j2 j2Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j2(this, null);
        j2Var3.f219615d = o13.n.d(this.f219502q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f219505t == 2) {
            arrayList.add(j2Var);
            arrayList.add(j2Var2);
            arrayList.add(j2Var3);
        } else {
            arrayList.add(j2Var3);
            arrayList.add(j2Var2);
            arrayList.add(j2Var);
        }
        java.lang.String str = this.f219504s;
        this.f219443n = str;
        this.f219440h.m80997xdc5215a6().n(str, arrayList);
        d7();
    }
}

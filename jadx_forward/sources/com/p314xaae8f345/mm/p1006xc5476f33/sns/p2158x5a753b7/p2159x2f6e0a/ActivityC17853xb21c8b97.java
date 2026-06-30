package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2159x2f6e0a;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI */
/* loaded from: classes4.dex */
public final class ActivityC17853xb21c8b97 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b f245523d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570230a35;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWindowStyle", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        m78583x85ccfe01(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ai3.d.f86640a = true;
        getWindow().setFormat(-3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWindowStyle", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SELECT_OBJECT");
        int intExtra = getIntent().getIntExtra("SELECT_TAB_TYPE", 0);
        int intExtra2 = getIntent().getIntExtra("KEY_ENTER_SOURCE", 0);
        if (byteArrayExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCoverFinderPreviewUI", "finderObj bytes == null");
            finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.mo11468x92b714fd(byteArrayExtra);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        int i17 = m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (first = m76962x74cd162e.getFirst()) != null && first.m76613x7f025288() == 4 ? 3 : 4;
        aa4.a aVar = aa4.a.f84168a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsBackViewByType$default", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b a17 = aVar.a(this, i17, 1, i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.aa_));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsBackViewByType$default", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
        this.f245523d = a17;
        ((android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.fwq)).addView(this.f245523d, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.InterfaceC17852x70c51412 interfaceC17852x70c51412 = this.f245523d;
        v94.f fVar = interfaceC17852x70c51412 instanceof v94.f ? (v94.f) interfaceC17852x70c51412 : null;
        if (fVar != null) {
            fVar.mo62928x551c30b(c19792x256d2725);
        }
        findViewById(com.p314xaae8f345.mm.R.id.ckw).setOnClickListener(new x94.a(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ckx);
        findViewById.setOnClickListener(new x94.b(this, c19792x256d2725, i17, intExtra2, intExtra));
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a, this, findViewById, "friend_circle_cover_preview", kz5.b1.e(new jz5.l("feed_id", pm0.v.u(c19792x256d2725.m76784x5db1b11()))), false, null, 48, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b abstractC17851x632b993b = this.f245523d;
        if (abstractC17851x632b993b != null) {
            abstractC17851x632b993b.mo62929xac79a11b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b abstractC17851x632b993b = this.f245523d;
        if (abstractC17851x632b993b != null) {
            abstractC17851x632b993b.mo62931xb01dfb57();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b abstractC17851x632b993b = this.f245523d;
        if (abstractC17851x632b993b != null) {
            abstractC17851x632b993b.mo62932x57429eec();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }
}

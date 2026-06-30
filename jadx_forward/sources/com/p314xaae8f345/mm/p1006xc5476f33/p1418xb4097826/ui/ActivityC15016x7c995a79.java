package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlockListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlockListUI */
/* loaded from: classes10.dex */
public final class ActivityC15016x7c995a79 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f210061z = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f210062t = "Finder.FinderBlockListUI";

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter f210063u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 f210064v;

    /* renamed from: w, reason: collision with root package name */
    public int f210065w;

    /* renamed from: x, reason: collision with root package name */
    public long f210066x;

    /* renamed from: y, reason: collision with root package name */
    public int f210067y;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aed;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 ua0Var;
        this.f210065w = getIntent().getIntExtra("BLOCK_LIST_TYPE", 0);
        this.f210066x = getIntent().getLongExtra("FEED_ID", 0L);
        int intExtra = getIntent().getIntExtra("FROM_SOURCE", 0);
        this.f210067y = intExtra;
        int i17 = this.f210065w;
        if (i17 != 1) {
            ua0Var = i17 != 2 ? i17 != 3 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.za0();
        } else {
            hc2.v0.c(this, iy1.c.FinderDontShowHisLikesPage, "page_in", false, kz5.c1.k(new jz5.l("dont_show_his_likes_page_source_page", java.lang.Integer.valueOf(intExtra)), new jz5.l("feed_id", pm0.v.u(this.f210066x))), 4, null);
            ua0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ua0();
        }
        this.f210064v = ua0Var;
        if (ua0Var == null) {
            finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var = this.f210064v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uj0Var);
        mo56583xbf7c1df6(uj0Var.i());
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.v1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var2 = this.f210064v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uj0Var2);
        this.f210063u = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter(uj0Var2);
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78513xc2a54588, "getContentView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f210063u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(blockListPresenter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback(this, m78513xc2a54588, blockListPresenter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter2 = this.f210063u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(blockListPresenter2);
        blockListPresenter2.f204099e = blockListViewCallback;
        blockListViewCallback.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var3 = this.f210064v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uj0Var3);
        if (uj0Var3.a()) {
            m78484x84f07bce(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.eol), com.p314xaae8f345.mm.R.raw.f79999x1807af9f, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            java.util.List<java.lang.String> O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(intent != null ? intent.getStringExtra("Select_Contact") : null, ",");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O1);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(O1, 10));
            for (java.lang.String str : O1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                c19782x23db1cfa.m76240x66bc2758(str);
                arrayList.add(c19782x23db1cfa);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f210063u;
            if (blockListPresenter != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String m76197x6c03c64c = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next()).m76197x6c03c64c();
                    if (m76197x6c03c64c == null) {
                        m76197x6c03c64c = "";
                    }
                    arrayList2.add(m76197x6c03c64c);
                }
                blockListPresenter.f204098d.b(arrayList2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f210063u;
        if (blockListPresenter != null) {
            blockListPresenter.mo979x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f210063u;
        if (blockListPresenter != null) {
            blockListPresenter.f();
        }
    }
}

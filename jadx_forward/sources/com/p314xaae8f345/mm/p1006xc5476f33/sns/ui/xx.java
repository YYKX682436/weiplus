package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f253124d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx f253125e;

    public xx(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar) {
        this.f253125e = zxVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar = this.f253125e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getCount() > zxVar.f253253a) {
            int top = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.b(zxVar).getTop();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            zxVar.f253257e = top;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            int c17 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar) - 0) - zxVar.f253254b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getBottom();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getTop();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar);
            if (c17 == this.f253124d) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).setSelectionFromTop(zxVar.f253253a + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getHeaderViewsCount(), c17);
                this.f253124d = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                zxVar.f253259g = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                int i17 = zxVar.f253259g;
                zxVar.f253259g = i17 - 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                if (i17 > 0) {
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(this, 100L);
                    this.f253124d = c17;
                } else {
                    this.f253124d = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    zxVar.f253259g = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$2");
    }
}

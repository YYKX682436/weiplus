package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class wx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx f252999d;

    public wx(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar) {
        this.f252999d = zxVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar = this.f252999d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getCount() > zxVar.f253253a) {
            int top = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.b(zxVar).getTop();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.b(zxVar).getHeight();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            int i17 = zxVar.f253259g;
            zxVar.f253259g = i17 - 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            if (i17 > 0) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar) != top || top > zxVar.f253256d - 200 || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getBottom() > (zxVar.f253256d - com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.b(zxVar).getHeight()) + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74084xdad07d9a) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    int i18 = zxVar.f253259g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(this, i18 != 0 ? 10 : 200);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            zxVar.f253257e = top;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            int c17 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar) + 0) - zxVar.f253254b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getBottom();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getTop();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.c(zxVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).setSelectionFromTop(zxVar.f253253a + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx.a(zxVar).getHeaderViewsCount(), c17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$1");
    }
}

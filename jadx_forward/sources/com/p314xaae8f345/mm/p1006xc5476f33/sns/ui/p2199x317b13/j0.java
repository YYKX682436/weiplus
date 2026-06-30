package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class j0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 f250888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f250889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 f250891d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17989x79511098 c17989x79511098, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, android.view.View view) {
        this.f250891d = m0Var;
        this.f250888a = c17989x79511098;
        this.f250889b = c17903x3b438f4;
        this.f250890c = view;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 c17972xe84284f4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) this.f250888a.findViewById(com.p314xaae8f345.mm.R.id.jdt);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0 m0Var = this.f250891d;
        m0Var.f250914r = c17972xe84284f4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0.F(m0Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0.F(m0Var).setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0.F(m0Var).mo69290xd44890a8(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = this.f250889b;
            float o17 = za4.z0.o(c17903x3b438f4.f38199x6283944c, 1, c17903x3b438f4.f38149xfe213437, c17903x3b438f4.f38150x735f755d);
            float o18 = za4.z0.o(c17903x3b438f4.f38195xd41ffb61, 1, c17903x3b438f4.f38149xfe213437, c17903x3b438f4.f38150x735f755d);
            float o19 = za4.z0.o(c17903x3b438f4.f38197xee5cf45, 1, c17903x3b438f4.f38149xfe213437, c17903x3b438f4.f38150x735f755d);
            float o27 = za4.z0.o(c17903x3b438f4.f38196xb2e13222, 1, c17903x3b438f4.f38149xfe213437, c17903x3b438f4.f38150x735f755d);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((int) o17, (int) o18);
            android.view.View view = this.f250890c;
            layoutParams.setMargins((int) ((view.getRight() - o19) - o17), (int) ((view.getBottom() - o27) - o18), 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.m0.F(m0Var).setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
    }
}

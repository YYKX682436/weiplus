package wc4;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7 f526056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f526058f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7 c18263x5731aba7, java.lang.String str, int i17) {
        this.f526056d = c18263x5731aba7;
        this.f526057e = str;
        this.f526058f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$updateProgress$1");
        wc4.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7.f250631i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$loadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7 c18263x5731aba7 = this.f526056d;
        c18263x5731aba7.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$loadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        wc4.a aVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7.f250631i;
        java.lang.String str = this.f526057e;
        int i17 = this.f526058f;
        wc4.a.a(aVar2, str, i17);
        if (i17 >= 100) {
            c18263x5731aba7.f(str, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$updateProgress$1");
            return;
        }
        dy1.a.a(c18263x5731aba7, wc4.g.f526055a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTask$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        wu5.c cVar = c18263x5731aba7.f250636g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTask$p", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        if (cVar != null) {
            cVar.cancel(false);
        }
        c18263x5731aba7.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7.a(c18263x5731aba7).setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7.b(c18263x5731aba7).setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7.a(c18263x5731aba7).m82113x3ae760af(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2193x317b13.p2194xb734e28d.p2195x373aa5.C18263x5731aba7.d(c18263x5731aba7).setText(i65.a.r(c18263x5731aba7.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ojh));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView$updateProgress$1");
    }
}

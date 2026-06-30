package sd4;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f488227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488228g;

    public e(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3) {
        this.f488225d = str;
        this.f488226e = str2;
        this.f488227f = j17;
        this.f488228g = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$markEndTimeMs$1");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6742x51f737b c6742x51f737b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6742x51f737b();
        int i18 = 1;
        c6742x51f737b.f140745d = c6742x51f737b.b("MethodName", this.f488225d + '#' + this.f488226e, true);
        c6742x51f737b.f140746e = (int) this.f488227f;
        c6742x51f737b.f140749h = c6742x51f737b.b("MethodTrace", this.f488228g, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_ASM_INT_SYNC, 0);
        if (r17 != 1) {
            if (r17 != 2) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_asm_enable, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
                i17 = fj6;
                c6742x51f737b.f140750i = i17;
                c6742x51f737b.k();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$markEndTimeMs$1");
            }
            i18 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableAsmImprove", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        i17 = i18;
        c6742x51f737b.f140750i = i17;
        c6742x51f737b.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate$markEndTimeMs$1");
    }
}

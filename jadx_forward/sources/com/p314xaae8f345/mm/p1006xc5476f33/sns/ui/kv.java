package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class kv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 f251185e;

    public kv(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17, java.lang.String str) {
        this.f251185e = activityC18141xfedff17;
        this.f251184d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$7");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.V;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 activityC18141xfedff17 = this.f251185e;
        activityC18141xfedff17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupRptInfo", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d y17 = s0Var.y();
        y17.f142304d = y17.b("OwnerUsername", activityC18141xfedff17.f249132h, true);
        if (activityC18141xfedff17.f249134m) {
            s0Var.y().f142306f = 1L;
        } else {
            s0Var.y().f142306f = 0L;
        }
        s0Var.y().f142305e = activityC18141xfedff17.f249137p;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d y18 = s0Var.y();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
        java.lang.String str = activityC18141xfedff17.f249132h;
        Ej.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = Ej.J0(str);
        if (J0.f67954xfa287b93 == 0 && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f67938x2259bc65) || J0.f67938x2259bc65.equals("0"))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBgExist", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            z17 = true;
        }
        y18.f142320t = z17 ? 1L : 0L;
        s0Var.y().f142321u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f251184d) ? 0L : 1L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupRptInfo", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsUserUI$7");
    }
}

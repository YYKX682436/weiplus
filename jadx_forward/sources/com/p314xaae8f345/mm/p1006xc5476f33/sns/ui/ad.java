package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class ad implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f249284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f249285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bd f249286f;

    public ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bd bdVar, int i17, int i18) {
        this.f249286f = bdVar;
        this.f249284d = i17;
        this.f249285e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play time ");
        int i17 = this.f249284d;
        sb6.append(i17);
        sb6.append(" video time ");
        int i18 = this.f249285e;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bd bdVar = this.f249286f;
        if (i18 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b = bdVar.f249442d;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b.f248299h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            activityC18008xe14e452b.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b2 = bdVar.f249442d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
            activityC18008xe14e452b2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        }
        if (bdVar.f249442d.f248301e.mo69281xdf1112ec() != i18) {
            bdVar.f249442d.f248301e.mo61298xa7077af8(i18);
        }
        bdVar.f249442d.f248301e.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$4$1");
    }
}

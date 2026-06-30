package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class pm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 f251781d;

    public pm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 activityC18080xc668b4d6) {
        this.f251781d = activityC18080xc668b4d6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$2");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 activityC18080xc668b4d6 = this.f251781d;
            activityC18080xc668b4d6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetCursorForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            activityC18080xc668b4d6.f248801e.q();
            activityC18080xc668b4d6.Y = true;
            activityC18080xc668b4d6.n7();
            activityC18080xc668b4d6.m78501x43e00957(false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetCursorForClearMsg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMsgUIWithRelevance", "onActivityResult error: " + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$2");
    }
}

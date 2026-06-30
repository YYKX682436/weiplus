package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class f8 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p0 f249850g;

    /* renamed from: a, reason: collision with root package name */
    public long f249844a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f249845b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f249846c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f249847d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f249848e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f249849f = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashSet f249851h = new java.util.HashSet();

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanResume", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        this.f249844a = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanResume", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
    }

    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        long j17 = this.f249844a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResumeSnsControl", "resume time %d", java.lang.Long.valueOf(elapsedRealtime));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s, unreadBottomSeq:%s, unreadTopSeq:%s, timeFirstId:%s, upLimitSeq:%s, isPullDownMode:%s", java.lang.Long.valueOf(this.f249844a), "", "", java.lang.Long.valueOf(this.f249848e), java.lang.Integer.valueOf(this.f249846c), java.lang.Integer.valueOf(this.f249847d), "", "", java.lang.Long.valueOf(this.f249849f), this.f249845b, java.lang.Boolean.FALSE);
        this.f249851h = new java.util.HashSet();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").getBoolean("SnsMMKVDeleteTable", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResumeSnsControl", "already delete table, need refresh");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        if (elapsedRealtime >= 180000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", java.lang.Long.valueOf(this.f249848e));
        if (this.f249848e == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        if (this.f249846c == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().l(68377, null))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj().u(this.f249848e, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        return true;
    }
}

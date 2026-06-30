package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f251284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18364xd250554c f251285e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18364xd250554c c18364xd250554c, long j17) {
        this.f251285e = c18364xd250554c;
        this.f251284d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18364xd250554c c18364xd250554c = this.f251285e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.r(c18364xd250554c.f251278d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TimelineClickListener", "detailItemBackAnimation==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.r(c18364xd250554c.f251278d).a(this.f251284d);
        wb4.i r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.r(c18364xd250554c.f251278d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.a1(this);
        r17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemBackAnimation");
        r17.f525945a = a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemBackAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$5$2");
    }
}

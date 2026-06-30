package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class hm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.im f250054d;

    public hm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.im imVar) {
        this.f250054d = imVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.im imVar = this.f250054d;
        Aj.mo51732xbf274172(imVar.f250154d, false, new java.lang.String[0]);
        r45.k76 k76Var = new r45.k76();
        try {
            k76Var.mo11468x92b714fd(imVar.f250159i.f67461x5e5c2922);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.l(imVar.f250154d, k76Var.f459991d);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsMsgUI", e17, "bless parse acion error", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5$2");
    }
}

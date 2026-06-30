package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f251389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18363xd250554b f251390e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18363xd250554b c18363xd250554b, long j17) {
        this.f251390e = c18363xd250554b;
        this.f251389d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18363xd250554b c18363xd250554b = this.f251390e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.p(c18363xd250554b.f251277d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TimelineClickListener", "detailItemClickAnimation==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.p(c18363xd250554b.f251277d).a(this.f251389d);
        wb4.j p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.p(c18363xd250554b.f251277d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.u0(this);
        p17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemClickAnimation");
        p17.f525946a = u0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.detail.BaseDetailItemClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$2");
    }
}

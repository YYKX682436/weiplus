package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f251385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18363xd250554b f251386e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18363xd250554b c18363xd250554b, long j17) {
        this.f251386e = c18363xd250554b;
        this.f251385d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.C18363xd250554b c18363xd250554b = this.f251386e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.o(c18363xd250554b.f251277d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TimelineClickListener", "timelineClickAnimation==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.o(c18363xd250554b.f251277d).a(this.f251385d);
        xb4.y o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.o(c18363xd250554b.f251277d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.s0(this);
        o17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineClickAnimation");
        o17.f534534b = s0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimationListener", "com.tencent.mm.plugin.sns.ui.animation.timeline.BaseTimelineClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4$1");
    }
}

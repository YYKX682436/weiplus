package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 f246245d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var) {
        this.f246245d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var = this.f246245d;
        boolean z17 = i1Var.f245792h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LazyerImageLoader2", "[%s]already start,ignore start event2", "[image-flow]");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).removeLast();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] LazyerImageLoader2 start key:%s size:%s", "[image-flow]", a2Var.g(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.a2.e(a2Var), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.d(i1Var).size()));
            a2Var.d("");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$6");
    }
}

package n74;

/* loaded from: classes4.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416966e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.util.List list, int i17) {
        this.f416965d = c17933xe8d1b226;
        this.f416966e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n74.u0 u0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$preload$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f416965d;
        java.util.List list = this.f416966e;
        try {
            u0Var = n74.u0.f416970a;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWeappPreRenderHelper", th6);
        }
        if (n74.u0.a(u0Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$preload$1");
        } else {
            n74.u0.b(u0Var, c17933xe8d1b226, list, 1045);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$preload$1");
        }
    }
}

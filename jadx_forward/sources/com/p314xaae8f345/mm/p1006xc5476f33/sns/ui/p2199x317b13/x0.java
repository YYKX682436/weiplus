package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class x0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f250961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f250962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 f250963c;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, long j17) {
        this.f250963c = z0Var;
        this.f250961a = c17933xe8d1b226;
        this.f250962b = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.l
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
        long j18 = this.f250962b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f250961a;
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70377x3172ed()) {
            ca4.z0.t0(j18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var = this.f250963c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = z0Var.f250784h;
        if (bsVar == null || (l1Var = bsVar.f249569b) == null || (b1Var = l1Var.f251235c) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
            return;
        }
        b1Var.s(c17933xe8d1b226.f68891x29d1292e);
        z0Var.f250784h.f249569b.f251235c.v(c17933xe8d1b226.f68891x29d1292e, j17 * 1000);
        if (!z0Var.f250784h.f249569b.f251235c.m(j18)) {
            double mo10220x36bbd779 = sVar.f243982e == -1 ? 0.0d : ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10220x36bbd779(sVar.f243982e);
            i64.b1 b1Var2 = z0Var.f250784h.f249569b.f251235c;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            b1Var2.w(j18, android.os.SystemClock.elapsedRealtime());
            z0Var.f250784h.f249569b.f251235c.x(j18, (int) mo10220x36bbd779, true);
            z0Var.f250784h.f249569b.f251235c.d(j18, j18);
            ca4.z0.t0(j18);
        }
        ca4.z0.t0(j18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
    }
}

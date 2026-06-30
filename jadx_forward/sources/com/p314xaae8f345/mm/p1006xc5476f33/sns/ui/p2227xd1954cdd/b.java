package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class b extends xm3.t0 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe mvvmList, in5.s itemConvertFactory, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 onUpdateCallback) {
        super(mvvmList, itemConvertFactory, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onUpdateCallback, "onUpdateCallback");
        this.K = onUpdateCallback;
    }

    @Override // xm3.t0, xm3.m0
    public void k(xm3.o0 pendingData) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.wsfold.SnsFoldAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingData, "pendingData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.g2 g2Var = this.K;
        g2Var.a3(pendingData);
        super.k(pendingData);
        g2Var.B2(pendingData);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateAdapter", "com.tencent.mm.plugin.sns.ui.wsfold.SnsFoldAdapter");
    }
}

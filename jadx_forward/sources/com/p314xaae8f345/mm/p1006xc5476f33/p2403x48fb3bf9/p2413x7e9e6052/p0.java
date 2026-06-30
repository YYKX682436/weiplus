package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f264868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j17) {
        super(0);
        this.f264868d = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0.f264886b;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo120194xc77ccada();
            c22633x83752a59.mo52095x5cd39ffa();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.u0.f264886b = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cleanPreload cost:");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis() - this.f264868d);
        sb6.append(" ms");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewPreloadRenderProcessHelper", sb6.toString());
        return jz5.f0.f384359a;
    }
}

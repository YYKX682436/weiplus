package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public final class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 f289238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f289239h;

    public g8(com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n2 n2Var, int i17) {
        this.f289235d = l4Var;
        this.f289236e = str;
        this.f289237f = str2;
        this.f289238g = n2Var;
        this.f289239h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.util.Map a17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.k0.a(this.f289236e, this.f289237f, this.f289235d.d1());
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.f8(this.f289238g, this.f289236e, this.f289239h, a17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenImKefuConversationAdapter", "bindReportForListView ex %s", e17.getMessage());
        }
    }
}

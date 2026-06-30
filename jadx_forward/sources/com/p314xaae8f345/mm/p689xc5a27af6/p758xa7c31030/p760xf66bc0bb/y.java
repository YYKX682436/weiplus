package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class y implements com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.n, yz5.l {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x f149253h = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.ArrayList f149254i = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f149255d;

    /* renamed from: e, reason: collision with root package name */
    public final long f149256e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f149257f;

    /* renamed from: g, reason: collision with root package name */
    public volatile wu5.c f149258g;

    static {
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.v(), intentFilter);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.BgScheduler", th6, "", new java.lang.Object[0]);
        }
    }

    public y(boolean z17, long j17) {
        this.f149255d = z17;
        this.f149256e = j17;
        this.f149257f = z17;
        f149254i.add(this);
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.n
    public boolean R0() {
        return this.f149255d ^ this.f149257f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f149257f = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f384359a;
    }
}

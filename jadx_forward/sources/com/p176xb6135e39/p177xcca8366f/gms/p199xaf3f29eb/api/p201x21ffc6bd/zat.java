package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zat implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener {
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api zaa;
    private final boolean zab;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zau zac;

    public zat(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, boolean z17) {
        this.zaa = api;
        this.zab = z17;
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zau zab() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.zac;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnected */
    public final void mo17884xdba42fea(android.os.Bundle bundle) {
        zab().mo17884xdba42fea(bundle);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae
    /* renamed from: onConnectionFailed */
    public final void mo17932xce9394ba(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        zab().zaa(c1700xff0c58bb, this.zaa, this.zab);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70
    /* renamed from: onConnectionSuspended */
    public final void mo17885x4511603e(int i17) {
        zab().mo17885x4511603e(i17);
    }

    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zau zauVar) {
        this.zac = zauVar;
    }
}

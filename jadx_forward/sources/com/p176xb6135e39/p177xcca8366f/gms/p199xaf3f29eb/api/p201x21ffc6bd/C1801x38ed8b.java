package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zaae */
/* loaded from: classes13.dex */
public final class C1801x38ed8b extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap {
    private final x.d zad;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c zae;

    public C1801x38ed8b(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc) {
        super(interfaceC1780x4bb63ba, c1705x2db7dcfc);
        this.zad = new x.d(0);
        this.zae = c1775x7d99476c;
        this.f5910xb6d8aaed.mo17915xbba9cc06("ConnectionlessLifecycleHelper", this);
    }

    public static void zad(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c c1775x7d99476c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1768x75462a05 c1768x75462a05) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17903x197d1fc6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af.m17903x197d1fc6(activity);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b c1801x38ed8b = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b) m17903x197d1fc6.mo17916x3e046fa5("ConnectionlessLifecycleHelper", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b.class);
        if (c1801x38ed8b == null) {
            c1801x38ed8b = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1801x38ed8b(m17903x197d1fc6, c1775x7d99476c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b());
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1768x75462a05, "ApiKey cannot be null");
        c1801x38ed8b.zad.add(c1768x75462a05);
        c1775x7d99476c.zaA(c1801x38ed8b);
    }

    private final void zae() {
        if (this.zad.isEmpty()) {
            return;
        }
        this.zae.zaA(this);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onResume */
    public final void mo17911x57429eec() {
        super.mo17911x57429eec();
        zae();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStart */
    public final void mo17913xb05099c3() {
        super.mo17913xb05099c3();
        zae();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStop */
    public final void mo17914xc39f8281() {
        super.mo17914xc39f8281();
        this.zae.zaB(this);
    }

    public final x.d zaa() {
        return this.zad;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap
    public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        this.zae.zax(c1700xff0c58bb, i17);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap
    public final void zac() {
        this.zae.zay();
    }
}

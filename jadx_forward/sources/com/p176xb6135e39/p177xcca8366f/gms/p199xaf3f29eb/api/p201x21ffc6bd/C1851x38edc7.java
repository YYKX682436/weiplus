package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zacc */
/* loaded from: classes13.dex */
public final class C1851x38edc7 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap {
    private com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc zad;

    private C1851x38edc7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba) {
        super(interfaceC1780x4bb63ba, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b());
        this.zad = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
        this.f5910xb6d8aaed.mo17915xbba9cc06("GmsAvailabilityHelper", this);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7 zaa(android.app.Activity activity) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17903x197d1fc6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af.m17903x197d1fc6(activity);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7 c1851x38edc7 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7) m17903x197d1fc6.mo17916x3e046fa5("GmsAvailabilityHelper", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7.class);
        if (c1851x38edc7 == null) {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1851x38edc7(m17903x197d1fc6);
        }
        if (c1851x38edc7.zad.m19602xfb859dfb().mo19598xacfcd883()) {
            c1851x38edc7.zad = new com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc();
        }
        return c1851x38edc7;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onDestroy */
    public final void mo17910xac79a11b() {
        super.mo17910xac79a11b();
        this.zad.m19605xc5fa5768(new java.util.concurrent.CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap
    public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        java.lang.String m17601xa8aa7f55 = c1700xff0c58bb.m17601xa8aa7f55();
        if (m17601xa8aa7f55 == null) {
            m17601xa8aa7f55 = "Error connecting to Google Play services";
        }
        this.zad.m19603xb411020d(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(c1700xff0c58bb, m17601xa8aa7f55, c1700xff0c58bb.m17600x130a215f())));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap
    public final void zac() {
        android.app.Activity mo17917x6cd4bbe3 = this.f5910xb6d8aaed.mo17917x6cd4bbe3();
        if (mo17917x6cd4bbe3 == null) {
            this.zad.m19605xc5fa5768(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8)));
            return;
        }
        int mo17630x402556f4 = this.zac.mo17630x402556f4(mo17917x6cd4bbe3);
        if (mo17630x402556f4 == 0) {
            this.zad.m19606xd9193fa4(null);
        } else {
            if (this.zad.m19602xfb859dfb().mo19598xacfcd883()) {
                return;
            }
            zah(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(mo17630x402556f4, null), 0);
        }
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 zad() {
        return this.zad.m19602xfb859dfb();
    }
}

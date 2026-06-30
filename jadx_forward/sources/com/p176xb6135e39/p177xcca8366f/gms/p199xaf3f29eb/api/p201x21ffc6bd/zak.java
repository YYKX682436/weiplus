package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* loaded from: classes13.dex */
public final class zak extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap {
    private final android.util.SparseArray zad;

    private zak(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba) {
        super(interfaceC1780x4bb63ba, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b());
        this.zad = new android.util.SparseArray();
        this.f5910xb6d8aaed.mo17915xbba9cc06("AutoManageHelper", this);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1778x4647479 c1778x4647479) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba m17905x197d1fc6 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af.m17905x197d1fc6(c1778x4647479);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak zakVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak) m17905x197d1fc6.mo17916x3e046fa5("AutoManageHelper", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak.class);
        return zakVar != null ? zakVar : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zak(m17905x197d1fc6);
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zai(int i17) {
        if (this.zad.size() <= i17) {
            return null;
        }
        android.util.SparseArray sparseArray = this.zad;
        return (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj) sparseArray.get(sparseArray.keyAt(i17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: dump */
    public final void mo17906x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        for (int i17 = 0; i17 < this.zad.size(); i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zai = zai(i17);
            if (zai != null) {
                printWriter.append((java.lang.CharSequence) str).append("GoogleApiClient #").print(zai.zaa);
                printWriter.println(":");
                zai.zab.mo17775x2f39f4(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStart */
    public final void mo17913xb05099c3() {
        super.mo17913xb05099c3();
        java.lang.String.valueOf(this.zad);
        if (this.zab.get() == null) {
            for (int i17 = 0; i17 < this.zad.size(); i17++) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zai = zai(i17);
                if (zai != null) {
                    zai.zab.mo17772x38b478ea();
                }
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1779x5cd4a1af
    /* renamed from: onStop */
    public final void mo17914xc39f8281() {
        super.mo17914xc39f8281();
        for (int i17 = 0; i17 < this.zad.size(); i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zai = zai(i17);
            if (zai != null) {
                zai.zab.mo17774x1f9d589c();
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap
    public final void zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, int i17) {
        if (i17 < 0) {
            android.util.Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new java.lang.Exception());
            return;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zajVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj) this.zad.get(i17);
        if (zajVar != null) {
            zae(i17);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.mo17932xce9394ba(c1700xff0c58bb);
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zap
    public final void zac() {
        for (int i17 = 0; i17 < this.zad.size(); i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zai = zai(i17);
            if (zai != null) {
                zai.zab.mo17772x38b478ea();
            }
        }
    }

    public final void zad(int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "GoogleApiClient instance cannot be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(this.zad.indexOfKey(i17) < 0, "Already managing a GoogleApiClient with id " + i17);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam zamVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zam) this.zab.get();
        java.lang.String.valueOf(zamVar);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zajVar = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj(this, i17, abstractC1748xd28d482c, onConnectionFailedListener);
        abstractC1748xd28d482c.mo17792x6b067852(zajVar);
        this.zad.put(i17, zajVar);
        if (this.zaa && zamVar == null) {
            "connecting ".concat(abstractC1748xd28d482c.toString());
            abstractC1748xd28d482c.mo17772x38b478ea();
        }
    }

    public final void zae(int i17) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj zajVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.zaj) this.zad.get(i17);
        this.zad.remove(i17);
        if (zajVar != null) {
            zajVar.zab.mo17796x6d3de2eb(zajVar);
            zajVar.zab.mo17774x1f9d589c();
        }
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zaaw */
/* loaded from: classes13.dex */
public final class C1819x38ed9d implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae zaa;
    private final java.util.concurrent.locks.Lock zab;
    private final android.content.Context zac;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a zad;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zae;
    private int zaf;
    private int zah;
    private com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b zao;
    private boolean zap;
    private boolean zaq;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zar;
    private final java.util.Map zas;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e zat;
    private int zag = 0;
    private final android.os.Bundle zai = new android.os.Bundle();
    private final java.util.Set zaj = new java.util.HashSet();
    private final java.util.ArrayList zau = new java.util.ArrayList();

    public C1819x38ed9d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, java.util.Map map, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a c1706xe937257a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e, java.util.concurrent.locks.Lock lock, android.content.Context context) {
        this.zaa = c1831x38edae;
        this.zar = c1904x2257e52e;
        this.zas = map;
        this.zad = c1706xe937257a;
        this.zat = abstractC1731x2722202e;
        this.zab = lock;
        this.zac = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaA() {
        this.zam = false;
        this.zaa.zag.zad = java.util.Collections.emptySet();
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28 c1733x6b09fe28 : this.zaj) {
            if (!this.zaa.zab.containsKey(c1733x6b09fe28)) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae = this.zaa;
                c1831x38edae.zab.put(c1733x6b09fe28, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(17, null));
            }
        }
    }

    private final void zaB(boolean z17) {
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (zaeVar.mo17718x23b734ff() && z17) {
                zaeVar.zaa();
            }
            zaeVar.mo17708x1f9d589c();
            this.zao = null;
        }
    }

    private final void zaC() {
        this.zaa.zai();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1832x38edaf.zaa().execute(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.RunnableC1807x38ed91(this));
        com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (this.zap) {
                zaeVar.zac((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zao), this.zaq);
            }
            zaB(false);
        }
        java.util.Iterator it = this.zaa.zab.keySet().iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) this.zaa.zaa.get((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28) it.next()))).mo17708x1f9d589c();
        }
        this.zaa.zah.zab(this.zai.isEmpty() ? null : this.zai);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        zaz();
        zaB(!c1700xff0c58bb.m17603xc9b9eee6());
        this.zaa.zak(c1700xff0c58bb);
        this.zaa.zah.zaa(c1700xff0c58bb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, boolean z17) {
        int m17706x3662b71a = api.zac().m17706x3662b71a();
        if ((!z17 || c1700xff0c58bb.m17603xc9b9eee6() || this.zad.m17644x91cd42da(c1700xff0c58bb.m17600x130a215f()) != null) && (this.zae == null || m17706x3662b71a < this.zaf)) {
            this.zae = c1700xff0c58bb;
            this.zaf = m17706x3662b71a;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae = this.zaa;
        c1831x38edae.zab.put(api.zab(), c1700xff0c58bb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaF() {
        if (this.zah != 0) {
            return;
        }
        if (!this.zam || this.zan) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zag = 1;
            this.zah = this.zaa.zaa.size();
            for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.C1733x6b09fe28 c1733x6b09fe28 : this.zaa.zaa.keySet()) {
                if (!this.zaa.zab.containsKey(c1733x6b09fe28)) {
                    arrayList.add((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) this.zaa.zaa.get(c1733x6b09fe28));
                } else if (zaH()) {
                    zaC();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zau.add(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1832x38edaf.zaa().submit(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1812x38ed96(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaG(int i17) {
        if (this.zag == i17) {
            return true;
        }
        this.zaa.zag.zaf();
        "Unexpected callback in ".concat(toString());
        zaJ(this.zag);
        zaJ(i17);
        new java.lang.Exception();
        zaD(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaH() {
        int i17 = this.zah - 1;
        this.zah = i17;
        if (i17 > 0) {
            return false;
        }
        if (i17 < 0) {
            this.zaa.zag.zaf();
            android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new java.lang.Exception());
            zaD(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8, null));
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb = this.zae;
        if (c1700xff0c58bb == null) {
            return true;
        }
        this.zaa.zaf = this.zaf;
        zaD(c1700xff0c58bb);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaI(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        return this.zal && !c1700xff0c58bb.m17603xc9b9eee6();
    }

    private static final java.lang.String zaJ(int i17) {
        return i17 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public static /* bridge */ /* synthetic */ java.util.Set zao(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e = c1819x38ed9d.zar;
        if (c1904x2257e52e == null) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet(c1904x2257e52e.m18143x80a4fe14());
        java.util.Map zad = c1819x38ed9d.zar.zad();
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api : zad.keySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae = c1819x38ed9d.zaa;
            if (!c1831x38edae.zab.containsKey(api.zab())) {
                hashSet.addAll(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zab) zad.get(api)).zaa);
            }
        }
        return hashSet;
    }

    public static /* bridge */ /* synthetic */ void zar(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d, com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.p237x21ffc6bd.zak zakVar) {
        if (c1819x38ed9d.zaG(0)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zaa = zakVar.zaa();
            if (!zaa.m17605x6e268779()) {
                if (!c1819x38ed9d.zaI(zaa)) {
                    c1819x38ed9d.zaD(zaa);
                    return;
                } else {
                    c1819x38ed9d.zaA();
                    c1819x38ed9d.zaF();
                    return;
                }
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zav zavVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zav) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zakVar.zab());
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb zaa2 = zavVar.zaa();
            if (!zaa2.m17605x6e268779()) {
                java.lang.String valueOf = java.lang.String.valueOf(zaa2);
                android.util.Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new java.lang.Exception());
                c1819x38ed9d.zaD(zaa2);
                return;
            }
            c1819x38ed9d.zan = true;
            c1819x38ed9d.zao = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(zavVar.zab());
            c1819x38ed9d.zap = zavVar.zac();
            c1819x38ed9d.zaq = zavVar.zad();
            c1819x38ed9d.zaF();
        }
    }

    private final void zaz() {
        java.util.ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((java.util.concurrent.Future) arrayList.get(i17)).cancel(true);
        }
        this.zau.clear();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1770x2ead7903.ApiMethodImpl apiMethodImpl) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final void zad() {
        this.zaa.zab.clear();
        this.zam = false;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1815x38ed99 c1815x38ed99 = null;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = false;
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api : this.zas.keySet()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb interfaceC1736x7877dfeb = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb) this.zaa.zaa.get(api.zab()));
            z17 |= api.zac().m17706x3662b71a() == 1;
            boolean booleanValue = ((java.lang.Boolean) this.zas.get(api)).booleanValue();
            if (interfaceC1736x7877dfeb.mo17723xabdb8910()) {
                this.zam = true;
                if (booleanValue) {
                    this.zaj.add(api.zab());
                } else {
                    this.zal = false;
                }
            }
            hashMap.put(interfaceC1736x7877dfeb, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1808x38ed92(this, api, booleanValue));
        }
        if (z17) {
            this.zam = false;
        }
        if (this.zam) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zar);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zat);
            this.zar.zae(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this.zaa.zag)));
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1816x38ed9a c1816x38ed9a = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1816x38ed9a(this, c1815x38ed99);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.AbstractC1731x2722202e abstractC1731x2722202e = this.zat;
            android.content.Context context = this.zac;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae = this.zaa;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e = this.zar;
            this.zak = abstractC1731x2722202e.mo17329x6a949bd9(context, c1831x38edae.zag.mo17781x23b2dd47(), c1904x2257e52e, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) c1904x2257e52e.zaa(), (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks) c1816x38ed9a, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener) c1816x38ed9a);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1832x38edaf.zaa().submit(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1811x38ed95(this, hashMap)));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final void zae() {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final void zag(android.os.Bundle bundle) {
        if (zaG(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final void zah(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, boolean z17) {
        if (zaG(1)) {
            zaE(c1700xff0c58bb, api, z17);
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final void zai(int i17) {
        zaD(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb(8, null));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1828x38edab
    public final boolean zaj() {
        zaz();
        zaB(true);
        this.zaa.zak(null);
        return true;
    }
}

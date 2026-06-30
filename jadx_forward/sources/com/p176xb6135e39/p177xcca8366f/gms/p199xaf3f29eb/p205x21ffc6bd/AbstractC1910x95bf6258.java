package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.GmsClient */
/* loaded from: classes13.dex */
public abstract class AbstractC1910x95bf6258<T extends android.os.IInterface> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687<T> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaj {
    private static volatile java.util.concurrent.Executor zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e zab;
    private final java.util.Set zac;
    private final android.accounts.Account zad;

    public AbstractC1910x95bf6258(android.content.Context context, android.os.Handler handler, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e) {
        super(context, handler, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18165x9cf0d20b(context), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b(), i17, null, null);
        this.zab = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1904x2257e52e);
        this.zad = c1904x2257e52e.m18136xf7a0c5f7();
        this.zac = zaa(c1904x2257e52e.m18139x53ef4fc2());
    }

    private final java.util.Set zaa(java.util.Set set) {
        java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m18162xeb64e955 = m18162xeb64e955(set);
        java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> it = m18162xeb64e955.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return m18162xeb64e955;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getAccount */
    public final android.accounts.Account mo18094xf7a0c5f7() {
        return this.zad;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getBindServiceExecutor */
    public java.util.concurrent.Executor mo18097xea6d75() {
        return null;
    }

    /* renamed from: getClientSettings */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e m18161x4ca8e604() {
        return this.zab;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getRequiredFeatures */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[] mo17715xf716cc72() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1702x28db12d6[0];
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687
    /* renamed from: getScopes */
    public final java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo18107x2efbaf95() {
        return this.zac;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1736x7877dfeb
    /* renamed from: getScopesForConnectionlessNonSignIn */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> mo17716xa9228da4() {
        return mo17723xabdb8910() ? this.zac : java.util.Collections.emptySet();
    }

    /* renamed from: validateScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m18162xeb64e955(java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> set) {
        return set;
    }

    public AbstractC1910x95bf6258(android.content.Context context, android.os.Looper looper, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e) {
        this(context, looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18165x9cf0d20b(context), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b(), i17, c1904x2257e52e, null, null);
    }

    @java.lang.Deprecated
    public AbstractC1910x95bf6258(android.content.Context context, android.os.Looper looper, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.ConnectionCallbacks connectionCallbacks, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i17, c1904x2257e52e, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70) connectionCallbacks, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae) onConnectionFailedListener);
    }

    public AbstractC1910x95bf6258(android.content.Context context, android.os.Looper looper, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 interfaceC1772x6c072b70, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae interfaceC1784xee64ffae) {
        this(context, looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0.m18165x9cf0d20b(context), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc.m17618x9cf0d20b(), i17, c1904x2257e52e, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1772x6c072b70), (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1784xee64ffae));
    }

    public AbstractC1910x95bf6258(android.content.Context context, android.os.Looper looper, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1911x7fb283e0 abstractC1911x7fb283e0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1705x2db7dcfc c1705x2db7dcfc, int i17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e c1904x2257e52e, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1772x6c072b70 interfaceC1772x6c072b70, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1784xee64ffae interfaceC1784xee64ffae) {
        super(context, looper, abstractC1911x7fb283e0, c1705x2db7dcfc, i17, interfaceC1772x6c072b70 == null ? null : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zah(interfaceC1772x6c072b70), interfaceC1784xee64ffae == null ? null : new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zai(interfaceC1784xee64ffae), c1904x2257e52e.zac());
        this.zab = c1904x2257e52e;
        this.zad = c1904x2257e52e.m18136xf7a0c5f7();
        this.zac = zaa(c1904x2257e52e.m18139x53ef4fc2());
    }
}

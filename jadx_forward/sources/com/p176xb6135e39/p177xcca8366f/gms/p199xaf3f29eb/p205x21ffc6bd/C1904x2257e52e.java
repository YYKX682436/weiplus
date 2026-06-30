package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.ClientSettings */
/* loaded from: classes13.dex */
public final class C1904x2257e52e {
    private final android.accounts.Account zaa;
    private final java.util.Set zab;
    private final java.util.Set zac;
    private final java.util.Map zad;
    private final int zae;
    private final android.view.View zaf;
    private final java.lang.String zag;
    private final java.lang.String zah;
    private final com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c zai;
    private java.lang.Integer zaj;

    /* renamed from: com.google.android.gms.common.internal.ClientSettings$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {
        private android.accounts.Account zaa;
        private x.d zab;
        private java.lang.String zac;
        private java.lang.String zad;
        private final com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c zae = com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c.zaa;

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e m18145x59bc66e() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        /* renamed from: setRealClientPackageName */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder m18146x85ada1e6(java.lang.String str) {
            this.zac = str;
            return this;
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder zaa(java.util.Collection collection) {
            if (this.zab == null) {
                this.zab = new x.d(0);
            }
            this.zab.addAll(collection);
            return this;
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder zab(android.accounts.Account account) {
            this.zaa = account;
            return this;
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e.Builder zac(java.lang.String str) {
            this.zad = str;
            return this;
        }
    }

    public C1904x2257e52e(android.accounts.Account account, java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> set, java.util.Map<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?>, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zab> map, int i17, android.view.View view, java.lang.String str, java.lang.String str2, com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c c2420x5eee845c) {
        this(account, set, map, i17, view, str, str2, c2420x5eee845c, false);
    }

    /* renamed from: createDefault */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1904x2257e52e m18135xe1faf9a5(android.content.Context context) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c.Builder(context).zaa();
    }

    /* renamed from: getAccount */
    public android.accounts.Account m18136xf7a0c5f7() {
        return this.zaa;
    }

    @java.lang.Deprecated
    /* renamed from: getAccountName */
    public java.lang.String m18137xd73e122() {
        android.accounts.Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: getAccountOrDefault */
    public android.accounts.Account m18138x95f9aaa7() {
        android.accounts.Account account = this.zaa;
        return account != null ? account : new android.accounts.Account("<<default account>>", "com.google");
    }

    /* renamed from: getAllRequestedScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m18139x53ef4fc2() {
        return this.zac;
    }

    /* renamed from: getApplicableScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m18140x33dd0094(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<?> api) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zab zabVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zab) this.zad.get(api);
        if (zabVar == null || zabVar.zaa.isEmpty()) {
            return this.zab;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.zab);
        hashSet.addAll(zabVar.zaa);
        return hashSet;
    }

    /* renamed from: getGravityForPopups */
    public int m18141xbb947038() {
        return this.zae;
    }

    /* renamed from: getRealClientPackageName */
    public java.lang.String m18142xb59aef72() {
        return this.zag;
    }

    /* renamed from: getRequiredScopes */
    public java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> m18143x80a4fe14() {
        return this.zab;
    }

    /* renamed from: getViewForPopups */
    public android.view.View m18144xd4b36e95() {
        return this.zaf;
    }

    public final com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c zaa() {
        return this.zai;
    }

    public final java.lang.Integer zab() {
        return this.zaj;
    }

    public final java.lang.String zac() {
        return this.zah;
    }

    public final java.util.Map zad() {
        return this.zad;
    }

    public final void zae(java.lang.Integer num) {
        this.zaj = num;
    }

    public C1904x2257e52e(android.accounts.Account account, java.util.Set set, java.util.Map map, int i17, android.view.View view, java.lang.String str, java.lang.String str2, com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c c2420x5eee845c, boolean z17) {
        this.zaa = account;
        java.util.Set emptySet = set == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(set);
        this.zab = emptySet;
        map = map == null ? java.util.Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i17;
        this.zag = str;
        this.zah = str2;
        this.zai = c2420x5eee845c == null ? com.p176xb6135e39.p177xcca8366f.gms.p236xca356fa2.C2420x5eee845c.zaa : c2420x5eee845c;
        java.util.HashSet hashSet = new java.util.HashSet(emptySet);
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zab) it.next()).zaa);
        }
        this.zac = java.util.Collections.unmodifiableSet(hashSet);
    }
}

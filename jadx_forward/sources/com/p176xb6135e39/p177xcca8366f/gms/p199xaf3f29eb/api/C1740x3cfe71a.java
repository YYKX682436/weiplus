package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.Batch */
/* loaded from: classes13.dex */
public final class C1740x3cfe71a extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1741x5d1b5fd7> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[] zah;
    private final java.lang.Object zai;

    /* renamed from: com.google.android.gms.common.api.Batch$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {
        private final java.util.List zaa = new java.util.ArrayList();
        private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c zab;

        public Builder(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c) {
            this.zab = abstractC1748xd28d482c;
        }

        @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
        public <R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1742x2bddb862<R> add(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<R> abstractC1752x4624a074) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1742x2bddb862<R> c1742x2bddb862 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1742x2bddb862<>(this.zaa.size());
            this.zaa.add(abstractC1752x4624a074);
            return c1742x2bddb862;
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a m17730x59bc66e() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1740x3cfe71a(this.zaa, this.zab, null);
        }
    }

    public /* synthetic */ C1740x3cfe71a(java.util.List list, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zac zacVar) {
        super(abstractC1748xd28d482c);
        this.zai = new java.lang.Object();
        int size = list.size();
        this.zae = size;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[] abstractC1752x4624a074Arr = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[size];
        this.zah = abstractC1752x4624a074Arr;
        if (list.isEmpty()) {
            m17883x209a1f1f(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1741x5d1b5fd7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5903x535c1c1, abstractC1752x4624a074Arr));
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 abstractC1752x4624a074 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074) list.get(i17);
            this.zah[i17] = abstractC1752x4624a074;
            abstractC1752x4624a074.mo17814xbaafdc7(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.zab(this));
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: cancel */
    public void mo17729xae7a2e7a() {
        super.mo17729xae7a2e7a();
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074[] abstractC1752x4624a074Arr = this.zah;
            if (i17 >= abstractC1752x4624a074Arr.length) {
                return;
            }
            abstractC1752x4624a074Arr[i17].mo17729xae7a2e7a();
            i17++;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523
    /* renamed from: createFailedResult */
    public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1741x5d1b5fd7 mo17567xe8a1c1d6(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1741x5d1b5fd7(c1763x9432bc12, this.zah);
    }
}

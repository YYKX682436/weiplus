package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zaad */
/* loaded from: classes13.dex */
public final class C1800x38ed8a {
    private final java.util.Map zaa = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
    private final java.util.Map zab = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    private final void zah(boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        synchronized (this.zaa) {
            hashMap = new java.util.HashMap(this.zaa);
        }
        synchronized (this.zab) {
            hashMap2 = new java.util.HashMap(this.zab);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (z17 || ((java.lang.Boolean) entry.getValue()).booleanValue()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523) entry.getKey()).m17880xebad2b72(c1763x9432bc12);
            }
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            if (z17 || ((java.lang.Boolean) entry2.getValue()).booleanValue()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc) entry2.getKey()).m19605xc5fa5768(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1738x1a0a8775(c1763x9432bc12));
            }
        }
    }

    public final void zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523 abstractC1771x4463523, boolean z17) {
        this.zaa.put(abstractC1771x4463523, java.lang.Boolean.valueOf(z17));
        abstractC1771x4463523.mo17814xbaafdc7(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1798x38ed88(this, abstractC1771x4463523));
    }

    public final void zad(com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc, boolean z17) {
        this.zab.put(c2440x4f4de6dc, java.lang.Boolean.valueOf(z17));
        c2440x4f4de6dc.m19602xfb859dfb().mo19582xef59738d(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1799x38ed89(this, c2440x4f4de6dc));
    }

    public final void zae(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i17 == 1) {
            sb6.append(" due to service disconnection.");
        } else if (i17 == 3) {
            sb6.append(" due to dead object exception.");
        }
        if (str != null) {
            sb6.append(" Last reason for disconnect: ");
            sb6.append(str);
        }
        zah(true, new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(20, sb6.toString()));
    }

    public final void zaf() {
        zah(false, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1775x7d99476c.zaa);
    }

    public final boolean zag() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }
}

package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zadc */
/* loaded from: classes13.dex */
public final class C1877x38ede6 {
    public static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 zaa = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12(8, "The connection to Google Play services was lost");
    final java.util.Set zab = java.util.Collections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1876x38ede5 zac = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1876x38ede5(this);

    public final void zaa(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523 abstractC1771x4463523) {
        this.zab.add(abstractC1771x4463523);
        abstractC1771x4463523.zan(this.zac);
    }

    public final void zab() {
        for (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523 abstractC1771x4463523 : (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523[]) this.zab.toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523[0])) {
            abstractC1771x4463523.zan(null);
            if (abstractC1771x4463523.zam()) {
                this.zab.remove(abstractC1771x4463523);
            }
        }
    }
}

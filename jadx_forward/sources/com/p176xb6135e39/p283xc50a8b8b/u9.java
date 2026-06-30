package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class u9 extends com.p176xb6135e39.p283xc50a8b8b.ba {
    public u9(int i17) {
        super(i17, null);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.ba
    public void g() {
        if (!this.f126466g) {
            for (int i17 = 0; i17 < d(); i17++) {
                java.util.Map.Entry c17 = c(i17);
                if (((com.p176xb6135e39.p283xc50a8b8b.a5) c17.getKey()).d1()) {
                    c17.setValue(java.util.Collections.unmodifiableList((java.util.List) c17.getValue()));
                }
            }
            for (java.util.Map.Entry entry : e()) {
                if (((com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey()).d1()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        if (this.f126466g) {
            return;
        }
        this.f126465f = this.f126465f.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.f126465f);
        this.f126468i = this.f126468i.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.f126468i);
        this.f126466g = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return h((java.lang.Comparable) obj, obj2);
    }
}

package com.google.protobuf;

/* loaded from: classes16.dex */
public class u9 extends com.google.protobuf.ba {
    public u9(int i17) {
        super(i17, null);
    }

    @Override // com.google.protobuf.ba
    public void g() {
        if (!this.f44933g) {
            for (int i17 = 0; i17 < d(); i17++) {
                java.util.Map.Entry c17 = c(i17);
                if (((com.google.protobuf.a5) c17.getKey()).d1()) {
                    c17.setValue(java.util.Collections.unmodifiableList((java.util.List) c17.getValue()));
                }
            }
            for (java.util.Map.Entry entry : e()) {
                if (((com.google.protobuf.a5) entry.getKey()).d1()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        if (this.f44933g) {
            return;
        }
        this.f44932f = this.f44932f.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.f44932f);
        this.f44935i = this.f44935i.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.f44935i);
        this.f44933g = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return h((java.lang.Comparable) obj, obj2);
    }
}

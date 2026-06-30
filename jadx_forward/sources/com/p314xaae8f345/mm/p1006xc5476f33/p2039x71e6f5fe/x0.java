package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class x0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private x0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Set a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashSet hashSet = (java.util.HashSet) a17;
        if (!hashSet.isEmpty()) {
            java.util.Iterator it = hashSet.iterator();
            sb6.append((java.lang.String) it.next());
            while (it.hasNext()) {
                sb6.append("|");
                sb6.append((java.lang.String) it.next());
            }
            bundle.putString("brandCodePrefix", sb6.toString());
        }
        return bundle;
    }
}

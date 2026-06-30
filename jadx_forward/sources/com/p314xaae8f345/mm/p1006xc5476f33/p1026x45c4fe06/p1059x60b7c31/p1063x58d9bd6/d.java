package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public enum d {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f160706d = new android.util.SparseArray(2);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f160707e = new java.util.HashMap();

    d() {
    }

    public gb1.a a(java.lang.String str) {
        int hashCode = str.hashCode();
        synchronized (this.f160706d) {
            int indexOfKey = this.f160706d.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                return (gb1.a) this.f160706d.valueAt(indexOfKey);
            }
            gb1.a aVar = new gb1.a();
            this.f160706d.put(hashCode, aVar);
            return aVar;
        }
    }
}

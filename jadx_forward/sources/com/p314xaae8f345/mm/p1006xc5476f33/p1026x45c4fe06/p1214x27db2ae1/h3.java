package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class h3 extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.util.SparseLongArray get() {
        android.util.SparseLongArray sparseLongArray = (android.util.SparseLongArray) super.get();
        if (sparseLongArray != null) {
            return sparseLongArray;
        }
        android.util.SparseLongArray sparseLongArray2 = new android.util.SparseLongArray();
        set(sparseLongArray2);
        return sparseLongArray2;
    }
}

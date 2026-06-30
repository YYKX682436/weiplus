package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class h1 {
    public static final java.lang.Object a(android.util.SparseArray sparseArray, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i17);
        if (indexOfKey < 0) {
            return null;
        }
        java.lang.Object valueAt = sparseArray.valueAt(indexOfKey);
        sparseArray.removeAt(indexOfKey);
        return valueAt;
    }
}

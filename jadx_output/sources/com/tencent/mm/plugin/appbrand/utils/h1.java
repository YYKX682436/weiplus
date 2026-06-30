package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class h1 {
    public static final java.lang.Object a(android.util.SparseArray sparseArray, int i17) {
        kotlin.jvm.internal.o.g(sparseArray, "<this>");
        int indexOfKey = sparseArray.indexOfKey(i17);
        if (indexOfKey < 0) {
            return null;
        }
        java.lang.Object valueAt = sparseArray.valueAt(indexOfKey);
        sparseArray.removeAt(indexOfKey);
        return valueAt;
    }
}

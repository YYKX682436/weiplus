package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseIntArray f88418a = new android.util.SparseIntArray();

    public static final void a(java.lang.String str, int i17) {
        if (str != null) {
            int hashCode = str.hashCode();
            android.util.SparseIntArray sparseIntArray = f88418a;
            synchronized (sparseIntArray) {
                sparseIntArray.put(hashCode, i17);
            }
        }
    }

    public static final int b(java.lang.String str, int i17) {
        int i18;
        if (str == null) {
            return i17;
        }
        int hashCode = str.hashCode();
        android.util.SparseIntArray sparseIntArray = f88418a;
        synchronized (sparseIntArray) {
            i18 = sparseIntArray.get(hashCode, i17);
        }
        return i18;
    }
}

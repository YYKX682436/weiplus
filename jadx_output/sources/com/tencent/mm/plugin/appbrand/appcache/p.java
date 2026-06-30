package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseIntArray f75716a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(3);
        f75716a = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, com.tencent.mm.R.string.f490041j9);
        sparseIntArray.put(2, com.tencent.mm.R.string.f490040j8);
    }

    public static java.lang.String a(int i17) {
        int i18 = f75716a.get(i17, 0);
        return i18 == 0 ? "" : com.tencent.mm.sdk.platformtools.x2.f193075e.getString(i18);
    }
}

package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qr {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f51027a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f51028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51029c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f51030d;

    public qr(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, int i17) {
        java.lang.String[] strArr2;
        this.f51027a = str;
        this.f51028b = str2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            int length = strArr.length;
            java.lang.String[] strArr3 = new java.lang.String[length];
            java.lang.System.arraycopy(strArr, 0, strArr3, 0, length);
            strArr2 = strArr3;
        }
        this.f51030d = strArr2;
        this.f51029c = i17;
    }

    private static java.lang.String[] a(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, length);
        return strArr2;
    }
}

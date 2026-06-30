package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qr {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f132560a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f132561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f132562c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f132563d;

    public qr(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, int i17) {
        java.lang.String[] strArr2;
        this.f132560a = str;
        this.f132561b = str2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            int length = strArr.length;
            java.lang.String[] strArr3 = new java.lang.String[length];
            java.lang.System.arraycopy(strArr, 0, strArr3, 0, length);
            strArr2 = strArr3;
        }
        this.f132563d = strArr2;
        this.f132562c = i17;
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

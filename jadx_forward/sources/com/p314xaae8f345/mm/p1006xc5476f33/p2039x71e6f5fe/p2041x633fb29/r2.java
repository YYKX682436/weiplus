package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes11.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f240541a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f240542b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f240543c;

    public r2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f240541a = str == null ? "" : str;
        this.f240542b = str2 == null ? "" : str2;
        this.f240543c = str3 == null ? "" : str3;
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f240541a;
        boolean A0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str);
        java.lang.String str2 = this.f240542b;
        java.lang.String str3 = this.f240543c;
        if (A0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str3)) {
            if (str3.trim().length() > 0) {
                sb6.append(str3);
            }
            if (str2.trim().length() > 0) {
                sb6.append(str2);
            }
            if (str.trim().length() > 0) {
                sb6.append(str);
            }
        } else {
            if (str.trim().length() > 0) {
                sb6.append(str);
            }
            if (str2.trim().length() > 0) {
                sb6.append(" ");
                sb6.append(str2);
            }
            if (str3.trim().length() > 0) {
                sb6.append(" ");
                sb6.append(str3);
            }
        }
        return sb6.toString();
    }
}

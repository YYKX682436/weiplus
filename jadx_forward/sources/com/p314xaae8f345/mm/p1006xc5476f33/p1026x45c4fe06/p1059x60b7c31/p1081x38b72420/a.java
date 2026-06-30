package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f162032a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f162033b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f162034c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f162035d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162036e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f162032a = str == null ? "" : str;
        this.f162033b = str2 == null ? "" : str2;
        this.f162034c = str3 == null ? "" : str3;
        this.f162035d = str4 == null ? "" : str4;
        this.f162036e = str5 == null ? "" : str5;
    }

    public java.lang.String a() {
        java.lang.String str = this.f162032a;
        boolean A0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str);
        java.lang.String str2 = this.f162036e;
        java.lang.String str3 = this.f162035d;
        java.lang.String str4 = this.f162034c;
        java.lang.String str5 = this.f162033b;
        if (A0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str5) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (str.length() > 0) {
                sb6.append(str);
            }
            if (str5.length() > 0) {
                sb6.append(str5);
            }
            if (str4.length() > 0) {
                sb6.append(str4);
            }
            if (str3.length() > 0) {
                sb6.append(str3);
            }
            if (str2.length() > 0) {
                sb6.append(" ");
                sb6.append(str2);
            }
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (str3.length() > 0) {
            sb7.append(str3);
            sb7.append(" ");
        }
        if (str4.length() > 0) {
            sb7.append(str4.concat(" "));
        }
        if (str5.length() > 0) {
            sb7.append(str5.concat(" "));
        }
        if (str.length() > 0) {
            sb7.append(str);
        }
        if (str2.length() > 0) {
            sb7.append(" ");
            sb7.append(str2);
        }
        return sb7.toString();
    }
}

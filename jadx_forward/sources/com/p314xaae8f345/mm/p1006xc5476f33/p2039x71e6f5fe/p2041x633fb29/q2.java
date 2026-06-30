package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes11.dex */
public class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f240523a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f240524b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f240525c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f240526d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f240527e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f240528f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f240529g;

    public q2(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f240523a = str == null ? "" : str;
        this.f240524b = str2 == null ? "" : str2;
        this.f240525c = str3 == null ? "" : str3;
        this.f240526d = str4 == null ? "" : str4;
        this.f240527e = str5 == null ? "" : str5;
        this.f240528f = str6 == null ? "" : str6;
        this.f240529g = str7 == null ? "" : str7;
    }

    public java.lang.String a() {
        java.lang.String str = this.f240523a;
        boolean A0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str);
        java.lang.String str2 = this.f240528f;
        java.lang.String str3 = this.f240524b;
        java.lang.String str4 = this.f240525c;
        java.lang.String str5 = this.f240526d;
        java.lang.String str6 = this.f240527e;
        java.lang.String str7 = this.f240529g;
        if (!A0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str4) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str6) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str7)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (str.length() > 0) {
                sb6.append(str);
                sb6.append("\n");
            }
            if (str3.length() > 0) {
                sb6.append(str3);
                sb6.append("\n");
            }
            if (str4.length() > 0) {
                sb6.append(str4);
                sb6.append("\n");
            }
            if (str5.length() > 0) {
                sb6.append(str5.concat(" "));
            }
            if (str6.length() > 0) {
                sb6.append(str6.concat(" "));
            }
            if (str2.length() > 0) {
                sb6.append(str2);
            }
            if (str5.length() > 0 || str6.length() > 0) {
                sb6.append("\n");
            }
            if (str7.length() > 0) {
                sb6.append(str7);
            }
            java.lang.String sb7 = sb6.toString();
            return sb7.endsWith("\n") ? sb7.substring(0, sb7.length() - 1) : sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        if (str7.length() > 0) {
            sb8.append(str7);
            sb8.append("\n");
        }
        if (str6.length() > 0) {
            sb8.append(str6.concat(" "));
        }
        if (str5.length() > 0) {
            sb8.append(str5);
        }
        if (str6.length() > 0 || str5.length() > 0) {
            sb8.append("\n");
        }
        if (str4.length() > 0) {
            sb8.append(str4.concat(" "));
            sb8.append("\n");
        }
        if (str3.length() > 0) {
            sb8.append(str3);
            sb8.append("\n");
        }
        if (str.length() > 0) {
            sb8.append(str);
            sb8.append("\n");
        }
        if (str2.length() > 0) {
            sb8.append(str2);
        }
        java.lang.String sb9 = sb8.toString();
        return sb9.endsWith("\n") ? sb9.substring(0, sb9.length() - 1) : sb9;
    }
}

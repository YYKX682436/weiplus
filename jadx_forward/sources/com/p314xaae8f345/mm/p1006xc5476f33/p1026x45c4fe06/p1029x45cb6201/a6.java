package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class a6 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f156961d = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379};

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f156962a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f156963b;

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.String f156964c;

    public a6(java.lang.String str, java.lang.String str2) {
        this.f156962a = str;
        this.f156963b = a(str2);
    }

    public static java.lang.String a(java.lang.String str) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || yo.a.b(f156961d, str)) ? str : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
    }

    /* renamed from: toString */
    public java.lang.String m49244x9616526c() {
        java.lang.String str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f156964c)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f156962a);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f156963b)) {
                str = "";
            } else {
                str = "$" + this.f156963b;
            }
            sb6.append(str);
            this.f156964c = sb6.toString();
        }
        return this.f156964c;
    }

    public a6(java.lang.String str, java.lang.String str2, int i17) {
        if (i17 == 0) {
            this.f156963b = "";
        } else if (i17 == 6) {
            this.f156963b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379;
        } else if (i17 == 12) {
            this.f156963b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f;
        } else if (i17 == 13) {
            this.f156963b = a(str2) + "$__WITHOUT_PLUGINCODE__";
        } else if (i17 == 22) {
            this.f156963b = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169;
        } else if (i17 != 23) {
            this.f156963b = a(str2);
        } else {
            this.f156963b = a(str2) + "$__WITHOUT_MULTI_PLUGINCODE__";
        }
        this.f156962a = str;
    }

    public a6(java.lang.String str) {
        this.f156962a = str;
        this.f156963b = null;
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f80499a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f80500b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f80501c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80502d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f80503e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f80499a = str == null ? "" : str;
        this.f80500b = str2 == null ? "" : str2;
        this.f80501c = str3 == null ? "" : str3;
        this.f80502d = str4 == null ? "" : str4;
        this.f80503e = str5 == null ? "" : str5;
    }

    public java.lang.String a() {
        java.lang.String str = this.f80499a;
        boolean A0 = com.tencent.mm.sdk.platformtools.t8.A0(str);
        java.lang.String str2 = this.f80503e;
        java.lang.String str3 = this.f80502d;
        java.lang.String str4 = this.f80501c;
        java.lang.String str5 = this.f80500b;
        if (A0 || com.tencent.mm.sdk.platformtools.t8.A0(str5) || com.tencent.mm.sdk.platformtools.t8.A0(str4) || com.tencent.mm.sdk.platformtools.t8.A0(str3) || com.tencent.mm.sdk.platformtools.t8.A0(str2)) {
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

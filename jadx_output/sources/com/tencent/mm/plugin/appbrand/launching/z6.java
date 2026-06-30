package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class z6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f85461d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f85462e;

    /* renamed from: f, reason: collision with root package name */
    public int f85463f;

    /* renamed from: g, reason: collision with root package name */
    public int f85464g;

    /* renamed from: h, reason: collision with root package name */
    public int f85465h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f85466i;

    /* renamed from: m, reason: collision with root package name */
    public int f85467m;

    /* renamed from: n, reason: collision with root package name */
    public int f85468n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f85469o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f85470p;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.appbrand.launching.z6 other = (com.tencent.mm.plugin.appbrand.launching.z6) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (kotlin.jvm.internal.o.b(this.f85461d, other.f85461d)) {
            java.lang.String str = this.f85462e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = other.f85462e;
            if (str2 == null) {
                str2 = "";
            }
            if (kotlin.jvm.internal.o.b(str, str2)) {
                int i18 = this.f85463f;
                int i19 = other.f85463f;
                if (i18 != i19) {
                    i17 = kotlin.jvm.internal.o.i(i18, i19);
                } else {
                    int i27 = this.f85464g;
                    int i28 = other.f85464g;
                    if (i27 != i28) {
                        i17 = kotlin.jvm.internal.o.i(i27, i28);
                    } else {
                        boolean z18 = this.f85469o;
                        boolean z19 = other.f85469o;
                        if (z18 != z19) {
                            i17 = java.lang.Boolean.compare(z18, z19);
                        } else {
                            int i29 = this.f85465h;
                            int i37 = other.f85465h;
                            if (i29 != i37) {
                                i17 = kotlin.jvm.internal.o.i(i29, i37);
                            } else {
                                int i38 = this.f85467m;
                                int i39 = other.f85467m;
                                if (i38 != i39) {
                                    i17 = kotlin.jvm.internal.o.i(i38, i39);
                                } else {
                                    int i47 = this.f85468n;
                                    int i48 = other.f85468n;
                                    if (i47 != i48) {
                                        i17 = kotlin.jvm.internal.o.i(i47, i48);
                                    } else {
                                        java.lang.String str3 = this.f85466i;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        java.lang.String str4 = other.f85466i;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        if (kotlin.jvm.internal.o.b(str3, str4)) {
                                            java.lang.String str5 = this.f85470p;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            java.lang.String str6 = other.f85470p;
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            if (kotlin.jvm.internal.o.b(str5, str6)) {
                                                i17 = 0;
                                            } else {
                                                java.lang.String str7 = this.f85470p;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                java.lang.String str8 = other.f85470p;
                                                i17 = str7.compareTo(str8 != null ? str8 : "");
                                            }
                                        } else {
                                            java.lang.String str9 = this.f85466i;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            java.lang.String str10 = other.f85466i;
                                            i17 = str9.compareTo(str10 != null ? str10 : "");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                java.lang.String str11 = this.f85462e;
                if (str11 == null) {
                    str11 = "";
                }
                java.lang.String str12 = other.f85462e;
                i17 = str11.compareTo(str12 != null ? str12 : "");
            }
        } else {
            i17 = this.f85461d.compareTo(other.f85461d);
        }
        com.tencent.mars.xlog.Log.i("IGetDownloadUrlCgiExecutor.LocalUnifiedGetDownloadUrlRequest", "request.compareTo=" + i17 + ", this=" + this + ", other=" + other);
        return i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.launching.z6) {
            return this == obj || hashCode() == ((com.tencent.mm.plugin.appbrand.launching.z6) obj).hashCode();
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LocalUnifiedGetDownloadUrlRequest(appId='");
        sb6.append(this.f85461d);
        sb6.append("', moduleName=");
        java.lang.String str = this.f85462e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", packageType=");
        sb6.append(this.f85463f);
        sb6.append(", versionType=");
        sb6.append(this.f85464g);
        sb6.append(", appVersion=");
        sb6.append(this.f85465h);
        sb6.append(", versionDesc='");
        java.lang.String str2 = this.f85466i;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("' supportEncryptVersion=");
        sb6.append(this.f85467m);
        sb6.append(", localPkgVersion=");
        sb6.append(this.f85468n);
        sb6.append(", localPkgEncryptVersion=0, needLatestVersion=");
        sb6.append(this.f85469o);
        sb6.append(", semver=");
        java.lang.String str3 = this.f85470p;
        sb6.append(str3 != null ? str3 : "");
        sb6.append(')');
        return sb6.toString();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class z6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f166994d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f166995e;

    /* renamed from: f, reason: collision with root package name */
    public int f166996f;

    /* renamed from: g, reason: collision with root package name */
    public int f166997g;

    /* renamed from: h, reason: collision with root package name */
    public int f166998h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166999i;

    /* renamed from: m, reason: collision with root package name */
    public int f167000m;

    /* renamed from: n, reason: collision with root package name */
    public int f167001n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f167002o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f167003p;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 other = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166994d, other.f166994d)) {
            java.lang.String str = this.f166995e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = other.f166995e;
            if (str2 == null) {
                str2 = "";
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                int i18 = this.f166996f;
                int i19 = other.f166996f;
                if (i18 != i19) {
                    i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i19);
                } else {
                    int i27 = this.f166997g;
                    int i28 = other.f166997g;
                    if (i27 != i28) {
                        i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i27, i28);
                    } else {
                        boolean z18 = this.f167002o;
                        boolean z19 = other.f167002o;
                        if (z18 != z19) {
                            i17 = java.lang.Boolean.compare(z18, z19);
                        } else {
                            int i29 = this.f166998h;
                            int i37 = other.f166998h;
                            if (i29 != i37) {
                                i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i29, i37);
                            } else {
                                int i38 = this.f167000m;
                                int i39 = other.f167000m;
                                if (i38 != i39) {
                                    i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i38, i39);
                                } else {
                                    int i47 = this.f167001n;
                                    int i48 = other.f167001n;
                                    if (i47 != i48) {
                                        i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i47, i48);
                                    } else {
                                        java.lang.String str3 = this.f166999i;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        java.lang.String str4 = other.f166999i;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str4)) {
                                            java.lang.String str5 = this.f167003p;
                                            if (str5 == null) {
                                                str5 = "";
                                            }
                                            java.lang.String str6 = other.f167003p;
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, str6)) {
                                                i17 = 0;
                                            } else {
                                                java.lang.String str7 = this.f167003p;
                                                if (str7 == null) {
                                                    str7 = "";
                                                }
                                                java.lang.String str8 = other.f167003p;
                                                i17 = str7.compareTo(str8 != null ? str8 : "");
                                            }
                                        } else {
                                            java.lang.String str9 = this.f166999i;
                                            if (str9 == null) {
                                                str9 = "";
                                            }
                                            java.lang.String str10 = other.f166999i;
                                            i17 = str9.compareTo(str10 != null ? str10 : "");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                java.lang.String str11 = this.f166995e;
                if (str11 == null) {
                    str11 = "";
                }
                java.lang.String str12 = other.f166995e;
                i17 = str11.compareTo(str12 != null ? str12 : "");
            }
        } else {
            i17 = this.f166994d.compareTo(other.f166994d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("IGetDownloadUrlCgiExecutor.LocalUnifiedGetDownloadUrlRequest", "request.compareTo=" + i17 + ", this=" + this + ", other=" + other);
        return i17;
    }

    /* renamed from: equals */
    public boolean m51864xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) {
            return this == obj || m51865x8cdac1b() == ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) obj).m51865x8cdac1b();
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m51865x8cdac1b() {
        return m51866x9616526c().hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51866x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LocalUnifiedGetDownloadUrlRequest(appId='");
        sb6.append(this.f166994d);
        sb6.append("', moduleName=");
        java.lang.String str = this.f166995e;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", packageType=");
        sb6.append(this.f166996f);
        sb6.append(", versionType=");
        sb6.append(this.f166997g);
        sb6.append(", appVersion=");
        sb6.append(this.f166998h);
        sb6.append(", versionDesc='");
        java.lang.String str2 = this.f166999i;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("' supportEncryptVersion=");
        sb6.append(this.f167000m);
        sb6.append(", localPkgVersion=");
        sb6.append(this.f167001n);
        sb6.append(", localPkgEncryptVersion=0, needLatestVersion=");
        sb6.append(this.f167002o);
        sb6.append(", semver=");
        java.lang.String str3 = this.f167003p;
        sb6.append(str3 != null ? str3 : "");
        sb6.append(')');
        return sb6.toString();
    }
}

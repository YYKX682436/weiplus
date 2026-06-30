package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class z7 implements java.lang.Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.z7 f294809i = new com.p314xaae8f345.mm.vfs.z7(null, null, null, null, null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f294810d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f294811e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f294812f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f294813g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f294814h;

    public z7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f294810d = str;
        this.f294811e = str2;
        if ((str != null || str2 != null) && str3 != null && !str3.isEmpty() && str3.charAt(0) != '/') {
            str3 = "/".concat(str3);
        }
        this.f294812f = str3;
        this.f294813g = str4;
        this.f294814h = str5;
    }

    public static com.p314xaae8f345.mm.vfs.z7 a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int indexOf;
        if (str.isEmpty() || str.charAt(0) == '/' || (indexOf = str.indexOf(58)) < 0) {
            str2 = str;
            str3 = null;
            str4 = null;
        } else {
            java.lang.String substring = str.substring(0, indexOf);
            int length = str.length();
            int i17 = indexOf + 2;
            if (length > i17 && str.charAt(indexOf + 1) == '/' && str.charAt(i17) == '/') {
                int i18 = indexOf + 3;
                int i19 = i18;
                while (i19 < length) {
                    char charAt = str.charAt(i19);
                    if (charAt == '#' || charAt == '/' || charAt == '?') {
                        break;
                    }
                    i19++;
                }
                java.lang.String substring2 = str.substring(i18, i19);
                str2 = i19 < length ? str.substring(i19 + 1) : null;
                str3 = substring;
                str4 = substring2;
            } else {
                str2 = str.substring(indexOf + 1);
                str3 = substring;
                str4 = null;
            }
        }
        return new com.p314xaae8f345.mm.vfs.z7(str3, str4, str2, null, null);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return m82499x9616526c().compareTo(((com.p314xaae8f345.mm.vfs.z7) obj).m82499x9616526c());
    }

    /* renamed from: equals */
    public boolean m82497xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.z7)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 z7Var = (com.p314xaae8f345.mm.vfs.z7) obj;
        return com.p314xaae8f345.mm.vfs.e8.f(this.f294810d, z7Var.f294810d) && com.p314xaae8f345.mm.vfs.e8.f(this.f294811e, z7Var.f294811e) && com.p314xaae8f345.mm.vfs.e8.f(this.f294812f, z7Var.f294812f) && com.p314xaae8f345.mm.vfs.e8.f(this.f294813g, z7Var.f294813g) && com.p314xaae8f345.mm.vfs.e8.f(this.f294814h, z7Var.f294814h);
    }

    public android.net.Uri h() {
        return new android.net.Uri.Builder().scheme(this.f294810d).authority(this.f294811e).path(this.f294812f).query(this.f294813g).fragment(this.f294814h).build();
    }

    /* renamed from: hashCode */
    public int m82498x8cdac1b() {
        return java.util.Arrays.hashCode(new java.lang.String[]{this.f294810d, this.f294811e, this.f294812f, this.f294813g, this.f294814h});
    }

    /* renamed from: toString */
    public java.lang.String m82499x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f294810d;
        if (str != null && !str.isEmpty()) {
            sb6.append(str);
            sb6.append(':');
        }
        java.lang.String str2 = this.f294811e;
        if (str2 != null && !str2.isEmpty()) {
            sb6.append("//");
            sb6.append(str2);
        }
        java.lang.String str3 = this.f294812f;
        if (str3 != null) {
            sb6.append(str3);
        }
        return sb6.toString();
    }

    public z7(android.net.Uri uri) {
        this.f294810d = uri.getScheme();
        this.f294811e = uri.getAuthority();
        this.f294812f = uri.getPath();
        this.f294813g = uri.getQuery();
        this.f294814h = uri.getFragment();
    }
}

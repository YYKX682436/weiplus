package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc;

/* renamed from: com.google.android.gms.auth.api.credentials.Credential */
/* loaded from: classes13.dex */
public class C1658x4e15c477 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477> f5522x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.zzd();

    /* renamed from: EXTRA_KEY */
    public static final java.lang.String f5523x97127570 = "com.google.android.gms.credentials.Credential";

    /* renamed from: mName */
    private final java.lang.String f5524x624f098;

    /* renamed from: zzbx */
    private final java.lang.String f5525x394b96;

    /* renamed from: zzci */
    private final java.lang.String f5526x394ba6;

    /* renamed from: zzcj */
    private final android.net.Uri f5527x394ba7;

    /* renamed from: zzck */
    private final java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1668xc51f4d7e> f5528x394ba8;

    /* renamed from: zzcl */
    private final java.lang.String f5529x394ba9;

    /* renamed from: zzcm */
    private final java.lang.String f5530x394baa;

    /* renamed from: zzcn */
    private final java.lang.String f5531x394bab;

    /* renamed from: zzco */
    private final java.lang.String f5532x394bac;

    /* renamed from: zzcp */
    private final java.lang.String f5533x394bad;

    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: mName */
        private java.lang.String f5534x624f098;

        /* renamed from: zzbx */
        private java.lang.String f5535x394b96;

        /* renamed from: zzci */
        private final java.lang.String f5536x394ba6;

        /* renamed from: zzcj */
        private android.net.Uri f5537x394ba7;

        /* renamed from: zzck */
        private java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1668xc51f4d7e> f5538x394ba8;

        /* renamed from: zzcl */
        private java.lang.String f5539x394ba9;

        /* renamed from: zzcm */
        private java.lang.String f5540x394baa;

        /* renamed from: zzcn */
        private java.lang.String f5541x394bab;

        /* renamed from: zzco */
        private java.lang.String f5542x394bac;

        /* renamed from: zzcp */
        private java.lang.String f5543x394bad;

        public Builder(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477 c1658x4e15c477) {
            this.f5536x394ba6 = c1658x4e15c477.f5526x394ba6;
            this.f5534x624f098 = c1658x4e15c477.f5524x624f098;
            this.f5537x394ba7 = c1658x4e15c477.f5527x394ba7;
            this.f5538x394ba8 = c1658x4e15c477.f5528x394ba8;
            this.f5539x394ba9 = c1658x4e15c477.f5529x394ba9;
            this.f5535x394b96 = c1658x4e15c477.f5525x394b96;
            this.f5540x394baa = c1658x4e15c477.f5530x394baa;
            this.f5541x394bab = c1658x4e15c477.f5531x394bab;
            this.f5542x394bac = c1658x4e15c477.f5532x394bac;
            this.f5543x394bad = c1658x4e15c477.f5533x394bad;
        }

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477 m17378x59bc66e() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477(this.f5536x394ba6, this.f5534x624f098, this.f5537x394ba7, this.f5538x394ba8, this.f5539x394ba9, this.f5535x394b96, this.f5540x394baa, this.f5541x394bab, this.f5542x394bac, this.f5543x394bad);
        }

        /* renamed from: setAccountType */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477.Builder m17379xa3dc6945(java.lang.String str) {
            this.f5535x394b96 = str;
            return this;
        }

        /* renamed from: setName */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477.Builder m17380x764daa0d(java.lang.String str) {
            this.f5534x624f098 = str;
            return this;
        }

        /* renamed from: setPassword */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477.Builder m17381xbf1c591d(java.lang.String str) {
            this.f5539x394ba9 = str;
            return this;
        }

        /* renamed from: setProfilePictureUri */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477.Builder m17382xcb04a1d5(android.net.Uri uri) {
            this.f5537x394ba7 = uri;
            return this;
        }

        public Builder(java.lang.String str) {
            this.f5536x394ba6 = str;
        }
    }

    public C1658x4e15c477(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1668xc51f4d7e> list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        java.lang.String trim = ((java.lang.String) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "credential identifier cannot be null")).trim();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18209xec737762(trim, "credential identifier cannot be empty");
        if (str3 != null && android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            boolean z17 = false;
            if (!android.text.TextUtils.isEmpty(str4)) {
                android.net.Uri parse = android.net.Uri.parse(str4);
                if (parse.isAbsolute() && parse.isHierarchical() && !android.text.TextUtils.isEmpty(parse.getScheme()) && !android.text.TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                    z17 = true;
                }
            }
            if (!java.lang.Boolean.valueOf(z17).booleanValue()) {
                throw new java.lang.IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if (!android.text.TextUtils.isEmpty(str4) && !android.text.TextUtils.isEmpty(str3)) {
            throw new java.lang.IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if (str2 != null && android.text.TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f5524x624f098 = str2;
        this.f5527x394ba7 = uri;
        this.f5528x394ba8 = list == null ? java.util.Collections.emptyList() : java.util.Collections.unmodifiableList(list);
        this.f5526x394ba6 = trim;
        this.f5529x394ba9 = str3;
        this.f5525x394b96 = str4;
        this.f5530x394baa = str5;
        this.f5531x394bab = str6;
        this.f5532x394bac = str7;
        this.f5533x394bad = str8;
    }

    /* renamed from: equals */
    public boolean m17367xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477)) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477 c1658x4e15c477 = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1658x4e15c477) obj;
        return android.text.TextUtils.equals(this.f5526x394ba6, c1658x4e15c477.f5526x394ba6) && android.text.TextUtils.equals(this.f5524x624f098, c1658x4e15c477.f5524x624f098) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f5527x394ba7, c1658x4e15c477.f5527x394ba7) && android.text.TextUtils.equals(this.f5529x394ba9, c1658x4e15c477.f5529x394ba9) && android.text.TextUtils.equals(this.f5525x394b96, c1658x4e15c477.f5525x394b96) && android.text.TextUtils.equals(this.f5530x394baa, c1658x4e15c477.f5530x394baa);
    }

    /* renamed from: getAccountType */
    public java.lang.String m17368xd76f5d1() {
        return this.f5525x394b96;
    }

    /* renamed from: getFamilyName */
    public java.lang.String m17369x1dd9b005() {
        return this.f5533x394bad;
    }

    /* renamed from: getGeneratedPassword */
    public java.lang.String m17370xaf444094() {
        return this.f5530x394baa;
    }

    /* renamed from: getGivenName */
    public java.lang.String m17371x56fd50f2() {
        return this.f5532x394bac;
    }

    /* renamed from: getId */
    public java.lang.String m17372x5db1b11() {
        return this.f5526x394ba6;
    }

    /* renamed from: getIdTokens */
    public java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1668xc51f4d7e> m17373x56ca3c0b() {
        return this.f5528x394ba8;
    }

    /* renamed from: getName */
    public java.lang.String m17374xfb82e301() {
        return this.f5524x624f098;
    }

    /* renamed from: getPassword */
    public java.lang.String m17375xc463f811() {
        return this.f5529x394ba9;
    }

    /* renamed from: getProfilePictureUri */
    public android.net.Uri m17376xef6e9561() {
        return this.f5527x394ba7;
    }

    /* renamed from: hashCode */
    public int m17377x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.f5526x394ba6, this.f5524x624f098, this.f5527x394ba7, this.f5529x394ba9, this.f5525x394b96, this.f5530x394baa);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 1, m17372x5db1b11(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 2, m17374xfb82e301(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, m17376xef6e9561(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18360xcb846b09(parcel, 4, m17373x56ca3c0b(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 5, m17375xc463f811(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, m17368xd76f5d1(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, m17370xaf444094(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 8, this.f5531x394bab, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 9, m17371x56fd50f2(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 10, m17369x1dd9b005(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }
}

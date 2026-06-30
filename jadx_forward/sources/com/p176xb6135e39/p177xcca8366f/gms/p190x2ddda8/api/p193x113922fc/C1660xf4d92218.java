package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc;

/* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest */
/* loaded from: classes13.dex */
public final class C1660xf4d92218 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218> f5555x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.zzh();

    /* renamed from: zzcu */
    private final boolean f5556x394bb2;

    /* renamed from: zzcv */
    private final java.lang.String[] f5557x394bb3;

    /* renamed from: zzcw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 f5558x394bb4;

    /* renamed from: zzcx */
    private final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 f5559x394bb5;

    /* renamed from: zzcy */
    private final boolean f5560x394bb6;

    /* renamed from: zzcz */
    private final java.lang.String f5561x394bb7;

    /* renamed from: zzda */
    private final java.lang.String f5562x394bbd;

    /* renamed from: zzdb */
    private final boolean f5563x394bbe;
    private final int zzy;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: zzcu */
        private boolean f5564x394bb2;

        /* renamed from: zzcv */
        private java.lang.String[] f5565x394bb3;

        /* renamed from: zzcw */
        private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 f5566x394bb4;

        /* renamed from: zzcx */
        private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 f5567x394bb5;

        /* renamed from: zzda */
        private java.lang.String f5570x394bbd;

        /* renamed from: zzcy */
        private boolean f5568x394bb6 = false;

        /* renamed from: zzdb */
        private boolean f5571x394bbe = false;

        /* renamed from: zzcz */
        private java.lang.String f5569x394bb7 = null;

        /* renamed from: build */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218 m17402x59bc66e() {
            if (this.f5565x394bb3 == null) {
                this.f5565x394bb3 = new java.lang.String[0];
            }
            if (this.f5564x394bb2 || this.f5565x394bb3.length != 0) {
                return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218(this);
            }
            throw new java.lang.IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: setAccountTypes */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17403xd7b0bfce(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.f5565x394bb3 = strArr;
            return this;
        }

        /* renamed from: setCredentialHintPickerConfig */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17404xf51f5610(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 c1659xf3cb7387) {
            this.f5567x394bb5 = c1659xf3cb7387;
            return this;
        }

        /* renamed from: setCredentialPickerConfig */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17405x6094da69(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 c1659xf3cb7387) {
            this.f5566x394bb4 = c1659xf3cb7387;
            return this;
        }

        /* renamed from: setIdTokenNonce */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17406x645af273(java.lang.String str) {
            this.f5570x394bbd = str;
            return this;
        }

        /* renamed from: setIdTokenRequested */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17407xffcc6ff2(boolean z17) {
            this.f5568x394bb6 = z17;
            return this;
        }

        /* renamed from: setPasswordLoginSupported */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17408xa4a8b9c2(boolean z17) {
            this.f5564x394bb2 = z17;
            return this;
        }

        /* renamed from: setServerClientId */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17409xf6da0bab(java.lang.String str) {
            this.f5569x394bb7 = str;
            return this;
        }

        @java.lang.Deprecated
        /* renamed from: setSupportsPasswordLogin */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder m17410x3d6f1e28(boolean z17) {
            return m17408xa4a8b9c2(z17);
        }
    }

    public C1660xf4d92218(int i17, boolean z17, java.lang.String[] strArr, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 c1659xf3cb7387, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 c1659xf3cb73872, boolean z18, java.lang.String str, java.lang.String str2, boolean z19) {
        this.zzy = i17;
        this.f5556x394bb2 = z17;
        this.f5557x394bb3 = (java.lang.String[]) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
        this.f5558x394bb4 = c1659xf3cb7387 == null ? new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder().m17387x59bc66e() : c1659xf3cb7387;
        this.f5559x394bb5 = c1659xf3cb73872 == null ? new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder().m17387x59bc66e() : c1659xf3cb73872;
        if (i17 < 3) {
            this.f5560x394bb6 = true;
            this.f5561x394bb7 = null;
            this.f5562x394bbd = null;
        } else {
            this.f5560x394bb6 = z18;
            this.f5561x394bb7 = str;
            this.f5562x394bbd = str2;
        }
        this.f5563x394bbe = z19;
    }

    /* renamed from: getAccountTypes */
    public final java.lang.String[] m17393xa167c4c2() {
        return this.f5557x394bb3;
    }

    /* renamed from: getAccountTypesSet */
    public final java.util.Set<java.lang.String> m17394xeaab3040() {
        return new java.util.HashSet(java.util.Arrays.asList(this.f5557x394bb3));
    }

    /* renamed from: getCredentialHintPickerConfig */
    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 m17395x560a004() {
        return this.f5559x394bb5;
    }

    /* renamed from: getCredentialPickerConfig */
    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 m17396x2e513e5d() {
        return this.f5558x394bb4;
    }

    /* renamed from: getIdTokenNonce */
    public final java.lang.String m17397x2e11f767() {
        return this.f5562x394bbd;
    }

    /* renamed from: getServerClientId */
    public final java.lang.String m17398x2ee3a39f() {
        return this.f5561x394bb7;
    }

    @java.lang.Deprecated
    /* renamed from: getSupportsPasswordLogin */
    public final boolean m17399x6d5c6bb4() {
        return m17401xe8cac48a();
    }

    /* renamed from: isIdTokenRequested */
    public final boolean m17400x5de030ba() {
        return this.f5560x394bb6;
    }

    /* renamed from: isPasswordLoginSupported */
    public final boolean m17401xe8cac48a() {
        return this.f5556x394bb2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 1, m17401xe8cac48a());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18356xa6ac8369(parcel, 2, m17393xa167c4c2(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 3, m17396x2e513e5d(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 4, m17395x560a004(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, m17400x5de030ba());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, m17398x2ee3a39f(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, m17397x2e11f767(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1000, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 8, this.f5563x394bbe);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    private C1660xf4d92218(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1660xf4d92218.Builder builder) {
        this(4, builder.f5564x394bb2, builder.f5565x394bb3, builder.f5566x394bb4, builder.f5567x394bb5, builder.f5568x394bb6, builder.f5569x394bb7, builder.f5570x394bbd, false);
    }
}

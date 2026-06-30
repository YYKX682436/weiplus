package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc;

/* renamed from: com.google.android.gms.auth.api.credentials.HintRequest */
/* loaded from: classes13.dex */
public final class C1667x7e693de8 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8> f5577x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.zzk();

    /* renamed from: zzcv */
    private final java.lang.String[] f5578x394bb3;

    /* renamed from: zzcy */
    private final boolean f5579x394bb6;

    /* renamed from: zzcz */
    private final java.lang.String f5580x394bb7;

    /* renamed from: zzda */
    private final java.lang.String f5581x394bbd;

    /* renamed from: zzdc */
    private final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 f5582x394bbf;

    /* renamed from: zzdd */
    private final boolean f5583x394bc0;

    /* renamed from: zzde */
    private final boolean f5584x394bc1;
    private final int zzy;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: zzcv */
        private java.lang.String[] f5585x394bb3;

        /* renamed from: zzcz */
        private java.lang.String f5587x394bb7;

        /* renamed from: zzda */
        private java.lang.String f5588x394bbd;

        /* renamed from: zzdd */
        private boolean f5590x394bc0;

        /* renamed from: zzde */
        private boolean f5591x394bc1;

        /* renamed from: zzdc */
        private com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 f5589x394bbf = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder().m17387x59bc66e();

        /* renamed from: zzcy */
        private boolean f5586x394bb6 = false;

        /* renamed from: build */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8 m17436x59bc66e() {
            if (this.f5585x394bb3 == null) {
                this.f5585x394bb3 = new java.lang.String[0];
            }
            if (this.f5590x394bc0 || this.f5591x394bc1 || this.f5585x394bb3.length != 0) {
                return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8(this);
            }
            throw new java.lang.IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: setAccountTypes */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17437xd7b0bfce(java.lang.String... strArr) {
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
            this.f5585x394bb3 = strArr;
            return this;
        }

        /* renamed from: setEmailAddressIdentifierSupported */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17438x6e8da16b(boolean z17) {
            this.f5590x394bc0 = z17;
            return this;
        }

        /* renamed from: setHintPickerConfig */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17439xd814f219(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 c1659xf3cb7387) {
            this.f5589x394bbf = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1659xf3cb7387);
            return this;
        }

        /* renamed from: setIdTokenNonce */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17440x645af273(java.lang.String str) {
            this.f5588x394bbd = str;
            return this;
        }

        /* renamed from: setIdTokenRequested */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17441xffcc6ff2(boolean z17) {
            this.f5586x394bb6 = z17;
            return this;
        }

        /* renamed from: setPhoneNumberIdentifierSupported */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17442xe0210f30(boolean z17) {
            this.f5591x394bc1 = z17;
            return this;
        }

        /* renamed from: setServerClientId */
        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder m17443xf6da0bab(java.lang.String str) {
            this.f5587x394bb7 = str;
            return this;
        }
    }

    public C1667x7e693de8(int i17, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 c1659xf3cb7387, boolean z17, boolean z18, java.lang.String[] strArr, boolean z19, java.lang.String str, java.lang.String str2) {
        this.zzy = i17;
        this.f5582x394bbf = (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1659xf3cb7387);
        this.f5583x394bc0 = z17;
        this.f5584x394bc1 = z18;
        this.f5578x394bb3 = (java.lang.String[]) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(strArr);
        if (i17 < 2) {
            this.f5579x394bb6 = true;
            this.f5580x394bb7 = null;
            this.f5581x394bbd = null;
        } else {
            this.f5579x394bb6 = z19;
            this.f5580x394bb7 = str;
            this.f5581x394bbd = str2;
        }
    }

    /* renamed from: getAccountTypes */
    public final java.lang.String[] m17430xa167c4c2() {
        return this.f5578x394bb3;
    }

    /* renamed from: getHintPickerConfig */
    public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 m17431x34185d0d() {
        return this.f5582x394bbf;
    }

    /* renamed from: getIdTokenNonce */
    public final java.lang.String m17432x2e11f767() {
        return this.f5581x394bbd;
    }

    /* renamed from: getServerClientId */
    public final java.lang.String m17433x2ee3a39f() {
        return this.f5580x394bb7;
    }

    /* renamed from: isEmailAddressIdentifierSupported */
    public final boolean m17434x687737a3() {
        return this.f5583x394bc0;
    }

    /* renamed from: isIdTokenRequested */
    public final boolean m17435x5de030ba() {
        return this.f5579x394bb6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 1, m17431x34185d0d(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, m17434x687737a3());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, this.f5584x394bc1);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18356xa6ac8369(parcel, 4, m17430xa167c4c2(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 5, m17435x5de030ba());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 6, m17433x2ee3a39f(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 7, m17432x2e11f767(), false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1000, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    private C1667x7e693de8(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8.Builder builder) {
        this(2, builder.f5589x394bbf, builder.f5590x394bc0, builder.f5591x394bc1, builder.f5585x394bb3, builder.f5586x394bb6, builder.f5587x394bb7, builder.f5588x394bbd);
    }
}

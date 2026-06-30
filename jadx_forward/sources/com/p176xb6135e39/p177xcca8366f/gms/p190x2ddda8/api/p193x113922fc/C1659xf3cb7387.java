package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc;

/* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig */
/* loaded from: classes13.dex */
public final class C1659xf3cb7387 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387> f5544x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.zzf();

    /* renamed from: mShowCancelButton */
    private final boolean f5545x4a3e6476;

    /* renamed from: zzcq */
    private final boolean f5546x394bae;

    /* renamed from: zzcr */
    @java.lang.Deprecated
    private final boolean f5547x394baf;

    /* renamed from: zzcs */
    private final int f5548x394bb0;
    private final int zzy;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: zzcq */
        private boolean f5550x394bae = false;

        /* renamed from: mShowCancelButton */
        private boolean f5549x4a3e6476 = true;

        /* renamed from: zzct */
        private int f5551x394bb1 = 1;

        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387 m17387x59bc66e() {
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387(this);
        }

        @java.lang.Deprecated
        /* renamed from: setForNewAccount */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder m17388x506148d4(boolean z17) {
            this.f5551x394bb1 = z17 ? 3 : 1;
            return this;
        }

        /* renamed from: setPrompt */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder m17389x1de5b066(int i17) {
            this.f5551x394bb1 = i17;
            return this;
        }

        /* renamed from: setShowAddAccountButton */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder m17390xf6857d3d(boolean z17) {
            this.f5550x394bae = z17;
            return this;
        }

        /* renamed from: setShowCancelButton */
        public com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder m17391x6ffb966b(boolean z17) {
            this.f5549x4a3e6476 = z17;
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Prompt */
    /* loaded from: classes6.dex */
    public @interface Prompt {

        /* renamed from: CONTINUE */
        public static final int f5552xcd71ca7 = 1;

        /* renamed from: SIGN_IN */
        public static final int f5553xa74462e7 = 2;

        /* renamed from: SIGN_UP */
        public static final int f5554xa744645d = 3;
    }

    public C1659xf3cb7387(int i17, boolean z17, boolean z18, boolean z19, int i18) {
        this.zzy = i17;
        this.f5546x394bae = z17;
        this.f5545x4a3e6476 = z18;
        if (i17 < 2) {
            this.f5547x394baf = z19;
            this.f5548x394bb0 = z19 ? 3 : 1;
        } else {
            this.f5547x394baf = i18 == 3;
            this.f5548x394bb0 = i18;
        }
    }

    @java.lang.Deprecated
    /* renamed from: isForNewAccount */
    public final boolean m17384x816a7d0c() {
        return this.f5548x394bb0 == 3;
    }

    /* renamed from: shouldShowAddAccountButton */
    public final boolean m17385x3bee040e() {
        return this.f5546x394bae;
    }

    /* renamed from: shouldShowCancelButton */
    public final boolean m17386x5c122dbc() {
        return this.f5545x4a3e6476;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 1, m17385x3bee040e());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 2, m17386x5c122dbc());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18311xa577e349(parcel, 3, m17384x816a7d0c());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.f5548x394bb0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1000, this.zzy);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    private C1659xf3cb7387(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1659xf3cb7387.Builder builder) {
        this(2, builder.f5550x394bae, builder.f5549x4a3e6476, false, builder.f5551x394bb1);
    }
}

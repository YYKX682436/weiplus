package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.PeriodicTask */
/* loaded from: classes13.dex */
public class C2044x2bdd4ee0 extends com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0> f6058x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzk();

    /* renamed from: mFlexInSeconds */
    protected long f6059xa5c6c234;

    /* renamed from: mIntervalInSeconds */
    protected long f6060x71f10168;

    /* renamed from: com.google.android.gms.gcm.PeriodicTask$Builder */
    /* loaded from: classes13.dex */
    public static class Builder extends com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder {

        /* renamed from: zzam */
        private long f6061x394b6c = -1;

        /* renamed from: zzan */
        private long f6062x394b6d = -1;

        public Builder() {
            this.f6080x78c5e369 = true;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0 mo18723x59bc66e() {
            mo18724x10454de0();
            return new com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0(this, (com.p176xb6135e39.p177xcca8366f.gms.gcm.zzk) null);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: checkConditions */
        public void mo18724x10454de0() {
            super.mo18724x10454de0();
            long j17 = this.f6061x394b6c;
            if (j17 == -1) {
                throw new java.lang.IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (j17 <= 0) {
                long j18 = this.f6061x394b6c;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(66);
                sb6.append("Period set cannot be less than or equal to 0: ");
                sb6.append(j18);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
            long j19 = this.f6062x394b6d;
            if (j19 == -1) {
                this.f6062x394b6d = ((float) j17) * 0.1f;
            } else if (j19 > j17) {
                this.f6062x394b6d = j17;
            }
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setExtras */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18726xb774565(android.os.Bundle bundle) {
            this.f6078xb32aee63 = bundle;
            return this;
        }

        /* renamed from: setFlex */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder m18738x764a2f7b(long j17) {
            this.f6062x394b6d = j17;
            return this;
        }

        /* renamed from: setPeriod */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder m18739x1d2fccc3(long j17) {
            this.f6061x394b6c = j17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setPersisted */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18727x8e49d331(boolean z17) {
            this.f6080x78c5e369 = z17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setRequiredNetwork */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18728xc605b0cd(int i17) {
            this.f6081xc482b042 = i17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setRequiresCharging */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18729xb20260c1(boolean z17) {
            this.f6082x662d643f = z17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setService */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18730x27824ff3(java.lang.Class<? extends com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf> cls) {
            this.f6079xadc18d9f = cls.getName();
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setTag */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18731xca0297d8(java.lang.String str) {
            this.tag = str;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setUpdateCurrent */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder mo18732x3a377b2e(boolean z17) {
            this.f6083xea015870 = z17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setService */
        public /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder mo18730x27824ff3(java.lang.Class cls) {
            return mo18730x27824ff3((java.lang.Class<? extends com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf>) cls);
        }
    }

    @java.lang.Deprecated
    private C2044x2bdd4ee0(android.os.Parcel parcel) {
        super(parcel);
        this.f6060x71f10168 = -1L;
        this.f6059xa5c6c234 = -1L;
        this.f6060x71f10168 = parcel.readLong();
        this.f6059xa5c6c234 = java.lang.Math.min(parcel.readLong(), this.f6060x71f10168);
    }

    /* renamed from: getFlex */
    public long m18735xfb7f686f() {
        return this.f6059xa5c6c234;
    }

    /* renamed from: getPeriod */
    public long m18736x29fa98b7() {
        return this.f6060x71f10168;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5
    /* renamed from: toBundle */
    public void mo18721x792022dd(android.os.Bundle bundle) {
        super.mo18721x792022dd(bundle);
        bundle.putLong("period", this.f6060x71f10168);
        bundle.putLong("period_flex", this.f6059xa5c6c234);
    }

    /* renamed from: toString */
    public java.lang.String m18737x9616526c() {
        java.lang.String obj = super.toString();
        long m18736x29fa98b7 = m18736x29fa98b7();
        long m18735xfb7f686f = m18735xfb7f686f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 54);
        sb6.append(obj);
        sb6.append(" period=");
        sb6.append(m18736x29fa98b7);
        sb6.append(" flex=");
        sb6.append(m18735xfb7f686f);
        return sb6.toString();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeLong(this.f6060x71f10168);
        parcel.writeLong(this.f6059xa5c6c234);
    }

    public /* synthetic */ C2044x2bdd4ee0(android.os.Parcel parcel, com.p176xb6135e39.p177xcca8366f.gms.gcm.zzk zzkVar) {
        this(parcel);
    }

    private C2044x2bdd4ee0(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder builder) {
        super(builder);
        this.f6060x71f10168 = -1L;
        this.f6059xa5c6c234 = -1L;
        this.f6060x71f10168 = builder.f6061x394b6c;
        this.f6059xa5c6c234 = java.lang.Math.min(builder.f6062x394b6d, this.f6060x71f10168);
    }

    public /* synthetic */ C2044x2bdd4ee0(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2044x2bdd4ee0.Builder builder, com.p176xb6135e39.p177xcca8366f.gms.gcm.zzk zzkVar) {
        this(builder);
    }
}

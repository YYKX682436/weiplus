package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.OneoffTask */
/* loaded from: classes13.dex */
public class C2042xb78f568e extends com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e> f6051x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzi();

    /* renamed from: zzaj */
    private final long f6052x394b69;

    /* renamed from: zzak */
    private final long f6053x394b6a;

    /* renamed from: com.google.android.gms.gcm.OneoffTask$Builder */
    /* loaded from: classes13.dex */
    public static class Builder extends com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder {

        /* renamed from: zzaj */
        private long f6054x394b69 = -1;

        /* renamed from: zzak */
        private long f6055x394b6a = -1;

        public Builder() {
            this.f6080x78c5e369 = false;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: build */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e mo18723x59bc66e() {
            mo18724x10454de0();
            return new com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e(this, (com.p176xb6135e39.p177xcca8366f.gms.gcm.zzi) null);
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: checkConditions */
        public void mo18724x10454de0() {
            super.mo18724x10454de0();
            long j17 = this.f6054x394b69;
            if (j17 != -1) {
                long j18 = this.f6055x394b6a;
                if (j18 != -1) {
                    if (j17 >= j18) {
                        throw new java.lang.IllegalArgumentException("Window start must be shorter than window end.");
                    }
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }

        /* renamed from: setExecutionWindow */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder m18725x70038c66(long j17, long j18) {
            this.f6054x394b69 = j17;
            this.f6055x394b6a = j18;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setExtras */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18726xb774565(android.os.Bundle bundle) {
            this.f6078xb32aee63 = bundle;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setPersisted */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18727x8e49d331(boolean z17) {
            this.f6080x78c5e369 = z17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setRequiredNetwork */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18728xc605b0cd(int i17) {
            this.f6081xc482b042 = i17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setRequiresCharging */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18729xb20260c1(boolean z17) {
            this.f6082x662d643f = z17;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setService */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18730x27824ff3(java.lang.Class<? extends com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf> cls) {
            this.f6079xadc18d9f = cls.getName();
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setTag */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18731xca0297d8(java.lang.String str) {
            this.tag = str;
            return this;
        }

        @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.Builder
        /* renamed from: setUpdateCurrent */
        public com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder mo18732x3a377b2e(boolean z17) {
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
    private C2042xb78f568e(android.os.Parcel parcel) {
        super(parcel);
        this.f6052x394b69 = parcel.readLong();
        this.f6053x394b6a = parcel.readLong();
    }

    /* renamed from: getWindowEnd */
    public long m18719xf27de015() {
        return this.f6053x394b6a;
    }

    /* renamed from: getWindowStart */
    public long m18720x4b4e351c() {
        return this.f6052x394b69;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5
    /* renamed from: toBundle */
    public void mo18721x792022dd(android.os.Bundle bundle) {
        super.mo18721x792022dd(bundle);
        bundle.putLong("window_start", this.f6052x394b69);
        bundle.putLong("window_end", this.f6053x394b6a);
    }

    /* renamed from: toString */
    public java.lang.String m18722x9616526c() {
        java.lang.String obj = super.toString();
        long m18720x4b4e351c = m18720x4b4e351c();
        long m18719xf27de015 = m18719xf27de015();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 64);
        sb6.append(obj);
        sb6.append(" windowStart=");
        sb6.append(m18720x4b4e351c);
        sb6.append(" windowEnd=");
        sb6.append(m18719xf27de015);
        return sb6.toString();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeLong(this.f6052x394b69);
        parcel.writeLong(this.f6053x394b6a);
    }

    public /* synthetic */ C2042xb78f568e(android.os.Parcel parcel, com.p176xb6135e39.p177xcca8366f.gms.gcm.zzi zziVar) {
        this(parcel);
    }

    private C2042xb78f568e(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder builder) {
        super(builder);
        this.f6052x394b69 = builder.f6054x394b69;
        this.f6053x394b6a = builder.f6055x394b6a;
    }

    public /* synthetic */ C2042xb78f568e(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2042xb78f568e.Builder builder, com.p176xb6135e39.p177xcca8366f.gms.gcm.zzi zziVar) {
        this(builder);
    }
}

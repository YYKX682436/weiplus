package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public class PeriodicTask extends com.google.android.gms.gcm.Task {
    public static final android.os.Parcelable.Creator<com.google.android.gms.gcm.PeriodicTask> CREATOR = new com.google.android.gms.gcm.zzk();
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    /* loaded from: classes13.dex */
    public static class Builder extends com.google.android.gms.gcm.Task.Builder {
        private long zzam = -1;
        private long zzan = -1;

        public Builder() {
            this.isPersisted = true;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask build() {
            checkConditions();
            return new com.google.android.gms.gcm.PeriodicTask(this, (com.google.android.gms.gcm.zzk) null);
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public void checkConditions() {
            super.checkConditions();
            long j17 = this.zzam;
            if (j17 == -1) {
                throw new java.lang.IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (j17 <= 0) {
                long j18 = this.zzam;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(66);
                sb6.append("Period set cannot be less than or equal to 0: ");
                sb6.append(j18);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
            long j19 = this.zzan;
            if (j19 == -1) {
                this.zzan = ((float) j17) * 0.1f;
            } else if (j19 > j17) {
                this.zzan = j17;
            }
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setExtras(android.os.Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public com.google.android.gms.gcm.PeriodicTask.Builder setFlex(long j17) {
            this.zzan = j17;
            return this;
        }

        public com.google.android.gms.gcm.PeriodicTask.Builder setPeriod(long j17) {
            this.zzam = j17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setPersisted(boolean z17) {
            this.isPersisted = z17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setRequiredNetwork(int i17) {
            this.requiredNetworkState = i17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setRequiresCharging(boolean z17) {
            this.requiresCharging = z17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setService(java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> cls) {
            this.gcmTaskService = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setTag(java.lang.String str) {
            this.tag = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.PeriodicTask.Builder setUpdateCurrent(boolean z17) {
            this.updateCurrent = z17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public /* bridge */ /* synthetic */ com.google.android.gms.gcm.Task.Builder setService(java.lang.Class cls) {
            return setService((java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService>) cls);
        }
    }

    @java.lang.Deprecated
    private PeriodicTask(android.os.Parcel parcel) {
        super(parcel);
        this.mIntervalInSeconds = -1L;
        this.mFlexInSeconds = -1L;
        this.mIntervalInSeconds = parcel.readLong();
        this.mFlexInSeconds = java.lang.Math.min(parcel.readLong(), this.mIntervalInSeconds);
    }

    public long getFlex() {
        return this.mFlexInSeconds;
    }

    public long getPeriod() {
        return this.mIntervalInSeconds;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(android.os.Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("period", this.mIntervalInSeconds);
        bundle.putLong("period_flex", this.mFlexInSeconds);
    }

    public java.lang.String toString() {
        java.lang.String obj = super.toString();
        long period = getPeriod();
        long flex = getFlex();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 54);
        sb6.append(obj);
        sb6.append(" period=");
        sb6.append(period);
        sb6.append(" flex=");
        sb6.append(flex);
        return sb6.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeLong(this.mIntervalInSeconds);
        parcel.writeLong(this.mFlexInSeconds);
    }

    public /* synthetic */ PeriodicTask(android.os.Parcel parcel, com.google.android.gms.gcm.zzk zzkVar) {
        this(parcel);
    }

    private PeriodicTask(com.google.android.gms.gcm.PeriodicTask.Builder builder) {
        super(builder);
        this.mIntervalInSeconds = -1L;
        this.mFlexInSeconds = -1L;
        this.mIntervalInSeconds = builder.zzam;
        this.mFlexInSeconds = java.lang.Math.min(builder.zzan, this.mIntervalInSeconds);
    }

    public /* synthetic */ PeriodicTask(com.google.android.gms.gcm.PeriodicTask.Builder builder, com.google.android.gms.gcm.zzk zzkVar) {
        this(builder);
    }
}

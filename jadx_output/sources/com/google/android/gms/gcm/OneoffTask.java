package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public class OneoffTask extends com.google.android.gms.gcm.Task {
    public static final android.os.Parcelable.Creator<com.google.android.gms.gcm.OneoffTask> CREATOR = new com.google.android.gms.gcm.zzi();
    private final long zzaj;
    private final long zzak;

    /* loaded from: classes13.dex */
    public static class Builder extends com.google.android.gms.gcm.Task.Builder {
        private long zzaj = -1;
        private long zzak = -1;

        public Builder() {
            this.isPersisted = false;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask build() {
            checkConditions();
            return new com.google.android.gms.gcm.OneoffTask(this, (com.google.android.gms.gcm.zzi) null);
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public void checkConditions() {
            super.checkConditions();
            long j17 = this.zzaj;
            if (j17 != -1) {
                long j18 = this.zzak;
                if (j18 != -1) {
                    if (j17 >= j18) {
                        throw new java.lang.IllegalArgumentException("Window start must be shorter than window end.");
                    }
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }

        public com.google.android.gms.gcm.OneoffTask.Builder setExecutionWindow(long j17, long j18) {
            this.zzaj = j17;
            this.zzak = j18;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setExtras(android.os.Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setPersisted(boolean z17) {
            this.isPersisted = z17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setRequiredNetwork(int i17) {
            this.requiredNetworkState = i17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setRequiresCharging(boolean z17) {
            this.requiresCharging = z17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setService(java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> cls) {
            this.gcmTaskService = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setTag(java.lang.String str) {
            this.tag = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public com.google.android.gms.gcm.OneoffTask.Builder setUpdateCurrent(boolean z17) {
            this.updateCurrent = z17;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public /* bridge */ /* synthetic */ com.google.android.gms.gcm.Task.Builder setService(java.lang.Class cls) {
            return setService((java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService>) cls);
        }
    }

    @java.lang.Deprecated
    private OneoffTask(android.os.Parcel parcel) {
        super(parcel);
        this.zzaj = parcel.readLong();
        this.zzak = parcel.readLong();
    }

    public long getWindowEnd() {
        return this.zzak;
    }

    public long getWindowStart() {
        return this.zzaj;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(android.os.Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.zzaj);
        bundle.putLong("window_end", this.zzak);
    }

    public java.lang.String toString() {
        java.lang.String obj = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(obj).length() + 64);
        sb6.append(obj);
        sb6.append(" windowStart=");
        sb6.append(windowStart);
        sb6.append(" windowEnd=");
        sb6.append(windowEnd);
        return sb6.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeLong(this.zzaj);
        parcel.writeLong(this.zzak);
    }

    public /* synthetic */ OneoffTask(android.os.Parcel parcel, com.google.android.gms.gcm.zzi zziVar) {
        this(parcel);
    }

    private OneoffTask(com.google.android.gms.gcm.OneoffTask.Builder builder) {
        super(builder);
        this.zzaj = builder.zzaj;
        this.zzak = builder.zzak;
    }

    public /* synthetic */ OneoffTask(com.google.android.gms.gcm.OneoffTask.Builder builder, com.google.android.gms.gcm.zzi zziVar) {
        this(builder);
    }
}

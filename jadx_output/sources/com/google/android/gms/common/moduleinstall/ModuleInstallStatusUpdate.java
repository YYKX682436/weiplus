package com.google.android.gms.common.moduleinstall;

/* loaded from: classes13.dex */
public class ModuleInstallStatusUpdate extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate> CREATOR = new com.google.android.gms.common.moduleinstall.zae();
    private final int zaa;
    private final int zab;
    private final java.lang.Long zac;
    private final java.lang.Long zad;
    private final int zae;
    private final com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo zaf;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes6.dex */
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    /* loaded from: classes13.dex */
    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        public ProgressInfo(long j17, long j18) {
            com.google.android.gms.common.internal.Preconditions.checkNotZero(j18);
            this.zaa = j17;
            this.zab = j18;
        }

        public long getBytesDownloaded() {
            return this.zaa;
        }

        public long getTotalBytesToDownload() {
            return this.zab;
        }
    }

    public ModuleInstallStatusUpdate(int i17, int i18, java.lang.Long l17, java.lang.Long l18, int i19) {
        this.zaa = i17;
        this.zab = i18;
        this.zac = l17;
        this.zad = l18;
        this.zae = i19;
        this.zaf = (l17 == null || l18 == null || l18.longValue() == 0) ? null : new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo(l17.longValue(), l18.longValue());
    }

    public int getErrorCode() {
        return this.zae;
    }

    public int getInstallState() {
        return this.zab;
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo getProgressInfo() {
        return this.zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getInstallState());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 3, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 4, this.zad, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getErrorCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

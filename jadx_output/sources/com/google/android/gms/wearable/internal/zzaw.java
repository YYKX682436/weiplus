package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzaw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzaw> CREATOR = new com.google.android.gms.wearable.internal.zzax();
    private final int type;
    private final int zzcj;
    private final com.google.android.gms.wearable.internal.zzay zzck;
    private final int zzg;

    public zzaw(com.google.android.gms.wearable.internal.zzay zzayVar, int i17, int i18, int i19) {
        this.zzck = zzayVar;
        this.type = i17;
        this.zzg = i18;
        this.zzcj = i19;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzck);
        int i17 = this.type;
        java.lang.String num = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? java.lang.Integer.toString(i17) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i18 = this.zzg;
        java.lang.String num2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? java.lang.Integer.toString(i18) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i19 = this.zzcj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 81 + java.lang.String.valueOf(num).length() + java.lang.String.valueOf(num2).length());
        sb6.append("ChannelEventParcelable[, channel=");
        sb6.append(valueOf);
        sb6.append(", type=");
        sb6.append(num);
        sb6.append(", closeReason=");
        sb6.append(num2);
        sb6.append(", appErrorCode=");
        sb6.append(i19);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzck, i17, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.type);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzcj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zza(com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        int i17 = this.type;
        if (i17 == 1) {
            channelListener.onChannelOpened(this.zzck);
            return;
        }
        if (i17 == 2) {
            channelListener.onChannelClosed(this.zzck, this.zzg, this.zzcj);
        } else if (i17 == 3) {
            channelListener.onInputClosed(this.zzck, this.zzg, this.zzcj);
        } else {
            if (i17 != 4) {
                return;
            }
            channelListener.onOutputClosed(this.zzck, this.zzg, this.zzcj);
        }
    }
}

package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzay extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel {
    public static final android.os.Parcelable.Creator<com.google.android.gms.wearable.internal.zzay> CREATOR = new com.google.android.gms.wearable.internal.zzbi();
    private final java.lang.String zzce;
    private final java.lang.String zzcl;
    private final java.lang.String zzo;

    public zzay(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzce = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzo = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str2);
        this.zzcl = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        return com.google.android.gms.wearable.internal.zzb.zza(googleApiClient, new com.google.android.gms.wearable.internal.zzbf(this.zzce, new android.content.IntentFilter[]{com.google.android.gms.wearable.internal.zzgj.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> close(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzaz(this, googleApiClient));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.wearable.internal.zzay)) {
            return false;
        }
        com.google.android.gms.wearable.internal.zzay zzayVar = (com.google.android.gms.wearable.internal.zzay) obj;
        return this.zzce.equals(zzayVar.zzce) && com.google.android.gms.common.internal.Objects.equal(zzayVar.zzo, this.zzo) && com.google.android.gms.common.internal.Objects.equal(zzayVar.zzcl, this.zzcl);
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.Channel.GetInputStreamResult> getInputStream(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzbb(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel
    public final java.lang.String getNodeId() {
        return this.zzo;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.Channel.GetOutputStreamResult> getOutputStream(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzbc(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.Channel, com.google.android.gms.wearable.ChannelClient.Channel
    public final java.lang.String getPath() {
        return this.zzcl;
    }

    public final int hashCode() {
        return this.zzce.hashCode();
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> receiveFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(uri, "uri is null");
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzbd(this, googleApiClient, uri, z17));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(channelListener, "listener is null");
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzan(googleApiClient, channelListener, this.zzce));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri) {
        return sendFile(googleApiClient, uri, 0L, -1L);
    }

    public final java.lang.String toString() {
        int i17 = 0;
        for (char c17 : this.zzce.toCharArray()) {
            i17 += c17;
        }
        java.lang.String trim = this.zzce.trim();
        int length = trim.length();
        if (length > 25) {
            java.lang.String substring = trim.substring(0, 10);
            java.lang.String substring2 = trim.substring(length - 10, length);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 16 + java.lang.String.valueOf(substring2).length());
            sb6.append(substring);
            sb6.append("...");
            sb6.append(substring2);
            sb6.append("::");
            sb6.append(i17);
            trim = sb6.toString();
        }
        java.lang.String str = this.zzo;
        java.lang.String str2 = this.zzcl;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(trim).length() + 31 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str2).length());
        sb7.append("Channel{token=");
        sb7.append(trim);
        sb7.append(", nodeId=");
        sb7.append(str);
        sb7.append(", path=");
        sb7.append(str2);
        sb7.append("}");
        return sb7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzce, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getNodeId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getPath(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zzc() {
        return this.zzce;
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> close(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i17) {
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzba(this, googleApiClient, i17));
    }

    @Override // com.google.android.gms.wearable.Channel
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, long j17, long j18) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiClient, "client is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzce, "token is null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(uri, "uri is null");
        boolean z17 = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(j17 >= 0, "startOffset is negative: %s", java.lang.Long.valueOf(j17));
        if (j18 < 0 && j18 != -1) {
            z17 = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z17, "invalid length: %s", java.lang.Long.valueOf(j18));
        return googleApiClient.enqueue(new com.google.android.gms.wearable.internal.zzbe(this, googleApiClient, uri, j17, j18));
    }
}

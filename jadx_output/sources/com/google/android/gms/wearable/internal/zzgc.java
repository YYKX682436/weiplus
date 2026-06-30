package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzgc implements com.google.android.gms.wearable.ChannelApi.ChannelListener {
    private final java.lang.String zzce;
    private final com.google.android.gms.wearable.ChannelApi.ChannelListener zzeq;

    public zzgc(java.lang.String str, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener) {
        this.zzce = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzeq = (com.google.android.gms.wearable.ChannelApi.ChannelListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(channelListener);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.wearable.internal.zzgc)) {
            return false;
        }
        com.google.android.gms.wearable.internal.zzgc zzgcVar = (com.google.android.gms.wearable.internal.zzgc) obj;
        return this.zzeq.equals(zzgcVar.zzeq) && this.zzce.equals(zzgcVar.zzce);
    }

    public final int hashCode() {
        return (this.zzce.hashCode() * 31) + this.zzeq.hashCode();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
        this.zzeq.onChannelClosed(channel, i17, i18);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelOpened(com.google.android.gms.wearable.Channel channel) {
        this.zzeq.onChannelOpened(channel);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onInputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
        this.zzeq.onInputClosed(channel, i17, i18);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onOutputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
        this.zzeq.onOutputClosed(channel, i17, i18);
    }
}

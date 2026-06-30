package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzas implements com.google.android.gms.wearable.ChannelApi.ChannelListener {
    private final com.google.android.gms.wearable.ChannelClient.ChannelCallback zzch;

    public zzas(com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback) {
        this.zzch = channelCallback;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.gms.wearable.internal.zzas.class != obj.getClass()) {
            return false;
        }
        return this.zzch.equals(((com.google.android.gms.wearable.internal.zzas) obj).zzch);
    }

    public final int hashCode() {
        return this.zzch.hashCode();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
        this.zzch.onChannelClosed(com.google.android.gms.wearable.internal.zzao.zzb(channel), i17, i18);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelOpened(com.google.android.gms.wearable.Channel channel) {
        this.zzch.onChannelOpened(com.google.android.gms.wearable.internal.zzao.zzb(channel));
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onInputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
        this.zzch.onInputClosed(com.google.android.gms.wearable.internal.zzao.zzb(channel), i17, i18);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onOutputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18) {
        this.zzch.onOutputClosed(com.google.android.gms.wearable.internal.zzao.zzb(channel), i17, i18);
    }
}

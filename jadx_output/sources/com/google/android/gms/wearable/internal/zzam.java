package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzam implements com.google.android.gms.wearable.ChannelApi.OpenChannelResult {
    private final com.google.android.gms.wearable.Channel zzcd;
    private final com.google.android.gms.common.api.Status zzp;

    public zzam(com.google.android.gms.common.api.Status status, com.google.android.gms.wearable.Channel channel) {
        this.zzp = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status);
        this.zzcd = channel;
    }

    @Override // com.google.android.gms.wearable.ChannelApi.OpenChannelResult
    public final com.google.android.gms.wearable.Channel getChannel() {
        return this.zzcd;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

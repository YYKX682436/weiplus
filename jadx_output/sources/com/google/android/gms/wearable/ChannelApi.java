package com.google.android.gms.wearable;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface ChannelApi {
    public static final java.lang.String ACTION_CHANNEL_EVENT = "com.google.android.gms.wearable.CHANNEL_EVENT";

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface ChannelListener {
        public static final int CLOSE_REASON_DISCONNECTED = 1;
        public static final int CLOSE_REASON_LOCAL_CLOSE = 3;
        public static final int CLOSE_REASON_NORMAL = 0;
        public static final int CLOSE_REASON_REMOTE_CLOSE = 2;

        void onChannelClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18);

        void onChannelOpened(com.google.android.gms.wearable.Channel channel);

        void onInputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18);

        void onOutputClosed(com.google.android.gms.wearable.Channel channel, int i17, int i18);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CloseReason {
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface OpenChannelResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.wearable.Channel getChannel();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.ChannelApi.OpenChannelResult> openChannel(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener);
}

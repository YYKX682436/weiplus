package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public abstract class ChannelClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.wearable.Wearable.WearableOptions> {
    public static final java.lang.String ACTION_CHANNEL_EVENT = "com.google.android.gms.wearable.CHANNEL_EVENT";

    /* loaded from: classes6.dex */
    public interface Channel extends android.os.Parcelable {
        java.lang.String getNodeId();

        java.lang.String getPath();
    }

    /* loaded from: classes13.dex */
    public static abstract class ChannelCallback {
        public static final int CLOSE_REASON_DISCONNECTED = 1;
        public static final int CLOSE_REASON_LOCAL_CLOSE = 3;
        public static final int CLOSE_REASON_NORMAL = 0;
        public static final int CLOSE_REASON_REMOTE_CLOSE = 2;

        public void onChannelClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
        }

        public void onChannelOpened(com.google.android.gms.wearable.ChannelClient.Channel channel) {
        }

        public void onInputClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
        }

        public void onOutputClosed(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17, int i18) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CloseReason {
    }

    public ChannelClient(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> close(com.google.android.gms.wearable.ChannelClient.Channel channel);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> close(com.google.android.gms.wearable.ChannelClient.Channel channel, int i17);

    public abstract com.google.android.gms.tasks.Task<java.io.InputStream> getInputStream(com.google.android.gms.wearable.ChannelClient.Channel channel);

    public abstract com.google.android.gms.tasks.Task<java.io.OutputStream> getOutputStream(com.google.android.gms.wearable.ChannelClient.Channel channel);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.ChannelClient.Channel> openChannel(java.lang.String str, java.lang.String str2);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> receiveFile(com.google.android.gms.wearable.ChannelClient.Channel channel, android.net.Uri uri, boolean z17);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> registerChannelCallback(com.google.android.gms.wearable.ChannelClient.Channel channel, com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> registerChannelCallback(com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> sendFile(com.google.android.gms.wearable.ChannelClient.Channel channel, android.net.Uri uri);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> sendFile(com.google.android.gms.wearable.ChannelClient.Channel channel, android.net.Uri uri, long j17, long j18);

    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterChannelCallback(com.google.android.gms.wearable.ChannelClient.Channel channel, com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback);

    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> unregisterChannelCallback(com.google.android.gms.wearable.ChannelClient.ChannelCallback channelCallback);

    public ChannelClient(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }
}

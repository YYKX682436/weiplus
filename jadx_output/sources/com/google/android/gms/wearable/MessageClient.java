package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public abstract class MessageClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.wearable.Wearable.WearableOptions> {
    public static final java.lang.String ACTION_MESSAGE_RECEIVED = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    /* loaded from: classes13.dex */
    public interface OnMessageReceivedListener extends com.google.android.gms.wearable.MessageApi.MessageListener {
        @Override // com.google.android.gms.wearable.MessageApi.MessageListener
        void onMessageReceived(com.google.android.gms.wearable.MessageEvent messageEvent);
    }

    public MessageClient(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener, android.net.Uri uri, int i17);

    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.MessageClient.OnMessageReceivedListener onMessageReceivedListener);

    public abstract com.google.android.gms.tasks.Task<java.lang.Integer> sendMessage(java.lang.String str, java.lang.String str2, byte[] bArr);

    public MessageClient(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }
}

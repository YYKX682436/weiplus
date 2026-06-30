package com.google.android.gms.wearable;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface MessageApi {
    public static final java.lang.String ACTION_MESSAGE_RECEIVED = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;
    public static final int UNKNOWN_REQUEST_ID = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface MessageListener {
        void onMessageReceived(com.google.android.gms.wearable.MessageEvent messageEvent);
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface SendMessageResult extends com.google.android.gms.common.api.Result {
        int getRequestId();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener, android.net.Uri uri, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.MessageApi.MessageListener messageListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.MessageApi.SendMessageResult> sendMessage(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, byte[] bArr);
}

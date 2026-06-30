package com.google.android.gms.wearable;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface Channel extends android.os.Parcelable {

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetInputStreamResult extends com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
        java.io.InputStream getInputStream();
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetOutputStreamResult extends com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
        java.io.OutputStream getOutputStream();
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> close(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> close(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.Channel.GetInputStreamResult> getInputStream(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    java.lang.String getNodeId();

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.Channel.GetOutputStreamResult> getOutputStream(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    java.lang.String getPath();

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> receiveFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, boolean z17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> sendFile(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.net.Uri uri, long j17, long j18);
}

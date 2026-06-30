package com.google.android.gms.wearable;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public interface CapabilityApi {
    public static final java.lang.String ACTION_CAPABILITY_CHANGED = "com.google.android.gms.wearable.CAPABILITY_CHANGED";
    public static final int FILTER_ALL = 0;
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;
    public static final int FILTER_REACHABLE = 1;

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface AddLocalCapabilityResult extends com.google.android.gms.common.api.Result {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CapabilityFilterType {
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface CapabilityListener {
        void onCapabilityChanged(com.google.android.gms.wearable.CapabilityInfo capabilityInfo);
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetAllCapabilitiesResult extends com.google.android.gms.common.api.Result {
        java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo> getAllCapabilities();
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface GetCapabilityResult extends com.google.android.gms.common.api.Result {
        com.google.android.gms.wearable.CapabilityInfo getCapability();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface NodeFilterType {
    }

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface RemoveLocalCapabilityResult extends com.google.android.gms.common.api.Result {
    }

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addCapabilityListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> addListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, android.net.Uri uri, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult> addLocalCapability(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult> getAllCapabilities(com.google.android.gms.common.api.GoogleApiClient googleApiClient, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult> getCapability(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, int i17);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeCapabilityListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeListener(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult> removeLocalCapability(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);
}

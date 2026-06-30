package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public abstract class CapabilityClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.wearable.Wearable.WearableOptions> {
    public static final java.lang.String ACTION_CAPABILITY_CHANGED = "com.google.android.gms.wearable.CAPABILITY_CHANGED";
    public static final int FILTER_ALL = 0;
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;
    public static final int FILTER_REACHABLE = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CapabilityFilterType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface NodeFilterType {
    }

    /* loaded from: classes13.dex */
    public interface OnCapabilityChangedListener extends com.google.android.gms.wearable.CapabilityApi.CapabilityListener {
        @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
        void onCapabilityChanged(com.google.android.gms.wearable.CapabilityInfo capabilityInfo);
    }

    public CapabilityClient(android.app.Activity activity, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, android.net.Uri uri, int i17);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> addLocalCapability(java.lang.String str);

    public abstract com.google.android.gms.tasks.Task<java.util.Map<java.lang.String, com.google.android.gms.wearable.CapabilityInfo>> getAllCapabilities(int i17);

    public abstract com.google.android.gms.tasks.Task<com.google.android.gms.wearable.CapabilityInfo> getCapability(java.lang.String str, int i17);

    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener);

    public abstract com.google.android.gms.tasks.Task<java.lang.Boolean> removeListener(com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, java.lang.String str);

    public abstract com.google.android.gms.tasks.Task<java.lang.Void> removeLocalCapability(java.lang.String str);

    public CapabilityClient(android.content.Context context, com.google.android.gms.common.api.GoogleApi.Settings settings) {
        super(context, com.google.android.gms.wearable.Wearable.API, (com.google.android.gms.common.api.Api.ApiOptions) null, settings);
    }
}

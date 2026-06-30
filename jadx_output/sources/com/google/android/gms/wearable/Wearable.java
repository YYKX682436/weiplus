package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class Wearable {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.wearable.Wearable.WearableOptions> API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder<com.google.android.gms.wearable.internal.zzhg, com.google.android.gms.wearable.Wearable.WearableOptions> CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.wearable.internal.zzhg> CLIENT_KEY;

    @java.lang.Deprecated
    public static final com.google.android.gms.wearable.DataApi DataApi = new com.google.android.gms.wearable.internal.zzbw();

    @java.lang.Deprecated
    public static final com.google.android.gms.wearable.CapabilityApi CapabilityApi = new com.google.android.gms.wearable.internal.zzo();

    @java.lang.Deprecated
    public static final com.google.android.gms.wearable.MessageApi MessageApi = new com.google.android.gms.wearable.internal.zzeu();

    @java.lang.Deprecated
    public static final com.google.android.gms.wearable.NodeApi NodeApi = new com.google.android.gms.wearable.internal.zzfg();

    @java.lang.Deprecated
    public static final com.google.android.gms.wearable.ChannelApi ChannelApi = new com.google.android.gms.wearable.internal.zzaj();

    @java.lang.Deprecated
    private static final com.google.android.gms.wearable.zzc zzx = new com.google.android.gms.wearable.internal.zzk();

    @java.lang.Deprecated
    private static final com.google.android.gms.wearable.zza zzy = new com.google.android.gms.wearable.internal.zzh();

    @java.lang.Deprecated
    private static final com.google.android.gms.wearable.zzf zzz = new com.google.android.gms.wearable.internal.zzbv();

    @java.lang.Deprecated
    private static final com.google.android.gms.wearable.zzi zzaa = new com.google.android.gms.wearable.internal.zzgi();

    @java.lang.Deprecated
    private static final com.google.android.gms.wearable.zzu zzab = new com.google.android.gms.wearable.internal.zzhq();

    /* loaded from: classes13.dex */
    public static final class WearableOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
        private final android.os.Looper zzac;

        /* loaded from: classes13.dex */
        public static class Builder {
            private android.os.Looper zzac;

            public com.google.android.gms.wearable.Wearable.WearableOptions build() {
                return new com.google.android.gms.wearable.Wearable.WearableOptions(this, null);
            }

            public com.google.android.gms.wearable.Wearable.WearableOptions.Builder setLooper(android.os.Looper looper) {
                this.zzac = looper;
                return this;
            }
        }

        private WearableOptions(com.google.android.gms.wearable.Wearable.WearableOptions.Builder builder) {
            this.zzac = builder.zzac;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.google.android.gms.common.api.GoogleApi.Settings zza() {
            return this.zzac != null ? new com.google.android.gms.common.api.GoogleApi.Settings.Builder().setLooper(this.zzac).build() : com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS;
        }

        public /* synthetic */ WearableOptions(com.google.android.gms.wearable.Wearable.WearableOptions.Builder builder, com.google.android.gms.wearable.zzj zzjVar) {
            this(builder);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.wearable.internal.zzk, com.google.android.gms.wearable.zzc] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.wearable.zza, com.google.android.gms.wearable.internal.zzh] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.wearable.internal.zzbv, com.google.android.gms.wearable.zzf] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.wearable.zzi, com.google.android.gms.wearable.internal.zzgi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.wearable.internal.zzhq, com.google.android.gms.wearable.zzu] */
    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.wearable.internal.zzhg> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.wearable.zzj zzjVar = new com.google.android.gms.wearable.zzj();
        CLIENT_BUILDER = zzjVar;
        API = new com.google.android.gms.common.api.Api<>("Wearable.API", zzjVar, clientKey);
    }

    private Wearable() {
    }

    public static com.google.android.gms.wearable.CapabilityClient getCapabilityClient(android.app.Activity activity) {
        return new com.google.android.gms.wearable.internal.zzaa(activity, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.ChannelClient getChannelClient(android.app.Activity activity) {
        return new com.google.android.gms.wearable.internal.zzao(activity, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.DataClient getDataClient(android.app.Activity activity) {
        return new com.google.android.gms.wearable.internal.zzcj(activity, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.MessageClient getMessageClient(android.app.Activity activity) {
        return new com.google.android.gms.wearable.internal.zzez(activity, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.NodeClient getNodeClient(android.app.Activity activity) {
        return new com.google.android.gms.wearable.internal.zzfl(activity, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.CapabilityClient getCapabilityClient(android.app.Activity activity, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzaa(activity, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.ChannelClient getChannelClient(android.app.Activity activity, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzao(activity, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.DataClient getDataClient(android.app.Activity activity, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzcj(activity, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.MessageClient getMessageClient(android.app.Activity activity, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzez(activity, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.NodeClient getNodeClient(android.app.Activity activity, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzfl(activity, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.CapabilityClient getCapabilityClient(android.content.Context context) {
        return new com.google.android.gms.wearable.internal.zzaa(context, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.ChannelClient getChannelClient(android.content.Context context) {
        return new com.google.android.gms.wearable.internal.zzao(context, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.DataClient getDataClient(android.content.Context context) {
        return new com.google.android.gms.wearable.internal.zzcj(context, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.MessageClient getMessageClient(android.content.Context context) {
        return new com.google.android.gms.wearable.internal.zzez(context, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.NodeClient getNodeClient(android.content.Context context) {
        return new com.google.android.gms.wearable.internal.zzfl(context, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static com.google.android.gms.wearable.CapabilityClient getCapabilityClient(android.content.Context context, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzaa(context, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.ChannelClient getChannelClient(android.content.Context context, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzao(context, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.DataClient getDataClient(android.content.Context context, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzcj(context, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.MessageClient getMessageClient(android.content.Context context, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzez(context, wearableOptions.zza());
    }

    public static com.google.android.gms.wearable.NodeClient getNodeClient(android.content.Context context, com.google.android.gms.wearable.Wearable.WearableOptions wearableOptions) {
        m3.h.d(wearableOptions, "options must not be null");
        return new com.google.android.gms.wearable.internal.zzfl(context, wearableOptions.zza());
    }
}

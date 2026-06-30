package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzhg extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.wearable.internal.zzep> {
    private final java.util.concurrent.ExecutorService zzew;
    private final com.google.android.gms.wearable.internal.zzer<java.lang.Object> zzex;
    private final com.google.android.gms.wearable.internal.zzer<java.lang.Object> zzey;
    private final com.google.android.gms.wearable.internal.zzer<com.google.android.gms.wearable.ChannelApi.ChannelListener> zzez;
    private final com.google.android.gms.wearable.internal.zzer<com.google.android.gms.wearable.DataApi.DataListener> zzfa;
    private final com.google.android.gms.wearable.internal.zzer<com.google.android.gms.wearable.MessageApi.MessageListener> zzfb;
    private final com.google.android.gms.wearable.internal.zzer<java.lang.Object> zzfc;
    private final com.google.android.gms.wearable.internal.zzer<java.lang.Object> zzfd;
    private final com.google.android.gms.wearable.internal.zzer<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> zzfe;
    private final com.google.android.gms.wearable.internal.zzhp zzff;

    public zzhg(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, java.util.concurrent.Executors.newCachedThreadPool(), com.google.android.gms.wearable.internal.zzhp.zza(context));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        if (!requiresGooglePlayServices()) {
            try {
                android.os.Bundle bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if ((bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0) < com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                    android.content.Context context = getContext();
                    android.content.Context context2 = getContext();
                    android.content.Intent intent = new android.content.Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details").buildUpon().appendQueryParameter(dm.i4.COL_ID, "com.google.android.wearable.app.cn").build());
                    }
                    triggerNotAvailable(connectionProgressReportCallbacks, 6, android.app.PendingIntent.getActivity(context, 0, intent, 0));
                    return;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                triggerNotAvailable(connectionProgressReportCallbacks, 16, null);
                return;
            }
        }
        super.connect(connectionProgressReportCallbacks);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof com.google.android.gms.wearable.internal.zzep ? (com.google.android.gms.wearable.internal.zzep) queryLocalInterface : new com.google.android.gms.wearable.internal.zzeq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServicePackage() {
        return this.zzff.zze("com.google.android.wearable.app.cn") ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onPostInitHandler(int i17, android.os.IBinder iBinder, android.os.Bundle bundle, int i18) {
        android.util.Log.isLoggable("WearableClient", 2);
        if (i17 == 0) {
            this.zzex.zza(iBinder);
            this.zzey.zza(iBinder);
            this.zzez.zza(iBinder);
            this.zzfa.zza(iBinder);
            this.zzfb.zza(iBinder);
            this.zzfc.zza(iBinder);
            this.zzfd.zza(iBinder);
            this.zzfe.zza(iBinder);
        }
        super.onPostInitHandler(i17, iBinder, bundle, i18);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return !this.zzff.zze("com.google.android.wearable.app.cn");
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.DataApi.GetFdForAssetResult> resultHolder, com.google.android.gms.wearable.Asset asset) {
        ((com.google.android.gms.wearable.internal.zzep) getService()).zza(new com.google.android.gms.wearable.internal.zzgx(resultHolder), asset);
    }

    private zzhg(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.concurrent.ExecutorService executorService, com.google.android.gms.wearable.internal.zzhp zzhpVar) {
        super(context, looper, 14, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzex = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzey = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzez = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzfa = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzfb = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzfc = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzfd = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzfe = new com.google.android.gms.wearable.internal.zzer<>();
        this.zzew = (java.util.concurrent.ExecutorService) com.google.android.gms.common.internal.Preconditions.checkNotNull(executorService);
        this.zzff = zzhpVar;
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener) {
        this.zzfe.zza(this, resultHolder, capabilityListener);
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilityListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.CapabilityApi.CapabilityListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        this.zzfe.zza(this, resultHolder, capabilityListener, com.google.android.gms.wearable.internal.zzhk.zzd(listenerHolder, intentFilterArr));
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.ChannelApi.ChannelListener> listenerHolder, java.lang.String str, android.content.IntentFilter[] intentFilterArr) {
        if (str == null) {
            this.zzez.zza(this, resultHolder, channelListener, com.google.android.gms.wearable.internal.zzhk.zzc(listenerHolder, intentFilterArr));
        } else {
            this.zzez.zza(this, resultHolder, new com.google.android.gms.wearable.internal.zzgc(str, channelListener), com.google.android.gms.wearable.internal.zzhk.zza(listenerHolder, str, intentFilterArr));
        }
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.ChannelApi.ChannelListener channelListener, java.lang.String str) {
        if (str == null) {
            this.zzez.zza(this, resultHolder, channelListener);
        } else {
            this.zzez.zza(this, resultHolder, new com.google.android.gms.wearable.internal.zzgc(str, channelListener));
        }
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.DataApi.DataListener dataListener) {
        this.zzfa.zza(this, resultHolder, dataListener);
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.DataApi.DataListener dataListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.DataApi.DataListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        this.zzfa.zza(this, resultHolder, dataListener, com.google.android.gms.wearable.internal.zzhk.zza(listenerHolder, intentFilterArr));
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.MessageApi.MessageListener messageListener) {
        this.zzfb.zza(this, resultHolder, messageListener);
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, com.google.android.gms.wearable.MessageApi.MessageListener messageListener, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.wearable.MessageApi.MessageListener> listenerHolder, android.content.IntentFilter[] intentFilterArr) {
        this.zzfb.zza(this, resultHolder, messageListener, com.google.android.gms.wearable.internal.zzhk.zzb(listenerHolder, intentFilterArr));
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.wearable.DataApi.DataItemResult> resultHolder, com.google.android.gms.wearable.PutDataRequest putDataRequest) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.Asset>> it = putDataRequest.getAssets().entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.wearable.Asset value = it.next().getValue();
            if (value.getData() == null && value.getDigest() == null && value.getFd() == null && value.getUri() == null) {
                java.lang.String valueOf = java.lang.String.valueOf(putDataRequest.getUri());
                java.lang.String valueOf2 = java.lang.String.valueOf(value);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 33 + valueOf2.length());
                sb6.append("Put for ");
                sb6.append(valueOf);
                sb6.append(" contains invalid asset: ");
                sb6.append(valueOf2);
                throw new java.lang.IllegalArgumentException(sb6.toString());
            }
        }
        com.google.android.gms.wearable.PutDataRequest zza = com.google.android.gms.wearable.PutDataRequest.zza(putDataRequest.getUri());
        zza.setData(putDataRequest.getData());
        if (putDataRequest.isUrgent()) {
            zza.setUrgent();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.wearable.Asset> entry : putDataRequest.getAssets().entrySet()) {
            com.google.android.gms.wearable.Asset value2 = entry.getValue();
            if (value2.getData() != null) {
                try {
                    android.os.ParcelFileDescriptor[] createPipe = android.os.ParcelFileDescriptor.createPipe();
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(value2).length() + 61 + java.lang.String.valueOf(createPipe[0]).length() + java.lang.String.valueOf(createPipe[1]).length());
                    }
                    zza.putAsset(entry.getKey(), com.google.android.gms.wearable.Asset.createFromFd(createPipe[0]));
                    java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new com.google.android.gms.wearable.internal.zzhh(this, createPipe[1], value2.getData()));
                    arrayList.add(futureTask);
                    this.zzew.submit(futureTask);
                } catch (java.io.IOException e17) {
                    java.lang.String valueOf3 = java.lang.String.valueOf(putDataRequest);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf3.length() + 60);
                    sb7.append("Unable to create ParcelFileDescriptor for asset in request: ");
                    sb7.append(valueOf3);
                    throw new java.lang.IllegalStateException(sb7.toString(), e17);
                }
            } else if (value2.getUri() != null) {
                try {
                    zza.putAsset(entry.getKey(), com.google.android.gms.wearable.Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(value2.getUri(), "r")));
                } catch (java.io.FileNotFoundException unused) {
                    new com.google.android.gms.wearable.internal.zzhb(resultHolder, arrayList).zza(new com.google.android.gms.wearable.internal.zzfu(com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE, null));
                    new java.lang.StringBuilder(java.lang.String.valueOf(value2.getUri()).length() + 28);
                    return;
                }
            } else {
                zza.putAsset(entry.getKey(), value2);
            }
        }
        ((com.google.android.gms.wearable.internal.zzep) getService()).zza(new com.google.android.gms.wearable.internal.zzhb(resultHolder, arrayList), zza);
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str, android.net.Uri uri, long j17, long j18) {
        try {
            java.util.concurrent.ExecutorService executorService = this.zzew;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(uri);
            com.google.android.gms.common.internal.Preconditions.checkArgument(j17 >= 0, "startOffset is negative: %s", java.lang.Long.valueOf(j17));
            com.google.android.gms.common.internal.Preconditions.checkArgument(j18 >= -1, "invalid length: %s", java.lang.Long.valueOf(j18));
            executorService.execute(new com.google.android.gms.wearable.internal.zzhj(this, uri, resultHolder, str, j17, j18));
        } catch (java.lang.RuntimeException e17) {
            resultHolder.setFailedResult(new com.google.android.gms.common.api.Status(8));
            throw e17;
        }
    }

    public final void zza(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder, java.lang.String str, android.net.Uri uri, boolean z17) {
        try {
            java.util.concurrent.ExecutorService executorService = this.zzew;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(uri);
            executorService.execute(new com.google.android.gms.wearable.internal.zzhi(this, uri, resultHolder, z17, str));
        } catch (java.lang.RuntimeException e17) {
            resultHolder.setFailedResult(new com.google.android.gms.common.api.Status(8));
            throw e17;
        }
    }
}

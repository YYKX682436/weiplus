package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zacd implements com.google.android.gms.tasks.OnCompleteListener {
    private final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final int zab;
    private final com.google.android.gms.common.api.internal.ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i17, com.google.android.gms.common.api.internal.ApiKey apiKey, long j17, long j18, java.lang.String str, java.lang.String str2) {
        this.zaa = googleApiManager;
        this.zab = i17;
        this.zac = apiKey;
        this.zad = j17;
        this.zae = j18;
    }

    public static com.google.android.gms.common.api.internal.zacd zaa(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, int i17, com.google.android.gms.common.api.internal.ApiKey apiKey) {
        boolean z17;
        if (!googleApiManager.zaD()) {
            return null;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z17 = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z17 = config.getMethodTimingTelemetryEnabled();
            com.google.android.gms.common.api.internal.zabq zai = googleApiManager.zai(apiKey);
            if (zai != null) {
                if (!(zai.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                    return null;
                }
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zai.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i17);
                    if (zab == null) {
                        return null;
                    }
                    zai.zaq();
                    z17 = zab.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new com.google.android.gms.common.api.internal.zacd(googleApiManager, i17, apiKey, z17 ? java.lang.System.currentTimeMillis() : 0L, z17 ? android.os.SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i17) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i17) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !com.google.android.gms.common.util.ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i17))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        com.google.android.gms.common.api.internal.zabq zai;
        int i17;
        int i18;
        int i19;
        int errorCode;
        long j17;
        long j18;
        int i27;
        if (this.zaa.zaD()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof com.google.android.gms.common.internal.BaseGmsClient)) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = (com.google.android.gms.common.internal.BaseGmsClient) zai.zaf();
                int i28 = 0;
                boolean z17 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i29 = 100;
                if (config != null) {
                    z17 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i17 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                        if (zab == null) {
                            return;
                        }
                        boolean z18 = zab.getMethodTimingTelemetryEnabled() && this.zad > 0;
                        maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                        z17 = z18;
                    }
                    i19 = batchPeriodMillis;
                    i18 = maxMethodInvocationsInBatch;
                } else {
                    i17 = 0;
                    i18 = 100;
                    i19 = 5000;
                }
                com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (!task.isCanceled()) {
                        java.lang.Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.ApiException) {
                            com.google.android.gms.common.api.Status status = ((com.google.android.gms.common.api.ApiException) exception).getStatus();
                            i29 = status.getStatusCode();
                            com.google.android.gms.common.ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i28 = i29;
                            }
                        } else {
                            i28 = 101;
                            errorCode = -1;
                        }
                    }
                    i28 = i29;
                    errorCode = -1;
                }
                if (z17) {
                    long j19 = this.zad;
                    long j27 = this.zae;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    i27 = (int) (android.os.SystemClock.elapsedRealtime() - j27);
                    j18 = currentTimeMillis;
                    j17 = j19;
                } else {
                    j17 = 0;
                    j18 = 0;
                    i27 = -1;
                }
                googleApiManager.zaw(new com.google.android.gms.common.internal.MethodInvocation(this.zab, i28, errorCode, j17, j18, null, null, gCoreServiceId, i27), i17, i19, i18);
            }
        }
    }
}

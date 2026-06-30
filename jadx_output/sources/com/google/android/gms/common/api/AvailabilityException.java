package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public class AvailabilityException extends java.lang.Exception {
    private final x.b zaa;

    public AvailabilityException(x.b bVar) {
        this.zaa = bVar;
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> googleApi) {
        x.b bVar = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = googleApi.getApiKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(bVar.getOrDefault(apiKey, null) != null, "The given API (" + apiKey.zaa() + ") was not part of the availability request.");
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((x.j) this.zaa.keySet()).iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.ApiKey apiKey = (com.google.android.gms.common.api.internal.ApiKey) it.next();
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.getOrDefault(apiKey, null));
            z17 &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + java.lang.String.valueOf(connectionResult));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (z17) {
            sb6.append("None of the queried APIs are available. ");
        } else {
            sb6.append("Some of the queried APIs are unavailable. ");
        }
        sb6.append(android.text.TextUtils.join("; ", arrayList));
        return sb6.toString();
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> hasApiKey) {
        x.b bVar = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(bVar.getOrDefault(apiKey, null) != null, "The given API (" + apiKey.zaa() + ") was not part of the availability request.");
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }
}

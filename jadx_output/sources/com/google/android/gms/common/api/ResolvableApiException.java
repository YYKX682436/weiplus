package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {
    public ResolvableApiException(com.google.android.gms.common.api.Status status) {
        super(status);
    }

    public android.app.PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(android.app.Activity activity, int i17) {
        getStatus().startResolutionForResult(activity, i17);
    }
}

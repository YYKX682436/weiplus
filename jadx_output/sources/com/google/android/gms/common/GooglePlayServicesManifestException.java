package com.google.android.gms.common;

/* loaded from: classes13.dex */
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i17, java.lang.String str) {
        super(str);
        this.zza = i17;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}

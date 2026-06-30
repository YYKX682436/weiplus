package com.google.android.gms.common;

/* loaded from: classes13.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i17, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zza = i17;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}

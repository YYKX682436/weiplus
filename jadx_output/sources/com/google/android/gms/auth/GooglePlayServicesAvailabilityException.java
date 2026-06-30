package com.google.android.gms.auth;

/* loaded from: classes13.dex */
public class GooglePlayServicesAvailabilityException extends com.google.android.gms.auth.UserRecoverableAuthException {
    private final int zzx;

    public GooglePlayServicesAvailabilityException(int i17, java.lang.String str, android.content.Intent intent) {
        super(str, intent);
        this.zzx = i17;
    }

    public int getConnectionStatusCode() {
        return this.zzx;
    }
}

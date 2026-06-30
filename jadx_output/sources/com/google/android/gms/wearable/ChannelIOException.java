package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class ChannelIOException extends java.io.IOException {
    private final int zzg;
    private final int zzh;

    public ChannelIOException(java.lang.String str, int i17, int i18) {
        super(str);
        this.zzg = i17;
        this.zzh = i18;
    }

    public int getAppSpecificErrorCode() {
        return this.zzh;
    }

    public int getCloseReason() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.common;

/* loaded from: classes13.dex */
public class zzi extends android.os.Handler {
    private final android.os.Looper zza;

    public zzi() {
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzi(android.os.Looper looper) {
        super(looper);
        this.zza = android.os.Looper.getMainLooper();
    }

    public zzi(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.zza = android.os.Looper.getMainLooper();
    }
}

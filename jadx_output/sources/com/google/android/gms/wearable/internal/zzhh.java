package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhh implements java.util.concurrent.Callable<java.lang.Boolean> {
    private final /* synthetic */ byte[] zzee;
    private final /* synthetic */ android.os.ParcelFileDescriptor zzfg;

    public zzhh(com.google.android.gms.wearable.internal.zzhg zzhgVar, android.os.ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.zzfg = parcelFileDescriptor;
        this.zzee = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean call() {
        if (android.util.Log.isLoggable("WearableClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.zzfg).length() + 36);
        }
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(this.zzfg);
        try {
            try {
                autoCloseOutputStream.write(this.zzee);
                autoCloseOutputStream.flush();
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(this.zzfg).length() + 27);
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                try {
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(this.zzfg).length() + 24);
                    }
                    autoCloseOutputStream.close();
                } catch (java.io.IOException unused) {
                }
                return bool;
            } catch (java.io.IOException unused2) {
                new java.lang.StringBuilder(java.lang.String.valueOf(this.zzfg).length() + 36);
                try {
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(this.zzfg).length() + 24);
                    }
                    autoCloseOutputStream.close();
                } catch (java.io.IOException unused3) {
                }
                return java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Throwable th6) {
            try {
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(this.zzfg).length() + 24);
                }
                autoCloseOutputStream.close();
            } catch (java.io.IOException unused4) {
            }
            throw th6;
        }
    }
}

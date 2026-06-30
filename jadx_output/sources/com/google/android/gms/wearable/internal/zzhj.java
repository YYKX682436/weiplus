package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhj implements java.lang.Runnable {
    private final /* synthetic */ android.net.Uri zzco;
    private final /* synthetic */ long zzcq;
    private final /* synthetic */ long zzcr;
    private final /* synthetic */ java.lang.String zzcs;
    private final /* synthetic */ com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzhg zzfi;

    public zzhj(com.google.android.gms.wearable.internal.zzhg zzhgVar, android.net.Uri uri, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, java.lang.String str, long j17, long j18) {
        this.zzfi = zzhgVar;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcs = str;
        this.zzcq = j17;
        this.zzcr = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder;
        com.google.android.gms.common.api.Status status;
        android.util.Log.isLoggable("WearableClient", 2);
        if ("file".equals(this.zzco.getScheme())) {
            java.io.File file = new java.io.File(this.zzco.getPath());
            try {
                android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(file, 268435456);
                try {
                    try {
                        ((com.google.android.gms.wearable.internal.zzep) this.zzfi.getService()).zza(new com.google.android.gms.wearable.internal.zzhc(this.zzfh), this.zzcs, open, this.zzcq, this.zzcr);
                        try {
                            open.close();
                            return;
                        } catch (java.io.IOException unused) {
                            return;
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            open.close();
                        } catch (java.io.IOException unused2) {
                        }
                        throw th6;
                    }
                } catch (android.os.RemoteException unused3) {
                    this.zzfh.setFailedResult(new com.google.android.gms.common.api.Status(8));
                    try {
                        open.close();
                        return;
                    } catch (java.io.IOException unused4) {
                        return;
                    }
                }
            } catch (java.io.FileNotFoundException unused5) {
                new java.lang.StringBuilder(java.lang.String.valueOf(file).length() + 46);
                resultHolder = this.zzfh;
                status = new com.google.android.gms.common.api.Status(13);
            }
        } else {
            resultHolder = this.zzfh;
            status = new com.google.android.gms.common.api.Status(10, "Channel.sendFile used with non-file URI");
        }
        resultHolder.setFailedResult(status);
    }
}

package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
final class zzhi implements java.lang.Runnable {
    private final /* synthetic */ android.net.Uri zzco;
    private final /* synthetic */ boolean zzcp;
    private final /* synthetic */ java.lang.String zzcs;
    private final /* synthetic */ com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zzfh;
    private final /* synthetic */ com.google.android.gms.wearable.internal.zzhg zzfi;

    public zzhi(com.google.android.gms.wearable.internal.zzhg zzhgVar, android.net.Uri uri, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, boolean z17, java.lang.String str) {
        this.zzfi = zzhgVar;
        this.zzco = uri;
        this.zzfh = resultHolder;
        this.zzcp = z17;
        this.zzcs = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder;
        com.google.android.gms.common.api.Status status;
        android.util.Log.isLoggable("WearableClient", 2);
        if ("file".equals(this.zzco.getScheme())) {
            java.io.File file = new java.io.File(this.zzco.getPath());
            try {
                android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(file, (this.zzcp ? com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62 : 0) | com.tencent.mm.opensdk.constants.Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE);
                try {
                    try {
                        ((com.google.android.gms.wearable.internal.zzep) this.zzfi.getService()).zza(new com.google.android.gms.wearable.internal.zzhf(this.zzfh), this.zzcs, open);
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
                new java.lang.StringBuilder(java.lang.String.valueOf(file).length() + 49);
                resultHolder = this.zzfh;
                status = new com.google.android.gms.common.api.Status(13);
            }
        } else {
            resultHolder = this.zzfh;
            status = new com.google.android.gms.common.api.Status(10, "Channel.receiveFile used with non-file URI");
        }
        resultHolder.setFailedResult(status);
    }
}

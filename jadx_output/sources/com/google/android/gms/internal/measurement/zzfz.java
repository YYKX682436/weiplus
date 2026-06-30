package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzfz implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfx zzaky;

    private zzfz(com.google.android.gms.internal.measurement.zzfx zzfxVar) {
        this.zzaky = zzfxVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (iBinder == null) {
            com.google.android.gms.internal.measurement.zzfx.zza(this.zzaky).zzge().zzip().log("Install Referrer connection returned with null binder");
            return;
        }
        try {
            this.zzaky.zzakw = com.google.android.gms.internal.measurement.zzs.zza(iBinder);
            if (this.zzaky.zzakw == null) {
                com.google.android.gms.internal.measurement.zzfx.zza(this.zzaky).zzge().zzip().log("Install Referrer Service implementation was not found");
            } else {
                com.google.android.gms.internal.measurement.zzfx.zza(this.zzaky).zzge().zzir().log("Install Referrer Service connected");
                com.google.android.gms.internal.measurement.zzfx.zza(this.zzaky).zzgd().zzc(new com.google.android.gms.internal.measurement.zzga(this));
            }
        } catch (java.lang.Exception e17) {
            com.google.android.gms.internal.measurement.zzfx.zza(this.zzaky).zzge().zzip().zzg("Exception occurred while calling Install Referrer API", e17);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.zzaky.zzakw = null;
        com.google.android.gms.internal.measurement.zzfx.zza(this.zzaky).zzge().zzir().log("Install Referrer Service disconnected");
    }
}

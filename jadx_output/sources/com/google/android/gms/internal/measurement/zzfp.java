package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class zzfp extends android.content.BroadcastReceiver {
    private static final java.lang.String zzaaw = "com.google.android.gms.internal.measurement.zzfp";
    private boolean zzaax;
    private boolean zzaay;
    private final com.google.android.gms.internal.measurement.zzjr zzajp;

    public zzfp(com.google.android.gms.internal.measurement.zzjr zzjrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjrVar);
        this.zzajp = zzjrVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zzajp.zzkq();
        java.lang.String action = intent.getAction();
        this.zzajp.zzge().zzit().zzg("NetworkBroadcastReceiver received action", action);
        if (!io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(action)) {
            this.zzajp.zzge().zzip().zzg("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zzex = this.zzajp.zzkn().zzex();
        if (this.zzaay != zzex) {
            this.zzaay = zzex;
            this.zzajp.zzgd().zzc(new com.google.android.gms.internal.measurement.zzfq(this, zzex));
        }
    }

    public final void unregister() {
        this.zzajp.zzkq();
        this.zzajp.zzab();
        this.zzajp.zzab();
        if (this.zzaax) {
            this.zzajp.zzge().zzit().log("Unregistering connectivity change receiver");
            this.zzaax = false;
            this.zzaay = false;
            try {
                this.zzajp.getContext().unregisterReceiver(this);
            } catch (java.lang.IllegalArgumentException e17) {
                this.zzajp.zzge().zzim().zzg("Failed to unregister the network broadcast receiver", e17);
            }
        }
    }

    public final void zzeu() {
        this.zzajp.zzkq();
        this.zzajp.zzab();
        if (this.zzaax) {
            return;
        }
        this.zzajp.getContext().registerReceiver(this, new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        this.zzaay = this.zzajp.zzkn().zzex();
        this.zzajp.zzge().zzit().zzg("Registering connectivity change receiver. Network connected", java.lang.Boolean.valueOf(this.zzaay));
        this.zzaax = true;
    }
}

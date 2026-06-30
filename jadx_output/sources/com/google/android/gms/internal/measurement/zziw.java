package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zziw implements android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzii zzape;
    private volatile boolean zzapk;
    private volatile com.google.android.gms.internal.measurement.zzff zzapl;

    public zziw(com.google.android.gms.internal.measurement.zzii zziiVar) {
        this.zzape = zziiVar;
    }

    public static /* synthetic */ boolean zza(com.google.android.gms.internal.measurement.zziw zziwVar, boolean z17) {
        zziwVar.zzapk = false;
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.google.android.gms.internal.measurement.zzey service = this.zzapl.getService();
                this.zzapl = null;
                this.zzape.zzgd().zzc(new com.google.android.gms.internal.measurement.zziz(this, service));
            } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
                this.zzapl = null;
                this.zzapk = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        com.google.android.gms.internal.measurement.zzfg zzjo = this.zzape.zzacw.zzjo();
        if (zzjo != null) {
            zzjo.zzip().zzg("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzapk = false;
            this.zzapl = null;
        }
        this.zzape.zzgd().zzc(new com.google.android.gms.internal.measurement.zzjb(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i17) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zzape.zzge().zzis().log("Service connection suspended");
        this.zzape.zzgd().zzc(new com.google.android.gms.internal.measurement.zzja(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.internal.measurement.zziw zziwVar;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzapk = false;
                this.zzape.zzge().zzim().log("Service connected with null binder");
                return;
            }
            com.google.android.gms.internal.measurement.zzey zzeyVar = null;
            try {
                java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzeyVar = queryLocalInterface instanceof com.google.android.gms.internal.measurement.zzey ? (com.google.android.gms.internal.measurement.zzey) queryLocalInterface : new com.google.android.gms.internal.measurement.zzfa(iBinder);
                    this.zzape.zzge().zzit().log("Bound to IMeasurementService interface");
                } else {
                    this.zzape.zzge().zzim().zzg("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (android.os.RemoteException unused) {
                this.zzape.zzge().zzim().log("Service connect failed to get IMeasurementService");
            }
            if (zzeyVar == null) {
                this.zzapk = false;
                try {
                    com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
                    android.content.Context context = this.zzape.getContext();
                    zziwVar = this.zzape.zzaox;
                    connectionTracker.unbindService(context, zziwVar);
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            } else {
                this.zzape.zzgd().zzc(new com.google.android.gms.internal.measurement.zzix(this, zzeyVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zzape.zzge().zzis().log("Service disconnected");
        this.zzape.zzgd().zzc(new com.google.android.gms.internal.measurement.zziy(this, componentName));
    }

    public final void zzc(android.content.Intent intent) {
        com.google.android.gms.internal.measurement.zziw zziwVar;
        this.zzape.zzab();
        android.content.Context context = this.zzape.getContext();
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzapk) {
                this.zzape.zzge().zzit().log("Connection attempt already in progress");
                return;
            }
            this.zzape.zzge().zzit().log("Using local app measurement service");
            this.zzapk = true;
            zziwVar = this.zzape.zzaox;
            connectionTracker.bindService(context, intent, zziwVar, 129);
        }
    }

    public final void zzkh() {
        this.zzape.zzab();
        android.content.Context context = this.zzape.getContext();
        synchronized (this) {
            if (this.zzapk) {
                this.zzape.zzge().zzit().log("Connection attempt already in progress");
                return;
            }
            if (this.zzapl != null) {
                this.zzape.zzge().zzit().log("Already awaiting connection attempt");
                return;
            }
            this.zzapl = new com.google.android.gms.internal.measurement.zzff(context, android.os.Looper.getMainLooper(), this, this);
            this.zzape.zzge().zzit().log("Connecting to remote service");
            this.zzapk = true;
            this.zzapl.checkAvailabilityAndConnect();
        }
    }
}

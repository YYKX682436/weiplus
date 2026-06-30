package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzii extends com.google.android.gms.internal.measurement.zzhh {
    private final com.google.android.gms.internal.measurement.zziw zzaox;
    private com.google.android.gms.internal.measurement.zzey zzaoy;
    private volatile java.lang.Boolean zzaoz;
    private final com.google.android.gms.internal.measurement.zzem zzapa;
    private final com.google.android.gms.internal.measurement.zzjm zzapb;
    private final java.util.List<java.lang.Runnable> zzapc;
    private final com.google.android.gms.internal.measurement.zzem zzapd;

    public zzii(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzapc = new java.util.ArrayList();
        this.zzapb = new com.google.android.gms.internal.measurement.zzjm(zzglVar.zzbt());
        this.zzaox = new com.google.android.gms.internal.measurement.zziw(this);
        this.zzapa = new com.google.android.gms.internal.measurement.zzij(this, zzglVar);
        this.zzapd = new com.google.android.gms.internal.measurement.zzio(this, zzglVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        zzab();
        if (this.zzaoy != null) {
            this.zzaoy = null;
            zzge().zzit().zzg("Disconnected from device MeasurementService", componentName);
            zzab();
            zzdf();
        }
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzey zza(com.google.android.gms.internal.measurement.zzii zziiVar, com.google.android.gms.internal.measurement.zzey zzeyVar) {
        zziiVar.zzaoy = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcu() {
        zzab();
        this.zzapb.start();
        this.zzapa.zzh(com.google.android.gms.internal.measurement.zzew.zzaho.get().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcv() {
        zzab();
        if (isConnected()) {
            zzge().zzit().log("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    private final void zzf(java.lang.Runnable runnable) {
        zzab();
        if (isConnected()) {
            runnable.run();
        } else {
            if (this.zzapc.size() >= 1000) {
                zzge().zzim().log("Discarding data. Max runnable queue size reached");
                return;
            }
            this.zzapc.add(runnable);
            this.zzapd.zzh(60000L);
            zzdf();
        }
    }

    private final com.google.android.gms.internal.measurement.zzdz zzk(boolean z17) {
        return zzfv().zzbi(z17 ? zzge().zziv() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzkg() {
        zzab();
        zzge().zzit().zzg("Processing queued up service tasks", java.lang.Integer.valueOf(this.zzapc.size()));
        java.util.Iterator<java.lang.Runnable> it = this.zzapc.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (java.lang.Exception e17) {
                zzge().zzim().zzg("Task exception while flushing queue", e17);
            }
        }
        this.zzapc.clear();
        this.zzapd.cancel();
    }

    public final void disconnect() {
        zzab();
        zzch();
        try {
            com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(getContext(), this.zzaox);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
        }
        this.zzaoy = null;
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final boolean isConnected() {
        zzab();
        zzch();
        return this.zzaoy != null;
    }

    public final void resetAnalyticsData() {
        zzab();
        zzch();
        com.google.android.gms.internal.measurement.zzdz zzk = zzk(false);
        zzfz().resetAnalyticsData();
        zzf(new com.google.android.gms.internal.measurement.zzik(this, zzk));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzeu zzeuVar, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeuVar);
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zziq(this, true, zzfz().zza(zzeuVar), zzeuVar, zzk(true), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzdf() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzii.zzdf():void");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfr() {
        super.zzfr();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzfs() {
        super.zzfs();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzft() {
        return super.zzft();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzhk zzfu() {
        return super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfb zzfv() {
        return super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzeo zzfw() {
        return super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzii zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzif zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfc zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfe zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzka zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzjh zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzgd() {
        return super.zzgd();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfg zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzfr zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzef zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhh
    public final boolean zzhf() {
        return false;
    }

    public final void zzkb() {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzim(this, zzk(true)));
    }

    public final void zzke() {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzip(this, zzk(true)));
    }

    public final java.lang.Boolean zzkf() {
        return this.zzaoz;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzie zzieVar) {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzin(this, zzieVar));
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzed zzedVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzedVar);
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzir(this, true, zzfz().zzc(zzedVar), new com.google.android.gms.internal.measurement.zzed(zzedVar), zzk(true), zzedVar));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzey zzeyVar) {
        zzab();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeyVar);
        this.zzaoy = zzeyVar;
        zzcu();
        zzkg();
    }

    public final void zza(com.google.android.gms.internal.measurement.zzey zzeyVar, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable, com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        int i17;
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str;
        zzab();
        zzch();
        int i18 = 100;
        int i19 = 0;
        while (i19 < 1001 && i18 == 100) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zzp = zzfz().zzp(100);
            if (zzp != null) {
                arrayList.addAll(zzp);
                i17 = zzp.size();
            } else {
                i17 = 0;
            }
            if (abstractSafeParcelable != null && i17 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i27 = 0;
            while (i27 < size) {
                java.lang.Object obj = arrayList.get(i27);
                i27++;
                com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable2 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof com.google.android.gms.internal.measurement.zzeu) {
                    try {
                        zzeyVar.zza((com.google.android.gms.internal.measurement.zzeu) abstractSafeParcelable2, zzdzVar);
                    } catch (android.os.RemoteException e17) {
                        e = e17;
                        zzim = zzge().zzim();
                        str = "Failed to send event to the service";
                        zzim.zzg(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof com.google.android.gms.internal.measurement.zzjx) {
                    try {
                        zzeyVar.zza((com.google.android.gms.internal.measurement.zzjx) abstractSafeParcelable2, zzdzVar);
                    } catch (android.os.RemoteException e18) {
                        e = e18;
                        zzim = zzge().zzim();
                        str = "Failed to send attribute to the service";
                        zzim.zzg(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof com.google.android.gms.internal.measurement.zzed) {
                    try {
                        zzeyVar.zza((com.google.android.gms.internal.measurement.zzed) abstractSafeParcelable2, zzdzVar);
                    } catch (android.os.RemoteException e19) {
                        e = e19;
                        zzim = zzge().zzim();
                        str = "Failed to send conditional property to the service";
                        zzim.zzg(str, e);
                    }
                } else {
                    zzge().zzim().log("Discarding data. Unrecognized parcel type.");
                }
            }
            i19++;
            i18 = i17;
        }
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzjx zzjxVar) {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zziu(this, zzfz().zza(zzjxVar), zzjxVar, zzk(true)));
    }

    public final void zza(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference) {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzil(this, atomicReference, zzk(false)));
    }

    public final void zza(java.util.concurrent.atomic.AtomicReference<java.util.List<com.google.android.gms.internal.measurement.zzed>> atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzis(this, atomicReference, str, str2, str3, zzk(false)));
    }

    public final void zza(java.util.concurrent.atomic.AtomicReference<java.util.List<com.google.android.gms.internal.measurement.zzjx>> atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zzit(this, atomicReference, str, str2, str3, z17, zzk(false)));
    }

    public final void zza(java.util.concurrent.atomic.AtomicReference<java.util.List<com.google.android.gms.internal.measurement.zzjx>> atomicReference, boolean z17) {
        zzab();
        zzch();
        zzf(new com.google.android.gms.internal.measurement.zziv(this, atomicReference, zzk(false), z17));
    }
}

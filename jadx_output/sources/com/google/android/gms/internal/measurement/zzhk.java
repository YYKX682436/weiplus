package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzhk extends com.google.android.gms.internal.measurement.zzhh {
    protected com.google.android.gms.internal.measurement.zzid zzanp;
    private com.google.android.gms.measurement.AppMeasurement.EventInterceptor zzanq;
    private final java.util.Set<com.google.android.gms.measurement.AppMeasurement.OnEventListener> zzanr;
    private boolean zzans;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> zzant;
    protected boolean zzanu;

    public zzhk(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        super(zzglVar);
        this.zzanr = new java.util.concurrent.CopyOnWriteArraySet();
        this.zzanu = true;
        this.zzant = new java.util.concurrent.atomic.AtomicReference<>();
    }

    private final java.util.Map<java.lang.String, java.lang.Object> zzb(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.google.android.gms.internal.measurement.zzfi zzip;
        java.lang.String str4;
        if (zzgd().zzjk()) {
            zzip = zzge().zzim();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            zzgd();
            if (com.google.android.gms.internal.measurement.zzgg.isMainThread()) {
                zzip = zzge().zzim();
                str4 = "Cannot get user properties from main thread";
            } else {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                synchronized (atomicReference) {
                    this.zzacw.zzgd().zzc(new com.google.android.gms.internal.measurement.zzhu(this, atomicReference, str, str2, str3, z17));
                    try {
                        atomicReference.wait(5000L);
                    } catch (java.lang.InterruptedException e17) {
                        zzge().zzip().zzg("Interrupted waiting for get user properties", e17);
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzjx> list = (java.util.List) atomicReference.get();
                if (list != null) {
                    x.b bVar = new x.b(list.size());
                    for (com.google.android.gms.internal.measurement.zzjx zzjxVar : list) {
                        bVar.put(zzjxVar.name, zzjxVar.getValue());
                    }
                    return bVar;
                }
                zzip = zzge().zzip();
                str4 = "Timed out waiting for get user properties";
            }
        }
        zzip.log(str4);
        return java.util.Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(conditionalUserProperty.mName);
        if (!this.zzacw.isEnabled()) {
            zzge().zzis().log("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }
        try {
            zzfx().zzd(new com.google.android.gms.internal.measurement.zzed(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, new com.google.android.gms.internal.measurement.zzjx(conditionalUserProperty.mName, 0L, null, null), conditionalUserProperty.mCreationTimestamp, conditionalUserProperty.mActive, conditionalUserProperty.mTriggerEventName, null, conditionalUserProperty.mTriggerTimeout, null, conditionalUserProperty.mTimeToLive, zzgb().zza(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, conditionalUserProperty.mCreationTimestamp, true, false)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    private final java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> zzf(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.internal.measurement.zzfi zzim;
        java.lang.String str4;
        if (zzgd().zzjk()) {
            zzim = zzge().zzim();
            str4 = "Cannot get conditional user properties from analytics worker thread";
        } else {
            zzgd();
            if (!com.google.android.gms.internal.measurement.zzgg.isMainThread()) {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                synchronized (atomicReference) {
                    this.zzacw.zzgd().zzc(new com.google.android.gms.internal.measurement.zzht(this, atomicReference, str, str2, str3));
                    try {
                        atomicReference.wait(5000L);
                    } catch (java.lang.InterruptedException e17) {
                        zzge().zzip().zze("Interrupted waiting for get conditional user properties", str, e17);
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzed> list = (java.util.List) atomicReference.get();
                if (list == null) {
                    zzge().zzip().zzg("Timed out waiting for get conditional user properties", str);
                    return java.util.Collections.emptyList();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                for (com.google.android.gms.internal.measurement.zzed zzedVar : list) {
                    com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty = new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty();
                    conditionalUserProperty.mAppId = str;
                    conditionalUserProperty.mOrigin = str2;
                    conditionalUserProperty.mCreationTimestamp = zzedVar.creationTimestamp;
                    com.google.android.gms.internal.measurement.zzjx zzjxVar = zzedVar.zzaep;
                    conditionalUserProperty.mName = zzjxVar.name;
                    conditionalUserProperty.mValue = zzjxVar.getValue();
                    conditionalUserProperty.mActive = zzedVar.active;
                    conditionalUserProperty.mTriggerEventName = zzedVar.triggerEventName;
                    com.google.android.gms.internal.measurement.zzeu zzeuVar = zzedVar.zzaeq;
                    if (zzeuVar != null) {
                        conditionalUserProperty.mTimedOutEventName = zzeuVar.name;
                        com.google.android.gms.internal.measurement.zzer zzerVar = zzeuVar.zzafq;
                        if (zzerVar != null) {
                            conditionalUserProperty.mTimedOutEventParams = zzerVar.zzif();
                        }
                    }
                    conditionalUserProperty.mTriggerTimeout = zzedVar.triggerTimeout;
                    com.google.android.gms.internal.measurement.zzeu zzeuVar2 = zzedVar.zzaer;
                    if (zzeuVar2 != null) {
                        conditionalUserProperty.mTriggeredEventName = zzeuVar2.name;
                        com.google.android.gms.internal.measurement.zzer zzerVar2 = zzeuVar2.zzafq;
                        if (zzerVar2 != null) {
                            conditionalUserProperty.mTriggeredEventParams = zzerVar2.zzif();
                        }
                    }
                    conditionalUserProperty.mTriggeredTimestamp = zzedVar.zzaep.zzaqz;
                    conditionalUserProperty.mTimeToLive = zzedVar.timeToLive;
                    com.google.android.gms.internal.measurement.zzeu zzeuVar3 = zzedVar.zzaes;
                    if (zzeuVar3 != null) {
                        conditionalUserProperty.mExpiredEventName = zzeuVar3.name;
                        com.google.android.gms.internal.measurement.zzer zzerVar3 = zzeuVar3.zzafq;
                        if (zzerVar3 != null) {
                            conditionalUserProperty.mExpiredEventParams = zzerVar3.zzif();
                        }
                    }
                    arrayList.add(conditionalUserProperty);
                }
                return arrayList;
            }
            zzim = zzge().zzim();
            str4 = "Cannot get conditional user properties from main thread";
        }
        zzim.log(str4);
        return java.util.Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(boolean z17) {
        zzab();
        zzch();
        zzge().zzis().zzg("Setting app measurement enabled (FE)", java.lang.Boolean.valueOf(z17));
        zzgf().setMeasurementEnabled(z17);
        if (!zzgg().zzaz(zzfv().zzah())) {
            zzfx().zzke();
        } else if (!this.zzacw.isEnabled() || !this.zzanu) {
            zzfx().zzke();
        } else {
            zzge().zzis().log("Recording app launch after enabling measurement for the first time (FE)");
            zzkb();
        }
    }

    public final void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza((java.lang.String) null, str, str2, bundle);
    }

    public final void clearConditionalUserPropertyAs(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzfr();
        zza(str, str2, str3, bundle);
    }

    public final com.google.android.gms.tasks.Task<java.lang.String> getAppInstanceId() {
        try {
            java.lang.String zzja = zzgf().zzja();
            return zzja != null ? com.google.android.gms.tasks.Tasks.forResult(zzja) : com.google.android.gms.tasks.Tasks.call(zzgd().zzjl(), new com.google.android.gms.internal.measurement.zzho(this));
        } catch (java.lang.Exception e17) {
            zzge().zzip().log("Failed to schedule task for getAppInstanceId");
            return com.google.android.gms.tasks.Tasks.forException(e17);
        }
    }

    public final java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        return zzf(null, str, str2);
    }

    public final java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserPropertiesAs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzfr();
        return zzf(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z17) {
        return zzb(null, str, str2, z17);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getUserPropertiesAs(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzfr();
        return zzb(str, str2, str3, z17);
    }

    public final void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zza(str, str2, bundle, true, this.zzanq == null || com.google.android.gms.internal.measurement.zzka.zzci(str2), false, null);
    }

    public final void registerOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onEventListener);
        if (this.zzanr.add(onEventListener)) {
            return;
        }
        zzge().zzip().log("OnEventListener already registered");
    }

    public final void resetAnalyticsData() {
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzhq(this, zzbt().currentTimeMillis()));
    }

    public final void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty(conditionalUserProperty);
        if (!android.text.TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            zzge().zzip().log("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        zza(conditionalUserProperty2);
    }

    public final void setConditionalUserPropertyAs(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(conditionalUserProperty.mAppId);
        zzfr();
        zza(new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty(conditionalUserProperty));
    }

    public final void setEventInterceptor(com.google.android.gms.measurement.AppMeasurement.EventInterceptor eventInterceptor) {
        com.google.android.gms.measurement.AppMeasurement.EventInterceptor eventInterceptor2;
        zzab();
        zzch();
        if (eventInterceptor != null && eventInterceptor != (eventInterceptor2 = this.zzanq)) {
            com.google.android.gms.common.internal.Preconditions.checkState(eventInterceptor2 == null, "EventInterceptor already set.");
        }
        this.zzanq = eventInterceptor;
    }

    public final void setMeasurementEnabled(boolean z17) {
        zzch();
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzhz(this, z17));
    }

    public final void setMinimumSessionDuration(long j17) {
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzia(this, j17));
    }

    public final void setSessionTimeoutDuration(long j17) {
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzib(this, j17));
    }

    public final void setUserProperty(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzbt().currentTimeMillis();
        int zzcf = zzgb().zzcf(str2);
        if (zzcf != 0) {
            zzgb();
            this.zzacw.zzgb().zza(zzcf, "_ev", com.google.android.gms.internal.measurement.zzka.zza(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (obj == null) {
            zza(str, str2, currentTimeMillis, (java.lang.Object) null);
            return;
        }
        int zzi = zzgb().zzi(str2, obj);
        if (zzi != 0) {
            zzgb();
            this.zzacw.zzgb().zza(zzi, "_ev", com.google.android.gms.internal.measurement.zzka.zza(str2, 24, true), ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? java.lang.String.valueOf(obj).length() : 0);
        } else {
            java.lang.Object zzj = zzgb().zzj(str2, obj);
            if (zzj != null) {
                zza(str, str2, currentTimeMillis, zzj);
            }
        }
    }

    public final void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onEventListener);
        if (this.zzanr.remove(onEventListener)) {
            return;
        }
        zzge().zzip().log("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    public final java.lang.String zzae(long j17) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        synchronized (atomicReference) {
            zzgd().zzc(new com.google.android.gms.internal.measurement.zzhp(this, atomicReference));
            try {
                atomicReference.wait(j17);
            } catch (java.lang.InterruptedException unused) {
                zzge().zzip().log("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (java.lang.String) atomicReference.get();
    }

    public final void zzbr(java.lang.String str) {
        this.zzant.set(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg, com.google.android.gms.internal.measurement.zzec
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzbt() {
        return super.zzbt();
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

    public final java.lang.String zzhm() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.String) zzgd().zza(atomicReference, 15000L, "String test flag value", new com.google.android.gms.internal.measurement.zzhv(this, atomicReference));
    }

    public final java.util.List<com.google.android.gms.internal.measurement.zzjx> zzj(boolean z17) {
        com.google.android.gms.internal.measurement.zzfi zzip;
        java.lang.String str;
        zzch();
        zzge().zzis().log("Fetching user attributes (FE)");
        if (zzgd().zzjk()) {
            zzip = zzge().zzim();
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            zzgd();
            if (com.google.android.gms.internal.measurement.zzgg.isMainThread()) {
                zzip = zzge().zzim();
                str = "Cannot get all user properties from main thread";
            } else {
                java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                synchronized (atomicReference) {
                    this.zzacw.zzgd().zzc(new com.google.android.gms.internal.measurement.zzhn(this, atomicReference, z17));
                    try {
                        atomicReference.wait(5000L);
                    } catch (java.lang.InterruptedException e17) {
                        zzge().zzip().zzg("Interrupted waiting for get user properties", e17);
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzjx> list = (java.util.List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                zzip = zzge().zzip();
                str = "Timed out waiting for get user properties";
            }
        }
        zzip.log(str);
        return java.util.Collections.emptyList();
    }

    public final java.lang.String zzja() {
        return this.zzant.get();
    }

    public final java.lang.Boolean zzjx() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Boolean) zzgd().zza(atomicReference, 15000L, "boolean test flag value", new com.google.android.gms.internal.measurement.zzhl(this, atomicReference));
    }

    public final java.lang.Long zzjy() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Long) zzgd().zza(atomicReference, 15000L, "long test flag value", new com.google.android.gms.internal.measurement.zzhw(this, atomicReference));
    }

    public final java.lang.Integer zzjz() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Integer) zzgd().zza(atomicReference, 15000L, "int test flag value", new com.google.android.gms.internal.measurement.zzhx(this, atomicReference));
    }

    public final java.lang.Double zzka() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Double) zzgd().zza(atomicReference, 15000L, "double test flag value", new com.google.android.gms.internal.measurement.zzhy(this, atomicReference));
    }

    public final void zzkb() {
        zzab();
        zzch();
        if (this.zzacw.zzjv()) {
            zzfx().zzkb();
            this.zzanu = false;
            java.lang.String zzjd = zzgf().zzjd();
            if (android.text.TextUtils.isEmpty(zzjd)) {
                return;
            }
            zzfw().zzch();
            if (zzjd.equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_po", zzjd);
            logEvent("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        zzab();
        zzch();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(conditionalUserProperty.mName);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(conditionalUserProperty.mOrigin);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty.mValue);
        if (!this.zzacw.isEnabled()) {
            zzge().zzis().log("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }
        com.google.android.gms.internal.measurement.zzjx zzjxVar = new com.google.android.gms.internal.measurement.zzjx(conditionalUserProperty.mName, conditionalUserProperty.mTriggeredTimestamp, conditionalUserProperty.mValue, conditionalUserProperty.mOrigin);
        try {
            com.google.android.gms.internal.measurement.zzeu zza = zzgb().zza(conditionalUserProperty.mTriggeredEventName, conditionalUserProperty.mTriggeredEventParams, conditionalUserProperty.mOrigin, 0L, true, false);
            zzfx().zzd(new com.google.android.gms.internal.measurement.zzed(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, zzjxVar, conditionalUserProperty.mCreationTimestamp, false, conditionalUserProperty.mTriggerEventName, zzgb().zza(conditionalUserProperty.mTimedOutEventName, conditionalUserProperty.mTimedOutEventParams, conditionalUserProperty.mOrigin, 0L, true, false), conditionalUserProperty.mTriggerTimeout, zza, conditionalUserProperty.mTimeToLive, zzgb().zza(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, 0L, true, false)));
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        java.lang.String[] strArr;
        android.os.Bundle bundle2;
        int i17;
        long j18;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzab();
        zzch();
        if (!this.zzacw.isEnabled()) {
            zzge().zzis().log("Event not sent since app measurement is disabled");
            return;
        }
        if (!this.zzans) {
            this.zzans = true;
            try {
                try {
                    java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", android.content.Context.class).invoke(null, getContext());
                } catch (java.lang.Exception e17) {
                    zzge().zzip().zzg("Failed to invoke Tag Manager's initialize() method", e17);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                zzge().zzir().log("Tag Manager is not found and thus will not be used");
            }
        }
        if (z19 && !"_iap".equals(str2)) {
            com.google.android.gms.internal.measurement.zzka zzgb = this.zzacw.zzgb();
            int i18 = 2;
            if (zzgb.zzq("event", str2)) {
                if (!zzgb.zza("event", com.google.android.gms.measurement.AppMeasurement.Event.zzacx, str2)) {
                    i18 = 13;
                } else if (zzgb.zza("event", 40, str2)) {
                    i18 = 0;
                }
            }
            if (i18 != 0) {
                zzge().zzio().zzg("Invalid public event name. Event will not be logged (FE)", zzga().zzbj(str2));
                this.zzacw.zzgb();
                this.zzacw.zzgb().zza(i18, "_ev", com.google.android.gms.internal.measurement.zzka.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzie zzkc = zzfy().zzkc();
        if (zzkc != null && !bundle.containsKey("_sc")) {
            zzkc.zzaok = true;
        }
        com.google.android.gms.internal.measurement.zzif.zza(zzkc, bundle, z17 && z19);
        boolean equals = "am".equals(str);
        boolean zzci = com.google.android.gms.internal.measurement.zzka.zzci(str2);
        if (!z17 || this.zzanq == null || zzci || equals) {
            if (this.zzacw.zzjv()) {
                int zzcd = zzgb().zzcd(str2);
                if (zzcd != 0) {
                    zzge().zzio().zzg("Invalid event name. Event will not be logged (FE)", zzga().zzbj(str2));
                    zzgb();
                    this.zzacw.zzgb().zza(str3, zzcd, "_ev", com.google.android.gms.internal.measurement.zzka.zza(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                java.util.List<java.lang.String> listOf = com.google.android.gms.common.util.CollectionUtils.listOf((java.lang.Object[]) new java.lang.String[]{"_o", "_sn", "_sc", "_si"});
                android.os.Bundle zza = zzgb().zza(str2, bundle, listOf, z19, true);
                com.google.android.gms.internal.measurement.zzie zzieVar = (zza != null && zza.containsKey("_sc") && zza.containsKey("_si")) ? new com.google.android.gms.internal.measurement.zzie(zza.getString("_sn"), zza.getString("_sc"), java.lang.Long.valueOf(zza.getLong("_si")).longValue()) : null;
                if (zzieVar != null) {
                    zzkc = zzieVar;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(zza);
                long nextLong = zzgb().zzlc().nextLong();
                java.lang.String[] strArr2 = (java.lang.String[]) zza.keySet().toArray(new java.lang.String[bundle.size()]);
                java.util.Arrays.sort(strArr2);
                int length = strArr2.length;
                int i19 = 0;
                int i27 = 0;
                while (i27 < length) {
                    java.lang.String str4 = strArr2[i27];
                    java.lang.Object obj = zza.get(str4);
                    zzgb();
                    android.os.Bundle[] zze = com.google.android.gms.internal.measurement.zzka.zze(obj);
                    if (zze != null) {
                        java.lang.String str5 = "_eid";
                        zza.putInt(str4, zze.length);
                        int i28 = 0;
                        while (i28 < zze.length) {
                            android.os.Bundle bundle3 = zze[i28];
                            int i29 = i28;
                            com.google.android.gms.internal.measurement.zzif.zza(zzkc, bundle3, true);
                            java.lang.String str6 = str5;
                            long j19 = nextLong;
                            android.os.Bundle zza2 = zzgb().zza("_ep", bundle3, listOf, z19, false);
                            zza2.putString("_en", str2);
                            zza2.putLong(str6, j19);
                            zza2.putString("_gn", str4);
                            zza2.putInt("_ll", zze.length);
                            zza2.putInt("_i", i29);
                            arrayList.add(zza2);
                            zza = zza;
                            strArr2 = strArr2;
                            str5 = str6;
                            nextLong = j19;
                            i19 = i19;
                            i28 = i29 + 1;
                        }
                        j18 = nextLong;
                        strArr = strArr2;
                        bundle2 = zza;
                        i17 = zze.length + i19;
                    } else {
                        strArr = strArr2;
                        bundle2 = zza;
                        i17 = i19;
                        j18 = nextLong;
                    }
                    i27++;
                    zza = bundle2;
                    strArr2 = strArr;
                    i19 = i17;
                    nextLong = j18;
                }
                android.os.Bundle bundle4 = zza;
                long j27 = nextLong;
                int i37 = i19;
                if (i37 != 0) {
                    bundle4.putLong("_eid", j27);
                    bundle4.putInt("_epc", i37);
                }
                int i38 = 0;
                while (i38 < arrayList.size()) {
                    android.os.Bundle bundle5 = (android.os.Bundle) arrayList.get(i38);
                    java.lang.String str7 = i38 != 0 ? "_ep" : str2;
                    bundle5.putString("_o", str);
                    if (z18) {
                        bundle5 = zzgb().zzd(bundle5);
                    }
                    android.os.Bundle bundle6 = bundle5;
                    zzge().zzis().zze("Logging event (FE)", zzga().zzbj(str2), zzga().zzb(bundle6));
                    zzfx().zzb(new com.google.android.gms.internal.measurement.zzeu(str7, new com.google.android.gms.internal.measurement.zzer(bundle6), str, j17), str3);
                    if (!equals) {
                        java.util.Iterator<com.google.android.gms.measurement.AppMeasurement.OnEventListener> it = this.zzanr.iterator();
                        while (it.hasNext()) {
                            it.next().onEvent(str, str2, new android.os.Bundle(bundle6), j17);
                        }
                    }
                    i38++;
                }
                if (zzfy().zzkc() == null || !com.google.android.gms.measurement.AppMeasurement.Event.APP_EXCEPTION.equals(str2)) {
                    return;
                }
                zzgc().zzl(true);
                return;
            }
            return;
        }
        zzge().zzis().zze("Passing event to registered event handler (FE)", zzga().zzbj(str2), zzga().zzb(bundle));
        this.zzanq.interceptEvent(str, str2, bundle, j17);
    }

    private final void zza(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        long currentTimeMillis = zzbt().currentTimeMillis();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(conditionalUserProperty.mName);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(conditionalUserProperty.mOrigin);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = currentTimeMillis;
        java.lang.String str = conditionalUserProperty.mName;
        java.lang.Object obj = conditionalUserProperty.mValue;
        if (zzgb().zzcf(str) != 0) {
            zzge().zzim().zzg("Invalid conditional user property name", zzga().zzbl(str));
            return;
        }
        if (zzgb().zzi(str, obj) != 0) {
            zzge().zzim().zze("Invalid conditional user property value", zzga().zzbl(str), obj);
            return;
        }
        java.lang.Object zzj = zzgb().zzj(str, obj);
        if (zzj == null) {
            zzge().zzim().zze("Unable to normalize conditional user property value", zzga().zzbl(str), obj);
            return;
        }
        conditionalUserProperty.mValue = zzj;
        long j17 = conditionalUserProperty.mTriggerTimeout;
        if (!android.text.TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) && (j17 > 15552000000L || j17 < 1)) {
            zzge().zzim().zze("Invalid conditional user property timeout", zzga().zzbl(str), java.lang.Long.valueOf(j17));
            return;
        }
        long j18 = conditionalUserProperty.mTimeToLive;
        if (j18 > 15552000000L || j18 < 1) {
            zzge().zzim().zze("Invalid conditional user property time to live", zzga().zzbl(str), java.lang.Long.valueOf(j18));
        } else {
            zzgd().zzc(new com.google.android.gms.internal.measurement.zzhr(this, conditionalUserProperty));
        }
    }

    private final void zza(java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        android.os.Bundle bundle2;
        if (bundle == null) {
            bundle2 = new android.os.Bundle();
        } else {
            android.os.Bundle bundle3 = new android.os.Bundle(bundle);
            for (java.lang.String str4 : bundle3.keySet()) {
                java.lang.Object obj = bundle3.get(str4);
                if (obj instanceof android.os.Bundle) {
                    bundle3.putBundle(str4, new android.os.Bundle((android.os.Bundle) obj));
                } else {
                    int i17 = 0;
                    if (obj instanceof android.os.Parcelable[]) {
                        android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                        while (i17 < parcelableArr.length) {
                            if (parcelableArr[i17] instanceof android.os.Bundle) {
                                parcelableArr[i17] = new android.os.Bundle((android.os.Bundle) parcelableArr[i17]);
                            }
                            i17++;
                        }
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                        while (i17 < arrayList.size()) {
                            java.lang.Object obj2 = arrayList.get(i17);
                            if (obj2 instanceof android.os.Bundle) {
                                arrayList.set(i17, new android.os.Bundle((android.os.Bundle) obj2));
                            }
                            i17++;
                        }
                    }
                }
            }
            bundle2 = bundle3;
        }
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzic(this, str, str2, j17, bundle2, z17, z18, z19, str3));
    }

    private final void zza(java.lang.String str, java.lang.String str2, long j17, java.lang.Object obj) {
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzhm(this, str, str2, obj, j17));
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzab();
        zzb(str, str2, zzbt().currentTimeMillis(), bundle, true, this.zzanq == null || com.google.android.gms.internal.measurement.zzka.zzci(str2), false, null);
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17) {
        zza(str, str2, j17, bundle, false, true, true, null);
    }

    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        zza(str, str2, bundle, true, this.zzanq == null || com.google.android.gms.internal.measurement.zzka.zzci(str2), true, null);
    }

    private final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17, boolean z18, boolean z19, java.lang.String str3) {
        zza(str, str2, zzbt().currentTimeMillis(), bundle, true, z18, z19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(java.lang.String str, java.lang.String str2, java.lang.Object obj, long j17) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzab();
        zzch();
        if (!this.zzacw.isEnabled()) {
            zzge().zzis().log("User property not set since app measurement is disabled");
        } else if (this.zzacw.zzjv()) {
            zzge().zzis().zze("Setting user property (FE)", zzga().zzbj(str2), obj);
            zzfx().zzb(new com.google.android.gms.internal.measurement.zzjx(str2, j17, obj, str));
        }
    }

    private final void zza(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        long currentTimeMillis = zzbt().currentTimeMillis();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty = new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = currentTimeMillis;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        zzgd().zzc(new com.google.android.gms.internal.measurement.zzhs(this, conditionalUserProperty));
    }
}

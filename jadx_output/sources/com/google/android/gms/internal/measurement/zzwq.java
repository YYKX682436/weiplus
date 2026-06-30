package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class zzwq extends android.database.ContentObserver {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzwp zzbnb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzwq(com.google.android.gms.internal.measurement.zzwp zzwpVar, android.os.Handler handler) {
        super(null);
        this.zzbnb = zzwpVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z17) {
        this.zzbnb.zzru();
        this.zzbnb.zzrw();
    }
}

package com.google.android.gms.common.internal.service;

/* loaded from: classes13.dex */
public final class zai extends com.google.android.gms.internal.base.zaa {
    public zai(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void zae(com.google.android.gms.common.internal.TelemetryData telemetryData) {
        android.os.Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, telemetryData);
        zad(1, zaa);
    }
}

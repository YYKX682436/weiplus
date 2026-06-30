package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public final class zzff extends com.google.android.gms.common.internal.BaseGmsClient<com.google.android.gms.internal.measurement.zzey> {
    public zzff(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(context, looper, 93, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzey createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof com.google.android.gms.internal.measurement.zzey ? (com.google.android.gms.internal.measurement.zzey) queryLocalInterface : new com.google.android.gms.internal.measurement.zzfa(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}

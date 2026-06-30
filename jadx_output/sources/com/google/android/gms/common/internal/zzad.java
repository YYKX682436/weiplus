package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
final class zzad implements com.google.android.gms.common.internal.IGmsServiceBroker {
    private final android.os.IBinder zza;

    public zzad(android.os.IBinder iBinder) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void getService(com.google.android.gms.common.internal.IGmsCallbacks iGmsCallbacks, com.google.android.gms.common.internal.GetServiceRequest getServiceRequest) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                com.google.android.gms.common.internal.zzn.zza(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.zza.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

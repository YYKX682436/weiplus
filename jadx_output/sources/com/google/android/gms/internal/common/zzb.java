package com.google.android.gms.internal.common;

/* loaded from: classes13.dex */
public class zzb extends android.os.Binder implements android.os.IInterface {
    public zzb(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i17, parcel, parcel2, i18)) {
            return true;
        }
        return zza(i17, parcel, parcel2, i18);
    }

    public boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        return false;
    }
}

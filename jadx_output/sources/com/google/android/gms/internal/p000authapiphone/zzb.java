package com.google.android.gms.internal.p000authapiphone;

/* loaded from: classes13.dex */
public class zzb extends android.os.Binder implements android.os.IInterface {
    private static com.google.android.gms.internal.p000authapiphone.zzd zzc;

    public zzb(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        boolean z17;
        if (i17 > 16777215) {
            z17 = super.onTransact(i17, parcel, parcel2, i18);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z17 = false;
        }
        if (z17) {
            return true;
        }
        return dispatchTransaction(i17, parcel, parcel2, i18);
    }
}

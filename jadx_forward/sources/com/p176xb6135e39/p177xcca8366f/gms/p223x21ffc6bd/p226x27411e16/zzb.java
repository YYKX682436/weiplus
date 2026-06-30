package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16;

/* loaded from: classes13.dex */
public class zzb extends android.os.Binder implements android.os.IInterface {
    private static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16.zzd zzc;

    public zzb(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    /* renamed from: dispatchTransaction */
    public boolean mo18786x87078604(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
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
        return mo18786x87078604(i17, parcel, parcel2, i18);
    }
}

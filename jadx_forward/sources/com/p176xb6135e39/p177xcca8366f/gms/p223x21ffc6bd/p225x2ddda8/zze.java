package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* loaded from: classes13.dex */
public class zze extends android.os.Binder implements android.os.IInterface {
    private static com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzg zzf;

    public zze(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    /* renamed from: dispatchTransaction */
    public boolean mo17328x87078604(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
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
        return mo17328x87078604(i17, parcel, parcel2, i18);
    }
}

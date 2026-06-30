package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public abstract class zzej extends com.google.android.gms.internal.wearable.zzb implements com.google.android.gms.wearable.internal.zzei {
    public zzej() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 2) {
            return false;
        }
        zza(parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}

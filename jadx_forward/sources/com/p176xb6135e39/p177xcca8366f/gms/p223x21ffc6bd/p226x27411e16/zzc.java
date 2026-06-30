package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16;

/* loaded from: classes13.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p226x27411e16.zzc.class.getClassLoader();

    private zzc() {
    }

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zza(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}

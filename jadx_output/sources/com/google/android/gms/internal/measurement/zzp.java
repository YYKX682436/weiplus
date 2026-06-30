package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public class zzp {
    private static final java.lang.ClassLoader zzql = com.google.android.gms.internal.measurement.zzp.class.getClassLoader();

    private zzp() {
    }

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static java.util.HashMap zzb(android.os.Parcel parcel) {
        return parcel.readHashMap(zzql);
    }

    public static void zza(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void zza(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zza(android.os.Parcel parcel, boolean z17) {
        parcel.writeInt(z17 ? 1 : 0);
    }

    public static boolean zza(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
